/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.ft;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.b.a;
import net.minecraft.v.d;

public class gs
extends ft {
    public static final g a = g.a("age", 0, 3);
    private static final a[] b = new a[]{new a(0.0, 0.0, 0.0, 1.0, 0.3125, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.5, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.6875, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.875, 1.0)};

    protected gs() {
        super(h.k, e.D);
        this.z(this.O.b().a(a, Integer.valueOf(0)));
        this.b(true);
        this.a((d)null);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return b[(Integer)b2.a(a)];
    }

    @Override
    protected boolean i(b b2) {
        return b2.c() == p.aW;
    }

    @Override
    public boolean e(k k2, net.minecraft.u.b.b b2, b b3) {
        return this.i(k2.n(b2.c()));
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        int n2 = (Integer)b3.a(a);
        if (n2 < 3 && random.nextInt(10) == 0) {
            b3 = b3.a(a, Integer.valueOf(n2 + 1));
            k2.a(b2, b3, 2);
        }
        super.a(k2, b2, b3, random);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, float f2, int n2) {
        if (!k2.C) {
            int n3 = 1;
            if ((Integer)b3.a(a) >= 3) {
                n3 = 2 + k2.p.nextInt(3);
                if (n2 > 0) {
                    n3 += k2.p.nextInt(n2 + 1);
                }
            }
            for (int i2 = 0; i2 < n3; ++i2) {
                gs.a(k2, b2, new cu(net.minecraft.a.w.bF));
            }
        }
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(net.minecraft.a.w.bF);
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

