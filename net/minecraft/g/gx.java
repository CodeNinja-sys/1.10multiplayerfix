/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.w;
import net.minecraft.g.a.h;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.r.o;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;
import net.minecraft.u.c;

public class gx
extends cn {
    public static final g a = g.a("bites", 0, 6);
    protected static final a[] b = new a[]{new a(0.0625, 0.0, 0.0625, 0.9375, 0.5, 0.9375), new a(0.1875, 0.0, 0.0625, 0.9375, 0.5, 0.9375), new a(0.3125, 0.0, 0.0625, 0.9375, 0.5, 0.9375), new a(0.4375, 0.0, 0.0625, 0.9375, 0.5, 0.9375), new a(0.5625, 0.0, 0.0625, 0.9375, 0.5, 0.9375), new a(0.6875, 0.0, 0.0625, 0.9375, 0.5, 0.9375), new a(0.8125, 0.0, 0.0625, 0.9375, 0.5, 0.9375)};

    protected gx() {
        super(h.F);
        this.z(this.O.b().a(a, Integer.valueOf(0)));
        this.b(true);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return b[(Integer)b2.a(a)];
    }

    @Override
    public a c(b b2, k k2, net.minecraft.u.b.b b3) {
        return b2.d(k2, b3);
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
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        this.b(k2, b2, b3, b4);
        return true;
    }

    private void b(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4) {
        if (b4.c(false)) {
            b4.a(o.J);
            b4.ap().a(2, 0.1f);
            int n2 = (Integer)b3.a(a);
            if (n2 < 6) {
                k2.a(b2, b3.a(a, Integer.valueOf(n2 + 1)), 3);
            } else {
                k2.f(b2);
            }
        }
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return super.a_(k2, b2) ? this.c(k2, b2) : false;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (!this.c(k2, b3)) {
            k2.f(b3);
        }
    }

    private boolean c(k k2, net.minecraft.u.b.b b2) {
        return k2.n(b2.c()).d().a();
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return null;
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(net.minecraft.a.w.bg);
    }

    @Override
    public c bR_() {
        return c.c;
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, Integer.valueOf(n2));
    }

    @Override
    public int b(b b2) {
        return (Integer)b2.a(a);
    }

    @Override
    protected i a() {
        return new i(this, a);
    }

    @Override
    public int b(b b2, k k2, net.minecraft.u.b.b b3) {
        return (7 - (Integer)b2.a(a)) * 2;
    }

    @Override
    public boolean c(b b2) {
        return true;
    }
}

