/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.dq;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.aj;
import net.minecraft.u.b.a;
import net.minecraft.w.f.n;

public class f
extends cn {
    protected static final a a = new a(0.0625, 0.0, 0.0625, 0.9375, 1.0, 0.9375);

    public f() {
        super(h.D, e.E);
    }

    @Override
    public a a(b b2, net.minecraft.q.n n2, net.minecraft.u.b.b b3) {
        return a;
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
        this.c(k2, b2);
    }

    private void c(k k2, net.minecraft.u.b.b b2) {
        if (dq.m(k2.n(b2.c())) && b2.k() >= 0) {
            int n2 = 32;
            if (!dq.a && k2.a(b2.a(-32, -32, -32), b2.a(32, 32, 32))) {
                k2.a(new n(k2, (float)b2.cy_() + 0.5f, b2.k(), (float)b2.l() + 0.5f, this.v()));
            } else {
                k2.f(b2);
                net.minecraft.u.b.b b3 = b2;
                while (dq.m(k2.n(b3)) && b3.k() > 0) {
                    b3 = b3.c();
                }
                if (b3.k() > 0) {
                    k2.a(b3, this.v(), 2);
                }
            }
        }
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        this.d(k2, b2);
        return true;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.w.a.b b3) {
        this.d(k2, b2);
    }

    private void d(k k2, net.minecraft.u.b.b b2) {
        b b3 = k2.n(b2);
        if (b3.c() == this) {
            for (int i2 = 0; i2 < 1000; ++i2) {
                net.minecraft.u.b.b b4 = b2.a(k2.p.nextInt(16) - k2.p.nextInt(16), k2.p.nextInt(8) - k2.p.nextInt(8), k2.p.nextInt(16) - k2.p.nextInt(16));
                if (k2.n((net.minecraft.u.b.b)b4).c().L != h.a) continue;
                if (k2.C) {
                    for (int i3 = 0; i3 < 128; ++i3) {
                        double d2 = k2.p.nextDouble();
                        float f2 = (k2.p.nextFloat() - 0.5f) * 0.2f;
                        float f3 = (k2.p.nextFloat() - 0.5f) * 0.2f;
                        float f4 = (k2.p.nextFloat() - 0.5f) * 0.2f;
                        double d3 = (double)b4.cy_() + (double)(b2.cy_() - b4.cy_()) * d2 + (k2.p.nextDouble() - 0.5) + 0.5;
                        double d4 = (double)b4.k() + (double)(b2.k() - b4.k()) * d2 + k2.p.nextDouble() - 0.5;
                        double d5 = (double)b4.l() + (double)(b2.l() - b4.l()) * d2 + (k2.p.nextDouble() - 0.5) + 0.5;
                        k2.a(aj.y, d3, d4, d5, (double)f2, (double)f3, (double)f4, new int[0]);
                    }
                } else {
                    k2.a(b4, b3, 2);
                    k2.f(b2);
                }
                return;
            }
        }
    }

    @Override
    public int a(k k2) {
        return 5;
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
    public boolean a(b b2, net.minecraft.q.n n2, net.minecraft.u.b.b b3, ad ad2) {
        return true;
    }
}

