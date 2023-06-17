/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.d.an;
import com.a.a.d.cm;
import com.a.a.d.nj;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.d.tv;
import com.a.a.d.vi;
import com.a.a.d.ww;
import com.a.a.d.xc;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class wv
extends an {
    final vi a;
    final tv b;

    wv(vi vi2, tv tv2) {
        this.a = (vi)cl.a(vi2);
        this.b = (tv)cl.a(tv2);
    }

    Collection b(Object object, Collection collection) {
        bl bl2 = sz.a(this.b, object);
        if (collection instanceof List) {
            return ov.a((List)collection, bl2);
        }
        return cm.a(collection, bl2);
    }

    @Override
    Map n() {
        return sz.a(this.a.c(), (tv)new ww(this));
    }

    @Override
    public void h() {
        this.a.h();
    }

    @Override
    public boolean f(Object object) {
        return this.a.f(object);
    }

    @Override
    Iterator m() {
        return nj.a(this.a.l().iterator(), sz.b(this.b));
    }

    @Override
    public Collection c(Object object) {
        return this.b(object, this.a.c(object));
    }

    @Override
    public boolean o() {
        return this.a.o();
    }

    @Override
    public Set q() {
        return this.a.q();
    }

    @Override
    public xc r() {
        return this.a.r();
    }

    @Override
    public boolean a(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean c(Object object, Iterable iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(vi vi2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean c(Object object, Object object2) {
        return this.c(object).remove(object2);
    }

    @Override
    public Collection d(Object object) {
        return this.b(object, this.a.d(object));
    }

    @Override
    public Collection b(Object object, Iterable iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int g() {
        return this.a.g();
    }

    @Override
    Collection t() {
        return cm.a(this.a.l(), sz.a(this.b));
    }
}

