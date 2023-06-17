/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.f;

import net.minecraft.a.p;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.ar;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.f.b;
import net.minecraft.client.g.f.c;
import net.minecraft.client.r;
import net.minecraft.g.ee;
import net.minecraft.q.k;
import net.minecraft.u.b.a;
import net.minecraft.u.b.h;
import net.minecraft.w.f.ab;

public class g
implements c {
    private final r a;
    private net.minecraft.w.a.b b;
    private double c;
    private double d;
    private double e;

    public g(r r2) {
        this.a = r2;
    }

    @Override
    public void a(float f2, long l2) {
        net.minecraft.g.c.b b2;
        this.b = this.a.j;
        this.c = this.b.br + (this.b.aU - this.b.br) * (double)f2;
        this.d = this.b.bs + (this.b.aV - this.b.bs) * (double)f2;
        this.e = this.b.bt + (this.b.aW - this.b.bt) * (double)f2;
        net.minecraft.u.b.b b3 = this.a.j.aC();
        k k2 = this.a.j.aQ;
        bd.l();
        bd.a(ad.l, bc.j, ad.e, bc.n);
        bd.c(0.0f, 1.0f, 0.0f, 0.75f);
        bd.w();
        bd.d(6.0f);
        for (net.minecraft.u.b.b b4 : h.a(b3.a(-10, -10, -10), b3.a(10, 10, 10))) {
            b2 = k2.n(b4);
            if (b2.c() != p.j && b2.c() != p.i) continue;
            double d2 = ab.b(b2, k2, b4);
            ar.b(new a((float)b4.cy_() + 0.01f, (float)b4.k() + 0.01f, (float)b4.l() + 0.01f, (float)b4.cy_() + 0.99f, d2, (float)b4.l() + 0.99f).c(-this.c, -this.d, -this.e), 1.0f, 1.0f, 1.0f, 0.2f);
        }
        for (net.minecraft.u.b.b b4 : h.a(b3.a(-10, -10, -10), b3.a(10, 10, 10))) {
            b2 = k2.n(b4);
            if (b2.c() != p.j && b2.c() != p.i) continue;
            Integer n2 = (Integer)b2.a(ee.a);
            double d3 = n2 > 7 ? 0.9 : 1.0 - 0.11 * (double)n2.intValue();
            String string = b2.c() == p.i ? "f" : "s";
            net.minecraft.client.g.f.b.a(String.valueOf(string) + " " + n2, (double)b4.cy_() + 0.5, (double)b4.k() + d3, (double)b4.l() + 0.5, f2, -16777216);
        }
        bd.v();
        bd.k();
    }
}

