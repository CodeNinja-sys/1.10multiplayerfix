/*
 * Decompiled with CFR 0.150.
 */
public class fx
extends dfo {
    public fx(bid bid2) {
        super(bid2);
    }

    protected void a(ji ji2, float f2, dbk dbk2) {
        int n2 = ji2.k();
        if (n2 > -1 && (float)n2 - f2 + 1.0f < 10.0f) {
            float f3 = 1.0f - ((float)n2 - f2 + 1.0f) / 10.0f;
            f3 = cmk.a(f3, 0.0f, 1.0f);
            f3 *= f3;
            f3 *= f3;
            float f4 = 1.0f + f3 * 0.3f;
            cja.b(f4, f4, f4);
        }
        super.a(ji2, f2, dbk2);
        if (n2 > -1 && n2 / 5 % 2 == 0) {
            dfp dfp2 = bxy.B().ac();
            cja.w();
            cja.f();
            cja.l();
            cja.a(bjt.l, afi.c);
            cja.c(1.0f, 1.0f, 1.0f, (1.0f - ((float)n2 - f2 + 1.0f) / 100.0f) * 0.8f);
            cja.D();
            dfp2.a(blg.W.s(), 1.0f);
            cja.E();
            cja.c(1.0f, 1.0f, 1.0f, 1.0f);
            cja.k();
            cja.e();
            cja.v();
        }
    }
}

