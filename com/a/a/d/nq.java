/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class nq
implements Iterator {
    nq() {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        cl.a(false);
    }
}

