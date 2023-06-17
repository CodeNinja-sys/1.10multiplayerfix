/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.u.ad;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import net.minecraft.w.f.q;

public class a
extends aa {
    private static final bp a = new bp("textures/painting/paintings_kristoffer_zetterstrand.png");

    public a(f f2) {
        super(f2);
    }

    public void a(q q2, double d2, double d3, double d4, float f2, float f3) {
        bd.D();
        bd.b(d2, d3, d4);
        bd.b(180.0f - f2, 0.0f, 1.0f, 0.0f);
        bd.A();
        this.e(q2);
        net.minecraft.w.f.g g2 = q2.c;
        float f4 = 0.0625f;
        bd.b(0.0625f, 0.0625f, 0.0625f);
        if (this.f) {
            bd.g();
            bd.e(this.c(q2));
        }
        this.a(q2, g2.C, g2.D, g2.E, g2.F);
        if (this.f) {
            bd.m();
            bd.h();
        }
        bd.B();
        bd.E();
        super.a((net.minecraft.w.n)q2, d2, d3, d4, f2, f3);
    }

    protected bp a(q q2) {
        return a;
    }

    private void a(q q2, int n2, int n3, int n4, int n5) {
        float f2 = (float)(-n2) / 2.0f;
        float f3 = (float)(-n3) / 2.0f;
        float f4 = 0.5f;
        float f5 = 0.75f;
        float f6 = 0.8125f;
        float f7 = 0.0f;
        float f8 = 0.0625f;
        float f9 = 0.75f;
        float f10 = 0.8125f;
        float f11 = 0.001953125f;
        float f12 = 0.001953125f;
        float f13 = 0.7519531f;
        float f14 = 0.7519531f;
        float f15 = 0.0f;
        float f16 = 0.0625f;
        for (int i2 = 0; i2 < n2 / 16; ++i2) {
            for (int i3 = 0; i3 < n3 / 16; ++i3) {
                float f17 = f2 + (float)((i2 + 1) * 16);
                float f18 = f2 + (float)(i2 * 16);
                float f19 = f3 + (float)((i3 + 1) * 16);
                float f20 = f3 + (float)(i3 * 16);
                this.a(q2, (f17 + f18) / 2.0f, (f19 + f20) / 2.0f);
                float f21 = (float)(n4 + n2 - i2 * 16) / 256.0f;
                float f22 = (float)(n4 + n2 - (i2 + 1) * 16) / 256.0f;
                float f23 = (float)(n5 + n3 - i3 * 16) / 256.0f;
                float f24 = (float)(n5 + n3 - (i3 + 1) * 16) / 256.0f;
                ci ci2 = ci.a();
                g g2 = ci2.c();
                g2.a(7, b.j);
                g2.b((double)f17, (double)f20, -0.5).a(f22, f23).c(0.0f, 0.0f, -1.0f).d();
                g2.b((double)f18, (double)f20, -0.5).a(f21, f23).c(0.0f, 0.0f, -1.0f).d();
                g2.b((double)f18, (double)f19, -0.5).a(f21, f24).c(0.0f, 0.0f, -1.0f).d();
                g2.b((double)f17, (double)f19, -0.5).a(f22, f24).c(0.0f, 0.0f, -1.0f).d();
                g2.b((double)f17, (double)f19, 0.5).a(0.75, 0.0).c(0.0f, 0.0f, 1.0f).d();
                g2.b((double)f18, (double)f19, 0.5).a(0.8125, 0.0).c(0.0f, 0.0f, 1.0f).d();
                g2.b((double)f18, (double)f20, 0.5).a(0.8125, 0.0625).c(0.0f, 0.0f, 1.0f).d();
                g2.b((double)f17, (double)f20, 0.5).a(0.75, 0.0625).c(0.0f, 0.0f, 1.0f).d();
                g2.b((double)f17, (double)f19, -0.5).a(0.75, 0.001953125).c(0.0f, 1.0f, 0.0f).d();
                g2.b((double)f18, (double)f19, -0.5).a(0.8125, 0.001953125).c(0.0f, 1.0f, 0.0f).d();
                g2.b((double)f18, (double)f19, 0.5).a(0.8125, 0.001953125).c(0.0f, 1.0f, 0.0f).d();
                g2.b((double)f17, (double)f19, 0.5).a(0.75, 0.001953125).c(0.0f, 1.0f, 0.0f).d();
                g2.b((double)f17, (double)f20, 0.5).a(0.75, 0.001953125).c(0.0f, -1.0f, 0.0f).d();
                g2.b((double)f18, (double)f20, 0.5).a(0.8125, 0.001953125).c(0.0f, -1.0f, 0.0f).d();
                g2.b((double)f18, (double)f20, -0.5).a(0.8125, 0.001953125).c(0.0f, -1.0f, 0.0f).d();
                g2.b((double)f17, (double)f20, -0.5).a(0.75, 0.001953125).c(0.0f, -1.0f, 0.0f).d();
                g2.b((double)f17, (double)f19, 0.5).a(0.751953125, 0.0).c(-1.0f, 0.0f, 0.0f).d();
                g2.b((double)f17, (double)f20, 0.5).a(0.751953125, 0.0625).c(-1.0f, 0.0f, 0.0f).d();
                g2.b((double)f17, (double)f20, -0.5).a(0.751953125, 0.0625).c(-1.0f, 0.0f, 0.0f).d();
                g2.b((double)f17, (double)f19, -0.5).a(0.751953125, 0.0).c(-1.0f, 0.0f, 0.0f).d();
                g2.b((double)f18, (double)f19, -0.5).a(0.751953125, 0.0).c(1.0f, 0.0f, 0.0f).d();
                g2.b((double)f18, (double)f20, -0.5).a(0.751953125, 0.0625).c(1.0f, 0.0f, 0.0f).d();
                g2.b((double)f18, (double)f20, 0.5).a(0.751953125, 0.0625).c(1.0f, 0.0f, 0.0f).d();
                g2.b((double)f18, (double)f19, 0.5).a(0.751953125, 0.0).c(1.0f, 0.0f, 0.0f).d();
                ci2.b();
            }
        }
    }

    private void a(q q2, float f2, float f3) {
        int n2 = n.c(q2.aU);
        int n3 = n.c(q2.aV + (double)(f3 / 16.0f));
        int n4 = n.c(q2.aW);
        ad ad2 = q2.b;
        if (ad2 == ad.c) {
            n2 = n.c(q2.aU + (double)(f2 / 16.0f));
        }
        if (ad2 == ad.e) {
            n4 = n.c(q2.aW - (double)(f2 / 16.0f));
        }
        if (ad2 == ad.d) {
            n2 = n.c(q2.aU - (double)(f2 / 16.0f));
        }
        if (ad2 == ad.f) {
            n4 = n.c(q2.aW + (double)(f2 / 16.0f));
        }
        int n5 = this.c.b.b(new net.minecraft.u.b.b(n2, n3, n4), 0);
        int n6 = n5 % 65536;
        int n7 = n5 / 65536;
        ay.a(ay.r, n6, (float)n7);
        bd.d(1.0f, 1.0f, 1.0f);
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((q)n2);
    }
}

