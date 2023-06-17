/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.client.j.ap;
import net.minecraft.client.j.m;
import net.minecraft.client.r;
import net.minecraft.g.c.b;
import net.minecraft.u.ac;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;
import net.minecraft.u.bp;

public class i
extends aa {
    private static final bp b = new bp("textures/entity/minecart.png");
    protected ap a = new m();

    public i(f f2) {
        super(f2);
        this.d = 0.5f;
    }

    public void a(net.minecraft.w.f.f f2, double d2, double d3, double d4, float f3, float f4) {
        b b2;
        bd.D();
        this.e(f2);
        long l2 = (long)f2.ca() * 493286711L;
        l2 = l2 * l2 * 4392167121L + l2 * 98761L;
        float f5 = (((float)(l2 >> 16 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float f6 = (((float)(l2 >> 20 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float f7 = (((float)(l2 >> 24 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        bd.c(f5, f6, f7);
        double d5 = f2.br + (f2.aU - f2.br) * (double)f4;
        double d6 = f2.bs + (f2.aV - f2.bs) * (double)f4;
        double d7 = f2.bt + (f2.aW - f2.bt) * (double)f4;
        double d8 = 0.3f;
        s s2 = f2.f(d5, d6, d7);
        float f8 = f2.bd + (f2.bb - f2.bd) * f4;
        if (s2 != null) {
            s s3 = f2.a(d5, d6, d7, (double)0.3f);
            s s4 = f2.a(d5, d6, d7, (double)-0.3f);
            if (s3 == null) {
                s3 = s2;
            }
            if (s4 == null) {
                s4 = s2;
            }
            d2 += s2.b - d5;
            d3 += (s3.c + s4.c) / 2.0 - d6;
            d4 += s2.d - d7;
            s s5 = s4.b(-s3.b, -s3.c, -s3.d);
            if (s5.b() != 0.0) {
                s5 = s5.a();
                f3 = (float)(Math.atan2(s5.d, s5.b) * 180.0 / Math.PI);
                f8 = (float)(Math.atan(s5.c) * 73.0);
            }
        }
        bd.c((float)d2, (float)d3 + 0.375f, (float)d4);
        bd.b(180.0f - f3, 0.0f, 1.0f, 0.0f);
        bd.b(-f8, 0.0f, 0.0f, 1.0f);
        float f9 = (float)f2.v() - f4;
        float f10 = f2.t() - f4;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f9 > 0.0f) {
            bd.b(n.a(f9) * f9 * f10 / 10.0f * (float)f2.w(), 1.0f, 0.0f, 0.0f);
        }
        int n2 = f2.y();
        if (this.f) {
            bd.g();
            bd.e(this.c(f2));
        }
        if ((b2 = f2.x()).l() != ac.a) {
            bd.D();
            this.a(net.minecraft.client.g.a.f.b);
            float f11 = 0.75f;
            bd.b(0.75f, 0.75f, 0.75f);
            bd.c(-0.5f, (float)(n2 - 8) / 16.0f, 0.5f);
            this.a(f2, f4, b2);
            bd.E();
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.e(f2);
        }
        bd.b(-1.0f, -1.0f, 1.0f);
        this.a.a(f2, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        bd.E();
        if (this.f) {
            bd.m();
            bd.h();
        }
        super.a((net.minecraft.w.n)f2, d2, d3, d4, f3, f4);
    }

    protected bp a(net.minecraft.w.f.f f2) {
        return b;
    }

    protected void a(net.minecraft.w.f.f f2, float f3, b b2) {
        bd.D();
        r.z().aa().a(b2, f2.n(f3));
        bd.E();
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((net.minecraft.w.f.f)n2);
    }
}

