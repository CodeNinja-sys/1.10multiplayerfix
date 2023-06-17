/*
 * Decompiled with CFR 0.150.
 */
import java.util.Arrays;
import java.util.Random;

public class aex
extends anr {
    protected static final dbk a = blg.d.s().a(bwt.a, (Comparable)((Object)dgu.b));
    protected static final dbk b = blg.c.s();
    protected static final dbk c = blg.cz.s();
    protected static final dbk d = blg.cu.s();
    protected static final dbk e = d.a(bsd.a, (Comparable)((Object)dck.b));
    protected static final dbk f = blg.m.s().a(bhg.a, (Comparable)((Object)aac.b));
    private dbk[] E;
    private long F;
    private ctl G;
    private ctl H;
    private ctl I;
    private final boolean J;
    private final boolean K;

    public aex(boolean bl2, boolean bl3, ain ain2) {
        super(ain2);
        this.J = bl2;
        this.K = bl3;
        this.B.clear();
        this.x = f;
        this.y = d;
        this.z.z = -999;
        this.z.D = 20;
        this.z.F = 3;
        this.z.G = 5;
        this.z.B = 0;
        this.B.clear();
        if (bl3) {
            this.z.z = 5;
        }
    }

    @Override
    protected bku a() {
        return new bxl(this, null);
    }

    @Override
    public ko a(Random random) {
        return t;
    }

    @Override
    public int b(cmz cmz2) {
        return 10387789;
    }

    @Override
    public int a(cmz cmz2) {
        return 9470285;
    }

    @Override
    public void a(iu iu2, Random random, cmz cmz2) {
        super.a(iu2, random, cmz2);
    }

    @Override
    public void a(iu iu2, Random random, cnb cnb2, int n2, int n3, double d2) {
        int n4;
        int n5;
        if (this.E == null || this.F != iu2.y()) {
            this.a(iu2.y());
        }
        if (this.G == null || this.H == null || this.F != iu2.y()) {
            Random random2 = new Random(this.F);
            this.G = new ctl(random2, 4);
            this.H = new ctl(random2, 1);
        }
        this.F = iu2.y();
        double d3 = 0.0;
        if (this.J) {
            n5 = (n2 & 0xFFFFFFF0) + (n3 & 0xF);
            n4 = (n3 & 0xFFFFFFF0) + (n2 & 0xF);
            double d4 = Math.min(Math.abs(d2), this.G.a((double)n5 * 0.25, (double)n4 * 0.25));
            if (d4 > 0.0) {
                double d5 = 0.001953125;
                d3 = d4 * d4 * 2.5;
                double d6 = Math.abs(this.H.a((double)n5 * 0.001953125, (double)n4 * 0.001953125));
                double d7 = Math.ceil(d6 * 50.0) + 14.0;
                if (d3 > d7) {
                    d3 = d7;
                }
                d3 += 64.0;
            }
        }
        n5 = n2 & 0xF;
        n4 = n3 & 0xF;
        int n6 = iu2.u();
        dbk dbk2 = d;
        dbk dbk3 = this.y;
        int n7 = (int)(d2 / 3.0 + 3.0 + random.nextDouble() * 0.25);
        boolean bl2 = Math.cos(d2 / 3.0 * Math.PI) > 0.0;
        int n8 = -1;
        boolean bl3 = false;
        int n9 = 0;
        for (int i2 = 255; i2 >= 0; --i2) {
            if (cnb2.a(n4, i2, n5).a() == ahk.a && i2 < (int)d3) {
                cnb2.a(n4, i2, n5, g);
            }
            if (i2 <= random.nextInt(5)) {
                cnb2.a(n4, i2, n5, i);
                continue;
            }
            if (n9 >= 15) continue;
            dbk dbk4 = cnb2.a(n4, i2, n5);
            if (dbk4.a() == ahk.a) {
                n8 = -1;
                continue;
            }
            if (dbk4.t() != blg.b) continue;
            if (n8 == -1) {
                bl3 = false;
                if (n7 <= 0) {
                    dbk2 = h;
                    dbk3 = g;
                } else if (i2 >= n6 - 4 && i2 <= n6 + 1) {
                    dbk2 = d;
                    dbk3 = this.y;
                }
                if (i2 < n6 && (dbk2 == null || dbk2.a() == ahk.a)) {
                    dbk2 = n;
                }
                n8 = n7 + Math.max(0, i2 - n6);
                if (i2 >= n6 - 1) {
                    if (this.K && i2 > 86 + n7 * 2) {
                        if (bl2) {
                            cnb2.a(n4, i2, n5, a);
                        } else {
                            cnb2.a(n4, i2, n5, b);
                        }
                    } else if (i2 > n6 + 3 + n7) {
                        dbk dbk5 = i2 < 64 || i2 > 127 ? e : (bl2 ? c : this.a(n2, i2, n3));
                        cnb2.a(n4, i2, n5, dbk5);
                    } else {
                        cnb2.a(n4, i2, n5, this.x);
                        bl3 = true;
                    }
                } else {
                    cnb2.a(n4, i2, n5, dbk3);
                    if (dbk3.t() == blg.cu) {
                        cnb2.a(n4, i2, n5, e);
                    }
                }
            } else if (n8 > 0) {
                --n8;
                if (bl3) {
                    cnb2.a(n4, i2, n5, e);
                } else {
                    cnb2.a(n4, i2, n5, this.a(n2, i2, n3));
                }
            }
            ++n9;
        }
    }

    private void a(long l2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        this.E = new dbk[64];
        Arrays.fill(this.E, c);
        Random random = new Random(l2);
        this.I = new ctl(random, 1);
        for (n8 = 0; n8 < 64; ++n8) {
            if ((n8 += random.nextInt(5) + 1) >= 64) continue;
            this.E[n8] = e;
        }
        n8 = random.nextInt(4) + 2;
        for (n7 = 0; n7 < n8; ++n7) {
            n6 = random.nextInt(3) + 1;
            n5 = random.nextInt(64);
            for (n4 = 0; n5 + n4 < 64 && n4 < n6; ++n4) {
                this.E[n5 + n4] = d.a(bsd.a, (Comparable)((Object)dck.e));
            }
        }
        n7 = random.nextInt(4) + 2;
        for (n6 = 0; n6 < n7; ++n6) {
            n5 = random.nextInt(3) + 2;
            n4 = random.nextInt(64);
            for (n3 = 0; n4 + n3 < 64 && n3 < n5; ++n3) {
                this.E[n4 + n3] = d.a(bsd.a, (Comparable)((Object)dck.m));
            }
        }
        n6 = random.nextInt(4) + 2;
        for (n5 = 0; n5 < n6; ++n5) {
            n4 = random.nextInt(3) + 1;
            n3 = random.nextInt(64);
            for (n2 = 0; n3 + n2 < 64 && n2 < n4; ++n2) {
                this.E[n3 + n2] = d.a(bsd.a, (Comparable)((Object)dck.o));
            }
        }
        n5 = random.nextInt(3) + 3;
        n4 = 0;
        for (n3 = 0; n3 < n5; ++n3) {
            n2 = 1;
            for (int i2 = 0; (n4 += random.nextInt(16) + 4) + i2 < 64 && i2 < 1; ++i2) {
                this.E[n4 + i2] = d.a(bsd.a, (Comparable)((Object)dck.a));
                if (n4 + i2 > 1 && random.nextBoolean()) {
                    this.E[n4 + i2 - 1] = d.a(bsd.a, (Comparable)((Object)dck.i));
                }
                if (n4 + i2 >= 63 || !random.nextBoolean()) continue;
                this.E[n4 + i2 + 1] = d.a(bsd.a, (Comparable)((Object)dck.i));
            }
        }
    }

    private dbk a(int n2, int n3, int n4) {
        int n5 = (int)Math.round(this.I.a((double)n2 / 512.0, (double)n2 / 512.0) * 2.0);
        return this.E[(n3 + n5 + 64) % 64];
    }
}

