/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.uk;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

class up
extends uk
implements SortedSet {
    up(SortedMap sortedMap) {
        super(sortedMap);
    }

    SortedMap b() {
        return (SortedMap)super.c();
    }

    public Comparator comparator() {
        return this.b().comparator();
    }

    public SortedSet subSet(Object object, Object object2) {
        return new up(this.b().subMap(object, object2));
    }

    public SortedSet headSet(Object object) {
        return new up(this.b().headMap(object));
    }

    public SortedSet tailSet(Object object) {
        return new up(this.b().tailMap(object));
    }

    public Object first() {
        return this.b().firstKey();
    }

    public Object last() {
        return this.b().lastKey();
    }

    @Override
    /* synthetic */ Map c() {
        return this.b();
    }
}

