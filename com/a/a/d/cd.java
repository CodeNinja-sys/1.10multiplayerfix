/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.bx;
import com.a.a.d.yi;
import java.util.ArrayDeque;
import java.util.Deque;

final class cd
extends agi
implements yi {
    private final Deque b = new ArrayDeque();
    final /* synthetic */ bx a;

    cd(bx bx2, Object object) {
        this.a = bx2;
        this.b.addLast(object);
    }

    @Override
    public boolean hasNext() {
        return !this.b.isEmpty();
    }

    @Override
    public Object next() {
        Object e2 = this.b.removeLast();
        bx.a(this.b, this.a.b(e2));
        bx.a(this.b, this.a.a(e2));
        return e2;
    }

    @Override
    public Object a() {
        return this.b.getLast();
    }
}

