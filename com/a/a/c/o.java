/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.cl;
import com.a.a.c.l;
import com.a.a.c.r;

class o
extends r {
    o() {
    }

    @Override
    protected void a(l l2, int n2) {
        cl.a(l2.d == null, "concurrency level was already set to ", new Object[]{l2.d});
        l2.d = n2;
    }
}

