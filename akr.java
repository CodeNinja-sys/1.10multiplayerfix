/*
 * Decompiled with CFR 0.150.
 */
public class akr
extends xy
implements cso {
    private static final bcz d = bwm.a(akr.class, cbf.b);
    public float a;
    public float b;
    public float c;
    private boolean e;

    public akr(iu iu2) {
        super(iu2);
        this.j = new all(this);
    }

    @Override
    protected void n() {
        this.m.a(1, new bps(this));
        this.m.a(2, new ke(this));
        this.m.a(3, new cvz(this));
        this.m.a(5, new aiv(this));
        this.n.a(1, new cqs(this));
        this.n.a(3, new afu(this, hx.class));
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(d, 1);
    }

    protected void d(int n2) {
        this.bE.b(d, n2);
        this.a_(0.51000005f * (float)n2, 0.51000005f * (float)n2);
        this.d(this.aU, this.aV, this.aW);
        this.a(cgz.a).a((double)(n2 * n2));
        this.a(cgz.d).a(0.2f + 0.1f * (float)n2);
        this.k(this.bo());
        this.i = n2;
    }

    public int B() {
        return (Integer)this.bE.a(d);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Slime");
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Size", this.B() - 1);
        bvp2.a("wasOnGround", this.e);
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        int n2 = bvp2.h("Size");
        if (n2 < 0) {
            n2 = 0;
        }
        this.d(n2 + 1);
        this.e = bvp2.p("wasOnGround");
    }

    public boolean D() {
        return this.B() <= 1;
    }

    protected lz F() {
        return lz.H;
    }

    @Override
    public void bb_() {
        if (!this.aQ.C && this.aQ.Q() == ct.a && this.B() > 0) {
            this.bk = true;
        }
        this.b += (this.a - this.b) * 0.5f;
        this.c = this.b;
        super.bb_();
        if (this.be && !this.e) {
            int n2 = this.B();
            for (int i2 = 0; i2 < n2 * 8; ++i2) {
                float f2 = this.bx.nextFloat() * ((float)Math.PI * 2);
                float f3 = this.bx.nextFloat() * 0.5f + 0.5f;
                float f4 = cmk.a(f2) * (float)n2 * 0.5f * f3;
                float f5 = cmk.b(f2) * (float)n2 * 0.5f * f3;
                this.aQ.a(this.F(), this.aU + (double)f4, this.cD().b, this.aW + (double)f5, 0.0, 0.0, 0.0, new int[0]);
            }
            this.a(this.Z(), this.t(), ((this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f) / 0.8f);
            this.a = -0.5f;
        } else if (!this.be && this.e) {
            this.a = 1.0f;
        }
        this.e = this.be;
        this.L();
    }

    protected void L() {
        this.a *= 0.6f;
    }

    protected int M() {
        return this.bx.nextInt(20) + 10;
    }

    protected akr Q() {
        return new akr(this.aQ);
    }

    @Override
    public void a(bcz bcz2) {
        if (d.equals(bcz2)) {
            int n2 = this.B();
            this.a_(0.51000005f * (float)n2, 0.51000005f * (float)n2);
            this.ba = this.aj;
            this.ah = this.aj;
            if (this.V_() && this.bx.nextInt(20) == 0) {
                this.J_();
            }
        }
        super.a(bcz2);
    }

    @Override
    public void ak_() {
        int n2 = this.B();
        if (!this.aQ.C && n2 > 1 && this.bh() <= 0.0f) {
            int n3 = 2 + this.bx.nextInt(3);
            for (int i2 = 0; i2 < n3; ++i2) {
                float f2 = ((float)(i2 % 2) - 0.5f) * (float)n2 / 4.0f;
                float f3 = ((float)(i2 / 2) - 0.5f) * (float)n2 / 4.0f;
                akr akr2 = this.Q();
                if (this.j_()) {
                    akr2.g(this.cA());
                }
                if (this.aE()) {
                    akr2.aC();
                }
                akr2.d(n2 / 2);
                akr2.a_(this.aU + (double)f2, this.aV + 0.5, this.aW + (double)f3, this.bx.nextFloat() * 360.0f, 0.0f);
                this.aQ.b(akr2);
            }
        }
        super.ak_();
    }

    @Override
    public void e_(cpk cpk2) {
        super.e_(cpk2);
        if (cpk2 instanceof hx && this.T()) {
            this.c((bga)cpk2);
        }
    }

    @Override
    public void b_(bdl bdl2) {
        if (this.T()) {
            this.c((bga)bdl2);
        }
    }

    protected void c(bga bga2) {
        int n2 = this.B();
        if (this.j(bga2) && this.l(bga2) < 0.6 * (double)n2 * (0.6 * (double)n2) && bga2.a(ahy.b(this), (float)this.Y())) {
            this.a(dah.fB, 1.0f, (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f);
            this.a(this, bga2);
        }
    }

    @Override
    public float A() {
        return 0.625f * this.bm;
    }

    protected boolean T() {
        return !this.D();
    }

    protected int Y() {
        return this.B();
    }

    @Override
    protected bi r() {
        if (this.D()) {
            return dah.fP;
        }
        return dah.fG;
    }

    @Override
    protected bi s() {
        if (this.D()) {
            return dah.fO;
        }
        return dah.fD;
    }

    protected bi Z() {
        if (this.D()) {
            return dah.fR;
        }
        return dah.fJ;
    }

    @Override
    protected azg au() {
        if (this.B() == 1) {
            return hp.aT;
        }
        return null;
    }

    @Override
    protected bpx u() {
        return this.B() == 1 ? bvm.ae : bvm.a;
    }

    @Override
    public boolean h() {
        cmz cmz2 = new cmz(cmk.c(this.aU), 0, cmk.c(this.aW));
        bhm bhm2 = this.aQ.e(cmz2);
        if (this.aQ.E().s() == aaf.c && this.bx.nextInt(4) != 1) {
            return false;
        }
        if (this.aQ.Q() != ct.a) {
            anr anr2 = this.aQ.a(cmz2);
            if (anr2 == cff.h && this.aV > 50.0 && this.aV < 70.0 && this.bx.nextFloat() < 0.5f && this.bx.nextFloat() < this.aQ.j() && this.aQ.j(new cmz(this)) <= this.bx.nextInt(8)) {
                return super.h();
            }
            if (this.bx.nextInt(10) == 0 && bhm2.a(987234911L).nextInt(10) == 0 && this.aV < 40.0) {
                return super.h();
            }
        }
        return false;
    }

    @Override
    protected float t() {
        return 0.4f * (float)this.B();
    }

    @Override
    public int aw() {
        return 0;
    }

    protected boolean ab() {
        return this.B() > 0;
    }

    @Override
    protected void ad_() {
        this.aY = 0.42f;
        this.bO = true;
    }

    @Override
    public aql a(bgp bgp2, aql aql2) {
        int n2 = this.bx.nextInt(3);
        if (n2 < 2 && this.bx.nextFloat() < 0.5f * bgp2.c()) {
            ++n2;
        }
        int n3 = 1 << n2;
        this.d(n3);
        return super.a(bgp2, aql2);
    }

    protected bi ae() {
        return this.D() ? dah.fQ : dah.fH;
    }
}

