/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aga;
import com.a.a.d.agg;
import com.a.a.d.j;
import java.util.ArrayDeque;

final class agf
extends j {
    private final ArrayDeque b = new ArrayDeque();
    final /* synthetic */ aga a;

    agf(aga aga2, Object object) {
        this.a = aga2;
        this.b.addLast(this.a(object));
    }

    @Override
    protected Object a() {
        while (!this.b.isEmpty()) {
            agg agg2 = (agg)this.b.getLast();
            if (agg2.b.hasNext()) {
                Object e2 = agg2.b.next();
                this.b.addLast(this.a(e2));
                continue;
            }
            this.b.removeLast();
            return agg2.a;
        }
        return this.b();
    }

    private agg a(Object object) {
        return new agg(object, this.a.c(object).iterator());
    }
}

