/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.q.k;

public class ce
extends cb {
    protected ce(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3, d4, d5, d6, d7);
        float f2;
        this.A = f2 = this.r.nextFloat() * 0.1f + 0.2f;
        this.B = f2;
        this.C = f2;
        this.d(0);
        this.a(0.02f, 0.02f);
        this.y *= this.r.nextFloat() * 0.6f + 0.5f;
        this.j *= (double)0.02f;
        this.k *= (double)0.02f;
        this.l *= (double)0.02f;
        this.x = (int)(20.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void a(double d2, double d3, double d4) {
        this.a(this.k().c(d2, d3, d4));
        this.i();
    }

    @Override
    public void b() {
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        this.a(this.j, this.k, this.l);
        this.j *= 0.99;
        this.k *= 0.99;
        this.l *= 0.99;
        if (this.x-- <= 0) {
            this.h();
        }
    }
}

