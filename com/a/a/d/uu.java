/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.sz;
import com.a.a.d.tv;
import com.a.a.d.ur;
import java.util.Comparator;
import java.util.SortedMap;

class uu
extends ur
implements SortedMap {
    protected SortedMap d() {
        return (SortedMap)this.a;
    }

    uu(SortedMap sortedMap, tv tv2) {
        super(sortedMap, tv2);
    }

    public Comparator comparator() {
        return this.d().comparator();
    }

    public Object firstKey() {
        return this.d().firstKey();
    }

    public SortedMap headMap(Object object) {
        return sz.a(this.d().headMap(object), this.b);
    }

    public Object lastKey() {
        return this.d().lastKey();
    }

    public SortedMap subMap(Object object, Object object2) {
        return sz.a(this.d().subMap(object, object2), this.b);
    }

    public SortedMap tailMap(Object object) {
        return sz.a(this.d().tailMap(object), this.b);
    }
}

