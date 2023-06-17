/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.f.aa;
import net.minecraft.f.ap;
import net.minecraft.g.a;
import net.minecraft.g.a.h;
import net.minecraft.g.b.f;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.de;
import net.minecraft.h.aq;
import net.minecraft.h.y;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.r.o;
import net.minecraft.u.ac;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.ah;
import net.minecraft.u.aj;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.u.bu;
import net.minecraft.w.l;

public class e
extends a {
    public static final f a = de.j;
    private final boolean b;
    private static boolean c;
    private static /* synthetic */ int[] d;

    protected e(boolean bl2) {
        super(h.e);
        this.z(this.O.b().a(a, (Comparable)((Object)ad.c)));
        this.b = bl2;
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return cg.a(p.al);
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        this.e(k2, b2, b3);
    }

    private void e(k k2, net.minecraft.u.b.b b2, b b3) {
        if (!k2.C) {
            b b4 = k2.n(b2.d());
            b b5 = k2.n(b2.e());
            b b6 = k2.n(b2.f());
            b b7 = k2.n(b2.g());
            ad ad2 = (ad)((Object)b3.a(a));
            if (ad2 == ad.c && b4.e() && !b5.e()) {
                ad2 = ad.d;
            } else if (ad2 == ad.d && b5.e() && !b4.e()) {
                ad2 = ad.c;
            } else if (ad2 == ad.e && b6.e() && !b7.e()) {
                ad2 = ad.f;
            } else if (ad2 == ad.f && b7.e() && !b6.e()) {
                ad2 = ad.e;
            }
            k2.a(b2, b3.a(a, (Comparable)((Object)ad2)), 2);
        }
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        if (this.b) {
            ad ad2 = (ad)((Object)b2.a(a));
            double d2 = (double)b3.cy_() + 0.5;
            double d3 = (double)b3.k() + random.nextDouble() * 6.0 / 16.0;
            double d4 = (double)b3.l() + 0.5;
            double d5 = 0.52;
            double d6 = random.nextDouble() * 0.6 - 0.3;
            if (random.nextDouble() < 0.1) {
                k2.a((double)b3.cy_() + 0.5, (double)b3.k(), (double)b3.l() + 0.5, net.minecraft.a.f.bz, bu.e, 1.0f, 1.0f, false);
            }
            switch (e.b()[ad2.ordinal()]) {
                case 5: {
                    k2.a(aj.l, d2 - 0.52, d3, d4 + d6, 0.0, 0.0, 0.0, new int[0]);
                    k2.a(aj.A, d2 - 0.52, d3, d4 + d6, 0.0, 0.0, 0.0, new int[0]);
                    break;
                }
                case 6: {
                    k2.a(aj.l, d2 + 0.52, d3, d4 + d6, 0.0, 0.0, 0.0, new int[0]);
                    k2.a(aj.A, d2 + 0.52, d3, d4 + d6, 0.0, 0.0, 0.0, new int[0]);
                    break;
                }
                case 3: {
                    k2.a(aj.l, d2 + d6, d3, d4 - 0.52, 0.0, 0.0, 0.0, new int[0]);
                    k2.a(aj.A, d2 + d6, d3, d4 - 0.52, 0.0, 0.0, 0.0, new int[0]);
                    break;
                }
                case 4: {
                    k2.a(aj.l, d2 + d6, d3, d4 + 0.52, 0.0, 0.0, 0.0, new int[0]);
                    k2.a(aj.A, d2 + d6, d3, d4 + 0.52, 0.0, 0.0, 0.0, new int[0]);
                }
            }
        }
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (k2.C) {
            return true;
        }
        ap ap2 = k2.q(b2);
        if (ap2 instanceof aa) {
            b4.a((aa)ap2);
            b4.a(o.aa);
        }
        return true;
    }

    public static void a(boolean bl2, k k2, net.minecraft.u.b.b b2) {
        b b3 = k2.n(b2);
        ap ap2 = k2.q(b2);
        c = true;
        if (bl2) {
            k2.a(b2, p.am.v().a(a, (Comparable)((Object)((ad)((Object)b3.a(a))))), 3);
            k2.a(b2, p.am.v().a(a, (Comparable)((Object)((ad)((Object)b3.a(a))))), 3);
        } else {
            k2.a(b2, p.al.v().a(a, (Comparable)((Object)((ad)((Object)b3.a(a))))), 3);
            k2.a(b2, p.al.v().a(a, (Comparable)((Object)((ad)((Object)b3.a(a))))), 3);
        }
        c = false;
        if (ap2 != null) {
            ap2.l();
            k2.a(b2, ap2);
        }
    }

    @Override
    public ap a(k k2, int n2) {
        return new aa();
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        return this.v().a(a, (Comparable)((Object)l2.cl_().e()));
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, l l2, cu cu2) {
        ap ap2;
        k2.a(b2, b3.a(a, (Comparable)((Object)l2.cl_().e())), 2);
        if (cu2.s() && (ap2 = k2.q(b2)) instanceof aa) {
            ((aa)ap2).a(cu2.q());
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        ap ap2;
        if (!c && (ap2 = k2.q(b2)) instanceof aa) {
            net.minecraft.h.a.a(k2, b2, (y)((aa)ap2));
            k2.f(b2, this);
        }
        super.a(k2, b2, b3);
    }

    @Override
    public boolean c(b b2) {
        return true;
    }

    @Override
    public int b(b b2, k k2, net.minecraft.u.b.b b3) {
        return aq.a(k2.q(b3));
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(p.al);
    }

    @Override
    public ac a(b b2) {
        return ac.d;
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

    static /* synthetic */ int[] b() {
        if (d != null) {
            return d;
        }
        int[] arrn = new int[ad.values().length];
        try {
            arrn[ad.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.f.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        d = arrn;
        return arrn;
    }
}

