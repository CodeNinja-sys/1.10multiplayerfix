/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.b.f;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.cx;
import net.minecraft.g.de;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;

public class cg
extends cx {
    public static final f a = de.j;
    protected static final a b = new a(0.0, 0.28125, 0.0, 0.125, 0.78125, 1.0);
    protected static final a c = new a(0.875, 0.28125, 0.0, 1.0, 0.78125, 1.0);
    protected static final a d = new a(0.0, 0.28125, 0.0, 1.0, 0.78125, 0.125);
    protected static final a e = new a(0.0, 0.28125, 0.875, 1.0, 0.78125, 1.0);

    public cg() {
        this.z(this.O.b().a(a, (Comparable)((Object)ad.c)));
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        switch ((ad)((Object)b2.a(a))) {
            default: {
                return e;
            }
            case d: {
                return d;
            }
            case e: {
                return c;
            }
            case f: 
        }
        return b;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        ad ad2 = (ad)((Object)b2.a(a));
        if (!k2.n(b3.a(ad2.e())).d().a()) {
            this.b(k2, b3, b2, 0);
            k2.f(b3);
        }
        super.a(b2, k2, b3, cn2);
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

