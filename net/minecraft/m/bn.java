/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.aa;
import net.minecraft.a.w;
import net.minecraft.m.av;
import net.minecraft.m.ay;
import net.minecraft.m.bq;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.j;
import net.minecraft.o.f;
import net.minecraft.q.k;
import net.minecraft.r.o;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ah;
import net.minecraft.u.bp;
import net.minecraft.u.bu;
import net.minecraft.v.d;
import net.minecraft.w.a.b;
import net.minecraft.w.c.p;
import net.minecraft.w.l;

public class bn
extends cg {
    public bn() {
        this.i = 1;
        this.e(384);
        this.a(d.j);
        this.a(new bp("pull"), new ay(this));
        this.a(new bp("pulling"), new bq(this));
    }

    private cu a(b b2) {
        if (this.h(b2.c(ah.b))) {
            return b2.c(ah.b);
        }
        if (this.h(b2.c(ah.a))) {
            return b2.c(ah.a);
        }
        for (int i2 = 0; i2 < b2.q.e(); ++i2) {
            cu cu2 = b2.q.a(i2);
            if (!this.h(cu2)) continue;
            return cu2;
        }
        return null;
    }

    protected boolean h(cu cu2) {
        return cu2 != null && cu2.a() instanceof j;
    }

    @Override
    public void a(cu cu2, k k2, l l2, int n2) {
        if (l2 instanceof b) {
            b b2 = (b)l2;
            boolean bl2 = b2.J.d || net.minecraft.o.f.a(aa.x, cu2) > 0;
            cu cu3 = this.a(b2);
            if (cu3 != null || bl2) {
                int n3;
                float f2;
                if (cu3 == null) {
                    cu3 = new cu(w.g);
                }
                if ((double)(f2 = bn.b(n3 = this.c(cu2) - n2)) >= 0.1) {
                    boolean bl3;
                    boolean bl4 = bl3 = bl2 && cu3.a() == w.g;
                    if (!k2.C) {
                        int n4;
                        int n5;
                        j j2 = (j)(cu3.a() instanceof j ? cu3.a() : w.g);
                        net.minecraft.w.c.f f3 = j2.a(k2, cu3, (l)b2);
                        f3.a(b2, b2.bb, b2.ba, 0.0f, f2 * 3.0f, 1.0f);
                        if (f2 == 1.0f) {
                            f3.a(true);
                        }
                        if ((n5 = net.minecraft.o.f.a(aa.u, cu2)) > 0) {
                            f3.c(f3.c() + (double)n5 * 0.5 + 0.5);
                        }
                        if ((n4 = net.minecraft.o.f.a(aa.v, cu2)) > 0) {
                            f3.b(n4);
                        }
                        if (net.minecraft.o.f.a(aa.w, cu2) > 0) {
                            f3.k(100);
                        }
                        cu2.a(1, (l)b2);
                        if (bl3) {
                            f3.c = p.c;
                        }
                        k2.a(f3);
                    }
                    k2.a(null, b2.aU, b2.aV, b2.aW, net.minecraft.a.f.v, bu.g, 1.0f, 1.0f / (h.nextFloat() * 0.4f + 1.2f) + f2 * 0.5f);
                    if (!bl3) {
                        --cu3.b;
                        if (cu3.b == 0) {
                            b2.q.d(cu3);
                        }
                    }
                    b2.a(o.b(this));
                }
            }
        }
    }

    public static float b(int n2) {
        float f2 = (float)n2 / 20.0f;
        if ((f2 = (f2 * f2 + f2 * 2.0f) / 3.0f) > 1.0f) {
            f2 = 1.0f;
        }
        return f2;
    }

    @Override
    public int c(cu cu2) {
        return 72000;
    }

    @Override
    public av b(cu cu2) {
        return av.e;
    }

    @Override
    public a a(cu cu2, k k2, b b2, ah ah2) {
        boolean bl2;
        boolean bl3 = bl2 = this.a(b2) != null;
        if (!b2.J.d && !bl2) {
            return !bl2 ? new a(ab.c, cu2) : new a(ab.b, cu2);
        }
        b2.b(ah2);
        return new a(ab.a, cu2);
    }

    @Override
    public int cx_() {
        return 1;
    }
}

