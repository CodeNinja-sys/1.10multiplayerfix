/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;

class oy
extends AbstractList {
    final List a;

    oy(List list) {
        this.a = (List)cl.a(list);
    }

    @Override
    public void add(int n2, Object object) {
        this.a.add(n2, object);
    }

    @Override
    public boolean addAll(int n2, Collection collection) {
        return this.a.addAll(n2, collection);
    }

    @Override
    public Object get(int n2) {
        return this.a.get(n2);
    }

    @Override
    public Object remove(int n2) {
        return this.a.remove(n2);
    }

    @Override
    public Object set(int n2, Object object) {
        return this.a.set(n2, object);
    }

    @Override
    public boolean contains(Object object) {
        return this.a.contains(object);
    }

    @Override
    public int size() {
        return this.a.size();
    }
}

