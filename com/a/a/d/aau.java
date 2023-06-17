/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.bw;
import com.a.a.d.cl;
import com.a.a.d.it;
import com.a.a.d.lo;
import com.a.a.d.sz;
import java.util.Map;

final class aau
extends it {
    final transient Object a;
    final transient Object b;
    transient it c;

    aau(Object object, Object object2) {
        cl.a(object, object2);
        this.a = object;
        this.b = object2;
    }

    private aau(Object object, Object object2, it it2) {
        this.a = object;
        this.b = object2;
        this.c = it2;
    }

    aau(Map.Entry entry) {
        this(entry.getKey(), entry.getValue());
    }

    @Override
    public Object get(Object object) {
        return this.a.equals(object) ? this.b : null;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.equals(object);
    }

    @Override
    public boolean containsValue(Object object) {
        return this.b.equals(object);
    }

    @Override
    boolean b() {
        return false;
    }

    @Override
    lo d() {
        return lo.d(sz.a(this.a, this.b));
    }

    @Override
    lo aV_() {
        return lo.d(this.a);
    }

    @Override
    public it a() {
        it it2 = this.c;
        if (it2 == null) {
            this.c = new aau(this.b, this.a, this);
            return this.c;
        }
        return it2;
    }

    @Override
    public /* synthetic */ bw aT_() {
        return this.a();
    }
}

