/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.d.pj;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

class pi
extends AbstractList
implements Serializable,
RandomAccess {
    final List a;
    final bl b;
    private static final long c = 0L;

    pi(List list, bl bl2) {
        this.a = (List)cl.a(list);
        this.b = (bl)cl.a(bl2);
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public Object get(int n2) {
        return this.b.a(this.a.get(n2));
    }

    @Override
    public Iterator iterator() {
        return this.listIterator();
    }

    @Override
    public ListIterator listIterator(int n2) {
        return new pj(this, this.a.listIterator(n2));
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public Object remove(int n2) {
        return this.b.a(this.a.remove(n2));
    }

    @Override
    public int size() {
        return this.a.size();
    }
}

