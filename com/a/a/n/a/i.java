/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.dx;
import com.a.a.n.a.er;
import com.a.a.n.a.et;
import com.a.a.n.a.eu;
import com.a.a.n.a.j;
import com.a.a.n.a.k;
import com.a.a.n.a.n;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class i
implements er {
    private final dx a = new j(this);
    private final er b = new k(this);

    protected i() {
    }

    protected abstract void a();

    protected abstract void b();

    protected Executor c() {
        return new n(this);
    }

    public String toString() {
        return this.d() + " [" + (Object)((Object)this.g()) + "]";
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

    protected String d() {
        return this.getClass().getSimpleName();
    }

    static /* synthetic */ dx a(i i2) {
        return i2.a;
    }
}

