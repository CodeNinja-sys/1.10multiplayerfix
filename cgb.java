/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class cgb
implements tv {
    private final Random h;
    protected static final dbk a = blg.bH.s();
    protected static final dbk b = blg.a.s();
    private final aku i;
    private final aku j;
    private final aku k;
    public aku c;
    public aku d;
    private final iu l;
    private final boolean m;
    private final ana n = new ana(this);
    private final bru o;
    private double[] p;
    private anr[] q;
    double[] e;
    double[] f;
    double[] g;
    private final bpf r = new bpf();

    public cgb(iu iu2, boolean bl2, long l2) {
        this.l = iu2;
        this.m = bl2;
        this.h = new Random(l2);
        this.i = new aku(this.h, 16);
        this.j = new aku(this.h, 16);
        this.k = new aku(this.h, 8);
        this.c = new aku(this.h, 10);
        this.d = new aku(this.h, 16);
        this.o = new bru(this.h);
    }

    public void a(int n2, int n3, cnb cnb2) {
        int n4 = 2;
        int n5 = 3;
        int n6 = 33;
        int n7 = 3;
        this.p = this.a(this.p, n2 * 2, 0, n3 * 2, 3, 33, 3);
        for (int i2 = 0; i2 < 2; ++i2) {
            for (int i3 = 0; i3 < 2; ++i3) {
                for (int i4 = 0; i4 < 32; ++i4) {
                    double d2 = 0.25;
                    double d3 = this.p[((i2 + 0) * 3 + i3 + 0) * 33 + i4 + 0];
                    double d4 = this.p[((i2 + 0) * 3 + i3 + 1) * 33 + i4 + 0];
                    double d5 = this.p[((i2 + 1) * 3 + i3 + 0) * 33 + i4 + 0];
                    double d6 = this.p[((i2 + 1) * 3 + i3 + 1) * 33 + i4 + 0];
                    double d7 = (this.p[((i2 + 0) * 3 + i3 + 0) * 33 + i4 + 1] - d3) * 0.25;
                    double d8 = (this.p[((i2 + 0) * 3 + i3 + 1) * 33 + i4 + 1] - d4) * 0.25;
                    double d9 = (this.p[((i2 + 1) * 3 + i3 + 0) * 33 + i4 + 1] - d5) * 0.25;
                    double d10 = (this.p[((i2 + 1) * 3 + i3 + 1) * 33 + i4 + 1] - d6) * 0.25;
                    for (int i5 = 0; i5 < 4; ++i5) {
                        double d11 = 0.125;
                        double d12 = d3;
                        double d13 = d4;
                        double d14 = (d5 - d3) * 0.125;
                        double d15 = (d6 - d4) * 0.125;
                        for (int i6 = 0; i6 < 8; ++i6) {
                            double d16 = 0.125;
                            double d17 = d12;
                            double d18 = (d13 - d12) * 0.125;
                            for (int i7 = 0; i7 < 8; ++i7) {
                                dbk dbk2 = b;
                                if (d17 > 0.0) {
                                    dbk2 = a;
                                }
                                int n8 = i6 + i2 * 8;
                                int n9 = i5 + i4 * 4;
                                int n10 = i7 + i3 * 8;
                                cnb2.a(n8, n9, n10, dbk2);
                                d17 += d18;
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

    public void a(cnb cnb2) {
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                boolean bl2 = true;
                int n2 = -1;
                dbk dbk2 = a;
                dbk dbk3 = a;
                for (int i4 = 127; i4 >= 0; --i4) {
                    dbk dbk4 = cnb2.a(i2, i4, i3);
                    if (dbk4.a() == ahk.a) {
                        n2 = -1;
                        continue;
                    }
                    if (dbk4.t() != blg.b) continue;
                    if (n2 == -1) {
                        n2 = 1;
                        if (i4 >= 0) {
                            cnb2.a(i2, i4, i3, dbk2);
                            continue;
                        }
                        cnb2.a(i2, i4, i3, dbk3);
                        continue;
                    }
                    if (n2 <= 0) continue;
                    --n2;
                    cnb2.a(i2, i4, i3, dbk3);
                }
            }
        }
    }

    @Override
    public bhm a(int n2, int n3) {
        this.h.setSeed((long)n2 * 341873128712L + (long)n3 * 132897987541L);
        cnb cnb2 = new cnb();
        this.q = this.l.t_().b(this.q, n2 * 16, n3 * 16, 16, 16);
        this.a(n2, n3, cnb2);
        this.a(cnb2);
        if (this.m) {
            this.n.a(this.l, n2, n3, cnb2);
        }
        bhm bhm2 = new bhm(this.l, cnb2, n2, n3);
        byte[] arrby = bhm2.l();
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            arrby[i2] = (byte)anr.a(this.q[i2]);
        }
        bhm2.d();
        return bhm2;
    }

    private float a(int n2, int n3, int n4, int n5) {
        float f2 = n2 * 2 + n4;
        float f3 = n3 * 2 + n5;
        float f4 = 100.0f - cmk.c(f2 * f2 + f3 * f3) * 8.0f;
        if (f4 > 80.0f) {
            f4 = 80.0f;
        }
        if (f4 < -100.0f) {
            f4 = -100.0f;
        }
        for (int i2 = -12; i2 <= 12; ++i2) {
            for (int i3 = -12; i3 <= 12; ++i3) {
                long l2 = n2 + i2;
                long l3 = n3 + i3;
                if (l2 * l2 + l3 * l3 <= 4096L || !(this.o.a(l2, l3) < (double)-0.9f)) continue;
                float f5 = (cmk.e(l2) * 3439.0f + cmk.e(l3) * 147.0f) % 13.0f + 9.0f;
                f2 = n4 - i2 * 2;
                f3 = n5 - i3 * 2;
                float f6 = 100.0f - cmk.c(f2 * f2 + f3 * f3) * f5;
                if (f6 > 80.0f) {
                    f6 = 80.0f;
                }
                if (f6 < -100.0f) {
                    f6 = -100.0f;
                }
                if (!(f6 > f4)) continue;
                f4 = f6;
            }
        }
        return f4;
    }

    public boolean c(int n2, int n3) {
        return (long)n2 * (long)n2 + (long)n3 * (long)n3 > 4096L && this.a(n2, n3, 1, 1) >= 0.0f;
    }

    private double[] a(double[] arrd, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (arrd == null) {
            arrd = new double[n5 * n6 * n7];
        }
        double d2 = 684.412;
        double d3 = 684.412;
        this.e = this.k.a(this.e, n2, n3, n4, n5, n6, n7, (d2 *= 2.0) / 80.0, 4.277575000000001, d2 / 80.0);
        this.f = this.i.a(this.f, n2, n3, n4, n5, n6, n7, d2, 684.412, d2);
        this.g = this.j.a(this.g, n2, n3, n4, n5, n6, n7, d2, 684.412, d2);
        int n8 = n2 / 2;
        int n9 = n4 / 2;
        int n10 = 0;
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n7; ++i3) {
                float f2 = this.a(n8, n9, i2, i3);
                for (int i4 = 0; i4 < n6; ++i4) {
                    double d4;
                    double d5 = this.f[n10] / 512.0;
                    double d6 = this.g[n10] / 512.0;
                    double d7 = (this.e[n10] / 10.0 + 1.0) / 2.0;
                    double d8 = d7 < 0.0 ? d5 : (d7 > 1.0 ? d6 : d5 + (d6 - d5) * d7);
                    d8 -= 8.0;
                    d8 += (double)f2;
                    int n11 = 2;
                    if (i4 > n6 / 2 - n11) {
                        d4 = (float)(i4 - (n6 / 2 - n11)) / 64.0f;
                        d4 = cmk.a(d4, 0.0, 1.0);
                        d8 = d8 * (1.0 - d4) + -3000.0 * d4;
                    }
                    if (i4 < (n11 = 8)) {
                        d4 = (float)(n11 - i4) / ((float)n11 - 1.0f);
                        d8 = d8 * (1.0 - d4) + -30.0 * d4;
                    }
                    arrd[n10] = d8;
                    ++n10;
                }
            }
        }
        return arrd;
    }

    @Override
    public void b(int n2, int n3) {
        cmy.f = true;
        cmz cmz2 = new cmz(n2 * 16, 0, n3 * 16);
        if (this.m) {
            this.n.a(this.l, this.h, new zz(n2, n3));
        }
        this.l.a(cmz2.e(16, 0, 16)).a(this.l, this.l.p, cmz2);
        long l2 = (long)n2 * (long)n2 + (long)n3 * (long)n3;
        if (l2 > 4096L) {
            float f2 = this.a(n2, n3, 1, 1);
            if (f2 < -20.0f && this.h.nextInt(14) == 0) {
                this.r.a(this.l, this.h, cmz2.e(this.h.nextInt(16) + 8, 55 + this.h.nextInt(16), this.h.nextInt(16) + 8));
                if (this.h.nextInt(4) == 0) {
                    this.r.a(this.l, this.h, cmz2.e(this.h.nextInt(16) + 8, 55 + this.h.nextInt(16), this.h.nextInt(16) + 8));
                }
            }
            if (this.a(n2, n3, 1, 1) > 40.0f) {
                int n4 = this.h.nextInt(5);
                for (int i2 = 0; i2 < n4; ++i2) {
                    int n5;
                    int n6;
                    int n7 = this.h.nextInt(16) + 8;
                    int n8 = this.l.k(cmz2.e(n7, 0, n6 = this.h.nextInt(16) + 8)).b();
                    if (n8 <= 0 || !this.l.c(cmz2.e(n7, (n5 = n8 - 1) + 1, n6)) || this.l.n(cmz2.e(n7, n5, n6)).t() != blg.bH) continue;
                    ft.a(this.l, cmz2.e(n7, n5 + 1, n6), this.h, 8);
                }
            }
        }
        cmy.f = false;
    }

    @Override
    public boolean a(bhm bhm2, int n2, int n3) {
        return false;
    }

    @Override
    public List a(nx nx2, cmz cmz2) {
        return this.l.a(cmz2).a(nx2);
    }

    @Override
    public cmz a(iu iu2, String string, cmz cmz2) {
        return null;
    }

    @Override
    public void b(bhm bhm2, int n2, int n3) {
    }
}

