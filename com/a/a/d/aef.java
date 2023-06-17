/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.d.adv;
import com.a.a.d.adx;
import com.a.a.d.aeg;
import com.a.a.d.bf;
import com.a.a.d.nj;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class aef
extends bf {
    final adv a;
    private static final bl b = new aeg();

    aef(adv adv2) {
        this.a = (adv)cl.a(adv2);
    }

    @Override
    public void d() {
        this.a.d();
    }

    @Override
    public Map d(Object object) {
        return this.a.e(object);
    }

    @Override
    public Set b() {
        return this.a.a();
    }

    @Override
    public Map p() {
        return this.a.r();
    }

    @Override
    public boolean a(Object object, Object object2) {
        return this.a.a(object2, object);
    }

    @Override
    public boolean b(Object object) {
        return this.a.a(object);
    }

    @Override
    public boolean a(Object object) {
        return this.a.b(object);
    }

    @Override
    public boolean c(Object object) {
        return this.a.c(object);
    }

    @Override
    public Object b(Object object, Object object2) {
        return this.a.b(object2, object);
    }

    @Override
    public Object a(Object object, Object object2, Object object3) {
        return this.a.a(object2, object, object3);
    }

    @Override
    public void a(adv adv2) {
        this.a.a(adx.a(adv2));
    }

    @Override
    public Object c(Object object, Object object2) {
        return this.a.c(object2, object);
    }

    @Override
    public Map e(Object object) {
        return this.a.d(object);
    }

    @Override
    public Set a() {
        return this.a.b();
    }

    @Override
    public Map r() {
        return this.a.p();
    }

    @Override
    public int n() {
        return this.a.n();
    }

    @Override
    public Collection h() {
        return this.a.h();
    }

    @Override
    Iterator g() {
        return nj.a(this.a.e().iterator(), b);
    }
}

