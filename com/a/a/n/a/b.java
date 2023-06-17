/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.c;
import com.a.a.n.a.er;
import com.a.a.n.a.et;
import com.a.a.n.a.eu;
import com.a.a.n.a.f;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public abstract class b
implements er {
    private static final Logger a = Logger.getLogger(b.class.getName());
    private final er b = new c(this);

    protected b() {
    }

    protected void a() {
    }

    protected abstract void b();

    protected void c() {
    }

    protected void d() {
    }

    protected Executor e() {
        return new f(this);
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

    protected String m() {
        return this.getClass().getSimpleName();
    }

    static /* synthetic */ Logger n() {
        return a;
    }
}

