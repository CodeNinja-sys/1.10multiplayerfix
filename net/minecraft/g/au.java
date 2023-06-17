/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.b.e;
import net.minecraft.g.b.f;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.de;
import net.minecraft.g.eq;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class au
extends cn {
    public static final f a = de.j;
    public static final c b = net.minecraft.g.b.c.b("open");
    public static final e c = net.minecraft.g.b.e.a("half", eq.class);
    protected static final a d = new a(0.0, 0.0, 0.0, 0.1875, 1.0, 1.0);
    protected static final a e = new a(0.8125, 0.0, 0.0, 1.0, 1.0, 1.0);
    protected static final a f = new a(0.0, 0.0, 0.0, 1.0, 1.0, 0.1875);
    protected static final a g = new a(0.0, 0.0, 0.8125, 1.0, 1.0, 1.0);
    protected static final a h = new a(0.0, 0.0, 0.0, 1.0, 0.1875, 1.0);
    protected static final a i = new a(0.0, 0.8125, 0.0, 1.0, 1.0, 1.0);
    private static /* synthetic */ int[] j;

    protected au(h h2) {
        super(h2);
        this.z(this.O.b().a(a, (Comparable)((Object)ad.c)).a(b, Boolean.valueOf(false)).a(c, (Comparable)((Object)eq.b)));
        this.a(net.minecraft.v.d.d);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        a a2;
        if (((Boolean)b2.a(b)).booleanValue()) {
            switch (au.e()[((ad)((Object)b2.a(a))).ordinal()]) {
                default: {
                    a2 = g;
                    break;
                }
                case 4: {
                    a2 = f;
                    break;
                }
                case 5: {
                    a2 = e;
                    break;
                }
                case 6: {
                    a2 = d;
                    break;
                }
            }
        } else {
            a2 = b2.a(c) == eq.a ? i : h;
        }
        return a2;
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
    public boolean a(n n2, net.minecraft.u.b.b b2) {
        return (Boolean)n2.n(b2).a(b) == false;
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (this.L == net.minecraft.g.a.h.f) {
            return true;
        }
        b3 = b3.b(b);
        k2.a(b2, b3, 2);
        this.a(b4, k2, b2, (Boolean)b3.a(b));
        return true;
    }

    protected void a(net.minecraft.w.a.b b2, k k2, net.minecraft.u.b.b b3, boolean bl2) {
        if (bl2) {
            int n2 = this.L == net.minecraft.g.a.h.f ? 1037 : 1007;
            k2.a(b2, n2, b3, 0);
        } else {
            int n3 = this.L == net.minecraft.g.a.h.f ? 1036 : 1013;
            k2.a(b2, n3, b3, 0);
        }
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        boolean bl2;
        boolean bl3;
        if (!k2.C && ((bl3 = k2.x(b3)) || cn2.v().p()) && (bl2 = ((Boolean)b2.a(b)).booleanValue()) != bl3) {
            k2.a(b3, b2.a(b, Boolean.valueOf(bl3)), 2);
            this.a(null, k2, b3, bl3);
        }
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        b b3 = this.v();
        if (ad2.l().d()) {
            b3 = b3.a(a, (Comparable)((Object)ad2)).a(b, Boolean.valueOf(false));
            b3 = b3.a(c, (Comparable)((Object)(f3 > 0.5f ? eq.a : eq.b)));
        } else {
            b3 = b3.a(a, (Comparable)((Object)l2.cl_().e())).a(b, Boolean.valueOf(false));
            b3 = b3.a(c, (Comparable)((Object)(ad2 == ad.b ? eq.b : eq.a)));
        }
        return b3;
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2, ad ad2) {
        return true;
    }

    protected static ad b(int n2) {
        switch (n2 & 3) {
            case 0: {
                return ad.c;
            }
            case 1: {
                return ad.d;
            }
            case 2: {
                return ad.e;
            }
        }
        return ad.f;
    }

    protected static int a(ad ad2) {
        switch (au.e()[ad2.ordinal()]) {
            case 3: {
                return 0;
            }
            case 4: {
                return 1;
            }
            case 5: {
                return 2;
            }
        }
        return 3;
    }

    @Override
    public net.minecraft.u.c bR_() {
        return net.minecraft.u.c.c;
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)au.b(n2))).a(b, Boolean.valueOf((n2 & 4) != 0)).a(c, (Comparable)((Object)((n2 & 8) == 0 ? eq.b : eq.a)));
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        n2 |= au.a((ad)((Object)b2.a(a)));
        if (((Boolean)b2.a(b)).booleanValue()) {
            n2 |= 4;
        }
        if (b2.a(c) == eq.a) {
            n2 |= 8;
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

    static /* synthetic */ int[] e() {
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

