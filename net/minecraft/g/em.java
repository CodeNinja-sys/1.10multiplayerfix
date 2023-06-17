/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.f.ap;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.r.o;
import net.minecraft.u.ad;
import net.minecraft.u.ag;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class em
extends cn {
    public static final c a = net.minecraft.g.b.c.b("up");
    public static final c b = net.minecraft.g.b.c.b("north");
    public static final c c = net.minecraft.g.b.c.b("east");
    public static final c d = net.minecraft.g.b.c.b("south");
    public static final c e = net.minecraft.g.b.c.b("west");
    public static final c[] f = new c[]{a, b, d, e, c};
    protected static final a g = new a(0.0, 0.9375, 0.0, 1.0, 1.0, 1.0);
    protected static final a h = new a(0.0, 0.0, 0.0, 0.0625, 1.0, 1.0);
    protected static final a i = new a(0.9375, 0.0, 0.0, 1.0, 1.0, 1.0);
    protected static final a j = new a(0.0, 0.0, 0.0, 1.0, 1.0, 0.0625);
    protected static final a k = new a(0.0, 0.0, 0.9375, 1.0, 1.0, 1.0);

    public em() {
        super(net.minecraft.g.a.h.l);
        this.z(this.O.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
        this.b(true);
        this.a(net.minecraft.v.d.c);
    }

    @Override
    public a a(b b2, k k2, net.minecraft.u.b.b b3) {
        return y;
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        b2 = b2.b(n2, b3);
        int n3 = 0;
        a a2 = x;
        if (((Boolean)b2.a(a)).booleanValue()) {
            a2 = g;
            ++n3;
        }
        if (((Boolean)b2.a(b)).booleanValue()) {
            a2 = j;
            ++n3;
        }
        if (((Boolean)b2.a(c)).booleanValue()) {
            a2 = i;
            ++n3;
        }
        if (((Boolean)b2.a(d)).booleanValue()) {
            a2 = k;
            ++n3;
        }
        if (((Boolean)b2.a(e)).booleanValue()) {
            a2 = h;
            ++n3;
        }
        return n3 == 1 ? a2 : x;
    }

    @Override
    public b b(b b2, n n2, net.minecraft.u.b.b b3) {
        return b2.a(a, Boolean.valueOf(n2.n(b3.b()).n()));
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
    public boolean b(n n2, net.minecraft.u.b.b b2) {
        return true;
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2, ad ad2) {
        switch (ad2) {
            case b: {
                return this.m(k2.n(b2.b()));
            }
            case c: 
            case d: 
            case e: 
            case f: {
                return this.m(k2.n(b2.a(ad2.e())));
            }
        }
        return false;
    }

    private boolean m(b b2) {
        return b2.k() && b2.d().c();
    }

    private boolean e(k k2, net.minecraft.u.b.b b2, b b3) {
        b b4 = b3;
        for (ad ad2 : ag.a) {
            b b5;
            c c2 = em.a(ad2);
            if (!((Boolean)b3.a(c2)).booleanValue() || this.m(k2.n(b2.a(ad2))) || (b5 = k2.n(b2.b())).c() == this && ((Boolean)b5.a(c2)).booleanValue()) continue;
            b3 = b3.a(c2, Boolean.valueOf(false));
        }
        if (em.l(b3) == 0) {
            return false;
        }
        if (b4 != b3) {
            k2.a(b2, b3, 2);
        }
        return true;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (!k2.C && !this.e(k2, b3, b2)) {
            this.b(k2, b3, b2, 0);
            k2.f(b3);
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (!k2.C && k2.p.nextInt(4) == 0) {
            int n2 = 4;
            int n3 = 5;
            boolean bl2 = false;
            block0: for (int i2 = -4; i2 <= 4; ++i2) {
                for (int i3 = -4; i3 <= 4; ++i3) {
                    for (int i4 = -1; i4 <= 1; ++i4) {
                        if (k2.n(b2.a(i2, i4, i3)).c() != this || --n3 > 0) continue;
                        bl2 = true;
                        break block0;
                    }
                }
            }
            ad ad2 = ad.a(random);
            net.minecraft.u.b.b b4 = b2.b();
            if (ad2 == ad.b && b2.k() < 255 && k2.c(b4)) {
                if (!bl2) {
                    b b5 = b3;
                    for (ad ad3 : ag.a) {
                        if (!random.nextBoolean() && this.m(k2.n(b4.a(ad3)))) continue;
                        b5 = b5.a(em.a(ad3), Boolean.valueOf(false));
                    }
                    if (((Boolean)b5.a(b)).booleanValue() || ((Boolean)b5.a(c)).booleanValue() || ((Boolean)b5.a(d)).booleanValue() || ((Boolean)b5.a(e)).booleanValue()) {
                        k2.a(b4, b5, 2);
                    }
                }
            } else if (ad2.l().d() && !((Boolean)b3.a(em.a(ad2))).booleanValue()) {
                if (!bl2) {
                    net.minecraft.u.b.b b6 = b2.a(ad2);
                    b b7 = k2.n(b6);
                    cn cn2 = b7.c();
                    if (cn2.L == net.minecraft.g.a.h.a) {
                        ad ad4 = ad2.f();
                        ad ad5 = ad2.g();
                        boolean bl3 = (Boolean)b3.a(em.a(ad4));
                        boolean bl4 = (Boolean)b3.a(em.a(ad5));
                        net.minecraft.u.b.b b8 = b6.a(ad4);
                        net.minecraft.u.b.b b9 = b6.a(ad5);
                        if (bl3 && this.m(k2.n(b8))) {
                            k2.a(b6, this.v().a(em.a(ad4), Boolean.valueOf(true)), 2);
                        } else if (bl4 && this.m(k2.n(b9))) {
                            k2.a(b6, this.v().a(em.a(ad5), Boolean.valueOf(true)), 2);
                        } else if (bl3 && k2.c(b8) && this.m(k2.n(b2.a(ad4)))) {
                            k2.a(b8, this.v().a(em.a(ad2.e()), Boolean.valueOf(true)), 2);
                        } else if (bl4 && k2.c(b9) && this.m(k2.n(b2.a(ad5)))) {
                            k2.a(b9, this.v().a(em.a(ad2.e()), Boolean.valueOf(true)), 2);
                        } else if (this.m(k2.n(b6.b()))) {
                            k2.a(b6, this.v(), 2);
                        }
                    } else if (cn2.L.j() && b7.k()) {
                        k2.a(b2, b3.a(em.a(ad2), Boolean.valueOf(true)), 2);
                    }
                }
            } else if (b2.k() > 1) {
                net.minecraft.u.b.b b10 = b2.c();
                b b11 = k2.n(b10);
                cn cn3 = b11.c();
                if (cn3.L == net.minecraft.g.a.h.a) {
                    b b12 = b3;
                    for (ad ad6 : ag.a) {
                        if (!random.nextBoolean()) continue;
                        b12 = b12.a(em.a(ad6), Boolean.valueOf(false));
                    }
                    if (((Boolean)b12.a(b)).booleanValue() || ((Boolean)b12.a(c)).booleanValue() || ((Boolean)b12.a(d)).booleanValue() || ((Boolean)b12.a(e)).booleanValue()) {
                        k2.a(b10, b12, 2);
                    }
                } else if (cn3 == this) {
                    b b13 = b11;
                    for (ad ad7 : ag.a) {
                        c c2 = em.a(ad7);
                        if (!random.nextBoolean() || !((Boolean)b3.a(c2)).booleanValue()) continue;
                        b13 = b13.a(c2, Boolean.valueOf(true));
                    }
                    if (((Boolean)b13.a(b)).booleanValue() || ((Boolean)b13.a(c)).booleanValue() || ((Boolean)b13.a(d)).booleanValue() || ((Boolean)b13.a(e)).booleanValue()) {
                        k2.a(b10, b13, 2);
                    }
                }
            }
        }
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        b b3 = this.v().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false));
        return ad2.l().d() ? b3.a(em.a(ad2.e()), Boolean.valueOf(true)) : b3;
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(k k2, net.minecraft.w.a.b b2, net.minecraft.u.b.b b3, b b4, ap ap2, cu cu2) {
        if (!k2.C && cu2 != null && cu2.a() == net.minecraft.a.w.bl) {
            b2.a(o.a(this));
            em.a(k2, b3, new cu(p.bn, 1, 0));
        } else {
            super.a(k2, b2, b3, b4, ap2, cu2);
        }
    }

    @Override
    public net.minecraft.u.c bR_() {
        return net.minecraft.u.c.c;
    }

    @Override
    public b a(int n2) {
        return this.v().a(d, Boolean.valueOf((n2 & 1) > 0)).a(e, Boolean.valueOf((n2 & 2) > 0)).a(b, Boolean.valueOf((n2 & 4) > 0)).a(c, Boolean.valueOf((n2 & 8) > 0));
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        if (((Boolean)b2.a(d)).booleanValue()) {
            n2 |= 1;
        }
        if (((Boolean)b2.a(e)).booleanValue()) {
            n2 |= 2;
        }
        if (((Boolean)b2.a(b)).booleanValue()) {
            n2 |= 4;
        }
        if (((Boolean)b2.a(c)).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected i a() {
        return new i(this, a, b, c, d, e);
    }

    @Override
    public b a(b b2, bq bq2) {
        switch (bq2) {
            case c: {
                return b2.a(b, (Boolean)b2.a(d)).a(c, (Boolean)b2.a(e)).a(d, (Boolean)b2.a(b)).a(e, (Boolean)b2.a(c));
            }
            case d: {
                return b2.a(b, (Boolean)b2.a(c)).a(c, (Boolean)b2.a(d)).a(d, (Boolean)b2.a(e)).a(e, (Boolean)b2.a(b));
            }
            case b: {
                return b2.a(b, (Boolean)b2.a(e)).a(c, (Boolean)b2.a(b)).a(d, (Boolean)b2.a(c)).a(e, (Boolean)b2.a(d));
            }
        }
        return b2;
    }

    @Override
    public b a(b b2, bi bi2) {
        switch (bi2) {
            case b: {
                return b2.a(b, (Boolean)b2.a(d)).a(d, (Boolean)b2.a(b));
            }
            case c: {
                return b2.a(c, (Boolean)b2.a(e)).a(e, (Boolean)b2.a(c));
            }
        }
        return super.a(b2, bi2);
    }

    public static c a(ad ad2) {
        switch (ad2) {
            case b: {
                return a;
            }
            case c: {
                return b;
            }
            case d: {
                return d;
            }
            case f: {
                return c;
            }
            case e: {
                return e;
            }
        }
        throw new IllegalArgumentException(ad2 + " is an invalid choice");
    }

    public static int l(b b2) {
        int n2 = 0;
        c[] arrc = f;
        int n3 = f.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            c c2 = arrc[i2];
            if (!((Boolean)b2.a(c2)).booleanValue()) continue;
            ++n2;
        }
        return n2;
    }
}

