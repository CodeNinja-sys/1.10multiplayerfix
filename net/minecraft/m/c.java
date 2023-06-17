/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.g.cn;
import net.minecraft.g.fm;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;
import net.minecraft.v.d;
import net.minecraft.w.a.b;
import net.minecraft.w.f;
import net.minecraft.w.n;
import net.minecraft.w.p;

public class c
extends cg {
    public c() {
        this.a(d.i);
    }

    @Override
    public ab a(cu cu2, b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        cn cn2 = k2.n(b3).c();
        if (!(cn2 instanceof fm)) {
            return ab.b;
        }
        if (!k2.C) {
            c.a(b2, k2, b3);
        }
        return ab.a;
    }

    public static boolean a(b b2, k k2, net.minecraft.u.b.b b3) {
        p p2 = p.b(k2, b3);
        boolean bl2 = false;
        double d2 = 7.0;
        int n2 = b3.cy_();
        int n3 = b3.k();
        int n4 = b3.l();
        for (f f2 : k2.a(f.class, new a((double)n2 - 7.0, (double)n3 - 7.0, (double)n4 - 7.0, (double)n2 + 7.0, (double)n3 + 7.0, (double)n4 + 7.0))) {
            if (!f2.aO() || f2.aQ() != b2) continue;
            if (p2 == null) {
                p2 = p.a(k2, b3);
            }
            f2.b((n)p2, true);
            bl2 = true;
        }
        return bl2;
    }
}

