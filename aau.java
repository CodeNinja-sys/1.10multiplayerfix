/*
 * Decompiled with CFR 0.150.
 */
public class aau
implements apx {
    private final bxy a;

    public aau(bxy bxy2) {
        this.a = bxy2;
    }

    @Override
    public void a(float f2, long l2) {
        int n2;
        ob ob2 = this.a.h;
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        double d2 = ob2.br + (ob2.aU - ob2.br) * (double)f2;
        double d3 = ob2.bs + (ob2.aV - ob2.bs) * (double)f2;
        double d4 = ob2.bt + (ob2.aW - ob2.bt) * (double)f2;
        double d5 = 0.0 - d3;
        double d6 = 256.0 - d3;
        cja.w();
        cja.k();
        double d7 = (double)(ob2.bH << 4) - d2;
        double d8 = (double)(ob2.bJ << 4) - d4;
        cja.d(1.0f);
        bix2.a(3, bxb.f);
        for (n2 = -16; n2 <= 32; n2 += 16) {
            for (int i2 = -16; i2 <= 32; i2 += 16) {
                bix2.b(d7 + (double)n2, d5, d8 + (double)i2).a(1.0f, 0.0f, 0.0f, 0.0f).d();
                bix2.b(d7 + (double)n2, d5, d8 + (double)i2).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                bix2.b(d7 + (double)n2, d6, d8 + (double)i2).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                bix2.b(d7 + (double)n2, d6, d8 + (double)i2).a(1.0f, 0.0f, 0.0f, 0.0f).d();
            }
        }
        for (n2 = 2; n2 < 16; n2 += 2) {
            bix2.b(d7 + (double)n2, d5, d8).a(1.0f, 1.0f, 0.0f, 0.0f).d();
            bix2.b(d7 + (double)n2, d5, d8).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            bix2.b(d7 + (double)n2, d6, d8).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            bix2.b(d7 + (double)n2, d6, d8).a(1.0f, 1.0f, 0.0f, 0.0f).d();
            bix2.b(d7 + (double)n2, d5, d8 + 16.0).a(1.0f, 1.0f, 0.0f, 0.0f).d();
            bix2.b(d7 + (double)n2, d5, d8 + 16.0).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            bix2.b(d7 + (double)n2, d6, d8 + 16.0).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            bix2.b(d7 + (double)n2, d6, d8 + 16.0).a(1.0f, 1.0f, 0.0f, 0.0f).d();
        }
        for (n2 = 2; n2 < 16; n2 += 2) {
            bix2.b(d7, d5, d8 + (double)n2).a(1.0f, 1.0f, 0.0f, 0.0f).d();
            bix2.b(d7, d5, d8 + (double)n2).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            bix2.b(d7, d6, d8 + (double)n2).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            bix2.b(d7, d6, d8 + (double)n2).a(1.0f, 1.0f, 0.0f, 0.0f).d();
            bix2.b(d7 + 16.0, d5, d8 + (double)n2).a(1.0f, 1.0f, 0.0f, 0.0f).d();
            bix2.b(d7 + 16.0, d5, d8 + (double)n2).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            bix2.b(d7 + 16.0, d6, d8 + (double)n2).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            bix2.b(d7 + 16.0, d6, d8 + (double)n2).a(1.0f, 1.0f, 0.0f, 0.0f).d();
        }
        for (n2 = 0; n2 <= 256; n2 += 2) {
            double d9 = (double)n2 - d3;
            bix2.b(d7, d9, d8).a(1.0f, 1.0f, 0.0f, 0.0f).d();
            bix2.b(d7, d9, d8).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            bix2.b(d7, d9, d8 + 16.0).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            bix2.b(d7 + 16.0, d9, d8 + 16.0).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            bix2.b(d7 + 16.0, d9, d8).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            bix2.b(d7, d9, d8).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            bix2.b(d7, d9, d8).a(1.0f, 1.0f, 0.0f, 0.0f).d();
        }
        bha2.b();
        cja.d(2.0f);
        bix2.a(3, bxb.f);
        for (n2 = 0; n2 <= 16; n2 += 16) {
            for (int i3 = 0; i3 <= 16; i3 += 16) {
                bix2.b(d7 + (double)n2, d5, d8 + (double)i3).a(0.25f, 0.25f, 1.0f, 0.0f).d();
                bix2.b(d7 + (double)n2, d5, d8 + (double)i3).a(0.25f, 0.25f, 1.0f, 1.0f).d();
                bix2.b(d7 + (double)n2, d6, d8 + (double)i3).a(0.25f, 0.25f, 1.0f, 1.0f).d();
                bix2.b(d7 + (double)n2, d6, d8 + (double)i3).a(0.25f, 0.25f, 1.0f, 0.0f).d();
            }
        }
        for (n2 = 0; n2 <= 256; n2 += 16) {
            double d10 = (double)n2 - d3;
            bix2.b(d7, d10, d8).a(0.25f, 0.25f, 1.0f, 0.0f).d();
            bix2.b(d7, d10, d8).a(0.25f, 0.25f, 1.0f, 1.0f).d();
            bix2.b(d7, d10, d8 + 16.0).a(0.25f, 0.25f, 1.0f, 1.0f).d();
            bix2.b(d7 + 16.0, d10, d8 + 16.0).a(0.25f, 0.25f, 1.0f, 1.0f).d();
            bix2.b(d7 + 16.0, d10, d8).a(0.25f, 0.25f, 1.0f, 1.0f).d();
            bix2.b(d7, d10, d8).a(0.25f, 0.25f, 1.0f, 1.0f).d();
            bix2.b(d7, d10, d8).a(0.25f, 0.25f, 1.0f, 0.0f).d();
        }
        bha2.b();
        cja.d(1.0f);
        cja.l();
        cja.v();
    }
}

