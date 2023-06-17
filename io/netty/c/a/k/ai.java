/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.k.ag;
import io.netty.c.a.k.am;
import io.netty.c.a.k.bp;
import io.netty.c.a.k.p;
import java.util.zip.Deflater;

class ai
extends ag {
    private final Deflater a;
    private boolean b;

    ai(bp bp2, int n2) {
        super(bp2);
        if (n2 < 0 || n2 > 9) {
            throw new IllegalArgumentException("compressionLevel: " + n2 + " (expected: 0-9)");
        }
        this.a = new Deflater(n2);
        this.a.setDictionary(p.y);
    }

    private int a(g g2) {
        int n2 = g2.r();
        if (g2.W()) {
            this.a.setInput(g2.X(), g2.Y() + g2.p(), n2);
        } else {
            byte[] arrby = new byte[n2];
            g2.a(g2.p(), arrby);
            this.a.setInput(arrby, 0, arrby.length);
        }
        return n2;
    }

    private void b(g g2) {
        while (this.c(g2)) {
            g2.k(g2.j() << 1);
        }
    }

    private boolean c(g g2) {
        byte[] arrby = g2.X();
        int n2 = g2.Y() + g2.q();
        int n3 = g2.s();
        int n4 = this.a.deflate(arrby, n2, n3, 2);
        g2.h(g2.q() + n4);
        return n4 == n3;
    }

    @Override
    public g a(am am2) {
        if (am2 == null) {
            throw new IllegalArgumentException("frame");
        }
        if (this.b) {
            return bi.c;
        }
        g g2 = super.a(am2);
        if (g2.r() == 0) {
            return bi.c;
        }
        g g3 = g2.l().c(g2.r());
        int n2 = this.a(g2);
        this.b(g3);
        g2.A(n2);
        return g3;
    }

    @Override
    public void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.end();
        super.a();
    }
}

