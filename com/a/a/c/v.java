/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.cl;
import com.a.a.c.l;
import com.a.a.c.t;

class v
extends t {
    v() {
    }

    @Override
    protected void a(l l2, long l3) {
        cl.a(l2.c == null, "maximum weight was already set to ", new Object[]{l2.c});
        cl.a(l2.b == null, "maximum size was already set to ", new Object[]{l2.b});
        l2.c = l3;
    }
}

