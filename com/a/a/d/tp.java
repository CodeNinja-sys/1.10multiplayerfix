/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gs;
import com.a.a.d.tq;
import com.a.a.d.un;
import com.a.a.d.vb;
import com.a.a.d.yd;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

abstract class tp
extends gs
implements NavigableMap {
    private transient Comparator a;
    private transient Set b;
    private transient NavigableSet c;

    tp() {
    }

    abstract NavigableMap b();

    @Override
    protected final Map a() {
        return this.b();
    }

    @Override
    public Comparator comparator() {
        Comparator comparator = this.a;
        if (comparator == null) {
            yd yd2 = this.b().comparator();
            if (yd2 == null) {
                yd2 = yd.d();
            }
            comparator = this.a = tp.a(yd2);
        }
        return comparator;
    }

    private static yd a(Comparator comparator) {
        return yd.a(comparator).a();
    }

    @Override
    public Object firstKey() {
        return this.b().lastKey();
    }

    @Override
    public Object lastKey() {
        return this.b().firstKey();
    }

    public Map.Entry lowerEntry(Object object) {
        return this.b().higherEntry(object);
    }

    public Object lowerKey(Object object) {
        return this.b().higherKey(object);
    }

    public Map.Entry floorEntry(Object object) {
        return this.b().ceilingEntry(object);
    }

    public Object floorKey(Object object) {
        return this.b().ceilingKey(object);
    }

    public Map.Entry ceilingEntry(Object object) {
        return this.b().floorEntry(object);
    }

    public Object ceilingKey(Object object) {
        return this.b().floorKey(object);
    }

    public Map.Entry higherEntry(Object object) {
        return this.b().lowerEntry(object);
    }

    public Object higherKey(Object object) {
        return this.b().lowerKey(object);
    }

    public Map.Entry firstEntry() {
        return this.b().lastEntry();
    }

    public Map.Entry lastEntry() {
        return this.b().firstEntry();
    }

    public Map.Entry pollFirstEntry() {
        return this.b().pollLastEntry();
    }

    public Map.Entry pollLastEntry() {
        return this.b().pollFirstEntry();
    }

    public NavigableMap descendingMap() {
        return this.b();
    }

    @Override
    public Set entrySet() {
        Set set = this.b;
        return set == null ? (this.b = this.d()) : set;
    }

    abstract Iterator c();

    Set d() {
        return new tq(this);
    }

    @Override
    public Set keySet() {
        return this.navigableKeySet();
    }

    public NavigableSet navigableKeySet() {
        NavigableSet navigableSet = this.c;
        return navigableSet == null ? (this.c = new un(this)) : navigableSet;
    }

    public NavigableSet descendingKeySet() {
        return this.b().navigableKeySet();
    }

    public NavigableMap subMap(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.b().subMap(object2, bl3, object, bl2).descendingMap();
    }

    public NavigableMap headMap(Object object, boolean bl2) {
        return this.b().tailMap(object, bl2).descendingMap();
    }

    public NavigableMap tailMap(Object object, boolean bl2) {
        return this.b().headMap(object, bl2).descendingMap();
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

    @Override
    public Collection values() {
        return new vb(this);
    }

    @Override
    public String toString() {
        return this.j();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

