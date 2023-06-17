/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import net.minecraft.g.en;
import net.minecraft.m.cu;
import net.minecraft.m.dk;
import net.minecraft.t.b;
import net.minecraft.t.g;
import net.minecraft.u.ad;
import net.minecraft.w.l;
import net.minecraft.w.n;

class v
extends b {
    v() {
    }

    @Override
    public cu a(g g2, cu cu2) {
        ad ad2 = (ad)((Object)g2.f().a(en.a));
        double d2 = g2.b() + (double)ad2.h();
        double d3 = (float)g2.e().k() + 0.2f;
        double d4 = g2.d() + (double)ad2.j();
        n n2 = dk.a(g2.a(), dk.h(cu2), d2, d3, d4);
        if (n2 instanceof l && cu2.s()) {
            n2.g(cu2.q());
        }
        dk.a(g2.a(), null, cu2, n2);
        cu2.a(1);
        return cu2;
    }
}

