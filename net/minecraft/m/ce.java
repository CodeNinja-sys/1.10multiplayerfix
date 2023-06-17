/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.p;
import net.minecraft.g.av;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.dv;
import net.minecraft.g.fk;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.n;
import net.minecraft.u.bu;
import net.minecraft.v.d;

public class ce
extends cg {
    public ce() {
        this.a(d.c);
    }

    @Override
    public ab a(cu cu2, net.minecraft.w.a.b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        if (k2.C) {
            return ab.a;
        }
        if (ad2 != ad.b) {
            return ab.c;
        }
        b b4 = k2.n(b3);
        cn cn2 = b4.c();
        boolean bl2 = cn2.b(k2, b3);
        if (!bl2) {
            b3 = b3.b();
        }
        int n2 = n.c((double)(b2.ba * 4.0f / 360.0f) + 0.5) & 3;
        ad ad3 = ad.b(n2);
        net.minecraft.u.b.b b5 = b3.a(ad3);
        if (b2.a(b3, ad2, cu2) && b2.a(b5, ad2, cu2)) {
            boolean bl3;
            boolean bl4 = k2.n(b5).c().b(k2, b5);
            boolean bl5 = bl2 || k2.c(b3);
            boolean bl6 = bl3 = bl4 || k2.c(b5);
            if (bl5 && bl3 && k2.n(b3.c()).t() && k2.n(b5.c()).t()) {
                Object object;
                b b6 = p.C.v().a(av.b, Boolean.valueOf(false)).a(av.j, (Comparable)((Object)ad3)).a(av.a, (Comparable)((Object)dv.b));
                if (k2.a(b3, b6, 11)) {
                    object = b6.a(av.a, (Comparable)((Object)dv.a));
                    k2.a(b5, (b)object, 11);
                }
                object = b6.c().w();
                k2.a(null, b3, ((fk)object).e(), bu.e, (((fk)object).a() + 1.0f) / 2.0f, ((fk)object).b() * 0.8f);
                --cu2.b;
                return ab.a;
            }
            return ab.c;
        }
        return ab.c;
    }
}

