/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.a;
import io.netty.util.b.ab;
import io.netty.util.b.af;
import io.netty.util.b.au;
import io.netty.util.b.ax;
import io.netty.util.b.ay;
import io.netty.util.b.ba;
import io.netty.util.b.bb;
import io.netty.util.b.bc;
import io.netty.util.b.bd;
import io.netty.util.b.be;
import io.netty.util.b.bf;
import io.netty.util.b.l;
import io.netty.util.b.w;
import io.netty.util.b.x;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.c.u;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class az
extends a {
    private static final g a = io.netty.util.c.b.h.a(az.class);
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 3;
    private static final int g = 4;
    private static final int h = 5;
    private static final Runnable i = new ba();
    private static final AtomicIntegerFieldUpdater j;
    private final x k;
    private final Queue l;
    final Queue b = new PriorityQueue();
    private final Thread m;
    private final Semaphore n = new Semaphore(0);
    private final Set o = new LinkedHashSet();
    private final boolean p;
    private long q;
    private volatile int r = 1;
    private volatile long s;
    private volatile long t;
    private long u;
    private final au v = new l(af.a);
    private static final long w;

    protected az(x x2, ThreadFactory threadFactory, boolean bl2) {
        if (threadFactory == null) {
            throw new NullPointerException("threadFactory");
        }
        this.k = x2;
        this.p = bl2;
        this.m = threadFactory.newThread(new bb(this));
        this.l = this.g();
    }

    protected Queue g() {
        return new LinkedBlockingQueue();
    }

    @Override
    public x d() {
        return this.k;
    }

    protected void p() {
        this.m.interrupt();
    }

    protected Runnable k() {
        Runnable runnable;
        assert (this.bt_());
        while ((runnable = (Runnable)this.l.poll()) == i) {
        }
        return runnable;
    }

    protected Runnable q() {
        Runnable runnable;
        assert (this.bt_());
        if (!(this.l instanceof BlockingQueue)) {
            throw new UnsupportedOperationException();
        }
        BlockingQueue blockingQueue = (BlockingQueue)this.l;
        do {
            ay ay2;
            if ((ay2 = (ay)this.b.peek()) == null) {
                Runnable runnable2 = null;
                try {
                    runnable2 = (Runnable)blockingQueue.take();
                    if (runnable2 == i) {
                        runnable2 = null;
                    }
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                return runnable2;
            }
            long l2 = ay2.g();
            runnable = null;
            if (l2 > 0L) {
                try {
                    runnable = (Runnable)blockingQueue.poll(l2, TimeUnit.NANOSECONDS);
                }
                catch (InterruptedException interruptedException) {
                    return null;
                }
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
        while ((ay2 = (ay)this.b.peek()) != null) {
            if (l2 == 0L) {
                l2 = ay.e();
            }
            if (ay2.f() > l2) break;
            this.b.remove();
            this.l.add(ay2);
        }
    }

    protected Runnable r() {
        assert (this.bt_());
        return (Runnable)this.l.peek();
    }

    protected boolean s() {
        assert (this.bt_());
        return !this.l.isEmpty();
    }

    protected boolean t() {
        assert (this.bt_());
        ay ay2 = (ay)this.b.peek();
        return ay2 != null && ay2.f() <= ay.e();
    }

    public final int u() {
        return this.l.size();
    }

    protected void c(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("task");
        }
        if (this.isShutdown()) {
            az.y();
        }
        this.l.add(runnable);
    }

    protected boolean d(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("task");
        }
        return this.l.remove(runnable);
    }

    protected boolean v() {
        this.h();
        Runnable runnable = this.k();
        if (runnable == null) {
            return false;
        }
        do {
            try {
                runnable.run();
            }
            catch (Throwable throwable) {
                a.d("A task raised an exception.", throwable);
            }
        } while ((runnable = this.k()) != null);
        this.q = ay.e();
        return true;
    }

    protected boolean a(long l2) {
        long l3;
        block4: {
            this.h();
            Runnable runnable = this.k();
            if (runnable == null) {
                return false;
            }
            long l4 = ay.e() + l2;
            long l5 = 0L;
            do {
                try {
                    runnable.run();
                }
                catch (Throwable throwable) {
                    a.d("A task raised an exception.", throwable);
                }
                if ((++l5 & 0x3FL) == 0L && (l3 = ay.e()) >= l4) break block4;
            } while ((runnable = this.k()) != null);
            l3 = ay.e();
        }
        this.q = l3;
        return true;
    }

    protected long b(long l2) {
        ay ay2 = (ay)this.b.peek();
        if (ay2 == null) {
            return w;
        }
        return ay2.d(l2);
    }

    protected void w() {
        this.q = ay.e();
    }

    protected abstract void e();

    protected void i() {
    }

    protected void a(boolean bl2) {
        if (!bl2 || j.get(this) == 3) {
            this.l.add(i);
        }
    }

    @Override
    public boolean a(Thread thread) {
        return thread == this.m;
    }

    public void e(Runnable runnable) {
        if (this.bt_()) {
            this.o.add(runnable);
        } else {
            this.execute(new bc(this, runnable));
        }
    }

    public void f(Runnable runnable) {
        if (this.bt_()) {
            this.o.remove(runnable);
        } else {
            this.execute(new bd(this, runnable));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean j() {
        boolean bl2 = false;
        while (!this.o.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.o);
            this.o.clear();
            for (Runnable runnable : arrayList) {
                try {
                    runnable.run();
                }
                catch (Throwable throwable) {
                    a.d("Shutdown hook raised an exception.", throwable);
                }
                finally {
                    bl2 = true;
                }
            }
        }
        if (bl2) {
            this.q = ay.e();
        }
        return bl2;
    }

    @Override
    public ab a(long l2, long l3, TimeUnit timeUnit) {
        boolean bl2;
        int n2;
        int n3;
        if (l2 < 0L) {
            throw new IllegalArgumentException("quietPeriod: " + l2 + " (expected >= 0)");
        }
        if (l3 < l2) {
            throw new IllegalArgumentException("timeout: " + l3 + " (expected >= quietPeriod (" + l2 + "))");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        if (this.br_()) {
            return this.bs_();
        }
        boolean bl3 = this.bt_();
        do {
            if (this.br_()) {
                return this.bs_();
            }
            bl2 = true;
            n3 = j.get(this);
            if (bl3) {
                n2 = 3;
                continue;
            }
            switch (n3) {
                case 1: 
                case 2: {
                    n2 = 3;
                    break;
                }
                default: {
                    n2 = n3;
                    bl2 = false;
                }
            }
        } while (!j.compareAndSet(this, n3, n2));
        this.s = timeUnit.toNanos(l2);
        this.t = timeUnit.toNanos(l3);
        if (n3 == 1) {
            this.m.start();
        }
        if (bl2) {
            this.a(bl3);
        }
        return this.bs_();
    }

    @Override
    public ab bs_() {
        return this.v;
    }

    @Override
    public void shutdown() {
        boolean bl2;
        int n2;
        int n3;
        if (this.isShutdown()) {
            return;
        }
        boolean bl3 = this.bt_();
        do {
            if (this.br_()) {
                return;
            }
            bl2 = true;
            n3 = j.get(this);
            if (bl3) {
                n2 = 4;
                continue;
            }
            switch (n3) {
                case 1: 
                case 2: 
                case 3: {
                    n2 = 4;
                    break;
                }
                default: {
                    n2 = n3;
                    bl2 = false;
                }
            }
        } while (!j.compareAndSet(this, n3, n2));
        if (n3 == 1) {
            this.m.start();
        }
        if (bl2) {
            this.a(bl3);
        }
    }

    @Override
    public boolean br_() {
        return j.get(this) >= 3;
    }

    @Override
    public boolean isShutdown() {
        return j.get(this) >= 4;
    }

    @Override
    public boolean isTerminated() {
        return j.get(this) == 5;
    }

    protected boolean x() {
        if (!this.br_()) {
            return false;
        }
        if (!this.bt_()) {
            throw new IllegalStateException("must be invoked from an event loop");
        }
        this.l();
        if (this.u == 0L) {
            this.u = ay.e();
        }
        if (this.v() || this.j()) {
            if (this.isShutdown()) {
                return true;
            }
            this.a(true);
            return false;
        }
        long l2 = ay.e();
        if (this.isShutdown() || l2 - this.u > this.t) {
            return true;
        }
        if (l2 - this.q <= this.s) {
            this.a(true);
            try {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            return false;
        }
        return true;
    }

    private void l() {
        ay[] array;
        if (this.b.isEmpty()) {
            return;
        }
        for (ay ay2 : array = this.b.toArray(new ay[this.b.size()])) {
            ay2.cancel(false);
        }
        this.b.clear();
    }

    @Override
    public boolean awaitTermination(long l2, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        if (this.bt_()) {
            throw new IllegalStateException("cannot await termination of the current thread");
        }
        if (this.n.tryAcquire(l2, timeUnit)) {
            this.n.release();
        }
        return this.isTerminated();
    }

    @Override
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("task");
        }
        boolean bl2 = this.bt_();
        if (bl2) {
            this.c(runnable);
        } else {
            this.B();
            this.c(runnable);
            if (this.isShutdown() && this.d(runnable)) {
                az.y();
            }
        }
        if (!this.p && this.a(runnable)) {
            this.a(bl2);
        }
    }

    protected boolean a(Runnable runnable) {
        return true;
    }

    protected static void y() {
        throw new RejectedExecutionException("event executor terminated");
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
        return this.a(new ay((w)this, this.b, runnable, null, ay.c(timeUnit.toNanos(l2))));
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
        return this.a(new ay(this, this.b, callable, ay.c(timeUnit.toNanos(l2))));
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
        return this.a(new ay((w)this, this.b, Executors.callable(runnable, null), ay.c(timeUnit.toNanos(l2)), timeUnit.toNanos(l3)));
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
        return this.a(new ay((w)this, this.b, Executors.callable(runnable, null), ay.c(timeUnit.toNanos(l2)), -timeUnit.toNanos(l3)));
    }

    private ax a(ay ay2) {
        if (ay2 == null) {
            throw new NullPointerException("task");
        }
        if (this.bt_()) {
            this.b.add(ay2);
        } else {
            this.execute(new be(this, ay2));
        }
        return ay2;
    }

    private void B() {
        if (j.get(this) == 1 && j.compareAndSet(this, 1, 2)) {
            this.b.add(new ay((w)this, this.b, Executors.callable(new bf(this, null), null), ay.c(w), -w));
            this.m.start();
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

    static /* synthetic */ g z() {
        return a;
    }

    static /* synthetic */ AtomicIntegerFieldUpdater A() {
        return j;
    }

    static /* synthetic */ long a(az az2) {
        return az2.u;
    }

    static /* synthetic */ Semaphore b(az az2) {
        return az2.n;
    }

    static /* synthetic */ Queue c(az az2) {
        return az2.l;
    }

    static /* synthetic */ au d(az az2) {
        return az2.v;
    }

    static /* synthetic */ Set e(az az2) {
        return az2.o;
    }

    static {
        AtomicIntegerFieldUpdater<az> atomicIntegerFieldUpdater = io.netty.util.c.u.b(az.class, "state");
        if (atomicIntegerFieldUpdater == null) {
            atomicIntegerFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(az.class, "r");
        }
        j = atomicIntegerFieldUpdater;
        w = TimeUnit.SECONDS.toNanos(1L);
    }
}

