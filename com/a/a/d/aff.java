/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.am;
import com.a.a.d.dw;
import com.a.a.d.yl;

final class aff
extends am {
    private final yl a;
    private final Object b;

    aff(dw dw2, dw dw3, Object object) {
        this(yl.a(dw2, dw3), object);
    }

    aff(yl yl2, Object object) {
        this.a = yl2;
        this.b = object;
    }

    public yl a() {
        return this.a;
    }

    @Override
    public Object getValue() {
        return this.b;
    }

    public boolean a(Comparable comparable) {
        return this.a.f(comparable);
    }

    dw b() {
        return this.a.b;
    }

    dw c() {
        return this.a.c;
    }

    @Override
    public /* synthetic */ Object getKey() {
        return this.a();
    }
}

