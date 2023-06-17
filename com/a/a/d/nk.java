/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agj;
import java.util.NoSuchElementException;

final class nk
extends agj {
    nk() {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    public Object previous() {
        throw new NoSuchElementException();
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return -1;
    }
}

