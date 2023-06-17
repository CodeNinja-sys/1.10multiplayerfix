/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.f;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.ee;
import net.minecraft.m.ah;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.b.o;
import net.minecraft.u.b.p;
import net.minecraft.u.bu;

public class r
extends ah {
    public r(cn cn2) {
        super(cn2, false);
    }

    @Override
    public a a(cu cu2, k k2, net.minecraft.w.a.b b2, net.minecraft.u.ah ah2) {
        o o2 = this.a(k2, b2, true);
        if (o2 == null) {
            return new a(ab.b, cu2);
        }
        if (o2.a == p.b) {
            net.minecraft.u.b.b b3 = o2.a();
            if (!k2.a(b2, b3) || !b2.a(b3.a(o2.b), o2.b, cu2)) {
                return new a(ab.c, cu2);
            }
            net.minecraft.u.b.b b4 = b3.b();
            b b5 = k2.n(b3);
            if (b5.d() == net.minecraft.g.a.h.h && (Integer)b5.a(ee.a) == 0 && k2.c(b4)) {
                k2.a(b4, net.minecraft.a.p.bx.v(), 11);
                if (!b2.J.d) {
                    --cu2.b;
                }
                b2.a(net.minecraft.r.o.b(this));
                k2.a(b2, b3, net.minecraft.a.f.gL, bu.e, 1.0f, 1.0f);
                return new a(ab.a, cu2);
            }
        }
        return new a(ab.c, cu2);
    }
}

