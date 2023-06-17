/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.client.j.ad;
import net.minecraft.client.j.ap;
import net.minecraft.client.j.x;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import net.minecraft.w.f.ab;

public class am
extends aa {
    private static final bp[] b = new bp[]{new bp("textures/entity/boat/boat_oak.png"), new bp("textures/entity/boat/boat_spruce.png"), new bp("textures/entity/boat/boat_birch.png"), new bp("textures/entity/boat/boat_jungle.png"), new bp("textures/entity/boat/boat_acacia.png"), new bp("textures/entity/boat/boat_darkoak.png")};
    protected ap a = new ad();

    public am(f f2) {
        super(f2);
        this.d = 0.5f;
    }

    public void a(ab ab2, double d2, double d3, double d4, float f2, float f3) {
        bd.D();
        this.a(d2, d3, d4);
        this.a(ab2, f2, f3);
        this.e(ab2);
        if (this.f) {
            bd.g();
            bd.e(this.c(ab2));
        }
        this.a.a(ab2, f3, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        if (this.f) {
            bd.m();
            bd.h();
        }
        bd.E();
        super.a((net.minecraft.w.n)ab2, d2, d3, d4, f2, f3);
    }

    public void a(ab ab2, float f2, float f3) {
        bd.b(180.0f - f2, 0.0f, 1.0f, 0.0f);
        float f4 = (float)ab2.i() - f3;
        float f5 = ab2.g() - f3;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f4 > 0.0f) {
            bd.b(n.a(f4) * f4 * f5 / 10.0f * (float)ab2.l(), 1.0f, 0.0f, 0.0f);
        }
        bd.b(-1.0f, -1.0f, 1.0f);
    }

    public void a(double d2, double d3, double d4) {
        bd.c((float)d2, (float)d3 + 0.375f, (float)d4);
    }

    protected bp a(ab ab2) {
        return b[ab2.n().ordinal()];
    }

    @Override
    public boolean d() {
        return true;
    }

    public void b(ab ab2, double d2, double d3, double d4, float f2, float f3) {
        bd.D();
        this.a(d2, d3, d4);
        this.a(ab2, f2, f3);
        this.e(ab2);
        ((x)((Object)this.a)).b(ab2, f3, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        bd.E();
    }

    @Override
    public /* synthetic */ void c(net.minecraft.w.n n2, double d2, double d3, double d4, float f2, float f3) {
        this.b((ab)n2, d2, d3, d4, f2, f3);
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((ab)n2);
    }
}

