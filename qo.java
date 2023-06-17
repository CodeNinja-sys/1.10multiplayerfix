/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class qo
implements tv {
    protected static final dbk a = blg.b.s();
    private final Random i;
    private final aku j;
    private final aku k;
    private final aku l;
    private final ctl m;
    public aku b;
    public aku c;
    public aku d;
    private final iu n;
    private final boolean o;
    private final aaf p;
    private final double[] q;
    private final float[] r;
    private dw s;
    private dbk t = blg.j.s();
    private double[] u = new double[256];
    private final bci v = new bxa();
    private final bki w = new bki();
    private final fo x = new fo();
    private final cbw y = new cbw();
    private final bah z = new bah();
    private final bci A = new aik();
    private final cfy B = new cfy();
    private anr[] C;
    double[] e;
    double[] f;
    double[] g;
    double[] h;

    public qo(iu iu2, long l2, boolean bl2, String string) {
        this.n = iu2;
        this.o = bl2;
        this.p = iu2.E().s();
        this.i = new Random(l2);
        this.j = new aku(this.i, 16);
        this.k = new aku(this.i, 16);
        this.l = new aku(this.i, 8);
        this.m = new ctl(this.i, 4);
        this.b = new aku(this.i, 10);
        this.c = new aku(this.i, 16);
        this.d = new aku(this.i, 8);
        this.q = new double[825];
        this.r = new float[25];
        for (int i2 = -2; i2 <= 2; ++i2) {
            for (int i3 = -2; i3 <= 2; ++i3) {
                float f2;
                this.r[i2 + 2 + (i3 + 2) * 5] = f2 = 10.0f / cmk.c((float)(i2 * i2 + i3 * i3) + 0.2f);
            }
        }
        if (string != null) {
            this.s = bqr.a(string).b();
            this.t = this.s.E ? blg.l.s() : blg.j.s();
            iu2.b(this.s.q);
        }
    }

    public void a(int n2, int n3, cnb cnb2) {
        this.C = this.n.t_().a(this.C, n2 * 4 - 2, n3 * 4 - 2, 10, 10);
        this.a(n2 * 4, 0, n3 * 4);
        for (int i2 = 0; i2 < 4; ++i2) {
            int n4 = i2 * 5;
            int n5 = (i2 + 1) * 5;
            for (int i3 = 0; i3 < 4; ++i3) {
                int n6 = (n4 + i3) * 33;
                int n7 = (n4 + i3 + 1) * 33;
                int n8 = (n5 + i3) * 33;
                int n9 = (n5 + i3 + 1) * 33;
                for (int i4 = 0; i4 < 32; ++i4) {
                    double d2 = 0.125;
                    double d3 = this.q[n6 + i4];
                    double d4 = this.q[n7 + i4];
                    double d5 = this.q[n8 + i4];
                    double d6 = this.q[n9 + i4];
                    double d7 = (this.q[n6 + i4 + 1] - d3) * 0.125;
                    double d8 = (this.q[n7 + i4 + 1] - d4) * 0.125;
                    double d9 = (this.q[n8 + i4 + 1] - d5) * 0.125;
                    double d10 = (this.q[n9 + i4 + 1] - d6) * 0.125;
                    for (int i5 = 0; i5 < 8; ++i5) {
                        double d11 = 0.25;
                        double d12 = d3;
                        double d13 = d4;
                        double d14 = (d5 - d3) * 0.25;
                        double d15 = (d6 - d4) * 0.25;
                        for (int i6 = 0; i6 < 4; ++i6) {
                            double d16 = 0.25;
                            double d17 = d12;
                            double d18 = (d13 - d12) * 0.25;
                            d17 -= d18;
                            for (int i7 = 0; i7 < 4; ++i7) {
                                double d19;
                                d17 += d18;
                                if (d19 > 0.0) {
                                    cnb2.a(i2 * 4 + i6, i4 * 8 + i5, i3 * 4 + i7, a);
                                    continue;
                                }
                                if (i4 * 8 + i5 >= this.s.q) continue;
                                cnb2.a(i2 * 4 + i6, i4 * 8 + i5, i3 * 4 + i7, this.t);
                            }
                            d12 += d14;
                            d13 += d15;
                        }
                        d3 += d7;
                        d4 += d8;
                        d5 += d9;
                        d6 += d10;
                    }
                }
            }
        }
    }

    public void a(int n2, int n3, cnb cnb2, anr[] arranr) {
        double d2 = 0.03125;
        this.u = this.m.a(this.u, n2 * 16, n3 * 16, 16, 16, 0.0625, 0.0625, 1.0);
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                anr anr2 = arranr[i3 + i2 * 16];
                anr2.a(this.n, this.i, cnb2, n2 * 16 + i2, n3 * 16 + i3, this.u[i3 + i2 * 16]);
            }
        }
    }

    @Override
    public bhm a(int n2, int n3) {
        this.i.setSeed((long)n2 * 341873128712L + (long)n3 * 132897987541L);
        cnb cnb2 = new cnb();
        this.a(n2, n3, cnb2);
        this.C = this.n.t_().b(this.C, n2 * 16, n3 * 16, 16, 16);
        this.a(n2, n3, cnb2, this.C);
        if (this.s.r) {
            this.v.a(this.n, n2, n3, cnb2);
        }
        if (this.s.z) {
            this.A.a(this.n, n2, n3, cnb2);
        }
        if (this.o) {
            if (this.s.w) {
                this.y.a(this.n, n2, n3, cnb2);
            }
            if (this.s.v) {
                this.x.a(this.n, n2, n3, cnb2);
            }
            if (this.s.u) {
                this.w.a(this.n, n2, n3, cnb2);
            }
            if (this.s.x) {
                this.z.a(this.n, n2, n3, cnb2);
            }
            if (this.s.y) {
                this.B.a(this.n, n2, n3, cnb2);
            }
        }
        bhm bhm2 = new bhm(this.n, cnb2, n2, n3);
        byte[] arrby = bhm2.l();
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            arrby[i2] = (byte)anr.a(this.C[i2]);
        }
        bhm2.d();
        return bhm2;
    }

    private void a(int n2, int n3, int n4) {
        this.h = this.c.a(this.h, n2, n4, 5, 5, this.s.e, this.s.f, this.s.g);
        float f2 = this.s.a;
        float f3 = this.s.b;
        this.e = this.l.a(this.e, n2, n3, n4, 5, 33, 5, f2 / this.s.h, f3 / this.s.i, f2 / this.s.j);
        this.f = this.j.a(this.f, n2, n3, n4, 5, 33, 5, f2, f3, f2);
        this.g = this.k.a(this.g, n2, n3, n4, 5, 33, 5, f2, f3, f2);
        int n5 = 0;
        int n6 = 0;
        for (int i2 = 0; i2 < 5; ++i2) {
            for (int i3 = 0; i3 < 5; ++i3) {
                float f4 = 0.0f;
                float f5 = 0.0f;
                float f6 = 0.0f;
                int n7 = 2;
                anr anr2 = this.C[i2 + 2 + (i3 + 2) * 10];
                for (int i4 = -2; i4 <= 2; ++i4) {
                    for (int i5 = -2; i5 <= 2; ++i5) {
                        anr anr3 = this.C[i2 + i4 + 2 + (i3 + i5 + 2) * 10];
                        float f7 = this.s.n + anr3.j() * this.s.m;
                        float f8 = this.s.p + anr3.m() * this.s.o;
                        if (this.p == aaf.e && f7 > 0.0f) {
                            f7 = 1.0f + f7 * 2.0f;
                            f8 = 1.0f + f8 * 4.0f;
                        }
                        float f9 = this.r[i4 + 2 + (i5 + 2) * 5] / (f7 + 2.0f);
                        if (anr3.j() > anr2.j()) {
                            f9 /= 2.0f;
                        }
                        f4 += f8 * f9;
                        f5 += f7 * f9;
                        f6 += f9;
                    }
                }
                f4 /= f6;
                f5 /= f6;
                f4 = f4 * 0.9f + 0.1f;
                f5 = (f5 * 4.0f - 1.0f) / 8.0f;
                double d2 = this.h[n6] / 8000.0;
                if (d2 < 0.0) {
                    d2 = -d2 * 0.3;
                }
                if ((d2 = d2 * 3.0 - 2.0) < 0.0) {
                    if ((d2 /= 2.0) < -1.0) {
                        d2 = -1.0;
                    }
                    d2 /= 1.4;
                    d2 /= 2.0;
                } else {
                    if (d2 > 1.0) {
                        d2 = 1.0;
                    }
                    d2 /= 8.0;
                }
                ++n6;
                double d3 = f5;
                double d4 = f4;
                d3 += d2 * 0.2;
                d3 = d3 * (double)this.s.k / 8.0;
                double d5 = (double)this.s.k + d3 * 4.0;
                for (int i6 = 0; i6 < 33; ++i6) {
                    double d6 = ((double)i6 - d5) * (double)this.s.l * 128.0 / 256.0 / d4;
                    if (d6 < 0.0) {
                        d6 *= 4.0;
                    }
                    double d7 = this.f[n5] / (double)this.s.d;
                    double d8 = this.g[n5] / (double)this.s.c;
                    double d9 = (this.e[n5] / 10.0 + 1.0) / 2.0;
                    double d10 = cmk.b(d7, d8, d9) - d6;
                    if (i6 > 29) {
                        double d11 = (float)(i6 - 29) / 3.0f;
                        d10 = d10 * (1.0 - d11) + -10.0 * d11;
                    }
                    this.q[n5] = d10;
                    ++n5;
                }
            }
        }
    }

    @Override
    public void b(int n2, int n3) {
        int n4;
        int n5;
        int n6;
        cmy.f = true;
        int n7 = n2 * 16;
        int n8 = n3 * 16;
        cmz cmz2 = new cmz(n7, 0, n8);
        anr anr2 = this.n.a(cmz2.e(16, 0, 16));
        this.i.setSeed(this.n.y());
        long l2 = this.i.nextLong() / 2L * 2L + 1L;
        long l3 = this.i.nextLong() / 2L * 2L + 1L;
        this.i.setSeed((long)n2 * l2 + (long)n3 * l3 ^ this.n.y());
        boolean bl2 = false;
        zz zz2 = new zz(n2, n3);
        if (this.o) {
            if (this.s.w) {
                this.y.a(this.n, this.i, zz2);
            }
            if (this.s.v) {
                bl2 = this.x.a(this.n, this.i, zz2);
            }
            if (this.s.u) {
                this.w.a(this.n, this.i, zz2);
            }
            if (this.s.x) {
                this.z.a(this.n, this.i, zz2);
            }
            if (this.s.y) {
                this.B.a(this.n, this.i, zz2);
            }
        }
        if (anr2 != cff.d && anr2 != cff.s && this.s.A && !bl2 && this.i.nextInt(this.s.B) == 0) {
            n6 = this.i.nextInt(16) + 8;
            n5 = this.i.nextInt(256);
            n4 = this.i.nextInt(16) + 8;
            new qw(blg.j).a(this.n, this.i, cmz2.e(n6, n5, n4));
        }
        if (!bl2 && this.i.nextInt(this.s.D / 10) == 0 && this.s.C) {
            n6 = this.i.nextInt(16) + 8;
            n5 = this.i.nextInt(this.i.nextInt(248) + 8);
            n4 = this.i.nextInt(16) + 8;
            if (n5 < this.n.u() || this.i.nextInt(this.s.D / 8) == 0) {
                new qw(blg.l).a(this.n, this.i, cmz2.e(n6, n5, n4));
            }
        }
        if (this.s.s) {
            for (n6 = 0; n6 < this.s.t; ++n6) {
                n5 = this.i.nextInt(16) + 8;
                n4 = this.i.nextInt(256);
                int n9 = this.i.nextInt(16) + 8;
                new ll().a(this.n, this.i, cmz2.e(n5, n4, n9));
            }
        }
        anr2.a(this.n, this.i, new cmz(n7, 0, n8));
        cnv.a(this.n, anr2, n7 + 8, n8 + 8, 16, 16, this.i);
        cmz2 = cmz2.e(8, 0, 8);
        for (n6 = 0; n6 < 16; ++n6) {
            for (n5 = 0; n5 < 16; ++n5) {
                cmz cmz3 = this.n.o(cmz2.e(n6, 0, n5));
                cmz cmz4 = cmz3.h();
                if (this.n.t(cmz4)) {
                    this.n.a(cmz4, blg.aI.s(), 2);
                }
                if (!this.n.f(cmz3, true)) continue;
                this.n.a(cmz3, blg.aH.s(), 2);
            }
        }
        cmy.f = false;
    }

    @Override
    public boolean a(bhm bhm2, int n2, int n3) {
        boolean bl2 = false;
        if (this.s.y && this.o && bhm2.x() < 3600L) {
            bl2 |= this.B.a(this.n, this.i, new zz(n2, n3));
        }
        return bl2;
    }

    @Override
    public List a(nx nx2, cmz cmz2) {
        anr anr2 = this.n.a(cmz2);
        if (this.o) {
            if (nx2 == nx.a && this.z.c(cmz2)) {
                return this.z.c();
            }
            if (nx2 == nx.a && this.s.y && this.B.a(this.n, cmz2)) {
                return this.B.c();
            }
        }
        return anr2.a(nx2);
    }

    @Override
    public cmz a(iu iu2, String string, cmz cmz2) {
        if ("Stronghold".equals(string) && this.w != null) {
            return this.w.b(iu2, cmz2);
        }
        return null;
    }

    @Override
    public void b(bhm bhm2, int n2, int n3) {
        if (this.o) {
            if (this.s.w) {
                this.y.a(this.n, n2, n3, null);
            }
            if (this.s.v) {
                this.x.a(this.n, n2, n3, null);
            }
            if (this.s.u) {
                this.w.a(this.n, n2, n3, null);
            }
            if (this.s.x) {
                this.z.a(this.n, n2, n3, null);
            }
            if (this.s.y) {
                this.B.a(this.n, n2, n3, null);
            }
        }
    }
}

