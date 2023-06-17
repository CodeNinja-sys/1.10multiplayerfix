/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class brd
extends xy
implements bos,
cso {
    private static final d A = org.apache.logging.log4j.c.c();
    public static final bcz a = bwm.a(brd.class, cbf.b);
    public double[][] b = new double[64][3];
    public int c = -1;
    public ckm[] d;
    public ckm e;
    public ckm f;
    public ckm g;
    public ckm q;
    public ckm r;
    public ckm s;
    public ckm t;
    public ckm u;
    public float v;
    public float w;
    public boolean x;
    public int y;
    public abi z;
    private final cmd B;
    private final bhh C;
    private int D = 200;
    private int E;
    private final aqn[] F = new aqn[24];
    private final int[] G = new int[24];
    private final rh H = new rh();

    public brd(iu iu2) {
        super(iu2);
        this.e = new ckm(this, "head", 6.0f, 6.0f);
        this.f = new ckm(this, "neck", 6.0f, 6.0f);
        this.g = new ckm(this, "body", 8.0f, 8.0f);
        this.q = new ckm(this, "tail", 4.0f, 4.0f);
        this.r = new ckm(this, "tail", 4.0f, 4.0f);
        this.s = new ckm(this, "tail", 4.0f, 4.0f);
        this.t = new ckm(this, "wing", 4.0f, 4.0f);
        this.u = new ckm(this, "wing", 4.0f, 4.0f);
        this.d = new ckm[]{this.e, this.f, this.g, this.q, this.r, this.s, this.t, this.u};
        this.k(this.bo());
        this.a_(16.0f, 8.0f);
        this.bv = true;
        this.bD = true;
        this.D = 100;
        this.bN = true;
        this.B = !iu2.C && iu2.q instanceof cup ? ((cup)iu2.q).s() : null;
        this.C = new bhh(this);
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(200.0);
    }

    @Override
    protected void a() {
        super.a();
        this.bY().a(a, baw.k.b());
    }

    public double[] a(int n2, float f2) {
        if (this.bh() <= 0.0f) {
            f2 = 0.0f;
        }
        f2 = 1.0f - f2;
        int n3 = this.c - n2 & 0x3F;
        int n4 = this.c - n2 - 1 & 0x3F;
        double[] arrd = new double[3];
        double d2 = this.b[n3][0];
        double d3 = cmk.g(this.b[n4][0] - d2);
        arrd[0] = d2 + d3 * (double)f2;
        d2 = this.b[n3][1];
        d3 = this.b[n4][1] - d2;
        arrd[1] = d2 + d3 * (double)f2;
        arrd[2] = this.b[n3][2] + (this.b[n4][2] - this.b[n3][2]) * (double)f2;
        return arrd;
    }

    @Override
    public void Q_() {
        float f2;
        double d2;
        double d3;
        double d4;
        float f3;
        float f4;
        if (this.aQ.C) {
            this.k(this.bh());
            if (!this.ce()) {
                f4 = cmk.b(this.w * ((float)Math.PI * 2));
                f3 = cmk.b(this.v * ((float)Math.PI * 2));
                if (f3 <= -0.3f && f4 >= -0.3f) {
                    this.aQ.a(this.aU, this.aV, this.aW, dah.aR, this.y(), 5.0f, 0.8f + this.bx.nextFloat() * 0.3f, false);
                }
                if (!this.C.a().h() && --this.D < 0) {
                    this.aQ.a(this.aU, this.aV, this.aW, dah.aS, this.y(), 2.5f, 0.8f + this.bx.nextFloat() * 0.3f, false);
                    this.D = 200 + this.bx.nextInt(200);
                }
            }
        }
        this.v = this.w;
        if (this.bh() <= 0.0f) {
            f4 = (this.bx.nextFloat() - 0.5f) * 8.0f;
            f3 = (this.bx.nextFloat() - 0.5f) * 4.0f;
            float f5 = (this.bx.nextFloat() - 0.5f) * 8.0f;
            this.aQ.a(lz.b, this.aU + (double)f4, this.aV + 2.0 + (double)f3, this.aW + (double)f5, 0.0, 0.0, 0.0, new int[0]);
            return;
        }
        this.aP();
        f4 = 0.2f / (cmk.a(this.aX * this.aX + this.aZ * this.aZ) * 10.0f + 1.0f);
        this.w = this.C.a().h() ? (this.w += 0.1f) : (this.x ? (this.w += f4 * 0.5f) : (this.w += (f4 *= (float)Math.pow(2.0, this.aY))));
        this.ba = cmk.g(this.ba);
        if (this.aI()) {
            this.w = 0.5f;
            return;
        }
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
            if (this.aB > 0) {
                double d5 = this.aU + (this.aC - this.aU) / (double)this.aB;
                d4 = this.aV + (this.aD - this.aV) / (double)this.aB;
                d3 = this.aW + (this.aE - this.aW) / (double)this.aB;
                d2 = cmk.g(this.aF - (double)this.ba);
                this.ba = (float)((double)this.ba + d2 / (double)this.aB);
                this.bb = (float)((double)this.bb + (this.aG - (double)this.bb) / (double)this.aB);
                --this.aB;
                this.d(d5, d4, d3);
                this.e(this.ba, this.bb);
            }
            this.C.a().e();
        } else {
            amj amj2;
            ajd ajd2 = this.C.a();
            ajd2.a();
            if (this.C.a() != ajd2) {
                ajd2 = this.C.a();
                ajd2.a();
            }
            if ((amj2 = ajd2.c()) != null) {
                d4 = amj2.b - this.aU;
                d3 = amj2.c - this.aV;
                d2 = amj2.d - this.aW;
                double d6 = d4 * d4 + d3 * d3 + d2 * d2;
                f2 = ajd2.f();
                d3 = cmk.a(d3 / (double)cmk.a(d4 * d4 + d2 * d2), (double)(-f2), (double)f2);
                this.aY += d3 * (double)0.1f;
                this.ba = cmk.g(this.ba);
                double d7 = cmk.a(cmk.g(180.0 - cmk.b(d4, d2) * 57.2957763671875 - (double)this.ba), -50.0, 50.0);
                amj amj3 = new amj(amj2.b - this.aU, amj2.c - this.aV, amj2.d - this.aW).a();
                amj amj4 = new amj(cmk.a(this.ba * ((float)Math.PI / 180)), this.aY, -cmk.b(this.ba * ((float)Math.PI / 180))).a();
                float f6 = Math.max(((float)amj4.b(amj3) + 0.5f) / 1.5f, 0.0f);
                this.aA *= 0.8f;
                this.aA = (float)((double)this.aA + d7 * (double)ajd2.g());
                this.ba += this.aA * 0.1f;
                float f7 = (float)(2.0 / (d6 + 1.0));
                float f8 = 0.06f;
                this.b(0.0f, -1.0f, 0.06f * (f6 * f7 + (1.0f - f7)));
                if (this.x) {
                    this.b(this.aX * (double)0.8f, this.aY * (double)0.8f, this.aZ * (double)0.8f);
                } else {
                    this.b(this.aX, this.aY, this.aZ);
                }
                amj amj5 = new amj(this.aX, this.aY, this.aZ).a();
                float f9 = ((float)amj5.b(amj4) + 1.0f) / 2.0f;
                f9 = 0.8f + 0.15f * f9;
                this.aX *= (double)f9;
                this.aZ *= (double)f9;
                this.aY *= (double)0.91f;
            }
        }
        this.ah = this.ba;
        this.e.bl = 1.0f;
        this.e.bm = 1.0f;
        this.f.bl = 3.0f;
        this.f.bm = 3.0f;
        this.q.bl = 2.0f;
        this.q.bm = 2.0f;
        this.r.bl = 2.0f;
        this.r.bm = 2.0f;
        this.s.bl = 2.0f;
        this.s.bm = 2.0f;
        this.g.bm = 3.0f;
        this.g.bl = 5.0f;
        this.t.bm = 2.0f;
        this.t.bl = 4.0f;
        this.u.bm = 3.0f;
        this.u.bl = 4.0f;
        f3 = (float)(this.a(5, 1.0f)[1] - this.a(10, 1.0f)[1]) * 10.0f * ((float)Math.PI / 180);
        float f10 = cmk.b(f3);
        float f11 = cmk.a(f3);
        float f12 = this.ba * ((float)Math.PI / 180);
        float f13 = cmk.a(f12);
        float f14 = cmk.b(f12);
        this.g.bb_();
        this.g.a_(this.aU + (double)(f13 * 0.5f), this.aV, this.aW - (double)(f14 * 0.5f), 0.0f, 0.0f);
        this.t.bb_();
        this.t.a_(this.aU + (double)(f14 * 4.5f), this.aV + 2.0, this.aW + (double)(f13 * 4.5f), 0.0f, 0.0f);
        this.u.bb_();
        this.u.a_(this.aU - (double)(f14 * 4.5f), this.aV + 2.0, this.aW - (double)(f13 * 4.5f), 0.0f, 0.0f);
        if (!this.aQ.C && this.S == 0) {
            this.a(this.aQ.b((cpk)this, this.t.cD().b(4.0, 2.0, 4.0).c(0.0, -2.0, 0.0)));
            this.a(this.aQ.b((cpk)this, this.u.cD().b(4.0, 2.0, 4.0).c(0.0, -2.0, 0.0)));
            this.b(this.aQ.b((cpk)this, this.e.cD().b(1.0)));
            this.b(this.aQ.b((cpk)this, this.f.cD().b(1.0)));
        }
        double[] arrd = this.a(5, 1.0f);
        float f15 = cmk.a(this.ba * ((float)Math.PI / 180) - this.aA * 0.01f);
        float f16 = cmk.b(this.ba * ((float)Math.PI / 180) - this.aA * 0.01f);
        this.e.bb_();
        this.f.bb_();
        float f17 = this.j(1.0f);
        this.e.a_(this.aU + (double)(f15 * 6.5f * f10), this.aV + (double)f17 + (double)(f11 * 6.5f), this.aW - (double)(f16 * 6.5f * f10), 0.0f, 0.0f);
        this.f.a_(this.aU + (double)(f15 * 5.5f * f10), this.aV + (double)f17 + (double)(f11 * 5.5f), this.aW - (double)(f16 * 5.5f * f10), 0.0f, 0.0f);
        for (int i3 = 0; i3 < 3; ++i3) {
            ckm ckm2 = null;
            if (i3 == 0) {
                ckm2 = this.q;
            }
            if (i3 == 1) {
                ckm2 = this.r;
            }
            if (i3 == 2) {
                ckm2 = this.s;
            }
            double[] arrd2 = this.a(12 + i3 * 2, 1.0f);
            f2 = this.ba * ((float)Math.PI / 180) + this.b(arrd2[0] - arrd[0]) * ((float)Math.PI / 180);
            float f18 = cmk.a(f2);
            float f19 = cmk.b(f2);
            float f20 = 1.5f;
            float f21 = (float)(i3 + 1) * 2.0f;
            ckm2.bb_();
            ckm2.a_(this.aU - (double)((f13 * 1.5f + f18 * f21) * f10), this.aV + (arrd2[1] - arrd[1]) - (double)((f21 + 1.5f) * f11) + 1.5, this.aW + (double)((f14 * 1.5f + f19 * f21) * f10), 0.0f, 0.0f);
        }
        if (!this.aQ.C) {
            this.x = this.b(this.e.cD()) | this.b(this.f.cD()) | this.b(this.g.cD());
            if (this.B != null) {
                this.B.b(this);
            }
        }
    }

    private float j(float f2) {
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

    private void aP() {
        if (this.z != null) {
            if (this.z.bk) {
                this.z = null;
            } else if (this.by % 10 == 0 && this.bh() < this.bo()) {
                this.k(this.bh() + 1.0f);
            }
        }
        if (this.bx.nextInt(10) == 0) {
            List list = this.aQ.a(abi.class, this.cD().b(32.0));
            abi abi2 = null;
            double d2 = Double.MAX_VALUE;
            for (abi abi3 : list) {
                double d3 = abi3.l(this);
                if (!(d3 < d2)) continue;
                d2 = d3;
                abi2 = abi3;
            }
            this.z = abi2;
        }
    }

    private void a(List list) {
        double d2 = (this.g.cD().a + this.g.cD().d) / 2.0;
        double d3 = (this.g.cD().c + this.g.cD().f) / 2.0;
        for (cpk cpk2 : list) {
            if (!(cpk2 instanceof bga)) continue;
            double d4 = cpk2.aU - d2;
            double d5 = cpk2.aW - d3;
            double d6 = d4 * d4 + d5 * d5;
            cpk2.c(d4 / d6 * 4.0, 0.2f, d5 / d6 * 4.0);
            if (this.C.a().h() || ((bga)cpk2).aY() >= cpk2.by - 2) continue;
            cpk2.a(ahy.b(this), 5.0f);
            this.a(this, cpk2);
        }
    }

    private void b(List list) {
        for (int i2 = 0; i2 < list.size(); ++i2) {
            cpk cpk2 = (cpk)list.get(i2);
            if (!(cpk2 instanceof bga)) continue;
            cpk2.a(ahy.b(this), 10.0f);
            this.a(this, cpk2);
        }
    }

    private float b(double d2) {
        return (float)cmk.g(d2);
    }

    private boolean b(cxt cxt2) {
        int n2 = cmk.c(cxt2.a);
        int n3 = cmk.c(cxt2.b);
        int n4 = cmk.c(cxt2.c);
        int n5 = cmk.c(cxt2.d);
        int n6 = cmk.c(cxt2.e);
        int n7 = cmk.c(cxt2.f);
        boolean bl2 = false;
        boolean bl3 = false;
        for (int i2 = n2; i2 <= n5; ++i2) {
            for (int i3 = n3; i3 <= n6; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    cmz cmz2 = new cmz(i2, i3, i4);
                    dbk dbk2 = this.aQ.n(cmz2);
                    bfa bfa2 = dbk2.t();
                    if (dbk2.a() == ahk.a || dbk2.a() == ahk.o) continue;
                    if (!this.aQ.F().b("mobGriefing")) {
                        bl2 = true;
                        continue;
                    }
                    if (bfa2 == blg.cv || bfa2 == blg.Z || bfa2 == blg.bH || bfa2 == blg.h || bfa2 == blg.bF || bfa2 == blg.bG) {
                        bl2 = true;
                        continue;
                    }
                    if (bfa2 == blg.bX || bfa2 == blg.dc || bfa2 == blg.dd || bfa2 == blg.bi || bfa2 == blg.db) {
                        bl2 = true;
                        continue;
                    }
                    bl3 = this.aQ.f(cmz2) || bl3;
                }
            }
        }
        if (bl3) {
            double d2 = cxt2.a + (cxt2.d - cxt2.a) * (double)this.bx.nextFloat();
            double d3 = cxt2.b + (cxt2.e - cxt2.b) * (double)this.bx.nextFloat();
            double d4 = cxt2.c + (cxt2.f - cxt2.c) * (double)this.bx.nextFloat();
            this.aQ.a(lz.b, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
        }
        return bl2;
    }

    @Override
    public boolean a(ckm ckm2, ahy ahy2, float f2) {
        f2 = this.C.a().a(ckm2, ahy2, f2);
        if (ckm2 != this.e) {
            f2 = f2 / 4.0f + Math.min(f2, 1.0f);
        }
        if (f2 < 0.01f) {
            return false;
        }
        if (ahy2.b() instanceof bdl || ahy2.e()) {
            float f3 = this.bh();
            this.e(ahy2, f2);
            if (this.bh() <= 0.0f && !this.C.a().h()) {
                this.k(1.0f);
                this.C.a(baw.j);
            }
            if (this.C.a().h()) {
                this.E = (int)((float)this.E + (f3 - this.bh()));
                if ((float)this.E > 0.25f * this.bo()) {
                    this.E = 0;
                    this.C.a(baw.e);
                }
            }
        }
        return true;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (ahy2 instanceof bsg && ((bsg)ahy2).x()) {
            this.a(this.g, ahy2, f2);
        }
        return false;
    }

    protected boolean e(ahy ahy2, float f2) {
        return super.a(ahy2, f2);
    }

    @Override
    public void v_() {
        this.ak_();
        if (this.B != null) {
            this.B.b(this);
            this.B.a(this);
        }
    }

    @Override
    protected void aV() {
        if (this.B != null) {
            this.B.b(this);
        }
        ++this.y;
        if (this.y >= 180 && this.y <= 200) {
            float f2 = (this.bx.nextFloat() - 0.5f) * 8.0f;
            float f3 = (this.bx.nextFloat() - 0.5f) * 4.0f;
            float f4 = (this.bx.nextFloat() - 0.5f) * 8.0f;
            this.aQ.a(lz.c, this.aU + (double)f2, this.aV + 2.0 + (double)f3, this.aW + (double)f4, 0.0, 0.0, 0.0, new int[0]);
        }
        boolean bl2 = this.aQ.F().b("doMobLoot");
        int n2 = 500;
        if (this.B != null && !this.B.d()) {
            n2 = 12000;
        }
        if (!this.aQ.C) {
            if (this.y > 150 && this.y % 5 == 0 && bl2) {
                this.d(cmk.d((float)n2 * 0.08f));
            }
            if (this.y == 1) {
                this.aQ.a(1028, new cmz(this), 0);
            }
        }
        this.b(0.0, (double)0.1f, 0.0);
        this.ba += 20.0f;
        this.ah = this.ba;
        if (this.y == 200 && !this.aQ.C) {
            if (bl2) {
                this.d(cmk.d((float)n2 * 0.2f));
            }
            if (this.B != null) {
                this.B.a(this);
            }
            this.ak_();
        }
    }

    private void d(int n2) {
        while (n2 > 0) {
            int n3 = cvs.c(n2);
            n2 -= n3;
            this.aQ.b(new cvs(this.aQ, this.aU, this.aV, this.aW, n3));
        }
    }

    public int T() {
        if (this.F[0] == null) {
            for (int i2 = 0; i2 < 24; ++i2) {
                int n2;
                int n3;
                int n4 = 5;
                int n5 = i2;
                if (i2 < 12) {
                    n3 = (int)(60.0f * cmk.b(2.0f * ((float)(-Math.PI) + 0.2617994f * (float)n5)));
                    n2 = (int)(60.0f * cmk.a(2.0f * ((float)(-Math.PI) + 0.2617994f * (float)n5)));
                } else if (i2 < 20) {
                    n3 = (int)(40.0f * cmk.b(2.0f * ((float)(-Math.PI) + 0.3926991f * (float)(n5 -= 12))));
                    n2 = (int)(40.0f * cmk.a(2.0f * ((float)(-Math.PI) + 0.3926991f * (float)n5)));
                    n4 += 10;
                } else {
                    n3 = (int)(20.0f * cmk.b(2.0f * ((float)(-Math.PI) + 0.7853982f * (float)(n5 -= 20))));
                    n2 = (int)(20.0f * cmk.a(2.0f * ((float)(-Math.PI) + 0.7853982f * (float)n5)));
                }
                int n6 = Math.max(this.aQ.u() + 10, this.aQ.p(new cmz(n3, 0, n2)).b() + n4);
                this.F[i2] = new aqn(n3, n6, n2);
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
        return this.f(this.aU, this.aV, this.aW);
    }

    public int f(double d2, double d3, double d4) {
        float f2 = 10000.0f;
        int n2 = 0;
        aqn aqn2 = new aqn(cmk.c(d2), cmk.c(d3), cmk.c(d4));
        int n3 = 0;
        if (this.B == null || this.B.c() == 0) {
            n3 = 12;
        }
        for (int i2 = n3; i2 < 24; ++i2) {
            float f3;
            if (this.F[i2] == null || !((f3 = this.F[i2].b(aqn2)) < f2)) continue;
            f2 = f3;
            n2 = i2;
        }
        return n2;
    }

    public dbn a(int n2, int n3, aqn aqn2) {
        aqn aqn3;
        for (int i2 = 0; i2 < 24; ++i2) {
            aqn3 = this.F[i2];
            aqn3.i = false;
            aqn3.g = 0.0f;
            aqn3.e = 0.0f;
            aqn3.f = 0.0f;
            aqn3.h = null;
            aqn3.d = -1;
        }
        aqn aqn4 = this.F[n2];
        aqn3 = this.F[n3];
        aqn4.e = 0.0f;
        aqn4.g = aqn4.f = aqn4.a(aqn3);
        this.H.a();
        this.H.a(aqn4);
        aqn aqn5 = aqn4;
        int n4 = 0;
        if (this.B == null || this.B.c() == 0) {
            n4 = 12;
        }
        while (!this.H.c()) {
            int n5;
            aqn aqn6 = this.H.b();
            if (aqn6.equals(aqn3)) {
                if (aqn2 != null) {
                    aqn2.h = aqn3;
                    aqn3 = aqn2;
                }
                return this.a(aqn4, aqn3);
            }
            if (aqn6.a(aqn3) < aqn5.a(aqn3)) {
                aqn5 = aqn6;
            }
            aqn6.i = true;
            int n6 = 0;
            for (n5 = 0; n5 < 24; ++n5) {
                if (this.F[n5] != aqn6) continue;
                n6 = n5;
                break;
            }
            for (n5 = n4; n5 < 24; ++n5) {
                if ((this.G[n6] & 1 << n5) <= 0) continue;
                aqn aqn7 = this.F[n5];
                if (aqn7.i) continue;
                float f2 = aqn6.e + aqn6.a(aqn7);
                if (aqn7.a() && !(f2 < aqn7.e)) continue;
                aqn7.h = aqn6;
                aqn7.e = f2;
                aqn7.f = aqn7.a(aqn3);
                if (aqn7.a()) {
                    this.H.a(aqn7, aqn7.e + aqn7.f);
                    continue;
                }
                aqn7.g = aqn7.e + aqn7.f;
                this.H.a(aqn7);
            }
        }
        if (aqn5 == aqn4) {
            return null;
        }
        A.a("Failed to find path from {} to {}", n2, n3);
        if (aqn2 != null) {
            aqn2.h = aqn5;
            aqn5 = aqn2;
        }
        return this.a(aqn4, aqn5);
    }

    private dbn a(aqn aqn2, aqn aqn3) {
        int n2 = 1;
        aqn aqn4 = aqn3;
        while (aqn4.h != null) {
            ++n2;
            aqn4 = aqn4.h;
        }
        aqn[] arraqn = new aqn[n2];
        aqn4 = aqn3;
        arraqn[--n2] = aqn4;
        while (aqn4.h != null) {
            aqn4 = aqn4.h;
            arraqn[--n2] = aqn4;
        }
        return new dbn(arraqn);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "EnderDragon");
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("DragonPhase", this.C.a().d().b());
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        if (bvp2.e("DragonPhase")) {
            this.C.a(baw.a(bvp2.h("DragonPhase")));
        }
    }

    @Override
    protected void av() {
    }

    @Override
    public cpk[] at_() {
        return this.d;
    }

    @Override
    public boolean bc_() {
        return false;
    }

    @Override
    public iu b() {
        return this.aQ;
    }

    @Override
    public csg y() {
        return csg.f;
    }

    @Override
    protected bi q() {
        return dah.aO;
    }

    @Override
    protected bi r() {
        return dah.aT;
    }

    @Override
    protected float t() {
        return 5.0f;
    }

    public float a(int n2, double[] arrd, double[] arrd2) {
        double d2;
        ajd ajd2 = this.C.a();
        baw baw2 = ajd2.d();
        if (baw2 == baw.d || baw2 == baw.e) {
            cmz cmz2 = this.aQ.p(apk.a);
            float f2 = Math.max(cmk.a(this.f(cmz2)) / 4.0f, 1.0f);
            d2 = (float)n2 / f2;
        } else {
            d2 = ajd2.h() ? (double)n2 : (n2 == 6 ? 0.0 : arrd2[1] - arrd[1]);
        }
        return (float)d2;
    }

    public amj d(float f2) {
        amj amj2;
        ajd ajd2 = this.C.a();
        baw baw2 = ajd2.d();
        if (baw2 == baw.d || baw2 == baw.e) {
            cmz cmz2 = this.aQ.p(apk.a);
            float f3 = Math.max(cmk.a(this.f(cmz2)) / 4.0f, 1.0f);
            float f4 = 6.0f / f3;
            float f5 = this.bb;
            float f6 = 1.5f;
            this.bb = -f4 * 1.5f * 5.0f;
            amj2 = this.l(f2);
            this.bb = f5;
        } else if (ajd2.h()) {
            float f7 = this.bb;
            float f8 = 1.5f;
            this.bb = -45.0f;
            amj2 = this.l(f2);
            this.bb = f7;
        } else {
            amj2 = this.l(f2);
        }
        return amj2;
    }

    public void a(abi abi2, cmz cmz2, ahy ahy2) {
        bdl bdl2 = ahy2.b() instanceof bdl ? (bdl)ahy2.b() : this.aQ.a(cmz2, 64.0, 64.0);
        if (abi2 == this.z) {
            this.a(this.e, ahy.c(bdl2), 10.0f);
        }
        this.C.a().a(abi2, cmz2, ahy2, bdl2);
    }

    @Override
    public void a(bcz bcz2) {
        if (a.equals(bcz2) && this.aQ.C) {
            this.C.a(baw.a((Integer)this.bY().a(a)));
        }
        super.a(bcz2);
    }

    public bhh aL() {
        return this.C;
    }

    public cmd aM() {
        return this.B;
    }

    @Override
    public void b(cko cko2) {
    }

    @Override
    protected boolean f_(cpk cpk2) {
        return false;
    }

    @Override
    public boolean aB_() {
        return false;
    }
}

