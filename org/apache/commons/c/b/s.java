/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.b;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.c.b.t;

public class s {
    public static final int a = 0;
    private static final int b = 1;
    private final ScheduledExecutorService c;
    private final long d;
    private final TimeUnit e;
    private final boolean f;
    private ScheduledFuture g;
    private long h;
    private long i;
    private int j;
    private int k;
    private int l;
    private boolean m;

    public s(long l2, TimeUnit timeUnit, int n2) {
        this(null, l2, timeUnit, n2);
    }

    public s(ScheduledExecutorService scheduledExecutorService, long l2, TimeUnit timeUnit, int n2) {
        if (l2 <= 0L) {
            throw new IllegalArgumentException("Time period must be greater 0!");
        }
        this.d = l2;
        this.e = timeUnit;
        if (scheduledExecutorService != null) {
            this.c = scheduledExecutorService;
            this.f = false;
        } else {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            scheduledThreadPoolExecutor.setContinueExistingPeriodicTasksAfterShutdownPolicy(false);
            scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            this.c = scheduledThreadPoolExecutor;
            this.f = true;
        }
        this.a(n2);
    }

    public final synchronized int a() {
        return this.j;
    }

    public final synchronized void a(int n2) {
        this.j = n2;
    }

    public synchronized void b() {
        if (!this.m) {
            if (this.f) {
                this.k().shutdownNow();
            }
            if (this.g != null) {
                this.g.cancel(false);
            }
            this.m = true;
        }
    }

    public synchronized boolean c() {
        return this.m;
    }

    public synchronized void d() {
        if (this.c()) {
            throw new IllegalStateException("TimedSemaphore is shut down!");
        }
        if (this.g == null) {
            this.g = this.l();
        }
        boolean bl2 = false;
        do {
            boolean bl3 = bl2 = this.a() <= 0 || this.k < this.a();
            if (!bl2) {
                this.wait();
                continue;
            }
            ++this.k;
        } while (!bl2);
    }

    public synchronized int e() {
        return this.l;
    }

    public synchronized int f() {
        return this.k;
    }

    public synchronized int g() {
        return this.a() - this.f();
    }

    public synchronized double h() {
        return this.i == 0L ? 0.0 : (double)this.h / (double)this.i;
    }

    public long i() {
        return this.d;
    }

    public TimeUnit j() {
        return this.e;
    }

    protected ScheduledExecutorService k() {
        return this.c;
    }

    protected ScheduledFuture l() {
        return this.k().scheduleAtFixedRate(new t(this), this.i(), this.i(), this.j());
    }

    synchronized void m() {
        this.l = this.k;
        this.h += (long)this.k;
        ++this.i;
        this.k = 0;
        this.notifyAll();
    }
}

