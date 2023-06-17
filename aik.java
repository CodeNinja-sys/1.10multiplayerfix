/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class aik
extends bci {
    protected static final dbk a = blg.k.s();
    protected static final dbk b = blg.a.s();
    private final float[] f = new float[1024];

    protected void a(long l2, int n2, int n3, cnb cnb2, double d2, double d3, double d4, float f2, float f3, float f4, int n4, int n5, double d5) {
        int n6;
        Random random = new Random(l2);
        double d6 = n2 * 16 + 8;
        double d7 = n3 * 16 + 8;
        float f5 = 0.0f;
        float f6 = 0.0f;
        if (n5 <= 0) {
            n6 = this.c * 16 - 16;
            n5 = n6 - random.nextInt(n6 / 4);
        }
        n6 = 0;
        if (n4 == -1) {
            n4 = n5 / 2;
            n6 = 1;
        }
        float f7 = 1.0f;
        for (int i2 = 0; i2 < 256; ++i2) {
            if (i2 == 0 || random.nextInt(3) == 0) {
                f7 = 1.0f + random.nextFloat() * random.nextFloat();
            }
            this.f[i2] = f7 * f7;
        }
        while (n4 < n5) {
            double d8 = 1.5 + (double)(cmk.a((float)n4 * (float)Math.PI / (float)n5) * f2);
            double d9 = d8 * d5;
            d8 *= (double)random.nextFloat() * 0.25 + 0.75;
            d9 *= (double)random.nextFloat() * 0.25 + 0.75;
            float f8 = cmk.b(f4);
            float f9 = cmk.a(f4);
            d2 += (double)(cmk.b(f3) * f8);
            d3 += (double)f9;
            d4 += (double)(cmk.a(f3) * f8);
            f4 *= 0.7f;
            f4 += f6 * 0.05f;
            f3 += f5 * 0.05f;
            f6 *= 0.8f;
            f5 *= 0.5f;
            f6 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0f;
            f5 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0f;
            if (n6 != 0 || random.nextInt(4) != 0) {
                double d10 = d2 - d6;
                double d11 = d4 - d7;
                double d12 = n5 - n4;
                double d13 = f2 + 2.0f + 16.0f;
                if (d10 * d10 + d11 * d11 - d12 * d12 > d13 * d13) {
                    return;
                }
                if (!(d2 < d6 - 16.0 - d8 * 2.0 || d4 < d7 - 16.0 - d8 * 2.0 || d2 > d6 + 16.0 + d8 * 2.0 || d4 > d7 + 16.0 + d8 * 2.0)) {
                    int n7;
                    int n8 = cmk.c(d2 - d8) - n2 * 16 - 1;
                    int n9 = cmk.c(d2 + d8) - n2 * 16 + 1;
                    int n10 = cmk.c(d3 - d9) - 1;
                    int n11 = cmk.c(d3 + d9) + 1;
                    int n12 = cmk.c(d4 - d8) - n3 * 16 - 1;
                    int n13 = cmk.c(d4 + d8) - n3 * 16 + 1;
                    if (n8 < 0) {
                        n8 = 0;
                    }
                    if (n9 > 16) {
                        n9 = 16;
                    }
                    if (n10 < 1) {
                        n10 = 1;
                    }
                    if (n11 > 248) {
                        n11 = 248;
                    }
                    if (n12 < 0) {
                        n12 = 0;
                    }
                    if (n13 > 16) {
                        n13 = 16;
                    }
                    boolean bl2 = false;
                    for (int i3 = n8; !bl2 && i3 < n9; ++i3) {
                        for (n7 = n12; !bl2 && n7 < n13; ++n7) {
                            for (int i4 = n11 + 1; !bl2 && i4 >= n10 - 1; --i4) {
                                if (i4 < 0 || i4 >= 256) continue;
                                dbk dbk2 = cnb2.a(i3, i4, n7);
                                if (dbk2.t() == blg.i || dbk2.t() == blg.j) {
                                    bl2 = true;
                                }
                                if (i4 == n10 - 1 || i3 == n8 || i3 == n9 - 1 || n7 == n12 || n7 == n13 - 1) continue;
                                i4 = n10;
                            }
                        }
                    }
                    if (!bl2) {
                        pj pj2 = new pj();
                        for (n7 = n8; n7 < n9; ++n7) {
                            double d14 = ((double)(n7 + n2 * 16) + 0.5 - d2) / d8;
                            for (int i5 = n12; i5 < n13; ++i5) {
                                double d15 = ((double)(i5 + n3 * 16) + 0.5 - d4) / d8;
                                boolean bl3 = false;
                                if (!(d14 * d14 + d15 * d15 < 1.0)) continue;
                                for (int i6 = n11; i6 > n10; --i6) {
                                    double d16 = ((double)(i6 - 1) + 0.5 - d3) / d9;
                                    if (!((d14 * d14 + d15 * d15) * (double)this.f[i6 - 1] + d16 * d16 / 6.0 < 1.0)) continue;
                                    dbk dbk3 = cnb2.a(n7, i6, i5);
                                    if (dbk3.t() == blg.c) {
                                        bl3 = true;
                                    }
                                    if (dbk3.t() != blg.b && dbk3.t() != blg.d && dbk3.t() != blg.c) continue;
                                    if (i6 - 1 < 10) {
                                        cnb2.a(n7, i6, i5, a);
                                        continue;
                                    }
                                    cnb2.a(n7, i6, i5, b);
                                    if (!bl3 || cnb2.a(n7, i6 - 1, i5).t() != blg.d) continue;
                                    pj2.a(n7 + n2 * 16, 0, i5 + n3 * 16);
                                    cnb2.a(n7, i6 - 1, i5, this.e.a((cmz)pj2).x);
                                }
                            }
                        }
                        if (n6 != 0) break;
                    }
                }
            }
            ++n4;
        }
    }

    @Override
    protected void a(iu iu2, int n2, int n3, int n4, int n5, cnb cnb2) {
        if (this.d.nextInt(50) != 0) {
            return;
        }
        double d2 = n2 * 16 + this.d.nextInt(16);
        double d3 = this.d.nextInt(this.d.nextInt(40) + 8) + 20;
        double d4 = n3 * 16 + this.d.nextInt(16);
        boolean bl2 = true;
        for (int i2 = 0; i2 < 1; ++i2) {
            float f2 = this.d.nextFloat() * ((float)Math.PI * 2);
            float f3 = (this.d.nextFloat() - 0.5f) * 2.0f / 8.0f;
            float f4 = (this.d.nextFloat() * 2.0f + this.d.nextFloat()) * 2.0f;
            this.a(this.d.nextLong(), n4, n5, cnb2, d2, d3, d4, f4, f2, f3, 0, 0, 3.0);
        }
    }
}

