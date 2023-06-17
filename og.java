/*
 * Decompiled with CFR 0.150.
 */
public class og
extends buc {
    private static final bpx a = new bpx("textures/particle/particles.png");

    public og(bid bid2) {
        super(bid2);
    }

    public void a(cvo cvo2, double d2, double d3, double d4, float f2, float f3) {
        cja.D();
        cja.c((float)d2, (float)d3, (float)d4);
        cja.A();
        cja.b(0.5f, 0.5f, 0.5f);
        this.e(cvo2);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        boolean bl2 = true;
        int n2 = 2;
        float f4 = 0.0625f;
        float f5 = 0.125f;
        float f6 = 0.125f;
        float f7 = 0.1875f;
        float f8 = 1.0f;
        float f9 = 0.5f;
        float f10 = 0.5f;
        cja.b(180.0f - this.g.e, 0.0f, 1.0f, 0.0f);
        cja.b((float)(this.g.g.as == 2 ? -1 : 1) * -this.g.f, 1.0f, 0.0f, 0.0f);
        if (this.j) {
            cja.g();
            cja.e(this.d(cvo2));
        }
        bix2.a(7, bxb.j);
        bix2.b(-0.5, -0.5, 0.0).a(0.0625, 0.1875).c(0.0f, 1.0f, 0.0f).d();
        bix2.b(0.5, -0.5, 0.0).a(0.125, 0.1875).c(0.0f, 1.0f, 0.0f).d();
        bix2.b(0.5, 0.5, 0.0).a(0.125, 0.125).c(0.0f, 1.0f, 0.0f).d();
        bix2.b(-0.5, 0.5, 0.0).a(0.0625, 0.125).c(0.0f, 1.0f, 0.0f).d();
        bha2.b();
        if (this.j) {
            cja.m();
            cja.h();
        }
        cja.B();
        cja.E();
        if (cvo2.a != null && !this.j) {
            double d5;
            double d6;
            double d7;
            double d8;
            int n3 = cvo2.a.aK() == s.b ? 1 : -1;
            float f11 = cvo2.a.m(f3);
            float f12 = cmk.a(cmk.c(f11) * (float)Math.PI);
            float f13 = (cvo2.a.ai + (cvo2.a.ah - cvo2.a.ai) * f3) * ((float)Math.PI / 180);
            double d9 = cmk.a(f13);
            double d10 = cmk.b(f13);
            double d11 = (double)n3 * 0.35;
            double d12 = 0.8;
            if (this.g.g != null && this.g.g.as > 0 || cvo2.a != bxy.B().h) {
                d8 = cvo2.a.aR + (cvo2.a.aU - cvo2.a.aR) * (double)f3 - d10 * d11 - d9 * 0.8;
                d7 = cvo2.a.aS + (double)cvo2.a.A() + (cvo2.a.aV - cvo2.a.aS) * (double)f3 - 0.45;
                d6 = cvo2.a.aT + (cvo2.a.aW - cvo2.a.aT) * (double)f3 - d9 * d11 + d10 * 0.8;
                d5 = cvo2.a.ar_() ? -0.1875 : 0.0;
            } else {
                amj amj2 = new amj((double)n3 * -0.36, -0.05, 0.4);
                amj2 = amj2.a(-(cvo2.a.bd + (cvo2.a.bb - cvo2.a.bd) * f3) * ((float)Math.PI / 180));
                amj2 = amj2.b(-(cvo2.a.bc + (cvo2.a.ba - cvo2.a.bc) * f3) * ((float)Math.PI / 180));
                amj2 = amj2.b(f12 * 0.5f);
                amj2 = amj2.a(-f12 * 0.7f);
                d8 = cvo2.a.aR + (cvo2.a.aU - cvo2.a.aR) * (double)f3 + amj2.b;
                d7 = cvo2.a.aS + (cvo2.a.aV - cvo2.a.aS) * (double)f3 + amj2.c;
                d6 = cvo2.a.aT + (cvo2.a.aW - cvo2.a.aT) * (double)f3 + amj2.d;
                d5 = cvo2.a.A();
            }
            double d13 = cvo2.aR + (cvo2.aU - cvo2.aR) * (double)f3;
            double d14 = cvo2.aS + (cvo2.aV - cvo2.aS) * (double)f3 + 0.25;
            double d15 = cvo2.aT + (cvo2.aW - cvo2.aT) * (double)f3;
            double d16 = (float)(d8 - d13);
            double d17 = (double)((float)(d7 - d14)) + d5;
            double d18 = (float)(d6 - d15);
            cja.w();
            cja.f();
            bix2.a(3, bxb.f);
            int n4 = 16;
            for (int i2 = 0; i2 <= 16; ++i2) {
                float f14 = (float)i2 / 16.0f;
                bix2.b(d2 + d16 * (double)f14, d3 + d17 * (double)(f14 * f14 + f14) * 0.5 + 0.25, d4 + d18 * (double)f14).b(0, 0, 0, 255).d();
            }
            bha2.b();
            cja.e();
            cja.v();
            super.a((cpk)cvo2, d2, d3, d4, f2, f3);
        }
    }

    protected bpx a(cvo cvo2) {
        return a;
    }
}

