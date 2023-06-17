/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.client.g.g;
import net.minecraft.q.k;
import net.minecraft.w.n;

public class bk
extends cb {
    float a;
    final float b;

    protected bk(k k2, double d2, double d3, double d4, float f2, float f3, float f4) {
        super(k2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.j = 0.0;
        this.k = 0.0;
        this.l = 0.0;
        this.A = f2;
        this.B = f3;
        this.C = f4;
        float f5 = 0.9f;
        this.y *= 0.75f;
        this.y *= 0.9f;
        this.a = this.y;
        this.x = (int)(32.0 / (Math.random() * 0.8 + 0.2));
        this.x = (int)((float)this.x * 0.9f);
        this.b = ((float)Math.random() - 0.5f) * 0.1f;
        this.F = (float)Math.random() * ((float)Math.PI * 2);
    }

    @Override
    public void a(g g2, n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.w + f2) / (float)this.x * 32.0f;
        f8 = net.minecraft.u.b.n.a(f8, 0.0f, 1.0f);
        this.y = this.a * f8;
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
        this.G = this.F;
        this.F += (float)Math.PI * this.b * 2.0f;
        if (this.m) {
            this.F = 0.0f;
            this.G = 0.0f;
        }
        this.d(7 - this.w * 8 / this.x);
        this.a(this.j, this.k, this.l);
        this.k -= (double)0.003f;
        this.k = Math.max(this.k, (double)-0.14f);
    }
}

