/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.g.a.h;
import net.minecraft.q.k;
import net.minecraft.u.b.b;

public class ar
extends cb {
    protected ar(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3 - 0.125, d4, d5, d6, d7);
        this.A = 0.4f;
        this.B = 0.4f;
        this.C = 0.7f;
        this.d(0);
        this.a(0.01f, 0.01f);
        this.y *= this.r.nextFloat() * 0.6f + 0.2f;
        this.j = d5 * 0.0;
        this.k = d6 * 0.0;
        this.l = d7 * 0.0;
        this.x = (int)(16.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void b() {
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        this.a(this.j, this.k, this.l);
        if (this.c.n(new b(this.g, this.h, this.i)).d() != net.minecraft.g.a.h.h) {
            this.h();
        }
        if (this.x-- <= 0) {
            this.h();
        }
    }
}

