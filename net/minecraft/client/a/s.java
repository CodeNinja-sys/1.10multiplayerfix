/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.client.g.g;
import net.minecraft.q.k;
import net.minecraft.w.n;

public class s
extends cb {
    float a;

    protected s(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        this(k2, d2, d3, d4, d5, d6, d7, 1.0f);
    }

    protected s(k k2, double d2, double d3, double d4, double d5, double d6, double d7, float f2) {
        super(k2, d2, d3, d4, d5, d6, d7);
        float f3;
        this.j *= (double)0.1f;
        this.k *= (double)0.1f;
        this.l *= (double)0.1f;
        this.j += d5;
        this.k += d6;
        this.l += d7;
        this.A = f3 = 1.0f - (float)(Math.random() * (double)0.3f);
        this.B = f3;
        this.C = f3;
        this.y *= 0.75f;
        this.y *= f2;
        this.a = this.y;
        this.x = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.x = (int)((float)this.x * f2);
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
        this.d(7 - this.w * 8 / this.x);
        this.k -= 0.03;
        this.a(this.j, this.k, this.l);
        this.j *= (double)0.99f;
        this.k *= (double)0.99f;
        this.l *= (double)0.99f;
        if (this.m) {
            this.j *= (double)0.7f;
            this.l *= (double)0.7f;
        }
    }
}

