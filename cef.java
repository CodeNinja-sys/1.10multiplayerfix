/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import net.minecraft.c.a;

public abstract class cef
extends cpk
implements cnq {
    private static final bcz a = bwm.a(cef.class, cbf.b);
    private static final bcz b = bwm.a(cef.class, cbf.b);
    private static final bcz c = bwm.a(cef.class, cbf.c);
    private static final bcz d = bwm.a(cef.class, cbf.b);
    private static final bcz e = bwm.a(cef.class, cbf.b);
    private static final bcz f = bwm.a(cef.class, cbf.h);
    private boolean g;
    private static final int[][][] h = new int[][][]{new int[][]{{0, 0, -1}, {0, 0, 1}}, new int[][]{{-1, 0, 0}, {1, 0, 0}}, new int[][]{{-1, -1, 0}, {1, 0, 0}}, new int[][]{{-1, 0, 0}, {1, -1, 0}}, new int[][]{{0, 0, -1}, {0, -1, 1}}, new int[][]{{0, -1, -1}, {0, 0, 1}}, new int[][]{{0, 0, 1}, {1, 0, 0}}, new int[][]{{0, 0, 1}, {-1, 0, 0}}, new int[][]{{0, 0, -1}, {-1, 0, 0}}, new int[][]{{0, 0, -1}, {1, 0, 0}}};
    private int i;
    private double j;
    private double k;
    private double l;
    private double m;
    private double n;
    private double o;
    private double p;
    private double q;

    public cef(iu iu2) {
        super(iu2);
        this.aN = true;
        this.a_(0.98f, 0.7f);
    }

    public static cef a(iu iu2, double d2, double d3, double d4, cta cta2) {
        switch (cta2) {
            case b: {
                return new cxa(iu2, d2, d3, d4);
            }
            case c: {
                return new ww(iu2, d2, d3, d4);
            }
            case d: {
                return new ji(iu2, d2, d3, d4);
            }
            case e: {
                return new bnc(iu2, d2, d3, d4);
            }
            case f: {
                return new dfc(iu2, d2, d3, d4);
            }
            case g: {
                return new dbu(iu2, d2, d3, d4);
            }
        }
        return new rg(iu2, d2, d3, d4);
    }

    @Override
    protected boolean e() {
        return false;
    }

    @Override
    protected void a() {
        this.bE.a(a, 0);
        this.bE.a(b, 1);
        this.bE.a(c, Float.valueOf(0.0f));
        this.bE.a(d, 0);
        this.bE.a(e, 6);
        this.bE.a(f, false);
    }

    @Override
    public cxt a_(cpk cpk2) {
        if (cpk2.P()) {
            return cpk2.cD();
        }
        return null;
    }

    @Override
    public cxt ao_() {
        return null;
    }

    @Override
    public boolean P() {
        return true;
    }

    public cef(iu iu2, double d2, double d3, double d4) {
        this(iu2);
        this.d(d2, d3, d4);
        this.aX = 0.0;
        this.aY = 0.0;
        this.aZ = 0.0;
        this.aR = d2;
        this.aS = d3;
        this.aT = d4;
    }

    @Override
    public double ag() {
        return 0.0;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        boolean bl2;
        if (this.aQ.C || this.bk) {
            return true;
        }
        if (this.c(ahy2)) {
            return false;
        }
        this.e(-this.E());
        this.d(10);
        this.bz();
        this.c(this.B() + f2 * 10.0f);
        boolean bl3 = bl2 = ahy2.b() instanceof bdl && ((bdl)ahy2.b()).G.d;
        if (bl2 || this.B() > 40.0f) {
            this.cl();
            if (!bl2 || this.j_()) {
                this.a(ahy2);
            } else {
                this.ak_();
            }
        }
        return true;
    }

    public void a(ahy ahy2) {
        this.ak_();
        if (this.aQ.F().b("doEntityDrops")) {
            bhl bhl2 = new bhl(hp.aB, 1);
            if (this.i_() != null) {
                bhl2.a(this.i_());
            }
            this.a(bhl2, 0.0f);
        }
    }

    @Override
    public void bk() {
        this.e(-this.E());
        this.d(10);
        this.c(this.B() + this.B() * 10.0f);
    }

    @Override
    public boolean bc_() {
        return !this.bk;
    }

    @Override
    public void ak_() {
        super.ak_();
    }

    @Override
    public bqk L_() {
        return this.g ? this.B_().e().f() : this.B_().f();
    }

    @Override
    public void bb_() {
        double d2;
        cmz cmz2;
        dbk dbk2;
        int n2;
        int n3;
        int n4;
        if (this.C() > 0) {
            this.d(this.C() - 1);
        }
        if (this.B() > 0.0f) {
            this.c(this.B() - 1.0f);
        }
        if (this.aV < -64.0) {
            this.bq();
        }
        if (!this.aQ.C && this.aQ instanceof alj) {
            this.aQ.A.a("portal");
            a a2 = this.aQ.f();
            n4 = this.al_();
            if (this.bQ) {
                if (a2.E()) {
                    if (!this.cp() && this.bR++ >= n4) {
                        this.bR = n4;
                        this.bP = this.aq_();
                        n3 = this.aQ.q.a().a() == -1 ? 0 : -1;
                        this.e_(n3);
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
                double d3 = this.aU + (this.j - this.aU) / (double)this.i;
                double d4 = this.aV + (this.k - this.aV) / (double)this.i;
                double d5 = this.aW + (this.l - this.aW) / (double)this.i;
                double d6 = cmk.g(this.m - (double)this.ba);
                this.ba = (float)((double)this.ba + d6 / (double)this.i);
                this.bb = (float)((double)this.bb + (this.n - (double)this.bb) / (double)this.i);
                --this.i;
                this.d(d3, d4, d5);
                this.e(this.ba, this.bb);
            } else {
                this.d(this.aU, this.aV, this.aW);
                this.e(this.ba, this.bb);
            }
            return;
        }
        this.aR = this.aU;
        this.aS = this.aV;
        this.aT = this.aW;
        if (!this.cf()) {
            this.aY -= (double)0.04f;
        }
        if (bxs.c(this.aQ, new cmz(n2 = cmk.c(this.aU), (n4 = cmk.c(this.aV)) - 1, n3 = cmk.c(this.aW)))) {
            --n4;
        }
        if (bxs.m(dbk2 = this.aQ.n(cmz2 = new cmz(n2, n4, n3)))) {
            this.a(cmz2, dbk2);
            if (dbk2.t() == blg.cs) {
                this.a(n2, n4, n3, (Boolean)dbk2.b(gm.b));
            }
        } else {
            this.w();
        }
        this.cd();
        this.bb = 0.0f;
        double d7 = this.aR - this.aU;
        double d8 = this.aT - this.aW;
        if (d7 * d7 + d8 * d8 > 0.001) {
            this.ba = (float)(cmk.b(d8, d7) * 180.0 / Math.PI);
            if (this.g) {
                this.ba += 180.0f;
            }
        }
        if ((d2 = (double)cmk.g(this.ba - this.bc)) < -170.0 || d2 >= 170.0) {
            this.ba += 180.0f;
            this.g = !this.g;
        }
        this.e(this.ba, this.bb);
        if (this.bd_() == cta.a && this.aX * this.aX + this.aZ * this.aZ > 0.01) {
            List list = this.aQ.a((cpk)this, this.cD().b((double)0.2f, 0.0, 0.2f), auxx.a(this));
            if (!list.isEmpty()) {
                for (int i2 = 0; i2 < list.size(); ++i2) {
                    cpk cpk2 = (cpk)list.get(i2);
                    if (cpk2 instanceof bdl || cpk2 instanceof hx || cpk2 instanceof cef || this.cq() || cpk2.cp()) {
                        cpk2.e_(this);
                        continue;
                    }
                    cpk2.m(this);
                }
            }
        } else {
            for (cpk cpk3 : this.aQ.b((cpk)this, this.cD().b((double)0.2f, 0.0, 0.2f))) {
                if (this.r(cpk3) || !cpk3.P() || !(cpk3 instanceof cef)) continue;
                cpk3.e_(this);
            }
        }
        this.bf_();
    }

    protected double aw_() {
        return 0.4;
    }

    public void a(int n2, int n3, int n4, boolean bl2) {
    }

    protected void w() {
        double d2 = this.aw_();
        this.aX = cmk.a(this.aX, -d2, d2);
        this.aZ = cmk.a(this.aZ, -d2, d2);
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

    protected void a(cmz cmz2, dbk dbk2) {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        cpk cpk2;
        double d9;
        this.bq = 0.0f;
        amj amj2 = this.f(this.aU, this.aV, this.aW);
        this.aV = cmz2.b();
        boolean bl2 = false;
        boolean bl3 = false;
        bxs bxs2 = (bxs)dbk2.t();
        if (bxs2 == blg.D) {
            bl2 = (Boolean)dbk2.b(gm.b);
            bl3 = !bl2;
        }
        double d10 = 0.0078125;
        ctp ctp2 = (ctp)((Object)dbk2.b(bxs2.d()));
        switch (ctp2) {
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
        int[][] arrn = h[ctp2.b()];
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
        cpk cpk3 = cpk2 = this.cH().isEmpty() ? null : (cpk)this.cH().get(0);
        if (cpk2 instanceof bga && (d8 = (double)((bga)cpk2).az) > 0.0) {
            d7 = -Math.sin(cpk2.ba * ((float)Math.PI / 180));
            d6 = Math.cos(cpk2.ba * ((float)Math.PI / 180));
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
        d8 = (double)cmz2.a() + 0.5 + (double)arrn[0][0] * 0.5;
        d7 = (double)cmz2.c() + 0.5 + (double)arrn[0][2] * 0.5;
        d6 = (double)cmz2.a() + 0.5 + (double)arrn[1][0] * 0.5;
        d5 = (double)cmz2.c() + 0.5 + (double)arrn[1][2] * 0.5;
        d11 = d6 - d8;
        d12 = d5 - d7;
        if (d11 == 0.0) {
            this.aU = (double)cmz2.a() + 0.5;
            d4 = this.aW - (double)cmz2.c();
        } else if (d12 == 0.0) {
            this.aW = (double)cmz2.c() + 0.5;
            d4 = this.aU - (double)cmz2.a();
        } else {
            d3 = this.aU - d8;
            d2 = this.aW - d7;
            d4 = (d3 * d11 + d2 * d12) * 2.0;
        }
        this.aU = d8 + d11 * d4;
        this.aW = d7 + d12 * d4;
        this.d(this.aU, this.aV, this.aW);
        d3 = this.aX;
        d2 = this.aZ;
        if (this.cq()) {
            d3 *= 0.75;
            d2 *= 0.75;
        }
        double d15 = this.aw_();
        d3 = cmk.a(d3, -d15, d15);
        d2 = cmk.a(d2, -d15, d15);
        this.b(d3, 0.0, d2);
        if (arrn[0][1] != 0 && cmk.c(this.aU) - cmz2.a() == arrn[0][0] && cmk.c(this.aW) - cmz2.c() == arrn[0][2]) {
            this.d(this.aU, this.aV + (double)arrn[0][1], this.aW);
        } else if (arrn[1][1] != 0 && cmk.c(this.aU) - cmz2.a() == arrn[1][0] && cmk.c(this.aW) - cmz2.c() == arrn[1][2]) {
            this.d(this.aU, this.aV + (double)arrn[1][1], this.aW);
        }
        this.ax_();
        amj amj3 = this.f(this.aU, this.aV, this.aW);
        if (amj3 != null && amj2 != null) {
            double d16 = (amj2.c - amj3.c) * 0.05;
            d9 = Math.sqrt(this.aX * this.aX + this.aZ * this.aZ);
            if (d9 > 0.0) {
                this.aX = this.aX / d9 * (d9 + d16);
                this.aZ = this.aZ / d9 * (d9 + d16);
            }
            this.d(this.aU, amj3.c, this.aW);
        }
        int n2 = cmk.c(this.aU);
        int n3 = cmk.c(this.aW);
        if (n2 != cmz2.a() || n3 != cmz2.c()) {
            d9 = Math.sqrt(this.aX * this.aX + this.aZ * this.aZ);
            this.aX = d9 * (double)(n2 - cmz2.a());
            this.aZ = d9 * (double)(n3 - cmz2.c());
        }
        if (bl2) {
            double d17 = Math.sqrt(this.aX * this.aX + this.aZ * this.aZ);
            if (d17 > 0.01) {
                double d18 = 0.06;
                this.aX += this.aX / d17 * 0.06;
                this.aZ += this.aZ / d17 * 0.06;
            } else if (ctp2 == ctp.b) {
                if (this.aQ.n(cmz2.k()).l()) {
                    this.aX = 0.02;
                } else if (this.aQ.n(cmz2.l()).l()) {
                    this.aX = -0.02;
                }
            } else if (ctp2 == ctp.a) {
                if (this.aQ.n(cmz2.i()).l()) {
                    this.aZ = 0.02;
                } else if (this.aQ.n(cmz2.j()).l()) {
                    this.aZ = -0.02;
                }
            }
        }
    }

    protected void ax_() {
        if (this.cq()) {
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
    public void d(double d2, double d3, double d4) {
        this.aU = d2;
        this.aV = d3;
        this.aW = d4;
        float f2 = this.bl / 2.0f;
        float f3 = this.bm;
        this.a(new cxt(d2 - (double)f2, d3, d4 - (double)f2, d2 + (double)f2, d3 + (double)f3, d4 + (double)f2));
    }

    public amj a(double d2, double d3, double d4, double d5) {
        dbk dbk2;
        int n2;
        int n3;
        int n4 = cmk.c(d2);
        if (bxs.c(this.aQ, new cmz(n4, (n3 = cmk.c(d3)) - 1, n2 = cmk.c(d4)))) {
            --n3;
        }
        if (bxs.m(dbk2 = this.aQ.n(new cmz(n4, n3, n2)))) {
            ctp ctp2 = (ctp)((Object)dbk2.b(((bxs)dbk2.t()).d()));
            d3 = n3;
            if (ctp2.c()) {
                d3 = n3 + 1;
            }
            int[][] arrn = h[ctp2.b()];
            double d6 = arrn[1][0] - arrn[0][0];
            double d7 = arrn[1][2] - arrn[0][2];
            double d8 = Math.sqrt(d6 * d6 + d7 * d7);
            if (arrn[0][1] != 0 && cmk.c(d2 += (d6 /= d8) * d5) - n4 == arrn[0][0] && cmk.c(d4 += (d7 /= d8) * d5) - n2 == arrn[0][2]) {
                d3 += (double)arrn[0][1];
            } else if (arrn[1][1] != 0 && cmk.c(d2) - n4 == arrn[1][0] && cmk.c(d4) - n2 == arrn[1][2]) {
                d3 += (double)arrn[1][1];
            }
            return this.f(d2, d3, d4);
        }
        return null;
    }

    public amj f(double d2, double d3, double d4) {
        dbk dbk2;
        int n2;
        int n3;
        int n4 = cmk.c(d2);
        if (bxs.c(this.aQ, new cmz(n4, (n3 = cmk.c(d3)) - 1, n2 = cmk.c(d4)))) {
            --n3;
        }
        if (bxs.m(dbk2 = this.aQ.n(new cmz(n4, n3, n2)))) {
            double d5;
            ctp ctp2 = (ctp)((Object)dbk2.b(((bxs)dbk2.t()).d()));
            int[][] arrn = h[ctp2.b()];
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
            return new amj(d2, d3, d4);
        }
        return null;
    }

    @Override
    public cxt M_() {
        cxt cxt2 = this.cD();
        if (this.K()) {
            return cxt2.b((double)Math.abs(this.I()) / 16.0);
        }
        return cxt2;
    }

    public static void b(cgy cgy2, String string) {
    }

    @Override
    protected void b(bvp bvp2) {
        if (bvp2.p("CustomDisplayTile")) {
            bfa bfa2 = bvp2.b("DisplayTile", 8) ? bfa.a(bvp2.l("DisplayTile")) : bfa.f(bvp2.h("DisplayTile"));
            int n2 = bvp2.h("DisplayData");
            this.a(bfa2 == null ? blg.a.s() : bfa2.a(n2));
            this.f(bvp2.h("DisplayOffset"));
        }
    }

    @Override
    protected void a(bvp bvp2) {
        if (this.K()) {
            bvp2.a("CustomDisplayTile", true);
            dbk dbk2 = this.H();
            bpx bpx2 = (bpx)bfa.v.b(dbk2.t());
            bvp2.a("DisplayTile", bpx2 == null ? "" : bpx2.toString());
            bvp2.a("DisplayData", dbk2.t().e(dbk2));
            bvp2.a("DisplayOffset", this.I());
        }
    }

    @Override
    public void e_(cpk cpk2) {
        if (this.aQ.C) {
            return;
        }
        if (cpk2.bv || this.bv) {
            return;
        }
        if (this.r(cpk2)) {
            return;
        }
        double d2 = cpk2.aU - this.aU;
        double d3 = cpk2.aW - this.aW;
        double d4 = d2 * d2 + d3 * d3;
        if (d4 >= (double)1.0E-4f) {
            d4 = cmk.a(d4);
            d2 /= d4;
            d3 /= d4;
            double d5 = 1.0 / d4;
            if (d5 > 1.0) {
                d5 = 1.0;
            }
            d2 *= d5;
            d3 *= d5;
            d2 *= (double)0.1f;
            d3 *= (double)0.1f;
            d2 *= (double)(1.0f - this.bw);
            d3 *= (double)(1.0f - this.bw);
            d2 *= 0.5;
            d3 *= 0.5;
            if (cpk2 instanceof cef) {
                amj amj2;
                double d6 = cpk2.aU - this.aU;
                double d7 = cpk2.aW - this.aW;
                amj amj3 = new amj(d6, 0.0, d7).a();
                double d8 = Math.abs(amj3.b(amj2 = new amj(cmk.b(this.ba * ((float)Math.PI / 180)), 0.0, cmk.a(this.ba * ((float)Math.PI / 180))).a()));
                if (d8 < (double)0.8f) {
                    return;
                }
                double d9 = cpk2.aX + this.aX;
                double d10 = cpk2.aZ + this.aZ;
                if (((cef)cpk2).bd_() == cta.c && this.bd_() != cta.c) {
                    this.aX *= (double)0.2f;
                    this.aZ *= (double)0.2f;
                    this.c(cpk2.aX - d2, 0.0, cpk2.aZ - d3);
                    cpk2.aX *= (double)0.95f;
                    cpk2.aZ *= (double)0.95f;
                } else if (((cef)cpk2).bd_() != cta.c && this.bd_() == cta.c) {
                    cpk2.aX *= (double)0.2f;
                    cpk2.aZ *= (double)0.2f;
                    cpk2.c(this.aX + d2, 0.0, this.aZ + d3);
                    this.aX *= (double)0.95f;
                    this.aZ *= (double)0.95f;
                } else {
                    this.aX *= (double)0.2f;
                    this.aZ *= (double)0.2f;
                    this.c((d9 /= 2.0) - d2, 0.0, (d10 /= 2.0) - d3);
                    cpk2.aX *= (double)0.2f;
                    cpk2.aZ *= (double)0.2f;
                    cpk2.c(d9 + d2, 0.0, d10 + d3);
                }
            } else {
                this.c(-d2, 0.0, -d3);
                cpk2.c(d2 / 4.0, 0.0, d3 / 4.0);
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
    public void a(double d2, double d3, double d4) {
        this.aX = d2;
        this.aY = d3;
        this.aZ = d4;
        this.o = this.aX;
        this.p = this.aY;
        this.q = this.aZ;
    }

    public void c(float f2) {
        this.bE.b(c, Float.valueOf(f2));
    }

    public float B() {
        return ((Float)this.bE.a(c)).floatValue();
    }

    public void d(int n2) {
        this.bE.b(a, n2);
    }

    public int C() {
        return (Integer)this.bE.a(a);
    }

    public void e(int n2) {
        this.bE.b(b, n2);
    }

    public int E() {
        return (Integer)this.bE.a(b);
    }

    public abstract cta bd_();

    public dbk H() {
        if (!this.K()) {
            return this.be_();
        }
        return bfa.g((Integer)this.bY().a(d));
    }

    public dbk be_() {
        return blg.a.s();
    }

    public int I() {
        if (!this.K()) {
            return this.J();
        }
        return (Integer)this.bY().a(e);
    }

    public int J() {
        return 6;
    }

    public void a(dbk dbk2) {
        this.bY().b(d, bfa.u(dbk2));
        this.d(true);
    }

    public void f(int n2) {
        this.bY().b(e, n2);
        this.d(true);
    }

    public boolean K() {
        return (Boolean)this.bY().a(f);
    }

    public void d(boolean bl2) {
        this.bY().b(f, bl2);
    }
}

