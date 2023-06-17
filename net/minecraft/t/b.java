/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.t;

import net.minecraft.g.en;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.t.c;
import net.minecraft.t.g;
import net.minecraft.t.i;
import net.minecraft.u.ad;
import net.minecraft.w.f.ae;

public class b
implements i {
    @Override
    public final cu a_(g g2, cu cu2) {
        cu cu3 = this.a(g2, cu2);
        this.a(g2);
        this.a(g2, (ad)((Object)g2.f().a(en.a)));
        return cu3;
    }

    protected cu a(g g2, cu cu2) {
        ad ad2 = (ad)((Object)g2.f().a(en.a));
        c c2 = en.a(g2);
        cu cu3 = cu2.a(1);
        b.a(g2.a(), cu3, 6, ad2, c2);
        return cu2;
    }

    public static void a(k k2, cu cu2, int n2, ad ad2, c c2) {
        double d2 = c2.b();
        double d3 = c2.c();
        double d4 = c2.d();
        d3 = ad2.l() == net.minecraft.u.ae.b ? (d3 -= 0.125) : (d3 -= 0.15625);
        ae ae2 = new ae(k2, d2, d3, d4, cu2);
        double d5 = k2.p.nextDouble() * 0.1 + 0.2;
        ae2.aX = (double)ad2.h() * d5;
        ae2.aY = 0.2f;
        ae2.aZ = (double)ad2.j() * d5;
        ae2.aX += k2.p.nextGaussian() * (double)0.0075f * (double)n2;
        ae2.aY += k2.p.nextGaussian() * (double)0.0075f * (double)n2;
        ae2.aZ += k2.p.nextGaussian() * (double)0.0075f * (double)n2;
        k2.a(ae2);
    }

    protected void a(g g2) {
        g2.a().b(1000, g2.e(), 0);
    }

    protected void a(g g2, ad ad2) {
        g2.a().b(2000, g2.e(), this.a(ad2));
    }

    private int a(ad ad2) {
        return ad2.h() + 1 + (ad2.j() + 1) * 3;
    }
}

