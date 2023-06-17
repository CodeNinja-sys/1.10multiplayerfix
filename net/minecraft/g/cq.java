/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.a.h;
import net.minecraft.g.b.f;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.de;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.ag;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.u.c;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class cq
extends cn {
    public static final f a = de.j;
    protected static final a b = new a(0.0, 0.0, 0.0, 0.1875, 1.0, 1.0);
    protected static final a c = new a(0.8125, 0.0, 0.0, 1.0, 1.0, 1.0);
    protected static final a d = new a(0.0, 0.0, 0.0, 1.0, 1.0, 0.1875);
    protected static final a e = new a(0.0, 0.0, 0.8125, 1.0, 1.0, 1.0);

    protected cq() {
        super(h.q);
        this.z(this.O.b().a(a, (Comparable)((Object)ad.c)));
        this.a(net.minecraft.v.d.c);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        switch ((ad)((Object)b2.a(a))) {
            case c: {
                return e;
            }
            case d: {
                return d;
            }
            case e: {
                return c;
            }
        }
        return b;
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return k2.n(b2.f()).o() ? true : (k2.n(b2.g()).o() ? true : (k2.n(b2.d()).o() ? true : k2.n(b2.e()).o()));
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        if (ad2.l().d() && this.b(k2, b2, ad2)) {
            return this.v().a(a, (Comparable)((Object)ad2));
        }
        for (ad ad3 : ag.a) {
            if (!this.b(k2, b2, ad3)) continue;
            return this.v().a(a, (Comparable)((Object)ad3));
        }
        return this.v();
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        ad ad2 = (ad)((Object)b2.a(a));
        if (!this.b(k2, b3, ad2)) {
            this.b(k2, b3, b2, 0);
            k2.f(b3);
        }
        super.a(b2, k2, b3, cn2);
    }

    protected boolean b(k k2, net.minecraft.u.b.b b2, ad ad2) {
        return k2.n(b2.a(ad2.e())).o();
    }

    @Override
    public c bR_() {
        return net.minecraft.u.c.c;
    }

    @Override
    public b a(int n2) {
        ad ad2 = ad.a(n2);
        if (ad2.l() == ae.b) {
            ad2 = ad.c;
        }
        return this.v().a(a, (Comparable)((Object)ad2));
    }

    @Override
    public int b(b b2) {
        return ((ad)((Object)b2.a(a))).b();
    }

    @Override
    public b a(b b2, bq bq2) {
        return b2.a(a, (Comparable)((Object)bq2.a((ad)((Object)b2.a(a)))));
    }

    @Override
    public b a(b b2, bi bi2) {
        return b2.a(bi2.a((ad)((Object)b2.a(a))));
    }

    @Override
    protected i a() {
        return new i(this, a);
    }
}

