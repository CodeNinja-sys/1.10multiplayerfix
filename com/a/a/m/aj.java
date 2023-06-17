/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.d.gd;
import com.a.a.d.jl;
import com.a.a.d.lo;
import com.a.a.m.ae;
import com.a.a.m.af;
import com.a.a.m.an;
import com.a.a.m.at;
import com.a.a.m.aw;
import java.util.Collection;
import java.util.Set;

final class aj
extends aw {
    private transient lo c;
    private static final long d = 0L;
    final /* synthetic */ ae a;

    private aj(ae ae2) {
        this.a = ae2;
        super(ae2);
    }

    @Override
    protected Set bI_() {
        lo lo2 = this.c;
        if (lo2 == null) {
            jl jl2 = an.a.a().a(this.a);
            this.c = gd.a(jl2).a(at.a).h();
            return this.c;
        }
        return lo2;
    }

    @Override
    public aw c() {
        return this;
    }

    @Override
    public Set d() {
        jl jl2 = an.b.a().a(ae.b(this.a));
        return lo.a(jl2);
    }

    @Override
    public aw e() {
        throw new UnsupportedOperationException("classes().interfaces() not supported.");
    }

    private Object f() {
        return this.a.f().c();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.bI_();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.bI_();
    }

    /* synthetic */ aj(ae ae2, af af2) {
        this(ae2);
    }
}

