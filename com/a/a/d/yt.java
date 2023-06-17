/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.az;
import com.a.a.d.ys;

class yt
extends az {
    final Comparable a;
    final /* synthetic */ ys b;

    yt(ys ys2, Comparable comparable) {
        this.b = ys2;
        super(comparable);
        this.a = this.b.g();
    }

    protected Comparable a(Comparable comparable) {
        return ys.c(comparable, this.a) ? null : this.b.a.a(comparable);
    }
}

