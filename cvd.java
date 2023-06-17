/*
 * Decompiled with CFR 0.150.
 */
public class cvd
extends buc {
    private final float a;

    public cvd(bid bid2, float f2) {
        super(bid2);
        this.a = f2;
    }

    public void a(chw chw2, double d2, double d3, double d4, float f2, float f3) {
        cja.D();
        this.e(chw2);
        cja.c((float)d2, (float)d3, (float)d4);
        cja.A();
        cja.b(this.a, this.a, this.a);
        ars ars2 = bxy.B().ae().a().a(hp.bV);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        float f4 = ars2.e();
        float f5 = ars2.f();
        float f6 = ars2.g();
        float f7 = ars2.h();
        float f8 = 1.0f;
        float f9 = 0.5f;
        float f10 = 0.25f;
        cja.b(180.0f - this.g.e, 0.0f, 1.0f, 0.0f);
        cja.b((float)(this.g.g.as == 2 ? -1 : 1) * -this.g.f, 1.0f, 0.0f, 0.0f);
        if (this.j) {
            cja.g();
            cja.e(this.d(chw2));
        }
        bix2.a(7, bxb.j);
        bix2.b(-0.5, -0.25, 0.0).a(f4, f7).c(0.0f, 1.0f, 0.0f).d();
        bix2.b(0.5, -0.25, 0.0).a(f5, f7).c(0.0f, 1.0f, 0.0f).d();
        bix2.b(0.5, 0.75, 0.0).a(f5, f6).c(0.0f, 1.0f, 0.0f).d();
        bix2.b(-0.5, 0.75, 0.0).a(f4, f6).c(0.0f, 1.0f, 0.0f).d();
        bha2.b();
        if (this.j) {
            cja.m();
            cja.h();
        }
        cja.B();
        cja.E();
        super.a((cpk)chw2, d2, d3, d4, f2, f3);
    }

    protected bpx a(chw chw2) {
        return dam.g;
    }
}

