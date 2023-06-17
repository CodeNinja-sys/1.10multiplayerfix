/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aa;
import com.a.a.d.n;
import com.a.a.d.q;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

class z
extends q
implements SortedMap {
    SortedSet d;
    final /* synthetic */ n e;

    z(n n2, SortedMap sortedMap) {
        this.e = n2;
        super(n2, sortedMap);
    }

    SortedMap g() {
        return (SortedMap)this.a;
    }

    public Comparator comparator() {
        return this.g().comparator();
    }

    public Object firstKey() {
        return this.g().firstKey();
    }

    public Object lastKey() {
        return this.g().lastKey();
    }

    public SortedMap headMap(Object object) {
        return new z(this.e, this.g().headMap(object));
    }

    public SortedMap subMap(Object object, Object object2) {
        return new z(this.e, this.g().subMap(object, object2));
    }

    public SortedMap tailMap(Object object) {
        return new z(this.e, this.g().tailMap(object));
    }

    public SortedSet f() {
        SortedSet sortedSet = this.d;
        return sortedSet == null ? (this.d = this.e()) : sortedSet;
    }

    SortedSet e() {
        return new aa(this.e, this.g());
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.f();
    }

    @Override
    /* synthetic */ Set h() {
        return this.e();
    }
}

