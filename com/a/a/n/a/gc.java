/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.fs;

abstract class gc
extends fs {
    final int d;

    gc(int n2) {
        super(null);
        cl.a(n2 > 0, (Object)"Stripes must be positive");
        this.d = n2 > 0x40000000 ? -1 : fs.f(n2) - 1;
    }

    @Override
    final int b(Object object) {
        int n2 = fs.g(object.hashCode());
        return n2 & this.d;
    }

    @Override
    public final Object a(Object object) {
        return this.a(this.b(object));
    }
}

