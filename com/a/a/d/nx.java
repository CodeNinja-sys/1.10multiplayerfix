/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class nx
implements Iterator {
    private int c;
    final /* synthetic */ int a;
    final /* synthetic */ Iterator b;

    nx(int n2, Iterator iterator) {
        this.a = n2;
        this.b = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.c < this.a && this.b.hasNext();
    }

    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        ++this.c;
        return this.b.next();
    }

    @Override
    public void remove() {
        this.b.remove();
    }
}

