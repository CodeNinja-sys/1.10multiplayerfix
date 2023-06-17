/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.sz;
import com.a.a.d.tv;
import com.a.a.d.uu;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

class ut
extends uu
implements NavigableMap {
    ut(NavigableMap navigableMap, tv tv2) {
        super(navigableMap, tv2);
    }

    public Map.Entry ceilingEntry(Object object) {
        return this.a(this.c().ceilingEntry(object));
    }

    public Object ceilingKey(Object object) {
        return this.c().ceilingKey(object);
    }

    public NavigableSet descendingKeySet() {
        return this.c().descendingKeySet();
    }

    public NavigableMap descendingMap() {
        return sz.a(this.c().descendingMap(), this.b);
    }

    public Map.Entry firstEntry() {
        return this.a(this.c().firstEntry());
    }

    public Map.Entry floorEntry(Object object) {
        return this.a(this.c().floorEntry(object));
    }

    public Object floorKey(Object object) {
        return this.c().floorKey(object);
    }

    public NavigableMap a(Object object) {
        return this.headMap(object, false);
    }

    public NavigableMap headMap(Object object, boolean bl2) {
        return sz.a(this.c().headMap(object, bl2), this.b);
    }

    public Map.Entry higherEntry(Object object) {
        return this.a(this.c().higherEntry(object));
    }

    public Object higherKey(Object object) {
        return this.c().higherKey(object);
    }

    public Map.Entry lastEntry() {
        return this.a(this.c().lastEntry());
    }

    public Map.Entry lowerEntry(Object object) {
        return this.a(this.c().lowerEntry(object));
    }

    public Object lowerKey(Object object) {
        return this.c().lowerKey(object);
    }

    public NavigableSet navigableKeySet() {
        return this.c().navigableKeySet();
    }

    public Map.Entry pollFirstEntry() {
        return this.a(this.c().pollFirstEntry());
    }

    public Map.Entry pollLastEntry() {
        return this.a(this.c().pollLastEntry());
    }

    public NavigableMap subMap(Object object, boolean bl2, Object object2, boolean bl3) {
        return sz.a(this.c().subMap(object, bl2, object2, bl3), this.b);
    }

    public NavigableMap a(Object object, Object object2) {
        return this.subMap(object, true, object2, false);
    }

    public NavigableMap b(Object object) {
        return this.tailMap(object, true);
    }

    public NavigableMap tailMap(Object object, boolean bl2) {
        return sz.a(this.c().tailMap(object, bl2), this.b);
    }

    private Map.Entry a(Map.Entry entry) {
        return entry == null ? null : sz.a(this.b, entry);
    }

    protected NavigableMap c() {
        return (NavigableMap)super.d();
    }

    @Override
    public /* synthetic */ SortedMap tailMap(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ SortedMap subMap(Object object, Object object2) {
        return this.a(object, object2);
    }

    @Override
    public /* synthetic */ SortedMap headMap(Object object) {
        return this.a(object);
    }

    @Override
    protected /* synthetic */ SortedMap d() {
        return this.c();
    }
}

