/*
 * Decompiled with CFR 0.150.
 */
public class ek
extends buc {
    public ek(bid bid2) {
        super(bid2);
        this.h = 0.5f;
    }

    public void a(cgg cgg2, double d2, double d3, double d4, float f2, float f3) {
        float f4;
        dfp dfp2 = bxy.B().ac();
        cja.D();
        cja.c((float)d2, (float)d3 + 0.5f, (float)d4);
        if ((float)cgg2.w() - f3 + 1.0f < 10.0f) {
            f4 = 1.0f - ((float)cgg2.w() - f3 + 1.0f) / 10.0f;
            f4 = cmk.a(f4, 0.0f, 1.0f);
            f4 *= f4;
            f4 *= f4;
            float f5 = 1.0f + f4 * 0.3f;
            cja.b(f5, f5, f5);
        }
        f4 = (1.0f - ((float)cgg2.w() - f3 + 1.0f) / 100.0f) * 0.8f;
        this.e(cgg2);
        cja.b(-90.0f, 0.0f, 1.0f, 0.0f);
        cja.c(-0.5f, -0.5f, 0.5f);
        dfp2.a(blg.W.s(), cgg2.a(f3));
        cja.c(0.0f, 0.0f, 1.0f);
        if (this.j) {
            cja.g();
            cja.e(this.d(cgg2));
            dfp2.a(blg.W.s(), 1.0f);
            cja.m();
            cja.h();
        } else if (cgg2.w() / 5 % 2 == 0) {
            cja.w();
            cja.f();
            cja.l();
            cja.a(bjt.l, afi.c);
            cja.c(1.0f, 1.0f, 1.0f, f4);
            cja.a(-3.0f, -3.0f);
            cja.r();
            dfp2.a(blg.W.s(), 1.0f);
            cja.a(0.0f, 0.0f);
            cja.s();
            cja.c(1.0f, 1.0f, 1.0f, 1.0f);
            cja.k();
            cja.e();
            cja.v();
        }
        cja.E();
        super.a((cpk)cgg2, d2, d3, d4, f2, f3);
    }

    protected bpx a(cgg cgg2) {
        return dam.g;
    }
}

