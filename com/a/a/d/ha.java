/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.hk;
import com.a.a.d.mq;
import com.a.a.d.nj;
import com.a.a.d.sz;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedMap;

public abstract class ha
extends hk
implements NavigableMap {
    protected ha() {
    }

    protected abstract NavigableMap b();

    public Map.Entry lowerEntry(Object object) {
        return this.b().lowerEntry(object);
    }

    protected Map.Entry a(Object object) {
        return this.headMap(object, false).lastEntry();
    }

    public Object lowerKey(Object object) {
        return this.b().lowerKey(object);
    }

    protected Object b(Object object) {
        return sz.b(this.lowerEntry(object));
    }

    public Map.Entry floorEntry(Object object) {
        return this.b().floorEntry(object);
    }

    protected Map.Entry g(Object object) {
        return this.headMap(object, true).lastEntry();
    }

    public Object floorKey(Object object) {
        return this.b().floorKey(object);
    }

    protected Object h(Object object) {
        return sz.b(this.floorEntry(object));
    }

    public Map.Entry ceilingEntry(Object object) {
        return this.b().ceilingEntry(object);
    }

    protected Map.Entry i(Object object) {
        return this.tailMap(object, true).firstEntry();
    }

    public Object ceilingKey(Object object) {
        return this.b().ceilingKey(object);
    }

    protected Object j(Object object) {
        return sz.b(this.ceilingEntry(object));
    }

    public Map.Entry higherEntry(Object object) {
        return this.b().higherEntry(object);
    }

    protected Map.Entry k(Object object) {
        return this.tailMap(object, false).firstEntry();
    }

    public Object higherKey(Object object) {
        return this.b().higherKey(object);
    }

    protected Object l(Object object) {
        return sz.b(this.higherEntry(object));
    }

    public Map.Entry firstEntry() {
        return this.b().firstEntry();
    }

    protected Map.Entry c() {
        return (Map.Entry)mq.d((Iterable)this.entrySet(), null);
    }

    protected Object d() {
        Map.Entry entry = this.firstEntry();
        if (entry == null) {
            throw new NoSuchElementException();
        }
        return entry.getKey();
    }

    public Map.Entry lastEntry() {
        return this.b().lastEntry();
    }

    protected Map.Entry e() {
        return (Map.Entry)mq.d(this.descendingMap().entrySet(), null);
    }

    protected Object k() {
        Map.Entry entry = this.lastEntry();
        if (entry == null) {
            throw new NoSuchElementException();
        }
        return entry.getKey();
    }

    public Map.Entry pollFirstEntry() {
        return this.b().pollFirstEntry();
    }

    protected Map.Entry l() {
        return (Map.Entry)nj.h(this.entrySet().iterator());
    }

    public Map.Entry pollLastEntry() {
        return this.b().pollLastEntry();
    }

    protected Map.Entry m() {
        return (Map.Entry)nj.h(this.descendingMap().entrySet().iterator());
    }

    public NavigableMap descendingMap() {
        return this.b().descendingMap();
    }

    public NavigableSet navigableKeySet() {
        return this.b().navigableKeySet();
    }

    public NavigableSet descendingKeySet() {
        return this.b().descendingKeySet();
    }

    protected NavigableSet n() {
        return this.descendingMap().navigableKeySet();
    }

    @Override
    protected SortedMap a(Object object, Object object2) {
        return this.subMap(object, true, object2, false);
    }

    public NavigableMap subMap(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.b().subMap(object, bl2, object2, bl3);
    }

    public NavigableMap headMap(Object object, boolean bl2) {
        return this.b().headMap(object, bl2);
    }

    public NavigableMap tailMap(Object object, boolean bl2) {
        return this.b().tailMap(object, bl2);
    }

    protected SortedMap m(Object object) {
        return this.headMap(object, false);
    }

    protected SortedMap n(Object object) {
        return this.tailMap(object, true);
    }

    @Override
    protected /* synthetic */ SortedMap o() {
        return this.b();
    }

    @Override
    protected /* synthetic */ Map a() {
        return this.b();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.b();
    }
}

