/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import java.util.Iterator;

public final class z
implements Iterator {
    private final Iterator a;

    public z(Iterator iterator) {
        if (iterator == null) {
            throw new NullPointerException("iterator");
        }
        this.a = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Object next() {
        return this.a.next();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("read-only");
    }
}

