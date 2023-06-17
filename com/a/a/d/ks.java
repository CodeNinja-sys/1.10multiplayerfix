/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.kk;
import com.a.a.d.ku;
import com.a.a.d.xd;
import com.a.a.d.xe;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class ks
extends ku {
    final /* synthetic */ kk a;

    ks(kk kk2) {
        this.a = kk2;
    }

    @Override
    public boolean contains(Object object) {
        return this.a.f(object);
    }

    @Override
    public int a(Object object) {
        Collection collection = (Collection)this.a.b.get(object);
        return collection == null ? 0 : collection.size();
    }

    @Override
    public Set d() {
        return this.a.x();
    }

    @Override
    public int size() {
        return this.a.g();
    }

    @Override
    xd a(int n2) {
        Map.Entry entry = (Map.Entry)this.a.b.e().h().get(n2);
        return xe.a(entry.getKey(), ((Collection)entry.getValue()).size());
    }

    @Override
    boolean a() {
        return true;
    }
}

