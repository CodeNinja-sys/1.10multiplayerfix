/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import net.minecraft.a.aa;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.ee;
import net.minecraft.h.k;
import net.minecraft.o.ae;
import net.minecraft.o.j;
import net.minecraft.o.q;
import net.minecraft.u.ad;
import net.minecraft.u.b.g;
import net.minecraft.u.b.n;

public class l
extends j {
    public l(q q2, k ... arrk) {
        super(q2, ae.c, arrk);
        this.b("frostWalker");
    }

    @Override
    public int a(int n2) {
        return n2 * 10;
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + 15;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public int a() {
        return 2;
    }

    public static void a(net.minecraft.w.l l2, net.minecraft.q.k k2, net.minecraft.u.b.b b2, int n2) {
        if (l2.be) {
            float f2 = Math.min(16, 2 + n2);
            g g2 = new g(0, 0, 0);
            for (g g3 : net.minecraft.u.b.b.b(b2.a(-f2, -1.0, -f2), b2.a(f2, -1.0, f2))) {
                b b3;
                if (!(g3.f(l2.aU, l2.aV, l2.aW) <= (double)(f2 * f2))) continue;
                g2.b(g3.cy_(), g3.k() + 1, g3.l());
                b b4 = k2.n(g2);
                if (b4.d() != h.a || (b3 = k2.n(g3)).d() != h.h || (Integer)b3.a(ee.a) != 0 || !k2.a(p.de, (net.minecraft.u.b.b)g3, false, ad.a, null, null)) continue;
                k2.b((net.minecraft.u.b.b)g3, p.de.v());
                k2.a(g3.i(), p.de, n.a(l2.bd(), 60, 120));
            }
        }
    }

    @Override
    public boolean a(j j2) {
        return super.a(j2) && j2 != aa.i;
    }
}

