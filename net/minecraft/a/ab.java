/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import java.util.Random;
import net.minecraft.g.en;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.t.b;
import net.minecraft.t.c;
import net.minecraft.t.g;
import net.minecraft.u.ad;
import net.minecraft.w.c.d;

class ab
extends b {
    ab() {
    }

    @Override
    public cu a(g g2, cu cu2) {
        ad ad2 = (ad)((Object)g2.f().a(en.a));
        c c2 = en.a(g2);
        double d2 = c2.b() + (double)((float)ad2.h() * 0.3f);
        double d3 = c2.c() + (double)((float)ad2.i() * 0.3f);
        double d4 = c2.d() + (double)((float)ad2.j() * 0.3f);
        k k2 = g2.a();
        Random random = k2.p;
        double d5 = random.nextGaussian() * 0.05 + (double)ad2.h();
        double d6 = random.nextGaussian() * 0.05 + (double)ad2.i();
        double d7 = random.nextGaussian() * 0.05 + (double)ad2.j();
        k2.a(new d(k2, d2, d3, d4, d5, d6, d7));
        cu2.a(1);
        return cu2;
    }

    @Override
    protected void a(g g2) {
        g2.a().b(1018, g2.e(), 0);
    }
}

