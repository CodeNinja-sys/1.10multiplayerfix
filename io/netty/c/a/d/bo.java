/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.g;
import io.netty.c.a.d.bi;
import io.netty.c.a.d.bj;
import io.netty.c.a.d.bm;

public class bo
extends bi {
    private static final byte[] a = new byte[]{13, 10};

    @Override
    public boolean a(Object object) {
        return super.a(object) && !(object instanceof bj);
    }

    protected void a(g g2, bm bm2) {
        bm2.r().a(g2);
        g2.B(32);
        bm2.s().a(g2);
        g2.c(a);
    }
}

