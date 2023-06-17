/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class cvo
extends cpk {
    private static final bcz c = bwm.a(cvo.class, cbf.b);
    private cmz d = new cmz(-1, -1, -1);
    private bfa e;
    private boolean f;
    public bdl a;
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
    public cpk b;

    public cvo(iu iu2) {
        super(iu2);
        this.a_(0.25f, 0.25f);
        this.bN = true;
    }

    public cvo(iu iu2, double d2, double d3, double d4, bdl bdl2) {
        this(iu2);
        this.d(d2, d3, d4);
        this.bN = true;
        this.a = bdl2;
        bdl2.M = this;
    }

    public cvo(iu iu2, bdl bdl2) {
        super(iu2);
        this.bN = true;
        this.a = bdl2;
        this.a.M = this;
        this.a_(0.25f, 0.25f);
        this.a_(bdl2.aU, bdl2.aV + (double)bdl2.A(), bdl2.aW, bdl2.ba, bdl2.bb);
        this.aU -= (double)(cmk.b(this.ba * ((float)Math.PI / 180)) * 0.16f);
        this.aV -= (double)0.1f;
        this.aW -= (double)(cmk.a(this.ba * ((float)Math.PI / 180)) * 0.16f);
        this.d(this.aU, this.aV, this.aW);
        float f2 = 0.4f;
        this.aX = -cmk.a(this.ba * ((float)Math.PI / 180)) * cmk.b(this.bb * ((float)Math.PI / 180)) * 0.4f;
        this.aZ = cmk.b(this.ba * ((float)Math.PI / 180)) * cmk.b(this.bb * ((float)Math.PI / 180)) * 0.4f;
        this.aY = -cmk.a(this.bb * ((float)Math.PI / 180)) * 0.4f;
        this.c(this.aX, this.aY, this.aZ, 1.5f, 1.0f);
    }

    @Override
    protected void a() {
        this.bY().a(c, 0);
    }

    @Override
    public void a(bcz bcz2) {
        int n2;
        if (c.equals(bcz2) && (n2 = ((Integer)this.bY().a(c)).intValue()) > 0 && this.b != null) {
            this.b = null;
        }
        super.a(bcz2);
    }

    @Override
    public boolean a(double d2) {
        double d3 = this.cD().a() * 4.0;
        if (Double.isNaN(d3)) {
            d3 = 4.0;
        }
        return d2 < (d3 *= 64.0) * d3;
    }

    public void c(double d2, double d3, double d4, float f2, float f3) {
        float f4 = cmk.a(d2 * d2 + d3 * d3 + d4 * d4);
        d2 /= (double)f4;
        d3 /= (double)f4;
        d4 /= (double)f4;
        d2 += this.bx.nextGaussian() * (double)0.0075f * (double)f3;
        d3 += this.bx.nextGaussian() * (double)0.0075f * (double)f3;
        d4 += this.bx.nextGaussian() * (double)0.0075f * (double)f3;
        this.aX = d2 *= (double)f2;
        this.aY = d3 *= (double)f2;
        this.aZ = d4 *= (double)f2;
        float f5 = cmk.a(d2 * d2 + d4 * d4);
        this.ba = (float)(cmk.b(d2, d4) * 57.2957763671875);
        this.bb = (float)(cmk.b(d3, (double)f5) * 57.2957763671875);
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
    public void a(double d2, double d3, double d4) {
        this.aX = d2;
        this.aY = d3;
        this.aZ = d4;
        this.s = this.aX;
        this.t = this.aY;
        this.u = this.aZ;
    }

    @Override
    public void bb_() {
        double d2;
        super.bb_();
        if (this.aQ.C) {
            int n2 = (Integer)this.bY().a(c);
            if (n2 > 0 && this.b == null) {
                this.b = this.aQ.a(n2 - 1);
            }
        } else {
            bhl bhl2 = this.a.bt();
            if (this.a.bk || !this.a.bj() || bhl2 == null || bhl2.a() != hp.aY || this.l(this.a) > 1024.0) {
                this.ak_();
                this.a.M = null;
                return;
            }
        }
        if (this.b != null) {
            if (this.b.bk) {
                this.b = null;
            } else {
                this.aU = this.b.aU;
                this.aV = this.b.cD().b + (double)this.b.bm * 0.8;
                this.aW = this.b.aW;
                return;
            }
        }
        if (this.m > 0) {
            double d3 = this.aU + (this.n - this.aU) / (double)this.m;
            double d4 = this.aV + (this.o - this.aV) / (double)this.m;
            double d5 = this.aW + (this.p - this.aW) / (double)this.m;
            double d6 = cmk.g(this.q - (double)this.ba);
            this.ba = (float)((double)this.ba + d6 / (double)this.m);
            this.bb = (float)((double)this.bb + (this.r - (double)this.bb) / (double)this.m);
            --this.m;
            this.d(d3, d4, d5);
            this.e(this.ba, this.bb);
            return;
        }
        if (this.f) {
            if (this.aQ.n(this.d).t() == this.e) {
                ++this.g;
                if (this.g == 1200) {
                    this.ak_();
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
            amj amj2 = new amj(this.aU, this.aV, this.aW);
            amj amj3 = new amj(this.aU + this.aX, this.aV + this.aY, this.aW + this.aZ);
            auu auu2 = this.aQ.a(amj2, amj3);
            amj2 = new amj(this.aU, this.aV, this.aW);
            amj3 = new amj(this.aU + this.aX, this.aV + this.aY, this.aW + this.aZ);
            if (auu2 != null) {
                amj3 = new amj(auu2.c.b, auu2.c.c, auu2.c.d);
            }
            cpk cpk2 = null;
            List list = this.aQ.b((cpk)this, this.cD().a(this.aX, this.aY, this.aZ).b(1.0));
            double d7 = 0.0;
            for (int i2 = 0; i2 < list.size(); ++i2) {
                cxt cxt2;
                auu auu3;
                cpk cpk3 = (cpk)list.get(i2);
                if (!this.h(cpk3) || cpk3 == this.a && this.h < 5 || (auu3 = (cxt2 = cpk3.cD().b(0.3f)).b(amj2, amj3)) == null || !((d2 = amj2.g(auu3.c)) < d7) && d7 != 0.0) continue;
                cpk2 = cpk3;
                d7 = d2;
            }
            if (cpk2 != null) {
                auu2 = new auu(cpk2);
            }
            if (auu2 != null) {
                if (auu2.d != null) {
                    this.b = auu2.d;
                    this.bY().b(c, this.b.bW() + 1);
                } else {
                    this.f = true;
                }
            }
        }
        if (this.f) {
            return;
        }
        this.b(this.aX, this.aY, this.aZ);
        float f2 = cmk.a(this.aX * this.aX + this.aZ * this.aZ);
        this.ba = (float)(cmk.b(this.aX, this.aZ) * 57.2957763671875);
        this.bb = (float)(cmk.b(this.aY, (double)f2) * 57.2957763671875);
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
        int n3 = 5;
        double d8 = 0.0;
        for (int i3 = 0; i3 < 5; ++i3) {
            cxt cxt3 = this.cD();
            double d9 = cxt3.e - cxt3.b;
            double d10 = cxt3.b + d9 * (double)i3 / 5.0;
            d2 = cxt3.b + d9 * (double)(i3 + 1) / 5.0;
            cxt cxt4 = new cxt(cxt3.a, d10, cxt3.c, cxt3.d, d2, cxt3.f);
            if (!this.aQ.b(cxt4, ahk.h)) continue;
            d8 += 0.2;
        }
        if (!this.aQ.C && d8 > 0.0) {
            alj alj2 = (alj)this.aQ;
            int n4 = 1;
            cmz cmz2 = new cmz(this).g();
            if (this.bx.nextFloat() < 0.25f && this.aQ.A(cmz2)) {
                n4 = 2;
            }
            if (this.bx.nextFloat() < 0.5f && !this.aQ.g(cmz2)) {
                --n4;
            }
            if (this.i > 0) {
                --this.i;
                if (this.i <= 0) {
                    this.j = 0;
                    this.k = 0;
                }
            } else if (this.k > 0) {
                this.k -= n4;
                if (this.k <= 0) {
                    this.aY -= (double)0.2f;
                    this.a(dah.G, 0.25f, 1.0f + (this.bx.nextFloat() - this.bx.nextFloat()) * 0.4f);
                    float f4 = cmk.c(this.cD().b);
                    alj2.a(lz.e, this.aU, (double)(f4 + 1.0f), this.aW, (int)(1.0f + this.bl * 20.0f), (double)this.bl, 0.0, (double)this.bl, (double)0.2f, new int[0]);
                    alj2.a(lz.g, this.aU, (double)(f4 + 1.0f), this.aW, (int)(1.0f + this.bl * 20.0f), (double)this.bl, 0.0, (double)this.bl, (double)0.2f, new int[0]);
                    this.i = cmk.a(this.bx, 10, 30);
                } else {
                    double d11;
                    this.l = (float)((double)this.l + this.bx.nextGaussian() * 4.0);
                    float f5 = this.l * ((float)Math.PI / 180);
                    float f6 = cmk.a(f5);
                    float f7 = cmk.b(f5);
                    d2 = this.aU + (double)(f6 * (float)this.k * 0.1f);
                    double d12 = (float)cmk.c(this.cD().b) + 1.0f;
                    bfa bfa2 = alj2.n(new cmz((int)d2, (int)d12 - 1, (int)(d11 = this.aW + (double)(f7 * (float)this.k * 0.1f)))).t();
                    if (bfa2 == blg.j || bfa2 == blg.i) {
                        if (this.bx.nextFloat() < 0.15f) {
                            alj2.a(lz.e, d2, d12 - (double)0.1f, d11, 1, (double)f6, 0.1, (double)f7, 0.0, new int[0]);
                        }
                        float f8 = f6 * 0.04f;
                        float f9 = f7 * 0.04f;
                        alj2.a(lz.g, d2, d12, d11, 0, (double)f9, 0.01, (double)(-f8), 1.0, new int[0]);
                        alj2.a(lz.g, d2, d12, d11, 0, (double)(-f9), 0.01, (double)f8, 1.0, new int[0]);
                    }
                }
            } else if (this.j > 0) {
                this.j -= n4;
                float f10 = 0.15f;
                if (this.j < 20) {
                    f10 = (float)((double)f10 + (double)(20 - this.j) * 0.05);
                } else if (this.j < 40) {
                    f10 = (float)((double)f10 + (double)(40 - this.j) * 0.02);
                } else if (this.j < 60) {
                    f10 = (float)((double)f10 + (double)(60 - this.j) * 0.01);
                }
                if (this.bx.nextFloat() < f10) {
                    double d13;
                    double d14;
                    float f11 = cmk.a(this.bx, 0.0f, 360.0f) * ((float)Math.PI / 180);
                    float f12 = cmk.a(this.bx, 25.0f, 60.0f);
                    d2 = this.aU + (double)(cmk.a(f11) * f12 * 0.1f);
                    bfa bfa3 = alj2.n(new cmz((int)d2, (int)(d14 = (double)((float)cmk.c(this.cD().b) + 1.0f)) - 1, (int)(d13 = this.aW + (double)(cmk.b(f11) * f12 * 0.1f)))).t();
                    if (bfa3 == blg.j || bfa3 == blg.i) {
                        alj2.a(lz.f, d2, d14, d13, 2 + this.bx.nextInt(2), (double)0.1f, 0.0, (double)0.1f, 0.0, new int[0]);
                    }
                }
                if (this.j <= 0) {
                    this.l = cmk.a(this.bx, 0.0f, 360.0f);
                    this.k = cmk.a(this.bx, 20, 80);
                }
            } else {
                this.j = cmk.a(this.bx, 100, 900);
                this.j -= acz.g(this.a) * 20 * 5;
            }
            if (this.i > 0) {
                this.aY -= (double)(this.bx.nextFloat() * this.bx.nextFloat() * this.bx.nextFloat()) * 0.2;
            }
        }
        double d15 = d8 * 2.0 - 1.0;
        this.aY += (double)0.04f * d15;
        if (d8 > 0.0) {
            f3 = (float)((double)f3 * 0.9);
            this.aY *= 0.8;
        }
        this.aX *= (double)f3;
        this.aY *= (double)f3;
        this.aZ *= (double)f3;
        this.d(this.aU, this.aV, this.aW);
    }

    protected boolean h(cpk cpk2) {
        return cpk2.bc_() || cpk2 instanceof er;
    }

    @Override
    public void a(bvp bvp2) {
        bvp2.a("xTile", this.d.a());
        bvp2.a("yTile", this.d.b());
        bvp2.a("zTile", this.d.c());
        bpx bpx2 = (bpx)bfa.v.b(this.e);
        bvp2.a("inTile", bpx2 == null ? "" : bpx2.toString());
        bvp2.a("inGround", (byte)(this.f ? 1 : 0));
    }

    @Override
    public void b(bvp bvp2) {
        this.d = new cmz(bvp2.h("xTile"), bvp2.h("yTile"), bvp2.h("zTile"));
        this.e = bvp2.b("inTile", 8) ? bfa.a(bvp2.l("inTile")) : bfa.f(bvp2.f("inTile") & 0xFF);
        this.f = bvp2.f("inGround") == 1;
    }

    public int n() {
        if (this.aQ.C) {
            return 0;
        }
        int n2 = 0;
        if (this.b != null) {
            this.p();
            this.aQ.a((cpk)this, (byte)31);
            n2 = this.b instanceof er ? 3 : 5;
        } else if (this.i > 0) {
            bcn bcn2 = new bcn((alj)this.aQ);
            bcn2.a((float)acz.f(this.a) + this.a.aT());
            for (bhl bhl2 : this.aQ.V().a(bvm.ao).a(this.bx, bcn2.a())) {
                er er2 = new er(this.aQ, this.aU, this.aV, this.aW, bhl2);
                double d2 = this.a.aU - this.aU;
                double d3 = this.a.aV - this.aV;
                double d4 = this.a.aW - this.aW;
                double d5 = cmk.a(d2 * d2 + d3 * d3 + d4 * d4);
                double d6 = 0.1;
                er2.aX = d2 * 0.1;
                er2.aY = d3 * 0.1 + (double)cmk.a(d5) * 0.08;
                er2.aZ = d4 * 0.1;
                this.aQ.b(er2);
                this.a.aQ.b(new cvs(this.a.aQ, this.a.aU, this.a.aV + 0.5, this.a.aW + 0.5, this.bx.nextInt(6) + 1));
            }
            n2 = 1;
        }
        if (this.f) {
            n2 = 2;
        }
        this.ak_();
        this.a.M = null;
        return n2;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 31 && this.aQ.C && this.b instanceof bdl && ((bdl)this.b).z()) {
            this.p();
        }
        super.a(by2);
    }

    protected void p() {
        double d2 = this.a.aU - this.aU;
        double d3 = this.a.aV - this.aV;
        double d4 = this.a.aW - this.aW;
        double d5 = cmk.a(d2 * d2 + d3 * d3 + d4 * d4);
        double d6 = 0.1;
        this.b.aX += d2 * 0.1;
        this.b.aY += d3 * 0.1 + (double)cmk.a(d5) * 0.08;
        this.b.aZ += d4 * 0.1;
    }

    @Override
    public void ak_() {
        super.ak_();
        if (this.a != null) {
            this.a.M = null;
        }
    }
}

