/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.lmax.disruptor.BlockingWaitStrategy
 *  com.lmax.disruptor.EventFactory
 *  com.lmax.disruptor.EventHandler
 *  com.lmax.disruptor.EventTranslator
 *  com.lmax.disruptor.ExceptionHandler
 *  com.lmax.disruptor.RingBuffer
 *  com.lmax.disruptor.SleepingWaitStrategy
 *  com.lmax.disruptor.WaitStrategy
 *  com.lmax.disruptor.YieldingWaitStrategy
 *  com.lmax.disruptor.dsl.Disruptor
 *  com.lmax.disruptor.dsl.ProducerType
 *  com.lmax.disruptor.util.Util
 */
package org.apache.logging.log4j.core.b;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.EventTranslator;
import com.lmax.disruptor.ExceptionHandler;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.SleepingWaitStrategy;
import com.lmax.disruptor.WaitStrategy;
import com.lmax.disruptor.YieldingWaitStrategy;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;
import com.lmax.disruptor.util.Util;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.apache.logging.log4j.core.b.g;
import org.apache.logging.log4j.core.b.h;
import org.apache.logging.log4j.core.b.j;
import org.apache.logging.log4j.core.b.m;
import org.apache.logging.log4j.d;

class f {
    private static final int a = 20;
    private static final int b = 500;
    private static final int c = 128;
    private static final int d = 262144;
    private static final d e = org.apache.logging.log4j.d.d.k();
    private static ThreadFactory f = new m("AsyncLoggerConfig-");
    private static volatile Disruptor g;
    private static ExecutorService h;
    private static volatile int i;
    private static final EventFactory j;
    private final EventTranslator k = new h(this);
    private final ThreadLocal l = new ThreadLocal();
    private final org.apache.logging.log4j.core.b.d m;

    public f(org.apache.logging.log4j.core.b.d d2) {
        this.m = d2;
        org.apache.logging.log4j.core.b.f.a();
    }

    private static synchronized void c() {
        if (g != null) {
            e.e("AsyncLoggerConfigHelper not starting new disruptor, using existing object. Ref count is {}.", i);
            return;
        }
        e.e("AsyncLoggerConfigHelper creating new disruptor. Ref count is {}.", i);
        int n2 = org.apache.logging.log4j.core.b.f.e();
        WaitStrategy waitStrategy = org.apache.logging.log4j.core.b.f.d();
        h = Executors.newSingleThreadExecutor(f);
        g = new Disruptor(j, n2, (Executor)h, ProducerType.MULTI, waitStrategy);
        j[] arrj = new j[]{new j(null)};
        ExceptionHandler exceptionHandler = org.apache.logging.log4j.core.b.f.f();
        g.handleExceptionsWith(exceptionHandler);
        g.handleEventsWith((EventHandler[])arrj);
        e.a("Starting AsyncLoggerConfig disruptor with ringbuffer size={}, waitStrategy={}, exceptionHandler={}...", new Object[]{g.getRingBuffer().getBufferSize(), waitStrategy.getClass().getSimpleName(), exceptionHandler});
        g.start();
    }

    private static WaitStrategy d() {
        String string = System.getProperty("AsyncLoggerConfig.WaitStrategy");
        e.a("property AsyncLoggerConfig.WaitStrategy={}", string);
        if ("Sleep".equals(string)) {
            return new SleepingWaitStrategy();
        }
        if ("Yield".equals(string)) {
            return new YieldingWaitStrategy();
        }
        if ("Block".equals(string)) {
            return new BlockingWaitStrategy();
        }
        return new SleepingWaitStrategy();
    }

    private static int e() {
        int n2 = 262144;
        String string = System.getProperty("AsyncLoggerConfig.RingBufferSize", String.valueOf(n2));
        try {
            int n3 = Integer.parseInt(string);
            if (n3 < 128) {
                n3 = 128;
                e.f("Invalid RingBufferSize {}, using minimum size {}.", string, 128);
            }
            n2 = n3;
        }
        catch (Exception exception) {
            e.f("Invalid RingBufferSize {}, using default size {}.", string, n2);
        }
        return Util.ceilingNextPowerOfTwo((int)n2);
    }

    private static ExceptionHandler f() {
        String string = System.getProperty("AsyncLoggerConfig.ExceptionHandler");
        if (string == null) {
            return null;
        }
        try {
            Class<?> class_ = Class.forName(string);
            ExceptionHandler exceptionHandler = (ExceptionHandler)class_.newInstance();
            return exceptionHandler;
        }
        catch (Exception exception) {
            e.a("AsyncLoggerConfig.ExceptionHandler not set: error creating " + string + ": ", (Throwable)exception);
            return null;
        }
    }

    static synchronized void a() {
        ++i;
        org.apache.logging.log4j.core.b.f.c();
    }

    static synchronized void b() {
        if (--i > 0) {
            e.e("AsyncLoggerConfigHelper: not shutting down disruptor: ref count is {}.", i);
            return;
        }
        Disruptor disruptor = g;
        if (disruptor == null) {
            e.e("AsyncLoggerConfigHelper: disruptor already shut down: ref count is {}.", i);
            return;
        }
        e.e("AsyncLoggerConfigHelper: shutting down disruptor: ref count is {}.", i);
        g = null;
        disruptor.shutdown();
        RingBuffer ringBuffer = disruptor.getRingBuffer();
        for (int i2 = 0; i2 < 20 && !ringBuffer.hasAvailableCapacity(ringBuffer.getBufferSize()); ++i2) {
            try {
                Thread.sleep(500L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        h.shutdown();
        h = null;
    }

    public void a(org.apache.logging.log4j.core.h h2) {
        this.l.set(h2);
        g.publishEvent(this.k);
    }

    static /* synthetic */ ThreadLocal a(f f2) {
        return f2.l;
    }

    static /* synthetic */ org.apache.logging.log4j.core.b.d b(f f2) {
        return f2.m;
    }

    static {
        i = 0;
        j = new g();
    }
}

