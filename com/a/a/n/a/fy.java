/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.b.dx;
import com.a.a.n.a.ft;
import com.a.a.n.a.gc;

class fy
extends gc {
    private final Object[] a;

    private fy(int n2, dx dx2) {
        super(n2);
        cl.a(n2 <= 0x40000000, (Object)"Stripes must be <= 2^30)");
        this.a = new Object[this.d + 1];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = dx2.a();
        }
    }

    @Override
    public Object a(int n2) {
        return this.a[n2];
    }

    @Override
    public int a() {
        return this.a.length;
    }

    /* synthetic */ fy(int n2, dx dx2, ft ft2) {
        this(n2, dx2);
    }
}

