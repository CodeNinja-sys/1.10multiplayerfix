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
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ag;
import net.minecraft.u.b.a;
import net.minecraft.u.c;

public class ge
extends cn {
    public static final g a = g.a("age", 0, 15);
    protected static final a b = new a(0.125, 0.0, 0.125, 0.875, 1.0, 0.875);

    protected ge() {
        super(h.k);
        this.z(this.O.b().a(a, Integer.valueOf(0)));
        this.b(true);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return b;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if ((k2.n(b2.c()).c() == p.aM || this.e(k2, b2, b3)) && k2.c(b2.b())) {
            int n2 = 1;
            while (k2.n(b2.b(n2)).c() == this) {
                ++n2;
            }
            if (n2 < 3) {
                int n3 = (Integer)b3.a(a);
                if (n3 == 15) {
                    k2.b(b2.b(), this.v());
                    k2.a(b2, b3.a(a, Integer.valueOf(0)), 4);
                } else {
                    k2.a(b2, b3.a(a, Integer.valueOf(n3 + 1)), 4);
                }
            }
        }
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        cn cn2 = k2.n(b2.c()).c();
        if (cn2 == this) {
            return true;
        }
        if (cn2 != p.c && cn2 != p.d && cn2 != p.m) {
            return false;
        }
        net.minecraft.u.b.b b3 = b2.c();
        for (ad ad2 : ag.a) {
            b b4 = k2.n(b3.a(ad2));
            if (b4.d() != h.h && b4.c() != p.de) continue;
            return true;
        }
        return false;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        this.e(k2, b3, b2);
    }

    protected final boolean e(k k2, net.minecraft.u.b.b b2, b b3) {
        if (this.c(k2, b2)) {
            return true;
        }
        this.b(k2, b2, b3, 0);
        k2.f(b2);
        return false;
    }

    public boolean c(k k2, net.minecraft.u.b.b b2) {
        return this.a_(k2, b2);
    }

    @Override
    public a a(b b2, k k2, net.minecraft.u.b.b b3) {
        return y;
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.aQ;
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
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(net.minecraft.a.w.aQ);
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
}

