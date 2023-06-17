/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.client.r;
import net.minecraft.u.ai;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;
import net.minecraft.u.bp;
import net.minecraft.w.c.a;

public class bc
extends aa {
    private static final bp a = new bp("textures/particle/particles.png");

    public bc(f f2) {
        super(f2);
    }

    public void a(a a2, double d2, double d3, double d4, float f2, float f3) {
        bd.D();
        bd.c((float)d2, (float)d3, (float)d4);
        bd.A();
        bd.b(0.5f, 0.5f, 0.5f);
        this.e(a2);
        ci ci2 = ci.a();
        g g2 = ci2.c();
        boolean bl2 = true;
        int n2 = 2;
        float f4 = 0.0625f;
        float f5 = 0.125f;
        float f6 = 0.125f;
        float f7 = 0.1875f;
        float f8 = 1.0f;
        float f9 = 0.5f;
        float f10 = 0.5f;
        bd.b(180.0f - this.c.e, 0.0f, 1.0f, 0.0f);
        bd.b((float)(this.c.g.as == 2 ? -1 : 1) * -this.c.f, 1.0f, 0.0f, 0.0f);
        if (this.f) {
            bd.g();
            bd.e(this.c(a2));
        }
        g2.a(7, b.j);
        g2.b(-0.5, -0.5, 0.0).a(0.0625, 0.1875).c(0.0f, 1.0f, 0.0f).d();
        g2.b(0.5, -0.5, 0.0).a(0.125, 0.1875).c(0.0f, 1.0f, 0.0f).d();
        g2.b(0.5, 0.5, 0.0).a(0.125, 0.125).c(0.0f, 1.0f, 0.0f).d();
        g2.b(-0.5, 0.5, 0.0).a(0.0625, 0.125).c(0.0f, 1.0f, 0.0f).d();
        ci2.b();
        if (this.f) {
            bd.m();
            bd.h();
        }
        bd.B();
        bd.E();
        if (a2.a != null && !this.f) {
            double d5;
            double d6;
            double d7;
            double d8;
            int n3 = a2.a.aH() == ai.b ? 1 : -1;
            float f11 = a2.a.j(f3);
            float f12 = n.a(n.c(f11) * (float)Math.PI);
            float f13 = (a2.a.al + (a2.a.ak - a2.a.al) * f3) * ((float)Math.PI / 180);
            double d9 = n.a(f13);
            double d10 = n.b(f13);
            double d11 = (double)n3 * 0.35;
            double d12 = 0.8;
            if ((this.c.g == null || this.c.g.as <= 0) && a2.a == r.z().j) {
                s s2 = new s((double)n3 * -0.36, -0.05, 0.4);
                s2 = s2.a(-(a2.a.bd + (a2.a.bb - a2.a.bd) * f3) * ((float)Math.PI / 180));
                s2 = s2.b(-(a2.a.bc + (a2.a.ba - a2.a.bc) * f3) * ((float)Math.PI / 180));
                s2 = s2.b(f12 * 0.5f);
                s2 = s2.a(-f12 * 0.7f);
                d8 = a2.a.aR + (a2.a.aU - a2.a.aR) * (double)f3 + s2.b;
                d7 = a2.a.aS + (a2.a.aV - a2.a.aS) * (double)f3 + s2.c;
                d6 = a2.a.aT + (a2.a.aW - a2.a.aT) * (double)f3 + s2.d;
                d5 = a2.a.ce_();
            } else {
                d8 = a2.a.aR + (a2.a.aU - a2.a.aR) * (double)f3 - d10 * d11 - d9 * 0.8;
                d7 = a2.a.aS + (double)a2.a.ce_() + (a2.a.aV - a2.a.aS) * (double)f3 - 0.45;
                d6 = a2.a.aT + (a2.a.aW - a2.a.aT) * (double)f3 - d9 * d11 + d10 * 0.8;
                d5 = a2.a.G() ? -0.1875 : 0.0;
            }
            double d13 = a2.aR + (a2.aU - a2.aR) * (double)f3;
            double d14 = a2.aS + (a2.aV - a2.aS) * (double)f3 + 0.25;
            double d15 = a2.aT + (a2.aW - a2.aT) * (double)f3;
            double d16 = (float)(d8 - d13);
            double d17 = (double)((float)(d7 - d14)) + d5;
            double d18 = (float)(d6 - d15);
            bd.w();
            bd.f();
            g2.a(3, b.f);
            int n4 = 16;
            for (int i2 = 0; i2 <= 16; ++i2) {
                float f14 = (float)i2 / 16.0f;
                g2.b(d2 + d16 * (double)f14, d3 + d17 * (double)(f14 * f14 + f14) * 0.5 + 0.25, d4 + d18 * (double)f14).b(0, 0, 0, 255).d();
            }
            ci2.b();
            bd.e();
            bd.v();
            super.a((net.minecraft.w.n)a2, d2, d3, d4, f2, f3);
        }
    }

    protected bp a(a a2) {
        return a;
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((a)n2);
    }
}

