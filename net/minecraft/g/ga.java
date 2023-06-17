/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.a.b;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.b.f;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.de;
import net.minecraft.g.ew;
import net.minecraft.g.fw;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;

public class ga
extends cn {
    public static final f a = de.j;
    public static final c b = net.minecraft.g.b.c.b("open");
    public static final net.minecraft.g.b.e c = net.minecraft.g.b.e.a("hinge", fw.class);
    public static final c d = net.minecraft.g.b.c.b("powered");
    public static final net.minecraft.g.b.e e = net.minecraft.g.b.e.a("half", ew.class);
    protected static final a f = new a(0.0, 0.0, 0.0, 1.0, 1.0, 0.1875);
    protected static final a g = new a(0.0, 0.0, 0.8125, 1.0, 1.0, 1.0);
    protected static final a h = new a(0.8125, 0.0, 0.0, 1.0, 1.0, 1.0);
    protected static final a i = new a(0.0, 0.0, 0.0, 0.1875, 1.0, 1.0);
    private static /* synthetic */ int[] j;

    protected ga(h h2) {
        super(h2);
        this.z(this.O.b().a(a, (Comparable)((Object)ad.c)).a(b, Boolean.valueOf(false)).a(c, (Comparable)((Object)fw.a)).a(d, Boolean.valueOf(false)).a(e, (Comparable)((Object)ew.b)));
    }

    @Override
    public a a(net.minecraft.g.c.b b2, n n2, net.minecraft.u.b.b b3) {
        b2 = b2.b(n2, b3);
        ad ad2 = (ad)((Object)b2.a(a));
        boolean bl2 = (Boolean)b2.a(b) == false;
        boolean bl3 = b2.a(c) == fw.b;
        switch (ga.h()[ad2.ordinal()]) {
            default: {
                return bl2 ? i : (bl3 ? g : f);
            }
            case 4: {
                return bl2 ? f : (bl3 ? i : h);
            }
            case 5: {
                return bl2 ? h : (bl3 ? f : g);
            }
            case 3: 
        }
        return bl2 ? g : (bl3 ? h : i);
    }

    @Override
    public String bV_() {
        return net.minecraft.u.d.b.a.a((String.valueOf(this.p()) + ".name").replaceAll("tile", "item"));
    }

    @Override
    public boolean d(net.minecraft.g.c.b b2) {
        return false;
    }

    @Override
    public boolean a(n n2, net.minecraft.u.b.b b2) {
        return ga.g(ga.c(n2, b2));
    }

    @Override
    public boolean e(net.minecraft.g.c.b b2) {
        return false;
    }

    private int i() {
        return this.L == net.minecraft.g.a.h.f ? 1011 : 1012;
    }

    private int j() {
        return this.L == net.minecraft.g.a.h.f ? 1005 : 1006;
    }

    @Override
    public e g(net.minecraft.g.c.b b2) {
        return b2.c() == p.aA ? net.minecraft.g.a.e.h : (b2.c() == p.ao ? net.minecraft.g.b.a.c() : (b2.c() == p.ap ? net.minecraft.g.b.b.c() : (b2.c() == p.aq ? net.minecraft.g.b.c.c() : (b2.c() == p.ar ? net.minecraft.g.b.d.c() : (b2.c() == p.as ? net.minecraft.g.b.e.c() : (b2.c() == p.at ? net.minecraft.g.b.f.c() : super.g(b2)))))));
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        net.minecraft.g.c.b b5;
        if (this.L == net.minecraft.g.a.h.f) {
            return true;
        }
        net.minecraft.u.b.b b6 = b3.a(e) == ew.b ? b2 : b2.c();
        net.minecraft.g.c.b b7 = b5 = b2.equals(b6) ? b3 : k2.n(b6);
        if (b5.c() != this) {
            return false;
        }
        b3 = b5.b(b);
        k2.a(b6, b3, 10);
        k2.b(b6, b2);
        k2.a(b4, (Boolean)b3.a(b) != false ? this.j() : this.i(), b2, 0);
        return true;
    }

    public void a(k k2, net.minecraft.u.b.b b2, boolean bl2) {
        net.minecraft.g.c.b b3 = k2.n(b2);
        if (b3.c() == this) {
            net.minecraft.g.c.b b4;
            net.minecraft.u.b.b b5 = b3.a(e) == ew.b ? b2 : b2.c();
            net.minecraft.g.c.b b6 = b4 = b2 == b5 ? b3 : k2.n(b5);
            if (b4.c() == this && (Boolean)b4.a(b) != bl2) {
                k2.a(b5, b4.a(b, Boolean.valueOf(bl2)), 10);
                k2.b(b5, b2);
                k2.a(null, bl2 ? this.j() : this.i(), b2, 0);
            }
        }
    }

    @Override
    public void a(net.minecraft.g.c.b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (b2.a(e) == ew.a) {
            net.minecraft.u.b.b b4 = b3.c();
            net.minecraft.g.c.b b5 = k2.n(b4);
            if (b5.c() != this) {
                k2.f(b3);
            } else if (cn2 != this) {
                b5.a(k2, b4, cn2);
            }
        } else {
            boolean bl2 = false;
            net.minecraft.u.b.b b6 = b3.b();
            net.minecraft.g.c.b b7 = k2.n(b6);
            if (b7.c() != this) {
                k2.f(b3);
                bl2 = true;
            }
            if (!k2.n(b3.c()).t()) {
                k2.f(b3);
                bl2 = true;
                if (b7.c() == this) {
                    k2.f(b6);
                }
            }
            if (bl2) {
                if (!k2.C) {
                    this.b(k2, b3, b2, 0);
                }
            } else {
                boolean bl3;
                boolean bl4 = bl3 = k2.x(b3) || k2.x(b6);
                if (cn2 != this && (bl3 || cn2.v().p()) && bl3 != (Boolean)b7.a(d)) {
                    k2.a(b6, b7.a(d, Boolean.valueOf(bl3)), 2);
                    if (bl3 != (Boolean)b2.a(b)) {
                        k2.a(b3, b2.a(b, Boolean.valueOf(bl3)), 2);
                        k2.b(b3, b3);
                        k2.a(null, bl3 ? this.j() : this.i(), b3, 0);
                    }
                }
            }
        }
    }

    @Override
    public cg a(net.minecraft.g.c.b b2, Random random, int n2) {
        return b2.a(e) == ew.a ? null : this.k();
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return b2.k() >= 255 ? false : k2.n(b2.c()).t() && super.a_(k2, b2) && super.a_(k2, b2.b());
    }

    @Override
    public b a_(net.minecraft.g.c.b b2) {
        return net.minecraft.g.a.b.b;
    }

    public static int c(n n2, net.minecraft.u.b.b b2) {
        net.minecraft.g.c.b b3 = n2.n(b2);
        int n3 = b3.c().b(b3);
        boolean bl2 = ga.h(n3);
        net.minecraft.g.c.b b4 = n2.n(b2.c());
        int n4 = b4.c().b(b4);
        int n5 = bl2 ? n4 : n3;
        net.minecraft.g.c.b b5 = n2.n(b2.b());
        int n6 = b5.c().b(b5);
        int n7 = bl2 ? n3 : n6;
        boolean bl3 = (n7 & 1) != 0;
        boolean bl4 = (n7 & 2) != 0;
        return ga.b(n5) | (bl2 ? 8 : 0) | (bl3 ? 16 : 0) | (bl4 ? 32 : 0);
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3) {
        return new cu(this.k());
    }

    private cg k() {
        return this == p.aA ? net.minecraft.a.w.aD : (this == p.ap ? net.minecraft.a.w.at : (this == p.aq ? net.minecraft.a.w.au : (this == p.ar ? net.minecraft.a.w.av : (this == p.as ? net.minecraft.a.w.aw : (this == p.at ? net.minecraft.a.w.ax : net.minecraft.a.w.as)))));
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, net.minecraft.w.a.b b4) {
        net.minecraft.u.b.b b5 = b2.c();
        net.minecraft.u.b.b b6 = b2.b();
        if (b4.J.d && b3.a(e) == ew.a && k2.n(b5).c() == this) {
            k2.f(b5);
        }
        if (b3.a(e) == ew.b && k2.n(b6).c() == this) {
            if (b4.J.d) {
                k2.f(b2);
            }
            k2.f(b6);
        }
    }

    @Override
    public net.minecraft.u.c bR_() {
        return net.minecraft.u.c.c;
    }

    @Override
    public net.minecraft.g.c.b b(net.minecraft.g.c.b b2, n n2, net.minecraft.u.b.b b3) {
        if (b2.a(e) == ew.b) {
            net.minecraft.g.c.b b4 = n2.n(b3.b());
            if (b4.c() == this) {
                b2 = b2.a(c, (Comparable)((Object)((fw)((Object)b4.a(c))))).a(d, (Boolean)b4.a(d));
            }
        } else {
            net.minecraft.g.c.b b5 = n2.n(b3.c());
            if (b5.c() == this) {
                b2 = b2.a(a, (Comparable)((Object)((ad)((Object)b5.a(a))))).a(b, (Boolean)b5.a(b));
            }
        }
        return b2;
    }

    @Override
    public net.minecraft.g.c.b a(net.minecraft.g.c.b b2, bq bq2) {
        return b2.a(e) != ew.b ? b2 : b2.a(a, (Comparable)((Object)bq2.a((ad)((Object)b2.a(a)))));
    }

    @Override
    public net.minecraft.g.c.b a(net.minecraft.g.c.b b2, bi bi2) {
        return bi2 == bi.a ? b2 : b2.a(bi2.a((ad)((Object)b2.a(a)))).b(c);
    }

    @Override
    public net.minecraft.g.c.b a(int n2) {
        return (n2 & 8) > 0 ? this.v().a(e, (Comparable)((Object)ew.a)).a(c, (Comparable)((Object)((n2 & 1) > 0 ? fw.b : fw.a))).a(d, Boolean.valueOf((n2 & 2) > 0)) : this.v().a(e, (Comparable)((Object)ew.b)).a(a, (Comparable)((Object)ad.b(n2 & 3).g())).a(b, Boolean.valueOf((n2 & 4) > 0));
    }

    @Override
    public int b(net.minecraft.g.c.b b2) {
        int n2 = 0;
        if (b2.a(e) == ew.a) {
            n2 |= 8;
            if (b2.a(c) == fw.b) {
                n2 |= 1;
            }
            if (((Boolean)b2.a(d)).booleanValue()) {
                n2 |= 2;
            }
        } else {
            n2 |= ((ad)((Object)b2.a(a))).f().c();
            if (((Boolean)b2.a(b)).booleanValue()) {
                n2 |= 4;
            }
        }
        return n2;
    }

    protected static int b(int n2) {
        return n2 & 7;
    }

    public static boolean d(n n2, net.minecraft.u.b.b b2) {
        return ga.g(ga.c(n2, b2));
    }

    public static ad e(n n2, net.minecraft.u.b.b b2) {
        return ga.c(ga.c(n2, b2));
    }

    public static ad c(int n2) {
        return ad.b(n2 & 3).g();
    }

    protected static boolean g(int n2) {
        return (n2 & 4) != 0;
    }

    protected static boolean h(int n2) {
        return (n2 & 8) != 0;
    }

    @Override
    protected i a() {
        return new i(this, e, a, b, c, d);
    }

    static /* synthetic */ int[] h() {
        if (j != null) {
            return j;
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
        j = arrn;
        return arrn;
    }
}

