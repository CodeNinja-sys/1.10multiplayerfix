/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ag;
import net.minecraft.u.b.a;
import net.minecraft.u.c;
import net.minecraft.v.d;
import net.minecraft.w.n;

public class ho
extends cn {
    public static final g a = g.a("age", 0, 15);
    protected static final a b = new a(0.0625, 0.0, 0.0625, 0.9375, 0.9375, 0.9375);
    protected static final a c = new a(0.0625, 0.0, 0.0625, 0.9375, 1.0, 0.9375);

    protected ho() {
        super(h.A);
        this.z(this.O.b().a(a, Integer.valueOf(0)));
        this.b(true);
        this.a(d.c);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        net.minecraft.u.b.b b4 = b2.b();
        if (k2.c(b4)) {
            int n2 = 1;
            while (k2.n(b2.b(n2)).c() == this) {
                ++n2;
            }
            if (n2 < 3) {
                int n3 = (Integer)b3.a(a);
                if (n3 == 15) {
                    k2.b(b4, this.v());
                    b b5 = b3.a(a, Integer.valueOf(0));
                    k2.a(b2, b5, 4);
                    b5.a(k2, b4, this);
                } else {
                    k2.a(b2, b3.a(a, Integer.valueOf(n3 + 1)), 4);
                }
            }
        }
    }

    @Override
    public a a(b b2, k k2, net.minecraft.u.b.b b3) {
        return b;
    }

    @Override
    public a c(b b2, k k2, net.minecraft.u.b.b b3) {
        return c.a(b3);
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
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return super.a_(k2, b2) ? this.c(k2, b2) : false;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (!this.c(k2, b3)) {
            k2.b(b3, true);
        }
    }

    public boolean c(k k2, net.minecraft.u.b.b b2) {
        Object object2;
        for (Object object2 : ag.a) {
            h h2 = k2.n(b2.a((ad)object2)).d();
            if (!h2.a() && h2 != h.i) continue;
            return false;
        }
        object2 = k2.n(b2.c()).c();
        return object2 == p.aK || object2 == p.m && !k2.n(b2.b()).d().d();
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, n n2) {
        n2.a(net.minecraft.u.n.i, 1.0f);
    }

    @Override
    public c bR_() {
        return net.minecraft.u.c.c;
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

