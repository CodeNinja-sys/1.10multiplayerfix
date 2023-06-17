/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.client.g.g;
import net.minecraft.q.k;
import net.minecraft.u.b.a;
import net.minecraft.w.a.b;
import net.minecraft.w.n;

public class au
extends cb {
    float a;

    protected au(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3, d4, 0.0, 0.0, 0.0);
        float f2;
        float f3 = 2.5f;
        this.j *= (double)0.1f;
        this.k *= (double)0.1f;
        this.l *= (double)0.1f;
        this.j += d5;
        this.k += d6;
        this.l += d7;
        this.A = f2 = 1.0f - (float)(Math.random() * (double)0.3f);
        this.B = f2;
        this.C = f2;
        this.y *= 0.75f;
        this.y *= 2.5f;
        this.a = this.y;
        this.x = (int)(8.0 / (Math.random() * 0.8 + 0.3));
        this.x = (int)((float)this.x * 2.5f);
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
        this.a(this.j, this.k, this.l);
        this.j *= (double)0.96f;
        this.k *= (double)0.96f;
        this.l *= (double)0.96f;
        b b2 = this.c.a(this.g, this.h, this.i, 2.0, false);
        if (b2 != null) {
            a a2 = b2.cT();
            if (this.h > a2.b) {
                this.h += (a2.b - this.h) * 0.2;
                this.k += (b2.aY - this.k) * 0.2;
                this.b(this.g, this.h, this.i);
            }
        }
        if (this.m) {
            this.j *= (double)0.7f;
            this.l *= (double)0.7f;
        }
    }
}

