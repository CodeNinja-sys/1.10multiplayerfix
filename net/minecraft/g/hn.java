/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import com.a.a.c.an;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.b.e;
import net.minecraft.g.c.a;
import net.minecraft.g.c.a.f;
import net.minecraft.g.c.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.cs;
import net.minecraft.g.q;
import net.minecraft.m.cu;
import net.minecraft.m.dk;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.af;
import net.minecraft.u.aj;
import net.minecraft.u.bq;
import net.minecraft.u.bu;
import net.minecraft.u.c;
import net.minecraft.w.e.ao;

public class hn
extends q {
    public static final e a = net.minecraft.g.b.e.a("axis", ae.class, ae.a, ae.c);
    protected static final net.minecraft.u.b.a b = new net.minecraft.u.b.a(0.0, 0.0, 0.375, 1.0, 1.0, 0.625);
    protected static final net.minecraft.u.b.a c = new net.minecraft.u.b.a(0.375, 0.0, 0.0, 0.625, 1.0, 1.0);
    protected static final net.minecraft.u.b.a d = new net.minecraft.u.b.a(0.375, 0.0, 0.375, 0.625, 1.0, 0.625);

    public hn() {
        super(net.minecraft.g.a.h.E, false);
        this.z(this.O.b().a(a, (Comparable)((Object)ae.a)));
        this.b(true);
    }

    @Override
    public net.minecraft.u.b.a a(b b2, n n2, net.minecraft.u.b.b b3) {
        switch ((ae)((Object)b2.a(a))) {
            case a: {
                return b;
            }
            default: {
                return d;
            }
            case c: 
        }
        return c;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        super.a(k2, b2, b3, random);
        if (k2.q.e() && k2.G().b("doMobSpawning") && random.nextInt(2000) < k2.R().a()) {
            net.minecraft.w.n n2;
            int n3 = b2.k();
            net.minecraft.u.b.b b4 = b2;
            while (!k2.n(b4).t() && b4.k() > 0) {
                b4 = b4.c();
            }
            if (n3 > 0 && !k2.n(b4.b()).o() && (n2 = dk.a(k2, net.minecraft.w.h.a(ao.class), (double)b4.cy_() + 0.5, (double)b4.k() + 1.1, (double)b4.l() + 0.5)) != null) {
                n2.bP = n2.R();
            }
        }
    }

    @Override
    public net.minecraft.u.b.a a(b b2, k k2, net.minecraft.u.b.b b3) {
        return y;
    }

    public static int a(ae ae2) {
        return ae2 == ae.a ? 1 : (ae2 == ae.c ? 2 : 0);
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    public boolean c(k k2, net.minecraft.u.b.b b2) {
        cs cs2 = new cs(k2, b2, ae.a);
        if (cs2.d() && cs.a(cs2) == 0) {
            cs2.e();
            return true;
        }
        cs cs3 = new cs(k2, b2, ae.c);
        if (cs3.d() && cs.a(cs3) == 0) {
            cs3.e();
            return true;
        }
        return false;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        cs cs2;
        ae ae2 = (ae)((Object)b2.a(a));
        if (ae2 == ae.a) {
            cs cs3 = new cs(k2, b3, ae.a);
            if (!cs3.d() || cs.a(cs3) < cs.b(cs3) * cs.c(cs3)) {
                k2.b(b3, p.a.v());
            }
        } else if (!(ae2 != ae.c || (cs2 = new cs(k2, b3, ae.c)).d() && cs.a(cs2) >= cs.b(cs2) * cs.c(cs2))) {
            k2.b(b3, p.a.v());
        }
    }

    @Override
    public boolean a(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        boolean bl2;
        b3 = b3.a(ad2);
        ae ae2 = null;
        if (b2.c() == this) {
            ae2 = (ae)((Object)b2.a(a));
            if (ae2 == null) {
                return false;
            }
            if (ae2 == ae.c && ad2 != ad.f && ad2 != ad.e) {
                return false;
            }
            if (ae2 == ae.a && ad2 != ad.d && ad2 != ad.c) {
                return false;
            }
        }
        boolean bl3 = n2.n(b3.f()).c() == this && n2.n(b3.e(2)).c() != this;
        boolean bl4 = n2.n(b3.g()).c() == this && n2.n(b3.f(2)).c() != this;
        boolean bl5 = n2.n(b3.d()).c() == this && n2.n(b3.c(2)).c() != this;
        boolean bl6 = n2.n(b3.e()).c() == this && n2.n(b3.d(2)).c() != this;
        boolean bl7 = bl3 || bl4 || ae2 == ae.a;
        boolean bl8 = bl2 = bl5 || bl6 || ae2 == ae.c;
        return bl7 && ad2 == ad.e ? true : (bl7 && ad2 == ad.f ? true : (bl2 && ad2 == ad.c ? true : bl2 && ad2 == ad.d));
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public c bR_() {
        return net.minecraft.u.c.d;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.n n2) {
        if (!n2.cz() && !n2.cA() && n2.cH()) {
            n2.e(b2);
        }
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        if (random.nextInt(100) == 0) {
            k2.a((double)b3.cy_() + 0.5, (double)b3.k() + 0.5, (double)b3.l() + 0.5, net.minecraft.a.f.ex, bu.e, 0.5f, random.nextFloat() * 0.4f + 0.8f, false);
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            double d2 = (float)b3.cy_() + random.nextFloat();
            double d3 = (float)b3.k() + random.nextFloat();
            double d4 = (float)b3.l() + random.nextFloat();
            double d5 = ((double)random.nextFloat() - 0.5) * 0.5;
            double d6 = ((double)random.nextFloat() - 0.5) * 0.5;
            double d7 = ((double)random.nextFloat() - 0.5) * 0.5;
            int n2 = random.nextInt(2) * 2 - 1;
            if (k2.n(b3.f()).c() != this && k2.n(b3.g()).c() != this) {
                d2 = (double)b3.cy_() + 0.5 + 0.25 * (double)n2;
                d5 = random.nextFloat() * 2.0f * (float)n2;
            } else {
                d4 = (double)b3.l() + 0.5 + 0.25 * (double)n2;
                d7 = random.nextFloat() * 2.0f * (float)n2;
            }
            k2.a(aj.y, d2, d3, d4, d5, d6, d7, new int[0]);
        }
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return null;
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)((n2 & 3) == 2 ? ae.c : ae.a)));
    }

    @Override
    public int b(b b2) {
        return hn.a((ae)((Object)b2.a(a)));
    }

    @Override
    public b a(b b2, bq bq2) {
        switch (bq2) {
            case b: 
            case d: {
                switch ((ae)((Object)b2.a(a))) {
                    case a: {
                        return b2.a(a, (Comparable)((Object)ae.c));
                    }
                    case c: {
                        return b2.a(a, (Comparable)((Object)ae.a));
                    }
                }
                return b2;
            }
        }
        return b2;
    }

    @Override
    protected i a() {
        return new i(this, a);
    }

    public f d(k k2, net.minecraft.u.b.b b2) {
        af af2;
        ae ae2 = ae.c;
        cs cs2 = new cs(k2, b2, ae.a);
        an an2 = h.a(k2, true);
        if (!cs2.d()) {
            ae2 = ae.a;
            cs2 = new cs(k2, b2, ae.c);
        }
        if (!cs2.d()) {
            return new f(b2, ad.c, ad.b, an2, 1, 1, 1);
        }
        int[] arrn = new int[af.values().length];
        ad ad2 = cs.d(cs2).g();
        net.minecraft.u.b.b b3 = cs.e(cs2).a(cs2.a() - 1);
        af[] arraf = af.values();
        int n2 = arraf.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            af2 = arraf[i2];
            f f2 = new f(ad2.d() == af2 ? b3 : b3.a(cs.d(cs2), cs2.b() - 1), ad.a(af2, ae2), ad.b, an2, cs2.b(), cs2.a(), 1);
            for (int i3 = 0; i3 < cs2.b(); ++i3) {
                for (int i4 = 0; i4 < cs2.a(); ++i4) {
                    a a2 = f2.a(i3, i4, 1);
                    if (a2.a() == null || a2.a().d() == net.minecraft.g.a.h.a) continue;
                    int n3 = af2.ordinal();
                    arrn[n3] = arrn[n3] + 1;
                }
            }
        }
        af2 = af.a;
        for (af af3 : af.values()) {
            if (arrn[af3.ordinal()] >= arrn[af2.ordinal()]) continue;
            af2 = af3;
        }
        return new f(ad2.d() == af2 ? b3 : b3.a(cs.d(cs2), cs2.b() - 1), ad.a(af2, ae2), ad.b, an2, cs2.b(), cs2.a(), 1);
    }
}

