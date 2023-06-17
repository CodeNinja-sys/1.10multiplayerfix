/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.u.ad;

public enum be {
    a(ad.a, false),
    b(ad.b, false),
    c(ad.c, false),
    d(ad.d, false),
    e(ad.e, false),
    f(ad.f, false),
    g(ad.a, true),
    h(ad.b, true),
    i(ad.c, true),
    j(ad.d, true),
    k(ad.e, true),
    l(ad.f, true);

    private final int m;

    /*
     * WARNING - void declaration
     */
    private be() {
        void var4_2;
        void var3_1;
        this.m = var3_1.b() + (var4_2 != false ? ad.values().length : 0);
    }

    static /* synthetic */ int a(be be2) {
        return be2.m;
    }
}

