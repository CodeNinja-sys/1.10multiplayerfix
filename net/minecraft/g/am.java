/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.as;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.eg;
import net.minecraft.g.ic;
import net.minecraft.g.z;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.b.a;
import net.minecraft.w.l;

public class am
extends cn {
    public static final g a = g.a("moisture", 0, 7);
    protected static final a b = new a(0.0, 0.0, 0.0, 1.0, 0.9375, 1.0);
    private static /* synthetic */ int[] c;

    protected am() {
        super(h.c);
        this.z(this.O.b().a(a, Integer.valueOf(0)));
        this.b(true);
        this.f(255);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return b;
    }

    @Override
    public a a(b b2, k k2, net.minecraft.u.b.b b3) {
        return x;
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
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        int n2 = (Integer)b3.a(a);
        if (!this.d(k2, b2) && !k2.A(b2.b())) {
            if (n2 > 0) {
                k2.a(b2, b3.a(a, Integer.valueOf(n2 - 1)), 2);
            } else if (!this.c(k2, b2)) {
                k2.b(b2, p.d.v());
            }
        } else if (n2 < 7) {
            k2.a(b2, b3.a(a, Integer.valueOf(7)), 2);
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.w.n n2, float f2) {
        if (!k2.C && k2.p.nextFloat() < f2 - 0.5f && n2 instanceof l && (n2 instanceof net.minecraft.w.a.b || k2.G().b("mobGriefing")) && n2.bl * n2.bl * n2.bm > 0.512f) {
            k2.b(b2, p.d.v());
        }
        super.a(k2, b2, n2, f2);
    }

    private boolean c(k k2, net.minecraft.u.b.b b2) {
        cn cn2 = k2.n(b2.b()).c();
        return cn2 instanceof z || cn2 instanceof as;
    }

    private boolean d(k k2, net.minecraft.u.b.b b2) {
        for (net.minecraft.u.b.g g2 : net.minecraft.u.b.b.b(b2.a(-4, 0, -4), b2.a(4, 1, 4))) {
            if (k2.n(g2).d() != h.h) continue;
            return true;
        }
        return false;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        super.a(b2, k2, b3, cn2);
        if (k2.n(b3.b()).d().a()) {
            k2.b(b3, p.d.v());
        }
    }

    @Override
    public boolean a(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        switch (am.e()[ad2.ordinal()]) {
            case 2: {
                return true;
            }
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                b b4 = n2.n(b3.a(ad2));
                cn cn2 = b4.c();
                return !b4.s() && cn2 != p.ak && cn2 != p.da;
            }
        }
        return super.a(b2, n2, b3, ad2);
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return p.d.a(p.d.v().a(eg.a, (Comparable)((Object)ic.a)), random, n2);
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(p.d);
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, Integer.valueOf(n2 & 7));
    }

    @Override
    public int b(b b2) {
        return (Integer)b2.a(a);
    }

    @Override
    protected i a() {
        return new i(this, a);
    }

    static /* synthetic */ int[] e() {
        if (c != null) {
            return c;
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
        c = arrn;
        return arrn;
    }
}

