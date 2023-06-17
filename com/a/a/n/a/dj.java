/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.bu;
import com.a.a.n.a.cb;
import com.a.a.n.a.dk;
import com.a.a.n.a.dl;
import com.a.a.n.a.gf;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

class dj
extends cb
implements dl {
    private static final ThreadFactory a = new gf().a(true).a("ListenableFutureAdapter-thread-%d").a();
    private static final Executor b = Executors.newCachedThreadPool(a);
    private final Executor c;
    private final bu d = new bu();
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final Future f;

    dj(Future future) {
        this(future, b);
    }

    dj(Future future, Executor executor) {
        this.f = (Future)cl.a(future);
        this.c = (Executor)cl.a(executor);
    }

    @Override
    protected Future c() {
        return this.f;
    }

    @Override
    public void a(Runnable runnable, Executor executor) {
        this.d.a(runnable, executor);
        if (this.e.compareAndSet(false, true)) {
            if (this.f.isDone()) {
                this.d.a();
                return;
            }
            this.c.execute(new dk(this));
        }
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.c();
    }

    static /* synthetic */ Future a(dj dj2) {
        return dj2.f;
    }

    static /* synthetic */ bu b(dj dj2) {
        return dj2.d;
    }
}

