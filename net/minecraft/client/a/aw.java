/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.client.g.g;
import net.minecraft.q.k;
import net.minecraft.w.n;

public class aw
extends cb {
    float a;

    protected aw(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        this(k2, d2, d3, d4, d5, d6, d7, 1.0f);
    }

    protected aw(k k2, double d2, double d3, double d4, double d5, double d6, double d7, float f2) {
        super(k2, d2, d3, d4, 0.0, 0.0, 0.0);
        float f3;
        this.j *= (double)0.1f;
        this.k *= (double)0.1f;
        this.l *= (double)0.1f;
        this.j += d5 * 0.4;
        this.k += d6 * 0.4;
        this.l += d7 * 0.4;
        this.A = f3 = (float)(Math.random() * (double)0.3f + (double)0.6f);
        this.B = f3;
        this.C = f3;
        this.y *= 0.75f;
        this.y *= f2;
        this.a = this.y;
        this.x = (int)(6.0 / (Math.random() * 0.8 + 0.6));
        this.x = (int)((float)this.x * f2);
        this.d(65);
        this.b();
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
        this.a(this.j, this.k, this.l);
        this.B = (float)((double)this.B * 0.96);
        this.C = (float)((double)this.C * 0.9);
        this.j *= (double)0.7f;
        this.k *= (double)0.7f;
        this.l *= (double)0.7f;
        this.k -= (double)0.02f;
        if (this.m) {
            this.j *= (double)0.7f;
            this.l *= (double)0.7f;
        }
    }
}

