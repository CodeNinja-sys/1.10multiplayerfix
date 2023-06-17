/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.sz;
import com.a.a.d.up;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

class un
extends up
implements NavigableSet {
    un(NavigableMap navigableMap) {
        super(navigableMap);
    }

    NavigableMap a() {
        return (NavigableMap)this.d;
    }

    public Object lower(Object object) {
        return this.a().lowerKey(object);
    }

    public Object floor(Object object) {
        return this.a().floorKey(object);
    }

    public Object ceiling(Object object) {
        return this.a().ceilingKey(object);
    }

    public Object higher(Object object) {
        return this.a().higherKey(object);
    }

    public Object pollFirst() {
        return sz.b(this.a().pollFirstEntry());
    }

    public Object pollLast() {
        return sz.b(this.a().pollLastEntry());
    }

    public NavigableSet descendingSet() {
        return this.a().descendingKeySet();
    }

    public Iterator descendingIterator() {
        return this.descendingSet().iterator();
    }

    public NavigableSet subSet(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.a().subMap(object, bl2, object2, bl3).navigableKeySet();
    }

    public NavigableSet headSet(Object object, boolean bl2) {
        return this.a().headMap(object, bl2).navigableKeySet();
    }

    public NavigableSet tailSet(Object object, boolean bl2) {
        return this.a().tailMap(object, bl2).navigableKeySet();
    }

    @Override
    public SortedSet subSet(Object object, Object object2) {
        return this.subSet(object, true, object2, false);
    }

    @Override
    public SortedSet headSet(Object object) {
        return this.headSet(object, false);
    }

    @Override
    public SortedSet tailSet(Object object) {
        return this.tailSet(object, true);
    }

    @Override
    /* synthetic */ SortedMap b() {
        return this.a();
    }

    @Override
    /* synthetic */ Map c() {
        return this.a();
    }
}

