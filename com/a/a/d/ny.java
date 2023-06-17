/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.nj;
import com.a.a.d.nz;
import com.a.a.d.yi;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

class ny
extends agi {
    final Queue a;

    public ny(Iterable iterable, Comparator comparator) {
        nz nz2 = new nz(this, comparator);
        this.a = new PriorityQueue(2, nz2);
        for (Iterator iterator : iterable) {
            if (!iterator.hasNext()) continue;
            this.a.add(nj.k(iterator));
        }
    }

    @Override
    public boolean hasNext() {
        return !this.a.isEmpty();
    }

    public Object next() {
        yi yi2 = (yi)this.a.remove();
        Object object = yi2.next();
        if (yi2.hasNext()) {
            this.a.add(yi2);
        }
        return object;
    }
}

