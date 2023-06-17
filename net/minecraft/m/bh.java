/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.f;
import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.g.fx;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.v;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.aj;
import net.minecraft.u.b.o;
import net.minecraft.u.bu;
import net.minecraft.v.d;

public class bh
extends cg {
    public bh() {
        this.a(d.f);
    }

    @Override
    public ab a(cu cu2, net.minecraft.w.a.b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        b b4 = k2.n(b3);
        if (b2.a(b3.a(ad2), ad2, cu2) && b4.c() == p.bG && !((Boolean)b4.a(fx.b)).booleanValue()) {
            if (k2.C) {
                return ab.a;
            }
            k2.a(b3, b4.a(fx.b, Boolean.valueOf(true)), 2);
            k2.f(b3, p.bG);
            --cu2.b;
            for (int i2 = 0; i2 < 16; ++i2) {
                double d2 = (float)b3.cy_() + (5.0f + h.nextFloat() * 6.0f) / 16.0f;
                double d3 = (float)b3.k() + 0.8125f;
                double d4 = (float)b3.l() + (5.0f + h.nextFloat() * 6.0f) / 16.0f;
                double d5 = 0.0;
                double d6 = 0.0;
                double d7 = 0.0;
                k2.a(aj.l, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
            }
            net.minecraft.g.c.a.f f5 = fx.h().a(k2, b3);
            if (f5 != null) {
                net.minecraft.u.b.b b5 = f5.a().a(-3, 0, -3);
                for (int i3 = 0; i3 < 3; ++i3) {
                    for (int i4 = 0; i4 < 3; ++i4) {
                        k2.a(b5.a(i3, 0, i4), p.bF.v(), 2);
                    }
                }
            }
            return ab.a;
        }
        return ab.c;
    }

    @Override
    public a a(cu cu2, k k2, net.minecraft.w.a.b b2, ah ah2) {
        net.minecraft.u.b.b b3;
        o o2 = this.a(k2, b2, false);
        if (o2 != null && o2.a == net.minecraft.u.b.p.b && k2.n(o2.a()).c() == p.bG) {
            return new a(ab.b, cu2);
        }
        if (!k2.C && (b3 = ((v)k2).ac().a(k2, "Stronghold", new net.minecraft.u.b.b(b2))) != null) {
            net.minecraft.w.f.a a2 = new net.minecraft.w.f.a(k2, b2.aU, b2.aV + (double)(b2.bm / 2.0f), b2.aW);
            a2.a(b3);
            k2.a(a2);
            k2.a(null, b2.aU, b2.aV, b2.aW, net.minecraft.a.f.aV, bu.g, 0.5f, 0.4f / (h.nextFloat() * 0.4f + 0.8f));
            k2.a(null, 1003, new net.minecraft.u.b.b(b2), 0);
            if (!b2.J.d) {
                --cu2.b;
            }
            b2.a(net.minecraft.r.o.b(this));
            return new a(ab.a, cu2);
        }
        return new a(ab.c, cu2);
    }
}

