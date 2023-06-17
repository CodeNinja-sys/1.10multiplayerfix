/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.agj;
import java.util.NoSuchElementException;

abstract class i
extends agj {
    private final int a;
    private int b;

    protected abstract Object a(int var1);

    protected i(int n2) {
        this(n2, 0);
    }

    protected i(int n2, int n3) {
        cl.b(n3, n2);
        this.a = n2;
        this.b = n3;
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override
    public final Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return this.a(this.b++);
    }

    @Override
    public final int nextIndex() {
        return this.b;
    }

    @Override
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    public final Object previous() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.a(--this.b);
    }

    @Override
    public final int previousIndex() {
        return this.b - 1;
    }
}

