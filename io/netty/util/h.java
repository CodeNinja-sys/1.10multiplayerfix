/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.aa;
import io.netty.util.ab;
import io.netty.util.ak;
import io.netty.util.al;
import io.netty.util.am;
import io.netty.util.c.b.g;
import io.netty.util.c.u;
import io.netty.util.j;
import io.netty.util.k;
import io.netty.util.m;
import java.util.Collections;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class h
implements al {
    static final g a = io.netty.util.c.b.h.a(h.class);
    private static final ab e = new ab(h.class, 1, (long)(Runtime.getRuntime().availableProcessors() * 4));
    private static final AtomicIntegerFieldUpdater f;
    private final aa g;
    private final m h = new m(this, null);
    private final Thread i;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    private volatile int j = 0;
    private final long k;
    private final j[] l;
    private final int m;
    private final CountDownLatch n = new CountDownLatch(1);
    private final Queue o = u.n();
    private final Queue p = u.n();
    private volatile long q;

    public h() {
        this(Executors.defaultThreadFactory());
    }

    public h(long l2, TimeUnit timeUnit) {
        this(Executors.defaultThreadFactory(), l2, timeUnit);
    }

    public h(long l2, TimeUnit timeUnit, int n2) {
        this(Executors.defaultThreadFactory(), l2, timeUnit, n2);
    }

    public h(ThreadFactory threadFactory) {
        this(threadFactory, 100L, TimeUnit.MILLISECONDS);
    }

    public h(ThreadFactory threadFactory, long l2, TimeUnit timeUnit) {
        this(threadFactory, l2, timeUnit, 512);
    }

    public h(ThreadFactory threadFactory, long l2, TimeUnit timeUnit, int n2) {
        if (threadFactory == null) {
            throw new NullPointerException("threadFactory");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        if (l2 <= 0L) {
            throw new IllegalArgumentException("tickDuration must be greater than 0: " + l2);
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("ticksPerWheel must be greater than 0: " + n2);
        }
        this.l = io.netty.util.h.a(n2);
        this.m = this.l.length - 1;
        this.k = timeUnit.toNanos(l2);
        if (this.k >= Long.MAX_VALUE / (long)this.l.length) {
            throw new IllegalArgumentException(String.format("tickDuration: %d (expected: 0 < tickDuration in nanos < %d", l2, Long.MAX_VALUE / (long)this.l.length));
        }
        this.i = threadFactory.newThread(this.h);
        this.g = e.a(this);
    }

    private static j[] a(int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException("ticksPerWheel must be greater than 0: " + n2);
        }
        if (n2 > 0x40000000) {
            throw new IllegalArgumentException("ticksPerWheel may not be greater than 2^30: " + n2);
        }
        n2 = io.netty.util.h.b(n2);
        j[] arrj = new j[n2];
        for (int i2 = 0; i2 < arrj.length; ++i2) {
            arrj[i2] = new j(null);
        }
        return arrj;
    }

    private static int b(int n2) {
        int n3;
        for (n3 = 1; n3 < n2; n3 <<= 1) {
        }
        return n3;
    }

    public void a() {
        switch (f.get(this)) {
            case 0: {
                if (!f.compareAndSet(this, 0, 1)) break;
                this.i.start();
                break;
            }
            case 1: {
                break;
            }
            case 2: {
                throw new IllegalStateException("cannot be started once stopped");
            }
            default: {
                throw new Error("Invalid WorkerState");
            }
        }
        while (this.q == 0L) {
            try {
                this.n.await();
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    @Override
    public Set b() {
        if (Thread.currentThread() == this.i) {
            throw new IllegalStateException(h.class.getSimpleName() + ".stop() cannot be called from " + am.class.getSimpleName());
        }
        if (!f.compareAndSet(this, 1, 2)) {
            f.set(this, 2);
            if (this.g != null) {
                this.g.b();
            }
            return Collections.emptySet();
        }
        boolean bl2 = false;
        while (this.i.isAlive()) {
            this.i.interrupt();
            try {
                this.i.join(100L);
            }
            catch (InterruptedException interruptedException) {
                bl2 = true;
            }
        }
        if (bl2) {
            Thread.currentThread().interrupt();
        }
        if (this.g != null) {
            this.g.b();
        }
        return this.h.a();
    }

    @Override
    public ak a(am am2, long l2, TimeUnit timeUnit) {
        if (am2 == null) {
            throw new NullPointerException("task");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        this.a();
        long l3 = System.nanoTime() + timeUnit.toNanos(l2) - this.q;
        k k2 = new k(this, am2, l3);
        this.o.add(k2);
        return k2;
    }

    static /* synthetic */ long a(h h2, long l2) {
        h2.q = l2;
        return h2.q;
    }

    static /* synthetic */ long a(h h2) {
        return h2.q;
    }

    static /* synthetic */ CountDownLatch b(h h2) {
        return h2.n;
    }

    static /* synthetic */ int c(h h2) {
        return h2.m;
    }

    static /* synthetic */ j[] d(h h2) {
        return h2.l;
    }

    static /* synthetic */ AtomicIntegerFieldUpdater c() {
        return f;
    }

    static /* synthetic */ Queue e(h h2) {
        return h2.o;
    }

    static /* synthetic */ long f(h h2) {
        return h2.k;
    }

    static /* synthetic */ Queue g(h h2) {
        return h2.p;
    }

    static {
        AtomicIntegerFieldUpdater<h> atomicIntegerFieldUpdater = u.b(h.class, "workerState");
        if (atomicIntegerFieldUpdater == null) {
            atomicIntegerFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(h.class, "j");
        }
        f = atomicIntegerFieldUpdater;
    }
}

