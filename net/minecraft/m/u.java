/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import com.a.a.d.aad;
import java.util.Set;
import net.minecraft.a.f;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.m.bd;
import net.minecraft.m.cu;
import net.minecraft.m.p;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.bu;
import net.minecraft.w.l;

public class u
extends bd {
    private static final Set l = aad.a(net.minecraft.a.p.aL, net.minecraft.a.p.d, net.minecraft.a.p.ak, net.minecraft.a.p.c, net.minecraft.a.p.n, net.minecraft.a.p.bw, net.minecraft.a.p.m, net.minecraft.a.p.aJ, net.minecraft.a.p.aH, net.minecraft.a.p.aW, net.minecraft.a.p.da);

    public u(p p2) {
        super(1.5f, -3.0f, p2, l);
    }

    @Override
    public boolean a(b b2) {
        cn cn2 = b2.c();
        return cn2 == net.minecraft.a.p.aH ? true : cn2 == net.minecraft.a.p.aJ;
    }

    @Override
    public ab a(cu cu2, net.minecraft.w.a.b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        if (!b2.a(b3.a(ad2), ad2, cu2)) {
            return ab.c;
        }
        b b4 = k2.n(b3);
        cn cn2 = b4.c();
        if (ad2 != ad.a && k2.n(b3.b()).d() == net.minecraft.g.a.h.a && cn2 == net.minecraft.a.p.c) {
            b b5 = net.minecraft.a.p.da.v();
            k2.a(b2, b3, net.minecraft.a.f.fe, bu.e, 1.0f, 1.0f);
            if (!k2.C) {
                k2.a(b3, b5, 11);
                cu2.a(1, (l)b2);
            }
            return ab.a;
        }
        return ab.b;
    }
}

