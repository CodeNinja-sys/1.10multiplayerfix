/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.n;
import com.a.a.d.u;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

class aa
extends u
implements SortedSet {
    final /* synthetic */ n c;

    aa(n n2, SortedMap sortedMap) {
        this.c = n2;
        super(n2, sortedMap);
    }

    SortedMap b() {
        return (SortedMap)super.c();
    }

    public Comparator comparator() {
        return this.b().comparator();
    }

    public Object first() {
        return this.b().firstKey();
    }

    public SortedSet headSet(Object object) {
        return new aa(this.c, this.b().headMap(object));
    }

    public Object last() {
        return this.b().lastKey();
    }

    public SortedSet subSet(Object object, Object object2) {
        return new aa(this.c, this.b().subMap(object, object2));
    }

    public SortedSet tailSet(Object object) {
        return new aa(this.c, this.b().tailMap(object));
    }
}

