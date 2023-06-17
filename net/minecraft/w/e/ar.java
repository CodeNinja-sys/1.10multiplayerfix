/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.u.b.b;
import net.minecraft.u.b.n;
import net.minecraft.w.b.bm;
import net.minecraft.w.c.d;
import net.minecraft.w.e.aa;
import net.minecraft.w.l;

class ar
extends bm {
    private final aa a;
    private int b;
    private int c;

    public ar(aa aa2) {
        this.a = aa2;
        this.b(3);
    }

    @Override
    public boolean e() {
        l l2 = this.a.W();
        return l2 != null && l2.br();
    }

    @Override
    public void b() {
        this.b = 0;
    }

    @Override
    public void c() {
        this.a.a(false);
    }

    @Override
    public void d() {
        --this.c;
        l l2 = this.a.W();
        double d2 = this.a.n(l2);
        if (d2 < 4.0) {
            if (this.c <= 0) {
                this.c = 20;
                this.a.j(l2);
            }
            this.a.L().a(l2.aU, l2.aV, l2.aW, 1.0);
        } else if (d2 < 256.0) {
            double d3 = l2.aU - this.a.aU;
            double d4 = l2.cT().b + (double)(l2.bm / 2.0f) - (this.a.aV + (double)(this.a.bm / 2.0f));
            double d5 = l2.aW - this.a.aW;
            if (this.c <= 0) {
                ++this.b;
                if (this.b == 1) {
                    this.c = 60;
                    this.a.a(true);
                } else if (this.b <= 4) {
                    this.c = 6;
                } else {
                    this.c = 100;
                    this.b = 0;
                    this.a.a(false);
                }
                if (this.b > 1) {
                    float f2 = n.c(n.a(d2)) * 0.5f;
                    this.a.aQ.a(null, 1018, new b((int)this.a.aU, (int)this.a.aV, (int)this.a.aW), 0);
                    for (int i2 = 0; i2 < 1; ++i2) {
                        d d6 = new d(this.a.aQ, this.a, d3 + this.a.bd().nextGaussian() * (double)f2, d4, d5 + this.a.bd().nextGaussian() * (double)f2);
                        d6.aV = this.a.aV + (double)(this.a.bm / 2.0f) + 0.5;
                        this.a.aQ.a(d6);
                    }
                }
            }
            this.a.I().a(l2, 10.0f, 10.0f);
        } else {
            this.a.N().m();
            this.a.L().a(l2.aU, l2.aV, l2.aW, 1.0);
        }
        super.d();
    }
}

