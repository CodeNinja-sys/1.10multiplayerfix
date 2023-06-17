/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.a.p;
import net.minecraft.client.g.a.d;
import net.minecraft.client.g.a.f;
import net.minecraft.client.g.h.g;
import net.minecraft.client.r;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.ee;
import net.minecraft.q.n;
import net.minecraft.u.ad;

public class bp {
    private final g a;
    private final d[] b = new d[2];
    private final d[] c = new d[2];
    private d d;

    public bp(g g2) {
        this.a = g2;
        this.a();
    }

    protected void a() {
        f f2 = r.z().R();
        this.b[0] = f2.a("minecraft:blocks/lava_still");
        this.b[1] = f2.a("minecraft:blocks/lava_flow");
        this.c[0] = f2.a("minecraft:blocks/water_still");
        this.c[1] = f2.a("minecraft:blocks/water_flow");
        this.d = f2.a("minecraft:blocks/water_overlay");
    }

    public boolean a(n n2, b b2, net.minecraft.u.b.b b3, net.minecraft.client.g.g g2) {
        float f2;
        float f3;
        float f4;
        float f5;
        ee ee2 = (ee)b2.c();
        boolean bl2 = b2.d() == h.i;
        d[] arrd = bl2 ? this.b : this.c;
        int n3 = this.a.a(b2, n2, b3, 0);
        float f6 = (float)(n3 >> 16 & 0xFF) / 255.0f;
        float f7 = (float)(n3 >> 8 & 0xFF) / 255.0f;
        float f8 = (float)(n3 & 0xFF) / 255.0f;
        boolean bl3 = b2.c(n2, b3, ad.b);
        boolean bl4 = b2.c(n2, b3, ad.a);
        boolean[] arrbl = new boolean[]{b2.c(n2, b3, ad.c), b2.c(n2, b3, ad.d), b2.c(n2, b3, ad.e), b2.c(n2, b3, ad.f)};
        if (!(bl3 || bl4 || arrbl[0] || arrbl[1] || arrbl[2] || arrbl[3])) {
            return false;
        }
        boolean bl5 = false;
        float f9 = 0.5f;
        float f10 = 1.0f;
        float f11 = 0.8f;
        float f12 = 0.6f;
        h h2 = b2.d();
        float f13 = this.a(n2, b3, h2);
        float f14 = this.a(n2, b3.e(), h2);
        float f15 = this.a(n2, b3.g().e(), h2);
        float f16 = this.a(n2, b3.g(), h2);
        double d2 = b3.cy_();
        double d3 = b3.k();
        double d4 = b3.l();
        float f17 = 0.001f;
        if (bl3) {
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            bl5 = true;
            f5 = ee.a(n2, b3, h2, b2);
            d d5 = f5 > -999.0f ? arrd[1] : arrd[0];
            f13 -= 0.001f;
            f14 -= 0.001f;
            f15 -= 0.001f;
            f16 -= 0.001f;
            if (f5 < -999.0f) {
                f4 = d5.a(0.0);
                f23 = d5.b(0.0);
                f3 = f4;
                f22 = d5.b(16.0);
                f21 = d5.a(16.0);
                f20 = f22;
                f19 = f21;
                f18 = f23;
            } else {
                float f24 = net.minecraft.u.b.n.a(f5) * 0.25f;
                float f25 = net.minecraft.u.b.n.b(f5) * 0.25f;
                float f26 = 8.0f;
                f4 = d5.a((double)(8.0f + (-f25 - f24) * 16.0f));
                f23 = d5.b((double)(8.0f + (-f25 + f24) * 16.0f));
                f3 = d5.a((double)(8.0f + (-f25 + f24) * 16.0f));
                f22 = d5.b((double)(8.0f + (f25 + f24) * 16.0f));
                f21 = d5.a((double)(8.0f + (f25 + f24) * 16.0f));
                f20 = d5.b((double)(8.0f + (f25 - f24) * 16.0f));
                f19 = d5.a((double)(8.0f + (f25 - f24) * 16.0f));
                f18 = d5.b((double)(8.0f + (-f25 - f24) * 16.0f));
            }
            int n4 = b2.a(n2, b3);
            int n5 = n4 >> 16 & 0xFFFF;
            int n6 = n4 & 0xFFFF;
            float f27 = 1.0f * f6;
            float f28 = 1.0f * f7;
            f2 = 1.0f * f8;
            g2.b(d2 + 0.0, d3 + (double)f13, d4 + 0.0).a(f27, f28, f2, 1.0f).a(f4, f23).a(n5, n6).d();
            g2.b(d2 + 0.0, d3 + (double)f14, d4 + 1.0).a(f27, f28, f2, 1.0f).a(f3, f22).a(n5, n6).d();
            g2.b(d2 + 1.0, d3 + (double)f15, d4 + 1.0).a(f27, f28, f2, 1.0f).a(f21, f20).a(n5, n6).d();
            g2.b(d2 + 1.0, d3 + (double)f16, d4 + 0.0).a(f27, f28, f2, 1.0f).a(f19, f18).a(n5, n6).d();
            if (ee2.c(n2, b3.b())) {
                g2.b(d2 + 0.0, d3 + (double)f13, d4 + 0.0).a(f27, f28, f2, 1.0f).a(f4, f23).a(n5, n6).d();
                g2.b(d2 + 1.0, d3 + (double)f16, d4 + 0.0).a(f27, f28, f2, 1.0f).a(f19, f18).a(n5, n6).d();
                g2.b(d2 + 1.0, d3 + (double)f15, d4 + 1.0).a(f27, f28, f2, 1.0f).a(f21, f20).a(n5, n6).d();
                g2.b(d2 + 0.0, d3 + (double)f14, d4 + 1.0).a(f27, f28, f2, 1.0f).a(f3, f22).a(n5, n6).d();
            }
        }
        if (bl4) {
            f5 = arrd[0].e();
            float f29 = arrd[0].f();
            f4 = arrd[0].g();
            f3 = arrd[0].h();
            int n7 = b2.a(n2, b3.c());
            int n8 = n7 >> 16 & 0xFFFF;
            int n9 = n7 & 0xFFFF;
            g2.b(d2, d3, d4 + 1.0).a(0.5f, 0.5f, 0.5f, 1.0f).a(f5, f3).a(n8, n9).d();
            g2.b(d2, d3, d4).a(0.5f, 0.5f, 0.5f, 1.0f).a(f5, f4).a(n8, n9).d();
            g2.b(d2 + 1.0, d3, d4).a(0.5f, 0.5f, 0.5f, 1.0f).a(f29, f4).a(n8, n9).d();
            g2.b(d2 + 1.0, d3, d4 + 1.0).a(0.5f, 0.5f, 0.5f, 1.0f).a(f29, f3).a(n8, n9).d();
            bl5 = true;
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            double d6;
            double d7;
            double d8;
            double d9;
            float f30;
            float f31;
            cn cn2;
            int n10 = 0;
            int n11 = 0;
            if (i2 == 0) {
                --n11;
            }
            if (i2 == 1) {
                ++n11;
            }
            if (i2 == 2) {
                --n10;
            }
            if (i2 == 3) {
                ++n10;
            }
            net.minecraft.u.b.b b4 = b3.a(n10, 0, n11);
            d d10 = arrd[1];
            if (!(bl2 || (cn2 = n2.n(b4).c()) != p.w && cn2 != p.cG)) {
                d10 = this.d;
            }
            if (!arrbl[i2]) continue;
            if (i2 == 0) {
                f31 = f13;
                f30 = f16;
                d9 = d2;
                d8 = d2 + 1.0;
                d7 = d4 + (double)0.001f;
                d6 = d4 + (double)0.001f;
            } else if (i2 == 1) {
                f31 = f15;
                f30 = f14;
                d9 = d2 + 1.0;
                d8 = d2;
                d7 = d4 + 1.0 - (double)0.001f;
                d6 = d4 + 1.0 - (double)0.001f;
            } else if (i2 == 2) {
                f31 = f14;
                f30 = f13;
                d9 = d2 + (double)0.001f;
                d8 = d2 + (double)0.001f;
                d7 = d4 + 1.0;
                d6 = d4;
            } else {
                f31 = f16;
                f30 = f15;
                d9 = d2 + 1.0 - (double)0.001f;
                d8 = d2 + 1.0 - (double)0.001f;
                d7 = d4;
                d6 = d4 + 1.0;
            }
            bl5 = true;
            f2 = d10.a(0.0);
            float f32 = d10.a(8.0);
            float f33 = d10.b((double)((1.0f - f31) * 16.0f * 0.5f));
            float f34 = d10.b((double)((1.0f - f30) * 16.0f * 0.5f));
            float f35 = d10.b(8.0);
            int n12 = b2.a(n2, b4);
            int n13 = n12 >> 16 & 0xFFFF;
            int n14 = n12 & 0xFFFF;
            float f36 = i2 < 2 ? 0.8f : 0.6f;
            float f37 = 1.0f * f36 * f6;
            float f38 = 1.0f * f36 * f7;
            float f39 = 1.0f * f36 * f8;
            g2.b(d9, d3 + (double)f31, d7).a(f37, f38, f39, 1.0f).a(f2, f33).a(n13, n14).d();
            g2.b(d8, d3 + (double)f30, d6).a(f37, f38, f39, 1.0f).a(f32, f34).a(n13, n14).d();
            g2.b(d8, d3 + 0.0, d6).a(f37, f38, f39, 1.0f).a(f32, f35).a(n13, n14).d();
            g2.b(d9, d3 + 0.0, d7).a(f37, f38, f39, 1.0f).a(f2, f35).a(n13, n14).d();
            if (d10 == this.d) continue;
            g2.b(d9, d3 + 0.0, d7).a(f37, f38, f39, 1.0f).a(f2, f35).a(n13, n14).d();
            g2.b(d8, d3 + 0.0, d6).a(f37, f38, f39, 1.0f).a(f32, f35).a(n13, n14).d();
            g2.b(d8, d3 + (double)f30, d6).a(f37, f38, f39, 1.0f).a(f32, f34).a(n13, n14).d();
            g2.b(d9, d3 + (double)f31, d7).a(f37, f38, f39, 1.0f).a(f2, f33).a(n13, n14).d();
        }
        return bl5;
    }

    private float a(n n2, net.minecraft.u.b.b b2, h h2) {
        int n3 = 0;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < 4; ++i2) {
            net.minecraft.u.b.b b3 = b2.a(-(i2 & 1), 0, -(i2 >> 1 & 1));
            if (n2.n(b3.b()).d() == h2) {
                return 1.0f;
            }
            b b4 = n2.n(b3);
            h h3 = b4.d();
            if (h3 != h2) {
                if (h3.a()) continue;
                f2 += 1.0f;
                ++n3;
                continue;
            }
            int n4 = (Integer)b4.a(ee.a);
            if (n4 >= 8 || n4 == 0) {
                f2 += ee.b(n4) * 10.0f;
                n3 += 10;
            }
            f2 += ee.b(n4);
            ++n3;
        }
        return 1.0f - f2 / (float)n3;
    }
}

