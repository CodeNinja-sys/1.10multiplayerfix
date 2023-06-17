/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.h;
import io.netty.util.c.l;
import java.util.Iterator;
import java.util.NoSuchElementException;

class i
implements Iterator {
    private l b;
    final /* synthetic */ h a;

    i(h h2) {
        this.a = h2;
        this.b = h.a(this.a);
    }

    @Override
    public boolean hasNext() {
        return this.b != null;
    }

    public Object next() {
        l l2 = this.b;
        if (l2 == null) {
            throw new NoSuchElementException();
        }
        Object object = l2.b();
        this.b = l2.j();
        return object;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

