/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.client.g.ab;
import net.minecraft.client.g.cr;
import net.minecraft.u.ad;

public enum bh {
    a(new cr[]{new cr(ab.f, ab.e, ab.a, null), new cr(ab.f, ab.e, ab.d, null), new cr(ab.c, ab.e, ab.d, null), new cr(ab.c, ab.e, ab.a, null)}),
    b(new cr[]{new cr(ab.f, ab.b, ab.d, null), new cr(ab.f, ab.b, ab.a, null), new cr(ab.c, ab.b, ab.a, null), new cr(ab.c, ab.b, ab.d, null)}),
    c(new cr[]{new cr(ab.c, ab.b, ab.d, null), new cr(ab.c, ab.e, ab.d, null), new cr(ab.f, ab.e, ab.d, null), new cr(ab.f, ab.b, ab.d, null)}),
    d(new cr[]{new cr(ab.f, ab.b, ab.a, null), new cr(ab.f, ab.e, ab.a, null), new cr(ab.c, ab.e, ab.a, null), new cr(ab.c, ab.b, ab.a, null)}),
    e(new cr[]{new cr(ab.f, ab.b, ab.d, null), new cr(ab.f, ab.e, ab.d, null), new cr(ab.f, ab.e, ab.a, null), new cr(ab.f, ab.b, ab.a, null)}),
    f(new cr[]{new cr(ab.c, ab.b, ab.a, null), new cr(ab.c, ab.e, ab.a, null), new cr(ab.c, ab.e, ab.d, null), new cr(ab.c, ab.b, ab.d, null)});

    private static final bh[] g;
    private final cr[] h;

    static {
        g = new bh[6];
        bh.g[ab.e] = a;
        bh.g[ab.b] = b;
        bh.g[ab.d] = c;
        bh.g[ab.a] = d;
        bh.g[ab.f] = e;
        bh.g[ab.c] = f;
    }

    public static bh a(ad ad2) {
        return g[ad2.b()];
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bh() {
        void var3_1;
        this.h = var3_1;
    }

    public cr a(int n2) {
        return this.h[n2];
    }
}

