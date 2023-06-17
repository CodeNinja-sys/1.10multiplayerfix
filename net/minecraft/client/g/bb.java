/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.u.ad;

enum bb {
    a(0, 1, 2, 3),
    b(2, 3, 0, 1),
    c(3, 0, 1, 2),
    d(0, 1, 2, 3),
    e(3, 0, 1, 2),
    f(1, 2, 3, 0);

    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private static final bb[] k;

    static {
        k = new bb[6];
        bb.k[ad.a.b()] = a;
        bb.k[ad.b.b()] = b;
        bb.k[ad.c.b()] = c;
        bb.k[ad.d.b()] = d;
        bb.k[ad.e.b()] = e;
        bb.k[ad.f.b()] = f;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bb(int n3, int n4) {
        void var6_4;
        void var5_3;
        this.g = n3;
        this.h = n4;
        this.i = var5_3;
        this.j = var6_4;
    }

    public static bb a(ad ad2) {
        return k[ad2.b()];
    }

    static /* synthetic */ int a(bb bb2) {
        return bb2.g;
    }

    static /* synthetic */ int b(bb bb2) {
        return bb2.h;
    }

    static /* synthetic */ int c(bb bb2) {
        return bb2.i;
    }

    static /* synthetic */ int d(bb bb2) {
        return bb2.j;
    }
}

