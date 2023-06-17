/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.g;

import io.netty.b.g;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.bj;
import io.netty.c.a.d.v;
import io.netty.c.a.g.f;
import io.netty.util.e;

public class h
extends f {
    private static final byte[] a = new byte[]{13, 10};

    @Override
    public boolean a(Object object) {
        return object instanceof v;
    }

    protected void a(g g2, bj bj2) {
        ar.a((CharSequence)bj2.s().toString(), g2);
        g2.B(32);
        g2.c(bj2.t().getBytes(e.d));
        g2.B(32);
        h.a(bj2.r().toString(), g2);
        g2.c(a);
    }
}

