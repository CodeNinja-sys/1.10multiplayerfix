/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import java.util.List;
import net.minecraft.a.p;
import net.minecraft.c.a;
import net.minecraft.e.e;
import net.minecraft.g.by;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.di;
import net.minecraft.g.dj;
import net.minecraft.m.cu;
import net.minecraft.q.ak;
import net.minecraft.q.k;
import net.minecraft.q.v;
import net.minecraft.u.ad;
import net.minecraft.u.bp;
import net.minecraft.u.r;
import net.minecraft.w.e.bj;
import net.minecraft.w.f.aa;
import net.minecraft.w.f.c;
import net.minecraft.w.f.d;
import net.minecraft.w.f.m;
import net.minecraft.w.f.s;
import net.minecraft.w.f.u;
import net.minecraft.w.f.w;
import net.minecraft.w.f.x;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public abstract class f
extends n
implements ak {
    private static final g a = net.minecraft.x.a.o.a(f.class, net.minecraft.x.a.q.b);
    private static final g b = net.minecraft.x.a.o.a(f.class, net.minecraft.x.a.q.b);
    private static final g c = net.minecraft.x.a.o.a(f.class, net.minecraft.x.a.q.c);
    private static final g d = net.minecraft.x.a.o.a(f.class, net.minecraft.x.a.q.b);
    private static final g e = net.minecraft.x.a.o.a(f.class, net.minecraft.x.a.q.b);
    private static final g f = net.minecraft.x.a.o.a(f.class, net.minecraft.x.a.q.h);
    private boolean g;
    private static final int[][][] h;
    private int i;
    private double j;
    private double k;
    private double l;
    private double m;
    private double n;
    private double o;
    private double p;
    private double q;

    static {
        int[][][] arrarrn = new int[10][][];
        int[][] arrarrn2 = new int[2][];
        int[] arrn = new int[3];
        arrn[2] = -1;
        arrarrn2[0] = arrn;
        int[] arrn2 = new int[3];
        arrn2[2] = 1;
        arrarrn2[1] = arrn2;
        arrarrn[0] = arrarrn2;
        int[][] arrarrn3 = new int[2][];
        int[] arrn3 = new int[3];
        arrn3[0] = -1;
        arrarrn3[0] = arrn3;
        int[] arrn4 = new int[3];
        arrn4[0] = 1;
        arrarrn3[1] = arrn4;
        arrarrn[1] = arrarrn3;
        int[][] arrarrn4 = new int[2][];
        int[] arrn5 = new int[3];
        arrn5[0] = -1;
        arrn5[1] = -1;
        arrarrn4[0] = arrn5;
        int[] arrn6 = new int[3];
        arrn6[0] = 1;
        arrarrn4[1] = arrn6;
        arrarrn[2] = arrarrn4;
        int[][] arrarrn5 = new int[2][];
        int[] arrn7 = new int[3];
        arrn7[0] = -1;
        arrarrn5[0] = arrn7;
        int[] arrn8 = new int[3];
        arrn8[0] = 1;
        arrn8[1] = -1;
        arrarrn5[1] = arrn8;
        arrarrn[3] = arrarrn5;
        int[][] arrarrn6 = new int[2][];
        int[] arrn9 = new int[3];
        arrn9[2] = -1;
        arrarrn6[0] = arrn9;
        int[] arrn10 = new int[3];
        arrn10[1] = -1;
        arrn10[2] = 1;
        arrarrn6[1] = arrn10;
        arrarrn[4] = arrarrn6;
        int[][] arrarrn7 = new int[2][];
        int[] arrn11 = new int[3];
        arrn11[1] = -1;
        arrn11[2] = -1;
        arrarrn7[0] = arrn11;
        int[] arrn12 = new int[3];
        arrn12[2] = 1;
        arrarrn7[1] = arrn12;
        arrarrn[5] = arrarrn7;
        int[][] arrarrn8 = new int[2][];
        int[] arrn13 = new int[3];
        arrn13[2] = 1;
        arrarrn8[0] = arrn13;
        int[] arrn14 = new int[3];
        arrn14[0] = 1;
        arrarrn8[1] = arrn14;
        arrarrn[6] = arrarrn8;
        int[][] arrarrn9 = new int[2][];
        int[] arrn15 = new int[3];
        arrn15[2] = 1;
        arrarrn9[0] = arrn15;
        int[] arrn16 = new int[3];
        arrn16[0] = -1;
        arrarrn9[1] = arrn16;
        arrarrn[7] = arrarrn9;
        int[][] arrarrn10 = new int[2][];
        int[] arrn17 = new int[3];
        arrn17[2] = -1;
        arrarrn10[0] = arrn17;
        int[] arrn18 = new int[3];
        arrn18[0] = -1;
        arrarrn10[1] = arrn18;
        arrarrn[8] = arrarrn10;
        int[][] arrarrn11 = new int[2][];
        int[] arrn19 = new int[3];
        arrn19[2] = -1;
        arrarrn11[0] = arrn19;
        int[] arrn20 = new int[3];
        arrn20[0] = 1;
        arrarrn11[1] = arrn20;
        arrarrn[9] = arrarrn11;
        h = arrarrn;
    }

    public f(k k2) {
        super(k2);
        this.aN = true;
        this.d(0.98f, 0.7f);
    }

    public static f a(k k2, double d2, double d3, double d4, m m2) {
        switch (m2) {
            case b: {
                return new d(k2, d2, d3, d4);
            }
            case c: {
                return new u(k2, d2, d3, d4);
            }
            case d: {
                return new c(k2, d2, d3, d4);
            }
            case e: {
                return new aa(k2, d2, d3, d4);
            }
            case f: {
                return new x(k2, d2, d3, d4);
            }
            case g: {
                return new w(k2, d2, d3, d4);
            }
        }
        return new s(k2, d2, d3, d4);
    }

    @Override
    protected boolean au() {
        return false;
    }

    @Override
    protected void cb_() {
        this.bE.a(a, 0);
        this.bE.a(b, 1);
        this.bE.a(c, Float.valueOf(0.0f));
        this.bE.a(d, 0);
        this.bE.a(e, 6);
        this.bE.a(f, false);
    }

    @Override
    public net.minecraft.u.b.a o(n n2) {
        return n2.bM() ? n2.cT() : null;
    }

    @Override
    public net.minecraft.u.b.a cj() {
        return null;
    }

    @Override
    public boolean bM() {
        return true;
    }

    public f(k k2, double d2, double d3, double d4) {
        this(k2);
        this.e(d2, d3, d4);
        this.aX = 0.0;
        this.aY = 0.0;
        this.aZ = 0.0;
        this.aR = d2;
        this.aS = d3;
        this.aT = d4;
    }

    @Override
    public double cs() {
        return 0.0;
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (!this.aQ.C && !this.bk) {
            boolean bl2;
            if (this.b(n2)) {
                return false;
            }
            this.e(-this.w());
            this.d(10);
            this.bN();
            this.a(this.t() + f2 * 10.0f);
            boolean bl3 = bl2 = n2.j() instanceof net.minecraft.w.a.b && ((net.minecraft.w.a.b)n2.j()).J.d;
            if (bl2 || this.t() > 40.0f) {
                this.ct();
                if (bl2 && !this.bO_()) {
                    this.aa();
                } else {
                    this.a(n2);
                }
            }
            return true;
        }
        return true;
    }

    public void a(net.minecraft.u.n n2) {
        this.aa();
        if (this.aQ.G().b("doEntityDrops")) {
            cu cu2 = new cu(net.minecraft.a.w.aB, 1);
            if (this.X() != null) {
                cu2.a(this.X());
            }
            this.a(cu2, 0.0f);
        }
    }

    @Override
    public void bs() {
        this.e(-this.w());
        this.d(10);
        this.a(this.t() + this.t() * 10.0f);
    }

    @Override
    public boolean cg_() {
        return !this.bk;
    }

    @Override
    public void aa() {
        super.aa();
    }

    @Override
    public ad cR() {
        return this.g ? this.cl_().e().f() : this.cl_().f();
    }

    @Override
    public void cE_() {
        int n2;
        int n3;
        if (this.v() > 0) {
            this.d(this.v() - 1);
        }
        if (this.t() > 0.0f) {
            this.a(this.t() - 1.0f);
        }
        if (this.aV < -64.0) {
            this.by();
        }
        if (!this.aQ.C && this.aQ instanceof v) {
            this.aQ.A.a("portal");
            a a2 = this.aQ.l();
            n3 = this.O();
            if (this.bQ) {
                if (a2.O()) {
                    if (!this.cz() && this.bR++ >= n3) {
                        this.bR = n3;
                        this.bP = this.R();
                        n2 = this.aQ.q.a().a() == -1 ? 0 : -1;
                        this.h_(n2);
                    }
                    this.bQ = false;
                }
            } else {
                if (this.bR > 0) {
                    this.bR -= 4;
                }
                if (this.bR < 0) {
                    this.bR = 0;
                }
            }
            if (this.bP > 0) {
                --this.bP;
            }
            this.aQ.A.b();
        }
        if (this.aQ.C) {
            if (this.i > 0) {
                double d2 = this.aU + (this.j - this.aU) / (double)this.i;
                double d3 = this.aV + (this.k - this.aV) / (double)this.i;
                double d4 = this.aW + (this.l - this.aW) / (double)this.i;
                double d5 = net.minecraft.u.b.n.g(this.m - (double)this.ba);
                this.ba = (float)((double)this.ba + d5 / (double)this.i);
                this.bb = (float)((double)this.bb + (this.n - (double)this.bb) / (double)this.i);
                --this.i;
                this.e(d2, d3, d4);
                this.e(this.ba, this.bb);
            } else {
                this.e(this.aU, this.aV, this.aW);
                this.e(this.ba, this.bb);
            }
        } else {
            double d6;
            net.minecraft.u.b.b b2;
            b b3;
            int n4;
            this.aR = this.aU;
            this.aS = this.aV;
            this.aT = this.aW;
            if (!this.ci()) {
                this.aY -= (double)0.04f;
            }
            if (dj.c(this.aQ, new net.minecraft.u.b.b(n4 = net.minecraft.u.b.n.c(this.aU), (n3 = net.minecraft.u.b.n.c(this.aV)) - 1, n2 = net.minecraft.u.b.n.c(this.aW)))) {
                --n3;
            }
            if (dj.l(b3 = this.aQ.n(b2 = new net.minecraft.u.b.b(n4, n3, n2)))) {
                this.a(b2, b3);
                if (b3.c() == net.minecraft.a.p.cs) {
                    this.a(n4, n3, n2, (boolean)((Boolean)b3.a(di.b)));
                }
            } else {
                this.p();
            }
            this.cg();
            this.bb = 0.0f;
            double d7 = this.aR - this.aU;
            double d8 = this.aT - this.aW;
            if (d7 * d7 + d8 * d8 > 0.001) {
                this.ba = (float)(net.minecraft.u.b.n.b(d8, d7) * 180.0 / Math.PI);
                if (this.g) {
                    this.ba += 180.0f;
                }
            }
            if ((d6 = (double)net.minecraft.u.b.n.g(this.ba - this.bc)) < -170.0 || d6 >= 170.0) {
                this.ba += 180.0f;
                this.g = !this.g;
            }
            this.e(this.ba, this.bb);
            if (this.a() == net.minecraft.w.f.m.a && this.aX * this.aX + this.aZ * this.aZ > 0.01) {
                List list = this.aQ.a((n)this, this.cT().b((double)0.2f, 0.0, 0.2f), net.minecraft.u.r.a(this));
                if (!list.isEmpty()) {
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        n n5 = (n)list.get(i2);
                        if (!(n5 instanceof net.minecraft.w.a.b || n5 instanceof bj || n5 instanceof f || this.cA() || n5.cz())) {
                            n5.r(this);
                            continue;
                        }
                        n5.d(this);
                    }
                }
            } else {
                for (n n6 : this.aQ.b((n)this, this.cT().b((double)0.2f, 0.0, 0.2f))) {
                    if (this.A(n6) || !n6.bM() || !(n6 instanceof f)) continue;
                    n6.d(this);
                }
            }
            this.cn();
        }
    }

    protected double l() {
        return 0.4;
    }

    public void a(int n2, int n3, int n4, boolean bl2) {
    }

    protected void p() {
        double d2 = this.l();
        this.aX = net.minecraft.u.b.n.a(this.aX, -d2, d2);
        this.aZ = net.minecraft.u.b.n.a(this.aZ, -d2, d2);
        if (this.be) {
            this.aX *= 0.5;
            this.aY *= 0.5;
            this.aZ *= 0.5;
        }
        this.b(this.aX, this.aY, this.aZ);
        if (!this.be) {
            this.aX *= (double)0.95f;
            this.aY *= (double)0.95f;
            this.aZ *= (double)0.95f;
        }
    }

    protected void a(net.minecraft.u.b.b b2, b b3) {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        n n2;
        double d9;
        this.bq = 0.0f;
        net.minecraft.u.b.s s2 = this.f(this.aU, this.aV, this.aW);
        this.aV = b2.k();
        boolean bl2 = false;
        boolean bl3 = false;
        dj dj2 = (dj)b3.c();
        if (dj2 == net.minecraft.a.p.D) {
            bl2 = (Boolean)b3.a(di.b);
            bl3 = !bl2;
        }
        double d10 = 0.0078125;
        by by2 = (by)((Object)b3.a(dj2.h()));
        switch (by2) {
            case c: {
                this.aX -= 0.0078125;
                this.aV += 1.0;
                break;
            }
            case d: {
                this.aX += 0.0078125;
                this.aV += 1.0;
                break;
            }
            case e: {
                this.aZ += 0.0078125;
                this.aV += 1.0;
                break;
            }
            case f: {
                this.aZ -= 0.0078125;
                this.aV += 1.0;
            }
        }
        int[][] arrn = h[by2.b()];
        double d11 = arrn[1][0] - arrn[0][0];
        double d12 = arrn[1][2] - arrn[0][2];
        double d13 = Math.sqrt(d11 * d11 + d12 * d12);
        double d14 = this.aX * d11 + this.aZ * d12;
        if (d14 < 0.0) {
            d11 = -d11;
            d12 = -d12;
        }
        if ((d9 = Math.sqrt(this.aX * this.aX + this.aZ * this.aZ)) > 2.0) {
            d9 = 2.0;
        }
        this.aX = d9 * d11 / d13;
        this.aZ = d9 * d12 / d13;
        n n3 = n2 = this.db().isEmpty() ? null : (n)this.db().get(0);
        if (n2 instanceof l && (d8 = (double)((l)n2).aC) > 0.0) {
            d7 = -Math.sin(n2.ba * ((float)Math.PI / 180));
            d6 = Math.cos(n2.ba * ((float)Math.PI / 180));
            d5 = this.aX * this.aX + this.aZ * this.aZ;
            if (d5 < 0.01) {
                this.aX += d7 * 0.1;
                this.aZ += d6 * 0.1;
                bl3 = false;
            }
        }
        if (bl3) {
            d8 = Math.sqrt(this.aX * this.aX + this.aZ * this.aZ);
            if (d8 < 0.03) {
                this.aX *= 0.0;
                this.aY *= 0.0;
                this.aZ *= 0.0;
            } else {
                this.aX *= 0.5;
                this.aY *= 0.0;
                this.aZ *= 0.5;
            }
        }
        d8 = (double)b2.cy_() + 0.5 + (double)arrn[0][0] * 0.5;
        d7 = (double)b2.l() + 0.5 + (double)arrn[0][2] * 0.5;
        d6 = (double)b2.cy_() + 0.5 + (double)arrn[1][0] * 0.5;
        d5 = (double)b2.l() + 0.5 + (double)arrn[1][2] * 0.5;
        d11 = d6 - d8;
        d12 = d5 - d7;
        if (d11 == 0.0) {
            this.aU = (double)b2.cy_() + 0.5;
            d4 = this.aW - (double)b2.l();
        } else if (d12 == 0.0) {
            this.aW = (double)b2.l() + 0.5;
            d4 = this.aU - (double)b2.cy_();
        } else {
            d3 = this.aU - d8;
            d2 = this.aW - d7;
            d4 = (d3 * d11 + d2 * d12) * 2.0;
        }
        this.aU = d8 + d11 * d4;
        this.aW = d7 + d12 * d4;
        this.e(this.aU, this.aV, this.aW);
        d3 = this.aX;
        d2 = this.aZ;
        if (this.cA()) {
            d3 *= 0.75;
            d2 *= 0.75;
        }
        double d15 = this.l();
        d3 = net.minecraft.u.b.n.a(d3, -d15, d15);
        d2 = net.minecraft.u.b.n.a(d2, -d15, d15);
        this.b(d3, 0.0, d2);
        if (arrn[0][1] != 0 && net.minecraft.u.b.n.c(this.aU) - b2.cy_() == arrn[0][0] && net.minecraft.u.b.n.c(this.aW) - b2.l() == arrn[0][2]) {
            this.e(this.aU, this.aV + (double)arrn[0][1], this.aW);
        } else if (arrn[1][1] != 0 && net.minecraft.u.b.n.c(this.aU) - b2.cy_() == arrn[1][0] && net.minecraft.u.b.n.c(this.aW) - b2.l() == arrn[1][2]) {
            this.e(this.aU, this.aV + (double)arrn[1][1], this.aW);
        }
        this.s();
        net.minecraft.u.b.s s3 = this.f(this.aU, this.aV, this.aW);
        if (s3 != null && s2 != null) {
            double d16 = (s2.c - s3.c) * 0.05;
            d9 = Math.sqrt(this.aX * this.aX + this.aZ * this.aZ);
            if (d9 > 0.0) {
                this.aX = this.aX / d9 * (d9 + d16);
                this.aZ = this.aZ / d9 * (d9 + d16);
            }
            this.e(this.aU, s3.c, this.aW);
        }
        int n4 = net.minecraft.u.b.n.c(this.aU);
        int n5 = net.minecraft.u.b.n.c(this.aW);
        if (n4 != b2.cy_() || n5 != b2.l()) {
            d9 = Math.sqrt(this.aX * this.aX + this.aZ * this.aZ);
            this.aX = d9 * (double)(n4 - b2.cy_());
            this.aZ = d9 * (double)(n5 - b2.l());
        }
        if (bl2) {
            double d17 = Math.sqrt(this.aX * this.aX + this.aZ * this.aZ);
            if (d17 > 0.01) {
                double d18 = 0.06;
                this.aX += this.aX / d17 * 0.06;
                this.aZ += this.aZ / d17 * 0.06;
            } else if (by2 == net.minecraft.g.by.b) {
                if (this.aQ.n(b2.f()).o()) {
                    this.aX = 0.02;
                } else if (this.aQ.n(b2.g()).o()) {
                    this.aX = -0.02;
                }
            } else if (by2 == net.minecraft.g.by.a) {
                if (this.aQ.n(b2.d()).o()) {
                    this.aZ = 0.02;
                } else if (this.aQ.n(b2.e()).o()) {
                    this.aZ = -0.02;
                }
            }
        }
    }

    protected void s() {
        if (this.cA()) {
            this.aX *= (double)0.997f;
            this.aY *= 0.0;
            this.aZ *= (double)0.997f;
        } else {
            this.aX *= (double)0.96f;
            this.aY *= 0.0;
            this.aZ *= (double)0.96f;
        }
    }

    @Override
    public void e(double d2, double d3, double d4) {
        this.aU = d2;
        this.aV = d3;
        this.aW = d4;
        float f2 = this.bl / 2.0f;
        float f3 = this.bm;
        this.a(new net.minecraft.u.b.a(d2 - (double)f2, d3, d4 - (double)f2, d2 + (double)f2, d3 + (double)f3, d4 + (double)f2));
    }

    public net.minecraft.u.b.s a(double d2, double d3, double d4, double d5) {
        b b2;
        int n2;
        int n3;
        int n4 = net.minecraft.u.b.n.c(d2);
        if (dj.c(this.aQ, new net.minecraft.u.b.b(n4, (n3 = net.minecraft.u.b.n.c(d3)) - 1, n2 = net.minecraft.u.b.n.c(d4)))) {
            --n3;
        }
        if (dj.l(b2 = this.aQ.n(new net.minecraft.u.b.b(n4, n3, n2)))) {
            by by2 = (by)((Object)b2.a(((dj)b2.c()).h()));
            d3 = n3;
            if (by2.c()) {
                d3 = n3 + 1;
            }
            int[][] arrn = h[by2.b()];
            double d6 = arrn[1][0] - arrn[0][0];
            double d7 = arrn[1][2] - arrn[0][2];
            double d8 = Math.sqrt(d6 * d6 + d7 * d7);
            if (arrn[0][1] != 0 && net.minecraft.u.b.n.c(d2 += (d6 /= d8) * d5) - n4 == arrn[0][0] && net.minecraft.u.b.n.c(d4 += (d7 /= d8) * d5) - n2 == arrn[0][2]) {
                d3 += (double)arrn[0][1];
            } else if (arrn[1][1] != 0 && net.minecraft.u.b.n.c(d2) - n4 == arrn[1][0] && net.minecraft.u.b.n.c(d4) - n2 == arrn[1][2]) {
                d3 += (double)arrn[1][1];
            }
            return this.f(d2, d3, d4);
        }
        return null;
    }

    public net.minecraft.u.b.s f(double d2, double d3, double d4) {
        b b2;
        int n2;
        int n3;
        int n4 = net.minecraft.u.b.n.c(d2);
        if (dj.c(this.aQ, new net.minecraft.u.b.b(n4, (n3 = net.minecraft.u.b.n.c(d3)) - 1, n2 = net.minecraft.u.b.n.c(d4)))) {
            --n3;
        }
        if (dj.l(b2 = this.aQ.n(new net.minecraft.u.b.b(n4, n3, n2)))) {
            double d5;
            by by2 = (by)((Object)b2.a(((dj)b2.c()).h()));
            int[][] arrn = h[by2.b()];
            double d6 = (double)n4 + 0.5 + (double)arrn[0][0] * 0.5;
            double d7 = (double)n3 + 0.0625 + (double)arrn[0][1] * 0.5;
            double d8 = (double)n2 + 0.5 + (double)arrn[0][2] * 0.5;
            double d9 = (double)n4 + 0.5 + (double)arrn[1][0] * 0.5;
            double d10 = (double)n3 + 0.0625 + (double)arrn[1][1] * 0.5;
            double d11 = (double)n2 + 0.5 + (double)arrn[1][2] * 0.5;
            double d12 = d9 - d6;
            double d13 = (d10 - d7) * 2.0;
            double d14 = d11 - d8;
            if (d12 == 0.0) {
                d5 = d4 - (double)n2;
            } else if (d14 == 0.0) {
                d5 = d2 - (double)n4;
            } else {
                double d15 = d2 - d6;
                double d16 = d4 - d8;
                d5 = (d15 * d12 + d16 * d14) * 2.0;
            }
            d2 = d6 + d12 * d5;
            d3 = d7 + d13 * d5;
            d4 = d8 + d14 * d5;
            if (d13 < 0.0) {
                d3 += 1.0;
            }
            if (d13 > 0.0) {
                d3 += 0.5;
            }
            return new net.minecraft.u.b.s(d2, d3, d4);
        }
        return null;
    }

    @Override
    public net.minecraft.u.b.a cU() {
        net.minecraft.u.b.a a2 = this.cT();
        return this.z() ? a2.b((double)Math.abs(this.y()) / 16.0) : a2;
    }

    public static void a(net.minecraft.u.a.a a2, String string) {
    }

    @Override
    protected void b(e e2) {
        if (e2.p("CustomDisplayTile")) {
            cn cn2 = e2.b("DisplayTile", 8) ? cn.a(e2.l("DisplayTile")) : cn.d(e2.h("DisplayTile"));
            int n2 = e2.h("DisplayData");
            this.a(cn2 == null ? net.minecraft.a.p.a.v() : cn2.a(n2));
            this.f(e2.h("DisplayOffset"));
        }
    }

    @Override
    protected void a(e e2) {
        if (this.z()) {
            e2.a("CustomDisplayTile", true);
            b b2 = this.x();
            bp bp2 = (bp)cn.v.b(b2.c());
            e2.a("DisplayTile", bp2 == null ? "" : bp2.toString());
            e2.a("DisplayData", b2.c().b(b2));
            e2.a("DisplayOffset", this.y());
        }
    }

    @Override
    public void d(n n2) {
        double d2;
        double d3;
        double d4;
        if (!(this.aQ.C || n2.bv || this.bv || this.A(n2) || !((d4 = (d3 = n2.aU - this.aU) * d3 + (d2 = n2.aW - this.aW) * d2) >= (double)1.0E-4f))) {
            d4 = net.minecraft.u.b.n.a(d4);
            d3 /= d4;
            d2 /= d4;
            double d5 = 1.0 / d4;
            if (d5 > 1.0) {
                d5 = 1.0;
            }
            d3 *= d5;
            d2 *= d5;
            d3 *= (double)0.1f;
            d2 *= (double)0.1f;
            d3 *= (double)(1.0f - this.bw);
            d2 *= (double)(1.0f - this.bw);
            d3 *= 0.5;
            d2 *= 0.5;
            if (n2 instanceof f) {
                net.minecraft.u.b.s s2;
                double d6 = n2.aU - this.aU;
                double d7 = n2.aW - this.aW;
                net.minecraft.u.b.s s3 = new net.minecraft.u.b.s(d6, 0.0, d7).a();
                double d8 = Math.abs(s3.b(s2 = new net.minecraft.u.b.s(net.minecraft.u.b.n.b(this.ba * ((float)Math.PI / 180)), 0.0, net.minecraft.u.b.n.a(this.ba * ((float)Math.PI / 180))).a()));
                if (d8 < (double)0.8f) {
                    return;
                }
                double d9 = n2.aX + this.aX;
                double d10 = n2.aZ + this.aZ;
                if (((f)n2).a() == net.minecraft.w.f.m.c && this.a() != net.minecraft.w.f.m.c) {
                    this.aX *= (double)0.2f;
                    this.aZ *= (double)0.2f;
                    this.a_(n2.aX - d3, 0.0, n2.aZ - d2);
                    n2.aX *= (double)0.95f;
                    n2.aZ *= (double)0.95f;
                } else if (((f)n2).a() != net.minecraft.w.f.m.c && this.a() == net.minecraft.w.f.m.c) {
                    n2.aX *= (double)0.2f;
                    n2.aZ *= (double)0.2f;
                    n2.a_(this.aX + d3, 0.0, this.aZ + d2);
                    this.aX *= (double)0.95f;
                    this.aZ *= (double)0.95f;
                } else {
                    this.aX *= (double)0.2f;
                    this.aZ *= (double)0.2f;
                    this.a_((d9 /= 2.0) - d3, 0.0, (d10 /= 2.0) - d2);
                    n2.aX *= (double)0.2f;
                    n2.aZ *= (double)0.2f;
                    n2.a_(d9 + d3, 0.0, d10 + d2);
                }
            } else {
                this.a_(-d3, 0.0, -d2);
                n2.a_(d3 / 4.0, 0.0, d2 / 4.0);
            }
        }
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.j = d2;
        this.k = d3;
        this.l = d4;
        this.m = f2;
        this.n = f3;
        this.i = n2 + 2;
        this.aX = this.o;
        this.aY = this.p;
        this.aZ = this.q;
    }

    @Override
    public void k(double d2, double d3, double d4) {
        this.aX = d2;
        this.aY = d3;
        this.aZ = d4;
        this.o = this.aX;
        this.p = this.aY;
        this.q = this.aZ;
    }

    public void a(float f2) {
        this.bE.b(c, Float.valueOf(f2));
    }

    public float t() {
        return ((Float)this.bE.a(c)).floatValue();
    }

    public void d(int n2) {
        this.bE.b(a, n2);
    }

    public int v() {
        return (Integer)this.bE.a(a);
    }

    public void e(int n2) {
        this.bE.b(b, n2);
    }

    public int w() {
        return (Integer)this.bE.a(b);
    }

    public abstract m a();

    public b x() {
        return !this.z() ? this.c() : cn.e((Integer)this.cc().a(d));
    }

    public b c() {
        return net.minecraft.a.p.a.v();
    }

    public int y() {
        return !this.z() ? this.cC_() : ((Integer)this.cc().a(e)).intValue();
    }

    public int cC_() {
        return 6;
    }

    public void a(b b2) {
        this.cc().b(d, cn.p(b2));
        this.a(true);
    }

    public void f(int n2) {
        this.cc().b(e, n2);
        this.a(true);
    }

    public boolean z() {
        return (Boolean)this.cc().a(f);
    }

    public void a(boolean bl2) {
        this.cc().b(f, bl2);
    }
}

