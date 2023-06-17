/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aad;
import com.a.a.d.hk;
import com.a.a.d.sz;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

class uz
extends hk
implements Serializable,
NavigableMap {
    private final NavigableMap a;
    private transient uz b;

    uz(NavigableMap navigableMap) {
        this.a = navigableMap;
    }

    uz(NavigableMap navigableMap, uz uz2) {
        this.a = navigableMap;
        this.b = uz2;
    }

    @Override
    protected SortedMap o() {
        return Collections.unmodifiableSortedMap(this.a);
    }

    public Map.Entry lowerEntry(Object object) {
        return sz.d(this.a.lowerEntry(object));
    }

    public Object lowerKey(Object object) {
        return this.a.lowerKey(object);
    }

    public Map.Entry floorEntry(Object object) {
        return sz.d(this.a.floorEntry(object));
    }

    public Object floorKey(Object object) {
        return this.a.floorKey(object);
    }

    public Map.Entry ceilingEntry(Object object) {
        return sz.d(this.a.ceilingEntry(object));
    }

    public Object ceilingKey(Object object) {
        return this.a.ceilingKey(object);
    }

    public Map.Entry higherEntry(Object object) {
        return sz.d(this.a.higherEntry(object));
    }

    public Object higherKey(Object object) {
        return this.a.higherKey(object);
    }

    public Map.Entry firstEntry() {
        return sz.d(this.a.firstEntry());
    }

    public Map.Entry lastEntry() {
        return sz.d(this.a.lastEntry());
    }

    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public NavigableMap descendingMap() {
        uz uz2 = this.b;
        return uz2 == null ? (this.b = new uz(this.a.descendingMap(), this)) : uz2;
    }

    @Override
    public Set keySet() {
        return this.navigableKeySet();
    }

    public NavigableSet navigableKeySet() {
        return aad.a(this.a.navigableKeySet());
    }

    public NavigableSet descendingKeySet() {
        return aad.a(this.a.descendingKeySet());
    }

    @Override
    public SortedMap subMap(Object object, Object object2) {
        return this.subMap(object, true, object2, false);
    }

    @Override
    public SortedMap headMap(Object object) {
        return this.headMap(object, false);
    }

    @Override
    public SortedMap tailMap(Object object) {
        return this.tailMap(object, true);
    }

    public NavigableMap subMap(Object object, boolean bl2, Object object2, boolean bl3) {
        return sz.a(this.a.subMap(object, bl2, object2, bl3));
    }

    public NavigableMap headMap(Object object, boolean bl2) {
        return sz.a(this.a.headMap(object, bl2));
    }

    public NavigableMap tailMap(Object object, boolean bl2) {
        return sz.a(this.a.tailMap(object, bl2));
    }

    @Override
    protected /* synthetic */ Map a() {
        return this.o();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.o();
    }
}

