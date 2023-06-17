/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.d.gd;
import com.a.a.d.jl;
import com.a.a.d.lo;
import com.a.a.m.ae;
import com.a.a.m.al;
import com.a.a.m.an;
import com.a.a.m.at;
import com.a.a.m.aw;
import java.util.Collection;
import java.util.Set;

final class ak
extends aw {
    private final transient aw c;
    private transient lo d;
    private static final long e = 0L;
    final /* synthetic */ ae a;

    ak(ae ae2, aw aw2) {
        this.a = ae2;
        super(ae2);
        this.c = aw2;
    }

    @Override
    protected Set bI_() {
        lo lo2 = this.d;
        if (lo2 == null) {
            this.d = gd.a(this.c).a(at.b).h();
            return this.d;
        }
        return lo2;
    }

    @Override
    public aw e() {
        return this;
    }

    @Override
    public Set d() {
        jl jl2 = an.b.a(ae.b(this.a));
        return gd.a(jl2).a(new al(this)).h();
    }

    @Override
    public aw c() {
        throw new UnsupportedOperationException("interfaces().classes() not supported.");
    }

    private Object f() {
        return this.a.f().e();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.bI_();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.bI_();
    }
}

