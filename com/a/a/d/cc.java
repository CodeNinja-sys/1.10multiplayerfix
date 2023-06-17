/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.bx;
import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.Deque;

final class cc
extends agi {
    private final Deque b = new ArrayDeque();
    private final BitSet c;
    final /* synthetic */ bx a;

    cc(bx bx2, Object object) {
        this.a = bx2;
        this.b.addLast(object);
        this.c = new BitSet();
    }

    @Override
    public boolean hasNext() {
        return !this.b.isEmpty();
    }

    public Object next() {
        while (true) {
            Object e2 = this.b.getLast();
            boolean bl2 = this.c.get(this.b.size() - 1);
            if (bl2) {
                this.b.removeLast();
                this.c.clear(this.b.size());
                return e2;
            }
            this.c.set(this.b.size() - 1);
            bx.a(this.b, this.a.b(e2));
            bx.a(this.b, this.a.a(e2));
        }
    }
}

