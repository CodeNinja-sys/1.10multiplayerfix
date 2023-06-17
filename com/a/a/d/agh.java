/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aga;
import com.a.a.d.agi;
import com.a.a.d.nj;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

final class agh
extends agi {
    private final Deque b = new ArrayDeque();
    final /* synthetic */ aga a;

    agh(aga aga2, Object object) {
        this.a = aga2;
        this.b.addLast(nj.a(cl.a(object)));
    }

    @Override
    public boolean hasNext() {
        return !this.b.isEmpty();
    }

    public Object next() {
        Iterator iterator;
        Iterator iterator2 = (Iterator)this.b.getLast();
        Object object = cl.a(iterator2.next());
        if (!iterator2.hasNext()) {
            this.b.removeLast();
        }
        if ((iterator = this.a.c(object).iterator()).hasNext()) {
            this.b.addLast(iterator);
        }
        return object;
    }
}

