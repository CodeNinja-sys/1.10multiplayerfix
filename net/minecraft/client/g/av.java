/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.client.g.be;
import net.minecraft.u.ad;

public enum av {
    a(new ad[]{ad.e, ad.f, ad.c, ad.d}, 0.5f, true, new be[]{be.k, be.d, be.k, be.j, be.e, be.j, be.e, be.d}, new be[]{be.k, be.c, be.k, be.i, be.e, be.i, be.e, be.c}, new be[]{be.l, be.c, be.l, be.i, be.f, be.i, be.f, be.c}, new be[]{be.l, be.d, be.l, be.j, be.f, be.j, be.f, be.d}),
    b(new ad[]{ad.f, ad.e, ad.c, ad.d}, 1.0f, true, new be[]{be.f, be.d, be.f, be.j, be.l, be.j, be.l, be.d}, new be[]{be.f, be.c, be.f, be.i, be.l, be.i, be.l, be.c}, new be[]{be.e, be.c, be.e, be.i, be.k, be.i, be.k, be.c}, new be[]{be.e, be.d, be.e, be.j, be.k, be.j, be.k, be.d}),
    c(new ad[]{ad.b, ad.a, ad.f, ad.e}, 0.8f, true, new be[]{be.b, be.k, be.b, be.e, be.h, be.e, be.h, be.k}, new be[]{be.b, be.l, be.b, be.f, be.h, be.f, be.h, be.l}, new be[]{be.a, be.l, be.a, be.f, be.g, be.f, be.g, be.l}, new be[]{be.a, be.k, be.a, be.e, be.g, be.e, be.g, be.k}),
    d(new ad[]{ad.e, ad.f, ad.a, ad.b}, 0.8f, true, new be[]{be.b, be.k, be.h, be.k, be.h, be.e, be.b, be.e}, new be[]{be.a, be.k, be.g, be.k, be.g, be.e, be.a, be.e}, new be[]{be.a, be.l, be.g, be.l, be.g, be.f, be.a, be.f}, new be[]{be.b, be.l, be.h, be.l, be.h, be.f, be.b, be.f}),
    e(new ad[]{ad.b, ad.a, ad.c, ad.d}, 0.6f, true, new be[]{be.b, be.d, be.b, be.j, be.h, be.j, be.h, be.d}, new be[]{be.b, be.c, be.b, be.i, be.h, be.i, be.h, be.c}, new be[]{be.a, be.c, be.a, be.i, be.g, be.i, be.g, be.c}, new be[]{be.a, be.d, be.a, be.j, be.g, be.j, be.g, be.d}),
    f(new ad[]{ad.a, ad.b, ad.c, ad.d}, 0.6f, true, new be[]{be.g, be.d, be.g, be.j, be.a, be.j, be.a, be.d}, new be[]{be.g, be.c, be.g, be.i, be.a, be.i, be.a, be.c}, new be[]{be.h, be.c, be.h, be.i, be.b, be.i, be.b, be.c}, new be[]{be.h, be.d, be.h, be.j, be.b, be.j, be.b, be.d});

    private final ad[] g;
    private final float h;
    private final boolean i;
    private final be[] j;
    private final be[] k;
    private final be[] l;
    private final be[] m;
    private static final av[] n;

    static {
        n = new av[6];
        av.n[ad.a.b()] = a;
        av.n[ad.b.b()] = b;
        av.n[ad.c.b()] = c;
        av.n[ad.d.b()] = d;
        av.n[ad.e.b()] = e;
        av.n[ad.f.b()] = f;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private av(boolean bl2, be[] arrbe, be[] arrbe2, be[] arrbe3, be[] arrbe4) {
        void var9_7;
        void var8_6;
        this.g = (ad[])bl2;
        this.h = (float)arrbe;
        this.i = arrbe2;
        this.j = arrbe3;
        this.k = arrbe4;
        this.l = var8_6;
        this.m = var9_7;
    }

    public static av a(ad ad2) {
        return n[ad2.b()];
    }

    static /* synthetic */ ad[] a(av av2) {
        return av2.g;
    }

    static /* synthetic */ boolean b(av av2) {
        return av2.i;
    }

    static /* synthetic */ be[] c(av av2) {
        return av2.j;
    }

    static /* synthetic */ be[] d(av av2) {
        return av2.k;
    }

    static /* synthetic */ be[] e(av av2) {
        return av2.l;
    }

    static /* synthetic */ be[] f(av av2) {
        return av2.m;
    }
}

