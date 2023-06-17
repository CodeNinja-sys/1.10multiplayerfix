/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.f;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.bu;
import net.minecraft.v.d;
import net.minecraft.w.a.b;

public class bj
extends cg {
    public bj() {
        this.a(d.f);
    }

    @Override
    public ab a(cu cu2, b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        if (k2.C) {
            return ab.a;
        }
        if (!b2.a(b3 = b3.a(ad2), ad2, cu2)) {
            return ab.c;
        }
        if (k2.n(b3).d() == net.minecraft.g.a.h.a) {
            k2.a(null, b3, net.minecraft.a.f.bn, bu.e, 1.0f, (h.nextFloat() - h.nextFloat()) * 0.2f + 1.0f);
            k2.b(b3, p.ab.v());
        }
        if (!b2.J.d) {
            --cu2.b;
        }
        return ab.a;
    }
}

