/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Random;
import java.util.Set;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.a.h;
import net.minecraft.g.b.e;
import net.minecraft.g.b.g;
import net.minecraft.g.bv;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cm;
import net.minecraft.g.cn;
import net.minecraft.g.gh;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ag;
import net.minecraft.u.aj;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.u.c;

public class ed
extends cn {
    public static final e a = net.minecraft.g.b.e.a("north", bv.class);
    public static final e b = net.minecraft.g.b.e.a("east", bv.class);
    public static final e c = net.minecraft.g.b.e.a("south", bv.class);
    public static final e d = net.minecraft.g.b.e.a("west", bv.class);
    public static final g e = net.minecraft.g.b.g.a("power", 0, 15);
    protected static final a[] f = new a[]{new a(0.1875, 0.0, 0.1875, 0.8125, 0.0625, 0.8125), new a(0.1875, 0.0, 0.1875, 0.8125, 0.0625, 1.0), new a(0.0, 0.0, 0.1875, 0.8125, 0.0625, 0.8125), new a(0.0, 0.0, 0.1875, 0.8125, 0.0625, 1.0), new a(0.1875, 0.0, 0.0, 0.8125, 0.0625, 0.8125), new a(0.1875, 0.0, 0.0, 0.8125, 0.0625, 1.0), new a(0.0, 0.0, 0.0, 0.8125, 0.0625, 0.8125), new a(0.0, 0.0, 0.0, 0.8125, 0.0625, 1.0), new a(0.1875, 0.0, 0.1875, 1.0, 0.0625, 0.8125), new a(0.1875, 0.0, 0.1875, 1.0, 0.0625, 1.0), new a(0.0, 0.0, 0.1875, 1.0, 0.0625, 0.8125), new a(0.0, 0.0, 0.1875, 1.0, 0.0625, 1.0), new a(0.1875, 0.0, 0.0, 1.0, 0.0625, 0.8125), new a(0.1875, 0.0, 0.0, 1.0, 0.0625, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.0625, 0.8125), new a(0.0, 0.0, 0.0, 1.0, 0.0625, 1.0)};
    private boolean g = true;
    private final Set h = aad.a();

    public ed() {
        super(net.minecraft.g.a.h.q);
        this.z(this.O.b().a(a, (Comparable)((Object)bv.c)).a(b, (Comparable)((Object)bv.c)).a(c, (Comparable)((Object)bv.c)).a(d, (Comparable)((Object)bv.c)).a(e, Integer.valueOf(0)));
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return f[ed.m(b2.b(n2, b3))];
    }

    private static int m(b b2) {
        boolean bl2;
        int n2 = 0;
        boolean bl3 = b2.a(a) != bv.c;
        boolean bl4 = b2.a(b) != bv.c;
        boolean bl5 = b2.a(c) != bv.c;
        boolean bl6 = bl2 = b2.a(d) != bv.c;
        if (bl3 || bl5 && !bl3 && !bl4 && !bl2) {
            n2 |= 1 << ad.c.c();
        }
        if (bl4 || bl2 && !bl3 && !bl4 && !bl5) {
            n2 |= 1 << ad.f.c();
        }
        if (bl5 || bl3 && !bl4 && !bl5 && !bl2) {
            n2 |= 1 << ad.d.c();
        }
        if (bl2 || bl4 && !bl3 && !bl5 && !bl2) {
            n2 |= 1 << ad.e.c();
        }
        return n2;
    }

    @Override
    public b b(b b2, n n2, net.minecraft.u.b.b b3) {
        b2 = b2.a(d, (Comparable)((Object)this.b(n2, b3, ad.e)));
        b2 = b2.a(b, (Comparable)((Object)this.b(n2, b3, ad.f)));
        b2 = b2.a(a, (Comparable)((Object)this.b(n2, b3, ad.c)));
        b2 = b2.a(c, (Comparable)((Object)this.b(n2, b3, ad.d)));
        return b2;
    }

    private bv b(n n2, net.minecraft.u.b.b b2, ad ad2) {
        net.minecraft.u.b.b b3 = b2.a(ad2);
        b b4 = n2.n(b2.a(ad2));
        if (!(ed.a(n2.n(b3), ad2) || !b4.o() && ed.l(n2.n(b3.c())))) {
            b b5 = n2.n(b2.b());
            if (!b5.o()) {
                boolean bl2;
                boolean bl3 = bl2 = n2.n(b3).t() || n2.n(b3).c() == p.aX;
                if (bl2 && ed.l(n2.n(b3.b()))) {
                    if (b4.n()) {
                        return bv.a;
                    }
                    return bv.b;
                }
            }
            return bv.c;
        }
        return bv.b;
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
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return k2.n(b2.c()).t() || k2.n(b2.c()).c() == p.aX;
    }

    private b e(k k2, net.minecraft.u.b.b b2, b b3) {
        b3 = this.a(k2, b2, b2, b3);
        ArrayList arrayList = ov.a(this.h);
        this.h.clear();
        for (net.minecraft.u.b.b b4 : arrayList) {
            k2.b(b4, this);
        }
        return b3;
    }

    private b a(k k2, net.minecraft.u.b.b b2, net.minecraft.u.b.b b3, b b4) {
        b b5 = b4;
        int n2 = (Integer)b4.a(e);
        int n3 = 0;
        n3 = this.a(k2, b3, n3);
        this.g = false;
        int n4 = k2.y(b2);
        this.g = true;
        if (n4 > 0 && n4 > n3 - 1) {
            n3 = n4;
        }
        int n5 = 0;
        for (ad ad2 : ag.a) {
            boolean bl2;
            net.minecraft.u.b.b b6 = b2.a(ad2);
            boolean bl3 = bl2 = b6.cy_() != b3.cy_() || b6.l() != b3.l();
            if (bl2) {
                n5 = this.a(k2, b6, n5);
            }
            if (k2.n(b6).o() && !k2.n(b2.b()).o()) {
                if (!bl2 || b2.k() < b3.k()) continue;
                n5 = this.a(k2, b6.b(), n5);
                continue;
            }
            if (k2.n(b6).o() || !bl2 || b2.k() > b3.k()) continue;
            n5 = this.a(k2, b6.c(), n5);
        }
        n3 = n5 > n3 ? n5 - 1 : (n3 > 0 ? --n3 : 0);
        if (n4 > n3 - 1) {
            n3 = n4;
        }
        if (n2 != n3) {
            b4 = b4.a(e, Integer.valueOf(n3));
            if (k2.n(b2) == b5) {
                k2.a(b2, b4, 2);
            }
            this.h.add(b2);
            for (ad ad2 : ad.values()) {
                this.h.add(b2.a(ad2));
            }
        }
        return b4;
    }

    private void c(k k2, net.minecraft.u.b.b b2) {
        if (k2.n(b2).c() == this) {
            k2.b(b2, this);
            for (ad ad2 : ad.values()) {
                k2.b(b2.a(ad2), this);
            }
        }
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        if (!k2.C) {
            this.e(k2, b2, b3);
            for (ad ad2 : ag.b) {
                k2.b(b2.a(ad2), this);
            }
            for (ad ad2 : ag.a) {
                this.c(k2, b2.a(ad2));
            }
            for (ad ad2 : ag.a) {
                net.minecraft.u.b.b b4 = b2.a(ad2);
                if (k2.n(b4).o()) {
                    this.c(k2, b4.b());
                    continue;
                }
                this.c(k2, b4.c());
            }
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        super.a(k2, b2, b3);
        if (!k2.C) {
            for (ad ad2 : ad.values()) {
                k2.b(b2.a(ad2), this);
            }
            this.e(k2, b2, b3);
            for (ad ad2 : ag.a) {
                this.c(k2, b2.a(ad2));
            }
            for (ad ad2 : ag.a) {
                net.minecraft.u.b.b b4 = b2.a(ad2);
                if (k2.n(b4).o()) {
                    this.c(k2, b4.b());
                    continue;
                }
                this.c(k2, b4.c());
            }
        }
    }

    private int a(k k2, net.minecraft.u.b.b b2, int n2) {
        if (k2.n(b2).c() != this) {
            return n2;
        }
        int n3 = (Integer)k2.n(b2).a(e);
        return n3 > n2 ? n3 : n2;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (!k2.C) {
            if (this.a_(k2, b3)) {
                this.e(k2, b3, b2);
            } else {
                this.b(k2, b3, b2, 0);
                k2.f(b3);
            }
        }
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.aE;
    }

    @Override
    public int c(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return !this.g ? 0 : b2.a(n2, b3, ad2);
    }

    @Override
    public int b(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        if (!this.g) {
            return 0;
        }
        int n3 = (Integer)b2.a(e);
        if (n3 == 0) {
            return 0;
        }
        if (ad2 == ad.b) {
            return n3;
        }
        EnumSet<ad> enumSet = EnumSet.noneOf(ad.class);
        for (ad ad3 : ag.a) {
            if (!this.c(n2, b3, ad3)) continue;
            enumSet.add(ad3);
        }
        if (ad2.l().d() && enumSet.isEmpty()) {
            return n3;
        }
        if (enumSet.contains(ad2) && !enumSet.contains(ad2.g()) && !enumSet.contains(ad2.f())) {
            return n3;
        }
        return 0;
    }

    private boolean c(n n2, net.minecraft.u.b.b b2, ad ad2) {
        net.minecraft.u.b.b b3 = b2.a(ad2);
        b b4 = n2.n(b3);
        boolean bl2 = b4.o();
        boolean bl3 = n2.n(b2.b()).o();
        return !bl3 && bl2 && ed.c(n2, b3.b()) ? true : (ed.a(b4, ad2) ? true : (b4.c() == p.bc && b4.a(gh.j) == ad2 ? true : !bl2 && ed.c(n2, b3.c())));
    }

    protected static boolean c(n n2, net.minecraft.u.b.b b2) {
        return ed.l(n2.n(b2));
    }

    protected static boolean l(b b2) {
        return ed.a(b2, null);
    }

    protected static boolean a(b b2, ad ad2) {
        cn cn2 = b2.c();
        if (cn2 == p.af) {
            return true;
        }
        if (p.bb.C(b2)) {
            ad ad3 = (ad)((Object)b2.a(cm.j));
            return ad3 == ad2 || ad3.e() == ad2;
        }
        return b2.p() && ad2 != null;
    }

    @Override
    public boolean f(b b2) {
        return this.g;
    }

    public static int b(int n2) {
        float f2 = (float)n2 / 15.0f;
        float f3 = f2 * 0.6f + 0.4f;
        if (n2 == 0) {
            f3 = 0.3f;
        }
        float f4 = f2 * f2 * 0.7f - 0.5f;
        float f5 = f2 * f2 * 0.6f - 0.7f;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        int n3 = net.minecraft.u.b.n.a((int)(f3 * 255.0f), 0, 255);
        int n4 = net.minecraft.u.b.n.a((int)(f4 * 255.0f), 0, 255);
        int n5 = net.minecraft.u.b.n.a((int)(f5 * 255.0f), 0, 255);
        return 0xFF000000 | n3 << 16 | n4 << 8 | n5;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        int n2 = (Integer)b2.a(e);
        if (n2 != 0) {
            double d2 = (double)b3.cy_() + 0.5 + ((double)random.nextFloat() - 0.5) * 0.2;
            double d3 = (float)b3.k() + 0.0625f;
            double d4 = (double)b3.l() + 0.5 + ((double)random.nextFloat() - 0.5) * 0.2;
            float f2 = (float)n2 / 15.0f;
            float f3 = f2 * 0.6f + 0.4f;
            float f4 = Math.max(0.0f, f2 * f2 * 0.7f - 0.5f);
            float f5 = Math.max(0.0f, f2 * f2 * 0.6f - 0.7f);
            k2.a(aj.E, d2, d3, d4, (double)f3, (double)f4, (double)f5, new int[0]);
        }
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(net.minecraft.a.w.aE);
    }

    @Override
    public c bR_() {
        return net.minecraft.u.c.c;
    }

    @Override
    public b a(int n2) {
        return this.v().a(e, Integer.valueOf(n2));
    }

    @Override
    public int b(b b2) {
        return (Integer)b2.a(e);
    }

    @Override
    public b a(b b2, bq bq2) {
        switch (bq2) {
            case c: {
                return b2.a(a, (Comparable)((Object)((bv)((Object)b2.a(c))))).a(b, (Comparable)((Object)((bv)((Object)b2.a(d))))).a(c, (Comparable)((Object)((bv)((Object)b2.a(a))))).a(d, (Comparable)((Object)((bv)((Object)b2.a(b)))));
            }
            case d: {
                return b2.a(a, (Comparable)((Object)((bv)((Object)b2.a(b))))).a(b, (Comparable)((Object)((bv)((Object)b2.a(c))))).a(c, (Comparable)((Object)((bv)((Object)b2.a(d))))).a(d, (Comparable)((Object)((bv)((Object)b2.a(a)))));
            }
            case b: {
                return b2.a(a, (Comparable)((Object)((bv)((Object)b2.a(d))))).a(b, (Comparable)((Object)((bv)((Object)b2.a(a))))).a(c, (Comparable)((Object)((bv)((Object)b2.a(b))))).a(d, (Comparable)((Object)((bv)((Object)b2.a(c)))));
            }
        }
        return b2;
    }

    @Override
    public b a(b b2, bi bi2) {
        switch (bi2) {
            case b: {
                return b2.a(a, (Comparable)((Object)((bv)((Object)b2.a(c))))).a(c, (Comparable)((Object)((bv)((Object)b2.a(a)))));
            }
            case c: {
                return b2.a(b, (Comparable)((Object)((bv)((Object)b2.a(d))))).a(d, (Comparable)((Object)((bv)((Object)b2.a(b)))));
            }
        }
        return super.a(b2, bi2);
    }

    @Override
    protected i a() {
        return new i(this, a, b, c, d, e);
    }
}

