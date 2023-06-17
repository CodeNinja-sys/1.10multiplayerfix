/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.client.g.a.c;
import net.minecraft.client.g.am;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.d.f;
import net.minecraft.client.g.g;
import net.minecraft.q.k;
import net.minecraft.u.bp;
import net.minecraft.w.n;

public class cc
extends cb {
    private static final bp a = new bp("textures/entity/sweep.png");
    private static final f b = new f().a(net.minecraft.client.g.d.b.m).a(net.minecraft.client.g.d.b.o).a(net.minecraft.client.g.d.b.n).a(net.minecraft.client.g.d.b.p).a(net.minecraft.client.g.d.b.q).a(net.minecraft.client.g.d.b.r);
    private int L;
    private final int M;
    private final c N;
    private final float O;

    protected cc(c c2, k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3, d4, 0.0, 0.0, 0.0);
        float f2;
        this.N = c2;
        this.M = 4;
        this.A = f2 = this.r.nextFloat() * 0.6f + 0.4f;
        this.B = f2;
        this.C = f2;
        this.O = 1.0f - (float)d5 * 0.5f;
    }

    @Override
    public void a(g g2, n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        int n3 = (int)(((float)this.L + f2) * 3.0f / (float)this.M);
        if (n3 <= 7) {
            this.N.a(a);
            float f8 = (float)(n3 % 4) / 4.0f;
            float f9 = f8 + 0.24975f;
            float f10 = (float)(n3 / 2) / 2.0f;
            float f11 = f10 + 0.4995f;
            float f12 = 1.0f * this.O;
            float f13 = (float)(this.d + (this.g - this.d) * (double)f2 - H);
            float f14 = (float)(this.e + (this.h - this.e) * (double)f2 - I);
            float f15 = (float)(this.f + (this.i - this.f) * (double)f2 - J);
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            bd.f();
            am.a();
            g2.a(7, b);
            g2.b((double)(f13 - f3 * f12 - f6 * f12), (double)(f14 - f4 * f12 * 0.5f), (double)(f15 - f5 * f12 - f7 * f12)).a(f9, f11).a(this.A, this.B, this.C, 1.0f).a(0, 240).c(0.0f, 1.0f, 0.0f).d();
            g2.b((double)(f13 - f3 * f12 + f6 * f12), (double)(f14 + f4 * f12 * 0.5f), (double)(f15 - f5 * f12 + f7 * f12)).a(f9, f10).a(this.A, this.B, this.C, 1.0f).a(0, 240).c(0.0f, 1.0f, 0.0f).d();
            g2.b((double)(f13 + f3 * f12 + f6 * f12), (double)(f14 + f4 * f12 * 0.5f), (double)(f15 + f5 * f12 + f7 * f12)).a(f8, f10).a(this.A, this.B, this.C, 1.0f).a(0, 240).c(0.0f, 1.0f, 0.0f).d();
            g2.b((double)(f13 + f3 * f12 - f6 * f12), (double)(f14 - f4 * f12 * 0.5f), (double)(f15 + f5 * f12 - f7 * f12)).a(f8, f11).a(this.A, this.B, this.C, 1.0f).a(0, 240).c(0.0f, 1.0f, 0.0f).d();
            ci.a().b();
            bd.e();
        }
    }

    @Override
    public int a(float f2) {
        return 61680;
    }

    @Override
    public void b() {
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        ++this.L;
        if (this.L == this.M) {
            this.h();
        }
    }

    @Override
    public int a() {
        return 3;
    }
}

