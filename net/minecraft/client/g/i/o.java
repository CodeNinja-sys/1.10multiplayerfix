/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.ad;
import net.minecraft.client.g.am;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.g.i.a.l;
import net.minecraft.client.g.i.a.m;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.ax;
import net.minecraft.u.bp;
import net.minecraft.w.d.a;

public class o
extends n {
    public static final bp a = new bp("textures/entity/endercrystal/endercrystal_beam.png");
    private static final bp k = new bp("textures/entity/enderdragon/dragon_exploding.png");
    private static final bp l = new bp("textures/entity/enderdragon/dragon.png");
    protected ax b;

    public o(f f2) {
        super(f2, new ax(0.0f), 0.5f);
        this.b = (ax)this.g;
        this.a(new l(this));
        this.a(new m());
    }

    protected void a(a a2, float f2, float f3, float f4) {
        float f5 = (float)a2.a(7, f4)[0];
        float f6 = (float)(a2.a(5, f4)[1] - a2.a(10, f4)[1]);
        bd.b(-f5, 0.0f, 1.0f, 0.0f);
        bd.b(f6 * 10.0f, 1.0f, 0.0f, 0.0f);
        bd.c(0.0f, 0.0f, 1.0f);
        if (a2.Y > 0) {
            float f7 = ((float)a2.Y + f4 - 1.0f) / 20.0f * 1.6f;
            if ((f7 = net.minecraft.u.b.n.c(f7)) > 1.0f) {
                f7 = 1.0f;
            }
            bd.b(f7 * this.c(a2), 0.0f, 0.0f, 1.0f);
        }
    }

    protected void a(a a2, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (a2.y > 0) {
            float f8 = (float)a2.y / 200.0f;
            bd.c(515);
            bd.d();
            bd.a(516, f8);
            this.a(k);
            this.g.a(a2, f2, f3, f4, f5, f6, f7);
            bd.a(516, 0.1f);
            bd.c(514);
        }
        this.e(a2);
        this.g.a(a2, f2, f3, f4, f5, f6, f7);
        if (a2.V > 0) {
            bd.c(514);
            bd.w();
            bd.l();
            bd.a(ad.l, bc.j);
            bd.c(1.0f, 0.0f, 0.0f, 0.5f);
            this.g.a(a2, f2, f3, f4, f5, f6, f7);
            bd.v();
            bd.k();
            bd.c(515);
        }
    }

    public void a(a a2, double d2, double d3, double d4, float f2, float f3) {
        super.a(a2, d2, d3, d4, f2, f3);
        if (a2.z != null) {
            this.a(a);
            float f4 = net.minecraft.u.b.n.a(((float)a2.z.by + f3) * 0.2f) / 2.0f + 0.5f;
            f4 = (f4 * f4 + f4) * 0.2f;
            o.a(d2, d3, d4, f3, a2.aU + (a2.aR - a2.aU) * (double)(1.0f - f3), a2.aV + (a2.aS - a2.aV) * (double)(1.0f - f3), a2.aW + (a2.aT - a2.aW) * (double)(1.0f - f3), a2.by, a2.z.aU, (double)f4 + a2.z.aV, a2.z.aW);
        }
    }

    public static void a(double d2, double d3, double d4, float f2, double d5, double d6, double d7, int n2, double d8, double d9, double d10) {
        float f3 = (float)(d8 - d5);
        float f4 = (float)(d9 - 1.0 - d6);
        float f5 = (float)(d10 - d7);
        float f6 = net.minecraft.u.b.n.c(f3 * f3 + f5 * f5);
        float f7 = net.minecraft.u.b.n.c(f3 * f3 + f4 * f4 + f5 * f5);
        bd.D();
        bd.c((float)d2, (float)d3 + 2.0f, (float)d4);
        bd.b((float)(-Math.atan2(f5, f3)) * 57.295776f - 90.0f, 0.0f, 1.0f, 0.0f);
        bd.b((float)(-Math.atan2(f6, f4)) * 57.295776f - 90.0f, 1.0f, 0.0f, 0.0f);
        ci ci2 = ci.a();
        g g2 = ci2.c();
        am.a();
        bd.q();
        bd.j(7425);
        float f8 = 0.0f - ((float)n2 + f2) * 0.01f;
        float f9 = net.minecraft.u.b.n.c(f3 * f3 + f4 * f4 + f5 * f5) / 32.0f - ((float)n2 + f2) * 0.01f;
        g2.a(5, net.minecraft.client.g.d.b.i);
        int n3 = 8;
        for (int i2 = 0; i2 <= 8; ++i2) {
            float f10 = net.minecraft.u.b.n.a((float)(i2 % 8) * ((float)Math.PI * 2) / 8.0f) * 0.75f;
            float f11 = net.minecraft.u.b.n.b((float)(i2 % 8) * ((float)Math.PI * 2) / 8.0f) * 0.75f;
            float f12 = (float)(i2 % 8) / 8.0f;
            g2.b((double)(f10 * 0.2f), (double)(f11 * 0.2f), 0.0).a(f12, f8).b(0, 0, 0, 255).d();
            g2.b((double)f10, (double)f11, (double)f7).a(f12, f9).b(255, 255, 255, 255).d();
        }
        ci2.b();
        bd.p();
        bd.j(7424);
        am.b();
        bd.E();
    }

    protected bp a(a a2) {
        return l;
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((a)n2);
    }
}

