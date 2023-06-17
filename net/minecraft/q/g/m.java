/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g;

import java.util.List;
import java.util.Random;
import net.minecraft.g.c.b;
import net.minecraft.g.dq;
import net.minecraft.g.eh;
import net.minecraft.q.b.q;
import net.minecraft.q.f.e;
import net.minecraft.q.f.o;
import net.minecraft.q.g.a.h;
import net.minecraft.q.g.c.bk;
import net.minecraft.q.g.f;
import net.minecraft.q.g.p;
import net.minecraft.q.k;
import net.minecraft.u.b.n;
import net.minecraft.w.ag;

public class m
implements o {
    private final Random h;
    protected static final b a = net.minecraft.a.p.bH.v();
    protected static final b b = net.minecraft.a.p.a.v();
    private final f i;
    private final f j;
    private final f k;
    public f c;
    public f d;
    private final k l;
    private final boolean m;
    private final bk n = new bk(this);
    private final p o;
    private double[] p;
    private q[] q;
    double[] e;
    double[] f;
    double[] g;
    private final h r = new h();

    public m(k k2, boolean bl2, long l2) {
        this.l = k2;
        this.m = bl2;
        this.h = new Random(l2);
        this.i = new f(this.h, 16);
        this.j = new f(this.h, 16);
        this.k = new f(this.h, 8);
        this.c = new f(this.h, 10);
        this.d = new f(this.h, 16);
        this.o = new p(this.h);
    }

    public void a(int n2, int n3, e e2) {
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
                                b b2 = b;
                                if (d17 > 0.0) {
                                    b2 = a;
                                }
                                int n8 = i6 + i2 * 8;
                                int n9 = i5 + i4 * 4;
                                int n10 = i7 + i3 * 8;
                                e2.a(n8, n9, n10, b2);
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

    public void a(e e2) {
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                boolean bl2 = true;
                int n2 = -1;
                b b2 = a;
                b b3 = a;
                for (int i4 = 127; i4 >= 0; --i4) {
                    b b4 = e2.a(i2, i4, i3);
                    if (b4.d() == net.minecraft.g.a.h.a) {
                        n2 = -1;
                        continue;
                    }
                    if (b4.c() != net.minecraft.a.p.b) continue;
                    if (n2 == -1) {
                        n2 = 1;
                        if (i4 >= 0) {
                            e2.a(i2, i4, i3, b2);
                            continue;
                        }
                        e2.a(i2, i4, i3, b3);
                        continue;
                    }
                    if (n2 <= 0) continue;
                    --n2;
                    e2.a(i2, i4, i3, b3);
                }
            }
        }
    }

    @Override
    public net.minecraft.q.f.k a(int n2, int n3) {
        this.h.setSeed((long)n2 * 341873128712L + (long)n3 * 132897987541L);
        e e2 = new e();
        this.q = this.l.k().b(this.q, n2 * 16, n3 * 16, 16, 16);
        this.a(n2, n3, e2);
        this.a(e2);
        if (this.m) {
            this.n.a(this.l, n2, n3, e2);
        }
        net.minecraft.q.f.k k2 = new net.minecraft.q.f.k(this.l, e2, n2, n3);
        byte[] arrby = k2.l();
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            arrby[i2] = (byte)net.minecraft.q.b.q.a(this.q[i2]);
        }
        k2.b();
        return k2;
    }

    private float a(int n2, int n3, int n4, int n5) {
        float f2 = n2 * 2 + n4;
        float f3 = n3 * 2 + n5;
        float f4 = 100.0f - net.minecraft.u.b.n.c(f2 * f2 + f3 * f3) * 8.0f;
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
                float f5 = (net.minecraft.u.b.n.e(l2) * 3439.0f + net.minecraft.u.b.n.e(l3) * 147.0f) % 13.0f + 9.0f;
                f2 = n4 - i2 * 2;
                f3 = n5 - i3 * 2;
                float f6 = 100.0f - net.minecraft.u.b.n.c(f2 * f2 + f3 * f3) * f5;
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
                        d4 = net.minecraft.u.b.n.a(d4, 0.0, 1.0);
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
        dq.a = true;
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n2 * 16, 0, n3 * 16);
        if (this.m) {
            this.n.a(this.l, this.h, new net.minecraft.u.b.m(n2, n3));
        }
        this.l.a(b2.a(16, 0, 16)).a(this.l, this.l.p, b2);
        long l2 = (long)n2 * (long)n2 + (long)n3 * (long)n3;
        if (l2 > 4096L) {
            float f2 = this.a(n2, n3, 1, 1);
            if (f2 < -20.0f && this.h.nextInt(14) == 0) {
                this.r.a(this.l, this.h, b2.a(this.h.nextInt(16) + 8, 55 + this.h.nextInt(16), this.h.nextInt(16) + 8));
                if (this.h.nextInt(4) == 0) {
                    this.r.a(this.l, this.h, b2.a(this.h.nextInt(16) + 8, 55 + this.h.nextInt(16), this.h.nextInt(16) + 8));
                }
            }
            if (this.a(n2, n3, 1, 1) > 40.0f) {
                int n4 = this.h.nextInt(5);
                for (int i2 = 0; i2 < n4; ++i2) {
                    int n5;
                    int n6;
                    int n7 = this.h.nextInt(16) + 8;
                    int n8 = this.l.k(b2.a(n7, 0, n6 = this.h.nextInt(16) + 8)).k();
                    if (n8 <= 0 || !this.l.c(b2.a(n7, (n5 = n8 - 1) + 1, n6)) || this.l.n(b2.a(n7, n5, n6)).c() != net.minecraft.a.p.bH) continue;
                    eh.a(this.l, b2.a(n7, n5 + 1, n6), this.h, 8);
                }
            }
        }
        dq.a = false;
    }

    @Override
    public boolean a(net.minecraft.q.f.k k2, int n2, int n3) {
        return false;
    }

    @Override
    public List a(ag ag2, net.minecraft.u.b.b b2) {
        return this.l.a(b2).a(ag2);
    }

    @Override
    public net.minecraft.u.b.b a(k k2, String string, net.minecraft.u.b.b b2) {
        return null;
    }

    @Override
    public void b(net.minecraft.q.f.k k2, int n2, int n3) {
    }
}

