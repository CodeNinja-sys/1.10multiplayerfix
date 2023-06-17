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
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.b.c;
import org.apache.logging.log4j.core.b.m;
import org.apache.logging.log4j.core.b.n;
import org.apache.logging.log4j.core.b.q;
import org.apache.logging.log4j.core.b.r;
import org.apache.logging.log4j.core.d.g;
import org.apache.logging.log4j.core.k;
import org.apache.logging.log4j.d.d;
import org.apache.logging.log4j.f;
import org.apache.logging.log4j.i;

public class a
extends org.apache.logging.log4j.core.i {
    private static final int i = 500;
    private static final int j = 20;
    private static final int k = 128;
    private static final int l = 262144;
    private static final d m = org.apache.logging.log4j.d.d.k();
    private static volatile Disruptor n;
    private static org.apache.logging.log4j.core.d.f o;
    private static ExecutorService p;
    private final ThreadLocal q = new ThreadLocal();

    private static int s() {
        int n2 = 262144;
        String string = System.getProperty("AsyncLogger.RingBufferSize", String.valueOf(n2));
        try {
            int n3 = Integer.parseInt(string);
            if (n3 < 128) {
                n3 = 128;
                m.f("Invalid RingBufferSize {}, using minimum size {}.", string, 128);
            }
            n2 = n3;
        }
        catch (Exception exception) {
            m.f("Invalid RingBufferSize {}, using default size {}.", string, n2);
        }
        return Util.ceilingNextPowerOfTwo((int)n2);
    }

    private static WaitStrategy t() {
        String string = System.getProperty("AsyncLogger.WaitStrategy");
        m.a("property AsyncLogger.WaitStrategy={}", new Object[]{string});
        if ("Sleep".equals(string)) {
            m.a("disruptor event handler uses SleepingWaitStrategy");
            return new SleepingWaitStrategy();
        }
        if ("Yield".equals(string)) {
            m.a("disruptor event handler uses YieldingWaitStrategy");
            return new YieldingWaitStrategy();
        }
        if ("Block".equals(string)) {
            m.a("disruptor event handler uses BlockingWaitStrategy");
            return new BlockingWaitStrategy();
        }
        m.a("disruptor event handler uses SleepingWaitStrategy");
        return new SleepingWaitStrategy();
    }

    private static ExceptionHandler u() {
        String string = System.getProperty("AsyncLogger.ExceptionHandler");
        if (string == null) {
            m.a("No AsyncLogger.ExceptionHandler specified");
            return null;
        }
        try {
            Class<?> class_ = Class.forName(string);
            ExceptionHandler exceptionHandler = (ExceptionHandler)class_.newInstance();
            m.a("AsyncLogger.ExceptionHandler=" + (Object)exceptionHandler);
            return exceptionHandler;
        }
        catch (Exception exception) {
            m.a("AsyncLogger.ExceptionHandler not set: error creating " + string + ": ", (Throwable)exception);
            return null;
        }
    }

    public a(k k2, String string, org.apache.logging.log4j.a.n n2) {
        super(k2, string, n2);
    }

    @Override
    public void a(f f2, String string, b b2, org.apache.logging.log4j.a.m m2, Throwable throwable) {
        c c2 = (c)this.q.get();
        if (c2 == null) {
            c2 = new c(null);
            org.apache.logging.log4j.core.b.c.a(c2, new r());
            org.apache.logging.log4j.core.b.c.a(c2, Thread.currentThread().getName());
            this.q.set(c2);
        }
        boolean bl2 = this.a.a.l();
        org.apache.logging.log4j.core.b.c.b(c2).a(this, this.d(), f2, string, b2, m2, throwable, org.apache.logging.log4j.i.c(), org.apache.logging.log4j.i.g(), org.apache.logging.log4j.core.b.c.a(c2), bl2 ? this.g(string) : null, o.b());
        n.publishEvent((EventTranslator)org.apache.logging.log4j.core.b.c.b(c2));
    }

    private StackTraceElement g(String string) {
        return org.apache.logging.log4j.core.e.d.a(string);
    }

    public void a(n n2) {
        Map map = this.a.a.m();
        n2.a(map, this.a.b.l());
        this.a.a(n2);
    }

    public static void r() {
        Disruptor disruptor = n;
        n = null;
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
        p.shutdown();
    }

    static {
        o = org.apache.logging.log4j.core.d.g.a();
        p = Executors.newSingleThreadExecutor(new m("AsyncLogger-"));
        int n2 = org.apache.logging.log4j.core.b.a.s();
        WaitStrategy waitStrategy = org.apache.logging.log4j.core.b.a.t();
        n = new Disruptor((EventFactory)org.apache.logging.log4j.core.b.n.a, n2, (Executor)p, ProducerType.MULTI, waitStrategy);
        q[] arrq = new q[]{new q()};
        n.handleExceptionsWith(org.apache.logging.log4j.core.b.a.u());
        n.handleEventsWith((EventHandler[])arrq);
        m.a("Starting AsyncLogger disruptor with ringbuffer size {}...", new Object[]{n.getRingBuffer().getBufferSize()});
        n.start();
    }
}

