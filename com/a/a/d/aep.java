/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.acm;
import com.a.a.d.ael;
import com.a.a.d.up;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

class aep
extends acm
implements SortedMap {
    final Object d;
    final Object e;
    transient SortedMap f;
    final /* synthetic */ ael g;

    aep(ael ael2, Object object) {
        this(ael2, object, null, null);
    }

    aep(ael ael2, Object object, Object object2, Object object3) {
        this.g = ael2;
        super(ael2, object);
        this.d = object2;
        this.e = object3;
        cl.a(object2 == null || object3 == null || this.a(object2, object3) <= 0);
    }

    public SortedSet f() {
        return new up(this);
    }

    public Comparator comparator() {
        return this.g.s();
    }

    int a(Object object, Object object2) {
        Comparator comparator = this.comparator();
        return comparator.compare(object, object2);
    }

    boolean a(Object object) {
        return !(object == null || this.d != null && this.a(this.d, object) > 0 || this.e != null && this.a(this.e, object) <= 0);
    }

    public SortedMap subMap(Object object, Object object2) {
        cl.a(this.a(cl.a(object)) && this.a(cl.a(object2)));
        return new aep(this.g, this.a, object, object2);
    }

    public SortedMap headMap(Object object) {
        cl.a(this.a(cl.a(object)));
        return new aep(this.g, this.a, this.d, object);
    }

    public SortedMap tailMap(Object object) {
        cl.a(this.a(cl.a(object)));
        return new aep(this.g, this.a, object, this.e);
    }

    public Object firstKey() {
        SortedMap sortedMap = this.i();
        if (sortedMap == null) {
            throw new NoSuchElementException();
        }
        return this.i().firstKey();
    }

    public Object lastKey() {
        SortedMap sortedMap = this.i();
        if (sortedMap == null) {
            throw new NoSuchElementException();
        }
        return this.i().lastKey();
    }

    SortedMap g() {
        if (this.f == null || this.f.isEmpty() && this.g.a.containsKey(this.a)) {
            this.f = (SortedMap)this.g.a.get(this.a);
        }
        return this.f;
    }

    SortedMap i() {
        return (SortedMap)super.c();
    }

    SortedMap j() {
        SortedMap sortedMap = this.g();
        if (sortedMap != null) {
            if (this.d != null) {
                sortedMap = sortedMap.tailMap(this.d);
            }
            if (this.e != null) {
                sortedMap = sortedMap.headMap(this.e);
            }
            return sortedMap;
        }
        return null;
    }

    @Override
    void e() {
        if (this.g() != null && this.f.isEmpty()) {
            this.g.a.remove(this.a);
            this.f = null;
            this.b = null;
        }
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a(object) && super.containsKey(object);
    }

    @Override
    public Object put(Object object, Object object2) {
        cl.a(this.a(cl.a(object)));
        return super.put(object, object2);
    }

    @Override
    /* synthetic */ Map d() {
        return this.j();
    }

    @Override
    /* synthetic */ Map c() {
        return this.i();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.f();
    }
}

