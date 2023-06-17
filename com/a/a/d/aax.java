/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.adw;
import com.a.a.d.iz;
import com.a.a.d.jt;
import com.a.a.d.lo;
import com.a.a.d.mi;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class aax
extends mi {
    final Object a;
    final Object b;
    final Object c;

    aax(Object object, Object object2, Object object3) {
        this.a = cl.a(object);
        this.b = cl.a(object2);
        this.c = cl.a(object3);
    }

    aax(adw adw2) {
        this(adw2.a(), adw2.b(), adw2.c());
    }

    @Override
    public jt f(Object object) {
        cl.a(object);
        return this.b(object) ? jt.c(this.a, this.c) : jt.m();
    }

    @Override
    public jt k() {
        return jt.c(this.b, jt.c(this.a, this.c));
    }

    @Override
    public jt l() {
        return jt.c(this.a, jt.c(this.b, this.c));
    }

    @Override
    public int n() {
        return 1;
    }

    @Override
    lo s() {
        return lo.d(aax.c(this.a, this.b, this.c));
    }

    @Override
    iz v() {
        return lo.d(this.c);
    }

    @Override
    /* synthetic */ Collection aW_() {
        return this.v();
    }

    @Override
    /* synthetic */ Set f() {
        return this.s();
    }

    @Override
    public /* synthetic */ Map p() {
        return this.k();
    }

    @Override
    public /* synthetic */ Map r() {
        return this.l();
    }

    @Override
    public /* synthetic */ Map d(Object object) {
        return this.f(object);
    }
}

