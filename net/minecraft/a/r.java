/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import net.minecraft.g.en;
import net.minecraft.m.cu;
import net.minecraft.t.b;
import net.minecraft.t.g;
import net.minecraft.u.ad;
import net.minecraft.w.f.h;

class r
extends b {
    r() {
    }

    @Override
    public cu a(g g2, cu cu2) {
        ad ad2 = (ad)((Object)g2.f().a(en.a));
        double d2 = g2.b() + (double)ad2.h();
        double d3 = (float)g2.e().k() + 0.2f;
        double d4 = g2.d() + (double)ad2.j();
        h h2 = new h(g2.a(), d2, d3, d4, cu2);
        g2.a().a(h2);
        cu2.a(1);
        return cu2;
    }

    @Override
    protected void a(g g2) {
        g2.a().b(1004, g2.e(), 0);
    }
}

