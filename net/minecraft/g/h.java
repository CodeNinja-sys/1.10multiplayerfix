/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.f.am;
import net.minecraft.f.ap;
import net.minecraft.g.a;
import net.minecraft.g.a.e;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.aj;

public class h
extends a {
    protected h(net.minecraft.g.a.h h2) {
        super(h2);
        this.a(1.0f);
    }

    @Override
    public ap a(k k2, int n2) {
        return new am();
    }

    @Override
    public boolean a(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        b b4 = n2.n(b3.a(ad2));
        cn cn2 = b4.c();
        return !b4.s() && cn2 != p.db;
    }

    @Override
    public net.minecraft.u.b.a a(b b2, k k2, net.minecraft.u.b.b b3) {
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

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        ap ap2 = k2.q(b3);
        if (ap2 instanceof am) {
            int n2 = ((am)ap2).n();
            for (int i2 = 0; i2 < n2; ++i2) {
                double d2 = (float)b3.cy_() + random.nextFloat();
                double d3 = (float)b3.k() + random.nextFloat();
                double d4 = (float)b3.l() + random.nextFloat();
                double d5 = ((double)random.nextFloat() - 0.5) * 0.5;
                double d6 = ((double)random.nextFloat() - 0.5) * 0.5;
                double d7 = ((double)random.nextFloat() - 0.5) * 0.5;
                int n3 = random.nextInt(2) * 2 - 1;
                if (random.nextBoolean()) {
                    d4 = (double)b3.l() + 0.5 + 0.25 * (double)n3;
                    d7 = random.nextFloat() * 2.0f * (float)n3;
                } else {
                    d2 = (double)b3.cy_() + 0.5 + 0.25 * (double)n3;
                    d5 = random.nextFloat() * 2.0f * (float)n3;
                }
                k2.a(aj.y, d2, d3, d4, d5, d6, d7, new int[0]);
            }
        }
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return null;
    }

    @Override
    public e g(b b2) {
        return e.E;
    }
}

