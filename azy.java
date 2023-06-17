/*
 * Decompiled with CFR 0.150.
 */
import java.util.Calendar;

public class azy
extends acm
implements cyt {
    private static final bcz a = bwm.a(azy.class, cbf.b);
    private static final bcz b = bwm.a(azy.class, cbf.h);
    private final aji c = new aji(this, 1.0, 20, 15.0f);
    private final eu d = new cqt(this, this, 1.2, false);

    public azy(iu iu2) {
        super(iu2);
        this.T();
    }

    @Override
    protected void n() {
        this.m.a(1, new baf(this));
        this.m.a(2, new cwh(this));
        this.m.a(3, new cnz(this, 1.0));
        this.m.a(3, new cgk(this, cqw.class, 6.0f, 1.0, 1.2));
        this.m.a(5, new vq(this, 1.0));
        this.m.a(6, new chx(this, bdl.class, 8.0f));
        this.m.a(6, new bzv(this));
        this.n.a(1, new ahx((cfl)this, false, new Class[0]));
        this.n.a(2, new cyx((cfl)this, bdl.class, true));
        this.n.a(3, new cyx((cfl)this, hx.class, true));
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.d).a(0.25);
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, aoy.a.a());
        this.bE.a(b, false);
    }

    @Override
    protected bi q() {
        return this.Z().c();
    }

    @Override
    protected bi r() {
        return this.Z().d();
    }

    @Override
    protected bi s() {
        return this.Z().e();
    }

    @Override
    protected void a(cmz cmz2, bfa bfa2) {
        bi bi2 = this.Z().f();
        this.a(bi2, 0.15f, 1.0f);
    }

    @Override
    public boolean a(cpk cpk2) {
        if (super.a(cpk2)) {
            if (this.Z() == aoy.b && cpk2 instanceof bga) {
                ((bga)cpk2).b(new cko(ake.t, 200));
            }
            return true;
        }
        return false;
    }

    @Override
    public agh ak() {
        return agh.b;
    }

    @Override
    public void Q_() {
        if (this.aQ.h() && !this.aQ.C) {
            cmz cmz2;
            float f2 = this.a(1.0f);
            cmz cmz3 = cmz2 = this.cL() instanceof cor ? new cmz(this.aU, Math.round(this.aV), this.aW).g() : new cmz(this.aU, Math.round(this.aV), this.aW);
            if (f2 > 0.5f && this.bx.nextFloat() * 30.0f < (f2 - 0.4f) * 2.0f && this.aQ.g(cmz2)) {
                boolean bl2 = true;
                bhl bhl2 = this.a(dfm.f);
                if (bhl2 != null) {
                    if (bhl2.d()) {
                        bhl2.b(bhl2.g() + this.bx.nextInt(2));
                        if (bhl2.g() >= bhl2.i()) {
                            this.e(bhl2);
                            this.a(dfm.f, null);
                        }
                    }
                    bl2 = false;
                }
                if (bl2) {
                    this.m(8);
                }
            }
        }
        if (this.aQ.C) {
            this.b(this.Z());
        }
        super.Q_();
    }

    @Override
    public void af_() {
        super.af_();
        if (this.cL() instanceof cfl) {
            cfl cfl2 = (cfl)this.cL();
            this.ah = cfl2.ah;
        }
    }

    @Override
    public void a(ahy ahy2) {
        super.a(ahy2);
        if (ahy2.a() instanceof cwt && ahy2.b() instanceof bdl) {
            bdl bdl2 = (bdl)ahy2.b();
            double d2 = bdl2.aU - this.aU;
            double d3 = bdl2.aW - this.aW;
            if (d2 * d2 + d3 * d3 >= 2500.0) {
                bdl2.a((cyd)bpa.v);
            }
        } else if (ahy2.b() instanceof ddh && ((ddh)ahy2.b()).T() && ((ddh)ahy2.b()).aQ()) {
            ((ddh)ahy2.b()).aR();
            this.a(new bhl(hp.ch, 1, this.Z() == aoy.b ? 1 : 0), 0.0f);
        }
    }

    @Override
    protected bpx u() {
        return this.Z().b();
    }

    @Override
    protected void a(bgp bgp2) {
        super.a(bgp2);
        this.a(dfm.a, new bhl(hp.f));
    }

    @Override
    public aql a(bgp bgp2, aql aql2) {
        Object object;
        aql2 = super.a(bgp2, aql2);
        if (this.aQ.q instanceof cer && this.aW().nextInt(5) > 0) {
            this.m.a(4, this.d);
            this.a(aoy.b);
            this.a(dfm.a, new bhl(hp.s));
            this.a(cgz.e).a(4.0);
        } else {
            object = this.aQ.a(new cmz(this));
            if (object instanceof axa && this.aQ.g(new cmz(this)) && this.bx.nextInt(5) != 0) {
                this.a(aoy.c);
            }
            this.m.a(4, this.c);
            this.a(bgp2);
            this.b(bgp2);
        }
        this.l(this.bx.nextFloat() < 0.55f * bgp2.c());
        if (this.a(dfm.f) == null && ((Calendar)(object = this.aQ.O())).get(2) + 1 == 10 && ((Calendar)object).get(5) == 31 && this.bx.nextFloat() < 0.25f) {
            this.a(dfm.f, new bhl(this.bx.nextFloat() < 0.1f ? blg.aZ : blg.aU));
            this.p[dfm.f.b()] = 0.0f;
        }
        return aql2;
    }

    public void T() {
        if (this.aQ != null && !this.aQ.C) {
            this.m.a(this.d);
            this.m.a(this.c);
            bhl bhl2 = this.bt();
            if (bhl2 != null && bhl2.a() == hp.f) {
                int n2 = 20;
                if (this.aQ.Q() != ct.d) {
                    n2 = 40;
                }
                this.c.b(n2);
                this.m.a(4, this.c);
            } else {
                this.m.a(4, this.d);
            }
        }
    }

    @Override
    public void a(bga bga2, float f2) {
        bhl bhl2;
        bib bib2 = new bib(this.aQ, this);
        double d2 = bga2.aU - this.aU;
        double d3 = bga2.cD().b + (double)(bga2.bm / 3.0f) - bib2.aV;
        double d4 = bga2.aW - this.aW;
        double d5 = cmk.a(d2 * d2 + d4 * d4);
        bib2.a(d2, d3 + d5 * (double)0.2f, d4, 1.6f, (float)(14 - this.aQ.Q().a() * 4));
        int n2 = acz.a(bbh.u, this);
        int n3 = acz.a(bbh.v, this);
        bgp bgp2 = this.aQ.C(new cmz(this));
        bib2.b((double)(f2 * 2.0f) + (this.bx.nextGaussian() * 0.25 + (double)((float)this.aQ.Q().a() * 0.11f)));
        if (n2 > 0) {
            bib2.b(bib2.w() + (double)n2 * 0.5 + 0.5);
        }
        if (n3 > 0) {
            bib2.c(n3);
        }
        boolean bl2 = this.y_() && bgp2.b() && this.bx.nextBoolean() || this.Z() == aoy.b;
        boolean bl3 = bl2 = bl2 || acz.a(bbh.w, this) > 0;
        if (bl2) {
            bib2.m(100);
        }
        if ((bhl2 = this.c(bqp.b)) != null && bhl2.a() == hp.i) {
            bib2.a(bhl2);
        } else if (this.Z() == aoy.c) {
            bib2.a(new cko(ake.b, 600));
        }
        this.a(dah.fz, 1.0f, 1.0f / (this.aW().nextFloat() * 0.4f + 0.8f));
        this.aQ.b(bib2);
    }

    public aoy Z() {
        return aoy.a((Integer)this.bE.a(a));
    }

    public void a(aoy aoy2) {
        this.bE.b(a, aoy2.a());
        this.bD = aoy2 == aoy.b;
        this.b(aoy2);
    }

    private void b(aoy aoy2) {
        if (aoy2 == aoy.b) {
            this.a_(0.7f, 2.4f);
        } else {
            this.a_(0.6f, 1.99f);
        }
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Skeleton");
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        if (bvp2.b("SkeletonType", 99)) {
            byte by2 = bvp2.f("SkeletonType");
            this.a(aoy.a(by2));
        }
        this.T();
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("SkeletonType", (byte)this.Z().a());
    }

    @Override
    public void a(dfm dfm2, bhl bhl2) {
        super.a(dfm2, bhl2);
        if (!this.aQ.C && dfm2 == dfm.a) {
            this.T();
        }
    }

    @Override
    public float A() {
        if (this.Z() == aoy.b) {
            return 2.1f;
        }
        return 1.74f;
    }

    @Override
    public double Z_() {
        return -0.35;
    }

    public boolean ae() {
        return (Boolean)this.bE.a(b);
    }

    public void a(boolean bl2) {
        this.bE.b(b, bl2);
    }
}

