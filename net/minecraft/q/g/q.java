/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g;

import java.util.Random;
import net.minecraft.q.g.c;

public class q
extends c {
    private final int[] d = new int[512];
    public double a;
    public double b;
    public double c;
    private static final double[] e = new double[]{1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0};
    private static final double[] f = new double[]{1.0, 1.0, -1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0};
    private static final double[] g = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0};
    private static final double[] h = new double[]{1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0};
    private static final double[] i = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0};

    public q() {
        this(new Random());
    }

    public q(Random random) {
        this.a = random.nextDouble() * 256.0;
        this.b = random.nextDouble() * 256.0;
        this.c = random.nextDouble() * 256.0;
        int n2 = 0;
        while (n2 < 256) {
            this.d[n2] = n2++;
        }
        for (n2 = 0; n2 < 256; ++n2) {
            int n3 = random.nextInt(256 - n2) + n2;
            int n4 = this.d[n2];
            this.d[n2] = this.d[n3];
            this.d[n3] = n4;
            this.d[n2 + 256] = this.d[n2];
        }
    }

    public final double a(double d2, double d3, double d4) {
        return d3 + d2 * (d4 - d3);
    }

    public final double a(int n2, double d2, double d3) {
        int n3 = n2 & 0xF;
        return h[n3] * d2 + i[n3] * d3;
    }

    public final double a(int n2, double d2, double d3, double d4) {
        int n3 = n2 & 0xF;
        return e[n3] * d2 + f[n3] * d3 + g[n3] * d4;
    }

    public void a(double[] arrd, double d2, double d3, double d4, int n2, int n3, int n4, double d5, double d6, double d7, double d8) {
        if (n3 == 1) {
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            double d9 = 0.0;
            double d10 = 0.0;
            int n9 = 0;
            double d11 = 1.0 / d8;
            for (int i2 = 0; i2 < n2; ++i2) {
                double d12 = d2 + (double)i2 * d5 + this.a;
                int n10 = (int)d12;
                if (d12 < (double)n10) {
                    --n10;
                }
                int n11 = n10 & 0xFF;
                double d13 = (d12 -= (double)n10) * d12 * d12 * (d12 * (d12 * 6.0 - 15.0) + 10.0);
                for (int i3 = 0; i3 < n4; ++i3) {
                    int n12;
                    double d14 = d4 + (double)i3 * d7 + this.c;
                    int n13 = (int)d14;
                    if (d14 < (double)n13) {
                        --n13;
                    }
                    int n14 = n13 & 0xFF;
                    double d15 = (d14 -= (double)n13) * d14 * d14 * (d14 * (d14 * 6.0 - 15.0) + 10.0);
                    n5 = this.d[n11] + 0;
                    n6 = this.d[n5] + n14;
                    n7 = this.d[n11 + 1] + 0;
                    n8 = this.d[n7] + n14;
                    d9 = this.a(d13, this.a(this.d[n6], d12, d14), this.a(this.d[n8], d12 - 1.0, 0.0, d14));
                    d10 = this.a(d13, this.a(this.d[n6 + 1], d12, 0.0, d14 - 1.0), this.a(this.d[n8 + 1], d12 - 1.0, 0.0, d14 - 1.0));
                    double d16 = this.a(d15, d9, d10);
                    int n15 = n12 = n9++;
                    arrd[n15] = arrd[n15] + d16 * d11;
                }
            }
        } else {
            int n16 = 0;
            double d17 = 1.0 / d8;
            int n17 = -1;
            int n18 = 0;
            int n19 = 0;
            int n20 = 0;
            int n21 = 0;
            int n22 = 0;
            int n23 = 0;
            double d18 = 0.0;
            double d19 = 0.0;
            double d20 = 0.0;
            double d21 = 0.0;
            for (int i4 = 0; i4 < n2; ++i4) {
                double d22 = d2 + (double)i4 * d5 + this.a;
                int n24 = (int)d22;
                if (d22 < (double)n24) {
                    --n24;
                }
                int n25 = n24 & 0xFF;
                double d23 = (d22 -= (double)n24) * d22 * d22 * (d22 * (d22 * 6.0 - 15.0) + 10.0);
                for (int i5 = 0; i5 < n4; ++i5) {
                    double d24 = d4 + (double)i5 * d7 + this.c;
                    int n26 = (int)d24;
                    if (d24 < (double)n26) {
                        --n26;
                    }
                    int n27 = n26 & 0xFF;
                    double d25 = (d24 -= (double)n26) * d24 * d24 * (d24 * (d24 * 6.0 - 15.0) + 10.0);
                    for (int i6 = 0; i6 < n3; ++i6) {
                        int n28;
                        double d26 = d3 + (double)i6 * d6 + this.b;
                        int n29 = (int)d26;
                        if (d26 < (double)n29) {
                            --n29;
                        }
                        int n30 = n29 & 0xFF;
                        double d27 = (d26 -= (double)n29) * d26 * d26 * (d26 * (d26 * 6.0 - 15.0) + 10.0);
                        if (i6 == 0 || n30 != n17) {
                            n17 = n30;
                            n18 = this.d[n25] + n30;
                            n19 = this.d[n18] + n27;
                            n20 = this.d[n18 + 1] + n27;
                            n21 = this.d[n25 + 1] + n30;
                            n22 = this.d[n21] + n27;
                            n23 = this.d[n21 + 1] + n27;
                            d18 = this.a(d23, this.a(this.d[n19], d22, d26, d24), this.a(this.d[n22], d22 - 1.0, d26, d24));
                            d19 = this.a(d23, this.a(this.d[n20], d22, d26 - 1.0, d24), this.a(this.d[n23], d22 - 1.0, d26 - 1.0, d24));
                            d20 = this.a(d23, this.a(this.d[n19 + 1], d22, d26, d24 - 1.0), this.a(this.d[n22 + 1], d22 - 1.0, d26, d24 - 1.0));
                            d21 = this.a(d23, this.a(this.d[n20 + 1], d22, d26 - 1.0, d24 - 1.0), this.a(this.d[n23 + 1], d22 - 1.0, d26 - 1.0, d24 - 1.0));
                        }
                        double d28 = this.a(d27, d18, d19);
                        double d29 = this.a(d27, d20, d21);
                        double d30 = this.a(d25, d28, d29);
                        int n31 = n28 = n16++;
                        arrd[n31] = arrd[n31] + d30 * d17;
                    }
                }
            }
        }
    }
}

