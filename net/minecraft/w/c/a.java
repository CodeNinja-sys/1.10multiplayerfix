/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.c;

import java.util.List;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.a.h;
import net.minecraft.g.cn;
import net.minecraft.m.cu;
import net.minecraft.o.f;
import net.minecraft.q.a.a.j;
import net.minecraft.q.a.a.r;
import net.minecraft.q.k;
import net.minecraft.q.v;
import net.minecraft.u.aj;
import net.minecraft.u.b.o;
import net.minecraft.u.b.s;
import net.minecraft.u.bp;
import net.minecraft.w.a.b;
import net.minecraft.w.f.ae;
import net.minecraft.w.f.e;
import net.minecraft.w.n;
import net.minecraft.x.a.g;
import net.minecraft.x.a.q;

public class a
extends n {
    private static final g c = net.minecraft.x.a.o.a(a.class, net.minecraft.x.a.q.b);
    private net.minecraft.u.b.b d = new net.minecraft.u.b.b(-1, -1, -1);
    private cn e;
    private boolean f;
    public b a;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private float l;
    private int m;
    private double n;
    private double o;
    private double p;
    private double q;
    private double r;
    private double s;
    private double t;
    private double u;
    public n b;

    public a(k k2) {
        super(k2);
        this.d(0.25f, 0.25f);
        this.bN = true;
    }

    public a(k k2, double d2, double d3, double d4, b b2) {
        this(k2);
        this.e(d2, d3, d4);
        this.bN = true;
        this.a = b2;
        b2.P = this;
    }

    public a(k k2, b b2) {
        super(k2);
        this.bN = true;
        this.a = b2;
        this.a.P = this;
        this.d(0.25f, 0.25f);
        this.b(b2.aU, b2.aV + (double)b2.ce_(), b2.aW, b2.ba, b2.bb);
        this.aU -= (double)(net.minecraft.u.b.n.b(this.ba * ((float)Math.PI / 180)) * 0.16f);
        this.aV -= (double)0.1f;
        this.aW -= (double)(net.minecraft.u.b.n.a(this.ba * ((float)Math.PI / 180)) * 0.16f);
        this.e(this.aU, this.aV, this.aW);
        float f2 = 0.4f;
        this.aX = -net.minecraft.u.b.n.a(this.ba * ((float)Math.PI / 180)) * net.minecraft.u.b.n.b(this.bb * ((float)Math.PI / 180)) * 0.4f;
        this.aZ = net.minecraft.u.b.n.b(this.ba * ((float)Math.PI / 180)) * net.minecraft.u.b.n.b(this.bb * ((float)Math.PI / 180)) * 0.4f;
        this.aY = -net.minecraft.u.b.n.a(this.bb * ((float)Math.PI / 180)) * 0.4f;
        this.c(this.aX, this.aY, this.aZ, 1.5f, 1.0f);
    }

    @Override
    protected void cb_() {
        this.cc().a(c, 0);
    }

    @Override
    public void a(g g2) {
        int n2;
        if (c.equals(g2) && (n2 = ((Integer)this.cc().a(c)).intValue()) > 0 && this.b != null) {
            this.b = null;
        }
        super.a(g2);
    }

    @Override
    public boolean a(double d2) {
        double d3 = this.cT().a() * 4.0;
        if (Double.isNaN(d3)) {
            d3 = 4.0;
        }
        return d2 < (d3 *= 64.0) * d3;
    }

    public void c(double d2, double d3, double d4, float f2, float f3) {
        float f4 = net.minecraft.u.b.n.a(d2 * d2 + d3 * d3 + d4 * d4);
        d2 /= (double)f4;
        d3 /= (double)f4;
        d4 /= (double)f4;
        d2 += this.bx.nextGaussian() * (double)0.0075f * (double)f3;
        d3 += this.bx.nextGaussian() * (double)0.0075f * (double)f3;
        d4 += this.bx.nextGaussian() * (double)0.0075f * (double)f3;
        this.aX = d2 *= (double)f2;
        this.aY = d3 *= (double)f2;
        this.aZ = d4 *= (double)f2;
        float f5 = net.minecraft.u.b.n.a(d2 * d2 + d4 * d4);
        this.ba = (float)(net.minecraft.u.b.n.b(d2, d4) * 57.29577951308232);
        this.bb = (float)(net.minecraft.u.b.n.b(d3, (double)f5) * 57.29577951308232);
        this.bc = this.ba;
        this.bd = this.bb;
        this.g = 0;
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.n = d2;
        this.o = d3;
        this.p = d4;
        this.q = f2;
        this.r = f3;
        this.m = n2;
        this.aX = this.s;
        this.aY = this.t;
        this.aZ = this.u;
    }

    @Override
    public void k(double d2, double d3, double d4) {
        this.aX = d2;
        this.aY = d3;
        this.aZ = d4;
        this.s = this.aX;
        this.t = this.aY;
        this.u = this.aZ;
    }

    @Override
    public void cE_() {
        super.cE_();
        if (this.aQ.C) {
            int n2 = (Integer)this.cc().a(c);
            if (n2 > 0 && this.b == null) {
                this.b = this.aQ.a(n2 - 1);
            }
        } else {
            cu cu2 = this.a.bC();
            if (this.a.bk || !this.a.br() || cu2 == null || cu2.a() != w.aY || this.n(this.a) > 1024.0) {
                this.aa();
                this.a.P = null;
                return;
            }
        }
        if (this.b != null) {
            if (!this.b.bk) {
                this.aU = this.b.aU;
                double d2 = this.b.bm;
                this.aV = this.b.cT().b + d2 * 0.8;
                this.aW = this.b.aW;
                return;
            }
            this.b = null;
        }
        if (this.m > 0) {
            double d3 = this.aU + (this.n - this.aU) / (double)this.m;
            double d4 = this.aV + (this.o - this.aV) / (double)this.m;
            double d5 = this.aW + (this.p - this.aW) / (double)this.m;
            double d6 = net.minecraft.u.b.n.g(this.q - (double)this.ba);
            this.ba = (float)((double)this.ba + d6 / (double)this.m);
            this.bb = (float)((double)this.bb + (this.r - (double)this.bb) / (double)this.m);
            --this.m;
            this.e(d3, d4, d5);
            this.e(this.ba, this.bb);
        } else {
            double d7;
            if (this.f) {
                if (this.aQ.n(this.d).c() == this.e) {
                    ++this.g;
                    if (this.g == 1200) {
                        this.aa();
                    }
                    return;
                }
                this.f = false;
                this.aX *= (double)(this.bx.nextFloat() * 0.2f);
                this.aY *= (double)(this.bx.nextFloat() * 0.2f);
                this.aZ *= (double)(this.bx.nextFloat() * 0.2f);
                this.g = 0;
                this.h = 0;
            } else {
                ++this.h;
            }
            if (!this.aQ.C) {
                s s2 = new s(this.aU, this.aV, this.aW);
                s s3 = new s(this.aU + this.aX, this.aV + this.aY, this.aW + this.aZ);
                o o2 = this.aQ.a(s2, s3);
                s2 = new s(this.aU, this.aV, this.aW);
                s3 = new s(this.aU + this.aX, this.aV + this.aY, this.aW + this.aZ);
                if (o2 != null) {
                    s3 = new s(o2.c.b, o2.c.c, o2.c.d);
                }
                n n3 = null;
                List list = this.aQ.b((n)this, this.cT().a(this.aX, this.aY, this.aZ).b(1.0));
                double d8 = 0.0;
                for (int i2 = 0; i2 < list.size(); ++i2) {
                    net.minecraft.u.b.a a2;
                    o o3;
                    n n4 = (n)list.get(i2);
                    if (!this.b(n4) || n4 == this.a && this.h < 5 || (o3 = (a2 = n4.cT().b(0.3f)).b(s2, s3)) == null || !((d7 = s2.g(o3.c)) < d8) && d8 != 0.0) continue;
                    n3 = n4;
                    d8 = d7;
                }
                if (n3 != null) {
                    o2 = new o(n3);
                }
                if (o2 != null) {
                    if (o2.d != null) {
                        this.b = o2.d;
                        this.cc().b(c, this.b.ca() + 1);
                    } else {
                        this.f = true;
                    }
                }
            }
            if (!this.f) {
                this.b(this.aX, this.aY, this.aZ);
                float f2 = net.minecraft.u.b.n.a(this.aX * this.aX + this.aZ * this.aZ);
                this.ba = (float)(net.minecraft.u.b.n.b(this.aX, this.aZ) * 57.29577951308232);
                this.bb = (float)(net.minecraft.u.b.n.b(this.aY, (double)f2) * 57.29577951308232);
                while (this.bb - this.bd < -180.0f) {
                    this.bd -= 360.0f;
                }
                while (this.bb - this.bd >= 180.0f) {
                    this.bd += 360.0f;
                }
                while (this.ba - this.bc < -180.0f) {
                    this.bc -= 360.0f;
                }
                while (this.ba - this.bc >= 180.0f) {
                    this.bc += 360.0f;
                }
                this.bb = this.bd + (this.bb - this.bd) * 0.2f;
                this.ba = this.bc + (this.ba - this.bc) * 0.2f;
                float f3 = 0.92f;
                if (this.be || this.bf) {
                    f3 = 0.5f;
                }
                int n5 = 5;
                double d9 = 0.0;
                for (int i3 = 0; i3 < 5; ++i3) {
                    net.minecraft.u.b.a a3 = this.cT();
                    double d10 = a3.e - a3.b;
                    double d11 = a3.b + d10 * (double)i3 / 5.0;
                    d7 = a3.b + d10 * (double)(i3 + 1) / 5.0;
                    net.minecraft.u.b.a a4 = new net.minecraft.u.b.a(a3.a, d11, a3.c, a3.d, d7, a3.f);
                    if (!this.aQ.b(a4, net.minecraft.g.a.h.h)) continue;
                    d9 += 0.2;
                }
                if (!this.aQ.C && d9 > 0.0) {
                    v v2 = (v)this.aQ;
                    int n6 = 1;
                    net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this).b();
                    if (this.bx.nextFloat() < 0.25f && this.aQ.A(b2)) {
                        n6 = 2;
                    }
                    if (this.bx.nextFloat() < 0.5f && !this.aQ.g(b2)) {
                        --n6;
                    }
                    if (this.i > 0) {
                        --this.i;
                        if (this.i <= 0) {
                            this.j = 0;
                            this.k = 0;
                        }
                    } else if (this.k > 0) {
                        this.k -= n6;
                        if (this.k <= 0) {
                            this.aY -= (double)0.2f;
                            this.a(net.minecraft.a.f.G, 0.25f, 1.0f + (this.bx.nextFloat() - this.bx.nextFloat()) * 0.4f);
                            float f4 = net.minecraft.u.b.n.c(this.cT().b);
                            v2.a(aj.e, this.aU, (double)(f4 + 1.0f), this.aW, (int)(1.0f + this.bl * 20.0f), (double)this.bl, 0.0, (double)this.bl, (double)0.2f, new int[0]);
                            v2.a(aj.g, this.aU, (double)(f4 + 1.0f), this.aW, (int)(1.0f + this.bl * 20.0f), (double)this.bl, 0.0, (double)this.bl, (double)0.2f, new int[0]);
                            this.i = net.minecraft.u.b.n.a(this.bx, 10, 30);
                        } else {
                            double d12;
                            this.l = (float)((double)this.l + this.bx.nextGaussian() * 4.0);
                            float f5 = this.l * ((float)Math.PI / 180);
                            float f6 = net.minecraft.u.b.n.a(f5);
                            float f7 = net.minecraft.u.b.n.b(f5);
                            d7 = this.aU + (double)(f6 * (float)this.k * 0.1f);
                            double d13 = (float)net.minecraft.u.b.n.c(this.cT().b) + 1.0f;
                            cn cn2 = v2.n(new net.minecraft.u.b.b((int)d7, (int)d13 - 1, (int)(d12 = this.aW + (double)(f7 * (float)this.k * 0.1f)))).c();
                            if (cn2 == net.minecraft.a.p.j || cn2 == net.minecraft.a.p.i) {
                                if (this.bx.nextFloat() < 0.15f) {
                                    v2.a(aj.e, d7, d13 - (double)0.1f, d12, 1, (double)f6, 0.1, (double)f7, 0.0, new int[0]);
                                }
                                float f8 = f6 * 0.04f;
                                float f9 = f7 * 0.04f;
                                v2.a(aj.g, d7, d13, d12, 0, (double)f9, 0.01, (double)(-f8), 1.0, new int[0]);
                                v2.a(aj.g, d7, d13, d12, 0, (double)(-f9), 0.01, (double)f8, 1.0, new int[0]);
                            }
                        }
                    } else if (this.j > 0) {
                        this.j -= n6;
                        float f10 = 0.15f;
                        if (this.j < 20) {
                            f10 = (float)((double)f10 + (double)(20 - this.j) * 0.05);
                        } else if (this.j < 40) {
                            f10 = (float)((double)f10 + (double)(40 - this.j) * 0.02);
                        } else if (this.j < 60) {
                            f10 = (float)((double)f10 + (double)(60 - this.j) * 0.01);
                        }
                        if (this.bx.nextFloat() < f10) {
                            double d14;
                            double d15;
                            float f11 = net.minecraft.u.b.n.a(this.bx, 0.0f, 360.0f) * ((float)Math.PI / 180);
                            float f12 = net.minecraft.u.b.n.a(this.bx, 25.0f, 60.0f);
                            d7 = this.aU + (double)(net.minecraft.u.b.n.a(f11) * f12 * 0.1f);
                            cn cn3 = v2.n(new net.minecraft.u.b.b((int)d7, (int)(d15 = (double)((float)net.minecraft.u.b.n.c(this.cT().b) + 1.0f)) - 1, (int)(d14 = this.aW + (double)(net.minecraft.u.b.n.b(f11) * f12 * 0.1f)))).c();
                            if (cn3 == net.minecraft.a.p.j || cn3 == net.minecraft.a.p.i) {
                                v2.a(aj.f, d7, d15, d14, 2 + this.bx.nextInt(2), (double)0.1f, 0.0, (double)0.1f, 0.0, new int[0]);
                            }
                        }
                        if (this.j <= 0) {
                            this.l = net.minecraft.u.b.n.a(this.bx, 0.0f, 360.0f);
                            this.k = net.minecraft.u.b.n.a(this.bx, 20, 80);
                        }
                    } else {
                        this.j = net.minecraft.u.b.n.a(this.bx, 100, 900);
                        this.j -= net.minecraft.o.f.g(this.a) * 20 * 5;
                    }
                    if (this.i > 0) {
                        this.aY -= (double)(this.bx.nextFloat() * this.bx.nextFloat() * this.bx.nextFloat()) * 0.2;
                    }
                }
                double d16 = d9 * 2.0 - 1.0;
                this.aY += (double)0.04f * d16;
                if (d9 > 0.0) {
                    f3 = (float)((double)f3 * 0.9);
                    this.aY *= 0.8;
                }
                this.aX *= (double)f3;
                this.aY *= (double)f3;
                this.aZ *= (double)f3;
                this.e(this.aU, this.aV, this.aW);
            }
        }
    }

    protected boolean b(n n2) {
        return n2.cg_() || n2 instanceof ae;
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        e2.a("xTile", this.d.cy_());
        e2.a("yTile", this.d.k());
        e2.a("zTile", this.d.l());
        bp bp2 = (bp)cn.v.b(this.e);
        e2.a("inTile", bp2 == null ? "" : bp2.toString());
        e2.a("inGround", (byte)(this.f ? 1 : 0));
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        this.d = new net.minecraft.u.b.b(e2.h("xTile"), e2.h("yTile"), e2.h("zTile"));
        this.e = e2.b("inTile", 8) ? cn.a(e2.l("inTile")) : cn.d(e2.f("inTile") & 0xFF);
        this.f = e2.f("inGround") == 1;
    }

    public int a() {
        if (this.aQ.C) {
            return 0;
        }
        int n2 = 0;
        if (this.b != null) {
            this.c();
            this.aQ.a((n)this, (byte)31);
            n2 = this.b instanceof ae ? 3 : 5;
        } else if (this.i > 0) {
            r r2 = new r((v)this.aQ);
            r2.a((float)net.minecraft.o.f.f(this.a) + this.a.aM());
            for (cu cu2 : this.aQ.W().a(net.minecraft.q.a.a.j.ao).a(this.bx, r2.a())) {
                ae ae2 = new ae(this.aQ, this.aU, this.aV, this.aW, cu2);
                double d2 = this.a.aU - this.aU;
                double d3 = this.a.aV - this.aV;
                double d4 = this.a.aW - this.aW;
                double d5 = net.minecraft.u.b.n.a(d2 * d2 + d3 * d3 + d4 * d4);
                double d6 = 0.1;
                ae2.aX = d2 * 0.1;
                ae2.aY = d3 * 0.1 + (double)net.minecraft.u.b.n.a(d5) * 0.08;
                ae2.aZ = d4 * 0.1;
                this.aQ.a(ae2);
                this.a.aQ.a(new e(this.a.aQ, this.a.aU, this.a.aV + 0.5, this.a.aW + 0.5, this.bx.nextInt(6) + 1));
            }
            n2 = 1;
        }
        if (this.f) {
            n2 = 2;
        }
        this.aa();
        this.a.P = null;
        return n2;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 31 && this.aQ.C && this.b instanceof b && ((b)this.b).u()) {
            this.c();
        }
        super.a(by2);
    }

    protected void c() {
        double d2 = this.a.aU - this.aU;
        double d3 = this.a.aV - this.aV;
        double d4 = this.a.aW - this.aW;
        double d5 = net.minecraft.u.b.n.a(d2 * d2 + d3 * d3 + d4 * d4);
        double d6 = 0.1;
        this.b.aX += d2 * 0.1;
        this.b.aY += d3 * 0.1 + (double)net.minecraft.u.b.n.a(d5) * 0.08;
        this.b.aZ += d4 * 0.1;
    }

    @Override
    public void aa() {
        super.aa();
        if (this.a != null) {
            this.a.P = null;
        }
    }
}

