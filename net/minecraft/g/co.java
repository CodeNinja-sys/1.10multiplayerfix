/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.b.e;
import net.minecraft.g.bu;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.cr;
import net.minecraft.g.fk;
import net.minecraft.g.id;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;

public class co
extends cr {
    public static final e a = net.minecraft.g.b.e.a("type", bu.class);
    public static final c b = net.minecraft.g.b.c.b("short");
    protected static final a c = new a(0.75, 0.0, 0.0, 1.0, 1.0, 1.0);
    protected static final a d = new a(0.0, 0.0, 0.0, 0.25, 1.0, 1.0);
    protected static final a e = new a(0.0, 0.0, 0.75, 1.0, 1.0, 1.0);
    protected static final a f = new a(0.0, 0.0, 0.0, 1.0, 1.0, 0.25);
    protected static final a g = new a(0.0, 0.75, 0.0, 1.0, 1.0, 1.0);
    protected static final a h = new a(0.0, 0.0, 0.0, 1.0, 0.25, 1.0);
    protected static final a i = new a(0.375, -0.25, 0.375, 0.625, 0.75, 0.625);
    protected static final a j = new a(0.375, 0.25, 0.375, 0.625, 1.25, 0.625);
    protected static final a k = new a(0.375, 0.375, -0.25, 0.625, 0.625, 0.75);
    protected static final a l = new a(0.375, 0.375, 0.25, 0.625, 0.625, 1.25);
    protected static final a m = new a(-0.25, 0.375, 0.375, 0.75, 0.625, 0.625);
    protected static final a n = new a(0.25, 0.375, 0.375, 1.25, 0.625, 0.625);
    private static /* synthetic */ int[] p;

    public co() {
        super(net.minecraft.g.a.h.H);
        this.z(this.O.b().a(o, (Comparable)((Object)ad.c)).a(a, (Comparable)((Object)bu.a)).a(b, Boolean.valueOf(false)));
        this.a(fk.d);
        this.c(0.5f);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        switch (co.h()[((ad)((Object)b2.a(o))).ordinal()]) {
            default: {
                return h;
            }
            case 2: {
                return g;
            }
            case 3: {
                return f;
            }
            case 4: {
                return e;
            }
            case 5: {
                return d;
            }
            case 6: 
        }
        return c;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, a a2, List list, net.minecraft.w.n n2) {
        co.a(b3, a2, list, b2.c((n)k2, b3));
        co.a(b3, a2, list, this.l(b2));
    }

    private a l(b b2) {
        switch (co.h()[((ad)((Object)b2.a(o))).ordinal()]) {
            default: {
                return j;
            }
            case 2: {
                return i;
            }
            case 3: {
                return l;
            }
            case 4: {
                return k;
            }
            case 5: {
                return n;
            }
            case 6: 
        }
        return m;
    }

    @Override
    public boolean h(b b2) {
        return b2.a(o) == ad.b;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4) {
        net.minecraft.u.b.b b5;
        cn cn2;
        if (b4.J.d && ((cn2 = k2.n(b5 = b2.a(((ad)((Object)b3.a(o))).e())).c()) == net.minecraft.a.p.J || cn2 == net.minecraft.a.p.F)) {
            k2.f(b5);
        }
        super.a(k2, b2, b3, b4);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        super.a(k2, b2, b3);
        ad ad2 = ((ad)((Object)b3.a(o))).e();
        b2 = b2.a(ad2);
        b b4 = k2.n(b2);
        if ((b4.c() == net.minecraft.a.p.J || b4.c() == net.minecraft.a.p.F) && ((Boolean)b4.a(id.a)).booleanValue()) {
            b4.c().b(k2, b2, b4, 0);
            k2.f(b2);
        }
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
        return false;
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2, ad ad2) {
        return false;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        ad ad2 = (ad)((Object)b2.a(o));
        net.minecraft.u.b.b b4 = b3.a(ad2.e());
        b b5 = k2.n(b4);
        if (b5.c() != net.minecraft.a.p.J && b5.c() != net.minecraft.a.p.F) {
            k2.f(b3);
        } else {
            b5.a(k2, b4, cn2);
        }
    }

    @Override
    public boolean a(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return true;
    }

    public static ad b(int n2) {
        int n3 = n2 & 7;
        return n3 > 5 ? null : ad.a(n3);
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(b3.a(a) == bu.b ? net.minecraft.a.p.F : net.minecraft.a.p.J);
    }

    @Override
    public b a(int n2) {
        return this.v().a(o, (Comparable)((Object)co.b(n2))).a(a, (Comparable)((Object)((n2 & 8) > 0 ? bu.b : bu.a)));
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        n2 |= ((ad)((Object)b2.a(o))).b();
        if (b2.a(a) == bu.b) {
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
        return new i(this, o, a, b);
    }

    static /* synthetic */ int[] h() {
        if (p != null) {
            return p;
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
        p = arrn;
        return arrn;
    }
}

