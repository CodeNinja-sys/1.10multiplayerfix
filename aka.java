/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class aka
extends buc {
    public aka(bid bid2) {
        super(bid2);
    }

    public void a(tz tz2, double d2, double d3, double d4, float f2, float f3) {
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        cja.w();
        cja.f();
        cja.l();
        cja.a(bjt.l, afi.e);
        double[] arrd = new double[8];
        double[] arrd2 = new double[8];
        double d5 = 0.0;
        double d6 = 0.0;
        Random random = new Random(tz2.a);
        for (int i2 = 7; i2 >= 0; --i2) {
            arrd[i2] = d5;
            arrd2[i2] = d6;
            d5 += (double)(random.nextInt(11) - 5);
            d6 += (double)(random.nextInt(11) - 5);
        }
        for (int i3 = 0; i3 < 4; ++i3) {
            Random random2 = new Random(tz2.a);
            for (int i4 = 0; i4 < 3; ++i4) {
                int n2 = 7;
                int n3 = 0;
                if (i4 > 0) {
                    n2 = 7 - i4;
                }
                if (i4 > 0) {
                    n3 = n2 - 2;
                }
                double d7 = arrd[n2] - d5;
                double d8 = arrd2[n2] - d6;
                for (int i5 = n2; i5 >= n3; --i5) {
                    double d9 = d7;
                    double d10 = d8;
                    if (i4 == 0) {
                        d7 += (double)(random2.nextInt(11) - 5);
                        d8 += (double)(random2.nextInt(11) - 5);
                    } else {
                        d7 += (double)(random2.nextInt(31) - 15);
                        d8 += (double)(random2.nextInt(31) - 15);
                    }
                    bix2.a(5, bxb.f);
                    float f4 = 0.5f;
                    float f5 = 0.45f;
                    float f6 = 0.45f;
                    float f7 = 0.5f;
                    double d11 = 0.1 + (double)i3 * 0.2;
                    if (i4 == 0) {
                        d11 *= (double)i5 * 0.1 + 1.0;
                    }
                    double d12 = 0.1 + (double)i3 * 0.2;
                    if (i4 == 0) {
                        d12 *= (double)(i5 - 1) * 0.1 + 1.0;
                    }
                    for (int i6 = 0; i6 < 5; ++i6) {
                        double d13 = d2 + 0.5 - d11;
                        double d14 = d4 + 0.5 - d11;
                        if (i6 == 1 || i6 == 2) {
                            d13 += d11 * 2.0;
                        }
                        if (i6 == 2 || i6 == 3) {
                            d14 += d11 * 2.0;
                        }
                        double d15 = d2 + 0.5 - d12;
                        double d16 = d4 + 0.5 - d12;
                        if (i6 == 1 || i6 == 2) {
                            d15 += d12 * 2.0;
                        }
                        if (i6 == 2 || i6 == 3) {
                            d16 += d12 * 2.0;
                        }
                        bix2.b(d15 + d7, d3 + (double)(i5 * 16), d16 + d8).a(0.45f, 0.45f, 0.5f, 0.3f).d();
                        bix2.b(d13 + d9, d3 + (double)((i5 + 1) * 16), d14 + d10).a(0.45f, 0.45f, 0.5f, 0.3f).d();
                    }
                    bha2.b();
                }
            }
        }
        cja.k();
        cja.e();
        cja.v();
    }

    protected bpx a(tz tz2) {
        return null;
    }
}

