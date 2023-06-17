/*
 * Decompiled with CFR 0.150.
 */
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

public class oe
extends acm {
    protected static final cmb a = new ot(null, "zombie.spawnReinforcements", 0.0, 0.0, 1.0).a("Spawn Reinforcements Chance");
    private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
    private static final cs c = new cs(b, "Baby speed boost", 0.5, 1);
    private static final bcz d = bwm.a(oe.class, cbf.h);
    private static final bcz e = bwm.a(oe.class, cbf.b);
    private static final bcz f = bwm.a(oe.class, cbf.h);
    private static final bcz g = bwm.a(oe.class, cbf.h);
    private final cek q = new cek(this);
    private int r;
    private boolean s;
    private float v = -1.0f;
    private float w;

    public oe(iu iu2) {
        super(iu2);
        this.a_(0.6f, 1.95f);
    }

    @Override
    protected void n() {
        this.m.a(0, new baf(this));
        this.m.a(2, new azr(this, 1.0, false));
        this.m.a(5, new byi(this, 1.0));
        this.m.a(7, new vq(this, 1.0));
        this.m.a(8, new chx(this, bdl.class, 8.0f));
        this.m.a(8, new bzv(this));
        this.x();
    }

    protected void x() {
        this.m.a(6, new aee(this, 1.0, false));
        this.n.a(1, new ahx((cfl)this, true, csq.class));
        this.n.a(2, new cyx((cfl)this, bdl.class, true));
        this.n.a(3, new cyx((cfl)this, cwp.class, false));
        this.n.a(3, new cyx((cfl)this, hx.class, true));
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.b).a(35.0);
        this.a(cgz.d).a(0.23f);
        this.a(cgz.e).a(3.0);
        this.a(cgz.g).a(2.0);
        this.bs().b(a).a(this.bx.nextDouble() * (double)0.1f);
    }

    @Override
    protected void a() {
        super.a();
        this.bY().a(d, false);
        this.bY().a(e, 0);
        this.bY().a(f, false);
        this.bY().a(g, false);
    }

    public void a(boolean bl2) {
        this.bY().b(g, bl2);
    }

    public boolean B() {
        return (Boolean)this.bY().a(g);
    }

    public boolean D() {
        return this.s;
    }

    public void c(boolean bl2) {
        if (this.s != bl2) {
            this.s = bl2;
            ((vp)this.ap()).a(bl2);
            if (bl2) {
                this.m.a(1, this.q);
            } else {
                this.m.a(this.q);
            }
        }
    }

    @Override
    public boolean R_() {
        return (Boolean)this.bY().a(d);
    }

    @Override
    protected int c_(bdl bdl2) {
        if (this.R_()) {
            this.i = (int)((float)this.i * 2.5f);
        }
        return super.c_(bdl2);
    }

    public void d(boolean bl2) {
        this.bY().b(d, bl2);
        if (this.aQ != null && !this.aQ.C) {
            cp cp2 = this.a(cgz.d);
            cp2.c(c);
            if (bl2) {
                cp2.b(c);
            }
        }
        this.e(bl2);
    }

    public cnf F() {
        return cnf.a((Integer)this.bY().a(e));
    }

    public boolean L() {
        return this.F().b();
    }

    public int M() {
        return this.F().c();
    }

    public void a(cnf cnf2) {
        this.bY().b(e, cnf2.a());
    }

    @Override
    public void a(bcz bcz2) {
        if (d.equals(bcz2)) {
            this.e(this.R_());
        }
        super.a(bcz2);
    }

    @Override
    public void Q_() {
        if (this.aQ.h() && !this.aQ.C && !this.R_() && this.F().e()) {
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
        super.Q_();
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (super.a(ahy2, f2)) {
            bga bga2 = this.ar();
            if (bga2 == null && ahy2.b() instanceof bga) {
                bga2 = (bga)ahy2.b();
            }
            if (bga2 != null && this.aQ.Q() == ct.d && (double)this.bx.nextFloat() < this.a(a).e() && this.aQ.F().b("doMobSpawning")) {
                int n2 = cmk.c(this.aU);
                int n3 = cmk.c(this.aV);
                int n4 = cmk.c(this.aW);
                oe oe2 = new oe(this.aQ);
                for (int i2 = 0; i2 < 50; ++i2) {
                    int n5;
                    int n6;
                    int n7 = n2 + cmk.a(this.bx, 7, 40) * cmk.a(this.bx, -1, 1);
                    if (!this.aQ.n(new cmz(n7, (n6 = n3 + cmk.a(this.bx, 7, 40) * cmk.a(this.bx, -1, 1)) - 1, n5 = n4 + cmk.a(this.bx, 7, 40) * cmk.a(this.bx, -1, 1))).q() || this.aQ.j(new cmz(n7, n6, n5)) >= 10) continue;
                    oe2.d(n7, n6, n5);
                    if (this.aQ.a((double)n7, (double)n6, (double)n5, 7.0) || !this.aQ.a(oe2.cD(), (cpk)oe2) || !this.aQ.a((cpk)oe2, oe2.cD()).isEmpty() || this.aQ.e(oe2.cD())) continue;
                    this.aQ.b(oe2);
                    oe2.b(bga2);
                    oe2.a(this.aQ.C(new cmz(oe2)), null);
                    this.a(a).b(new cs("Zombie reinforcement caller charge", -0.05f, 0));
                    oe2.a(a).b(new cs("Zombie reinforcement callee charge", -0.05f, 0));
                    break;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void bb_() {
        if (!this.aQ.C && this.Q()) {
            int n2 = this.T();
            this.r -= n2;
            if (this.r <= 0) {
                this.S();
            }
        }
        super.bb_();
    }

    @Override
    public boolean a(cpk cpk2) {
        boolean bl2 = super.a(cpk2);
        if (bl2) {
            float f2 = this.aQ.C(new cmz(this)).a();
            if (this.bt() == null) {
                if (this.y_() && this.bx.nextFloat() < f2 * 0.3f) {
                    cpk2.m(2 * (int)f2);
                }
                if (this.F() == cnf.g && cpk2 instanceof bga) {
                    ((bga)cpk2).b(new cko(ake.q, 140 * (int)f2));
                }
            }
        }
        return bl2;
    }

    @Override
    protected bi q() {
        return this.F().f();
    }

    @Override
    protected bi r() {
        return this.F().g();
    }

    @Override
    protected bi s() {
        return this.F().h();
    }

    @Override
    protected void a(cmz cmz2, bfa bfa2) {
        bi bi2 = this.F().i();
        this.a(bi2, 0.15f, 1.0f);
    }

    @Override
    public agh ak() {
        return agh.b;
    }

    @Override
    protected bpx u() {
        return bvm.aj;
    }

    @Override
    protected void a(bgp bgp2) {
        super.a(bgp2);
        float f2 = this.bx.nextFloat();
        float f3 = this.aQ.Q() == ct.d ? 0.05f : 0.01f;
        if (f2 < f3) {
            int n2 = this.bx.nextInt(3);
            if (n2 == 0) {
                this.a(dfm.a, new bhl(hp.n));
            } else {
                this.a(dfm.a, new bhl(hp.a));
            }
        }
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Zombie");
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        if (this.R_()) {
            bvp2.a("IsBaby", true);
        }
        bvp2.a("ZombieType", this.F().a());
        bvp2.a("ConversionTime", this.Q() ? this.r : -1);
        bvp2.a("CanBreakDoors", this.D());
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        if (bvp2.p("IsBaby")) {
            this.d(true);
        }
        if (bvp2.p("IsVillager")) {
            if (bvp2.b("VillagerProfession", 99)) {
                this.a(cnf.a(bvp2.h("VillagerProfession") + 1));
            } else {
                this.a(cnf.a(this.aQ.p.nextInt(5) + 1));
            }
        }
        if (bvp2.e("ZombieType")) {
            this.a(cnf.a(bvp2.h("ZombieType")));
        }
        if (bvp2.b("ConversionTime", 99) && bvp2.h("ConversionTime") > -1) {
            this.d(bvp2.h("ConversionTime"));
        }
        this.c(bvp2.p("CanBreakDoors"));
    }

    @Override
    public void a_(bga bga2) {
        super.a_(bga2);
        if ((this.aQ.Q() == ct.c || this.aQ.Q() == ct.d) && bga2 instanceof cwp) {
            if (this.aQ.Q() != ct.d && this.bx.nextBoolean()) {
                return;
            }
            cwp cwp2 = (cwp)bga2;
            oe oe2 = new oe(this.aQ);
            oe2.p(bga2);
            this.aQ.e(bga2);
            oe2.a(this.aQ.C(new cmz(oe2)), new amw(this, false, true, null));
            oe2.a(cnf.a(cwp2.T() + 1));
            oe2.d(bga2.R_());
            oe2.m(cwp2.aI());
            if (cwp2.j_()) {
                oe2.g(cwp2.cA());
                oe2.t(cwp2.cB());
            }
            this.aQ.b(oe2);
            this.aQ.a(null, 1026, new cmz((int)this.aU, (int)this.aV, (int)this.aW), 0);
        }
    }

    @Override
    public float A() {
        float f2 = 1.74f;
        if (this.R_()) {
            f2 = (float)((double)f2 - 0.81);
        }
        return f2;
    }

    @Override
    protected boolean a_(bhl bhl2) {
        if (bhl2.a() == hp.aW && this.R_() && this.cp()) {
            return false;
        }
        return super.a_(bhl2);
    }

    @Override
    public aql a(bgp bgp2, aql aql2) {
        Object object;
        aql2 = super.a(bgp2, aql2);
        float f2 = bgp2.c();
        this.l(this.bx.nextFloat() < 0.55f * f2);
        if (aql2 == null) {
            aql2 = new amw(this, this.aQ.p.nextFloat() < 0.05f, this.aQ.p.nextFloat() < 0.05f, null);
        }
        if (aql2 instanceof amw) {
            object = (amw)aql2;
            boolean bl2 = false;
            anr anr2 = this.aQ.a(new cmz(this));
            if (anr2 instanceof bwu && this.aQ.g(new cmz(this)) && this.bx.nextInt(5) != 0) {
                this.a(cnf.g);
                bl2 = true;
            }
            if (!bl2 && ((amw)object).b) {
                this.a(cnf.a(this.bx.nextInt(5) + 1));
            }
            if (((amw)object).a) {
                this.d(true);
                if ((double)this.aQ.p.nextFloat() < 0.05) {
                    List list = this.aQ.a(jp.class, this.cD().b(5.0, 3.0, 5.0), auxx.b);
                    if (!list.isEmpty()) {
                        jp jp2 = (jp)list.get(0);
                        jp2.b(true);
                        this.m(jp2);
                    }
                } else if ((double)this.aQ.p.nextFloat() < 0.05) {
                    jp jp3 = new jp(this.aQ);
                    jp3.a_(this.aU, this.aV, this.aW, this.ba, 0.0f);
                    jp3.a(bgp2, null);
                    jp3.b(true);
                    this.aQ.b(jp3);
                    this.m(jp3);
                }
            }
        }
        this.c(this.bx.nextFloat() < f2 * 0.1f);
        this.a(bgp2);
        this.b(bgp2);
        if (this.a(dfm.f) == null && ((Calendar)(object = this.aQ.O())).get(2) + 1 == 10 && ((Calendar)object).get(5) == 31 && this.bx.nextFloat() < 0.25f) {
            this.a(dfm.f, new bhl(this.bx.nextFloat() < 0.1f ? blg.aZ : blg.aU));
            this.p[dfm.f.b()] = 0.0f;
        }
        this.a(cgz.c).b(new cs("Random spawn bonus", this.bx.nextDouble() * (double)0.05f, 0));
        double d2 = this.bx.nextDouble() * 1.5 * (double)f2;
        if (d2 > 1.0) {
            this.a(cgz.b).b(new cs("Random zombie-spawn bonus", d2, 2));
        }
        if (this.bx.nextFloat() < f2 * 0.05f) {
            this.a(a).b(new cs("Leader zombie bonus", this.bx.nextDouble() * 0.25 + 0.5, 0));
            this.a(cgz.a).b(new cs("Leader zombie bonus", this.bx.nextDouble() * 3.0 + 1.0, 2));
            this.c(true);
        }
        return aql2;
    }

    @Override
    public boolean a(bdl bdl2, bqp bqp2, bhl bhl2) {
        if (bhl2 != null && bhl2.a() == hp.aq && bhl2.h() == 0 && this.L() && this.b(ake.r)) {
            if (!bdl2.G.d) {
                --bhl2.b;
            }
            if (!this.aQ.C) {
                this.d(this.bx.nextInt(2401) + 3600);
            }
            return true;
        }
        return false;
    }

    protected void d(int n2) {
        this.r = n2;
        this.bY().b(f, true);
        this.d(ake.r);
        this.b(new cko(ake.e, n2, Math.min(this.aQ.Q().a() - 1, 0)));
        this.aQ.a((cpk)this, (byte)16);
    }

    @Override
    public void a(byte by2) {
        if (by2 == 16) {
            if (!this.ce()) {
                this.aQ.a(this.aU + 0.5, this.aV + 0.5, this.aW + 0.5, dah.hR, this.y(), 1.0f + this.bx.nextFloat(), this.bx.nextFloat() * 0.7f + 0.3f, false);
            }
        } else {
            super.a(by2);
        }
    }

    @Override
    protected boolean k() {
        return !this.Q();
    }

    public boolean Q() {
        return (Boolean)this.bY().a(f);
    }

    protected void S() {
        cwp cwp2 = new cwp(this.aQ);
        cwp2.p(this);
        cwp2.a(this.aQ.C(new cmz(cwp2)), null);
        cwp2.bQ();
        if (this.R_()) {
            cwp2.j(-24000);
        }
        this.aQ.e(this);
        cwp2.m(this.aI());
        cwp2.d(this.M());
        if (this.j_()) {
            cwp2.g(this.cA());
            cwp2.t(this.cB());
        }
        this.aQ.b(cwp2);
        cwp2.b(new cko(ake.i, 200, 0));
        this.aQ.a(null, 1027, new cmz((int)this.aU, (int)this.aV, (int)this.aW), 0);
    }

    protected int T() {
        int n2 = 1;
        if (this.bx.nextFloat() < 0.01f) {
            int n3 = 0;
            pj pj2 = new pj();
            for (int i2 = (int)this.aU - 4; i2 < (int)this.aU + 4 && n3 < 14; ++i2) {
                for (int i3 = (int)this.aV - 4; i3 < (int)this.aV + 4 && n3 < 14; ++i3) {
                    for (int i4 = (int)this.aW - 4; i4 < (int)this.aW + 4 && n3 < 14; ++i4) {
                        bfa bfa2 = this.aQ.n(pj2.a(i2, i3, i4)).t();
                        if (bfa2 != blg.bi && bfa2 != blg.C) continue;
                        if (this.bx.nextFloat() < 0.3f) {
                            ++n2;
                        }
                        ++n3;
                    }
                }
            }
        }
        return n2;
    }

    public void e(boolean bl2) {
        this.d(bl2 ? 0.5f : 1.0f);
    }

    @Override
    protected final void a_(float f2, float f3) {
        boolean bl2 = this.v > 0.0f && this.w > 0.0f;
        this.v = f2;
        this.w = f3;
        if (!bl2) {
            this.d(1.0f);
        }
    }

    protected final void d(float f2) {
        super.a_(this.v * f2, this.w * f2);
    }

    @Override
    public double Z_() {
        return this.R_() ? 0.0 : -0.35;
    }

    @Override
    public void a(ahy ahy2) {
        super.a(ahy2);
        if (ahy2.b() instanceof ddh && !(this instanceof csq) && ((ddh)ahy2.b()).T() && ((ddh)ahy2.b()).aQ()) {
            ((ddh)ahy2.b()).aR();
            this.a(new bhl(hp.ch, 1, 2), 0.0f);
        }
    }

    @Override
    public String i_() {
        if (this.j_()) {
            return this.cA();
        }
        return this.F().d().i();
    }
}

