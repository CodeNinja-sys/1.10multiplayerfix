/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.client.g.g;
import net.minecraft.client.r;
import net.minecraft.m.cg;
import net.minecraft.q.k;
import net.minecraft.w.n;

public class al
extends cb {
    protected al(k k2, double d2, double d3, double d4, cg cg2) {
        super(k2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.a(net.minecraft.client.r.z().ac().a().a(cg2));
        this.A = 1.0f;
        this.B = 1.0f;
        this.C = 1.0f;
        this.j = 0.0;
        this.k = 0.0;
        this.l = 0.0;
        this.z = 0.0f;
        this.x = 80;
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public void a(g g2, n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = this.E.e();
        float f9 = this.E.f();
        float f10 = this.E.g();
        float f11 = this.E.h();
        float f12 = 0.5f;
        float f13 = (float)(this.d + (this.g - this.d) * (double)f2 - H);
        float f14 = (float)(this.e + (this.h - this.e) * (double)f2 - I);
        float f15 = (float)(this.f + (this.i - this.f) * (double)f2 - J);
        int n3 = this.a(f2);
        int n4 = n3 >> 16 & 0xFFFF;
        int n5 = n3 & 0xFFFF;
        g2.b((double)(f13 - f3 * 0.5f - f6 * 0.5f), (double)(f14 - f4 * 0.5f), (double)(f15 - f5 * 0.5f - f7 * 0.5f)).a(f9, f11).a(this.A, this.B, this.C, 1.0f).a(n4, n5).d();
        g2.b((double)(f13 - f3 * 0.5f + f6 * 0.5f), (double)(f14 + f4 * 0.5f), (double)(f15 - f5 * 0.5f + f7 * 0.5f)).a(f9, f10).a(this.A, this.B, this.C, 1.0f).a(n4, n5).d();
        g2.b((double)(f13 + f3 * 0.5f + f6 * 0.5f), (double)(f14 + f4 * 0.5f), (double)(f15 + f5 * 0.5f + f7 * 0.5f)).a(f8, f10).a(this.A, this.B, this.C, 1.0f).a(n4, n5).d();
        g2.b((double)(f13 + f3 * 0.5f - f6 * 0.5f), (double)(f14 - f4 * 0.5f), (double)(f15 + f5 * 0.5f - f7 * 0.5f)).a(f8, f11).a(this.A, this.B, this.C, 1.0f).a(n4, n5).d();
    }
}

