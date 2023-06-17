/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.g.a.h;
import net.minecraft.q.k;
import net.minecraft.u.b.b;

public class aa
extends cb {
    protected aa(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3, d4, d5, d6, d7);
        this.A = 1.0f;
        this.B = 1.0f;
        this.C = 1.0f;
        this.d(32);
        this.a(0.02f, 0.02f);
        this.y *= this.r.nextFloat() * 0.6f + 0.2f;
        this.j = d5 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.k = d6 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.l = d7 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.x = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void b() {
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        this.k += 0.002;
        this.a(this.j, this.k, this.l);
        this.j *= (double)0.85f;
        this.k *= (double)0.85f;
        this.l *= (double)0.85f;
        if (this.c.n(new b(this.g, this.h, this.i)).d() != net.minecraft.g.a.h.h) {
            this.h();
        }
        if (this.x-- <= 0) {
            this.h();
        }
    }
}

