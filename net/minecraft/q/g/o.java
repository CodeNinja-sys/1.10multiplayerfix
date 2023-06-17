/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.dq;
import net.minecraft.q.ab;
import net.minecraft.q.b.q;
import net.minecraft.q.c;
import net.minecraft.q.f.e;
import net.minecraft.q.g.a;
import net.minecraft.q.g.a.g;
import net.minecraft.q.g.b;
import net.minecraft.q.g.c.ae;
import net.minecraft.q.g.c.ap;
import net.minecraft.q.g.c.bs;
import net.minecraft.q.g.c.dg;
import net.minecraft.q.g.c.s;
import net.minecraft.q.g.f;
import net.minecraft.q.g.h;
import net.minecraft.q.g.i;
import net.minecraft.q.g.j;
import net.minecraft.q.g.u;
import net.minecraft.q.k;
import net.minecraft.u.b.m;
import net.minecraft.u.b.n;
import net.minecraft.w.ag;

public class o
implements net.minecraft.q.f.o {
    protected static final net.minecraft.g.c.b a = net.minecraft.a.p.b.v();
    private final Random i;
    private final f j;
    private final f k;
    private final f l;
    private final b m;
    public f b;
    public f c;
    public f d;
    private final k n;
    private final boolean o;
    private final ab p;
    private final double[] q;
    private final float[] r;
    private a s;
    private net.minecraft.g.c.b t = net.minecraft.a.p.j.v();
    private double[] u = new double[256];
    private final u v = new i();
    private final s w = new s();
    private final dg x = new dg();
    private final bs y = new bs();
    private final ae z = new ae();
    private final u A = new j();
    private final ap B = new ap();
    private q[] C;
    double[] e;
    double[] f;
    double[] g;
    double[] h;

    public o(k k2, long l2, boolean bl2, String string) {
        this.n = k2;
        this.o = bl2;
        this.p = k2.F().t();
        this.i = new Random(l2);
        this.j = new f(this.i, 16);
        this.k = new f(this.i, 16);
        this.l = new f(this.i, 8);
        this.m = new b(this.i, 4);
        this.b = new f(this.i, 10);
        this.c = new f(this.i, 16);
        this.d = new f(this.i, 8);
        this.q = new double[825];
        this.r = new float[25];
        for (int i2 = -2; i2 <= 2; ++i2) {
            for (int i3 = -2; i3 <= 2; ++i3) {
                float f2;
                this.r[i2 + 2 + (i3 + 2) * 5] = f2 = 10.0f / net.minecraft.u.b.n.c((float)(i2 * i2 + i3 * i3) + 0.2f);
            }
        }
        if (string != null) {
            this.s = net.minecraft.q.g.h.a(string).b();
            this.t = this.s.E ? net.minecraft.a.p.l.v() : net.minecraft.a.p.j.v();
            k2.c(this.s.q);
        }
    }

    public dg a() {
        return this.x;
    }

    public void a(int n2, int n3, e e2) {
        this.C = this.n.k().a(this.C, n2 * 4 - 2, n3 * 4 - 2, 10, 10);
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
                            double d17 = (d13 - d12) * 0.25;
                            double d18 = d12 - d17;
                            for (int i7 = 0; i7 < 4; ++i7) {
                                double d19;
                                d18 += d17;
                                if (d19 > 0.0) {
                                    e2.a(i2 * 4 + i6, i4 * 8 + i5, i3 * 4 + i7, a);
                                    continue;
                                }
                                if (i4 * 8 + i5 >= this.s.q) continue;
                                e2.a(i2 * 4 + i6, i4 * 8 + i5, i3 * 4 + i7, this.t);
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

    public void a(int n2, int n3, e e2, q[] arrq) {
        double d2 = 0.03125;
        this.u = this.m.a(this.u, n2 * 16, n3 * 16, 16, 16, 0.0625, 0.0625, 1.0);
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                q q2 = arrq[i3 + i2 * 16];
                q2.a(this.n, this.i, e2, n2 * 16 + i2, n3 * 16 + i3, this.u[i3 + i2 * 16]);
            }
        }
    }

    @Override
    public net.minecraft.q.f.k a(int n2, int n3) {
        this.i.setSeed((long)n2 * 341873128712L + (long)n3 * 132897987541L);
        e e2 = new e();
        this.a(n2, n3, e2);
        this.C = this.n.k().b(this.C, n2 * 16, n3 * 16, 16, 16);
        this.a(n2, n3, e2, this.C);
        if (this.s.r) {
            this.v.a(this.n, n2, n3, e2);
        }
        if (this.s.z) {
            this.A.a(this.n, n2, n3, e2);
        }
        if (this.o) {
            if (this.s.w) {
                this.y.a(this.n, n2, n3, e2);
            }
            if (this.s.v) {
                this.x.a(this.n, n2, n3, e2);
            }
            if (this.s.u) {
                this.w.a(this.n, n2, n3, e2);
            }
            if (this.s.x) {
                this.z.a(this.n, n2, n3, e2);
            }
            if (this.s.y) {
                this.B.a(this.n, n2, n3, e2);
            }
        }
        net.minecraft.q.f.k k2 = new net.minecraft.q.f.k(this.n, e2, n2, n3);
        byte[] arrby = k2.l();
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            arrby[i2] = (byte)net.minecraft.q.b.q.a(this.C[i2]);
        }
        k2.b();
        return k2;
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
                q q2 = this.C[i2 + 2 + (i3 + 2) * 10];
                for (int i4 = -2; i4 <= 2; ++i4) {
                    for (int i5 = -2; i5 <= 2; ++i5) {
                        q q3 = this.C[i2 + i4 + 2 + (i3 + i5 + 2) * 10];
                        float f7 = this.s.n + q3.j() * this.s.m;
                        float f8 = this.s.p + q3.m() * this.s.o;
                        if (this.p == ab.e && f7 > 0.0f) {
                            f7 = 1.0f + f7 * 2.0f;
                            f8 = 1.0f + f8 * 4.0f;
                        }
                        float f9 = this.r[i4 + 2 + (i5 + 2) * 5] / (f7 + 2.0f);
                        if (q3.j() > q2.j()) {
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
                    double d10 = net.minecraft.u.b.n.b(d7, d8, d9) - d6;
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
        dq.a = true;
        int n7 = n2 * 16;
        int n8 = n3 * 16;
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n7, 0, n8);
        q q2 = this.n.a(b2.a(16, 0, 16));
        this.i.setSeed(this.n.A());
        long l2 = this.i.nextLong() / 2L * 2L + 1L;
        long l3 = this.i.nextLong() / 2L * 2L + 1L;
        this.i.setSeed((long)n2 * l2 + (long)n3 * l3 ^ this.n.A());
        boolean bl2 = false;
        m m2 = new m(n2, n3);
        if (this.o) {
            if (this.s.w) {
                this.y.a(this.n, this.i, m2);
            }
            if (this.s.v) {
                bl2 = this.x.a(this.n, this.i, m2);
            }
            if (this.s.u) {
                this.w.a(this.n, this.i, m2);
            }
            if (this.s.x) {
                this.z.a(this.n, this.i, m2);
            }
            if (this.s.y) {
                this.B.a(this.n, this.i, m2);
            }
        }
        if (q2 != net.minecraft.a.i.d && q2 != net.minecraft.a.i.s && this.s.A && !bl2 && this.i.nextInt(this.s.B) == 0) {
            n6 = this.i.nextInt(16) + 8;
            n5 = this.i.nextInt(256);
            n4 = this.i.nextInt(16) + 8;
            new g(net.minecraft.a.p.j).a(this.n, this.i, b2.a(n6, n5, n4));
        }
        if (!bl2 && this.i.nextInt(this.s.D / 10) == 0 && this.s.C) {
            n6 = this.i.nextInt(16) + 8;
            n5 = this.i.nextInt(this.i.nextInt(248) + 8);
            n4 = this.i.nextInt(16) + 8;
            if (n5 < this.n.x() || this.i.nextInt(this.s.D / 8) == 0) {
                new g(net.minecraft.a.p.l).a(this.n, this.i, b2.a(n6, n5, n4));
            }
        }
        if (this.s.s) {
            for (n6 = 0; n6 < this.s.t; ++n6) {
                n5 = this.i.nextInt(16) + 8;
                n4 = this.i.nextInt(256);
                int n9 = this.i.nextInt(16) + 8;
                new net.minecraft.q.g.a.j().a(this.n, this.i, b2.a(n5, n4, n9));
            }
        }
        q2.a(this.n, this.i, new net.minecraft.u.b.b(n7, 0, n8));
        net.minecraft.q.c.a(this.n, q2, n7 + 8, n8 + 8, 16, 16, this.i);
        b2 = b2.a(8, 0, 8);
        for (n6 = 0; n6 < 16; ++n6) {
            for (n5 = 0; n5 < 16; ++n5) {
                net.minecraft.u.b.b b3 = this.n.o(b2.a(n6, 0, n5));
                net.minecraft.u.b.b b4 = b3.c();
                if (this.n.t(b4)) {
                    this.n.a(b4, net.minecraft.a.p.aI.v(), 2);
                }
                if (!this.n.f(b3, true)) continue;
                this.n.a(b3, net.minecraft.a.p.aH.v(), 2);
            }
        }
        dq.a = false;
    }

    @Override
    public boolean a(net.minecraft.q.f.k k2, int n2, int n3) {
        boolean bl2 = false;
        if (this.s.y && this.o && k2.x() < 3600L) {
            bl2 |= this.B.a(this.n, this.i, new m(n2, n3));
        }
        return bl2;
    }

    @Override
    public List a(ag ag2, net.minecraft.u.b.b b2) {
        q q2 = this.n.a(b2);
        if (this.o) {
            if (ag2 == ag.a && this.z.a(b2)) {
                return this.z.c();
            }
            if (ag2 == ag.a && this.s.y && this.B.b(this.n, b2)) {
                return this.B.c();
            }
        }
        return q2.a(ag2);
    }

    @Override
    public net.minecraft.u.b.b a(k k2, String string, net.minecraft.u.b.b b2) {
        return "Stronghold".equals(string) && this.w != null ? this.w.a(k2, b2) : null;
    }

    @Override
    public void b(net.minecraft.q.f.k k2, int n2, int n3) {
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

