/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.a.h;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.de;
import net.minecraft.g.fi;
import net.minecraft.g.s;
import net.minecraft.m.cd;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.u.c;
import net.minecraft.w.l;

public class x
extends de
implements fi {
    public static final g a = g.a("age", 0, 2);
    protected static final a[] b = new a[]{new a(0.6875, 0.4375, 0.375, 0.9375, 0.75, 0.625), new a(0.5625, 0.3125, 0.3125, 0.9375, 0.75, 0.6875), new a(0.5625, 0.3125, 0.3125, 0.9375, 0.75, 0.6875)};
    protected static final a[] c = new a[]{new a(0.0625, 0.4375, 0.375, 0.3125, 0.75, 0.625), new a(0.0625, 0.3125, 0.3125, 0.4375, 0.75, 0.6875), new a(0.0625, 0.3125, 0.3125, 0.4375, 0.75, 0.6875)};
    protected static final a[] d = new a[]{new a(0.375, 0.4375, 0.0625, 0.625, 0.75, 0.3125), new a(0.3125, 0.3125, 0.0625, 0.6875, 0.75, 0.4375), new a(0.3125, 0.3125, 0.0625, 0.6875, 0.75, 0.4375)};
    protected static final a[] e = new a[]{new a(0.375, 0.4375, 0.6875, 0.625, 0.75, 0.9375), new a(0.3125, 0.3125, 0.5625, 0.6875, 0.75, 0.9375), new a(0.3125, 0.3125, 0.5625, 0.6875, 0.75, 0.9375)};
    private static /* synthetic */ int[] f;

    public x() {
        super(h.k);
        this.z(this.O.b().a(j, (Comparable)((Object)ad.c)).a(a, Integer.valueOf(0)));
        this.b(true);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        int n2;
        if (!this.d(k2, b2, b3)) {
            this.e(k2, b2, b3);
        } else if (k2.p.nextInt(5) == 0 && (n2 = ((Integer)b3.a(a)).intValue()) < 2) {
            k2.a(b2, b3.a(a, Integer.valueOf(n2 + 1)), 2);
        }
    }

    public boolean d(k k2, net.minecraft.u.b.b b2, b b3) {
        b b4 = k2.n(b2 = b2.a((ad)((Object)b3.a(j))));
        return b4.c() == p.r && b4.a(s.a) == net.minecraft.g.b.d;
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        int n3 = (Integer)b2.a(a);
        switch (net.minecraft.g.x.d()[((ad)((Object)b2.a(j))).ordinal()]) {
            case 4: {
                return e[n3];
            }
            default: {
                return d[n3];
            }
            case 5: {
                return c[n3];
            }
            case 6: 
        }
        return b[n3];
    }

    @Override
    public b a(b b2, bq bq2) {
        return b2.a(j, (Comparable)((Object)bq2.a((ad)((Object)b2.a(j)))));
    }

    @Override
    public b a(b b2, bi bi2) {
        return b2.a(bi2.a((ad)((Object)b2.a(j))));
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, l l2, cu cu2) {
        ad ad2 = ad.a(l2.ba);
        k2.a(b2, b3.a(j, (Comparable)((Object)ad2)), 2);
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        if (!ad2.l().d()) {
            ad2 = ad.c;
        }
        return this.v().a(j, (Comparable)((Object)ad2.e())).a(a, Integer.valueOf(0));
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (!this.d(k2, b3, b2)) {
            this.e(k2, b3, b2);
        }
    }

    private void e(k k2, net.minecraft.u.b.b b2, b b3) {
        k2.a(b2, p.a.v(), 3);
        this.b(k2, b2, b3, 0);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, float f2, int n2) {
        int n3 = (Integer)b3.a(a);
        int n4 = 1;
        if (n3 >= 2) {
            n4 = 3;
        }
        for (int i2 = 0; i2 < n4; ++i2) {
            net.minecraft.g.x.a(k2, b2, new cu(net.minecraft.a.w.bd, 1, cd.m.c()));
        }
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(net.minecraft.a.w.bd, 1, cd.m.c());
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, boolean bl2) {
        return (Integer)b3.a(a) < 2;
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2, b b3) {
        return true;
    }

    @Override
    public void b(k k2, Random random, net.minecraft.u.b.b b2, b b3) {
        k2.a(b2, b3.a(a, Integer.valueOf((Integer)b3.a(a) + 1)), 2);
    }

    @Override
    public c bR_() {
        return net.minecraft.u.c.c;
    }

    @Override
    public b a(int n2) {
        return this.v().a(j, (Comparable)((Object)ad.b(n2))).a(a, Integer.valueOf((n2 & 0xF) >> 2));
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        n2 |= ((ad)((Object)b2.a(j))).c();
        return n2 |= (Integer)b2.a(a) << 2;
    }

    @Override
    protected i a() {
        return new i(this, j, a);
    }

    static /* synthetic */ int[] d() {
        if (f != null) {
            return f;
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
        f = arrn;
        return arrn;
    }
}

