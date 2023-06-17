/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.bx;
import com.a.a.d.j;
import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.Deque;

final class cb
extends j {
    private final Deque b = new ArrayDeque();
    private final BitSet c = new BitSet();
    final /* synthetic */ bx a;

    cb(bx bx2, Object object) {
        this.a = bx2;
        this.b.addLast(object);
    }

    @Override
    protected Object a() {
        while (!this.b.isEmpty()) {
            Object e2 = this.b.getLast();
            if (this.c.get(this.b.size() - 1)) {
                this.b.removeLast();
                this.c.clear(this.b.size());
                bx.a(this.b, this.a.b(e2));
                return e2;
            }
            this.c.set(this.b.size() - 1);
            bx.a(this.b, this.a.a(e2));
        }
        return this.b();
    }
}

