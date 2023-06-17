/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aga;
import com.a.a.d.agi;
import com.a.a.d.mq;
import com.a.a.d.yi;
import java.util.ArrayDeque;
import java.util.Queue;

final class age
extends agi
implements yi {
    private final Queue b = new ArrayDeque();
    final /* synthetic */ aga a;

    age(aga aga2, Object object) {
        this.a = aga2;
        this.b.add(object);
    }

    @Override
    public boolean hasNext() {
        return !this.b.isEmpty();
    }

    @Override
    public Object a() {
        return this.b.element();
    }

    @Override
    public Object next() {
        Object e2 = this.b.remove();
        mq.a(this.b, this.a.c(e2));
        return e2;
    }
}

