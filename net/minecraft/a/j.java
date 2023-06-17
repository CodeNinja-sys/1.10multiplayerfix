/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import net.minecraft.a.w;
import net.minecraft.f.ae;
import net.minecraft.g.a.h;
import net.minecraft.g.cn;
import net.minecraft.g.ee;
import net.minecraft.g.en;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.t.b;
import net.minecraft.t.g;
import net.minecraft.u.ad;

class j
extends b {
    private final b a = new b();

    j() {
    }

    @Override
    public cu a(g g2, cu cu2) {
        cg cg2;
        k k2 = g2.a();
        net.minecraft.u.b.b b2 = g2.e().a((ad)((Object)g2.f().a(en.a)));
        net.minecraft.g.c.b b3 = k2.n(b2);
        cn cn2 = b3.c();
        h h2 = b3.d();
        if (h.h.equals(h2) && cn2 instanceof ee && (Integer)b3.a(ee.a) == 0) {
            cg2 = w.az;
        } else {
            if (!h.i.equals(h2) || !(cn2 instanceof ee) || (Integer)b3.a(ee.a) != 0) {
                return super.a(g2, cu2);
            }
            cg2 = w.aA;
        }
        k2.f(b2);
        if (--cu2.b == 0) {
            cu2.a(cg2);
            cu2.b = 1;
        } else if (((ae)g2.g()).a(new cu(cg2)) < 0) {
            this.a.a_(g2, new cu(cg2));
        }
        return cu2;
    }
}

