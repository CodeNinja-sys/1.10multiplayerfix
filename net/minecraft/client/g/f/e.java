/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.f;

import net.minecraft.a.p;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.ar;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.f.c;
import net.minecraft.client.g.g;
import net.minecraft.client.i.d;
import net.minecraft.client.r;

public class e
implements c {
    private final r a;

    public e(r r2) {
        this.a = r2;
    }

    @Override
    public void a(float f2, long l2) {
        net.minecraft.client.h.d d2 = this.a.j;
        d d3 = this.a.h;
        double d4 = d2.br + (d2.aU - d2.br) * (double)f2;
        double d5 = d2.bs + (d2.aV - d2.bs) * (double)f2;
        double d6 = d2.bt + (d2.aW - d2.bt) * (double)f2;
        bd.D();
        bd.l();
        bd.a(ad.l, bc.j, ad.e, bc.n);
        bd.w();
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(d2.aU, 0.0, d2.aW);
        Iterable iterable = net.minecraft.u.b.g.a(b2.a(-40, 0, -40), b2.a(40, 0, 40));
        ci ci2 = ci.a();
        g g2 = ci2.c();
        g2.a(5, b.f);
        for (net.minecraft.u.b.b b3 : iterable) {
            int n2;
            if (d3.n(b3.a(0, n2 = d3.b(b3.cy_(), b3.l()), 0).c()) == p.a.v()) {
                ar.b(g2, (double)((float)b3.cy_() + 0.25f) - d4, (double)n2 - d5, (double)((float)b3.l() + 0.25f) - d6, (double)((float)b3.cy_() + 0.75f) - d4, (double)n2 + 0.09375 - d5, (double)((float)b3.l() + 0.75f) - d6, 0.0f, 0.0f, 1.0f, 0.5f);
                continue;
            }
            ar.b(g2, (double)((float)b3.cy_() + 0.25f) - d4, (double)n2 - d5, (double)((float)b3.l() + 0.25f) - d6, (double)((float)b3.cy_() + 0.75f) - d4, (double)n2 + 0.09375 - d5, (double)((float)b3.l() + 0.75f) - d6, 0.0f, 1.0f, 0.0f, 0.5f);
        }
        ci2.b();
        bd.v();
        bd.E();
    }
}

