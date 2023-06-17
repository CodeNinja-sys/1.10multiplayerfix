/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import java.util.Iterator;

final class nl
extends agi {
    final /* synthetic */ Iterator a;

    nl(Iterator iterator) {
        this.a = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Object next() {
        Object e2 = this.a.next();
        this.a.remove();
        return e2;
    }

    public String toString() {
        return "Iterators.consumingIterator(...)";
    }
}

