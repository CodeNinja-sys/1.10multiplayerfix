/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.u;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;

public class cc
extends cn {
    public static final c a = net.minecraft.g.b.c.b("powered");
    public static final c b = net.minecraft.g.b.c.b("attached");
    public static final c c = net.minecraft.g.b.c.b("disarmed");
    public static final c d = net.minecraft.g.b.c.b("north");
    public static final c e = net.minecraft.g.b.c.b("east");
    public static final c f = net.minecraft.g.b.c.b("south");
    public static final c g = net.minecraft.g.b.c.b("west");
    protected static final a h = new a(0.0, 0.0625, 0.0, 1.0, 0.15625, 1.0);
    protected static final a i = new a(0.0, 0.0, 0.0, 1.0, 0.5, 1.0);

    public cc() {
        super(net.minecraft.g.a.h.q);
        this.z(this.O.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)).a(g, Boolean.valueOf(false)));
        this.b(true);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return (Boolean)b2.a(b) == false ? i : h;
    }

    @Override
    public b b(b b2, n n2, net.minecraft.u.b.b b3) {
        return b2.a(d, Boolean.valueOf(cc.a(n2, b3, b2, ad.c))).a(e, Boolean.valueOf(cc.a(n2, b3, b2, ad.f))).a(f, Boolean.valueOf(cc.a(n2, b3, b2, ad.d))).a(g, Boolean.valueOf(cc.a(n2, b3, b2, ad.e)));
    }

    @Override
    public a a(b b2, k k2, net.minecraft.u.b.b b3) {
        return y;
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
    public net.minecraft.u.c bR_() {
        return net.minecraft.u.c.d;
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.H;
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(net.minecraft.a.w.H);
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        k2.a(b2, b3, 3);
        this.e(k2, b2, b3);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        this.e(k2, b2, b3.a(a, Boolean.valueOf(true)));
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4) {
        if (!k2.C && b4.bC() != null && b4.bC().a() == net.minecraft.a.w.bl) {
            k2.a(b2, b3.a(c, Boolean.valueOf(true)), 4);
        }
    }

    private void e(k k2, net.minecraft.u.b.b b2, b b3) {
        block0: for (ad ad2 : new ad[]{ad.d, ad.e}) {
            for (int i2 = 1; i2 < 42; ++i2) {
                net.minecraft.u.b.b b4 = b2.a(ad2, i2);
                b b5 = k2.n(b4);
                if (b5.c() == p.bR) {
                    if (b5.a(u.a) != ad2.e()) continue block0;
                    p.bR.a(k2, b4, b5, false, true, i2, b3);
                    continue block0;
                }
                if (b5.c() != p.bS) continue block0;
            }
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.n n2) {
        if (!k2.C && !((Boolean)b3.a(a)).booleanValue()) {
            this.c(k2, b2);
        }
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (!k2.C && ((Boolean)k2.n(b2).a(a)).booleanValue()) {
            this.c(k2, b2);
        }
    }

    private void c(k k2, net.minecraft.u.b.b b2) {
        b b3 = k2.n(b2);
        boolean bl2 = (Boolean)b3.a(a);
        boolean bl3 = false;
        List list = k2.b(null, b3.c((n)k2, b2).a(b2));
        if (!list.isEmpty()) {
            for (net.minecraft.w.n n2 : list) {
                if (n2.cK()) continue;
                bl3 = true;
                break;
            }
        }
        if (bl3 != bl2) {
            b3 = b3.a(a, Boolean.valueOf(bl3));
            k2.a(b2, b3, 3);
            this.e(k2, b2, b3);
        }
        if (bl3) {
            k2.a(new net.minecraft.u.b.b(b2), (cn)this, this.a(k2));
        }
    }

    public static boolean a(n n2, net.minecraft.u.b.b b2, b b3, ad ad2) {
        net.minecraft.u.b.b b4 = b2.a(ad2);
        b b5 = n2.n(b4);
        cn cn2 = b5.c();
        if (cn2 == p.bR) {
            ad ad3 = ad2.e();
            return b5.a(u.a) == ad3;
        }
        return cn2 == p.bS;
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, Boolean.valueOf((n2 & 1) > 0)).a(b, Boolean.valueOf((n2 & 4) > 0)).a(c, Boolean.valueOf((n2 & 8) > 0));
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        if (((Boolean)b2.a(a)).booleanValue()) {
            n2 |= 1;
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
    public b a(b b2, bq bq2) {
        switch (bq2) {
            case c: {
                return b2.a(d, (Boolean)b2.a(f)).a(e, (Boolean)b2.a(g)).a(f, (Boolean)b2.a(d)).a(g, (Boolean)b2.a(e));
            }
            case d: {
                return b2.a(d, (Boolean)b2.a(e)).a(e, (Boolean)b2.a(f)).a(f, (Boolean)b2.a(g)).a(g, (Boolean)b2.a(d));
            }
            case b: {
                return b2.a(d, (Boolean)b2.a(g)).a(e, (Boolean)b2.a(d)).a(f, (Boolean)b2.a(e)).a(g, (Boolean)b2.a(f));
            }
        }
        return b2;
    }

    @Override
    public b a(b b2, bi bi2) {
        switch (bi2) {
            case b: {
                return b2.a(d, (Boolean)b2.a(f)).a(f, (Boolean)b2.a(d));
            }
            case c: {
                return b2.a(e, (Boolean)b2.a(g)).a(g, (Boolean)b2.a(e));
            }
        }
        return super.a(b2, bi2);
    }

    @Override
    protected i a() {
        return new i(this, a, b, c, d, e, g, f);
    }
}

