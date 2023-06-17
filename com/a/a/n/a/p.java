/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.aa;
import com.a.a.n.a.ad;
import com.a.a.n.a.du;
import com.a.a.n.a.er;
import com.a.a.n.a.et;
import com.a.a.n.a.eu;
import com.a.a.n.a.q;
import com.a.a.n.a.v;
import com.a.a.n.a.w;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public abstract class p
implements er {
    private static final Logger a = Logger.getLogger(p.class.getName());
    private final ad b = new q(this);

    protected p() {
    }

    protected abstract void a();

    protected void b() {
    }

    protected void c() {
    }

    protected abstract aa d();

    protected ScheduledExecutorService e() {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new v(this));
        this.a(new w(this, scheduledExecutorService), du.a());
        return scheduledExecutorService;
    }

    protected String m() {
        return this.getClass().getSimpleName();
    }

    public String toString() {
        return this.m() + " [" + (Object)((Object)this.g()) + "]";
    }

    @Override
    public final boolean f() {
        return this.b.f();
    }

    @Override
    public final eu g() {
        return this.b.g();
    }

    @Override
    public final void a(et et2, Executor executor) {
        this.b.a(et2, executor);
    }

    @Override
    public final Throwable h() {
        return this.b.h();
    }

    @Override
    public final er i() {
        this.b.i();
        return this;
    }

    @Override
    public final er j() {
        this.b.j();
        return this;
    }

    @Override
    public final void k() {
        this.b.k();
    }

    @Override
    public final void a(long l2, TimeUnit timeUnit) {
        this.b.a(l2, timeUnit);
    }

    @Override
    public final void l() {
        this.b.l();
    }

    @Override
    public final void b(long l2, TimeUnit timeUnit) {
        this.b.b(l2, timeUnit);
    }

    static /* synthetic */ Logger n() {
        return a;
    }

    static /* synthetic */ ad a(p p2) {
        return p2.b;
    }
}

