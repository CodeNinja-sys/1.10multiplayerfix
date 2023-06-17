/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.a.p;
import net.minecraft.client.a.cb;
import net.minecraft.client.g.g;
import net.minecraft.client.r;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.k;
import net.minecraft.w.n;

public class j
extends cb {
    private final b a;
    private net.minecraft.u.b.b b;

    protected j(k k2, double d2, double d3, double d4, double d5, double d6, double d7, b b2) {
        super(k2, d2, d3, d4, d5, d6, d7);
        this.a = b2;
        this.a(net.minecraft.client.r.z().aa().a().a(b2));
        this.z = b2.c().K;
        this.A = 0.6f;
        this.B = 0.6f;
        this.C = 0.6f;
        this.y /= 2.0f;
    }

    public j a(net.minecraft.u.b.b b2) {
        this.b = b2;
        if (this.a.c() == net.minecraft.a.p.c) {
            return this;
        }
        this.b(b2);
        return this;
    }

    public j c() {
        this.b = new net.minecraft.u.b.b(this.g, this.h, this.i);
        cn cn2 = this.a.c();
        if (cn2 == net.minecraft.a.p.c) {
            return this;
        }
        this.b(null);
        return this;
    }

    protected void b(net.minecraft.u.b.b b2) {
        int n2 = net.minecraft.client.r.z().ak().a(this.a, this.c, b2, 0);
        this.A *= (float)(n2 >> 16 & 0xFF) / 255.0f;
        this.B *= (float)(n2 >> 8 & 0xFF) / 255.0f;
        this.C *= (float)(n2 & 0xFF) / 255.0f;
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public void a(g g2, n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.s + this.u / 4.0f) / 16.0f;
        float f9 = f8 + 0.015609375f;
        float f10 = ((float)this.t + this.v / 4.0f) / 16.0f;
        float f11 = f10 + 0.015609375f;
        float f12 = 0.1f * this.y;
        if (this.E != null) {
            f8 = this.E.a((double)(this.u / 4.0f * 16.0f));
            f9 = this.E.a((double)((this.u + 1.0f) / 4.0f * 16.0f));
            f10 = this.E.b((double)(this.v / 4.0f * 16.0f));
            f11 = this.E.b((double)((this.v + 1.0f) / 4.0f * 16.0f));
        }
        float f13 = (float)(this.d + (this.g - this.d) * (double)f2 - H);
        float f14 = (float)(this.e + (this.h - this.e) * (double)f2 - I);
        float f15 = (float)(this.f + (this.i - this.f) * (double)f2 - J);
        int n3 = this.a(f2);
        int n4 = n3 >> 16 & 0xFFFF;
        int n5 = n3 & 0xFFFF;
        g2.b((double)(f13 - f3 * f12 - f6 * f12), (double)(f14 - f4 * f12), (double)(f15 - f5 * f12 - f7 * f12)).a(f8, f11).a(this.A, this.B, this.C, 1.0f).a(n4, n5).d();
        g2.b((double)(f13 - f3 * f12 + f6 * f12), (double)(f14 + f4 * f12), (double)(f15 - f5 * f12 + f7 * f12)).a(f8, f10).a(this.A, this.B, this.C, 1.0f).a(n4, n5).d();
        g2.b((double)(f13 + f3 * f12 + f6 * f12), (double)(f14 + f4 * f12), (double)(f15 + f5 * f12 + f7 * f12)).a(f9, f10).a(this.A, this.B, this.C, 1.0f).a(n4, n5).d();
        g2.b((double)(f13 + f3 * f12 - f6 * f12), (double)(f14 - f4 * f12), (double)(f15 + f5 * f12 - f7 * f12)).a(f9, f11).a(this.A, this.B, this.C, 1.0f).a(n4, n5).d();
    }

    @Override
    public int a(float f2) {
        int n2 = super.a(f2);
        int n3 = 0;
        if (this.c.d(this.b)) {
            n3 = this.c.b(this.b, 0);
        }
        return n2 == 0 ? n3 : n2;
    }
}

