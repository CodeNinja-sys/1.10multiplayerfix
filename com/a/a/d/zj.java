/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.jt;
import com.a.a.d.ku;
import com.a.a.d.lo;
import com.a.a.d.xd;
import com.a.a.d.xe;
import java.util.Map;
import java.util.Set;

class zj
extends ku {
    private final transient jt a;
    private final transient int b;

    zj(jt jt2, int n2) {
        this.a = jt2;
        this.b = n2;
    }

    @Override
    boolean a() {
        return this.a.b();
    }

    @Override
    public int a(Object object) {
        Integer n2 = (Integer)this.a.get(object);
        return n2 == null ? 0 : n2;
    }

    @Override
    public int size() {
        return this.b;
    }

    @Override
    public boolean contains(Object object) {
        return this.a.containsKey(object);
    }

    public lo b() {
        return this.a.g();
    }

    @Override
    xd a(int n2) {
        Map.Entry entry = (Map.Entry)this.a.e().h().get(n2);
        return xe.a(entry.getKey(), (Integer)entry.getValue());
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public /* synthetic */ Set d() {
        return this.b();
    }
}

