/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.d.adv;
import com.a.a.d.aec;
import com.a.a.d.aed;
import com.a.a.d.aee;
import com.a.a.d.bf;
import com.a.a.d.cm;
import com.a.a.d.nj;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class aeb
extends bf {
    final adv a;
    final bl b;

    aeb(adv adv2, bl bl2) {
        this.a = (adv)cl.a(adv2);
        this.b = (bl)cl.a(bl2);
    }

    @Override
    public boolean a(Object object, Object object2) {
        return this.a.a(object, object2);
    }

    @Override
    public Object b(Object object, Object object2) {
        return this.a(object, object2) ? this.b.a(this.a.b(object, object2)) : null;
    }

    @Override
    public int n() {
        return this.a.n();
    }

    @Override
    public void d() {
        this.a.d();
    }

    @Override
    public Object a(Object object, Object object2, Object object3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(adv adv2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object c(Object object, Object object2) {
        return this.a(object, object2) ? this.b.a(this.a.c(object, object2)) : null;
    }

    @Override
    public Map e(Object object) {
        return sz.a(this.a.e(object), this.b);
    }

    @Override
    public Map d(Object object) {
        return sz.a(this.a.d(object), this.b);
    }

    bl k() {
        return new aec(this);
    }

    @Override
    Iterator g() {
        return nj.a(this.a.e().iterator(), this.k());
    }

    @Override
    public Set a() {
        return this.a.a();
    }

    @Override
    public Set b() {
        return this.a.b();
    }

    @Override
    Collection aW_() {
        return cm.a(this.a.h(), this.b);
    }

    @Override
    public Map r() {
        aed aed2 = new aed(this);
        return sz.a(this.a.r(), (bl)aed2);
    }

    @Override
    public Map p() {
        aee aee2 = new aee(this);
        return sz.a(this.a.p(), (bl)aee2);
    }
}

