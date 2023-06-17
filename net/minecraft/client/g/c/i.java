/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.c;

import net.minecraft.a.p;
import net.minecraft.client.g.a.f;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.am;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.c.o;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.g;
import net.minecraft.client.g.j;
import net.minecraft.client.r;
import net.minecraft.f.m;
import net.minecraft.g.a.h;
import net.minecraft.g.bu;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.co;
import net.minecraft.g.id;
import net.minecraft.q.k;

public class i
extends o {
    private final j a = r.z().aa();

    public void a(m m2, double d2, double d3, double d4, float f2, int n2) {
        net.minecraft.u.b.b b2 = m2.D();
        b b3 = m2.b();
        cn cn2 = b3.c();
        if (b3.d() != h.a && m2.a(f2) < 1.0f) {
            ci ci2 = ci.a();
            g g2 = ci2.c();
            this.a(f.b);
            am.a();
            bd.a(ad.l, bc.j);
            bd.l();
            bd.q();
            if (r.y()) {
                bd.j(7425);
            } else {
                bd.j(7424);
            }
            g2.a(7, net.minecraft.client.g.d.b.a);
            g2.c((double)((float)d2 - (float)b2.cy_() + m2.b(f2)), (double)((float)d3 - (float)b2.k() + m2.c(f2)), (double)((float)d4 - (float)b2.l() + m2.d(f2)));
            k k2 = this.c();
            if (cn2 == p.K && m2.a(f2) < 0.5f) {
                b3 = b3.a(co.b, Boolean.valueOf(true));
                this.a(b2, b3, g2, k2, true);
            } else if (m2.h() && !m2.f()) {
                bu bu2 = cn2 == p.F ? bu.b : bu.a;
                b b4 = p.K.v().a(co.a, (Comparable)((Object)bu2)).a(co.o, (Comparable)((Object)((net.minecraft.u.ad)((Object)b3.a(id.o)))));
                b4 = b4.a(co.b, Boolean.valueOf(m2.a(f2) >= 0.5f));
                this.a(b2, b4, g2, k2, true);
                g2.c((double)((float)d2 - (float)b2.cy_()), (double)((float)d3 - (float)b2.k()), (double)((float)d4 - (float)b2.l()));
                b3 = b3.a(id.a, Boolean.valueOf(true));
                this.a(b2, b3, g2, k2, true);
            } else {
                this.a(b2, b3, g2, k2, false);
            }
            g2.c(0.0, 0.0, 0.0);
            ci2.b();
            am.b();
        }
    }

    private boolean a(net.minecraft.u.b.b b2, b b3, g g2, k k2, boolean bl2) {
        return this.a.b().a(k2, this.a.a(b3), b3, b2, g2, bl2);
    }
}

