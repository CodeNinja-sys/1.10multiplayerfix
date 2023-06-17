/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import net.minecraft.g.a.h;
import net.minecraft.g.en;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.t.b;
import net.minecraft.t.g;
import net.minecraft.u.ad;
import net.minecraft.w.f.ab;
import net.minecraft.w.f.t;

public class y
extends b {
    private final b a = new b();
    private final t c;

    public y(t t2) {
        this.c = t2;
    }

    @Override
    public cu a(g g2, cu cu2) {
        double d2;
        ad ad2 = (ad)((Object)g2.f().a(en.a));
        k k2 = g2.a();
        double d3 = g2.b() + (double)((float)ad2.h() * 1.125f);
        double d4 = g2.c() + (double)((float)ad2.i() * 1.125f);
        double d5 = g2.d() + (double)((float)ad2.j() * 1.125f);
        net.minecraft.u.b.b b2 = g2.e().a(ad2);
        h h2 = k2.n(b2).d();
        if (h.h.equals(h2)) {
            d2 = 1.0;
        } else {
            if (!h.a.equals(h2) || !h.h.equals(k2.n(b2.c()).d())) {
                return this.a.a_(g2, cu2);
            }
            d2 = 0.0;
        }
        ab ab2 = new ab(k2, d3, d4 + d2, d5);
        ab2.a(this.c);
        ab2.ba = ad2.e().m();
        k2.a(ab2);
        cu2.a(1);
        return cu2;
    }

    @Override
    protected void a(g g2) {
        g2.a().b(1000, g2.e(), 0);
    }
}

