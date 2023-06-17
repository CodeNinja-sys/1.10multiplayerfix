/*
 * Decompiled with CFR 0.150.
 */
public class bff
extends kh {
    public void a(ze ze2, double d2, double d3, double d4, float f2, int n2) {
        cja.D();
        cja.c((float)d2 + 0.5f, (float)d3, (float)d4 + 0.5f);
        bff.a(ze2.d(), d2, d3, d4, f2);
        cja.E();
    }

    public static void a(cft cft2, double d2, double d3, double d4, float f2) {
        cpk cpk2 = cft2.d();
        if (cpk2 != null) {
            float f3 = 0.53125f;
            float f4 = Math.max(cpk2.bl, cpk2.bm);
            if ((double)f4 > 1.0) {
                f3 /= f4;
            }
            cja.c(0.0f, 0.4f, 0.0f);
            cja.b((float)(cft2.f() + (cft2.e() - cft2.f()) * (double)f2) * 10.0f, 0.0f, 1.0f, 0.0f);
            cja.c(0.0f, -0.2f, 0.0f);
            cja.b(-30.0f, 1.0f, 0.0f, 0.0f);
            cja.b(f3, f3, f3);
            cpk2.a_(d2, d3, d4, 0.0f, 0.0f);
            bxy.B().ad().a(cpk2, 0.0, 0.0, 0.0, 0.0f, f2, false);
        }
    }
}

