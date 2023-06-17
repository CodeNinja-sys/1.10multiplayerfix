/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aw;
import com.a.a.d.ax;
import com.a.a.d.nj;
import com.a.a.d.sz;
import com.a.a.d.un;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

abstract class av
extends AbstractMap
implements NavigableMap {
    av() {
    }

    @Override
    public abstract Object get(Object var1);

    public Map.Entry firstEntry() {
        return (Map.Entry)nj.d(this.a(), null);
    }

    public Map.Entry lastEntry() {
        return (Map.Entry)nj.d(this.b(), null);
    }

    public Map.Entry pollFirstEntry() {
        return (Map.Entry)nj.h(this.a());
    }

    public Map.Entry pollLastEntry() {
        return (Map.Entry)nj.h(this.b());
    }

    @Override
    public Object firstKey() {
        Map.Entry entry = this.firstEntry();
        if (entry == null) {
            throw new NoSuchElementException();
        }
        return entry.getKey();
    }

    @Override
    public Object lastKey() {
        Map.Entry entry = this.lastEntry();
        if (entry == null) {
            throw new NoSuchElementException();
        }
        return entry.getKey();
    }

    public Map.Entry lowerEntry(Object object) {
        return this.headMap(object, false).lastEntry();
    }

    public Map.Entry floorEntry(Object object) {
        return this.headMap(object, true).lastEntry();
    }

    public Map.Entry ceilingEntry(Object object) {
        return this.tailMap(object, true).firstEntry();
    }

    public Map.Entry higherEntry(Object object) {
        return this.tailMap(object, false).firstEntry();
    }

    public Object lowerKey(Object object) {
        return sz.b(this.lowerEntry(object));
    }

    public Object floorKey(Object object) {
        return sz.b(this.floorEntry(object));
    }

    public Object ceilingKey(Object object) {
        return sz.b(this.ceilingEntry(object));
    }

    public Object higherKey(Object object) {
        return sz.b(this.higherEntry(object));
    }

    abstract Iterator a();

    abstract Iterator b();

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

    public NavigableSet navigableKeySet() {
        return new un(this);
    }

    @Override
    public Set keySet() {
        return this.navigableKeySet();
    }

    @Override
    public abstract int size();

    @Override
    public Set entrySet() {
        return new aw(this);
    }

    public NavigableSet descendingKeySet() {
        return this.descendingMap().navigableKeySet();
    }

    public NavigableMap descendingMap() {
        return new ax(this, null);
    }
}

