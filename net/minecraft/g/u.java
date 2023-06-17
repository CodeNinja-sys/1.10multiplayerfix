/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.b.f;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cc;
import net.minecraft.g.cn;
import net.minecraft.g.de;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ag;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.u.bu;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class u
extends cn {
    public static final f a = de.j;
    public static final c b = net.minecraft.g.b.c.b("powered");
    public static final c c = net.minecraft.g.b.c.b("attached");
    protected static final a d = new a(0.3125, 0.0, 0.625, 0.6875, 0.625, 1.0);
    protected static final a e = new a(0.3125, 0.0, 0.0, 0.6875, 0.625, 0.375);
    protected static final a f = new a(0.625, 0.0, 0.3125, 1.0, 0.625, 0.6875);
    protected static final a g = new a(0.0, 0.0, 0.3125, 0.375, 0.625, 0.6875);
    private static /* synthetic */ int[] h;

    public u() {
        super(net.minecraft.g.a.h.q);
        this.z(this.O.b().a(a, (Comparable)((Object)ad.c)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
        this.a(net.minecraft.v.d.d);
        this.b(true);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        switch (u.d()[((ad)((Object)b2.a(a))).ordinal()]) {
            default: {
                return g;
            }
            case 5: {
                return f;
            }
            case 4: {
                return e;
            }
            case 3: 
        }
        return d;
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
    public boolean a_(k k2, net.minecraft.u.b.b b2, ad ad2) {
        return ad2.l().d() && k2.n(b2.a(ad2.e())).o();
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        for (ad ad2 : ag.a) {
            if (!k2.n(b2.a(ad2)).o()) continue;
            return true;
        }
        return false;
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        b b3 = this.v().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false));
        if (ad2.l().d()) {
            b3 = b3.a(a, (Comparable)((Object)ad2));
        }
        return b3;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, l l2, cu cu2) {
        this.a(k2, b2, b3, false, false, -1, null);
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        ad ad2;
        if (cn2 != this && this.e(k2, b3, b2) && !k2.n(b3.a((ad2 = (ad)((Object)b2.a(a))).e())).o()) {
            this.b(k2, b3, b2, 0);
            k2.f(b3);
        }
    }

    public void a(k k2, net.minecraft.u.b.b b2, b b3, boolean bl2, boolean bl3, int n2, b b4) {
        Object object;
        net.minecraft.u.b.b b5;
        ad ad2 = (ad)((Object)b3.a(a));
        boolean bl4 = (Boolean)b3.a(c);
        boolean bl5 = (Boolean)b3.a(b);
        boolean bl6 = !bl2;
        boolean bl7 = false;
        int n3 = 0;
        b[] arrb = new b[42];
        for (int i2 = 1; i2 < 42; ++i2) {
            b5 = b2.a(ad2, i2);
            object = k2.n(b5);
            if (object.c() == p.bR) {
                if (object.a(a) != ad2.e()) break;
                n3 = i2;
                break;
            }
            if (object.c() != p.bS && i2 != n2) {
                arrb[i2] = null;
                bl6 = false;
                continue;
            }
            if (i2 == n2) {
                object = (b)com.a.a.b.cc.b(b4, object);
            }
            boolean bl8 = (Boolean)object.a(cc.c) == false;
            boolean bl9 = (Boolean)object.a(cc.a);
            bl7 |= bl8 && bl9;
            arrb[i2] = object;
            if (i2 != n2) continue;
            k2.a(b2, (cn)this, this.a(k2));
            bl6 &= bl8;
        }
        b b6 = this.v().a(c, Boolean.valueOf(bl6)).a(b, Boolean.valueOf(bl7 &= (bl6 &= n3 > 1)));
        if (n3 > 0) {
            b5 = b2.a(ad2, n3);
            object = ad2.e();
            k2.a(b5, b6.a(a, (Comparable)object), 3);
            this.b(k2, b5, (ad)object);
            this.a(k2, b5, bl6, bl7, bl4, bl5);
        }
        this.a(k2, b2, bl6, bl7, bl4, bl5);
        if (!bl2) {
            k2.a(b2, b6.a(a, (Comparable)((Object)ad2)), 3);
            if (bl3) {
                this.b(k2, b2, ad2);
            }
        }
        if (bl4 != bl6) {
            for (int i3 = 1; i3 < n3; ++i3) {
                object = b2.a(ad2, i3);
                b b7 = arrb[i3];
                if (b7 == null || k2.n((net.minecraft.u.b.b)object).d() == net.minecraft.g.a.h.a) continue;
                k2.a((net.minecraft.u.b.b)object, b7.a(c, Boolean.valueOf(bl6)), 3);
            }
        }
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        this.a(k2, b2, b3, false, true, -1, null);
    }

    private void a(k k2, net.minecraft.u.b.b b2, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        if (bl3 && !bl5) {
            k2.a(null, b2, net.minecraft.a.f.gC, bu.e, 0.4f, 0.6f);
        } else if (!bl3 && bl5) {
            k2.a(null, b2, net.minecraft.a.f.gB, bu.e, 0.4f, 0.5f);
        } else if (bl2 && !bl4) {
            k2.a(null, b2, net.minecraft.a.f.gA, bu.e, 0.4f, 0.7f);
        } else if (!bl2 && bl4) {
            k2.a(null, b2, net.minecraft.a.f.gD, bu.e, 0.4f, 1.2f / (k2.p.nextFloat() * 0.2f + 0.9f));
        }
    }

    private void b(k k2, net.minecraft.u.b.b b2, ad ad2) {
        k2.b(b2, this);
        k2.b(b2.a(ad2.e()), this);
    }

    private boolean e(k k2, net.minecraft.u.b.b b2, b b3) {
        if (!this.a_(k2, b2)) {
            this.b(k2, b2, b3, 0);
            k2.f(b2);
            return false;
        }
        return true;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        boolean bl2 = (Boolean)b3.a(c);
        boolean bl3 = (Boolean)b3.a(b);
        if (bl2 || bl3) {
            this.a(k2, b2, b3, true, false, -1, null);
        }
        if (bl3) {
            k2.b(b2, this);
            k2.b(b2.a(((ad)((Object)b3.a(a))).e()), this);
        }
        super.a(k2, b2, b3);
    }

    @Override
    public int b(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return (Boolean)b2.a(b) != false ? 15 : 0;
    }

    @Override
    public int c(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return (Boolean)b2.a(b) == false ? 0 : (b2.a(a) == ad2 ? 15 : 0);
    }

    @Override
    public boolean f(b b2) {
        return true;
    }

    @Override
    public net.minecraft.u.c bR_() {
        return net.minecraft.u.c.b;
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)ad.b(n2 & 3))).a(b, Boolean.valueOf((n2 & 8) > 0)).a(c, Boolean.valueOf((n2 & 4) > 0));
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        n2 |= ((ad)((Object)b2.a(a))).c();
        if (((Boolean)b2.a(b)).booleanValue()) {
            n2 |= 8;
        }
        if (((Boolean)b2.a(c)).booleanValue()) {
            n2 |= 4;
        }
        return n2;
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
        return new i(this, a, b, c);
    }

    static /* synthetic */ int[] d() {
        if (h != null) {
            return h;
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
        h = arrn;
        return arrn;
    }
}

