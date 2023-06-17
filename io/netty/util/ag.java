/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.ai;
import io.netty.util.aj;
import io.netty.util.b.u;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import java.util.Queue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ag {
    private static final g a = h.a(ag.class);
    private static final ThreadFactory b = new u(ag.class, true, 1);
    private static final Queue c = io.netty.util.c.u.n();
    private static final aj d = new aj(null);
    private static final AtomicBoolean e = new AtomicBoolean();
    private static volatile Thread f;

    public static void a(Thread thread, Runnable runnable) {
        if (thread == null) {
            throw new NullPointerException("thread");
        }
        if (runnable == null) {
            throw new NullPointerException("task");
        }
        if (!thread.isAlive()) {
            throw new IllegalArgumentException("thread must be alive.");
        }
        ag.a(thread, runnable, true);
    }

    public static void b(Thread thread, Runnable runnable) {
        if (thread == null) {
            throw new NullPointerException("thread");
        }
        if (runnable == null) {
            throw new NullPointerException("task");
        }
        ag.a(thread, runnable, false);
    }

    private static void a(Thread thread, Runnable runnable, boolean bl2) {
        c.add(new ai(thread, runnable, bl2));
        if (e.compareAndSet(false, true)) {
            Thread thread2 = b.newThread(d);
            thread2.start();
            f = thread2;
        }
    }

    public static boolean a(long l2, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        Thread thread = f;
        if (thread != null) {
            thread.join(timeUnit.toMillis(l2));
            return !thread.isAlive();
        }
        return true;
    }

    private ag() {
    }

    static /* synthetic */ Queue a() {
        return c;
    }

    static /* synthetic */ AtomicBoolean b() {
        return e;
    }

    static /* synthetic */ g c() {
        return a;
    }
}

