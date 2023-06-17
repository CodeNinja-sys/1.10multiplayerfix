/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.v.d;

public class ai
extends cn {
    public static final c a = net.minecraft.g.b.c.b("north");
    public static final c b = net.minecraft.g.b.c.b("east");
    public static final c c = net.minecraft.g.b.c.b("south");
    public static final c d = net.minecraft.g.b.c.b("west");
    protected static final a[] e = new a[]{new a(0.4375, 0.0, 0.4375, 0.5625, 1.0, 0.5625), new a(0.4375, 0.0, 0.4375, 0.5625, 1.0, 1.0), new a(0.0, 0.0, 0.4375, 0.5625, 1.0, 0.5625), new a(0.0, 0.0, 0.4375, 0.5625, 1.0, 1.0), new a(0.4375, 0.0, 0.0, 0.5625, 1.0, 0.5625), new a(0.4375, 0.0, 0.0, 0.5625, 1.0, 1.0), new a(0.0, 0.0, 0.0, 0.5625, 1.0, 0.5625), new a(0.0, 0.0, 0.0, 0.5625, 1.0, 1.0), new a(0.4375, 0.0, 0.4375, 1.0, 1.0, 0.5625), new a(0.4375, 0.0, 0.4375, 1.0, 1.0, 1.0), new a(0.0, 0.0, 0.4375, 1.0, 1.0, 0.5625), new a(0.0, 0.0, 0.4375, 1.0, 1.0, 1.0), new a(0.4375, 0.0, 0.0, 1.0, 1.0, 0.5625), new a(0.4375, 0.0, 0.0, 1.0, 1.0, 1.0), new a(0.0, 0.0, 0.0, 1.0, 1.0, 0.5625), new a(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)};
    private final boolean f;
    private static /* synthetic */ int[] g;

    protected ai(h h2, boolean bl2) {
        super(h2);
        this.z(this.O.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
        this.f = bl2;
        this.a(net.minecraft.v.d.c);
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, a a2, List list, net.minecraft.w.n n2) {
        b2 = this.b(b2, (n)k2, b3);
        ai.a(b3, a2, list, e[0]);
        if (((Boolean)b2.a(a)).booleanValue()) {
            ai.a(b3, a2, list, e[ai.a(ad.c)]);
        }
        if (((Boolean)b2.a(c)).booleanValue()) {
            ai.a(b3, a2, list, e[ai.a(ad.d)]);
        }
        if (((Boolean)b2.a(b)).booleanValue()) {
            ai.a(b3, a2, list, e[ai.a(ad.f)]);
        }
        if (((Boolean)b2.a(d)).booleanValue()) {
            ai.a(b3, a2, list, e[ai.a(ad.e)]);
        }
    }

    private static int a(ad ad2) {
        return 1 << ad2.c();
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        b2 = this.b(b2, n2, b3);
        return e[ai.l(b2)];
    }

    private static int l(b b2) {
        int n2 = 0;
        if (((Boolean)b2.a(a)).booleanValue()) {
            n2 |= ai.a(ad.c);
        }
        if (((Boolean)b2.a(b)).booleanValue()) {
            n2 |= ai.a(ad.f);
        }
        if (((Boolean)b2.a(c)).booleanValue()) {
            n2 |= ai.a(ad.d);
        }
        if (((Boolean)b2.a(d)).booleanValue()) {
            n2 |= ai.a(ad.e);
        }
        return n2;
    }

    @Override
    public b b(b b2, n n2, net.minecraft.u.b.b b3) {
        return b2.a(a, Boolean.valueOf(this.b(n2.n(b3.d()).c()))).a(c, Boolean.valueOf(this.b(n2.n(b3.e()).c()))).a(d, Boolean.valueOf(this.b(n2.n(b3.f()).c()))).a(b, Boolean.valueOf(this.b(n2.n(b3.g()).c())));
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return !this.f ? null : super.a(b2, random, n2);
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
    public boolean a(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return n2.n(b3.a(ad2)).c() == this ? false : super.a(b2, n2, b3, ad2);
    }

    public final boolean b(cn cn2) {
        return cn2.v().k() || cn2 == this || cn2 == p.w || cn2 == p.cG || cn2 == p.cH || cn2 instanceof ai;
    }

    @Override
    protected boolean bQ_() {
        return true;
    }

    @Override
    public net.minecraft.u.c bR_() {
        return net.minecraft.u.c.b;
    }

    @Override
    public int b(b b2) {
        return 0;
    }

    @Override
    public b a(b b2, bq bq2) {
        switch (ai.e()[bq2.ordinal()]) {
            case 3: {
                return b2.a(a, (Boolean)b2.a(c)).a(b, (Boolean)b2.a(d)).a(c, (Boolean)b2.a(a)).a(d, (Boolean)b2.a(b));
            }
            case 4: {
                return b2.a(a, (Boolean)b2.a(b)).a(b, (Boolean)b2.a(c)).a(c, (Boolean)b2.a(d)).a(d, (Boolean)b2.a(a));
            }
            case 2: {
                return b2.a(a, (Boolean)b2.a(d)).a(b, (Boolean)b2.a(a)).a(c, (Boolean)b2.a(b)).a(d, (Boolean)b2.a(c));
            }
        }
        return b2;
    }

    @Override
    public b a(b b2, bi bi2) {
        switch (bi2) {
            case b: {
                return b2.a(a, (Boolean)b2.a(c)).a(c, (Boolean)b2.a(a));
            }
            case c: {
                return b2.a(b, (Boolean)b2.a(d)).a(d, (Boolean)b2.a(b));
            }
        }
        return super.a(b2, bi2);
    }

    @Override
    protected i a() {
        return new i(this, a, b, d, c);
    }

    static /* synthetic */ int[] e() {
        if (g != null) {
            return g;
        }
        int[] arrn = new int[bq.values().length];
        try {
            arrn[bq.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bq.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bq.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bq.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        g = arrn;
        return arrn;
    }
}

