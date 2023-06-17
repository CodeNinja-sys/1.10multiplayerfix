/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import com.a.a.d.sz;
import java.util.Map;
import java.util.Random;
import net.minecraft.a.f;
import net.minecraft.a.p;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.et;
import net.minecraft.q.k;
import net.minecraft.q.m;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.aj;
import net.minecraft.u.b.a;
import net.minecraft.u.bu;

public class hp
extends cn {
    public static final g a = net.minecraft.g.b.g.a("age", 0, 15);
    public static final c b = net.minecraft.g.b.c.b("north");
    public static final c c = net.minecraft.g.b.c.b("east");
    public static final c d = net.minecraft.g.b.c.b("south");
    public static final c e = net.minecraft.g.b.c.b("west");
    public static final c f = net.minecraft.g.b.c.b("up");
    private final Map g = sz.g();
    private final Map h = sz.g();

    @Override
    public b b(b b2, n n2, net.minecraft.u.b.b b3) {
        return !n2.n(b3.c()).t() && !p.ab.c(n2, b3.c()) ? b2.a(b, Boolean.valueOf(this.c(n2, b3.d()))).a(c, Boolean.valueOf(this.c(n2, b3.g()))).a(d, Boolean.valueOf(this.c(n2, b3.e()))).a(e, Boolean.valueOf(this.c(n2, b3.f()))).a(f, Boolean.valueOf(this.c(n2, b3.b()))) : this.v();
    }

    protected hp() {
        super(net.minecraft.g.a.h.o);
        this.z(this.O.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
        this.b(true);
    }

    public static void h() {
        p.ab.a(p.f, 5, 20);
        p.ab.a(p.bL, 5, 20);
        p.ab.a(p.bM, 5, 20);
        p.ab.a(p.bo, 5, 20);
        p.ab.a(p.bp, 5, 20);
        p.ab.a(p.bq, 5, 20);
        p.ab.a(p.br, 5, 20);
        p.ab.a(p.bs, 5, 20);
        p.ab.a(p.bt, 5, 20);
        p.ab.a(p.aO, 5, 20);
        p.ab.a(p.aP, 5, 20);
        p.ab.a(p.aQ, 5, 20);
        p.ab.a(p.aR, 5, 20);
        p.ab.a(p.aS, 5, 20);
        p.ab.a(p.aT, 5, 20);
        p.ab.a(p.ad, 5, 20);
        p.ab.a(p.bV, 5, 20);
        p.ab.a(p.bU, 5, 20);
        p.ab.a(p.bW, 5, 20);
        p.ab.a(p.cC, 5, 20);
        p.ab.a(p.cD, 5, 20);
        p.ab.a(p.r, 5, 5);
        p.ab.a(p.s, 5, 5);
        p.ab.a(p.t, 30, 60);
        p.ab.a(p.u, 30, 60);
        p.ab.a(p.X, 30, 20);
        p.ab.a(p.W, 15, 100);
        p.ab.a(p.H, 60, 100);
        p.ab.a(p.cF, 60, 100);
        p.ab.a(p.N, 60, 100);
        p.ab.a(p.O, 60, 100);
        p.ab.a(p.I, 60, 100);
        p.ab.a(p.L, 30, 60);
        p.ab.a(p.bn, 15, 100);
        p.ab.a(p.cA, 5, 5);
        p.ab.a(p.cx, 60, 20);
        p.ab.a(p.cy, 60, 20);
    }

    public void a(cn cn2, int n2, int n3) {
        this.g.put(cn2, n2);
        this.h.put(cn2, n3);
    }

    @Override
    public a a(b b2, k k2, net.minecraft.u.b.b b3) {
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
    public int a(k k2) {
        return 30;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (k2.G().b("doFireTick")) {
            cn cn2;
            boolean bl2;
            if (!this.a_(k2, b2)) {
                k2.f(b2);
            }
            boolean bl3 = bl2 = (cn2 = k2.n(b2.c()).c()) == p.aV;
            if (k2.q instanceof m && cn2 == p.h) {
                bl2 = true;
            }
            int n2 = (Integer)b3.a(a);
            if (!bl2 && k2.J() && this.c(k2, b2) && random.nextFloat() < 0.2f + (float)n2 * 0.03f) {
                k2.f(b2);
            } else {
                if (n2 < 15) {
                    b3 = b3.a(a, Integer.valueOf(n2 + random.nextInt(3) / 2));
                    k2.a(b2, b3, 4);
                }
                k2.a(b2, (cn)this, this.a(k2) + random.nextInt(10));
                if (!bl2) {
                    if (!this.d(k2, b2)) {
                        if (!k2.n(b2.c()).t() || n2 > 3) {
                            k2.f(b2);
                        }
                        return;
                    }
                    if (!this.c((n)k2, b2.c()) && n2 == 15 && random.nextInt(4) == 0) {
                        k2.f(b2);
                        return;
                    }
                }
                boolean bl4 = k2.B(b2);
                int n3 = 0;
                if (bl4) {
                    n3 = -50;
                }
                this.a(k2, b2.g(), 300 + n3, random, n2);
                this.a(k2, b2.f(), 300 + n3, random, n2);
                this.a(k2, b2.c(), 250 + n3, random, n2);
                this.a(k2, b2.b(), 250 + n3, random, n2);
                this.a(k2, b2.d(), 300 + n3, random, n2);
                this.a(k2, b2.e(), 300 + n3, random, n2);
                for (int i2 = -1; i2 <= 1; ++i2) {
                    for (int i3 = -1; i3 <= 1; ++i3) {
                        for (int i4 = -1; i4 <= 4; ++i4) {
                            net.minecraft.u.b.b b4;
                            int n4;
                            if (i2 == 0 && i4 == 0 && i3 == 0) continue;
                            int n5 = 100;
                            if (i4 > 1) {
                                n5 += (i4 - 1) * 100;
                            }
                            if ((n4 = this.e(k2, b4 = b2.a(i2, i4, i3))) <= 0) continue;
                            int n6 = (n4 + 40 + k2.R().a() * 7) / (n2 + 30);
                            if (bl4) {
                                n6 /= 2;
                            }
                            if (n6 <= 0 || random.nextInt(n5) > n6 || k2.J() && this.c(k2, b4)) continue;
                            int n7 = n2 + random.nextInt(5) / 4;
                            if (n7 > 15) {
                                n7 = 15;
                            }
                            k2.a(b4, b3.a(a, Integer.valueOf(n7)), 3);
                        }
                    }
                }
            }
        }
    }

    protected boolean c(k k2, net.minecraft.u.b.b b2) {
        return k2.A(b2) || k2.A(b2.f()) || k2.A(b2.g()) || k2.A(b2.d()) || k2.A(b2.e());
    }

    @Override
    public boolean t() {
        return false;
    }

    private int b(cn cn2) {
        Integer n2 = (Integer)this.h.get(cn2);
        return n2 == null ? 0 : n2;
    }

    private int d(cn cn2) {
        Integer n2 = (Integer)this.g.get(cn2);
        return n2 == null ? 0 : n2;
    }

    private void a(k k2, net.minecraft.u.b.b b2, int n2, Random random, int n3) {
        int n4 = this.b(k2.n(b2).c());
        if (random.nextInt(n2) < n4) {
            b b3 = k2.n(b2);
            if (random.nextInt(n3 + 10) < 5 && !k2.A(b2)) {
                int n5 = n3 + random.nextInt(5) / 4;
                if (n5 > 15) {
                    n5 = 15;
                }
                k2.a(b2, this.v().a(a, Integer.valueOf(n5)), 3);
            } else {
                k2.f(b2);
            }
            if (b3.c() == p.W) {
                p.W.a_(k2, b2, b3.a(et.a, Boolean.valueOf(true)));
            }
        }
    }

    private boolean d(k k2, net.minecraft.u.b.b b2) {
        for (ad ad2 : ad.values()) {
            if (!this.c((n)k2, b2.a(ad2))) continue;
            return true;
        }
        return false;
    }

    private int e(k k2, net.minecraft.u.b.b b2) {
        if (!k2.c(b2)) {
            return 0;
        }
        int n2 = 0;
        for (ad ad2 : ad.values()) {
            n2 = Math.max(this.d(k2.n(b2.a(ad2)).c()), n2);
        }
        return n2;
    }

    @Override
    public boolean bU_() {
        return false;
    }

    public boolean c(n n2, net.minecraft.u.b.b b2) {
        return this.d(n2.n(b2).c()) > 0;
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return k2.n(b2.c()).t() || this.d(k2, b2);
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (!k2.n(b3.c()).t() && !this.d(k2, b3)) {
            k2.f(b3);
        }
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        if (k2.q.a().a() > 0 || !p.aY.c(k2, b2)) {
            if (!k2.n(b2.c()).t() && !this.d(k2, b2)) {
                k2.f(b2);
            } else {
                k2.a(b2, (cn)this, this.a(k2) + k2.p.nextInt(10));
            }
        }
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        block12: {
            block11: {
                double d2;
                double d3;
                double d4;
                int n2;
                if (random.nextInt(24) == 0) {
                    k2.a((float)b3.cy_() + 0.5f, (double)((float)b3.k() + 0.5f), (double)((float)b3.l() + 0.5f), net.minecraft.a.f.bw, bu.e, 1.0f + random.nextFloat(), random.nextFloat() * 0.7f + 0.3f, false);
                }
                if (k2.n(b3.c()).t() || p.ab.c((n)k2, b3.c())) break block11;
                if (p.ab.c((n)k2, b3.f())) {
                    for (n2 = 0; n2 < 2; ++n2) {
                        d4 = (double)b3.cy_() + random.nextDouble() * (double)0.1f;
                        d3 = (double)b3.k() + random.nextDouble();
                        d2 = (double)b3.l() + random.nextDouble();
                        k2.a(aj.m, d4, d3, d2, 0.0, 0.0, 0.0, new int[0]);
                    }
                }
                if (p.ab.c((n)k2, b3.g())) {
                    for (n2 = 0; n2 < 2; ++n2) {
                        d4 = (double)(b3.cy_() + 1) - random.nextDouble() * (double)0.1f;
                        d3 = (double)b3.k() + random.nextDouble();
                        d2 = (double)b3.l() + random.nextDouble();
                        k2.a(aj.m, d4, d3, d2, 0.0, 0.0, 0.0, new int[0]);
                    }
                }
                if (p.ab.c((n)k2, b3.d())) {
                    for (n2 = 0; n2 < 2; ++n2) {
                        d4 = (double)b3.cy_() + random.nextDouble();
                        d3 = (double)b3.k() + random.nextDouble();
                        d2 = (double)b3.l() + random.nextDouble() * (double)0.1f;
                        k2.a(aj.m, d4, d3, d2, 0.0, 0.0, 0.0, new int[0]);
                    }
                }
                if (p.ab.c((n)k2, b3.e())) {
                    for (n2 = 0; n2 < 2; ++n2) {
                        d4 = (double)b3.cy_() + random.nextDouble();
                        d3 = (double)b3.k() + random.nextDouble();
                        d2 = (double)(b3.l() + 1) - random.nextDouble() * (double)0.1f;
                        k2.a(aj.m, d4, d3, d2, 0.0, 0.0, 0.0, new int[0]);
                    }
                }
                if (!p.ab.c((n)k2, b3.b())) break block12;
                for (n2 = 0; n2 < 2; ++n2) {
                    d4 = (double)b3.cy_() + random.nextDouble();
                    d3 = (double)(b3.k() + 1) - random.nextDouble() * (double)0.1f;
                    d2 = (double)b3.l() + random.nextDouble();
                    k2.a(aj.m, d4, d3, d2, 0.0, 0.0, 0.0, new int[0]);
                }
                break block12;
            }
            for (int i2 = 0; i2 < 3; ++i2) {
                double d5 = (double)b3.cy_() + random.nextDouble();
                double d6 = (double)b3.k() + random.nextDouble() * 0.5 + 0.5;
                double d7 = (double)b3.l() + random.nextDouble();
                k2.a(aj.m, d5, d6, d7, 0.0, 0.0, 0.0, new int[0]);
            }
        }
    }

    @Override
    public e g(b b2) {
        return net.minecraft.g.a.e.f;
    }

    @Override
    public net.minecraft.u.c bR_() {
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
        return new i(this, a, b, c, d, e, f);
    }
}

