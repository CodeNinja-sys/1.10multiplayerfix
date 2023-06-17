/*
 * Decompiled with CFR 0.150.
 */
public class buf
extends qa {
    private int K;
    private final atx L;
    private bmh M;
    boolean a;

    public buf(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7, atx atx2, bvp bvp2) {
        super(iu2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.i = d5;
        this.j = d6;
        this.k = d7;
        this.L = atx2;
        this.w = 8;
        if (bvp2 != null) {
            this.M = bvp2.c("Explosions", 10);
            if (this.M.j()) {
                this.M = null;
            } else {
                this.w = this.M.b() * 2 - 1;
                for (int i2 = 0; i2 < this.M.b(); ++i2) {
                    bvp bvp3 = this.M.b(i2);
                    if (!bvp3.p("Flicker")) continue;
                    this.a = true;
                    this.w += 15;
                    break;
                }
            }
        }
    }

    @Override
    public void a(bix bix2, cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    @Override
    public void b() {
        int n2;
        if (this.K == 0 && this.M != null) {
            n2 = this.l();
            boolean bl2 = false;
            if (this.M.b() >= 3) {
                bl2 = true;
            } else {
                for (int i2 = 0; i2 < this.M.b(); ++i2) {
                    bvp bvp2 = this.M.b(i2);
                    if (bvp2.f("Type") != 1) continue;
                    bl2 = true;
                    break;
                }
            }
            bi bi2 = bl2 ? (n2 != 0 ? dah.br : dah.bq) : (n2 != 0 ? dah.bp : dah.bo);
            this.b.a(this.f, this.g, this.h, bi2, csg.i, 20.0f, 0.95f + this.q.nextFloat() * 0.1f, true);
        }
        if (this.K % 2 == 0 && this.M != null && this.K / 2 < this.M.b()) {
            n2 = this.K / 2;
            bvp bvp3 = this.M.b(n2);
            byte by2 = bvp3.f("Type");
            boolean bl3 = bvp3.p("Trail");
            boolean bl4 = bvp3.p("Flicker");
            int[] arrn = bvp3.n("Colors");
            int[] arrn2 = bvp3.n("FadeColors");
            if (arrn.length == 0) {
                arrn = new int[]{hr.a[0]};
            }
            if (by2 == 1) {
                this.a(0.5, 4, arrn, arrn2, bl3, bl4);
            } else if (by2 == 2) {
                this.a(0.5, new double[][]{{0.0, 1.0}, {0.3455, 0.309}, {0.9511, 0.309}, {0.3795918367346939, -0.12653061224489795}, {0.6122448979591837, -0.8040816326530612}, {0.0, -0.35918367346938773}}, arrn, arrn2, bl3, bl4, false);
            } else if (by2 == 3) {
                this.a(0.5, new double[][]{{0.0, 0.2}, {0.2, 0.2}, {0.2, 0.6}, {0.6, 0.6}, {0.6, 0.2}, {0.2, 0.2}, {0.2, 0.0}, {0.4, 0.0}, {0.4, -0.6}, {0.2, -0.6}, {0.2, -0.4}, {0.0, -0.4}}, arrn, arrn2, bl3, bl4, true);
            } else if (by2 == 4) {
                this.a(arrn, arrn2, bl3, bl4);
            } else {
                this.a(0.25, 2, arrn, arrn2, bl3, bl4);
            }
            int n3 = arrn[0];
            float f2 = (float)((n3 & 0xFF0000) >> 16) / 255.0f;
            float f3 = (float)((n3 & 0xFF00) >> 8) / 255.0f;
            float f4 = (float)((n3 & 0xFF) >> 0) / 255.0f;
            cum cum2 = new cum(this.b, this.f, this.g, this.h);
            cum2.a(f2, f3, f4);
            this.L.a(cum2);
        }
        ++this.K;
        if (this.K > this.w) {
            if (this.a) {
                n2 = this.l() ? 1 : 0;
                bi bi3 = n2 != 0 ? dah.bv : dah.bu;
                this.b.a(this.f, this.g, this.h, bi3, csg.i, 20.0f, 0.9f + this.q.nextFloat() * 0.15f, true);
            }
            this.h();
        }
    }

    private boolean l() {
        bxy bxy2 = bxy.B();
        return bxy2 == null || bxy2.ab() == null || !(bxy2.ab().i(this.f, this.g, this.h) < 256.0);
    }

    private void a(double d2, double d3, double d4, double d5, double d6, double d7, int[] arrn, int[] arrn2, boolean bl2, boolean bl3) {
        aqd aqd2 = new aqd(this.b, d2, d3, d4, d5, d6, d7, this.L);
        aqd2.d(0.99f);
        aqd2.a(bl2);
        aqd2.b(bl3);
        int n2 = this.q.nextInt(arrn.length);
        aqd2.a(arrn[n2]);
        if (arrn2 != null && arrn2.length > 0) {
            aqd2.b(arrn2[this.q.nextInt(arrn2.length)]);
        }
        this.L.a(aqd2);
    }

    private void a(double d2, int n2, int[] arrn, int[] arrn2, boolean bl2, boolean bl3) {
        double d3 = this.f;
        double d4 = this.g;
        double d5 = this.h;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                for (int i4 = -n2; i4 <= n2; ++i4) {
                    double d6 = (double)i3 + (this.q.nextDouble() - this.q.nextDouble()) * 0.5;
                    double d7 = (double)i2 + (this.q.nextDouble() - this.q.nextDouble()) * 0.5;
                    double d8 = (double)i4 + (this.q.nextDouble() - this.q.nextDouble()) * 0.5;
                    double d9 = (double)cmk.a(d6 * d6 + d7 * d7 + d8 * d8) / d2 + this.q.nextGaussian() * 0.05;
                    this.a(d3, d4, d5, d6 / d9, d7 / d9, d8 / d9, arrn, arrn2, bl2, bl3);
                    if (i2 == -n2 || i2 == n2 || i3 == -n2 || i3 == n2) continue;
                    i4 += n2 * 2 - 1;
                }
            }
        }
    }

    private void a(double d2, double[][] arrd, int[] arrn, int[] arrn2, boolean bl2, boolean bl3, boolean bl4) {
        double d3 = arrd[0][0];
        double d4 = arrd[0][1];
        this.a(this.f, this.g, this.h, d3 * d2, d4 * d2, 0.0, arrn, arrn2, bl2, bl3);
        float f2 = this.q.nextFloat() * (float)Math.PI;
        double d5 = bl4 ? 0.034 : 0.34;
        for (int i2 = 0; i2 < 3; ++i2) {
            double d6 = (double)f2 + (double)((float)i2 * (float)Math.PI) * d5;
            double d7 = d3;
            double d8 = d4;
            for (int i3 = 1; i3 < arrd.length; ++i3) {
                double d9 = arrd[i3][0];
                double d10 = arrd[i3][1];
                for (double d11 = 0.25; d11 <= 1.0; d11 += 0.25) {
                    double d12 = (d7 + (d9 - d7) * d11) * d2;
                    double d13 = (d8 + (d10 - d8) * d11) * d2;
                    double d14 = d12 * Math.sin(d6);
                    d12 *= Math.cos(d6);
                    for (double d15 = -1.0; d15 <= 1.0; d15 += 2.0) {
                        this.a(this.f, this.g, this.h, d12 * d15, d13, d14 * d15, arrn, arrn2, bl2, bl3);
                    }
                }
                d7 = d9;
                d8 = d10;
            }
        }
    }

    private void a(int[] arrn, int[] arrn2, boolean bl2, boolean bl3) {
        double d2 = this.q.nextGaussian() * 0.05;
        double d3 = this.q.nextGaussian() * 0.05;
        for (int i2 = 0; i2 < 70; ++i2) {
            double d4 = this.i * 0.5 + this.q.nextGaussian() * 0.15 + d2;
            double d5 = this.k * 0.5 + this.q.nextGaussian() * 0.15 + d3;
            double d6 = this.j * 0.5 + this.q.nextDouble() * 0.5;
            this.a(this.f, this.g, this.h, d4, d6, d5, arrn, arrn2, bl2, bl3);
        }
    }

    @Override
    public int f() {
        return 0;
    }
}

