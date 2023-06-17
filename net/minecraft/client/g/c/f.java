/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.c;

import net.minecraft.a.p;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.ar;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.c.o;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.g;
import net.minecraft.client.r;
import net.minecraft.f.ab;
import net.minecraft.f.ap;
import net.minecraft.g.c.b;
import net.minecraft.q.k;
import net.minecraft.u.bi;

public class f
extends o {
    private static /* synthetic */ int[] a;

    public void a(ab ab2, double d2, double d3, double d4, float f2, int n2) {
        if (r.z().j.aN() || r.z().j.a()) {
            super.a((ap)ab2, d2, d3, d4, f2, n2);
            net.minecraft.u.b.b b2 = ab2.g();
            net.minecraft.u.b.b b3 = ab2.h();
            if (b3.cy_() >= 1 && b3.k() >= 1 && b3.l() >= 1 && (ab2.n() == net.minecraft.f.r.a || ab2.n() == net.minecraft.f.r.b)) {
                double d5;
                double d6;
                double d7;
                double d8;
                double d9;
                double d10;
                double d11 = 0.01;
                double d12 = b2.cy_();
                double d13 = b2.l();
                double d14 = d3 + (double)b2.k() - 0.01;
                double d15 = d14 + (double)b3.k() + 0.02;
                switch (f.a()[ab2.i().ordinal()]) {
                    case 2: {
                        d10 = (double)b3.cy_() + 0.02;
                        d9 = -((double)b3.l() + 0.02);
                        break;
                    }
                    case 3: {
                        d10 = -((double)b3.cy_() + 0.02);
                        d9 = (double)b3.l() + 0.02;
                        break;
                    }
                    default: {
                        d10 = (double)b3.cy_() + 0.02;
                        d9 = (double)b3.l() + 0.02;
                    }
                }
                switch (ab2.j()) {
                    case b: {
                        d8 = d2 + (d9 < 0.0 ? d12 - 0.01 : d12 + 1.0 + 0.01);
                        d7 = d4 + (d10 < 0.0 ? d13 + 1.0 + 0.01 : d13 - 0.01);
                        d6 = d8 - d9;
                        d5 = d7 + d10;
                        break;
                    }
                    case c: {
                        d8 = d2 + (d10 < 0.0 ? d12 - 0.01 : d12 + 1.0 + 0.01);
                        d7 = d4 + (d9 < 0.0 ? d13 - 0.01 : d13 + 1.0 + 0.01);
                        d6 = d8 - d10;
                        d5 = d7 - d9;
                        break;
                    }
                    case d: {
                        d8 = d2 + (d9 < 0.0 ? d12 + 1.0 + 0.01 : d12 - 0.01);
                        d7 = d4 + (d10 < 0.0 ? d13 - 0.01 : d13 + 1.0 + 0.01);
                        d6 = d8 + d9;
                        d5 = d7 - d10;
                        break;
                    }
                    default: {
                        d8 = d2 + (d10 < 0.0 ? d12 + 1.0 + 0.01 : d12 - 0.01);
                        d7 = d4 + (d9 < 0.0 ? d13 + 1.0 + 0.01 : d13 - 0.01);
                        d6 = d8 + d10;
                        d5 = d7 + d9;
                    }
                }
                int n3 = 255;
                int n4 = 223;
                int n5 = 127;
                ci ci2 = ci.a();
                g g2 = ci2.c();
                bd.o();
                bd.f();
                bd.w();
                bd.l();
                bd.a(ad.l, bc.j, ad.e, bc.n);
                this.a(true);
                if (ab2.n() == net.minecraft.f.r.a || ab2.z()) {
                    this.a(ci2, g2, d8, d14, d7, d6, d15, d5, 255, 223, 127);
                }
                if (ab2.n() == net.minecraft.f.r.a && ab2.y()) {
                    this.a(ab2, d2, d3, d4, b2, ci2, g2, true);
                    this.a(ab2, d2, d3, d4, b2, ci2, g2, false);
                }
                this.a(false);
                bd.d(1.0f);
                bd.e();
                bd.v();
                bd.j();
                bd.a(true);
                bd.n();
            }
        }
    }

    private void a(ab ab2, double d2, double d3, double d4, net.minecraft.u.b.b b2, ci ci2, g g2, boolean bl2) {
        bd.d(bl2 ? 3.0f : 1.0f);
        g2.a(3, net.minecraft.client.g.d.b.f);
        k k2 = ab2.cD_();
        net.minecraft.u.b.b b3 = ab2.D();
        net.minecraft.u.b.b b4 = b3.a(b2);
        for (net.minecraft.u.b.b b5 : net.minecraft.u.b.g.a(b4, b4.a(ab2.h()).a(-1, -1, -1))) {
            boolean bl3;
            b b6 = k2.n(b5);
            boolean bl4 = b6 == p.a.v();
            boolean bl5 = bl3 = b6 == p.dj.v();
            if (!bl4 && !bl3) continue;
            float f2 = bl4 ? 0.05f : 0.0f;
            double d5 = (double)((float)(b5.cy_() - b3.cy_()) + 0.45f) + d2 - (double)f2;
            double d6 = (double)((float)(b5.k() - b3.k()) + 0.45f) + d3 - (double)f2;
            double d7 = (double)((float)(b5.l() - b3.l()) + 0.45f) + d4 - (double)f2;
            double d8 = (double)((float)(b5.cy_() - b3.cy_()) + 0.55f) + d2 + (double)f2;
            double d9 = (double)((float)(b5.k() - b3.k()) + 0.55f) + d3 + (double)f2;
            double d10 = (double)((float)(b5.l() - b3.l()) + 0.55f) + d4 + (double)f2;
            if (bl2) {
                ar.a(g2, d5, d6, d7, d8, d9, d10, 0.0f, 0.0f, 0.0f, 1.0f);
                continue;
            }
            if (bl4) {
                ar.a(g2, d5, d6, d7, d8, d9, d10, 0.5f, 0.5f, 1.0f, 1.0f);
                continue;
            }
            ar.a(g2, d5, d6, d7, d8, d9, d10, 1.0f, 0.25f, 0.25f, 1.0f);
        }
        ci2.b();
    }

    private void a(ci ci2, g g2, double d2, double d3, double d4, double d5, double d6, double d7, int n2, int n3, int n4) {
        bd.d(2.0f);
        g2.a(3, net.minecraft.client.g.d.b.f);
        g2.b(d2, d3, d4).a((float)n3, (float)n3, (float)n3, 0.0f).d();
        g2.b(d2, d3, d4).b(n3, n3, n3, n2).d();
        g2.b(d5, d3, d4).b(n3, n4, n4, n2).d();
        g2.b(d5, d3, d7).b(n3, n3, n3, n2).d();
        g2.b(d2, d3, d7).b(n3, n3, n3, n2).d();
        g2.b(d2, d3, d4).b(n4, n4, n3, n2).d();
        g2.b(d2, d6, d4).b(n4, n3, n4, n2).d();
        g2.b(d5, d6, d4).b(n3, n3, n3, n2).d();
        g2.b(d5, d6, d7).b(n3, n3, n3, n2).d();
        g2.b(d2, d6, d7).b(n3, n3, n3, n2).d();
        g2.b(d2, d6, d4).b(n3, n3, n3, n2).d();
        g2.b(d2, d6, d7).b(n3, n3, n3, n2).d();
        g2.b(d2, d3, d7).b(n3, n3, n3, n2).d();
        g2.b(d5, d3, d7).b(n3, n3, n3, n2).d();
        g2.b(d5, d6, d7).b(n3, n3, n3, n2).d();
        g2.b(d5, d6, d4).b(n3, n3, n3, n2).d();
        g2.b(d5, d3, d4).b(n3, n3, n3, n2).d();
        g2.b(d5, d3, d4).a((float)n3, (float)n3, (float)n3, 0.0f).d();
        ci2.b();
        bd.d(1.0f);
    }

    public boolean a(ab ab2) {
        return true;
    }

    static /* synthetic */ int[] a() {
        if (a != null) {
            return a;
        }
        int[] arrn = new int[bi.values().length];
        try {
            arrn[bi.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bi.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bi.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        a = arrn;
        return arrn;
    }
}

