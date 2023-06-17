/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.b.g;
import io.netty.b.h;
import io.netty.c.a.k.bk;
import io.netty.c.a.k.bp;
import java.nio.ByteOrder;
import java.util.Set;

public class y {
    private final int a;

    public y(bp bp2) {
        if (bp2 == null) {
            throw new NullPointerException("spdyVersion");
        }
        this.a = bp2.a();
    }

    private void a(g g2, int n2, byte by2, int n3) {
        g2.C(this.a | 0x8000);
        g2.C(n2);
        g2.B(by2);
        g2.D(n3);
    }

    public g a(h h2, int n2, boolean bl2, g g2) {
        int n3 = bl2 ? 1 : 0;
        int n4 = g2.r();
        g g3 = h2.b(8 + n4).a(ByteOrder.BIG_ENDIAN);
        g3.E(n2 & Integer.MAX_VALUE);
        g3.B(n3);
        g3.D(n4);
        g3.b(g2, g2.p(), n4);
        return g3;
    }

    public g a(h h2, int n2, int n3, byte by2, boolean bl2, boolean bl3, g g2) {
        byte by3;
        int n4 = g2.r();
        byte by4 = by3 = bl2 ? (byte)1 : 0;
        if (bl3) {
            by3 = (byte)(by3 | 2);
        }
        int n5 = 10 + n4;
        g g3 = h2.b(8 + n5).a(ByteOrder.BIG_ENDIAN);
        this.a(g3, 1, by3, n5);
        g3.E(n2);
        g3.E(n3);
        g3.C((by2 & 0xFF) << 13);
        g3.b(g2, g2.p(), n4);
        return g3;
    }

    public g b(h h2, int n2, boolean bl2, g g2) {
        int n3 = g2.r();
        byte by2 = bl2 ? (byte)1 : 0;
        int n4 = 4 + n3;
        g g3 = h2.b(8 + n4).a(ByteOrder.BIG_ENDIAN);
        this.a(g3, 2, by2, n4);
        g3.E(n2);
        g3.b(g2, g2.p(), n3);
        return g3;
    }

    public g a(h h2, int n2, int n3) {
        byte by2 = 0;
        int n4 = 8;
        g g2 = h2.b(8 + n4).a(ByteOrder.BIG_ENDIAN);
        this.a(g2, 3, by2, n4);
        g2.E(n2);
        g2.E(n3);
        return g2;
    }

    public g a(h h2, bk bk2) {
        Set set = bk2.a();
        int n2 = set.size();
        byte by2 = bk2.b() ? (byte)1 : 0;
        int n3 = 4 + 8 * n2;
        g g2 = h2.b(8 + n3).a(ByteOrder.BIG_ENDIAN);
        this.a(g2, 4, by2, n3);
        g2.E(n2);
        for (Integer n4 : set) {
            by2 = 0;
            if (bk2.d(n4)) {
                by2 = (byte)(by2 | 1);
            }
            if (bk2.e(n4)) {
                by2 = (byte)(by2 | 2);
            }
            g2.B(by2);
            g2.D(n4);
            g2.E(bk2.b(n4));
        }
        return g2;
    }

    public g a(h h2, int n2) {
        byte by2 = 0;
        int n3 = 4;
        g g2 = h2.b(8 + n3).a(ByteOrder.BIG_ENDIAN);
        this.a(g2, 6, by2, n3);
        g2.E(n2);
        return g2;
    }

    public g b(h h2, int n2, int n3) {
        byte by2 = 0;
        int n4 = 8;
        g g2 = h2.b(8 + n4).a(ByteOrder.BIG_ENDIAN);
        this.a(g2, 7, by2, n4);
        g2.E(n2);
        g2.E(n3);
        return g2;
    }

    public g c(h h2, int n2, boolean bl2, g g2) {
        int n3 = g2.r();
        byte by2 = bl2 ? (byte)1 : 0;
        int n4 = 4 + n3;
        g g3 = h2.b(8 + n4).a(ByteOrder.BIG_ENDIAN);
        this.a(g3, 8, by2, n4);
        g3.E(n2);
        g3.b(g2, g2.p(), n3);
        return g3;
    }

    public g c(h h2, int n2, int n3) {
        byte by2 = 0;
        int n4 = 8;
        g g2 = h2.b(8 + n4).a(ByteOrder.BIG_ENDIAN);
        this.a(g2, 9, by2, n4);
        g2.E(n2);
        g2.E(n3);
        return g2;
    }
}

