/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.List;
import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.m;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;
import net.minecraft.v.d;

public class ci
extends cg {
    public ci() {
        this.b("end_crystal");
        this.a(d.c);
    }

    @Override
    public ab a(cu cu2, net.minecraft.w.a.b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        double d2;
        double d3;
        b b4 = k2.n(b3);
        if (b4.c() != p.Z && b4.c() != p.h) {
            return ab.c;
        }
        net.minecraft.u.b.b b5 = b3.b();
        if (!b2.a(b5, ad2, cu2)) {
            return ab.c;
        }
        net.minecraft.u.b.b b6 = b5.b();
        boolean bl2 = !k2.c(b5) && !k2.n(b5).c().b(k2, b5);
        if (bl2 |= !k2.c(b6) && !k2.n(b6).c().b(k2, b6)) {
            return ab.c;
        }
        double d4 = b5.cy_();
        List list = k2.b(null, new a(d4, d3 = (double)b5.k(), d2 = (double)b5.l(), d4 + 1.0, d3 + 2.0, d2 + 1.0));
        if (!list.isEmpty()) {
            return ab.c;
        }
        if (!k2.C) {
            net.minecraft.w.f.ad ad3 = new net.minecraft.w.f.ad(k2, (float)b3.cy_() + 0.5f, b3.k() + 1, (float)b3.l() + 0.5f);
            ad3.a(false);
            k2.a(ad3);
            if (k2.q instanceof m) {
                net.minecraft.q.d.b b7 = ((m)k2.q).s();
                b7.e();
            }
        }
        --cu2.b;
        return ab.a;
    }

    @Override
    public boolean e(cu cu2) {
        return true;
    }
}

