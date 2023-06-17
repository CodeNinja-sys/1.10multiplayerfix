/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import net.minecraft.a.f;
import net.minecraft.q.a.a.j;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.u.d.l;

public enum p {
    a("EntityHorse", "horse_white", net.minecraft.a.f.cp, net.minecraft.a.f.cw, net.minecraft.a.f.ct, net.minecraft.q.a.a.j.F),
    b("Donkey", "donkey", net.minecraft.a.f.ax, net.minecraft.a.f.aB, net.minecraft.a.f.aA, net.minecraft.q.a.a.j.F),
    c("Mule", "mule", net.minecraft.a.f.dD, net.minecraft.a.f.dF, net.minecraft.a.f.dE, net.minecraft.q.a.a.j.F),
    d("ZombieHorse", "horse_zombie", net.minecraft.a.f.hF, net.minecraft.a.f.hH, net.minecraft.a.f.hG, net.minecraft.q.a.a.j.G),
    e("SkeletonHorse", "horse_skeleton", net.minecraft.a.f.fv, net.minecraft.a.f.fx, net.minecraft.a.f.fw, net.minecraft.q.a.a.j.H);

    private final l f;
    private final bp g;
    private final bv h;
    private final bv i;
    private final bv j;
    private final bp k;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private p(bv bv2, bv bv3, bv bv4, bp bp2) {
        void var8_6;
        void var7_5;
        this.f = new l("entity." + (String)((Object)bv2) + ".name", new Object[0]);
        this.g = new bp("textures/entity/horse/" + (String)((Object)bv3) + ".png");
        this.h = bp2;
        this.i = bv4;
        this.j = var7_5;
        this.k = var8_6;
    }

    public bv a() {
        return this.i;
    }

    public bv b() {
        return this.h;
    }

    public bv c() {
        return this.j;
    }

    public l d() {
        return this.f;
    }

    public bp e() {
        return this.g;
    }

    public boolean f() {
        return this == b || this == c;
    }

    public boolean g() {
        return this == b || this == c;
    }

    public boolean h() {
        return this == d || this == e;
    }

    public boolean i() {
        return !this.h() && this != c;
    }

    public boolean j() {
        return this == a;
    }

    public int k() {
        return this.ordinal();
    }

    public static p a(int n2) {
        return p.values()[n2];
    }

    public bp l() {
        return this.k;
    }
}

