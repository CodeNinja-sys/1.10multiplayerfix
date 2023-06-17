/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.a;
import io.netty.util.b.ab;
import io.netty.util.b.ag;
import io.netty.util.b.ah;
import io.netty.util.b.ai;
import io.netty.util.b.ax;
import io.netty.util.b.ay;
import io.netty.util.b.u;
import io.netty.util.b.w;
import io.netty.util.b.x;
import io.netty.util.b.y;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class af
extends a {
    private static final g f = io.netty.util.c.b.h.a(af.class);
    private static final long g = TimeUnit.SECONDS.toNanos(1L);
    public static final af a = new af();
    final BlockingQueue b = new LinkedBlockingQueue();
    final Queue c = new PriorityQueue();
    final ay d = new ay((w)this, this.c, Executors.callable(new ah(this, null), null), ay.c(g), -g);
    private final ThreadFactory h = new u(this.getClass());
    private final ai i = new ai(this);
    private final AtomicBoolean j = new AtomicBoolean();
    volatile Thread e;
    private final ab k = new y(this, new UnsupportedOperationException());

    private af() {
        this.c.add(this.d);
    }

    @Override
    public x d() {
        return null;
    }

    Runnable b() {
        Runnable runnable;
        BlockingQueue blockingQueue = this.b;
        do {
            ay ay2;
            if ((ay2 = (ay)this.c.peek()) == null) {
                Runnable runnable2 = null;
                try {
                    runnable2 = (Runnable)blockingQueue.take();
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                return runnable2;
            }
            long l2 = ay2.g();
            if (l2 > 0L) {
                try {
                    runnable = (Runnable)blockingQueue.poll(l2, TimeUnit.NANOSECONDS);
                }
                catch (InterruptedException interruptedException) {
                    return null;
                }
            } else {
                runnable = (Runnable)blockingQueue.poll();
            }
            if (runnable != null) continue;
            this.h();
            runnable = (Runnable)blockingQueue.poll();
        } while (runnable == null);
        return runnable;
    }

    private void h() {
        ay ay2;
        long l2 = 0L;
        while ((ay2 = (ay)this.c.peek()) != null) {
            if (l2 == 0L) {
                l2 = ay.e();
            }
            if (ay2.f() > l2) break;
            this.c.remove();
            this.b.add(ay2);
        }
    }

    public int e() {
        return this.b.size();
    }

    private void a(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("task");
        }
        this.b.add(runnable);
    }

    @Override
    public boolean a(Thread thread) {
        return thread == this.e;
    }

    @Override
    public ab a(long l2, long l3, TimeUnit timeUnit) {
        return this.bs_();
    }

    @Override
    public ab bs_() {
        return this.k;
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean br_() {
        return false;
    }

    @Override
    public boolean isShutdown() {
        return false;
    }

    @Override
    public boolean isTerminated() {
        return false;
    }

    @Override
    public boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return false;
    }

    public boolean a(long l2, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        Thread thread = this.e;
        if (thread == null) {
            throw new IllegalStateException("thread was not started");
        }
        thread.join(timeUnit.toMillis(l2));
        return !thread.isAlive();
    }

    @Override
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("task");
        }
        this.a(runnable);
        if (!this.bt_()) {
            this.i();
        }
    }

    @Override
    public ax a(Runnable runnable, long l2, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("command");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        if (l2 < 0L) {
            throw new IllegalArgumentException(String.format("delay: %d (expected: >= 0)", l2));
        }
        return this.a(new ay((w)this, this.c, runnable, null, ay.c(timeUnit.toNanos(l2))));
    }

    @Override
    public ax a(Callable callable, long l2, TimeUnit timeUnit) {
        if (callable == null) {
            throw new NullPointerException("callable");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        if (l2 < 0L) {
            throw new IllegalArgumentException(String.format("delay: %d (expected: >= 0)", l2));
        }
        return this.a(new ay(this, this.c, callable, ay.c(timeUnit.toNanos(l2))));
    }

    @Override
    public ax a(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("command");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        if (l2 < 0L) {
            throw new IllegalArgumentException(String.format("initialDelay: %d (expected: >= 0)", l2));
        }
        if (l3 <= 0L) {
            throw new IllegalArgumentException(String.format("period: %d (expected: > 0)", l3));
        }
        return this.a(new ay((w)this, this.c, Executors.callable(runnable, null), ay.c(timeUnit.toNanos(l2)), timeUnit.toNanos(l3)));
    }

    @Override
    public ax b(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("command");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        if (l2 < 0L) {
            throw new IllegalArgumentException(String.format("initialDelay: %d (expected: >= 0)", l2));
        }
        if (l3 <= 0L) {
            throw new IllegalArgumentException(String.format("delay: %d (expected: > 0)", l3));
        }
        return this.a(new ay((w)this, this.c, Executors.callable(runnable, null), ay.c(timeUnit.toNanos(l2)), -timeUnit.toNanos(l3)));
    }

    private ax a(ay ay2) {
        if (ay2 == null) {
            throw new NullPointerException("task");
        }
        if (this.bt_()) {
            this.c.add(ay2);
        } else {
            this.execute(new ag(this, ay2));
        }
        return ay2;
    }

    private void i() {
        if (this.j.compareAndSet(false, true)) {
            Thread thread = this.h.newThread(this.i);
            thread.start();
            this.e = thread;
        }
    }

    @Override
    public /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.b(runnable, l2, l3, timeUnit);
    }

    @Override
    public /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.a(runnable, l2, l3, timeUnit);
    }

    @Override
    public /* synthetic */ ScheduledFuture schedule(Callable callable, long l2, TimeUnit timeUnit) {
        return this.a(callable, l2, timeUnit);
    }

    @Override
    public /* synthetic */ ScheduledFuture schedule(Runnable runnable, long l2, TimeUnit timeUnit) {
        return this.a(runnable, l2, timeUnit);
    }

    static /* synthetic */ g g() {
        return f;
    }

    static /* synthetic */ AtomicBoolean a(af af2) {
        return af2.j;
    }
}

