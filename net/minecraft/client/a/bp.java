/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.ee;
import net.minecraft.q.k;
import net.minecraft.q.n;

public class bp
extends cb {
    protected bp(k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.j *= (double)0.3f;
        this.k = Math.random() * (double)0.2f + (double)0.1f;
        this.l *= (double)0.3f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.C = 1.0f;
        this.d(19 + this.r.nextInt(4));
        this.a(0.01f, 0.01f);
        this.z = 0.06f;
        this.x = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void b() {
        net.minecraft.u.b.b b2;
        b b3;
        h h2;
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        this.k -= (double)this.z;
        this.a(this.j, this.k, this.l);
        this.j *= (double)0.98f;
        this.k *= (double)0.98f;
        this.l *= (double)0.98f;
        if (this.x-- <= 0) {
            this.h();
        }
        if (this.m) {
            if (Math.random() < 0.5) {
                this.h();
            }
            this.j *= (double)0.7f;
            this.l *= (double)0.7f;
        }
        if ((h2 = (b3 = this.c.n(b2 = new net.minecraft.u.b.b(this.g, this.h, this.i))).d()).d() || h2.a()) {
            double d2 = b3.c() instanceof ee ? (double)(1.0f - ee.b((Integer)b3.a(ee.a))) : b3.c((n)this.c, (net.minecraft.u.b.b)b2).e;
            double d3 = (double)net.minecraft.u.b.n.c(this.h) + d2;
            if (this.h < d3) {
                this.h();
            }
        }
    }
}

