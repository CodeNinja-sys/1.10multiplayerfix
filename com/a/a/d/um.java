/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.d.av;
import com.a.a.d.cm;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;

final class um
extends av {
    private final NavigableSet a;
    private final bl b;

    um(NavigableSet navigableSet, bl bl2) {
        this.a = (NavigableSet)cl.a(navigableSet);
        this.b = (bl)cl.a(bl2);
    }

    public NavigableMap subMap(Object object, boolean bl2, Object object2, boolean bl3) {
        return sz.a(this.a.subSet(object, bl2, object2, bl3), this.b);
    }

    public NavigableMap headMap(Object object, boolean bl2) {
        return sz.a(this.a.headSet(object, bl2), this.b);
    }

    public NavigableMap tailMap(Object object, boolean bl2) {
        return sz.a(this.a.tailSet(object, bl2), this.b);
    }

    @Override
    public Comparator comparator() {
        return this.a.comparator();
    }

    @Override
    public Object get(Object object) {
        if (cm.a((Collection)this.a, object)) {
            Object object2 = object;
            return this.b.a(object2);
        }
        return null;
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    Iterator a() {
        return sz.b((Set)this.a, this.b);
    }

    @Override
    Iterator b() {
        return this.descendingMap().entrySet().iterator();
    }

    @Override
    public NavigableSet navigableKeySet() {
        return sz.a(this.a);
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public NavigableMap descendingMap() {
        return sz.a(this.a.descendingSet(), this.b);
    }
}

