/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.p;
import net.minecraft.f.ad;
import net.minecraft.f.ap;
import net.minecraft.g.c.b;
import net.minecraft.g.gt;
import net.minecraft.m.ar;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ah;
import net.minecraft.u.b.n;
import net.minecraft.v.d;

public class y
extends cg {
    public y() {
        this.i = 16;
        this.a(d.c);
    }

    @Override
    public ab a(cu cu2, net.minecraft.w.a.b b2, k k2, net.minecraft.u.b.b b3, ah ah2, net.minecraft.u.ad ad2, float f2, float f3, float f4) {
        b b4 = k2.n(b3);
        boolean bl2 = b4.c().b(k2, b3);
        if (!(ad2 == net.minecraft.u.ad.a || !b4.d().a() && !bl2 || bl2 && ad2 != net.minecraft.u.ad.b)) {
            if (b2.a(b3 = b3.a(ad2), ad2, cu2) && p.an.a_(k2, b3)) {
                if (k2.C) {
                    return ab.a;
                }
                net.minecraft.u.b.b b5 = b3 = bl2 ? b3.c() : b3;
                if (ad2 == net.minecraft.u.ad.b) {
                    int n2 = n.c((double)((b2.ba + 180.0f) * 16.0f / 360.0f) + 0.5) & 0xF;
                    k2.a(b3, p.an.v().a(gt.a, Integer.valueOf(n2)), 11);
                } else {
                    k2.a(b3, p.ax.v().a(net.minecraft.g.cg.a, (Comparable)((Object)ad2)), 11);
                }
                --cu2.b;
                ap ap2 = k2.q(b3);
                if (ap2 instanceof ad && !ar.a(k2, b2, b3, cu2)) {
                    b2.a((ad)ap2);
                }
                return ab.a;
            }
            return ab.c;
        }
        return ab.c;
    }
}

