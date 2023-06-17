/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.d.aax;
import com.a.a.d.abt;
import com.a.a.d.adv;
import com.a.a.d.adw;
import com.a.a.d.adx;
import com.a.a.d.agi;
import com.a.a.d.bf;
import com.a.a.d.iz;
import com.a.a.d.jl;
import com.a.a.d.jt;
import com.a.a.d.lo;
import com.a.a.d.lp;
import com.a.a.d.mj;
import com.a.a.d.mq;
import com.a.a.d.zr;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class mi
extends bf {
    private static final mi a = new abt(jl.d(), lo.j(), lo.j());

    public static mi m() {
        return a;
    }

    public static mi b(Object object, Object object2, Object object3) {
        return new aax(object, object2, object3);
    }

    public static mi b(adv adv2) {
        if (adv2 instanceof mi) {
            mi mi2 = (mi)adv2;
            return mi2;
        }
        int n2 = adv2.n();
        switch (n2) {
            case 0: {
                return mi.m();
            }
            case 1: {
                adw adw2 = (adw)mq.d(adv2.e());
                return mi.b(adw2.a(), adw2.b(), adw2.c());
            }
        }
        lp lp2 = lo.k();
        for (adw adw3 : adv2.e()) {
            lp2.c(mi.c(adw3.a(), adw3.b(), adw3.c()));
        }
        return zr.a(lp2.b());
    }

    public static mj o() {
        return new mj();
    }

    static adw c(Object object, Object object2, Object object3) {
        return adx.a(cl.a(object), cl.a(object2), cl.a(object3));
    }

    mi() {
    }

    public lo q() {
        return (lo)super.e();
    }

    abstract lo s();

    final agi t() {
        throw new AssertionError((Object)"should never be called");
    }

    public iz u() {
        return (iz)super.h();
    }

    abstract iz v();

    @Override
    final Iterator aX_() {
        throw new AssertionError((Object)"should never be called");
    }

    public jt f(Object object) {
        cl.a(object);
        return (jt)cc.b((jt)this.k().get(object), jt.m());
    }

    public lo w() {
        return this.k().g();
    }

    public abstract jt k();

    public jt g(Object object) {
        cl.a(object);
        return (jt)cc.b((jt)this.l().get(object), jt.m());
    }

    public lo x() {
        return this.l().g();
    }

    public abstract jt l();

    @Override
    public boolean a(Object object, Object object2) {
        return this.b(object, object2) != null;
    }

    @Override
    public boolean c(Object object) {
        return this.u().contains(object);
    }

    @Override
    public final void d() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object a(Object object, Object object2, Object object3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void a(adv adv2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object c(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    @Override
    /* synthetic */ Collection aW_() {
        return this.v();
    }

    @Override
    public /* synthetic */ Collection h() {
        return this.u();
    }

    @Override
    /* synthetic */ Iterator g() {
        return this.t();
    }

    @Override
    /* synthetic */ Set f() {
        return this.s();
    }

    @Override
    public /* synthetic */ Set e() {
        return this.q();
    }

    @Override
    public /* synthetic */ Set b() {
        return this.w();
    }

    @Override
    public /* synthetic */ Set a() {
        return this.x();
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

    @Override
    public /* synthetic */ Map e(Object object) {
        return this.g(object);
    }
}

