/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.client.g.a.c;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.q.k;
import net.minecraft.u.bp;
import net.minecraft.w.n;

public class bc
extends cb {
    private static final bp a = new bp("textures/particle/footprint.png");
    private int b;
    private final int L;
    private final c M;

    protected bc(c c2, k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.M = c2;
        this.j = 0.0;
        this.k = 0.0;
        this.l = 0.0;
        this.L = 200;
    }

    @Override
    public void a(g g2, n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        float f9 = ((float)this.b + f2) / (float)this.L;
        if ((f8 = 2.0f - (f9 *= f9) * 2.0f) > 1.0f) {
            f8 = 1.0f;
        }
        bd.f();
        float f10 = 0.125f;
        float f11 = (float)(this.g - H);
        float f12 = (float)(this.h - I);
        float f13 = (float)(this.i - J);
        float f14 = this.c.m(new net.minecraft.u.b.b(this.g, this.h, this.i));
        this.M.a(a);
        bd.l();
        bd.a(ad.l, net.minecraft.client.g.bc.j);
        g2.a(7, net.minecraft.client.g.d.b.i);
        g2.b((double)(f11 - 0.125f), (double)f12, (double)(f13 + 0.125f)).a(0.0, 1.0).a(f14, f14, f14, f8 *= 0.2f).d();
        g2.b((double)(f11 + 0.125f), (double)f12, (double)(f13 + 0.125f)).a(1.0, 1.0).a(f14, f14, f14, f8).d();
        g2.b((double)(f11 + 0.125f), (double)f12, (double)(f13 - 0.125f)).a(1.0, 0.0).a(f14, f14, f14, f8).d();
        g2.b((double)(f11 - 0.125f), (double)f12, (double)(f13 - 0.125f)).a(0.0, 0.0).a(f14, f14, f14, f8).d();
        ci.a().b();
        bd.k();
        bd.e();
    }

    @Override
    public void b() {
        ++this.b;
        if (this.b == this.L) {
            this.h();
        }
    }

    @Override
    public int a() {
        return 3;
    }
}

