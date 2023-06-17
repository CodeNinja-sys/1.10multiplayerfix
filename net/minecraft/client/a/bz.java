/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.ee;
import net.minecraft.q.k;
import net.minecraft.u.aj;
import net.minecraft.u.b.n;

public class bz
extends cb {
    private final h a;
    private int b;

    protected bz(k k2, double d2, double d3, double d4, h h2) {
        super(k2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.j = 0.0;
        this.k = 0.0;
        this.l = 0.0;
        if (h2 == net.minecraft.g.a.h.h) {
            this.A = 0.0f;
            this.B = 0.0f;
            this.C = 1.0f;
        } else {
            this.A = 1.0f;
            this.B = 0.0f;
            this.C = 0.0f;
        }
        this.d(113);
        this.a(0.01f, 0.01f);
        this.z = 0.06f;
        this.a = h2;
        this.b = 40;
        this.x = (int)(64.0 / (Math.random() * 0.8 + 0.2));
        this.j = 0.0;
        this.k = 0.0;
        this.l = 0.0;
    }

    @Override
    public int a(float f2) {
        return this.a == net.minecraft.g.a.h.h ? super.a(f2) : 257;
    }

    @Override
    public void b() {
        net.minecraft.u.b.b b2;
        b b3;
        h h2;
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        if (this.a == net.minecraft.g.a.h.h) {
            this.A = 0.2f;
            this.B = 0.3f;
            this.C = 1.0f;
        } else {
            this.A = 1.0f;
            this.B = 16.0f / (float)(40 - this.b + 16);
            this.C = 4.0f / (float)(40 - this.b + 8);
        }
        this.k -= (double)this.z;
        if (this.b-- > 0) {
            this.j *= 0.02;
            this.k *= 0.02;
            this.l *= 0.02;
            this.d(113);
        } else {
            this.d(112);
        }
        this.a(this.j, this.k, this.l);
        this.j *= (double)0.98f;
        this.k *= (double)0.98f;
        this.l *= (double)0.98f;
        if (this.x-- <= 0) {
            this.h();
        }
        if (this.m) {
            if (this.a == net.minecraft.g.a.h.h) {
                this.h();
                this.c.a(aj.f, this.g, this.h, this.i, 0.0, 0.0, 0.0, new int[0]);
            } else {
                this.d(114);
            }
            this.j *= (double)0.7f;
            this.l *= (double)0.7f;
        }
        if ((h2 = (b3 = this.c.n(b2 = new net.minecraft.u.b.b(this.g, this.h, this.i))).d()).d() || h2.a()) {
            double d2;
            double d3 = 0.0;
            if (b3.c() instanceof ee) {
                d3 = ee.b((Integer)b3.a(ee.a));
            }
            if (this.h < (d2 = (double)(net.minecraft.u.b.n.c(this.h) + 1) - d3)) {
                this.h();
            }
        }
    }
}

