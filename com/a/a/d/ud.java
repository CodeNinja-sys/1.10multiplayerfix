/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.b.cm;
import com.a.a.d.av;
import com.a.a.d.mq;
import com.a.a.d.nj;
import com.a.a.d.sz;
import com.a.a.d.ty;
import com.a.a.d.ue;
import com.a.a.d.ui;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;

class ud
extends av {
    private final NavigableMap a;
    private final cm b;
    private final Map c;

    ud(NavigableMap navigableMap, cm cm2) {
        this.a = (NavigableMap)cl.a(navigableMap);
        this.b = cm2;
        this.c = new ty(navigableMap, cm2);
    }

    @Override
    public Comparator comparator() {
        return this.a.comparator();
    }

    @Override
    public NavigableSet navigableKeySet() {
        return new ue(this, this);
    }

    @Override
    public Collection values() {
        return new ui(this, this.a, this.b);
    }

    @Override
    Iterator a() {
        return nj.b(this.a.entrySet().iterator(), this.b);
    }

    @Override
    Iterator b() {
        return nj.b(this.a.descendingMap().entrySet().iterator(), this.b);
    }

    @Override
    public int size() {
        return this.c.size();
    }

    @Override
    public Object get(Object object) {
        return this.c.get(object);
    }

    @Override
    public boolean containsKey(Object object) {
        return this.c.containsKey(object);
    }

    @Override
    public Object put(Object object, Object object2) {
        return this.c.put(object, object2);
    }

    @Override
    public Object remove(Object object) {
        return this.c.remove(object);
    }

    @Override
    public void putAll(Map map) {
        this.c.putAll(map);
    }

    @Override
    public void clear() {
        this.c.clear();
    }

    @Override
    public Set entrySet() {
        return this.c.entrySet();
    }

    @Override
    public Map.Entry pollFirstEntry() {
        return (Map.Entry)mq.b(this.a.entrySet(), this.b);
    }

    @Override
    public Map.Entry pollLastEntry() {
        return (Map.Entry)mq.b(this.a.descendingMap().entrySet(), this.b);
    }

    @Override
    public NavigableMap descendingMap() {
        return sz.c(this.a.descendingMap(), this.b);
    }

    public NavigableMap subMap(Object object, boolean bl2, Object object2, boolean bl3) {
        return sz.c(this.a.subMap(object, bl2, object2, bl3), this.b);
    }

    public NavigableMap headMap(Object object, boolean bl2) {
        return sz.c(this.a.headMap(object, bl2), this.b);
    }

    public NavigableMap tailMap(Object object, boolean bl2) {
        return sz.c(this.a.tailMap(object, bl2), this.b);
    }

    static /* synthetic */ cm a(ud ud2) {
        return ud2.b;
    }

    static /* synthetic */ NavigableMap b(ud ud2) {
        return ud2.a;
    }
}

