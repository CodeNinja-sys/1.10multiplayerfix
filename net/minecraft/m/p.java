/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.w;
import net.minecraft.m.cg;

public enum p {
    a(0, 59, 2.0f, 0.0f, 15),
    b(1, 131, 4.0f, 1.0f, 5),
    c(2, 250, 6.0f, 2.0f, 14),
    d(3, 1561, 8.0f, 3.0f, 10),
    e(0, 32, 12.0f, 0.0f, 22);

    private final int f;
    private final int g;
    private final float h;
    private final float i;
    private final int j;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private p(float f2, float f3, int n3) {
        void var7_5;
        void var6_4;
        this.f = (int)f2;
        this.g = (int)f3;
        this.h = n3;
        this.i = var6_4;
        this.j = var7_5;
    }

    public int a() {
        return this.g;
    }

    public float b() {
        return this.h;
    }

    public float c() {
        return this.i;
    }

    public int d() {
        return this.f;
    }

    public int e() {
        return this.j;
    }

    public cg f() {
        return this == a ? cg.a(net.minecraft.a.p.f) : (this == b ? cg.a(net.minecraft.a.p.e) : (this == e ? w.m : (this == c ? w.l : (this == d ? w.k : null))));
    }
}

