/*
 * Decompiled with CFR 0.150.
 */
public class bck {
    private final gt a;
    private final ars[] b = new ars[2];
    private final ars[] c = new ars[2];
    private ars d;

    public bck(gt gt2) {
        this.a = gt2;
        this.a();
    }

    protected void a() {
        dam dam2 = bxy.B().T();
        this.b[0] = dam2.a("minecraft:blocks/lava_still");
        this.b[1] = dam2.a("minecraft:blocks/lava_flow");
        this.c[0] = dam2.a("minecraft:blocks/water_still");
        this.c[1] = dam2.a("minecraft:blocks/water_flow");
        this.d = dam2.a("minecraft:blocks/water_overlay");
    }

    public boolean a(bnj bnj2, dbk dbk2, cmz cmz2, bix bix2) {
        float f2;
        float f3;
        float f4;
        float f5;
        en en2 = (en)dbk2.t();
        boolean bl2 = dbk2.a() == ahk.i;
        ars[] arrars = bl2 ? this.b : this.c;
        int n2 = this.a.a(dbk2, bnj2, cmz2, 0);
        float f6 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f7 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f8 = (float)(n2 & 0xFF) / 255.0f;
        boolean bl3 = dbk2.c(bnj2, cmz2, bqk.b);
        boolean bl4 = dbk2.c(bnj2, cmz2, bqk.a);
        boolean[] arrbl = new boolean[]{dbk2.c(bnj2, cmz2, bqk.c), dbk2.c(bnj2, cmz2, bqk.d), dbk2.c(bnj2, cmz2, bqk.e), dbk2.c(bnj2, cmz2, bqk.f)};
        if (!(bl3 || bl4 || arrbl[0] || arrbl[1] || arrbl[2] || arrbl[3])) {
            return false;
        }
        boolean bl5 = false;
        float f9 = 0.5f;
        float f10 = 1.0f;
        float f11 = 0.8f;
        float f12 = 0.6f;
        ahk ahk2 = dbk2.a();
        float f13 = this.a(bnj2, cmz2, ahk2);
        float f14 = this.a(bnj2, cmz2.j(), ahk2);
        float f15 = this.a(bnj2, cmz2.l().j(), ahk2);
        float f16 = this.a(bnj2, cmz2.l(), ahk2);
        double d2 = cmz2.a();
        double d3 = cmz2.b();
        double d4 = cmz2.c();
        float f17 = 0.001f;
        if (bl3) {
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            bl5 = true;
            f5 = en.a(bnj2, cmz2, ahk2, dbk2);
            ars ars2 = f5 > -999.0f ? arrars[1] : arrars[0];
            f13 -= 0.001f;
            f14 -= 0.001f;
            f15 -= 0.001f;
            f16 -= 0.001f;
            if (f5 < -999.0f) {
                f4 = ars2.a(0.0);
                f23 = ars2.b(0.0);
                f3 = f4;
                f22 = ars2.b(16.0);
                f21 = ars2.a(16.0);
                f20 = f22;
                f19 = f21;
                f18 = f23;
            } else {
                float f24 = cmk.a(f5) * 0.25f;
                float f25 = cmk.b(f5) * 0.25f;
                float f26 = 8.0f;
                f4 = ars2.a((double)(8.0f + (-f25 - f24) * 16.0f));
                f23 = ars2.b((double)(8.0f + (-f25 + f24) * 16.0f));
                f3 = ars2.a((double)(8.0f + (-f25 + f24) * 16.0f));
                f22 = ars2.b((double)(8.0f + (f25 + f24) * 16.0f));
                f21 = ars2.a((double)(8.0f + (f25 + f24) * 16.0f));
                f20 = ars2.b((double)(8.0f + (f25 - f24) * 16.0f));
                f19 = ars2.a((double)(8.0f + (f25 - f24) * 16.0f));
                f18 = ars2.b((double)(8.0f + (-f25 - f24) * 16.0f));
            }
            int n3 = dbk2.a(bnj2, cmz2);
            int n4 = n3 >> 16 & 0xFFFF;
            int n5 = n3 & 0xFFFF;
            float f27 = 1.0f * f6;
            float f28 = 1.0f * f7;
            f2 = 1.0f * f8;
            bix2.b(d2 + 0.0, d3 + (double)f13, d4 + 0.0).a(f27, f28, f2, 1.0f).a(f4, f23).a(n4, n5).d();
            bix2.b(d2 + 0.0, d3 + (double)f14, d4 + 1.0).a(f27, f28, f2, 1.0f).a(f3, f22).a(n4, n5).d();
            bix2.b(d2 + 1.0, d3 + (double)f15, d4 + 1.0).a(f27, f28, f2, 1.0f).a(f21, f20).a(n4, n5).d();
            bix2.b(d2 + 1.0, d3 + (double)f16, d4 + 0.0).a(f27, f28, f2, 1.0f).a(f19, f18).a(n4, n5).d();
            if (en2.b(bnj2, cmz2.g())) {
                bix2.b(d2 + 0.0, d3 + (double)f13, d4 + 0.0).a(f27, f28, f2, 1.0f).a(f4, f23).a(n4, n5).d();
                bix2.b(d2 + 1.0, d3 + (double)f16, d4 + 0.0).a(f27, f28, f2, 1.0f).a(f19, f18).a(n4, n5).d();
                bix2.b(d2 + 1.0, d3 + (double)f15, d4 + 1.0).a(f27, f28, f2, 1.0f).a(f21, f20).a(n4, n5).d();
                bix2.b(d2 + 0.0, d3 + (double)f14, d4 + 1.0).a(f27, f28, f2, 1.0f).a(f3, f22).a(n4, n5).d();
            }
        }
        if (bl4) {
            f5 = arrars[0].e();
            float f29 = arrars[0].f();
            f4 = arrars[0].g();
            f3 = arrars[0].h();
            int n6 = dbk2.a(bnj2, cmz2.h());
            int n7 = n6 >> 16 & 0xFFFF;
            int n8 = n6 & 0xFFFF;
            bix2.b(d2, d3, d4 + 1.0).a(0.5f, 0.5f, 0.5f, 1.0f).a(f5, f3).a(n7, n8).d();
            bix2.b(d2, d3, d4).a(0.5f, 0.5f, 0.5f, 1.0f).a(f5, f4).a(n7, n8).d();
            bix2.b(d2 + 1.0, d3, d4).a(0.5f, 0.5f, 0.5f, 1.0f).a(f29, f4).a(n7, n8).d();
            bix2.b(d2 + 1.0, d3, d4 + 1.0).a(0.5f, 0.5f, 0.5f, 1.0f).a(f29, f3).a(n7, n8).d();
            bl5 = true;
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            double d5;
            double d6;
            double d7;
            double d8;
            float f30;
            float f31;
            bfa bfa2;
            int n9 = 0;
            int n10 = 0;
            if (i2 == 0) {
                --n10;
            }
            if (i2 == 1) {
                ++n10;
            }
            if (i2 == 2) {
                --n9;
            }
            if (i2 == 3) {
                ++n9;
            }
            cmz cmz3 = cmz2.e(n9, 0, n10);
            ars ars3 = arrars[1];
            if (!(bl2 || (bfa2 = bnj2.n(cmz3).t()) != blg.w && bfa2 != blg.cG)) {
                ars3 = this.d;
            }
            if (!arrbl[i2]) continue;
            if (i2 == 0) {
                f31 = f13;
                f30 = f16;
                d8 = d2;
                d7 = d2 + 1.0;
                d6 = d4 + (double)0.001f;
                d5 = d4 + (double)0.001f;
            } else if (i2 == 1) {
                f31 = f15;
                f30 = f14;
                d8 = d2 + 1.0;
                d7 = d2;
                d6 = d4 + 1.0 - (double)0.001f;
                d5 = d4 + 1.0 - (double)0.001f;
            } else if (i2 == 2) {
                f31 = f14;
                f30 = f13;
                d8 = d2 + (double)0.001f;
                d7 = d2 + (double)0.001f;
                d6 = d4 + 1.0;
                d5 = d4;
            } else {
                f31 = f16;
                f30 = f15;
                d8 = d2 + 1.0 - (double)0.001f;
                d7 = d2 + 1.0 - (double)0.001f;
                d6 = d4;
                d5 = d4 + 1.0;
            }
            bl5 = true;
            f2 = ars3.a(0.0);
            float f32 = ars3.a(8.0);
            float f33 = ars3.b((double)((1.0f - f31) * 16.0f * 0.5f));
            float f34 = ars3.b((double)((1.0f - f30) * 16.0f * 0.5f));
            float f35 = ars3.b(8.0);
            int n11 = dbk2.a(bnj2, cmz3);
            int n12 = n11 >> 16 & 0xFFFF;
            int n13 = n11 & 0xFFFF;
            float f36 = i2 < 2 ? 0.8f : 0.6f;
            float f37 = 1.0f * f36 * f6;
            float f38 = 1.0f * f36 * f7;
            float f39 = 1.0f * f36 * f8;
            bix2.b(d8, d3 + (double)f31, d6).a(f37, f38, f39, 1.0f).a(f2, f33).a(n12, n13).d();
            bix2.b(d7, d3 + (double)f30, d5).a(f37, f38, f39, 1.0f).a(f32, f34).a(n12, n13).d();
            bix2.b(d7, d3 + 0.0, d5).a(f37, f38, f39, 1.0f).a(f32, f35).a(n12, n13).d();
            bix2.b(d8, d3 + 0.0, d6).a(f37, f38, f39, 1.0f).a(f2, f35).a(n12, n13).d();
            if (ars3 == this.d) continue;
            bix2.b(d8, d3 + 0.0, d6).a(f37, f38, f39, 1.0f).a(f2, f35).a(n12, n13).d();
            bix2.b(d7, d3 + 0.0, d5).a(f37, f38, f39, 1.0f).a(f32, f35).a(n12, n13).d();
            bix2.b(d7, d3 + (double)f30, d5).a(f37, f38, f39, 1.0f).a(f32, f34).a(n12, n13).d();
            bix2.b(d8, d3 + (double)f31, d6).a(f37, f38, f39, 1.0f).a(f2, f33).a(n12, n13).d();
        }
        return bl5;
    }

    private float a(bnj bnj2, cmz cmz2, ahk ahk2) {
        int n2 = 0;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < 4; ++i2) {
            cmz cmz3 = cmz2.e(-(i2 & 1), 0, -(i2 >> 1 & 1));
            if (bnj2.n(cmz3.g()).a() == ahk2) {
                return 1.0f;
            }
            dbk dbk2 = bnj2.n(cmz3);
            ahk ahk3 = dbk2.a();
            if (ahk3 == ahk2) {
                int n3 = (Integer)dbk2.b(en.a);
                if (n3 >= 8 || n3 == 0) {
                    f2 += en.b(n3) * 10.0f;
                    n2 += 10;
                }
                f2 += en.b(n3);
                ++n2;
                continue;
            }
            if (ahk3.a()) continue;
            f2 += 1.0f;
            ++n2;
        }
        return 1.0f - f2 / (float)n2;
    }
}

