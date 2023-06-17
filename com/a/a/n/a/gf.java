/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.gg;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class gf {
    private String a = null;
    private Boolean b = null;
    private Integer c = null;
    private Thread.UncaughtExceptionHandler d = null;
    private ThreadFactory e = null;

    public gf a(String string) {
        String.format(string, 0);
        this.a = string;
        return this;
    }

    public gf a(boolean bl2) {
        this.b = bl2;
        return this;
    }

    public gf a(int n2) {
        cl.a(n2 >= 1, "Thread priority (%s) must be >= %s", new Object[]{n2, 1});
        cl.a(n2 <= 10, "Thread priority (%s) must be <= %s", new Object[]{n2, 10});
        this.c = n2;
        return this;
    }

    public gf a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.d = (Thread.UncaughtExceptionHandler)cl.a(uncaughtExceptionHandler);
        return this;
    }

    public gf a(ThreadFactory threadFactory) {
        this.e = (ThreadFactory)cl.a(threadFactory);
        return this;
    }

    public ThreadFactory a() {
        return gf.a(this);
    }

    private static ThreadFactory a(gf gf2) {
        String string = gf2.a;
        Boolean bl2 = gf2.b;
        Integer n2 = gf2.c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = gf2.d;
        ThreadFactory threadFactory = gf2.e != null ? gf2.e : Executors.defaultThreadFactory();
        AtomicLong atomicLong = string != null ? new AtomicLong(0L) : null;
        return new gg(threadFactory, string, atomicLong, bl2, n2, uncaughtExceptionHandler);
    }
}

