/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.xo;
import java.io.Serializable;

final class xu
extends xo
implements Serializable {
    final Object a;
    final int b;
    private static final long c = 0L;

    xu(Object object, int n2) {
        this.a = object;
        this.b = n2;
        cl.a(n2, "count");
    }

    @Override
    public Object a() {
        return this.a;
    }

    @Override
    public int b() {
        return this.b;
    }
}

