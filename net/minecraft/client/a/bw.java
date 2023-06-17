/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.client.g.g;
import net.minecraft.q.k;
import net.minecraft.u.aj;
import net.minecraft.w.n;

public class bw
extends cb {
    private final float a;

    protected bw(k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.j *= (double)0.8f;
        this.k *= (double)0.8f;
        this.l *= (double)0.8f;
        this.k = this.r.nextFloat() * 0.4f + 0.05f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.C = 1.0f;
        this.y *= this.r.nextFloat() * 2.0f + 0.2f;
        this.a = this.y;
        this.x = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        this.d(49);
    }

    @Override
    public int a(float f2) {
        int n2 = super.a(f2);
        int n3 = 240;
        int n4 = n2 >> 16 & 0xFF;
        return 0xF0 | n4 << 16;
    }

    @Override
    public void a(g g2, n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.w + f2) / (float)this.x;
        this.y = this.a * (1.0f - f8 * f8);
        super.a(g2, n2, f2, f3, f4, f5, f6, f7);
    }

    @Override
    public void b() {
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        if (this.w++ >= this.x) {
            this.h();
        }
        float f2 = (float)this.w / (float)this.x;
        if (this.r.nextFloat() > f2) {
            this.c.a(aj.l, this.g, this.h, this.i, this.j, this.k, this.l, new int[0]);
        }
        this.k -= 0.03;
        this.a(this.j, this.k, this.l);
        this.j *= (double)0.999f;
        this.k *= (double)0.999f;
        this.l *= (double)0.999f;
        if (this.m) {
            this.j *= (double)0.7f;
            this.l *= (double)0.7f;
        }
    }
}

