/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g;

import java.util.Random;

public class p {
    private static final int[][] e;
    public static final double a;
    private final int[] f = new int[512];
    public double b;
    public double c;
    public double d;
    private static final double g;
    private static final double h;

    static {
        int[][] arrarrn = new int[12][];
        int[] arrn = new int[3];
        arrn[0] = 1;
        arrn[1] = 1;
        arrarrn[0] = arrn;
        int[] arrn2 = new int[3];
        arrn2[0] = -1;
        arrn2[1] = 1;
        arrarrn[1] = arrn2;
        int[] arrn3 = new int[3];
        arrn3[0] = 1;
        arrn3[1] = -1;
        arrarrn[2] = arrn3;
        int[] arrn4 = new int[3];
        arrn4[0] = -1;
        arrn4[1] = -1;
        arrarrn[3] = arrn4;
        int[] arrn5 = new int[3];
        arrn5[0] = 1;
        arrn5[2] = 1;
        arrarrn[4] = arrn5;
        int[] arrn6 = new int[3];
        arrn6[0] = -1;
        arrn6[2] = 1;
        arrarrn[5] = arrn6;
        int[] arrn7 = new int[3];
        arrn7[0] = 1;
        arrn7[2] = -1;
        arrarrn[6] = arrn7;
        int[] arrn8 = new int[3];
        arrn8[0] = -1;
        arrn8[2] = -1;
        arrarrn[7] = arrn8;
        int[] arrn9 = new int[3];
        arrn9[1] = 1;
        arrn9[2] = 1;
        arrarrn[8] = arrn9;
        int[] arrn10 = new int[3];
        arrn10[1] = -1;
        arrn10[2] = 1;
        arrarrn[9] = arrn10;
        int[] arrn11 = new int[3];
        arrn11[1] = 1;
        arrn11[2] = -1;
        arrarrn[10] = arrn11;
        int[] arrn12 = new int[3];
        arrn12[1] = -1;
        arrn12[2] = -1;
        arrarrn[11] = arrn12;
        e = arrarrn;
        a = Math.sqrt(3.0);
        g = 0.5 * (a - 1.0);
        h = (3.0 - a) / 6.0;
    }

    public p() {
        this(new Random());
    }

    public p(Random random) {
        this.b = random.nextDouble() * 256.0;
        this.c = random.nextDouble() * 256.0;
        this.d = random.nextDouble() * 256.0;
        int n2 = 0;
        while (n2 < 256) {
            this.f[n2] = n2++;
        }
        for (n2 = 0; n2 < 256; ++n2) {
            int n3 = random.nextInt(256 - n2) + n2;
            int n4 = this.f[n2];
            this.f[n2] = this.f[n3];
            this.f[n3] = n4;
            this.f[n2 + 256] = this.f[n2];
        }
    }

    private static int a(double d2) {
        return d2 > 0.0 ? (int)d2 : (int)d2 - 1;
    }

    private static double a(int[] arrn, double d2, double d3) {
        return (double)arrn[0] * d2 + (double)arrn[1] * d3;
    }

    public double a(double d2, double d3) {
        double d4;
        double d5;
        double d6;
        int n2;
        int n3;
        double d7;
        double d8;
        double d9;
        int n4;
        double d10;
        double d11 = 0.5 * (a - 1.0);
        double d12 = (d2 + d3) * d11;
        int n5 = p.a(d2 + d12);
        double d13 = (double)n5 - (d10 = (double)(n5 + (n4 = p.a(d3 + d12))) * (d9 = (3.0 - a) / 6.0));
        double d14 = d2 - d13;
        if (d14 > (d8 = d3 - (d7 = (double)n4 - d10))) {
            n3 = 1;
            n2 = 0;
        } else {
            n3 = 0;
            n2 = 1;
        }
        double d15 = d14 - (double)n3 + d9;
        double d16 = d8 - (double)n2 + d9;
        double d17 = d14 - 1.0 + 2.0 * d9;
        double d18 = d8 - 1.0 + 2.0 * d9;
        int n6 = n5 & 0xFF;
        int n7 = n4 & 0xFF;
        int n8 = this.f[n6 + this.f[n7]] % 12;
        int n9 = this.f[n6 + n3 + this.f[n7 + n2]] % 12;
        int n10 = this.f[n6 + 1 + this.f[n7 + 1]] % 12;
        double d19 = 0.5 - d14 * d14 - d8 * d8;
        if (d19 < 0.0) {
            d6 = 0.0;
        } else {
            d19 *= d19;
            d6 = d19 * d19 * p.a(e[n8], d14, d8);
        }
        double d20 = 0.5 - d15 * d15 - d16 * d16;
        if (d20 < 0.0) {
            d5 = 0.0;
        } else {
            d20 *= d20;
            d5 = d20 * d20 * p.a(e[n9], d15, d16);
        }
        double d21 = 0.5 - d17 * d17 - d18 * d18;
        if (d21 < 0.0) {
            d4 = 0.0;
        } else {
            d21 *= d21;
            d4 = d21 * d21 * p.a(e[n10], d17, d18);
        }
        return 70.0 * (d6 + d5 + d4);
    }

    public void a(double[] arrd, double d2, double d3, int n2, int n3, double d4, double d5, double d6) {
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            double d7 = (d3 + (double)i2) * d5 + this.c;
            for (int i3 = 0; i3 < n2; ++i3) {
                int n5;
                double d8;
                double d9;
                double d10;
                int n6;
                int n7;
                double d11;
                double d12;
                int n8;
                double d13;
                double d14 = (d2 + (double)i3) * d4 + this.b;
                double d15 = (d14 + d7) * g;
                int n9 = p.a(d14 + d15);
                double d16 = (double)n9 - (d13 = (double)(n9 + (n8 = p.a(d7 + d15))) * h);
                double d17 = d14 - d16;
                if (d17 > (d12 = d7 - (d11 = (double)n8 - d13))) {
                    n7 = 1;
                    n6 = 0;
                } else {
                    n7 = 0;
                    n6 = 1;
                }
                double d18 = d17 - (double)n7 + h;
                double d19 = d12 - (double)n6 + h;
                double d20 = d17 - 1.0 + 2.0 * h;
                double d21 = d12 - 1.0 + 2.0 * h;
                int n10 = n9 & 0xFF;
                int n11 = n8 & 0xFF;
                int n12 = this.f[n10 + this.f[n11]] % 12;
                int n13 = this.f[n10 + n7 + this.f[n11 + n6]] % 12;
                int n14 = this.f[n10 + 1 + this.f[n11 + 1]] % 12;
                double d22 = 0.5 - d17 * d17 - d12 * d12;
                if (d22 < 0.0) {
                    d10 = 0.0;
                } else {
                    d22 *= d22;
                    d10 = d22 * d22 * p.a(e[n12], d17, d12);
                }
                double d23 = 0.5 - d18 * d18 - d19 * d19;
                if (d23 < 0.0) {
                    d9 = 0.0;
                } else {
                    d23 *= d23;
                    d9 = d23 * d23 * p.a(e[n13], d18, d19);
                }
                double d24 = 0.5 - d20 * d20 - d21 * d21;
                if (d24 < 0.0) {
                    d8 = 0.0;
                } else {
                    d24 *= d24;
                    d8 = d24 * d24 * p.a(e[n14], d20, d21);
                }
                int n15 = n5 = n4++;
                arrd[n15] = arrd[n15] + 70.0 * (d10 + d9 + d8) * d6;
            }
        }
    }
}

