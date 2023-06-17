/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.ay;
import net.minecraft.g.b.f;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.fm;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.ag;
import net.minecraft.u.aj;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.u.c;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class ap
extends cn {
    public static final f a = net.minecraft.g.b.f.a("facing", new ay());
    protected static final a b = new a(0.4f, 0.0, 0.4f, 0.6f, 0.6f, 0.6f);
    protected static final a c = new a(0.35f, 0.2f, 0.7f, 0.65f, 0.8f, 1.0);
    protected static final a d = new a(0.35f, 0.2f, 0.0, 0.65f, 0.8f, 0.3f);
    protected static final a e = new a(0.7f, 0.2f, 0.35f, 1.0, 0.8f, 0.65f);
    protected static final a f = new a(0.0, 0.2f, 0.35f, 0.3f, 0.8f, 0.65f);
    private static /* synthetic */ int[] g;

    protected ap() {
        super(h.q);
        this.z(this.O.b().a(a, (Comparable)((Object)ad.b)));
        this.b(true);
        this.a(net.minecraft.v.d.c);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        switch (ap.e()[((ad)((Object)b2.a(a))).ordinal()]) {
            case 6: {
                return f;
            }
            case 5: {
                return e;
            }
            case 4: {
                return d;
            }
            case 3: {
                return c;
            }
        }
        return b;
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

    private boolean c(k k2, net.minecraft.u.b.b b2) {
        if (k2.n(b2).t()) {
            return true;
        }
        cn cn2 = k2.n(b2).c();
        return cn2 instanceof fm || cn2 == p.w || cn2 == p.bZ || cn2 == p.cG;
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        for (ad ad2 : a.b()) {
            if (!this.b(k2, b2, ad2)) continue;
            return true;
        }
        return false;
    }

    private boolean b(k k2, net.minecraft.u.b.b b2, ad ad2) {
        net.minecraft.u.b.b b3 = b2.a(ad2.e());
        boolean bl2 = ad2.l().d();
        return bl2 && k2.d(b3, true) || ad2.equals(ad.b) && this.c(k2, b3);
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        if (this.b(k2, b2, ad2)) {
            return this.v().a(a, (Comparable)((Object)ad2));
        }
        for (ad ad3 : ag.a) {
            if (!k2.d(b2.a(ad3.e()), true)) continue;
            return this.v().a(a, (Comparable)((Object)ad3));
        }
        return this.v();
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        this.e(k2, b2, b3);
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        this.d(k2, b3, b2);
    }

    protected boolean d(k k2, net.minecraft.u.b.b b2, b b3) {
        if (!this.e(k2, b2, b3)) {
            return true;
        }
        ad ad2 = (ad)((Object)b3.a(a));
        ae ae2 = ad2.l();
        ad ad3 = ad2.e();
        boolean bl2 = false;
        if (ae2.d() && !k2.d(b2.a(ad3), true)) {
            bl2 = true;
        } else if (ae2.c() && !this.c(k2, b2.a(ad3))) {
            bl2 = true;
        }
        if (bl2) {
            this.b(k2, b2, b3, 0);
            k2.f(b2);
            return true;
        }
        return false;
    }

    protected boolean e(k k2, net.minecraft.u.b.b b2, b b3) {
        if (b3.c() == this && this.b(k2, b2, (ad)((Object)b3.a(a)))) {
            return true;
        }
        if (k2.n(b2).c() == this) {
            this.b(k2, b2, b3, 0);
            k2.f(b2);
        }
        return false;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        ad ad2 = (ad)((Object)b2.a(a));
        double d2 = (double)b3.cy_() + 0.5;
        double d3 = (double)b3.k() + 0.7;
        double d4 = (double)b3.l() + 0.5;
        double d5 = 0.22;
        double d6 = 0.27;
        if (ad2.l().d()) {
            ad ad3 = ad2.e();
            k2.a(aj.l, d2 + 0.27 * (double)ad3.h(), d3 + 0.22, d4 + 0.27 * (double)ad3.j(), 0.0, 0.0, 0.0, new int[0]);
            k2.a(aj.A, d2 + 0.27 * (double)ad3.h(), d3 + 0.22, d4 + 0.27 * (double)ad3.j(), 0.0, 0.0, 0.0, new int[0]);
        } else {
            k2.a(aj.l, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
            k2.a(aj.A, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public c bR_() {
        return net.minecraft.u.c.c;
    }

    @Override
    public b a(int n2) {
        b b2 = this.v();
        switch (n2) {
            case 1: {
                b2 = b2.a(a, (Comparable)((Object)ad.f));
                break;
            }
            case 2: {
                b2 = b2.a(a, (Comparable)((Object)ad.e));
                break;
            }
            case 3: {
                b2 = b2.a(a, (Comparable)((Object)ad.d));
                break;
            }
            case 4: {
                b2 = b2.a(a, (Comparable)((Object)ad.c));
                break;
            }
            default: {
                b2 = b2.a(a, (Comparable)((Object)ad.b));
            }
        }
        return b2;
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        switch (ap.e()[((ad)((Object)b2.a(a))).ordinal()]) {
            case 6: {
                n2 |= 1;
                break;
            }
            case 5: {
                n2 |= 2;
                break;
            }
            case 4: {
                n2 |= 3;
                break;
            }
            case 3: {
                n2 |= 4;
                break;
            }
            default: {
                n2 |= 5;
            }
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
        return new i(this, a);
    }

    static /* synthetic */ int[] e() {
        if (g != null) {
            return g;
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
        g = arrn;
        return arrn;
    }
}

