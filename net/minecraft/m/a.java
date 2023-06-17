/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.p;
import net.minecraft.g.bd;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.fk;
import net.minecraft.m.ar;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.bu;

public class a
extends cg {
    private final cn a;

    public a(cn cn2) {
        this.a = cn2;
    }

    @Override
    public ab a(cu cu2, net.minecraft.w.a.b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        b b4 = k2.n(b3);
        cn cn2 = b4.c();
        if (cn2 == p.aH && (Integer)b4.a(bd.a) < 1) {
            ad2 = ad.b;
        } else if (!cn2.b(k2, b3)) {
            b3 = b3.a(ad2);
        }
        if (b2.a(b3, ad2, cu2) && cu2.b != 0 && k2.a(this.a, b3, false, ad2, null, cu2)) {
            b b5 = this.a.a(k2, b3, ad2, f2, f3, f4, 0, b2);
            if (!k2.a(b3, b5, 11)) {
                return ab.c;
            }
            b5 = k2.n(b3);
            if (b5.c() == this.a) {
                ar.a(k2, b2, b3, cu2);
                b5.c().a(k2, b3, b5, b2, cu2);
            }
            fk fk2 = this.a.w();
            k2.a(b2, b3, fk2.e(), bu.e, (fk2.a() + 1.0f) / 2.0f, fk2.b() * 0.8f);
            --cu2.b;
            return ab.a;
        }
        return ab.c;
    }
}

