/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.pf;
import java.util.ListIterator;
import java.util.NoSuchElementException;

class pg
implements ListIterator {
    boolean a;
    final /* synthetic */ ListIterator b;
    final /* synthetic */ pf c;

    pg(pf pf2, ListIterator listIterator) {
        this.c = pf2;
        this.b = listIterator;
    }

    public void add(Object object) {
        this.b.add(object);
        this.b.previous();
        this.a = false;
    }

    @Override
    public boolean hasNext() {
        return this.b.hasPrevious();
    }

    @Override
    public boolean hasPrevious() {
        return this.b.hasNext();
    }

    @Override
    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.b.previous();
    }

    @Override
    public int nextIndex() {
        return pf.a(this.c, this.b.nextIndex());
    }

    public Object previous() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.b.next();
    }

    @Override
    public int previousIndex() {
        return this.nextIndex() - 1;
    }

    @Override
    public void remove() {
        cl.a(this.a);
        this.b.remove();
        this.a = false;
    }

    public void set(Object object) {
        com.a.a.b.cl.b(this.a);
        this.b.set(object);
    }
}

