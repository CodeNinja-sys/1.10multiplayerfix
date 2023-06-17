/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.f.ak;
import net.minecraft.f.ap;
import net.minecraft.g.a;
import net.minecraft.g.a.h;
import net.minecraft.g.b.f;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.de;
import net.minecraft.h.p;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.r.o;
import net.minecraft.u.ac;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.ah;
import net.minecraft.u.aj;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class fz
extends a {
    public static final f a = de.j;
    protected static final net.minecraft.u.b.a b = new net.minecraft.u.b.a(0.0625, 0.0, 0.0625, 0.9375, 0.875, 0.9375);

    protected fz() {
        super(h.e);
        this.z(this.O.b().a(a, (Comparable)((Object)ad.c)));
        this.a(d.c);
    }

    @Override
    public net.minecraft.u.b.a a(b b2, n n2, net.minecraft.u.b.b b3) {
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
    public ac a(b b2) {
        return ac.c;
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return cg.a(net.minecraft.a.p.Z);
    }

    @Override
    public int a(Random random) {
        return 8;
    }

    @Override
    protected boolean bQ_() {
        return true;
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        return this.v().a(a, (Comparable)((Object)l2.cl_().e()));
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, l l2, cu cu2) {
        k2.a(b2, b3.a(a, (Comparable)((Object)l2.cl_().e())), 2);
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        p p2 = b4.av();
        ap ap2 = k2.q(b2);
        if (p2 != null && ap2 instanceof ak) {
            if (k2.n(b2.b()).o()) {
                return true;
            }
            if (k2.C) {
                return true;
            }
            p2.a((ak)ap2);
            b4.a(p2);
            b4.a(o.X);
            return true;
        }
        return true;
    }

    @Override
    public ap a(k k2, int n2) {
        return new ak();
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        for (int i2 = 0; i2 < 3; ++i2) {
            int n2 = random.nextInt(2) * 2 - 1;
            int n3 = random.nextInt(2) * 2 - 1;
            double d2 = (double)b3.cy_() + 0.5 + 0.25 * (double)n2;
            double d3 = (float)b3.k() + random.nextFloat();
            double d4 = (double)b3.l() + 0.5 + 0.25 * (double)n3;
            double d5 = random.nextFloat() * (float)n2;
            double d6 = ((double)random.nextFloat() - 0.5) * 0.125;
            double d7 = random.nextFloat() * (float)n3;
            k2.a(aj.y, d2, d3, d4, d5, d6, d7, new int[0]);
        }
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

