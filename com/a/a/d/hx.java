/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.dx;
import com.a.a.d.sz;
import java.io.Serializable;
import java.util.Map;

class hx
implements dx,
Serializable {
    final int a;
    private static final long b = 0L;

    hx(int n2) {
        this.a = n2;
    }

    public Map b() {
        return sz.a(this.a);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

