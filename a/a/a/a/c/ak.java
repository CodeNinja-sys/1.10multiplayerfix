/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.h;
import java.util.NoSuchElementException;

class ak
extends h {
    private final Object a;
    private int b;

    public ak(Object object) {
        this.a = object;
    }

    @Override
    public boolean hasNext() {
        return this.b == 0;
    }

    @Override
    public boolean hasPrevious() {
        return this.b == 1;
    }

    @Override
    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = 1;
        return this.a;
    }

    @Override
    public Object previous() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.b = 0;
        return this.a;
    }

    @Override
    public int nextIndex() {
        return this.b;
    }

    @Override
    public int previousIndex() {
        return this.b - 1;
    }
}

