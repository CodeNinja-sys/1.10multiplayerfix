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
import net.minecraft.w.n;

public abstract class aw
extends aa {
    public aw(f f2) {
        super(f2);
    }

    public void a(net.minecraft.w.c.f f2, double d2, double d3, double d4, float f3, float f4) {
        this.e(f2);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.D();
        bd.f();
        bd.c((float)d2, (float)d3, (float)d4);
        bd.b(f2.bc + (f2.ba - f2.bc) * f4 - 90.0f, 0.0f, 1.0f, 0.0f);
        bd.b(f2.bd + (f2.bb - f2.bd) * f4, 0.0f, 0.0f, 1.0f);
        ci ci2 = ci.a();
        g g2 = ci2.c();
        boolean bl2 = false;
        float f5 = 0.0f;
        float f6 = 0.5f;
        float f7 = 0.0f;
        float f8 = 0.15625f;
        float f9 = 0.0f;
        float f10 = 0.15625f;
        float f11 = 0.15625f;
        float f12 = 0.3125f;
        float f13 = 0.05625f;
        bd.A();
        float f14 = (float)f2.d - f4;
        if (f14 > 0.0f) {
            float f15 = -net.minecraft.u.b.n.a(f14 * 3.0f) * f14;
            bd.b(f15, 0.0f, 0.0f, 1.0f);
        }
        bd.b(45.0f, 1.0f, 0.0f, 0.0f);
        bd.b(0.05625f, 0.05625f, 0.05625f);
        bd.c(-4.0f, 0.0f, 0.0f);
        if (this.f) {
            bd.g();
            bd.e(this.c(f2));
        }
        bd.a(0.05625f, 0.0f, 0.0f);
        g2.a(7, b.g);
        g2.b(-7.0, -2.0, -2.0).a(0.0, 0.15625).d();
        g2.b(-7.0, -2.0, 2.0).a(0.15625, 0.15625).d();
        g2.b(-7.0, 2.0, 2.0).a(0.15625, 0.3125).d();
        g2.b(-7.0, 2.0, -2.0).a(0.0, 0.3125).d();
        ci2.b();
        bd.a(-0.05625f, 0.0f, 0.0f);
        g2.a(7, b.g);
        g2.b(-7.0, 2.0, -2.0).a(0.0, 0.15625).d();
        g2.b(-7.0, 2.0, 2.0).a(0.15625, 0.15625).d();
        g2.b(-7.0, -2.0, 2.0).a(0.15625, 0.3125).d();
        g2.b(-7.0, -2.0, -2.0).a(0.0, 0.3125).d();
        ci2.b();
        for (int i2 = 0; i2 < 4; ++i2) {
            bd.b(90.0f, 1.0f, 0.0f, 0.0f);
            bd.a(0.0f, 0.0f, 0.05625f);
            g2.a(7, b.g);
            g2.b(-8.0, -2.0, 0.0).a(0.0, 0.0).d();
            g2.b(8.0, -2.0, 0.0).a(0.5, 0.0).d();
            g2.b(8.0, 2.0, 0.0).a(0.5, 0.15625).d();
            g2.b(-8.0, 2.0, 0.0).a(0.0, 0.15625).d();
            ci2.b();
        }
        if (this.f) {
            bd.m();
            bd.h();
        }
        bd.B();
        bd.e();
        bd.E();
        super.a((n)f2, d2, d3, d4, f3, f4);
    }
}

