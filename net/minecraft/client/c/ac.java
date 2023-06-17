/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import net.minecraft.a.f;
import net.minecraft.u.bv;

public enum ac {
    a(net.minecraft.a.f.dL, 20, 600),
    b(net.minecraft.a.f.dK, 12000, 24000),
    c(net.minecraft.a.f.dG, 1200, 3600),
    d(net.minecraft.a.f.dH, Integer.MAX_VALUE, Integer.MAX_VALUE),
    e(net.minecraft.a.f.dM, 1200, 3600),
    f(net.minecraft.a.f.dI, 0, 0),
    g(net.minecraft.a.f.dJ, 6000, 24000);

    private final bv h;
    private final int i;
    private final int j;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ac(int n2) {
        void var5_3;
        void var4_2;
        this.h = (bv)n2;
        this.i = var4_2;
        this.j = var5_3;
    }

    public bv a() {
        return this.h;
    }

    public int b() {
        return this.i;
    }

    public int c() {
        return this.j;
    }
}

