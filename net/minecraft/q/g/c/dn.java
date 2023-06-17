/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.an;
import net.minecraft.g.ap;
import net.minecraft.g.bg;
import net.minecraft.g.bi;
import net.minecraft.g.c.b;
import net.minecraft.g.ep;
import net.minecraft.g.es;
import net.minecraft.g.ga;
import net.minecraft.g.s;
import net.minecraft.q.g.c.ak;
import net.minecraft.q.g.c.aw;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.b.g;
import net.minecraft.w.e.af;
import net.minecraft.w.e.d;
import net.minecraft.w.t;

abstract class dn
extends r {
    protected int i = -1;
    private int a;
    protected int j;
    protected boolean k;
    private static /* synthetic */ int[] d;

    public dn() {
    }

    protected dn(ak ak2, int n2) {
        super(n2);
        if (ak2 != null) {
            this.j = ak2.j;
            this.k = ak2.k;
        }
    }

    @Override
    protected void a(e e2) {
        e2.a("HPos", this.i);
        e2.a("VCount", this.a);
        e2.a("Type", (byte)this.j);
        e2.a("Zombie", this.k);
    }

    @Override
    protected void b(e e2) {
        this.i = e2.h("HPos");
        this.a = e2.h("VCount");
        this.j = e2.f("Type");
        if (e2.p("Desert")) {
            this.j = 1;
        }
        this.k = e2.p("Zombie");
    }

    protected r a(ak ak2, List list, Random random, int n2, int n3) {
        ad ad2 = this.i();
        if (ad2 != null) {
            switch (dn.c()[ad2.ordinal()]) {
                default: {
                    return aw.b(ak2, list, random, this.b.a - 1, this.b.b + n2, this.b.c + n3, ad.e, this.g());
                }
                case 4: {
                    return aw.b(ak2, list, random, this.b.a - 1, this.b.b + n2, this.b.c + n3, ad.e, this.g());
                }
                case 5: {
                    return aw.b(ak2, list, random, this.b.a + n3, this.b.b + n2, this.b.c - 1, ad.c, this.g());
                }
                case 6: 
            }
            return aw.b(ak2, list, random, this.b.a + n3, this.b.b + n2, this.b.c - 1, ad.c, this.g());
        }
        return null;
    }

    protected r b(ak ak2, List list, Random random, int n2, int n3) {
        ad ad2 = this.i();
        if (ad2 != null) {
            switch (dn.c()[ad2.ordinal()]) {
                default: {
                    return aw.b(ak2, list, random, this.b.d + 1, this.b.b + n2, this.b.c + n3, ad.f, this.g());
                }
                case 4: {
                    return aw.b(ak2, list, random, this.b.d + 1, this.b.b + n2, this.b.c + n3, ad.f, this.g());
                }
                case 5: {
                    return aw.b(ak2, list, random, this.b.a + n3, this.b.b + n2, this.b.f + 1, ad.d, this.g());
                }
                case 6: 
            }
            return aw.b(ak2, list, random, this.b.a + n3, this.b.b + n2, this.b.f + 1, ad.d, this.g());
        }
        return null;
    }

    protected int b(k k2, dc dc2) {
        int n2 = 0;
        int n3 = 0;
        g g2 = new g();
        for (int i2 = this.b.c; i2 <= this.b.f; ++i2) {
            for (int i3 = this.b.a; i3 <= this.b.d; ++i3) {
                g2.b(i3, 64, i2);
                if (!dc2.a(g2)) continue;
                n2 += Math.max(k2.p(g2).k(), k2.q.j() - 1);
                ++n3;
            }
        }
        if (n3 == 0) {
            return -1;
        }
        return n2 / n3;
    }

    protected static boolean a(dc dc2) {
        return dc2 != null && dc2.b > 10;
    }

    protected void a(k k2, dc dc2, int n2, int n3, int n4, int n5) {
        if (this.a < n5) {
            for (int i2 = this.a; i2 < n5; ++i2) {
                t t2;
                int n6;
                int n7;
                int n8 = this.a(n2 + i2, n4);
                if (!dc2.a(new net.minecraft.u.b.b(n8, n7 = this.a(n3), n6 = this.b(n2 + i2, n4)))) break;
                ++this.a;
                if (this.k) {
                    t2 = new d(k2);
                    t2.b((double)n8 + 0.5, n7, (double)n6 + 0.5, 0.0f, 0.0f);
                    ((d)t2).a(k2.C(new net.minecraft.u.b.b(t2)), null);
                    ((d)t2).a(af.b(this.c(i2, 0)));
                    t2.aJ();
                    k2.a(t2);
                    continue;
                }
                if (net.minecraft.client.r.I == null || net.minecraft.client.r.I.a(new net.minecraft.u.b.s(n8, n7, n6))) continue;
                t2 = new net.minecraft.w.h.ak(k2);
                t2.b((double)n8 + 0.5, n7, (double)n6 + 0.5, 0.0f, 0.0f);
                ((net.minecraft.w.h.ak)t2).a(k2.C(new net.minecraft.u.b.b(t2)), null);
                ((net.minecraft.w.h.ak)t2).b(this.c(i2, ((net.minecraft.w.h.ak)t2).p()));
                k2.a(t2);
            }
        }
    }

    protected int c(int n2, int n3) {
        return n3;
    }

    protected b a(b b2) {
        if (this.j == 1) {
            if (b2.c() == p.r || b2.c() == p.s) {
                return p.A.v();
            }
            if (b2.c() == p.e) {
                return p.A.a(net.minecraft.g.r.a.b());
            }
            if (b2.c() == p.f) {
                return p.A.a(net.minecraft.g.r.c.b());
            }
            if (b2.c() == p.ad) {
                return p.bO.v().a(bi.a, (Comparable)((Object)((ad)((Object)b2.a(bi.a)))));
            }
            if (b2.c() == p.aw) {
                return p.bO.v().a(bi.a, (Comparable)((Object)((ad)((Object)b2.a(bi.a)))));
            }
            if (b2.c() == p.n) {
                return p.A.v();
            }
        } else if (this.j == 3) {
            if (b2.c() == p.r || b2.c() == p.s) {
                return p.r.v().a(s.a, (Comparable)((Object)net.minecraft.g.b.b)).a(an.b, (Comparable)((Object)((bg)((Object)b2.a(an.b)))));
            }
            if (b2.c() == p.f) {
                return p.f.v().a(ep.a, (Comparable)((Object)net.minecraft.g.b.b));
            }
            if (b2.c() == p.ad) {
                return p.bU.v().a(bi.a, (Comparable)((Object)((ad)((Object)b2.a(bi.a)))));
            }
            if (b2.c() == p.aO) {
                return p.aP.v();
            }
        } else if (this.j == 2) {
            if (b2.c() == p.r || b2.c() == p.s) {
                return p.s.v().a(es.a, (Comparable)((Object)net.minecraft.g.b.e)).a(an.b, (Comparable)((Object)((bg)((Object)b2.a(an.b)))));
            }
            if (b2.c() == p.f) {
                return p.f.v().a(ep.a, (Comparable)((Object)net.minecraft.g.b.e));
            }
            if (b2.c() == p.ad) {
                return p.cC.v().a(bi.a, (Comparable)((Object)((ad)((Object)b2.a(bi.a)))));
            }
            if (b2.c() == p.e) {
                return p.s.v().a(es.a, (Comparable)((Object)net.minecraft.g.b.e)).a(an.b, (Comparable)((Object)bg.b));
            }
            if (b2.c() == p.aO) {
                return p.aT.v();
            }
        }
        return b2;
    }

    protected ga b() {
        switch (this.j) {
            case 2: {
                return p.as;
            }
            case 3: {
                return p.ap;
            }
        }
        return p.ao;
    }

    protected void a(k k2, dc dc2, Random random, int n2, int n3, int n4, ad ad2) {
        if (!this.k) {
            this.a(k2, dc2, random, n2, n3, n4, ad.c, this.b());
        }
    }

    protected void a(k k2, ad ad2, int n2, int n3, int n4, dc dc2) {
        if (!this.k) {
            this.a(k2, p.aa.v().a(ap.a, (Comparable)((Object)ad2)), n2, n3, n4, dc2);
        }
    }

    @Override
    protected void b(k k2, b b2, int n2, int n3, int n4, dc dc2) {
        b b3 = this.a(b2);
        super.b(k2, b3, n2, n3, n4, dc2);
    }

    protected void b(int n2) {
        this.j = n2;
    }

    static /* synthetic */ int[] c() {
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

