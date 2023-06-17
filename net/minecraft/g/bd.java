/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.f.ap;
import net.minecraft.g.a.h;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.au;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.r.o;
import net.minecraft.u.ad;
import net.minecraft.u.b.a;
import net.minecraft.v.d;

public class bd
extends cn {
    public static final g a = g.a("layers", 1, 8);
    protected static final a[] b = new a[]{new a(0.0, 0.0, 0.0, 1.0, 0.0, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.125, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.25, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.375, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.5, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.625, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.75, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.875, 1.0), new a(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)};

    protected bd() {
        super(h.y);
        this.z(this.O.b().a(a, Integer.valueOf(1)));
        this.b(true);
        this.a(d.c);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return b[(Integer)b2.a(a)];
    }

    @Override
    public boolean a(n n2, net.minecraft.u.b.b b2) {
        return (Integer)n2.n(b2).a(a) < 5;
    }

    @Override
    public boolean h(b b2) {
        return (Integer)b2.a(a) == 7;
    }

    @Override
    public a a(b b2, k k2, net.minecraft.u.b.b b3) {
        int n2 = (Integer)b2.a(a) - 1;
        float f2 = 0.125f;
        a a2 = b2.c((n)k2, b3);
        return new a(a2.a, a2.b, a2.c, a2.d, (float)n2 * 0.125f, a2.f);
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
        b b3 = k2.n(b2.c());
        cn cn2 = b3.c();
        return cn2 != p.aI && cn2 != p.cB ? (b3.d() == h.j ? true : (cn2 == this && (Integer)b3.a(a) >= 7 ? true : b3.s() && b3.d().c())) : false;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        this.e(k2, b3, b2);
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
    public void a(k k2, net.minecraft.w.a.b b2, net.minecraft.u.b.b b3, b b4, ap ap2, cu cu2) {
        bd.a(k2, b3, new cu(net.minecraft.a.w.aF, (Integer)b4.a(a) + 1, 0));
        k2.f(b3);
        b2.a(o.a(this));
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.aF;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (k2.b(au.b, b2) > 11) {
            this.b(k2, b2, k2.n(b2), 0);
            k2.f(b2);
        }
    }

    @Override
    public boolean a(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        if (ad2 == ad.b) {
            return true;
        }
        b b4 = n2.n(b3.a(ad2));
        return b4.c() == this && (Integer)b4.a(a) >= (Integer)b2.a(a) ? true : super.a(b2, n2, b3, ad2);
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, Integer.valueOf((n2 & 7) + 1));
    }

    @Override
    public boolean b(n n2, net.minecraft.u.b.b b2) {
        return (Integer)n2.n(b2).a(a) == 1;
    }

    @Override
    public int b(b b2) {
        return (Integer)b2.a(a) - 1;
    }

    @Override
    protected i a() {
        return new i(this, a);
    }
}

