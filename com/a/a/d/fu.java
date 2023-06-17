/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.b.cm;
import com.a.a.d.aac;
import com.a.a.d.aad;
import com.a.a.d.an;
import com.a.a.d.fv;
import com.a.a.d.fw;
import com.a.a.d.fx;
import com.a.a.d.ga;
import com.a.a.d.gb;
import com.a.a.d.jl;
import com.a.a.d.lo;
import com.a.a.d.sz;
import com.a.a.d.vi;
import com.a.a.d.xc;
import com.a.a.d.xe;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class fu
extends an
implements ga {
    final vi a;
    final cm b;

    fu(vi vi2, cm cm2) {
        this.a = (vi)cl.a(vi2);
        this.b = (cm)cl.a(cm2);
    }

    @Override
    public vi a() {
        return this.a;
    }

    @Override
    public cm b() {
        return sz.a(this.b);
    }

    @Override
    public int g() {
        int n2 = 0;
        for (Collection collection : this.c().values()) {
            n2 += collection.size();
        }
        return n2;
    }

    @Override
    public boolean f(Object object) {
        if (this.a.f(object)) {
            Object object2 = object;
            return this.b.a(object2);
        }
        return false;
    }

    @Override
    public Collection d(Object object) {
        return this.f(object) ? this.a.d(object) : this.f();
    }

    Collection f() {
        if (this.a instanceof aac) {
            return lo.j();
        }
        return jl.d();
    }

    @Override
    public void h() {
        this.q().clear();
    }

    @Override
    Set i() {
        return aad.a(this.a.q(), this.b);
    }

    @Override
    public Collection c(Object object) {
        if (this.b.a(object)) {
            return this.a.c(object);
        }
        if (this.a instanceof aac) {
            return new fw(object);
        }
        return new fv(object);
    }

    @Override
    Iterator m() {
        throw new AssertionError((Object)"should never be called");
    }

    @Override
    Collection p() {
        return new fx(this);
    }

    @Override
    Collection t() {
        return new gb(this);
    }

    @Override
    Map n() {
        return sz.a(this.a.c(), this.b);
    }

    @Override
    xc s() {
        return xe.a(this.a.r(), this.b);
    }
}

