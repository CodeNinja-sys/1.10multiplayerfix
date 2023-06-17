/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.g;
import io.netty.b.l;
import io.netty.c.a.d.bd;
import io.netty.c.a.y;
import io.netty.util.c.a;

final class bf
implements l {
    private final a l;
    final /* synthetic */ bd k;

    bf(bd bd2, a a2) {
        this.k = bd2;
        this.l = a2;
    }

    public a a(g g2) {
        this.l.a();
        bd.a(this.k, 0);
        int n2 = g2.a(this);
        g2.g(n2 + 1);
        return this.l;
    }

    @Override
    public boolean a(byte by2) {
        char c2 = (char)by2;
        bd.a(this.k);
        if (c2 == '\r') {
            return true;
        }
        if (c2 == '\n') {
            return false;
        }
        if (bd.b(this.k) >= bd.c(this.k)) {
            throw new y("HTTP header is larger than " + bd.c(this.k) + " bytes.");
        }
        this.l.a(c2);
        return true;
    }
}

