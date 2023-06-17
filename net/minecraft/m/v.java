/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.f;
import net.minecraft.a.p;
import net.minecraft.client.r;
import net.minecraft.g.a.h;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.s;
import net.minecraft.u.bu;
import net.minecraft.v.d;
import net.minecraft.w.a.b;
import net.minecraft.w.l;

public class v
extends cg {
    public v() {
        this.i = 1;
        this.e(64);
        this.a(d.i);
    }

    @Override
    public ab a(cu cu2, b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        if (!b2.a(b3 = b3.a(ad2), ad2, cu2)) {
            return ab.c;
        }
        if (k2.n(b3).d() == net.minecraft.g.a.h.a) {
            k2.a(b2, b3, net.minecraft.a.f.by, bu.e, 1.0f, h.nextFloat() * 0.4f + 0.8f);
            k2.a(b3, p.ab.v(), 11);
            r.I.x.a(new s(b3.cy_(), b3.k(), b3.l()));
        }
        cu2.a(1, (l)b2);
        return ab.a;
    }
}

