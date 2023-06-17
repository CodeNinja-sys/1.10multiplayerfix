/*
 * Decompiled with CFR 0.150.
 */
public abstract class cpy
extends buc {
    public cpy(bid bid2) {
        super(bid2);
    }

    public void a(cwt cwt2, double d2, double d3, double d4, float f2, float f3) {
        this.e(cwt2);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.D();
        cja.f();
        cja.c((float)d2, (float)d3, (float)d4);
        cja.b(cwt2.bc + (cwt2.ba - cwt2.bc) * f3 - 90.0f, 0.0f, 1.0f, 0.0f);
        cja.b(cwt2.bd + (cwt2.bb - cwt2.bd) * f3, 0.0f, 0.0f, 1.0f);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        boolean bl2 = false;
        float f4 = 0.0f;
        float f5 = 0.5f;
        float f6 = 0.0f;
        float f7 = 0.15625f;
        float f8 = 0.0f;
        float f9 = 0.15625f;
        float f10 = 0.15625f;
        float f11 = 0.3125f;
        float f12 = 0.05625f;
        cja.A();
        float f13 = (float)cwt2.d - f3;
        if (f13 > 0.0f) {
            float f14 = -cmk.a(f13 * 3.0f) * f13;
            cja.b(f14, 0.0f, 0.0f, 1.0f);
        }
        cja.b(45.0f, 1.0f, 0.0f, 0.0f);
        cja.b(0.05625f, 0.05625f, 0.05625f);
        cja.c(-4.0f, 0.0f, 0.0f);
        if (this.j) {
            cja.g();
            cja.e(this.d(cwt2));
        }
        cja.a(0.05625f, 0.0f, 0.0f);
        bix2.a(7, bxb.g);
        bix2.b(-7.0, -2.0, -2.0).a(0.0, 0.15625).d();
        bix2.b(-7.0, -2.0, 2.0).a(0.15625, 0.15625).d();
        bix2.b(-7.0, 2.0, 2.0).a(0.15625, 0.3125).d();
        bix2.b(-7.0, 2.0, -2.0).a(0.0, 0.3125).d();
        bha2.b();
        cja.a(-0.05625f, 0.0f, 0.0f);
        bix2.a(7, bxb.g);
        bix2.b(-7.0, 2.0, -2.0).a(0.0, 0.15625).d();
        bix2.b(-7.0, 2.0, 2.0).a(0.15625, 0.15625).d();
        bix2.b(-7.0, -2.0, 2.0).a(0.15625, 0.3125).d();
        bix2.b(-7.0, -2.0, -2.0).a(0.0, 0.3125).d();
        bha2.b();
        for (int i2 = 0; i2 < 4; ++i2) {
            cja.b(90.0f, 1.0f, 0.0f, 0.0f);
            cja.a(0.0f, 0.0f, 0.05625f);
            bix2.a(7, bxb.g);
            bix2.b(-8.0, -2.0, 0.0).a(0.0, 0.0).d();
            bix2.b(8.0, -2.0, 0.0).a(0.5, 0.0).d();
            bix2.b(8.0, 2.0, 0.0).a(0.5, 0.15625).d();
            bix2.b(-8.0, 2.0, 0.0).a(0.0, 0.15625).d();
            bha2.b();
        }
        if (this.j) {
            cja.m();
            cja.h();
        }
        cja.B();
        cja.e();
        cja.E();
        super.a((cpk)cwt2, d2, d3, d4, f2, f3);
    }
}

