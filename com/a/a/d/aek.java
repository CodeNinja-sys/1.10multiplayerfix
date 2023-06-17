/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aej;
import com.a.a.d.nj;
import java.util.ListIterator;

abstract class aek
extends aej
implements ListIterator {
    aek(ListIterator listIterator) {
        super(listIterator);
    }

    private ListIterator a() {
        return nj.l(this.c);
    }

    @Override
    public final boolean hasPrevious() {
        return this.a().hasPrevious();
    }

    public final Object previous() {
        return this.a(this.a().previous());
    }

    @Override
    public final int nextIndex() {
        return this.a().nextIndex();
    }

    @Override
    public final int previousIndex() {
        return this.a().previousIndex();
    }

    public void set(Object object) {
        throw new UnsupportedOperationException();
    }

    public void add(Object object) {
        throw new UnsupportedOperationException();
    }
}

