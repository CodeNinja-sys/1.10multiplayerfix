/*
 * Decompiled with CFR 0.150.
 */
public class aiy
extends buc {
    private static final bpx a = new bpx("textures/entity/enderdragon/dragon_fireball.png");

    public aiy(bid bid2) {
        super(bid2);
    }

    public void a(ckd ckd2, double d2, double d3, double d4, float f2, float f3) {
        cja.D();
        this.e(ckd2);
        cja.c((float)d2, (float)d3, (float)d4);
        cja.A();
        cja.b(2.0f, 2.0f, 2.0f);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        float f4 = 1.0f;
        float f5 = 0.5f;
        float f6 = 0.25f;
        cja.b(180.0f - this.g.e, 0.0f, 1.0f, 0.0f);
        cja.b((float)(this.g.g.as == 2 ? -1 : 1) * -this.g.f, 1.0f, 0.0f, 0.0f);
        if (this.j) {
            cja.g();
            cja.e(this.d(ckd2));
        }
        bix2.a(7, bxb.j);
        bix2.b(-0.5, -0.25, 0.0).a(0.0, 1.0).c(0.0f, 1.0f, 0.0f).d();
        bix2.b(0.5, -0.25, 0.0).a(1.0, 1.0).c(0.0f, 1.0f, 0.0f).d();
        bix2.b(0.5, 0.75, 0.0).a(1.0, 0.0).c(0.0f, 1.0f, 0.0f).d();
        bix2.b(-0.5, 0.75, 0.0).a(0.0, 0.0).c(0.0f, 1.0f, 0.0f).d();
        bha2.b();
        if (this.j) {
            cja.m();
            cja.h();
        }
        cja.B();
        cja.E();
        super.a((cpk)ckd2, d2, d3, d4, f2, f3);
    }

    protected bpx a(ckd ckd2) {
        return a;
    }
}

