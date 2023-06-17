/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.d;

import java.util.List;
import net.minecraft.g.a.h;
import net.minecraft.g.cn;
import net.minecraft.i.g;
import net.minecraft.i.k;
import net.minecraft.q.g.a.am;
import net.minecraft.q.m;
import net.minecraft.u.aj;
import net.minecraft.u.b.s;
import net.minecraft.u.bu;
import net.minecraft.u.bv;
import net.minecraft.u.p;
import net.minecraft.w.d;
import net.minecraft.w.d.a.a.e;
import net.minecraft.w.d.a.a.i;
import net.minecraft.w.d.a.a.j;
import net.minecraft.w.d.b;
import net.minecraft.w.e.aw;
import net.minecraft.w.f;
import net.minecraft.w.f.ad;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;
import org.apache.logging.log4j.c;

public class a
extends f
implements net.minecraft.w.e,
aw {
    private static final org.apache.logging.log4j.d A = org.apache.logging.log4j.c.c();
    public static final net.minecraft.x.a.g a = net.minecraft.x.a.o.a(a.class, net.minecraft.x.a.q.b);
    public double[][] b = new double[64][3];
    public int c = -1;
    public b[] d;
    public b e = new b(this, "head", 6.0f, 6.0f);
    public b f = new b(this, "neck", 6.0f, 6.0f);
    public b g = new b(this, "body", 8.0f, 8.0f);
    public b h = new b(this, "tail", 4.0f, 4.0f);
    public b i = new b(this, "tail", 4.0f, 4.0f);
    public b s = new b(this, "tail", 4.0f, 4.0f);
    public b t = new b(this, "wing", 4.0f, 4.0f);
    public b u = new b(this, "wing", 4.0f, 4.0f);
    public float v;
    public float w;
    public boolean x;
    public int y;
    public ad z;
    private final net.minecraft.q.d.b B;
    private final i C;
    private int D = 200;
    private int E;
    private final g[] F = new g[24];
    private final int[] G = new int[24];
    private final k H = new k();

    public a(net.minecraft.q.k k2) {
        super(k2);
        this.d = new b[]{this.e, this.f, this.g, this.h, this.i, this.s, this.t, this.u};
        this.h(this.bw());
        this.d(16.0f, 8.0f);
        this.bv = true;
        this.bD = true;
        this.D = 100;
        this.bN = true;
        this.B = !k2.C && k2.q instanceof m ? ((m)k2.q).s() : null;
        this.C = new i(this);
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.a).a(200.0);
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.cc().a(a, net.minecraft.w.d.a.a.j.k.b());
    }

    public double[] a(int n2, float f2) {
        if (this.bo() <= 0.0f) {
            f2 = 0.0f;
        }
        f2 = 1.0f - f2;
        int n3 = this.c - n2 & 0x3F;
        int n4 = this.c - n2 - 1 & 0x3F;
        double[] arrd = new double[3];
        double d2 = this.b[n3][0];
        double d3 = net.minecraft.u.b.n.g(this.b[n4][0] - d2);
        arrd[0] = d2 + d3 * (double)f2;
        d2 = this.b[n3][1];
        d3 = this.b[n4][1] - d2;
        arrd[1] = d2 + d3 * (double)f2;
        arrd[2] = this.b[n3][2] + (this.b[n4][2] - this.b[n3][2]) * (double)f2;
        return arrd;
    }

    @Override
    public void n() {
        float f2;
        float f3;
        if (this.aQ.C) {
            this.h(this.bo());
            if (!this.ch()) {
                f3 = net.minecraft.u.b.n.b(this.w * ((float)Math.PI * 2));
                f2 = net.minecraft.u.b.n.b(this.v * ((float)Math.PI * 2));
                if (f2 <= -0.3f && f3 >= -0.3f) {
                    this.aQ.a(this.aU, this.aV, this.aW, net.minecraft.a.f.aR, this.S(), 5.0f, 0.8f + this.bx.nextFloat() * 0.3f, false);
                }
                if (!this.C.a().h() && --this.D < 0) {
                    this.aQ.a(this.aU, this.aV, this.aW, net.minecraft.a.f.aS, this.S(), 2.5f, 0.8f + this.bx.nextFloat() * 0.3f, false);
                    this.D = 200 + this.bx.nextInt(200);
                }
            }
        }
        this.v = this.w;
        if (this.bo() <= 0.0f) {
            f3 = (this.bx.nextFloat() - 0.5f) * 8.0f;
            f2 = (this.bx.nextFloat() - 0.5f) * 4.0f;
            float f4 = (this.bx.nextFloat() - 0.5f) * 8.0f;
            this.aQ.a(net.minecraft.u.aj.b, this.aU + (double)f3, this.aV + 2.0 + (double)f2, this.aW + (double)f4, 0.0, 0.0, 0.0, new int[0]);
        } else {
            this.r();
            f3 = 0.2f / (net.minecraft.u.b.n.a(this.aX * this.aX + this.aZ * this.aZ) * 10.0f + 1.0f);
            this.w = this.C.a().h() ? (this.w += 0.1f) : (this.x ? (this.w += f3 * 0.5f) : (this.w += (f3 *= (float)Math.pow(2.0, this.aY))));
            this.ba = net.minecraft.u.b.n.g(this.ba);
            if (this.aT()) {
                this.w = 0.5f;
            } else {
                float f5;
                float f6;
                float f7;
                double d2;
                double d3;
                double d4;
                if (this.c < 0) {
                    for (int i2 = 0; i2 < this.b.length; ++i2) {
                        this.b[i2][0] = this.ba;
                        this.b[i2][1] = this.aV;
                    }
                }
                if (++this.c == this.b.length) {
                    this.c = 0;
                }
                this.b[this.c][0] = this.ba;
                this.b[this.c][1] = this.aV;
                if (this.aQ.C) {
                    if (this.aE > 0) {
                        double d5 = this.aU + (this.aF - this.aU) / (double)this.aE;
                        d4 = this.aV + (this.aG - this.aV) / (double)this.aE;
                        d3 = this.aW + (this.aH - this.aW) / (double)this.aE;
                        d2 = net.minecraft.u.b.n.g(this.aI - (double)this.ba);
                        this.ba = (float)((double)this.ba + d2 / (double)this.aE);
                        this.bb = (float)((double)this.bb + (this.aJ - (double)this.bb) / (double)this.aE);
                        --this.aE;
                        this.e(d5, d4, d3);
                        this.e(this.ba, this.bb);
                    }
                    this.C.a().a();
                } else {
                    s s2;
                    e e2 = this.C.a();
                    e2.b();
                    if (this.C.a() != e2) {
                        e2 = this.C.a();
                        e2.b();
                    }
                    if ((s2 = e2.f()) != null) {
                        d4 = s2.b - this.aU;
                        d3 = s2.c - this.aV;
                        d2 = s2.d - this.aW;
                        double d6 = d4 * d4 + d3 * d3 + d2 * d2;
                        float f8 = e2.c();
                        d3 = net.minecraft.u.b.n.a(d3 / (double)net.minecraft.u.b.n.a(d4 * d4 + d2 * d2), (double)(-f8), (double)f8);
                        this.aY += d3 * (double)0.1f;
                        this.ba = net.minecraft.u.b.n.g(this.ba);
                        double d7 = net.minecraft.u.b.n.a(net.minecraft.u.b.n.g(180.0 - net.minecraft.u.b.n.b(d4, d2) * 57.29577951308232 - (double)this.ba), -50.0, 50.0);
                        s s3 = new s(s2.b - this.aU, s2.c - this.aV, s2.d - this.aW).a();
                        s s4 = new s(net.minecraft.u.b.n.a(this.ba * ((float)Math.PI / 180)), this.aY, -net.minecraft.u.b.n.b(this.ba * ((float)Math.PI / 180))).a();
                        f7 = Math.max(((float)s4.b(s3) + 0.5f) / 1.5f, 0.0f);
                        this.aD *= 0.8f;
                        this.aD = (float)((double)this.aD + d7 * (double)e2.d());
                        this.ba += this.aD * 0.1f;
                        f6 = (float)(2.0 / (d6 + 1.0));
                        f5 = 0.06f;
                        this.a(0.0f, -1.0f, 0.06f * (f7 * f6 + (1.0f - f6)), true);
                        if (this.x) {
                            this.b(this.aX * (double)0.8f, this.aY * (double)0.8f, this.aZ * (double)0.8f);
                        } else {
                            this.b(this.aX, this.aY, this.aZ);
                        }
                        s s5 = new s(this.aX, this.aY, this.aZ).a();
                        float f9 = ((float)s5.b(s4) + 1.0f) / 2.0f;
                        f9 = 0.8f + 0.15f * f9;
                        this.aX *= (double)f9;
                        this.aZ *= (double)f9;
                        this.aY *= (double)0.91f;
                    }
                }
                this.ak = this.ba;
                this.e.bl = 1.0f;
                this.e.bm = 1.0f;
                this.f.bl = 3.0f;
                this.f.bm = 3.0f;
                this.h.bl = 2.0f;
                this.h.bm = 2.0f;
                this.i.bl = 2.0f;
                this.i.bm = 2.0f;
                this.s.bl = 2.0f;
                this.s.bm = 2.0f;
                this.g.bm = 3.0f;
                this.g.bl = 5.0f;
                this.t.bm = 2.0f;
                this.t.bl = 4.0f;
                this.u.bm = 3.0f;
                this.u.bl = 4.0f;
                f2 = (float)(this.a(5, 1.0f)[1] - this.a(10, 1.0f)[1]) * 10.0f * ((float)Math.PI / 180);
                float f10 = net.minecraft.u.b.n.b(f2);
                float f11 = net.minecraft.u.b.n.a(f2);
                float f12 = this.ba * ((float)Math.PI / 180);
                float f13 = net.minecraft.u.b.n.a(f12);
                float f14 = net.minecraft.u.b.n.b(f12);
                this.g.cE_();
                this.g.b(this.aU + (double)(f13 * 0.5f), this.aV, this.aW - (double)(f14 * 0.5f), 0.0f, 0.0f);
                this.t.cE_();
                this.t.b(this.aU + (double)(f14 * 4.5f), this.aV + 2.0, this.aW + (double)(f13 * 4.5f), 0.0f, 0.0f);
                this.u.cE_();
                this.u.b(this.aU - (double)(f14 * 4.5f), this.aV + 2.0, this.aW - (double)(f13 * 4.5f), 0.0f, 0.0f);
                if (!this.aQ.C && this.V == 0) {
                    this.a(this.aQ.b((n)this, this.t.cT().b(4.0, 2.0, 4.0).c(0.0, -2.0, 0.0)));
                    this.a(this.aQ.b((n)this, this.u.cT().b(4.0, 2.0, 4.0).c(0.0, -2.0, 0.0)));
                    this.b(this.aQ.b((n)this, this.e.cT().b(1.0)));
                    this.b(this.aQ.b((n)this, this.f.cT().b(1.0)));
                }
                double[] arrd = this.a(5, 1.0f);
                float f15 = net.minecraft.u.b.n.a(this.ba * ((float)Math.PI / 180) - this.aD * 0.01f);
                float f16 = net.minecraft.u.b.n.b(this.ba * ((float)Math.PI / 180) - this.aD * 0.01f);
                this.e.cE_();
                this.f.cE_();
                float f17 = this.q(1.0f);
                this.e.b(this.aU + (double)(f15 * 6.5f * f10), this.aV + (double)f17 + (double)(f11 * 6.5f), this.aW - (double)(f16 * 6.5f * f10), 0.0f, 0.0f);
                this.f.b(this.aU + (double)(f15 * 5.5f * f10), this.aV + (double)f17 + (double)(f11 * 5.5f), this.aW - (double)(f16 * 5.5f * f10), 0.0f, 0.0f);
                for (int i3 = 0; i3 < 3; ++i3) {
                    b b2 = null;
                    if (i3 == 0) {
                        b2 = this.h;
                    }
                    if (i3 == 1) {
                        b2 = this.i;
                    }
                    if (i3 == 2) {
                        b2 = this.s;
                    }
                    double[] arrd2 = this.a(12 + i3 * 2, 1.0f);
                    float f18 = this.ba * ((float)Math.PI / 180) + this.c(arrd2[0] - arrd[0]) * ((float)Math.PI / 180);
                    float f19 = net.minecraft.u.b.n.a(f18);
                    f7 = net.minecraft.u.b.n.b(f18);
                    f6 = 1.5f;
                    f5 = (float)(i3 + 1) * 2.0f;
                    b2.cE_();
                    b2.b(this.aU - (double)((f13 * 1.5f + f19 * f5) * f10), this.aV + (arrd2[1] - arrd[1]) - (double)((f5 + 1.5f) * f11) + 1.5, this.aW + (double)((f14 * 1.5f + f7 * f5) * f10), 0.0f, 0.0f);
                }
                if (!this.aQ.C) {
                    this.x = this.b(this.e.cT()) | this.b(this.f.cT()) | this.b(this.g.cT());
                    if (this.B != null) {
                        this.B.b(this);
                    }
                }
            }
        }
    }

    private float q(float f2) {
        double d2;
        if (this.C.a().h()) {
            d2 = -1.0;
        } else {
            double[] arrd = this.a(5, 1.0f);
            double[] arrd2 = this.a(0, 1.0f);
            d2 = arrd[1] - arrd2[0];
        }
        return (float)d2;
    }

    private void r() {
        if (this.z != null) {
            if (this.z.bk) {
                this.z = null;
            } else if (this.by % 10 == 0 && this.bo() < this.bw()) {
                this.h(this.bo() + 1.0f);
            }
        }
        if (this.bx.nextInt(10) == 0) {
            List list = this.aQ.a(ad.class, this.cT().b(32.0));
            ad ad2 = null;
            double d2 = Double.MAX_VALUE;
            for (ad ad3 : list) {
                double d3 = ad3.n(this);
                if (!(d3 < d2)) continue;
                d2 = d3;
                ad2 = ad3;
            }
            this.z = ad2;
        }
    }

    private void a(List list) {
        double d2 = (this.g.cT().a + this.g.cT().d) / 2.0;
        double d3 = (this.g.cT().c + this.g.cT().f) / 2.0;
        for (n n2 : list) {
            if (!(n2 instanceof l)) continue;
            double d4 = n2.aU - d2;
            double d5 = n2.aW - d3;
            double d6 = d4 * d4 + d5 * d5;
            n2.a_(d4 / d6 * 4.0, 0.2f, d5 / d6 * 4.0);
            if (this.C.a().h() || ((l)n2).bf() >= n2.by - 2) continue;
            n2.a(net.minecraft.u.n.a(this), 5.0f);
            this.a(this, n2);
        }
    }

    private void b(List list) {
        for (int i2 = 0; i2 < list.size(); ++i2) {
            n n2 = (n)list.get(i2);
            if (!(n2 instanceof l)) continue;
            n2.a(net.minecraft.u.n.a(this), 10.0f);
            this.a(this, n2);
        }
    }

    private float c(double d2) {
        return (float)net.minecraft.u.b.n.g(d2);
    }

    private boolean b(net.minecraft.u.b.a a2) {
        int n2 = net.minecraft.u.b.n.c(a2.a);
        int n3 = net.minecraft.u.b.n.c(a2.b);
        int n4 = net.minecraft.u.b.n.c(a2.c);
        int n5 = net.minecraft.u.b.n.c(a2.d);
        int n6 = net.minecraft.u.b.n.c(a2.e);
        int n7 = net.minecraft.u.b.n.c(a2.f);
        boolean bl2 = false;
        boolean bl3 = false;
        for (int i2 = n2; i2 <= n5; ++i2) {
            for (int i3 = n3; i3 <= n6; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(i2, i3, i4);
                    net.minecraft.g.c.b b3 = this.aQ.n(b2);
                    cn cn2 = b3.c();
                    if (b3.d() == net.minecraft.g.a.h.a || b3.d() == net.minecraft.g.a.h.o) continue;
                    if (!this.aQ.G().b("mobGriefing")) {
                        bl2 = true;
                        continue;
                    }
                    if (cn2 != net.minecraft.a.p.cv && cn2 != net.minecraft.a.p.Z && cn2 != net.minecraft.a.p.bH && cn2 != net.minecraft.a.p.h && cn2 != net.minecraft.a.p.bF && cn2 != net.minecraft.a.p.bG) {
                        if (cn2 != net.minecraft.a.p.bX && cn2 != net.minecraft.a.p.dc && cn2 != net.minecraft.a.p.dd && cn2 != net.minecraft.a.p.bi && cn2 != net.minecraft.a.p.db) {
                            bl3 = this.aQ.f(b2) || bl3;
                            continue;
                        }
                        bl2 = true;
                        continue;
                    }
                    bl2 = true;
                }
            }
        }
        if (bl3) {
            double d2 = a2.a + (a2.d - a2.a) * (double)this.bx.nextFloat();
            double d3 = a2.b + (a2.e - a2.b) * (double)this.bx.nextFloat();
            double d4 = a2.c + (a2.f - a2.c) * (double)this.bx.nextFloat();
            this.aQ.a(net.minecraft.u.aj.b, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
        }
        return bl2;
    }

    @Override
    public boolean a(b b2, net.minecraft.u.n n2, float f2) {
        f2 = this.C.a().a(b2, n2, f2);
        if (b2 != this.e) {
            f2 = f2 / 4.0f + Math.min(f2, 1.0f);
        }
        if (f2 < 0.01f) {
            return false;
        }
        if (n2.j() instanceof net.minecraft.w.a.b || n2.c()) {
            float f3 = this.bo();
            this.e(n2, f2);
            if (this.bo() <= 0.0f && !this.C.a().h()) {
                this.h(1.0f);
                this.C.a(net.minecraft.w.d.a.a.j.j);
            }
            if (this.C.a().h()) {
                this.E = (int)((float)this.E + (f3 - this.bo()));
                if ((float)this.E > 0.25f * this.bw()) {
                    this.E = 0;
                    this.C.a(net.minecraft.w.d.a.a.j.e);
                }
            }
        }
        return true;
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (n2 instanceof p && ((p)n2).x()) {
            this.a(this.g, n2, f2);
        }
        return false;
    }

    protected boolean e(net.minecraft.u.n n2, float f2) {
        return super.a(n2, f2);
    }

    @Override
    public void aY() {
        this.aa();
        if (this.B != null) {
            this.B.b(this);
            this.B.a(this);
        }
    }

    @Override
    protected void bb() {
        if (this.B != null) {
            this.B.b(this);
        }
        ++this.y;
        if (this.y >= 180 && this.y <= 200) {
            float f2 = (this.bx.nextFloat() - 0.5f) * 8.0f;
            float f3 = (this.bx.nextFloat() - 0.5f) * 4.0f;
            float f4 = (this.bx.nextFloat() - 0.5f) * 8.0f;
            this.aQ.a(net.minecraft.u.aj.c, this.aU + (double)f2, this.aV + 2.0 + (double)f3, this.aW + (double)f4, 0.0, 0.0, 0.0, new int[0]);
        }
        boolean bl2 = this.aQ.G().b("doMobLoot");
        int n2 = 500;
        if (this.B != null && !this.B.d()) {
            n2 = 12000;
        }
        if (!this.aQ.C) {
            if (this.y > 150 && this.y % 5 == 0 && bl2) {
                this.b(net.minecraft.u.b.n.d((float)n2 * 0.08f));
            }
            if (this.y == 1) {
                this.aQ.a(1028, new net.minecraft.u.b.b(this), 0);
            }
        }
        this.b(0.0, 0.1f, 0.0);
        this.ba += 20.0f;
        this.ak = this.ba;
        if (this.y == 200 && !this.aQ.C) {
            if (bl2) {
                this.b(net.minecraft.u.b.n.d((float)n2 * 0.2f));
            }
            if (this.B != null) {
                this.B.a(this);
            }
            this.aa();
        }
    }

    private void b(int n2) {
        while (n2 > 0) {
            int n3 = net.minecraft.w.f.e.b(n2);
            n2 -= n3;
            this.aQ.a(new net.minecraft.w.f.e(this.aQ, this.aU, this.aV, this.aW, n3));
        }
    }

    public int c() {
        if (this.F[0] == null) {
            for (int i2 = 0; i2 < 24; ++i2) {
                int n2;
                int n3;
                int n4;
                int n5 = 5;
                if (i2 < 12) {
                    n4 = (int)(60.0f * net.minecraft.u.b.n.b(2.0f * ((float)(-Math.PI) + 0.2617994f * (float)i2)));
                    n3 = (int)(60.0f * net.minecraft.u.b.n.a(2.0f * ((float)(-Math.PI) + 0.2617994f * (float)i2)));
                } else if (i2 < 20) {
                    n2 = i2 - 12;
                    n4 = (int)(40.0f * net.minecraft.u.b.n.b(2.0f * ((float)(-Math.PI) + 0.3926991f * (float)n2)));
                    n3 = (int)(40.0f * net.minecraft.u.b.n.a(2.0f * ((float)(-Math.PI) + 0.3926991f * (float)n2)));
                    n5 += 10;
                } else {
                    n2 = i2 - 20;
                    n4 = (int)(20.0f * net.minecraft.u.b.n.b(2.0f * ((float)(-Math.PI) + 0.7853982f * (float)n2)));
                    n3 = (int)(20.0f * net.minecraft.u.b.n.a(2.0f * ((float)(-Math.PI) + 0.7853982f * (float)n2)));
                }
                n2 = Math.max(this.aQ.x() + 10, this.aQ.p(new net.minecraft.u.b.b(n4, 0, n3)).k() + n5);
                this.F[i2] = new g(n4, n2, n3);
            }
            this.G[0] = 6146;
            this.G[1] = 8197;
            this.G[2] = 8202;
            this.G[3] = 16404;
            this.G[4] = 32808;
            this.G[5] = 32848;
            this.G[6] = 65696;
            this.G[7] = 131392;
            this.G[8] = 131712;
            this.G[9] = 263424;
            this.G[10] = 526848;
            this.G[11] = 525313;
            this.G[12] = 1581057;
            this.G[13] = 3166214;
            this.G[14] = 2138120;
            this.G[15] = 6373424;
            this.G[16] = 4358208;
            this.G[17] = 12910976;
            this.G[18] = 9044480;
            this.G[19] = 9706496;
            this.G[20] = 15216640;
            this.G[21] = 0xD0E000;
            this.G[22] = 11763712;
            this.G[23] = 0x7E0000;
        }
        return this.l(this.aU, this.aV, this.aW);
    }

    public int l(double d2, double d3, double d4) {
        float f2 = 10000.0f;
        int n2 = 0;
        g g2 = new g(net.minecraft.u.b.n.c(d2), net.minecraft.u.b.n.c(d3), net.minecraft.u.b.n.c(d4));
        int n3 = 0;
        if (this.B == null || this.B.c() == 0) {
            n3 = 12;
        }
        for (int i2 = n3; i2 < 24; ++i2) {
            float f3;
            if (this.F[i2] == null || !((f3 = this.F[i2].b(g2)) < f2)) continue;
            f2 = f3;
            n2 = i2;
        }
        return n2;
    }

    public net.minecraft.i.i a(int n2, int n3, g g2) {
        g g3;
        for (int i2 = 0; i2 < 24; ++i2) {
            g3 = this.F[i2];
            g3.i = false;
            g3.g = 0.0f;
            g3.e = 0.0f;
            g3.f = 0.0f;
            g3.h = null;
            g3.d = -1;
        }
        g g4 = this.F[n2];
        g3 = this.F[n3];
        g4.e = 0.0f;
        g4.g = g4.f = g4.a(g3);
        this.H.a();
        this.H.a(g4);
        g g5 = g4;
        int n4 = 0;
        if (this.B == null || this.B.c() == 0) {
            n4 = 12;
        }
        while (!this.H.c()) {
            int n5;
            g g6 = this.H.b();
            if (g6.equals(g3)) {
                if (g2 != null) {
                    g2.h = g3;
                    g3 = g2;
                }
                return this.a(g4, g3);
            }
            if (g6.a(g3) < g5.a(g3)) {
                g5 = g6;
            }
            g6.i = true;
            int n6 = 0;
            for (n5 = 0; n5 < 24; ++n5) {
                if (this.F[n5] != g6) continue;
                n6 = n5;
                break;
            }
            for (n5 = n4; n5 < 24; ++n5) {
                if ((this.G[n6] & 1 << n5) <= 0) continue;
                g g7 = this.F[n5];
                if (g7.i) continue;
                float f2 = g6.e + g6.a(g7);
                if (g7.a() && !(f2 < g7.e)) continue;
                g7.h = g6;
                g7.e = f2;
                g7.f = g7.a(g3);
                if (g7.a()) {
                    this.H.a(g7, g7.e + g7.f);
                    continue;
                }
                g7.g = g7.e + g7.f;
                this.H.a(g7);
            }
        }
        if (g5 == g4) {
            return null;
        }
        A.a("Failed to find path from {} to {}", n2, n3);
        if (g2 != null) {
            g2.h = g5;
            g5 = g2;
        }
        return this.a(g4, g5);
    }

    private net.minecraft.i.i a(g g2, g arrg) {
        int n2 = 1;
        g[] arrg2 = arrg;
        while (arrg2.h != null) {
            ++n2;
            arrg2 = arrg2.h;
        }
        arrg2 = new g[n2];
        Object object = arrg;
        arrg2[--n2] = arrg;
        while (object.h != null) {
            object = object.h;
            arrg2[--n2] = object;
        }
        return new net.minecraft.i.i(arrg2);
    }

    public static void a(net.minecraft.u.a.a a2) {
        net.minecraft.w.f.a(a2, "EnderDragon");
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("DragonPhase", this.C.a().g().b());
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        if (e2.e("DragonPhase")) {
            this.C.a(net.minecraft.w.d.a.a.j.a(e2.h("DragonPhase")));
        }
    }

    @Override
    protected void an() {
    }

    @Override
    public n[] cF() {
        return this.d;
    }

    @Override
    public boolean cg_() {
        return false;
    }

    @Override
    public net.minecraft.q.k a() {
        return this.aQ;
    }

    @Override
    public bu S() {
        return net.minecraft.u.bu.f;
    }

    @Override
    protected bv j() {
        return net.minecraft.a.f.aO;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.aT;
    }

    @Override
    protected float bE() {
        return 5.0f;
    }

    public float a(int n2, double[] arrd, double[] arrd2) {
        double d2;
        e e2 = this.C.a();
        j j2 = e2.g();
        if (j2 != net.minecraft.w.d.a.a.j.d && j2 != net.minecraft.w.d.a.a.j.e) {
            d2 = e2.h() ? (double)n2 : (n2 == 6 ? 0.0 : arrd2[1] - arrd[1]);
        } else {
            net.minecraft.u.b.b b2 = this.aQ.p(net.minecraft.q.g.a.am.a);
            float f2 = Math.max(net.minecraft.u.b.n.a(this.d(b2)) / 4.0f, 1.0f);
            d2 = (float)n2 / f2;
        }
        return (float)d2;
    }

    public s p(float f2) {
        s s2;
        e e2 = this.C.a();
        j j2 = e2.g();
        if (j2 != net.minecraft.w.d.a.a.j.d && j2 != net.minecraft.w.d.a.a.j.e) {
            if (e2.h()) {
                float f3 = this.bb;
                float f4 = 1.5f;
                this.bb = -45.0f;
                s2 = this.i(f2);
                this.bb = f3;
            } else {
                s2 = this.i(f2);
            }
        } else {
            net.minecraft.u.b.b b2 = this.aQ.p(net.minecraft.q.g.a.am.a);
            float f5 = Math.max(net.minecraft.u.b.n.a(this.d(b2)) / 4.0f, 1.0f);
            float f6 = 6.0f / f5;
            float f7 = this.bb;
            float f8 = 1.5f;
            this.bb = -f6 * 1.5f * 5.0f;
            s2 = this.i(f2);
            this.bb = f7;
        }
        return s2;
    }

    public void a(ad ad2, net.minecraft.u.b.b b2, net.minecraft.u.n n2) {
        net.minecraft.w.a.b b3 = n2.j() instanceof net.minecraft.w.a.b ? (net.minecraft.w.a.b)n2.j() : this.aQ.a(b2, 64.0, 64.0);
        if (ad2 == this.z) {
            this.a(this.e, net.minecraft.u.n.b(b3), 10.0f);
        }
        this.C.a().a(ad2, b2, n2, b3);
    }

    @Override
    public void a(net.minecraft.x.a.g g2) {
        if (a.equals(g2) && this.aQ.C) {
            this.C.a(net.minecraft.w.d.a.a.j.a((Integer)this.cc().a(a)));
        }
        super.a(g2);
    }

    public i p() {
        return this.C;
    }

    public net.minecraft.q.d.b q() {
        return this.B;
    }

    @Override
    public void c(net.minecraft.d.j j2) {
    }

    @Override
    protected boolean s(n n2) {
        return false;
    }

    @Override
    public boolean cH() {
        return false;
    }
}

