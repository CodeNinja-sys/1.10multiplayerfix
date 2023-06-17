/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.n;
import com.a.a.d.sz;
import com.a.a.d.x;
import com.a.a.d.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

class w
extends z
implements NavigableMap {
    final /* synthetic */ n c;

    w(n n2, NavigableMap navigableMap) {
        this.c = n2;
        super(n2, navigableMap);
    }

    NavigableMap b() {
        return (NavigableMap)super.g();
    }

    public Map.Entry lowerEntry(Object object) {
        Map.Entry entry = this.b().lowerEntry(object);
        return entry == null ? null : this.a(entry);
    }

    public Object lowerKey(Object object) {
        return this.b().lowerKey(object);
    }

    public Map.Entry floorEntry(Object object) {
        Map.Entry entry = this.b().floorEntry(object);
        return entry == null ? null : this.a(entry);
    }

    public Object floorKey(Object object) {
        return this.b().floorKey(object);
    }

    public Map.Entry ceilingEntry(Object object) {
        Map.Entry entry = this.b().ceilingEntry(object);
        return entry == null ? null : this.a(entry);
    }

    public Object ceilingKey(Object object) {
        return this.b().ceilingKey(object);
    }

    public Map.Entry higherEntry(Object object) {
        Map.Entry entry = this.b().higherEntry(object);
        return entry == null ? null : this.a(entry);
    }

    public Object higherKey(Object object) {
        return this.b().higherKey(object);
    }

    public Map.Entry firstEntry() {
        Map.Entry entry = this.b().firstEntry();
        return entry == null ? null : this.a(entry);
    }

    public Map.Entry lastEntry() {
        Map.Entry entry = this.b().lastEntry();
        return entry == null ? null : this.a(entry);
    }

    public Map.Entry pollFirstEntry() {
        return this.a(this.entrySet().iterator());
    }

    public Map.Entry pollLastEntry() {
        return this.a(this.descendingMap().entrySet().iterator());
    }

    Map.Entry a(Iterator iterator) {
        if (!iterator.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry)iterator.next();
        Collection collection = this.c.d();
        collection.addAll((Collection)entry.getValue());
        iterator.remove();
        return sz.a(entry.getKey(), (Object)this.c.a(collection));
    }

    public NavigableMap descendingMap() {
        return new w(this.c, this.b().descendingMap());
    }

    public NavigableSet c() {
        return (NavigableSet)super.f();
    }

    NavigableSet d() {
        return new x(this.c, this.b());
    }

    public NavigableSet navigableKeySet() {
        return this.c();
    }

    public NavigableSet descendingKeySet() {
        return this.descendingMap().navigableKeySet();
    }

    public NavigableMap a(Object object, Object object2) {
        return this.subMap(object, true, object2, false);
    }

    public NavigableMap subMap(Object object, boolean bl2, Object object2, boolean bl3) {
        return new w(this.c, this.b().subMap(object, bl2, object2, bl3));
    }

    public NavigableMap c(Object object) {
        return this.headMap(object, false);
    }

    public NavigableMap headMap(Object object, boolean bl2) {
        return new w(this.c, this.b().headMap(object, bl2));
    }

    public NavigableMap d(Object object) {
        return this.tailMap(object, true);
    }

    public NavigableMap tailMap(Object object, boolean bl2) {
        return new w(this.c, this.b().tailMap(object, bl2));
    }

    @Override
    /* synthetic */ SortedSet e() {
        return this.d();
    }

    @Override
    public /* synthetic */ SortedSet f() {
        return this.c();
    }

    @Override
    public /* synthetic */ SortedMap tailMap(Object object) {
        return this.d(object);
    }

    @Override
    public /* synthetic */ SortedMap subMap(Object object, Object object2) {
        return this.a(object, object2);
    }

    @Override
    public /* synthetic */ SortedMap headMap(Object object) {
        return this.c(object);
    }

    @Override
    /* synthetic */ SortedMap g() {
        return this.b();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.c();
    }

    @Override
    /* synthetic */ Set h() {
        return this.d();
    }
}

