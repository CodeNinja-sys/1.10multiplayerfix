/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.f;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.ee;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.aj;
import net.minecraft.u.b.o;
import net.minecraft.u.bu;
import net.minecraft.u.bv;
import net.minecraft.v.d;

public class do
extends cg {
    private final cn a;

    public do(cn cn2) {
        this.i = 1;
        this.a = cn2;
        this.a(d.f);
    }

    @Override
    public a a(cu cu2, k k2, net.minecraft.w.a.b b2, ah ah2) {
        net.minecraft.u.b.b b3;
        boolean bl2 = this.a == p.a;
        o o2 = this.a(k2, b2, bl2);
        if (o2 == null) {
            return new a(ab.b, cu2);
        }
        if (o2.a != net.minecraft.u.b.p.b) {
            return new a(ab.b, cu2);
        }
        net.minecraft.u.b.b b4 = o2.a();
        if (!k2.a(b2, b4)) {
            return new a(ab.c, cu2);
        }
        if (bl2) {
            if (!b2.a(b4.a(o2.b), o2.b, cu2)) {
                return new a(ab.c, cu2);
            }
            b b5 = k2.n(b4);
            h h2 = b5.d();
            if (h2 == net.minecraft.g.a.h.h && (Integer)b5.a(ee.a) == 0) {
                k2.a(b4, p.a.v(), 11);
                b2.a(net.minecraft.r.o.b(this));
                b2.a(net.minecraft.a.f.N, 1.0f, 1.0f);
                return new a(ab.a, this.a(cu2, b2, w.az));
            }
            if (h2 == net.minecraft.g.a.h.i && (Integer)b5.a(ee.a) == 0) {
                b2.a(net.minecraft.a.f.O, 1.0f, 1.0f);
                k2.a(b4, p.a.v(), 11);
                b2.a(net.minecraft.r.o.b(this));
                return new a(ab.a, this.a(cu2, b2, w.aA));
            }
            return new a(ab.c, cu2);
        }
        boolean bl3 = k2.n(b4).c().b(k2, b4);
        net.minecraft.u.b.b b6 = b3 = bl3 && o2.b == ad.b ? b4 : b4.a(o2.b);
        if (!b2.a(b3, o2.b, cu2)) {
            return new a(ab.c, cu2);
        }
        if (this.a(b2, k2, b3)) {
            b2.a(net.minecraft.r.o.b(this));
            return !b2.J.d ? new a(ab.a, new cu(w.ay)) : new a(ab.a, cu2);
        }
        return new a(ab.c, cu2);
    }

    private cu a(cu cu2, net.minecraft.w.a.b b2, cg cg2) {
        if (b2.J.d) {
            return cu2;
        }
        if (--cu2.b <= 0) {
            return new cu(cg2);
        }
        if (!b2.q.c(new cu(cg2))) {
            b2.a(new cu(cg2), false);
        }
        return cu2;
    }

    public boolean a(net.minecraft.w.a.b b2, k k2, net.minecraft.u.b.b b3) {
        if (this.a == p.a) {
            return false;
        }
        b b4 = k2.n(b3);
        h h2 = b4.d();
        boolean bl2 = !h2.a();
        boolean bl3 = b4.c().b(k2, b3);
        if (!(k2.c(b3) || bl2 || bl3)) {
            return false;
        }
        if (k2.q.m() && this.a == p.i) {
            int n2 = b3.cy_();
            int n3 = b3.k();
            int n4 = b3.l();
            k2.a(b2, b3, net.minecraft.a.f.bx, bu.e, 0.5f, 2.6f + (k2.p.nextFloat() - k2.p.nextFloat()) * 0.8f);
            for (int i2 = 0; i2 < 8; ++i2) {
                k2.a(aj.m, (double)n2 + Math.random(), (double)n3 + Math.random(), (double)n4 + Math.random(), 0.0, 0.0, 0.0, new int[0]);
            }
        } else {
            if (!k2.C && (bl2 || bl3) && !h2.d()) {
                k2.b(b3, true);
            }
            bv bv2 = this.a == p.k ? net.minecraft.a.f.M : net.minecraft.a.f.L;
            k2.a(b2, b3, bv2, bu.e, 1.0f, 1.0f);
            k2.a(b3, this.a.v(), 11);
        }
        return true;
    }
}

