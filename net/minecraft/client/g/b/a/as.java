/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import net.minecraft.u.ad;

enum as {
    a(ad.b, 0, -1),
    b(ad.a, 0, 1),
    c(ad.f, -1, 0),
    d(ad.e, 1, 0);

    private final ad e;
    private final int f;
    private final int g;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private as(int n2) {
        void var5_3;
        void var4_2;
        this.e = (ad)n2;
        this.f = var4_2;
        this.g = var5_3;
    }

    public ad a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.g;
    }

    private boolean d() {
        return this == b || this == a;
    }

    static /* synthetic */ boolean a(as as2) {
        return as2.d();
    }
}

