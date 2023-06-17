/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.client.g.g;
import net.minecraft.q.k;
import net.minecraft.w.n;

public class bd
extends cb {
    float a;

    protected bd(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        this(k2, d2, d3, d4, d5, d6, d7, 2.0f);
    }

    protected bd(k k2, double d2, double d3, double d4, double d5, double d6, double d7, float f2) {
        super(k2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.j *= (double)0.01f;
        this.k *= (double)0.01f;
        this.l *= (double)0.01f;
        this.k += 0.1;
        this.y *= 0.75f;
        this.y *= f2;
        this.a = this.y;
        this.x = 16;
        this.d(80);
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
        if (this.h == this.e) {
            this.j *= 1.1;
            this.l *= 1.1;
        }
        this.j *= (double)0.86f;
        this.k *= (double)0.86f;
        this.l *= (double)0.86f;
        if (this.m) {
            this.j *= (double)0.7f;
            this.l *= (double)0.7f;
        }
    }
}

