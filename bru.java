/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bru {
    private static final int[][] e = new int[][]{{1, 1, 0}, {-1, 1, 0}, {1, -1, 0}, {-1, -1, 0}, {1, 0, 1}, {-1, 0, 1}, {1, 0, -1}, {-1, 0, -1}, {0, 1, 1}, {0, -1, 1}, {0, 1, -1}, {0, -1, -1}};
    public static final double a = Math.sqrt(3.0);
    private final int[] f = new int[512];
    public double b;
    public double c;
    public double d;
    private static final double g = 0.5 * (a - 1.0);
    private static final double h = (3.0 - a) / 6.0;

    public bru() {
        this(new Random());
    }

    public bru(Random random) {
        int n2;
        this.b = random.nextDouble() * 256.0;
        this.c = random.nextDouble() * 256.0;
        this.d = random.nextDouble() * 256.0;
        for (n2 = 0; n2 < 256; ++n2) {
            this.f[n2] = n2;
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
        int n5 = bru.a(d2 + d12);
        double d13 = (double)n5 - (d10 = (double)(n5 + (n4 = bru.a(d3 + d12))) * (d9 = (3.0 - a) / 6.0));
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
            d6 = d19 * d19 * bru.a(e[n8], d14, d8);
        }
        double d20 = 0.5 - d15 * d15 - d16 * d16;
        if (d20 < 0.0) {
            d5 = 0.0;
        } else {
            d20 *= d20;
            d5 = d20 * d20 * bru.a(e[n9], d15, d16);
        }
        double d21 = 0.5 - d17 * d17 - d18 * d18;
        if (d21 < 0.0) {
            d4 = 0.0;
        } else {
            d21 *= d21;
            d4 = d21 * d21 * bru.a(e[n10], d17, d18);
        }
        return 70.0 * (d6 + d5 + d4);
    }

    public void a(double[] arrd, double d2, double d3, int n2, int n3, double d4, double d5, double d6) {
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            double d7 = (d3 + (double)i2) * d5 + this.c;
            for (int i3 = 0; i3 < n2; ++i3) {
                double d8;
                double d9;
                double d10;
                int n5;
                int n6;
                double d11;
                double d12;
                int n7;
                double d13;
                double d14 = (d2 + (double)i3) * d4 + this.b;
                double d15 = (d14 + d7) * g;
                int n8 = bru.a(d14 + d15);
                double d16 = (double)n8 - (d13 = (double)(n8 + (n7 = bru.a(d7 + d15))) * h);
                double d17 = d14 - d16;
                if (d17 > (d12 = d7 - (d11 = (double)n7 - d13))) {
                    n6 = 1;
                    n5 = 0;
                } else {
                    n6 = 0;
                    n5 = 1;
                }
                double d18 = d17 - (double)n6 + h;
                double d19 = d12 - (double)n5 + h;
                double d20 = d17 - 1.0 + 2.0 * h;
                double d21 = d12 - 1.0 + 2.0 * h;
                int n9 = n8 & 0xFF;
                int n10 = n7 & 0xFF;
                int n11 = this.f[n9 + this.f[n10]] % 12;
                int n12 = this.f[n9 + n6 + this.f[n10 + n5]] % 12;
                int n13 = this.f[n9 + 1 + this.f[n10 + 1]] % 12;
                double d22 = 0.5 - d17 * d17 - d12 * d12;
                if (d22 < 0.0) {
                    d10 = 0.0;
                } else {
                    d22 *= d22;
                    d10 = d22 * d22 * bru.a(e[n11], d17, d12);
                }
                double d23 = 0.5 - d18 * d18 - d19 * d19;
                if (d23 < 0.0) {
                    d9 = 0.0;
                } else {
                    d23 *= d23;
                    d9 = d23 * d23 * bru.a(e[n12], d18, d19);
                }
                double d24 = 0.5 - d20 * d20 - d21 * d21;
                if (d24 < 0.0) {
                    d8 = 0.0;
                } else {
                    d24 *= d24;
                    d8 = d24 * d24 * bru.a(e[n13], d20, d21);
                }
                int n14 = n4++;
                arrd[n14] = arrd[n14] + 70.0 * (d10 + d9 + d8) * d6;
            }
        }
    }
}

