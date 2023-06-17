/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.f;
import net.minecraft.a.w;
import net.minecraft.h.k;
import net.minecraft.m.cg;
import net.minecraft.m.dn;
import net.minecraft.u.bv;

public enum br {
    a("leather", 5, new int[]{1, 2, 3, 1}, 15, net.minecraft.a.f.s, 0.0f),
    b("chainmail", 15, new int[]{1, 4, 5, 2}, 12, net.minecraft.a.f.n, 0.0f),
    c("iron", 15, new int[]{2, 5, 6, 2}, 9, net.minecraft.a.f.r, 0.0f),
    d("gold", 7, new int[]{1, 3, 5, 2}, 25, net.minecraft.a.f.q, 0.0f),
    e("diamond", 33, new int[]{3, 6, 8, 3}, 10, net.minecraft.a.f.o, 2.0f);

    private final String f;
    private final int g;
    private final int[] h;
    private final int i;
    private final bv j;
    private final float k;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private br(int[] arrn, int n2, bv bv2, float f2) {
        void var8_6;
        void var7_5;
        this.f = arrn;
        this.g = n2;
        this.h = (int[])bv2;
        this.i = (int)f2;
        this.j = var7_5;
        this.k = var8_6;
    }

    public int a(k k2) {
        return dn.t()[k2.b()] * this.g;
    }

    public int b(k k2) {
        return this.h[k2.b()];
    }

    public int a() {
        return this.i;
    }

    public bv b() {
        return this.j;
    }

    public cg c() {
        return this == a ? w.aM : (this == b ? w.l : (this == d ? w.m : (this == c ? w.l : (this == e ? w.k : null))));
    }

    public String d() {
        return this.f;
    }

    public float e() {
        return this.k;
    }
}

