/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.ov;
import com.a.a.d.pg;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class pf
extends AbstractList {
    private final List a;

    pf(List list) {
        this.a = (List)cl.a(list);
    }

    List a() {
        return this.a;
    }

    private int a(int n2) {
        int n3 = this.size();
        cl.a(n2, n3);
        return n3 - 1 - n2;
    }

    private int b(int n2) {
        int n3 = this.size();
        cl.b(n2, n3);
        return n3 - n2;
    }

    @Override
    public void add(int n2, Object object) {
        this.a.add(this.b(n2), object);
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public Object remove(int n2) {
        return this.a.remove(this.a(n2));
    }

    @Override
    protected void removeRange(int n2, int n3) {
        this.subList(n2, n3).clear();
    }

    @Override
    public Object set(int n2, Object object) {
        return this.a.set(this.a(n2), object);
    }

    @Override
    public Object get(int n2) {
        return this.a.get(this.a(n2));
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public List subList(int n2, int n3) {
        cl.a(n2, n3, this.size());
        return ov.b(this.a.subList(this.b(n3), this.b(n2)));
    }

    @Override
    public Iterator iterator() {
        return this.listIterator();
    }

    @Override
    public ListIterator listIterator(int n2) {
        int n3 = this.b(n2);
        ListIterator listIterator = this.a.listIterator(n3);
        return new pg(this, listIterator);
    }

    static /* synthetic */ int a(pf pf2, int n2) {
        return pf2.b(n2);
    }
}

