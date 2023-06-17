/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.client.g.g;
import net.minecraft.q.k;
import net.minecraft.w.n;

public class bg
extends cb {
    protected bg(k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4);
        this.x = 4;
    }

    @Override
    public void a(g g2, n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = 0.25f;
        float f9 = 0.5f;
        float f10 = 0.125f;
        float f11 = 0.375f;
        float f12 = 7.1f * net.minecraft.u.b.n.a(((float)this.w + f2 - 1.0f) * 0.25f * (float)Math.PI);
        this.d(0.6f - ((float)this.w + f2 - 1.0f) * 0.25f * 0.5f);
        float f13 = (float)(this.d + (this.g - this.d) * (double)f2 - H);
        float f14 = (float)(this.e + (this.h - this.e) * (double)f2 - I);
        float f15 = (float)(this.f + (this.i - this.f) * (double)f2 - J);
        int n3 = this.a(f2);
        int n4 = n3 >> 16 & 0xFFFF;
        int n5 = n3 & 0xFFFF;
        g2.b((double)(f13 - f3 * f12 - f6 * f12), (double)(f14 - f4 * f12), (double)(f15 - f5 * f12 - f7 * f12)).a(0.5, 0.375).a(this.A, this.B, this.C, this.D).a(n4, n5).d();
        g2.b((double)(f13 - f3 * f12 + f6 * f12), (double)(f14 + f4 * f12), (double)(f15 - f5 * f12 + f7 * f12)).a(0.5, 0.125).a(this.A, this.B, this.C, this.D).a(n4, n5).d();
        g2.b((double)(f13 + f3 * f12 + f6 * f12), (double)(f14 + f4 * f12), (double)(f15 + f5 * f12 + f7 * f12)).a(0.25, 0.125).a(this.A, this.B, this.C, this.D).a(n4, n5).d();
        g2.b((double)(f13 + f3 * f12 - f6 * f12), (double)(f14 - f4 * f12), (double)(f15 + f5 * f12 - f7 * f12)).a(0.25, 0.375).a(this.A, this.B, this.C, this.D).a(n4, n5).d();
    }
}

