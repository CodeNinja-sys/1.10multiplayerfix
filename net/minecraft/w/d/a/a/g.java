/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.d.a.a;

import net.minecraft.a.c;
import net.minecraft.u.aj;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;
import net.minecraft.w.a;
import net.minecraft.w.d.a.a.j;
import net.minecraft.w.d.a.a.q;

public class g
extends q {
    private int b;
    private int c;
    private a d;

    public g(net.minecraft.w.d.a a2) {
        super(a2);
    }

    @Override
    public void a() {
        ++this.b;
        if (this.b % 2 == 0 && this.b < 10) {
            s s2 = this.a.p(1.0f).a();
            s2.b(-0.7853982f);
            double d2 = this.a.e.aU;
            double d3 = this.a.e.aV + (double)(this.a.e.bm / 2.0f);
            double d4 = this.a.e.aW;
            for (int i2 = 0; i2 < 8; ++i2) {
                double d5 = d2 + this.a.bd().nextGaussian() / 2.0;
                double d6 = d3 + this.a.bd().nextGaussian() / 2.0;
                double d7 = d4 + this.a.bd().nextGaussian() / 2.0;
                for (int i3 = 0; i3 < 6; ++i3) {
                    this.a.aQ.a(aj.Q, d5, d6, d7, -s2.b * (double)0.08f * (double)i3, -s2.c * (double)0.6f, -s2.d * (double)0.08f * (double)i3, new int[0]);
                }
                s2.b(0.19634955f);
            }
        }
    }

    @Override
    public void b() {
        ++this.b;
        if (this.b >= 200) {
            if (this.c >= 4) {
                this.a.p().a(j.e);
            } else {
                this.a.p().a(j.g);
            }
        } else if (this.b == 10) {
            s s2 = new s(this.a.e.aU - this.a.aU, 0.0, this.a.e.aW - this.a.aW).a();
            float f2 = 5.0f;
            double d2 = this.a.e.aU + s2.b * 5.0 / 2.0;
            double d3 = this.a.e.aW + s2.d * 5.0 / 2.0;
            double d4 = this.a.e.aV + (double)(this.a.e.bm / 2.0f);
            net.minecraft.u.b.g g2 = new net.minecraft.u.b.g(n.c(d2), n.c(d4), n.c(d3));
            while (this.a.aQ.c(g2)) {
                g2.b(n.c(d2), n.c(d4 -= 1.0), n.c(d3));
            }
            d4 = n.c(d4) + 1;
            this.d = new a(this.a.aQ, d2, d4, d3);
            this.d.a(this.a);
            this.d.a(5.0f);
            this.d.d(200);
            this.d.a(aj.Q);
            this.d.a(new net.minecraft.d.j(net.minecraft.a.c.g));
            this.a.aQ.a(this.d);
        }
    }

    @Override
    public void e() {
        this.b = 0;
        ++this.c;
    }

    @Override
    public void i() {
        if (this.d != null) {
            this.d.aa();
            this.d = null;
        }
    }

    @Override
    public j g() {
        return j.f;
    }

    public void j() {
        this.c = 0;
    }
}

