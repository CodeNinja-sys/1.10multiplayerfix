/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import java.util.Random;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.cr;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.v.d;
import net.minecraft.w.c.f;
import net.minecraft.w.l;

public abstract class gf
extends cr {
    public static final c a = net.minecraft.g.b.c.b("powered");
    protected static final a b = new a(0.3125, 0.875, 0.375, 0.6875, 1.0, 0.625);
    protected static final a c = new a(0.3125, 0.0, 0.375, 0.6875, 0.125, 0.625);
    protected static final a d = new a(0.3125, 0.375, 0.875, 0.6875, 0.625, 1.0);
    protected static final a e = new a(0.3125, 0.375, 0.0, 0.6875, 0.625, 0.125);
    protected static final a f = new a(0.875, 0.375, 0.3125, 1.0, 0.625, 0.6875);
    protected static final a g = new a(0.0, 0.375, 0.3125, 0.125, 0.625, 0.6875);
    protected static final a h = new a(0.3125, 0.9375, 0.375, 0.6875, 1.0, 0.625);
    protected static final a i = new a(0.3125, 0.0, 0.375, 0.6875, 0.0625, 0.625);
    protected static final a j = new a(0.3125, 0.375, 0.9375, 0.6875, 0.625, 1.0);
    protected static final a k = new a(0.3125, 0.375, 0.0, 0.6875, 0.625, 0.0625);
    protected static final a l = new a(0.9375, 0.375, 0.3125, 1.0, 0.625, 0.6875);
    protected static final a m = new a(0.0, 0.375, 0.3125, 0.0625, 0.625, 0.6875);
    private final boolean n;

    protected gf(boolean bl2) {
        super(net.minecraft.g.a.h.q);
        this.z(this.O.b().a(o, (Comparable)((Object)ad.c)).a(a, Boolean.valueOf(false)));
        this.b(true);
        this.a(net.minecraft.v.d.d);
        this.n = bl2;
    }

    @Override
    public a a(b b2, k k2, net.minecraft.u.b.b b3) {
        return y;
    }

    @Override
    public int a(k k2) {
        return this.n ? 30 : 20;
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
        return gf.b(k2, b2, ad2.e());
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        for (ad ad2 : ad.values()) {
            if (!gf.b(k2, b2, ad2)) continue;
            return true;
        }
        return false;
    }

    protected static boolean b(k k2, net.minecraft.u.b.b b2, ad ad2) {
        net.minecraft.u.b.b b3 = b2.a(ad2);
        return ad2 == ad.a ? k2.n(b3).t() : k2.n(b3).o();
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        return gf.b(k2, b2, ad2.e()) ? this.v().a(o, (Comparable)((Object)ad2)).a(a, Boolean.valueOf(false)) : this.v().a(o, (Comparable)((Object)ad.a)).a(a, Boolean.valueOf(false));
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (this.e(k2, b3, b2) && !gf.b(k2, b3, ((ad)((Object)b2.a(o))).e())) {
            this.b(k2, b3, b2, 0);
            k2.f(b3);
        }
    }

    private boolean e(k k2, net.minecraft.u.b.b b2, b b3) {
        if (this.a_(k2, b2)) {
            return true;
        }
        this.b(k2, b2, b3, 0);
        k2.f(b2);
        return false;
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        ad ad2 = (ad)((Object)b2.a(o));
        boolean bl2 = (Boolean)b2.a(a);
        switch (ad2) {
            case f: {
                return bl2 ? m : g;
            }
            case e: {
                return bl2 ? l : f;
            }
            case d: {
                return bl2 ? k : e;
            }
            default: {
                return bl2 ? j : d;
            }
            case b: {
                return bl2 ? i : c;
            }
            case a: 
        }
        return bl2 ? h : b;
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (((Boolean)b3.a(a)).booleanValue()) {
            return true;
        }
        k2.a(b2, b3.a(a, Boolean.valueOf(true)), 3);
        k2.b(b2, b2);
        this.a(b4, k2, b2);
        this.c(k2, b2, (ad)((Object)b3.a(o)));
        k2.a(b2, (cn)this, this.a(k2));
        return true;
    }

    protected abstract void a(net.minecraft.w.a.b var1, k var2, net.minecraft.u.b.b var3);

    protected abstract void c(k var1, net.minecraft.u.b.b var2);

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        if (((Boolean)b3.a(a)).booleanValue()) {
            this.c(k2, b2, (ad)((Object)b3.a(o)));
        }
        super.a(k2, b2, b3);
    }

    @Override
    public int b(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return (Boolean)b2.a(a) != false ? 15 : 0;
    }

    @Override
    public int c(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return (Boolean)b2.a(a) == false ? 0 : (b2.a(o) == ad2 ? 15 : 0);
    }

    @Override
    public boolean f(b b2) {
        return true;
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (!k2.C && ((Boolean)b3.a(a)).booleanValue()) {
            if (this.n) {
                this.e(b3, k2, b2);
            } else {
                k2.b(b2, b3.a(a, Boolean.valueOf(false)));
                this.c(k2, b2, (ad)((Object)b3.a(o)));
                this.c(k2, b2);
                k2.b(b2, b2);
            }
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.n n2) {
        if (!k2.C && this.n && !((Boolean)b3.a(a)).booleanValue()) {
            this.e(b3, k2, b2);
        }
    }

    private void e(b b2, k k2, net.minecraft.u.b.b b3) {
        List list = k2.a(f.class, b2.c((n)k2, b3).a(b3));
        boolean bl2 = !list.isEmpty();
        boolean bl3 = (Boolean)b2.a(a);
        if (bl2 && !bl3) {
            k2.b(b3, b2.a(a, Boolean.valueOf(true)));
            this.c(k2, b3, (ad)((Object)b2.a(o)));
            k2.b(b3, b3);
            this.a((net.minecraft.w.a.b)null, k2, b3);
        }
        if (!bl2 && bl3) {
            k2.b(b3, b2.a(a, Boolean.valueOf(false)));
            this.c(k2, b3, (ad)((Object)b2.a(o)));
            k2.b(b3, b3);
            this.c(k2, b3);
        }
        if (bl2) {
            k2.a(new net.minecraft.u.b.b(b3), (cn)this, this.a(k2));
        }
    }

    private void c(k k2, net.minecraft.u.b.b b2, ad ad2) {
        k2.b(b2, this);
        k2.b(b2.a(ad2.e()), this);
    }

    @Override
    public b a(int n2) {
        ad ad2;
        switch (n2 & 7) {
            case 0: {
                ad2 = ad.a;
                break;
            }
            case 1: {
                ad2 = ad.f;
                break;
            }
            case 2: {
                ad2 = ad.e;
                break;
            }
            case 3: {
                ad2 = ad.d;
                break;
            }
            case 4: {
                ad2 = ad.c;
                break;
            }
            default: {
                ad2 = ad.b;
            }
        }
        return this.v().a(o, (Comparable)((Object)ad2)).a(a, Boolean.valueOf((n2 & 8) > 0));
    }

    @Override
    public int b(b b2) {
        int n2;
        switch ((ad)((Object)b2.a(o))) {
            case f: {
                n2 = 1;
                break;
            }
            case e: {
                n2 = 2;
                break;
            }
            case d: {
                n2 = 3;
                break;
            }
            case c: {
                n2 = 4;
                break;
            }
            default: {
                n2 = 5;
                break;
            }
            case a: {
                n2 = 0;
            }
        }
        if (((Boolean)b2.a(a)).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    public b a(b b2, bq bq2) {
        return b2.a(o, (Comparable)((Object)bq2.a((ad)((Object)b2.a(o)))));
    }

    @Override
    public b a(b b2, bi bi2) {
        return b2.a(bi2.a((ad)((Object)b2.a(o))));
    }

    @Override
    protected i a() {
        return new i(this, o, a);
    }
}

