/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aac;
import com.a.a.d.an;
import com.a.a.d.sz;
import com.a.a.d.vi;
import com.a.a.d.wf;
import com.a.a.d.ws;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class wr
extends an
implements aac,
Serializable {
    final Map a;
    private static final long b = 7845222491160860175L;

    wr(Map map) {
        this.a = (Map)cl.a(map);
    }

    @Override
    public int g() {
        return this.a.size();
    }

    @Override
    public boolean f(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public boolean g(Object object) {
        return this.a.containsValue(object);
    }

    @Override
    public boolean b(Object object, Object object2) {
        return this.a.entrySet().contains(sz.a(object, object2));
    }

    @Override
    public Set a(Object object) {
        return new ws(this, object);
    }

    @Override
    public boolean a(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean c(Object object, Iterable iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(vi vi2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set a(Object object, Iterable iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean c(Object object, Object object2) {
        return this.a.entrySet().remove(sz.a(object, object2));
    }

    @Override
    public Set b(Object object) {
        HashSet hashSet = new HashSet(2);
        if (!this.a.containsKey(object)) {
            return hashSet;
        }
        hashSet.add(this.a.remove(object));
        return hashSet;
    }

    @Override
    public void h() {
        this.a.clear();
    }

    @Override
    public Set q() {
        return this.a.keySet();
    }

    @Override
    public Collection j() {
        return this.a.values();
    }

    @Override
    public Set u() {
        return this.a.entrySet();
    }

    @Override
    Iterator m() {
        return this.a.entrySet().iterator();
    }

    @Override
    Map n() {
        return new wf(this);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public /* synthetic */ Collection l() {
        return this.u();
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a(object, iterable);
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }
}

