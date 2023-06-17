/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.b;
import net.minecraft.g.a.h;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.cr;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.aj;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.u.c;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class do
extends cr {
    protected static final a a = new a(0.375, 0.0, 0.375, 0.625, 1.0, 0.625);
    protected static final a b = new a(0.375, 0.375, 0.0, 0.625, 0.625, 1.0);
    protected static final a c = new a(0.0, 0.375, 0.375, 1.0, 0.625, 0.625);

    protected do() {
        super(h.q);
        this.z(this.O.b().a(o, (Comparable)((Object)ad.b)));
        this.a(net.minecraft.v.d.c);
    }

    @Override
    public net.minecraft.g.c.b a(net.minecraft.g.c.b b2, bq bq2) {
        return b2.a(o, (Comparable)((Object)bq2.a((ad)((Object)b2.a(o)))));
    }

    @Override
    public net.minecraft.g.c.b a(net.minecraft.g.c.b b2, bi bi2) {
        return b2.a(o, (Comparable)((Object)bi2.b((ad)((Object)b2.a(o)))));
    }

    @Override
    public a a(net.minecraft.g.c.b b2, n n2, net.minecraft.u.b.b b3) {
        switch (((ad)((Object)b2.a(o))).l()) {
            default: {
                return c;
            }
            case c: {
                return b;
            }
            case b: 
        }
        return a;
    }

    @Override
    public boolean d(net.minecraft.g.c.b b2) {
        return false;
    }

    @Override
    public boolean e(net.minecraft.g.c.b b2) {
        return false;
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return true;
    }

    @Override
    public net.minecraft.g.c.b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        ad ad3;
        net.minecraft.g.c.b b3 = k2.n(b2.a(ad2.e()));
        if (b3.c() == p.cQ && (ad3 = (ad)((Object)b3.a(o))) == ad2) {
            return this.v().a(o, (Comparable)((Object)ad2.e()));
        }
        return this.v().a(o, (Comparable)((Object)ad2));
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3) {
    }

    @Override
    public void a(net.minecraft.g.c.b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
    }

    @Override
    public void a(net.minecraft.g.c.b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        ad ad2 = (ad)((Object)b2.a(o));
        double d2 = (double)b3.cy_() + 0.55 - (double)(random.nextFloat() * 0.1f);
        double d3 = (double)b3.k() + 0.55 - (double)(random.nextFloat() * 0.1f);
        double d4 = (double)b3.l() + 0.55 - (double)(random.nextFloat() * 0.1f);
        double d5 = 0.4f - (random.nextFloat() + random.nextFloat()) * 0.4f;
        if (random.nextInt(5) == 0) {
            k2.a(aj.R, d2 + (double)ad2.h() * d5, d3 + (double)ad2.i() * d5, d4 + (double)ad2.j() * d5, random.nextGaussian() * 0.005, random.nextGaussian() * 0.005, random.nextGaussian() * 0.005, new int[0]);
        }
    }

    @Override
    public c bR_() {
        return net.minecraft.u.c.c;
    }

    @Override
    public net.minecraft.g.c.b a(int n2) {
        net.minecraft.g.c.b b2 = this.v();
        b2 = b2.a(o, (Comparable)((Object)ad.a(n2)));
        return b2;
    }

    @Override
    public int b(net.minecraft.g.c.b b2) {
        return ((ad)((Object)b2.a(o))).b();
    }

    @Override
    protected i a() {
        return new i(this, o);
    }

    @Override
    public b a_(net.minecraft.g.c.b b2) {
        return net.minecraft.g.a.b.a;
    }
}

