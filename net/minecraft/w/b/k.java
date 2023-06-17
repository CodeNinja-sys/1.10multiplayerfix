/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import java.util.List;
import java.util.Random;
import net.minecraft.r.j;
import net.minecraft.r.o;
import net.minecraft.u.aj;
import net.minecraft.w.a.b;
import net.minecraft.w.ah;
import net.minecraft.w.b.bm;
import net.minecraft.w.f.e;
import net.minecraft.w.h.ab;
import net.minecraft.w.h.y;

public class k
extends bm {
    private final y d;
    net.minecraft.q.k a;
    private y e;
    int b;
    double c;

    public k(y y2, double d2) {
        this.d = y2;
        this.a = y2.aQ;
        this.c = d2;
        this.b(3);
    }

    @Override
    public boolean e() {
        if (!this.d.w()) {
            return false;
        }
        this.e = this.f();
        return this.e != null;
    }

    @Override
    public boolean a() {
        return this.e.br() && this.e.w() && this.b < 60;
    }

    @Override
    public void c() {
        this.e = null;
        this.b = 0;
    }

    @Override
    public void d() {
        this.d.I().a(this.e, 10.0f, (float)this.d.ao());
        this.d.N().a(this.e, this.c);
        ++this.b;
        if (this.b >= 60 && this.d.n(this.e) < 9.0) {
            this.g();
        }
    }

    private y f() {
        List list = this.a.a(this.d.getClass(), this.d.cT().b(8.0));
        double d2 = Double.MAX_VALUE;
        y y2 = null;
        for (y y3 : list) {
            if (!this.d.a(y3) || !(this.d.n(y3) < d2)) continue;
            y2 = y3;
            d2 = this.d.n(y3);
        }
        return y2;
    }

    private void g() {
        ah ah2 = this.d.b(this.e);
        if (ah2 != null) {
            b b2 = this.d.v();
            if (b2 == null && this.e.v() != null) {
                b2 = this.e.v();
            }
            if (b2 != null) {
                b2.a(o.C);
                if (this.d instanceof ab) {
                    b2.a((net.minecraft.r.k)j.H);
                }
            }
            this.d.e(6000);
            this.e.e(6000);
            this.d.y();
            this.e.y();
            ah2.e(-24000);
            ah2.b(this.d.aU, this.d.aV, this.d.aW, 0.0f, 0.0f);
            this.a.a(ah2);
            Random random = this.d.bd();
            for (int i2 = 0; i2 < 7; ++i2) {
                double d2 = random.nextGaussian() * 0.02;
                double d3 = random.nextGaussian() * 0.02;
                double d4 = random.nextGaussian() * 0.02;
                double d5 = random.nextDouble() * (double)this.d.bl * 2.0 - (double)this.d.bl;
                double d6 = 0.5 + random.nextDouble() * (double)this.d.bm;
                double d7 = random.nextDouble() * (double)this.d.bl * 2.0 - (double)this.d.bl;
                this.a.a(aj.I, this.d.aU + d5, this.d.aV + d6, this.d.aW + d7, d2, d3, d4, new int[0]);
            }
            if (this.a.G().b("doMobLoot")) {
                this.a.a(new e(this.a, this.d.aU, this.d.aV, this.d.aW, random.nextInt(7) + 1));
            }
        }
    }
}

