/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.f;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.dy;
import net.minecraft.g.gc;
import net.minecraft.m.cg;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ac;
import net.minecraft.u.ad;
import net.minecraft.u.ag;
import net.minecraft.u.aj;
import net.minecraft.u.b.a;
import net.minecraft.u.b.s;
import net.minecraft.u.bu;
import net.minecraft.u.c;

public abstract class ee
extends cn {
    public static final g a = g.a("level", 0, 15);

    protected ee(h h2) {
        super(h2);
        this.z(this.O.b().a(a, Integer.valueOf(0)));
        this.b(true);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return x;
    }

    @Override
    public a a(b b2, k k2, net.minecraft.u.b.b b3) {
        return y;
    }

    @Override
    public boolean a(n n2, net.minecraft.u.b.b b2) {
        return this.L != h.i;
    }

    public static float b(int n2) {
        if (n2 >= 8) {
            n2 = 0;
        }
        return (float)(n2 + 1) / 9.0f;
    }

    protected int l(b b2) {
        return b2.d() == this.L ? (Integer)b2.a(a) : -1;
    }

    protected int m(b b2) {
        int n2 = this.l(b2);
        return n2 >= 8 ? 0 : n2;
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
    public boolean a(b b2, boolean bl2) {
        return bl2 && (Integer)b2.a(a) == 0;
    }

    @Override
    public boolean a(n n2, net.minecraft.u.b.b b2, ad ad2) {
        h h2 = n2.n(b2).d();
        return h2 == this.L ? false : (ad2 == ad.b ? true : (h2 == h.w ? false : super.a(n2, b2, ad2)));
    }

    @Override
    public boolean a(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return n2.n(b3.a(ad2)).d() == this.L ? false : (ad2 == ad.b ? true : super.a(b2, n2, b3, ad2));
    }

    public boolean c(n n2, net.minecraft.u.b.b b2) {
        for (int i2 = -1; i2 <= 1; ++i2) {
            for (int i3 = -1; i3 <= 1; ++i3) {
                b b3 = n2.n(b2.a(i2, 0, i3));
                if (b3.d() == this.L || b3.e()) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public ac a(b b2) {
        return ac.b;
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    protected s a(n n2, net.minecraft.u.b.b b2, b b3) {
        Object object2;
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 0.0;
        int n3 = this.m(b3);
        net.minecraft.u.b.h h2 = net.minecraft.u.b.h.m();
        for (Object object2 : ag.a) {
            int n4;
            h2.g(b2).c((ad)object2);
            int n5 = this.m(n2.n(h2));
            if (n5 < 0) {
                if (n2.n(h2).d().c() || (n5 = this.m(n2.n(h2.c()))) < 0) continue;
                n4 = n5 - (n3 - 8);
                d2 += (double)(((ad)object2).h() * n4);
                d3 += (double)(((ad)object2).i() * n4);
                d4 += (double)(((ad)object2).j() * n4);
                continue;
            }
            if (n5 < 0) continue;
            n4 = n5 - n3;
            d2 += (double)(((ad)object2).h() * n4);
            d3 += (double)(((ad)object2).i() * n4);
            d4 += (double)(((ad)object2).j() * n4);
        }
        object2 = new s(d2, d3, d4);
        if ((Integer)b3.a(a) >= 8) {
            for (Object object3 : ag.a) {
                h2.g(b2).c((ad)object3);
                if (!this.a(n2, (net.minecraft.u.b.b)h2, (ad)object3) && !this.a(n2, h2.b(), (ad)object3)) continue;
                object2 = ((s)object2).a().b(0.0, -6.0, 0.0);
                break;
            }
        }
        h2.n();
        return ((s)object2).a();
    }

    @Override
    public s a(k k2, net.minecraft.u.b.b b2, net.minecraft.w.n n2, s s2) {
        return s2.e(this.a((n)k2, b2, k2.n(b2)));
    }

    @Override
    public int a(k k2) {
        return this.L == h.h ? 5 : (this.L == h.i ? (k2.q.n() ? 10 : 30) : 0);
    }

    @Override
    public int c(b b2, n n2, net.minecraft.u.b.b b3) {
        int n3 = n2.b(b3, 0);
        int n4 = n2.b(b3.b(), 0);
        int n5 = n3 & 0xFF;
        int n6 = n4 & 0xFF;
        int n7 = n3 >> 16 & 0xFF;
        int n8 = n4 >> 16 & 0xFF;
        return (n5 > n6 ? n5 : n6) | (n7 > n8 ? n7 : n8) << 16;
    }

    @Override
    public c bR_() {
        return this.L == h.h ? c.d : c.a;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        h h2;
        double d2 = b3.cy_();
        double d3 = b3.k();
        double d4 = b3.l();
        if (this.L == h.h) {
            int n2 = (Integer)b2.a(a);
            if (n2 > 0 && n2 < 8) {
                if (random.nextInt(64) == 0) {
                    k2.a(d2 + 0.5, d3 + 0.5, d4 + 0.5, f.gM, bu.e, random.nextFloat() * 0.25f + 0.75f, random.nextFloat() + 0.5f, false);
                }
            } else if (random.nextInt(10) == 0) {
                k2.a(aj.h, d2 + (double)random.nextFloat(), d3 + (double)random.nextFloat(), d4 + (double)random.nextFloat(), 0.0, 0.0, 0.0, new int[0]);
            }
        }
        if (this.L == h.i && k2.n(b3.b()).d() == h.a && !k2.n(b3.b()).s()) {
            if (random.nextInt(100) == 0) {
                double d5 = d2 + (double)random.nextFloat();
                double d6 = d3 + b2.c((n)k2, (net.minecraft.u.b.b)b3).e;
                double d7 = d4 + (double)random.nextFloat();
                k2.a(aj.B, d5, d6, d7, 0.0, 0.0, 0.0, new int[0]);
                k2.a(d5, d6, d7, f.di, bu.e, 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
            if (random.nextInt(200) == 0) {
                k2.a(d2, d3, d4, f.dg, bu.e, 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
        }
        if (random.nextInt(10) == 0 && k2.n(b3.c()).t() && !(h2 = k2.n(b3.b(2)).d()).c() && !h2.d()) {
            double d8 = d2 + (double)random.nextFloat();
            double d9 = d3 - 1.05;
            double d10 = d4 + (double)random.nextFloat();
            if (this.L == h.h) {
                k2.a(aj.s, d8, d9, d10, 0.0, 0.0, 0.0, new int[0]);
            } else {
                k2.a(aj.t, d8, d9, d10, 0.0, 0.0, 0.0, new int[0]);
            }
        }
    }

    public static float a(n n2, net.minecraft.u.b.b b2, h h2, b b3) {
        s s2 = ee.a(h2).a(n2, b2, b3);
        return s2.b == 0.0 && s2.d == 0.0 ? -1000.0f : (float)net.minecraft.u.b.n.b(s2.d, s2.b) - 1.5707964f;
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        this.e(k2, b2, b3);
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        this.e(k2, b3, b2);
    }

    public boolean e(k k2, net.minecraft.u.b.b b2, b b3) {
        if (this.L == h.i) {
            boolean bl2 = false;
            for (ad object : ad.values()) {
                if (object == ad.a || k2.n(b2.a(object)).d() != h.h) continue;
                bl2 = true;
                break;
            }
            if (bl2) {
                Integer n2 = (Integer)b3.a(a);
                if (n2 == 0) {
                    k2.b(b2, p.Z.v());
                    this.d(k2, b2);
                    return true;
                }
                if (n2 <= 4) {
                    k2.b(b2, p.e.v());
                    this.d(k2, b2);
                    return true;
                }
            }
        }
        return false;
    }

    protected void d(k k2, net.minecraft.u.b.b b2) {
        double d2 = b2.cy_();
        double d3 = b2.k();
        double d4 = b2.l();
        k2.a(null, b2, f.dh, bu.e, 0.5f, 2.6f + (k2.p.nextFloat() - k2.p.nextFloat()) * 0.8f);
        for (int i2 = 0; i2 < 8; ++i2) {
            k2.a(aj.m, d2 + Math.random(), d3 + 1.2, d4 + Math.random(), 0.0, 0.0, 0.0, new int[0]);
        }
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

    public static gc a(h h2) {
        if (h2 == h.h) {
            return p.i;
        }
        if (h2 == h.i) {
            return p.k;
        }
        throw new IllegalArgumentException("Invalid material");
    }

    public static dy b(h h2) {
        if (h2 == h.h) {
            return p.j;
        }
        if (h2 == h.i) {
            return p.l;
        }
        throw new IllegalArgumentException("Invalid material");
    }
}

