/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.d.sz;
import com.a.a.d.tm;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

class uo
extends tm
implements SortedMap {
    uo(SortedSet sortedSet, bl bl2) {
        super(sortedSet, bl2);
    }

    SortedSet d() {
        return (SortedSet)super.c();
    }

    public Comparator comparator() {
        return this.d().comparator();
    }

    @Override
    public Set keySet() {
        return sz.a(this.d());
    }

    public SortedMap subMap(Object object, Object object2) {
        return sz.a(this.d().subSet(object, object2), this.a);
    }

    public SortedMap headMap(Object object) {
        return sz.a(this.d().headSet(object), this.a);
    }

    public SortedMap tailMap(Object object) {
        return sz.a(this.d().tailSet(object), this.a);
    }

    public Object firstKey() {
        return this.d().first();
    }

    public Object lastKey() {
        return this.d().last();
    }

    @Override
    /* synthetic */ Set c() {
        return this.d();
    }
}

