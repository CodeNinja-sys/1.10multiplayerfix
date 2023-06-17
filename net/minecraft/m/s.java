/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.p;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.v.d;
import net.minecraft.w.a.b;

public class s
extends cg {
    public s() {
        this.a(d.d);
    }

    @Override
    public ab a(cu cu2, b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        net.minecraft.u.b.b b4;
        boolean bl2 = k2.n(b3).c().b(k2, b3);
        net.minecraft.u.b.b b5 = b4 = bl2 ? b3 : b3.a(ad2);
        if (b2.a(b4, ad2, cu2) && k2.a(k2.n(b4).c(), b4, false, ad2, null, cu2) && p.af.a_(k2, b4)) {
            --cu2.b;
            k2.b(b4, p.af.v());
            return ab.a;
        }
        return ab.c;
    }
}

