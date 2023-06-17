/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.g.bd;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.fk;
import net.minecraft.m.ar;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;
import net.minecraft.u.bu;

public class dl
extends ar {
    public dl(cn cn2) {
        super(cn2);
        this.e(0);
        this.a(true);
    }

    @Override
    public ab a(cu cu2, net.minecraft.w.a.b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        if (cu2.b != 0 && b2.a(b3, ad2, cu2)) {
            b b4;
            a a2;
            int n2;
            b b5 = k2.n(b3);
            cn cn2 = b5.c();
            net.minecraft.u.b.b b6 = b3;
            if (!(ad2 == ad.b && cn2 == this.a || cn2.b(k2, b3))) {
                b6 = b3.a(ad2);
                b5 = k2.n(b6);
                cn2 = b5.c();
            }
            if (cn2 == this.a && (n2 = ((Integer)b5.a(bd.a)).intValue()) <= 7 && (a2 = (b4 = b5.a(bd.a, Integer.valueOf(n2 + 1))).d(k2, b6)) != cn.y && k2.c(a2.a(b6)) && k2.a(b6, b4, 10)) {
                fk fk2 = this.a.w();
                k2.a(b2, b6, fk2.e(), bu.e, (fk2.a() + 1.0f) / 2.0f, fk2.b() * 0.8f);
                --cu2.b;
                return ab.a;
            }
            return super.a(cu2, b2, k2, b6, ah2, ad2, f2, f3, f4);
        }
        return ab.c;
    }

    @Override
    public int a(int n2) {
        return n2;
    }
}

