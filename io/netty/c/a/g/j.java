/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.g;

import io.netty.b.g;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.bm;
import io.netty.c.a.d.w;
import io.netty.c.a.g.f;
import io.netty.util.e;

public class j
extends f {
    private static final byte[] a = new byte[]{13, 10};

    @Override
    public boolean a(Object object) {
        return object instanceof w;
    }

    protected void a(g g2, bm bm2) {
        ar.a((CharSequence)bm2.r().toString(), g2);
        g2.B(32);
        g2.c(String.valueOf(bm2.s().a()).getBytes(e.f));
        g2.B(32);
        j.a(String.valueOf(bm2.s().b()), g2);
        g2.c(a);
    }
}

