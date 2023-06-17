/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.g;
import io.netty.b.l;
import io.netty.c.a.d.bd;
import io.netty.c.a.y;
import io.netty.util.c.a;

final class bg
implements l {
    private final a l;
    private int m;
    final /* synthetic */ bd k;

    bg(bd bd2, a a2) {
        this.k = bd2;
        this.l = a2;
    }

    public a a(g g2) {
        this.l.a();
        this.m = 0;
        int n2 = g2.a(this);
        g2.g(n2 + 1);
        return this.l;
    }

    @Override
    public boolean a(byte by2) {
        char c2 = (char)by2;
        if (c2 == '\r') {
            return true;
        }
        if (c2 == '\n') {
            return false;
        }
        if (this.m >= bd.d(this.k)) {
            throw new y("An HTTP line is larger than " + bd.d(this.k) + " bytes.");
        }
        ++this.m;
        this.l.a(c2);
        return true;
    }
}

