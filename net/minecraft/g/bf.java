/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.aj;
import net.minecraft.w.n;

public class bf
extends cn {
    private final boolean a;

    public bf(boolean bl2) {
        super(h.e);
        if (bl2) {
            this.b(true);
        }
        this.a = bl2;
    }

    @Override
    public int a(k k2) {
        return 30;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.w.a.b b3) {
        this.c(k2, b2);
        super.a(k2, b2, b3);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, n n2) {
        this.c(k2, b2);
        super.a(k2, b2, n2);
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        this.c(k2, b2);
        return super.a(k2, b2, b3, b4, ah2, cu2, ad2, f2, f3, f4);
    }

    private void c(k k2, net.minecraft.u.b.b b2) {
        this.d(k2, b2);
        if (this == p.aC) {
            k2.b(b2, p.aD.v());
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (this == p.aD) {
            k2.b(b2, p.aC.v());
        }
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.aE;
    }

    @Override
    public int a(int n2, Random random) {
        return this.a(random) + random.nextInt(n2 + 1);
    }

    @Override
    public int a(Random random) {
        return 4 + random.nextInt(2);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, float f2, int n2) {
        super.a(k2, b2, b3, f2, n2);
        if (this.a(b3, k2.p, n2) != cg.a(this)) {
            int n3 = 1 + k2.p.nextInt(5);
            this.b(k2, b2, n3);
        }
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        if (this.a) {
            this.d(k2, b3);
        }
    }

    private void d(k k2, net.minecraft.u.b.b b2) {
        Random random = k2.p;
        double d2 = 0.0625;
        for (int i2 = 0; i2 < 6; ++i2) {
            double d3 = (float)b2.cy_() + random.nextFloat();
            double d4 = (float)b2.k() + random.nextFloat();
            double d5 = (float)b2.l() + random.nextFloat();
            if (i2 == 0 && !k2.n(b2.b()).s()) {
                d4 = (double)b2.k() + 0.0625 + 1.0;
            }
            if (i2 == 1 && !k2.n(b2.c()).s()) {
                d4 = (double)b2.k() - 0.0625;
            }
            if (i2 == 2 && !k2.n(b2.e()).s()) {
                d5 = (double)b2.l() + 0.0625 + 1.0;
            }
            if (i2 == 3 && !k2.n(b2.d()).s()) {
                d5 = (double)b2.l() - 0.0625;
            }
            if (i2 == 4 && !k2.n(b2.g()).s()) {
                d3 = (double)b2.cy_() + 0.0625 + 1.0;
            }
            if (i2 == 5 && !k2.n(b2.f()).s()) {
                d3 = (double)b2.cy_() - 0.0625;
            }
            if (!(d3 < (double)b2.cy_() || d3 > (double)(b2.cy_() + 1) || d4 < 0.0 || d4 > (double)(b2.k() + 1) || d5 < (double)b2.l()) && !(d5 > (double)(b2.l() + 1))) continue;
            k2.a(aj.E, d3, d4, d5, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    protected cu j(b b2) {
        return new cu(p.aC);
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(cg.a(p.aC), 1, this.k(b3));
    }
}

