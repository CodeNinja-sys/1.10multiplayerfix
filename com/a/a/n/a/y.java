/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.ad;
import com.a.a.n.a.cb;
import com.a.a.n.a.x;
import com.a.a.n.a.z;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantLock;

class y
extends cb
implements Callable {
    private final Runnable b;
    private final ScheduledExecutorService c;
    private final ad d;
    private final ReentrantLock e = new ReentrantLock();
    private Future f;
    final /* synthetic */ x a;

    y(x x2, ad ad2, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
        this.a = x2;
        this.b = runnable;
        this.c = scheduledExecutorService;
        this.d = ad2;
    }

    public Void a() {
        this.b.run();
        this.b();
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        this.e.lock();
        try {
            if (this.f == null || !this.f.isCancelled()) {
                z z2 = this.a.a();
                this.f = this.c.schedule(this, z.a(z2), z.b(z2));
            }
        }
        catch (Throwable throwable) {
            this.d.a(throwable);
        }
        finally {
            this.e.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean cancel(boolean bl2) {
        this.e.lock();
        try {
            boolean bl3 = this.f.cancel(bl2);
            return bl3;
        }
        finally {
            this.e.unlock();
        }
    }

    @Override
    protected Future c() {
        throw new UnsupportedOperationException("Only cancel is supported by this future");
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.c();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

