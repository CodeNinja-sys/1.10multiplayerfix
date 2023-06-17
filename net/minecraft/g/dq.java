/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.k;
import net.minecraft.u.aj;
import net.minecraft.v.d;
import net.minecraft.w.f.n;

public class dq
extends cn {
    public static boolean a;

    public dq() {
        super(h.p);
        this.a(d.b);
    }

    public dq(h h2) {
        super(h2);
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        k2.a(b2, (cn)this, this.a(k2));
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        k2.a(b3, (cn)this, this.a(k2));
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (!k2.C) {
            this.d(k2, b2);
        }
    }

    private void d(k k2, net.minecraft.u.b.b b2) {
        if (dq.m(k2.n(b2.c())) && b2.k() >= 0) {
            int n2 = 32;
            if (!a && k2.a(b2.a(-32, -32, -32), b2.a(32, 32, 32))) {
                if (!k2.C) {
                    n n3 = new n(k2, (double)b2.cy_() + 0.5, b2.k(), (double)b2.l() + 0.5, k2.n(b2));
                    this.a(n3);
                    k2.a(n3);
                }
            } else {
                k2.f(b2);
                net.minecraft.u.b.b b3 = b2.c();
                while (dq.m(k2.n(b3)) && b3.k() > 0) {
                    b3 = b3.c();
                }
                if (b3.k() > 0) {
                    k2.b(b3.b(), this.v());
                }
            }
        }
    }

    protected void a(n n2) {
    }

    @Override
    public int a(k k2) {
        return 2;
    }

    public static boolean m(b b2) {
        cn cn2 = b2.c();
        h h2 = b2.d();
        return cn2 == p.ab || h2 == h.a || h2 == h.h || h2 == h.i;
    }

    public void c(k k2, net.minecraft.u.b.b b2) {
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        net.minecraft.u.b.b b4;
        if (random.nextInt(16) == 0 && dq.m(k2.n(b4 = b3.c()))) {
            double d2 = (float)b3.cy_() + random.nextFloat();
            double d3 = (double)b3.k() - 0.05;
            double d4 = (float)b3.l() + random.nextFloat();
            k2.a(aj.U, d2, d3, d4, 0.0, 0.0, 0.0, cn.p(b2));
        }
    }

    public int l(b b2) {
        return -16777216;
    }
}

