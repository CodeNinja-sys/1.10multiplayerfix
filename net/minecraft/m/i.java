/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.g.a.h;
import net.minecraft.g.by;
import net.minecraft.g.dj;
import net.minecraft.g.en;
import net.minecraft.m.cu;
import net.minecraft.m.dc;
import net.minecraft.q.k;
import net.minecraft.t.b;
import net.minecraft.t.g;
import net.minecraft.u.ad;
import net.minecraft.w.f.f;
import net.minecraft.w.n;

class i
extends b {
    private final b a = new b();

    i() {
    }

    @Override
    public cu a(g g2, cu cu2) {
        Object object;
        double d2;
        by by2;
        ad ad2 = (ad)((Object)g2.f().a(en.a));
        k k2 = g2.a();
        double d3 = g2.b() + (double)ad2.h() * 1.125;
        double d4 = Math.floor(g2.c()) + (double)ad2.i();
        double d5 = g2.d() + (double)ad2.j() * 1.125;
        net.minecraft.u.b.b b2 = g2.e().a(ad2);
        net.minecraft.g.c.b b3 = k2.n(b2);
        by by3 = by2 = b3.c() instanceof dj ? (by)((Object)b3.a(((dj)b3.c()).h())) : by.a;
        if (dj.l(b3)) {
            d2 = by2.c() ? 0.6 : 0.1;
        } else {
            if (b3.d() != h.a || !dj.l(k2.n(b2.c()))) {
                return this.a.a_(g2, cu2);
            }
            object = k2.n(b2.c());
            by by4 = object.c() instanceof dj ? (by)((Object)object.a(((dj)object.c()).h())) : by.a;
            d2 = ad2 != ad.a && by4.c() ? -0.4 : -0.9;
        }
        object = f.a(k2, d3, d4 + d2, d5, dc.a((dc)cu2.a()));
        if (cu2.s()) {
            ((n)object).g(cu2.q());
        }
        k2.a((n)object);
        cu2.a(1);
        return cu2;
    }

    @Override
    protected void a(g g2) {
        g2.a().b(1000, g2.e(), 0);
    }
}

