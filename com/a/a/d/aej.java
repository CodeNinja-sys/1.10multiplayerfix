/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import java.util.Iterator;

abstract class aej
implements Iterator {
    final Iterator c;

    aej(Iterator iterator) {
        this.c = (Iterator)cl.a(iterator);
    }

    abstract Object a(Object var1);

    @Override
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    public final Object next() {
        return this.a(this.c.next());
    }

    @Override
    public final void remove() {
        this.c.remove();
    }
}

