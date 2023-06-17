/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.dx;
import com.a.a.n.a.ad;
import com.a.a.n.a.du;
import com.a.a.n.a.p;
import com.a.a.n.a.r;
import com.a.a.n.a.s;
import com.a.a.n.a.t;
import com.a.a.n.a.u;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantLock;

class q
extends ad {
    private volatile Future b;
    private volatile ScheduledExecutorService c;
    private final ReentrantLock d = new ReentrantLock();
    private final Runnable e = new r(this);
    final /* synthetic */ p a;

    q(p p2) {
        this.a = p2;
    }

    @Override
    protected final void a() {
        this.c = du.a(this.a.e(), (dx)new s(this));
        this.c.execute(new t(this));
    }

    @Override
    protected final void b() {
        this.b.cancel(false);
        this.c.execute(new u(this));
    }

    static /* synthetic */ ReentrantLock a(q q2) {
        return q2.d;
    }

    static /* synthetic */ Future a(q q2, Future future) {
        q2.b = future;
        return q2.b;
    }

    static /* synthetic */ ScheduledExecutorService b(q q2) {
        return q2.c;
    }

    static /* synthetic */ Runnable c(q q2) {
        return q2.e;
    }
}

