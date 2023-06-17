/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.d.ty;
import com.a.a.d.ug;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

class uf
extends ty
implements SortedMap {
    uf(SortedMap sortedMap, cm cm2) {
        super(sortedMap, cm2);
    }

    SortedMap c() {
        return (SortedMap)this.a;
    }

    public SortedSet d() {
        return (SortedSet)super.keySet();
    }

    SortedSet e() {
        return new ug(this);
    }

    public Comparator comparator() {
        return this.c().comparator();
    }

    public Object firstKey() {
        return this.d().iterator().next();
    }

    public Object lastKey() {
        SortedMap sortedMap = this.c();
        Object k2;
        while (!this.b(k2 = sortedMap.lastKey(), this.a.get(k2))) {
            sortedMap = this.c().headMap(k2);
        }
        return k2;
    }

    public SortedMap headMap(Object object) {
        return new uf(this.c().headMap(object), this.b);
    }

    public SortedMap subMap(Object object, Object object2) {
        return new uf(this.c().subMap(object, object2), this.b);
    }

    public SortedMap tailMap(Object object) {
        return new uf(this.c().tailMap(object), this.b);
    }

    @Override
    /* synthetic */ Set h() {
        return this.e();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.d();
    }
}

