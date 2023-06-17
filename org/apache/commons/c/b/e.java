/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.b;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.c.b.f;
import org.apache.commons.c.b.g;

public class e
implements ThreadFactory {
    private final AtomicLong a;
    private final ThreadFactory b;
    private final Thread.UncaughtExceptionHandler c;
    private final String d;
    private final Integer e;
    private final Boolean f;

    private e(g g2) {
        this.b = g.a(g2) == null ? Executors.defaultThreadFactory() : g.a(g2);
        this.d = g.b(g2);
        this.e = g.c(g2);
        this.f = g.d(g2);
        this.c = g.e(g2);
        this.a = new AtomicLong();
    }

    public final ThreadFactory a() {
        return this.b;
    }

    public final String b() {
        return this.d;
    }

    public final Boolean c() {
        return this.f;
    }

    public final Integer d() {
        return this.e;
    }

    public final Thread.UncaughtExceptionHandler e() {
        return this.c;
    }

    public long f() {
        return this.a.get();
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = this.a().newThread(runnable);
        this.a(thread);
        return thread;
    }

    private void a(Thread thread) {
        if (this.b() != null) {
            Long l2 = this.a.incrementAndGet();
            thread.setName(String.format(this.b(), l2));
        }
        if (this.e() != null) {
            thread.setUncaughtExceptionHandler(this.e());
        }
        if (this.d() != null) {
            thread.setPriority(this.d());
        }
        if (this.c() != null) {
            thread.setDaemon(this.c());
        }
    }

    /* synthetic */ e(g g2, f f2) {
        this(g2);
    }
}

