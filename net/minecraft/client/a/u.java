/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.q.k;

public class u
extends cb {
    protected u(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3, d4, d5, d6, d7);
        float f2;
        this.j = d5 + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.k = d6 + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.l = d7 + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.A = f2 = this.r.nextFloat() * 0.3f + 0.7f;
        this.B = f2;
        this.C = f2;
        this.y = this.r.nextFloat() * this.r.nextFloat() * 6.0f + 1.0f;
        this.x = (int)(16.0 / ((double)this.r.nextFloat() * 0.8 + 0.2)) + 2;
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
        this.k += 0.004;
        this.a(this.j, this.k, this.l);
        this.j *= (double)0.9f;
        this.k *= (double)0.9f;
        this.l *= (double)0.9f;
        if (this.m) {
            this.j *= (double)0.7f;
            this.l *= (double)0.7f;
        }
    }
}

