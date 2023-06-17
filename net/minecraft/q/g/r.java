/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.dq;
import net.minecraft.q.b.q;
import net.minecraft.q.f.e;
import net.minecraft.q.f.o;
import net.minecraft.q.g.a.ag;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.g.a.ak;
import net.minecraft.q.g.a.an;
import net.minecraft.q.g.a.b;
import net.minecraft.q.g.a.n;
import net.minecraft.q.g.a.y;
import net.minecraft.q.g.c.dp;
import net.minecraft.q.g.d;
import net.minecraft.q.g.f;
import net.minecraft.q.g.u;
import net.minecraft.q.k;
import net.minecraft.u.b.m;

public class r
implements o {
    protected static final net.minecraft.g.c.b a = net.minecraft.a.p.a.v();
    protected static final net.minecraft.g.c.b b = net.minecraft.a.p.aV.v();
    protected static final net.minecraft.g.c.b c = net.minecraft.a.p.h.v();
    protected static final net.minecraft.g.c.b d = net.minecraft.a.p.l.v();
    protected static final net.minecraft.g.c.b e = net.minecraft.a.p.n.v();
    protected static final net.minecraft.g.c.b f = net.minecraft.a.p.aW.v();
    private final k n;
    private final boolean o;
    private final Random p;
    private double[] q = new double[256];
    private double[] r = new double[256];
    private double[] s = new double[256];
    private double[] t;
    private final f u;
    private final f v;
    private final f w;
    private final f x;
    private final f y;
    public final f g;
    public final f h;
    private final n z = new n();
    private final ag A = new ag();
    private final ak B = new ak();
    private final aj C = new y(net.minecraft.a.p.co.v(), 14, net.minecraft.g.c.a.b.a(net.minecraft.a.p.aV));
    private final aj D = new y(net.minecraft.a.p.df.v(), 33, net.minecraft.g.c.a.b.a(net.minecraft.a.p.aV));
    private final an E = new an(net.minecraft.a.p.k, true);
    private final an F = new an(net.minecraft.a.p.k, false);
    private final b G = new b(net.minecraft.a.p.P);
    private final b H = new b(net.minecraft.a.p.Q);
    private final dp I = new dp();
    private final u J = new d();
    double[] i;
    double[] j;
    double[] k;
    double[] l;
    double[] m;

    public r(k k2, boolean bl2, long l2) {
        this.n = k2;
        this.o = bl2;
        this.p = new Random(l2);
        this.u = new f(this.p, 16);
        this.v = new f(this.p, 16);
        this.w = new f(this.p, 8);
        this.x = new f(this.p, 4);
        this.y = new f(this.p, 4);
        this.g = new f(this.p, 10);
        this.h = new f(this.p, 16);
        k2.c(63);
    }

    public void a(int n2, int n3, e e2) {
        int n4 = 4;
        int n5 = this.n.x() / 2 + 1;
        int n6 = 5;
        int n7 = 17;
        int n8 = 5;
        this.t = this.a(this.t, n2 * 4, 0, n3 * 4, 5, 17, 5);
        for (int i2 = 0; i2 < 4; ++i2) {
            for (int i3 = 0; i3 < 4; ++i3) {
                for (int i4 = 0; i4 < 16; ++i4) {
                    double d2 = 0.125;
                    double d3 = this.t[((i2 + 0) * 5 + i3 + 0) * 17 + i4 + 0];
                    double d4 = this.t[((i2 + 0) * 5 + i3 + 1) * 17 + i4 + 0];
                    double d5 = this.t[((i2 + 1) * 5 + i3 + 0) * 17 + i4 + 0];
                    double d6 = this.t[((i2 + 1) * 5 + i3 + 1) * 17 + i4 + 0];
                    double d7 = (this.t[((i2 + 0) * 5 + i3 + 0) * 17 + i4 + 1] - d3) * 0.125;
                    double d8 = (this.t[((i2 + 0) * 5 + i3 + 1) * 17 + i4 + 1] - d4) * 0.125;
                    double d9 = (this.t[((i2 + 1) * 5 + i3 + 0) * 17 + i4 + 1] - d5) * 0.125;
                    double d10 = (this.t[((i2 + 1) * 5 + i3 + 1) * 17 + i4 + 1] - d6) * 0.125;
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
                            for (int i7 = 0; i7 < 4; ++i7) {
                                net.minecraft.g.c.b b2 = null;
                                if (i4 * 8 + i5 < n5) {
                                    b2 = d;
                                }
                                if (d17 > 0.0) {
                                    b2 = b;
                                }
                                int n9 = i6 + i2 * 4;
                                int n10 = i5 + i4 * 8;
                                int n11 = i7 + i3 * 4;
                                e2.a(n9, n10, n11, b2);
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

    public void b(int n2, int n3, e e2) {
        int n4 = this.n.x() + 1;
        double d2 = 0.03125;
        this.q = this.x.a(this.q, n2 * 16, n3 * 16, 0, 16, 16, 1, 0.03125, 0.03125, 1.0);
        this.r = this.x.a(this.r, n2 * 16, 109, n3 * 16, 16, 1, 16, 0.03125, 1.0, 0.03125);
        this.s = this.y.a(this.s, n2 * 16, n3 * 16, 0, 16, 16, 1, 0.0625, 0.0625, 0.0625);
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                boolean bl2 = this.q[i2 + i3 * 16] + this.p.nextDouble() * 0.2 > 0.0;
                boolean bl3 = this.r[i2 + i3 * 16] + this.p.nextDouble() * 0.2 > 0.0;
                int n5 = (int)(this.s[i2 + i3 * 16] / 3.0 + 3.0 + this.p.nextDouble() * 0.25);
                int n6 = -1;
                net.minecraft.g.c.b b2 = b;
                net.minecraft.g.c.b b3 = b;
                for (int i4 = 127; i4 >= 0; --i4) {
                    if (i4 < 127 - this.p.nextInt(5) && i4 > this.p.nextInt(5)) {
                        net.minecraft.g.c.b b4 = e2.a(i3, i4, i2);
                        if (b4.c() != null && b4.d() != net.minecraft.g.a.h.a) {
                            if (b4.c() != net.minecraft.a.p.aV) continue;
                            if (n6 == -1) {
                                if (n5 <= 0) {
                                    b2 = a;
                                    b3 = b;
                                } else if (i4 >= n4 - 4 && i4 <= n4 + 1) {
                                    b2 = b;
                                    b3 = b;
                                    if (bl3) {
                                        b2 = e;
                                        b3 = b;
                                    }
                                    if (bl2) {
                                        b2 = f;
                                        b3 = f;
                                    }
                                }
                                if (i4 < n4 && (b2 == null || b2.d() == net.minecraft.g.a.h.a)) {
                                    b2 = d;
                                }
                                n6 = n5;
                                if (i4 >= n4 - 1) {
                                    e2.a(i3, i4, i2, b2);
                                    continue;
                                }
                                e2.a(i3, i4, i2, b3);
                                continue;
                            }
                            if (n6 <= 0) continue;
                            --n6;
                            e2.a(i3, i4, i2, b3);
                            continue;
                        }
                        n6 = -1;
                        continue;
                    }
                    e2.a(i3, i4, i2, c);
                }
            }
        }
    }

    @Override
    public net.minecraft.q.f.k a(int n2, int n3) {
        this.p.setSeed((long)n2 * 341873128712L + (long)n3 * 132897987541L);
        e e2 = new e();
        this.a(n2, n3, e2);
        this.b(n2, n3, e2);
        this.J.a(this.n, n2, n3, e2);
        if (this.o) {
            this.I.a(this.n, n2, n3, e2);
        }
        net.minecraft.q.f.k k2 = new net.minecraft.q.f.k(this.n, e2, n2, n3);
        q[] arrq = this.n.k().b(null, n2 * 16, n3 * 16, 16, 16);
        byte[] arrby = k2.l();
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            arrby[i2] = (byte)net.minecraft.q.b.q.a(arrq[i2]);
        }
        k2.m();
        return k2;
    }

    private double[] a(double[] arrd, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        if (arrd == null) {
            arrd = new double[n5 * n6 * n7];
        }
        double d2 = 684.412;
        double d3 = 2053.236;
        this.l = this.g.a(this.l, n2, n3, n4, n5, 1, n7, 1.0, 0.0, 1.0);
        this.m = this.h.a(this.m, n2, n3, n4, n5, 1, n7, 100.0, 0.0, 100.0);
        this.i = this.w.a(this.i, n2, n3, n4, n5, n6, n7, 8.555150000000001, 34.2206, 8.555150000000001);
        this.j = this.u.a(this.j, n2, n3, n4, n5, n6, n7, 684.412, 2053.236, 684.412);
        this.k = this.v.a(this.k, n2, n3, n4, n5, n6, n7, 684.412, 2053.236, 684.412);
        int n9 = 0;
        double[] arrd2 = new double[n6];
        for (n8 = 0; n8 < n6; ++n8) {
            arrd2[n8] = Math.cos((double)n8 * Math.PI * 6.0 / (double)n6) * 2.0;
            double d4 = n8;
            if (n8 > n6 / 2) {
                d4 = n6 - 1 - n8;
            }
            if (!(d4 < 4.0)) continue;
            d4 = 4.0 - d4;
            int n10 = n8;
            arrd2[n10] = arrd2[n10] - d4 * d4 * d4 * 10.0;
        }
        for (n8 = 0; n8 < n5; ++n8) {
            for (int i2 = 0; i2 < n7; ++i2) {
                double d5 = 0.0;
                for (int i3 = 0; i3 < n6; ++i3) {
                    double d6;
                    double d7 = arrd2[i3];
                    double d8 = this.j[n9] / 512.0;
                    double d9 = this.k[n9] / 512.0;
                    double d10 = (this.i[n9] / 10.0 + 1.0) / 2.0;
                    double d11 = d10 < 0.0 ? d8 : (d10 > 1.0 ? d9 : d8 + (d9 - d8) * d10);
                    d11 -= d7;
                    if (i3 > n6 - 4) {
                        d6 = (float)(i3 - (n6 - 4)) / 3.0f;
                        d11 = d11 * (1.0 - d6) + -10.0 * d6;
                    }
                    if ((double)i3 < 0.0) {
                        d6 = (0.0 - (double)i3) / 4.0;
                        d6 = net.minecraft.u.b.n.a(d6, 0.0, 1.0);
                        d11 = d11 * (1.0 - d6) + -10.0 * d6;
                    }
                    arrd[n9] = d11;
                    ++n9;
                }
            }
        }
        return arrd;
    }

    @Override
    public void b(int n2, int n3) {
        int n4;
        int n5;
        dq.a = true;
        int n6 = n2 * 16;
        int n7 = n3 * 16;
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n6, 0, n7);
        q q2 = this.n.a(b2.a(16, 0, 16));
        m m2 = new m(n2, n3);
        this.I.a(this.n, this.p, m2);
        for (n5 = 0; n5 < 8; ++n5) {
            this.F.a(this.n, this.p, b2.a(this.p.nextInt(16) + 8, this.p.nextInt(120) + 4, this.p.nextInt(16) + 8));
        }
        for (n5 = 0; n5 < this.p.nextInt(this.p.nextInt(10) + 1) + 1; ++n5) {
            this.z.a(this.n, this.p, b2.a(this.p.nextInt(16) + 8, this.p.nextInt(120) + 4, this.p.nextInt(16) + 8));
        }
        for (n5 = 0; n5 < this.p.nextInt(this.p.nextInt(10) + 1); ++n5) {
            this.A.a(this.n, this.p, b2.a(this.p.nextInt(16) + 8, this.p.nextInt(120) + 4, this.p.nextInt(16) + 8));
        }
        for (n5 = 0; n5 < 10; ++n5) {
            this.B.a(this.n, this.p, b2.a(this.p.nextInt(16) + 8, this.p.nextInt(128), this.p.nextInt(16) + 8));
        }
        if (this.p.nextBoolean()) {
            this.G.a(this.n, this.p, b2.a(this.p.nextInt(16) + 8, this.p.nextInt(128), this.p.nextInt(16) + 8));
        }
        if (this.p.nextBoolean()) {
            this.H.a(this.n, this.p, b2.a(this.p.nextInt(16) + 8, this.p.nextInt(128), this.p.nextInt(16) + 8));
        }
        for (n5 = 0; n5 < 16; ++n5) {
            this.C.a(this.n, this.p, b2.a(this.p.nextInt(16), this.p.nextInt(108) + 10, this.p.nextInt(16)));
        }
        n5 = this.n.x() / 2 + 1;
        for (n4 = 0; n4 < 4; ++n4) {
            this.D.a(this.n, this.p, b2.a(this.p.nextInt(16), n5 - 5 + this.p.nextInt(10), this.p.nextInt(16)));
        }
        for (n4 = 0; n4 < 16; ++n4) {
            this.E.a(this.n, this.p, b2.a(this.p.nextInt(16), this.p.nextInt(108) + 10, this.p.nextInt(16)));
        }
        q2.a(this.n, this.p, new net.minecraft.u.b.b(n6, 0, n7));
        dq.a = false;
    }

    @Override
    public boolean a(net.minecraft.q.f.k k2, int n2, int n3) {
        return false;
    }

    @Override
    public List a(net.minecraft.w.ag ag2, net.minecraft.u.b.b b2) {
        if (ag2 == net.minecraft.w.ag.a) {
            if (this.I.b(b2)) {
                return this.I.c();
            }
            if (this.I.b(this.n, b2) && this.n.n(b2.c()).c() == net.minecraft.a.p.by) {
                return this.I.c();
            }
        }
        q q2 = this.n.a(b2);
        return q2.a(ag2);
    }

    @Override
    public net.minecraft.u.b.b a(k k2, String string, net.minecraft.u.b.b b2) {
        return null;
    }

    @Override
    public void b(net.minecraft.q.f.k k2, int n2, int n3) {
        this.I.a(this.n, n2, n3, null);
    }
}

