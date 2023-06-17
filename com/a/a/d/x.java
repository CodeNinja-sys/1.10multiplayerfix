/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aa;
import com.a.a.d.n;
import com.a.a.d.nj;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

class x
extends aa
implements NavigableSet {
    final /* synthetic */ n b;

    x(n n2, NavigableMap navigableMap) {
        this.b = n2;
        super(n2, navigableMap);
    }

    NavigableMap a() {
        return (NavigableMap)super.b();
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
        return nj.h(this.iterator());
    }

    public Object pollLast() {
        return nj.h(this.descendingIterator());
    }

    public NavigableSet descendingSet() {
        return new x(this.b, this.a().descendingMap());
    }

    public Iterator descendingIterator() {
        return this.descendingSet().iterator();
    }

    public NavigableSet a(Object object) {
        return this.headSet(object, false);
    }

    public NavigableSet headSet(Object object, boolean bl2) {
        return new x(this.b, this.a().headMap(object, bl2));
    }

    public NavigableSet a(Object object, Object object2) {
        return this.subSet(object, true, object2, false);
    }

    public NavigableSet subSet(Object object, boolean bl2, Object object2, boolean bl3) {
        return new x(this.b, this.a().subMap(object, bl2, object2, bl3));
    }

    public NavigableSet b(Object object) {
        return this.tailSet(object, true);
    }

    public NavigableSet tailSet(Object object, boolean bl2) {
        return new x(this.b, this.a().tailMap(object, bl2));
    }

    @Override
    public /* synthetic */ SortedSet tailSet(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ SortedSet subSet(Object object, Object object2) {
        return this.a(object, object2);
    }

    @Override
    public /* synthetic */ SortedSet headSet(Object object) {
        return this.a(object);
    }

    @Override
    /* synthetic */ SortedMap b() {
        return this.a();
    }
}

