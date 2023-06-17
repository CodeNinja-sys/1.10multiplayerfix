/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.g.by;
import net.minecraft.g.c.b;
import net.minecraft.g.dj;
import net.minecraft.g.en;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.i;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.v.d;
import net.minecraft.w.f.f;
import net.minecraft.w.f.m;

public class dc
extends cg {
    private static final net.minecraft.t.i a = new i();
    private final m b;

    public dc(m m2) {
        this.i = 1;
        this.b = m2;
        this.a(d.e);
        en.c.a(this, a);
    }

    @Override
    public ab a(cu cu2, net.minecraft.w.a.b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        b b4 = k2.n(b3);
        if (!dj.l(b4)) {
            return ab.c;
        }
        if (!k2.C) {
            by by2 = b4.c() instanceof dj ? (by)((Object)b4.a(((dj)b4.c()).h())) : by.a;
            double d2 = 0.0;
            if (by2.c()) {
                d2 = 0.5;
            }
            f f5 = net.minecraft.w.f.f.a(k2, (double)b3.cy_() + 0.5, (double)b3.k() + 0.0625 + d2, (double)b3.l() + 0.5, this.b);
            if (cu2.s()) {
                f5.g(cu2.q());
            }
            k2.a(f5);
        }
        --cu2.b;
        return ab.a;
    }

    static /* synthetic */ m a(dc dc2) {
        return dc2.b;
    }
}

