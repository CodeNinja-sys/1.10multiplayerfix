/*
 * Decompiled with CFR 0.150.
 */
public class cwp
extends alf
implements cgx,
fc {
    private static final bcz b = bwm.a(cwp.class, cbf.b);
    private int c;
    private boolean d;
    private boolean e;
    aus a;
    private bdl f;
    private beo g;
    private int v;
    private boolean w;
    private boolean x;
    private int y;
    private String z;
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private final al E = new al("Items", false, 8);
    private static final wu[][][][] F = new wu[][][][]{{{{new akl(hp.Q, new rx(18, 22)), new akl(hp.cc, new rx(15, 19)), new akl(hp.cb, new rx(15, 19)), new bdq(hp.R, new rx(-4, -2))}, {new akl(azg.a(blg.aU), new rx(8, 13)), new bdq(hp.ck, new rx(-3, -2))}, {new akl(azg.a(blg.bk), new rx(7, 12)), new bdq(hp.e, new rx(-5, -7))}, {new bdq(hp.bj, new rx(-6, -10)), new bdq(hp.bg, new rx(1, 1))}}, {{new akl(hp.H, new rx(15, 20)), new akl(hp.j, new rx(16, 24)), new yz(hp.bb, new rx(6, 6), hp.bc, new rx(6, 6))}, {new dbt(hp.aY, new rx(7, 8))}}, {{new akl(azg.a(blg.L), new rx(16, 22)), new bdq(hp.bl, new rx(3, 4))}, {new bdq(new bhl(azg.a(blg.L)), new rx(1, 2)), new bdq(new bhl(azg.a(blg.L), 1, 1), new rx(1, 2)), new bdq(new bhl(azg.a(blg.L), 1, 2), new rx(1, 2)), new bdq(new bhl(azg.a(blg.L), 1, 3), new rx(1, 2)), new bdq(new bhl(azg.a(blg.L), 1, 4), new rx(1, 2)), new bdq(new bhl(azg.a(blg.L), 1, 5), new rx(1, 2)), new bdq(new bhl(azg.a(blg.L), 1, 6), new rx(1, 2)), new bdq(new bhl(azg.a(blg.L), 1, 7), new rx(1, 2)), new bdq(new bhl(azg.a(blg.L), 1, 8), new rx(1, 2)), new bdq(new bhl(azg.a(blg.L), 1, 9), new rx(1, 2)), new bdq(new bhl(azg.a(blg.L), 1, 10), new rx(1, 2)), new bdq(new bhl(azg.a(blg.L), 1, 11), new rx(1, 2)), new bdq(new bhl(azg.a(blg.L), 1, 12), new rx(1, 2)), new bdq(new bhl(azg.a(blg.L), 1, 13), new rx(1, 2)), new bdq(new bhl(azg.a(blg.L), 1, 14), new rx(1, 2)), new bdq(new bhl(azg.a(blg.L), 1, 15), new rx(1, 2))}}, {{new akl(hp.H, new rx(15, 20)), new bdq(hp.g, new rx(-12, -8))}, {new bdq(hp.f, new rx(2, 3)), new yz(azg.a(blg.n), new rx(10, 10), hp.am, new rx(6, 10))}}}, {{{new akl(hp.aR, new rx(24, 36)), new ccb()}, {new akl(hp.aS, new rx(8, 10)), new bdq(hp.aX, new rx(10, 12)), new bdq(azg.a(blg.X), new rx(3, 4))}, {new akl(hp.bX, new rx(2, 2)), new bdq(hp.aZ, new rx(10, 12)), new bdq(azg.a(blg.w), new rx(-5, -3))}, {new ccb()}, {new ccb()}, {new bdq(hp.cy, new rx(20, 22))}}}, {{{new akl(hp.bA, new rx(36, 40)), new akl(hp.m, new rx(8, 10))}, {new bdq(hp.aE, new rx(-4, -1)), new bdq(new bhl(hp.bd, 1, dck.l.c()), new rx(-2, -1))}, {new bdq(hp.bB, new rx(4, 7)), new bdq(azg.a(blg.aX), new rx(-3, -1))}, {new bdq(hp.bU, new rx(3, 11))}}}, {{{new akl(hp.j, new rx(16, 24)), new bdq(hp.aa, new rx(4, 6))}, {new akl(hp.l, new rx(7, 9)), new bdq(hp.ab, new rx(10, 14))}, {new akl(hp.k, new rx(3, 4)), new dbt(hp.af, new rx(16, 19))}, {new bdq(hp.Z, new rx(5, 7)), new bdq(hp.Y, new rx(9, 11)), new bdq(hp.W, new rx(5, 7)), new bdq(hp.X, new rx(11, 15))}}, {{new akl(hp.j, new rx(16, 24)), new bdq(hp.c, new rx(6, 8))}, {new akl(hp.l, new rx(7, 9)), new dbt(hp.n, new rx(9, 10))}, {new akl(hp.k, new rx(3, 4)), new dbt(hp.w, new rx(12, 15)), new dbt(hp.z, new rx(9, 12))}}, {{new akl(hp.j, new rx(16, 24)), new dbt(hp.a, new rx(5, 7))}, {new akl(hp.l, new rx(7, 9)), new dbt(hp.b, new rx(9, 11))}, {new akl(hp.k, new rx(3, 4)), new dbt(hp.y, new rx(12, 15))}}}, {{{new akl(hp.an, new rx(14, 18)), new akl(hp.br, new rx(14, 18))}, {new akl(hp.j, new rx(16, 24)), new bdq(hp.ao, new rx(-7, -5)), new bdq(hp.bs, new rx(-8, -6))}}, {{new akl(hp.aM, new rx(9, 12)), new bdq(hp.U, new rx(2, 4))}, {new dbt(hp.T, new rx(7, 12))}, {new bdq(hp.aC, new rx(8, 10))}}}};

    public cwp(iu iu2) {
        this(iu2, 0);
    }

    public cwp(iu iu2, int n2) {
        super(iu2);
        this.d(n2);
        this.a_(0.6f, 1.95f);
        ((vp)this.ap()).a(true);
        this.l(true);
    }

    @Override
    protected void n() {
        this.m.a(0, new baf(this));
        this.m.a(1, new cgk(this, oe.class, 8.0f, 0.6, 0.6));
        this.m.a(1, new fg(this));
        this.m.a(1, new vc(this));
        this.m.a(2, new bby(this));
        this.m.a(3, new bex(this));
        this.m.a(4, new awz(this, true));
        this.m.a(5, new byi(this, 0.6));
        this.m.a(6, new w(this));
        this.m.a(7, new bce(this));
        this.m.a(9, new bye(this, bdl.class, 3.0f, 1.0f));
        this.m.a(9, new ctf(this));
        this.m.a(9, new vq(this, 0.6));
        this.m.a(10, new chx(this, xy.class, 8.0f));
    }

    private void cM() {
        if (this.D) {
            return;
        }
        this.D = true;
        if (this.R_()) {
            this.m.a(8, new aag(this, 0.32));
        } else if (this.T() == 0) {
            this.m.a(6, new cbe(this, 0.6));
        }
    }

    @Override
    protected void aM() {
        if (this.T() == 0) {
            this.m.a(8, new cbe(this, 0.6));
        }
        super.aM();
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.d).a(0.5);
    }

    @Override
    protected void o() {
        if (--this.c <= 0) {
            cmz cmz2 = new cmz(this);
            this.aQ.T().a(cmz2);
            this.c = 70 + this.bx.nextInt(50);
            this.a = this.aQ.T().a(cmz2, 32);
            if (this.a == null) {
                this.bO();
            } else {
                Object object = this.a.a();
                this.a((cmz)object, this.a.b());
                if (this.C) {
                    this.C = false;
                    this.a.b(5);
                }
            }
        }
        if (!this.aR() && this.v > 0) {
            --this.v;
            if (this.v <= 0) {
                if (this.w) {
                    for (Object object : this.g) {
                        if (!((jc)object).h()) continue;
                        ((jc)object).a(this.bx.nextInt(6) + this.bx.nextInt(6) + 2);
                    }
                    this.cN();
                    this.w = false;
                    if (this.a != null && this.z != null) {
                        this.aQ.a((cpk)this, (byte)14);
                        this.a.a(this.z, 1);
                    }
                }
                this.b(new cko(ake.j, 200, 0));
            }
        }
        super.o();
    }

    @Override
    public boolean a(bdl bdl2, bqp bqp2, bhl bhl2) {
        boolean bl2;
        boolean bl3 = bl2 = bhl2 != null && bhl2.a() == hp.bT;
        if (!bl2 && this.bj() && !this.aR() && !this.R_()) {
            if (!(this.aQ.C || this.g != null && this.g.isEmpty())) {
                this.a(bdl2);
                bdl2.a(this);
            }
            bdl2.a(bpv.H);
            return true;
        }
        return super.a(bdl2, bqp2, bhl2);
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(b, 0);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Villager");
        cgy2.a(bst.e, (cui)new ml("Villager", new String[]{"Inventory"}));
        cgy2.a(bst.e, (cui)new asp());
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Profession", this.T());
        bvp2.a("Riches", this.y);
        bvp2.a("Career", this.A);
        bvp2.a("CareerLevel", this.B);
        bvp2.a("Willing", this.x);
        if (this.g != null) {
            bvp2.a("Offers", this.g.a());
        }
        bmh bmh2 = new bmh();
        for (int i2 = 0; i2 < this.E.aI_(); ++i2) {
            bhl bhl2 = this.E.a(i2);
            if (bhl2 == null) continue;
            bmh2.a(bhl2.b(new bvp()));
        }
        bvp2.a("Inventory", bmh2);
    }

    @Override
    public void b(bvp bvp2) {
        azt azt2;
        super.b(bvp2);
        this.d(bvp2.h("Profession"));
        this.y = bvp2.h("Riches");
        this.A = bvp2.h("Career");
        this.B = bvp2.h("CareerLevel");
        this.x = bvp2.p("Willing");
        if (bvp2.b("Offers", 10)) {
            azt2 = bvp2.o("Offers");
            this.g = new beo((bvp)azt2);
        }
        azt2 = bvp2.c("Inventory", 10);
        for (int i2 = 0; i2 < ((bmh)azt2).b(); ++i2) {
            bhl bhl2 = bhl.a(((bmh)azt2).b(i2));
            if (bhl2 == null) continue;
            this.E.a(bhl2);
        }
        this.l(true);
        this.cM();
    }

    @Override
    protected boolean k() {
        return false;
    }

    @Override
    protected bi q() {
        if (this.aR()) {
            return dah.gJ;
        }
        return dah.gF;
    }

    @Override
    protected bi r() {
        return dah.gH;
    }

    @Override
    protected bi s() {
        return dah.gG;
    }

    public void d(int n2) {
        this.bE.b(b, n2);
    }

    public int T() {
        return Math.max((Integer)this.bE.a(b) % 5, 0);
    }

    public boolean aP() {
        return this.d;
    }

    public void d(boolean bl2) {
        this.d = bl2;
    }

    public void e(boolean bl2) {
        this.e = bl2;
    }

    public boolean aQ() {
        return this.e;
    }

    @Override
    public void d(bga bga2) {
        super.d(bga2);
        if (this.a != null && bga2 != null) {
            this.a.a(bga2);
            if (bga2 instanceof bdl) {
                int n2 = -1;
                if (this.R_()) {
                    n2 = -3;
                }
                this.a.a(bga2.i_(), n2);
                if (this.bj()) {
                    this.aQ.a((cpk)this, (byte)13);
                }
            }
        }
    }

    @Override
    public void a(ahy ahy2) {
        if (this.a != null) {
            cpk cpk2 = ahy2.b();
            if (cpk2 != null) {
                if (cpk2 instanceof bdl) {
                    this.a.a(cpk2.i_(), -2);
                } else if (cpk2 instanceof cso) {
                    this.a.h();
                }
            } else {
                bdl bdl2 = this.aQ.a((cpk)this, 16.0);
                if (bdl2 != null) {
                    this.a.h();
                }
            }
        }
        super.a(ahy2);
    }

    @Override
    public void a(bdl bdl2) {
        this.f = bdl2;
    }

    @Override
    public bdl b() {
        return this.f;
    }

    public boolean aR() {
        return this.f != null;
    }

    public boolean f(boolean bl2) {
        if (!this.x && bl2 && this.bS()) {
            boolean bl3 = false;
            for (int i2 = 0; i2 < this.E.aI_(); ++i2) {
                bhl bhl2 = this.E.a(i2);
                if (bhl2 != null) {
                    if (bhl2.a() == hp.R && bhl2.b >= 3) {
                        bl3 = true;
                        this.E.a(i2, 3);
                    } else if ((bhl2.a() == hp.cc || bhl2.a() == hp.cb) && bhl2.b >= 12) {
                        bl3 = true;
                        this.E.a(i2, 12);
                    }
                }
                if (!bl3) continue;
                this.aQ.a((cpk)this, (byte)18);
                this.x = true;
                break;
            }
        }
        return this.x;
    }

    public void g(boolean bl2) {
        this.x = bl2;
    }

    @Override
    public void a(jc jc2) {
        jc2.g();
        this.h = -this.j();
        this.a(dah.gK, this.t(), this.ac_());
        int n2 = 3 + this.bx.nextInt(4);
        if (jc2.e() == 1 || this.bx.nextInt(5) == 0) {
            this.v = 40;
            this.w = true;
            this.x = true;
            this.z = this.f != null ? this.f.i_() : null;
            n2 += 5;
        }
        if (jc2.a().a() == hp.bY) {
            this.y += jc2.a().b;
        }
        if (jc2.j()) {
            this.aQ.b(new cvs(this.aQ, this.aU, this.aV + 0.5, this.aW, n2));
        }
    }

    @Override
    public void a(bhl bhl2) {
        if (!this.aQ.C && this.h > -this.j() + 20) {
            this.h = -this.j();
            if (bhl2 != null) {
                this.a(dah.gK, this.t(), this.ac_());
            } else {
                this.a(dah.gI, this.t(), this.ac_());
            }
        }
    }

    @Override
    public beo b(bdl bdl2) {
        if (this.g == null) {
            this.cN();
        }
        return this.g;
    }

    private void cN() {
        wu[][][] arrwu = F[this.T()];
        if (this.A == 0 || this.B == 0) {
            this.A = this.bx.nextInt(arrwu.length) + 1;
            this.B = 1;
        } else {
            ++this.B;
        }
        if (this.g == null) {
            this.g = new beo();
        }
        int n2 = this.A - 1;
        int n3 = this.B - 1;
        wu[][] arrwu2 = arrwu[n2];
        if (n3 >= 0 && n3 < arrwu2.length) {
            wu[] arrwu3;
            for (wu wu2 : arrwu3 = arrwu2[n3]) {
                wu2.a(this.g, this.bx);
            }
        }
    }

    @Override
    public void a(beo beo2) {
    }

    @Override
    public cbg v() {
        ccw ccw2 = this.as_();
        String string = this.cA();
        if (string != null && !string.isEmpty()) {
            aym aym2 = new aym(ef.a(ccw2, string));
            aym2.h().a(this.cC());
            aym2.h().a(this.cy());
            return aym2;
        }
        if (this.g == null) {
            this.cN();
        }
        String string2 = null;
        switch (this.T()) {
            case 0: {
                if (this.A == 1) {
                    string2 = "farmer";
                    break;
                }
                if (this.A == 2) {
                    string2 = "fisherman";
                    break;
                }
                if (this.A == 3) {
                    string2 = "shepherd";
                    break;
                }
                if (this.A != 4) break;
                string2 = "fletcher";
                break;
            }
            case 1: {
                string2 = "librarian";
                break;
            }
            case 2: {
                string2 = "cleric";
                break;
            }
            case 3: {
                if (this.A == 1) {
                    string2 = "armor";
                    break;
                }
                if (this.A == 2) {
                    string2 = "weapon";
                    break;
                }
                if (this.A != 3) break;
                string2 = "tool";
                break;
            }
            case 4: {
                if (this.A == 1) {
                    string2 = "butcher";
                    break;
                }
                if (this.A != 2) break;
                string2 = "leather";
            }
        }
        if (string2 != null) {
            du du2 = new du("entity.Villager." + string2, new Object[0]);
            du2.h().a(this.cC());
            du2.h().a(this.cy());
            if (ccw2 != null) {
                du2.h().a(ccw2.l());
            }
            return du2;
        }
        return super.v();
    }

    @Override
    public float A() {
        if (this.R_()) {
            return 0.81f;
        }
        return 1.62f;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 12) {
            this.a(lz.I);
        } else if (by2 == 13) {
            this.a(lz.u);
        } else if (by2 == 14) {
            this.a(lz.v);
        } else {
            super.a(by2);
        }
    }

    private void a(lz lz2) {
        for (int i2 = 0; i2 < 5; ++i2) {
            double d2 = this.bx.nextGaussian() * 0.02;
            double d3 = this.bx.nextGaussian() * 0.02;
            double d4 = this.bx.nextGaussian() * 0.02;
            this.aQ.a(lz2, this.aU + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, this.aV + 1.0 + (double)(this.bx.nextFloat() * this.bm), this.aW + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, d2, d3, d4, new int[0]);
        }
    }

    @Override
    public aql a(bgp bgp2, aql aql2) {
        aql2 = super.a(bgp2, aql2);
        this.d(this.aQ.p.nextInt(5));
        this.cM();
        return aql2;
    }

    public void bQ() {
        this.C = true;
    }

    public cwp a(alf alf2) {
        cwp cwp2 = new cwp(this.aQ);
        cwp2.a(this.aQ.C(new cmz(cwp2)), null);
        return cwp2;
    }

    @Override
    public boolean c(bdl bdl2) {
        return false;
    }

    @Override
    public void a(tz tz2) {
        if (this.aQ.C || this.bk) {
            return;
        }
        byl byl2 = new byl(this.aQ);
        byl2.a_(this.aU, this.aV, this.aW, this.ba, this.bb);
        byl2.a(this.aQ.C(new cmz(byl2)), null);
        byl2.m(this.aI());
        if (this.j_()) {
            byl2.g(this.cA());
            byl2.t(this.cB());
        }
        this.aQ.b(byl2);
        this.ak_();
    }

    public al bR() {
        return this.E;
    }

    @Override
    protected void a(er er2) {
        bhl bhl2 = er2.h();
        azg azg2 = bhl2.a();
        if (this.a(azg2)) {
            bhl bhl3 = this.E.a(bhl2);
            if (bhl3 == null) {
                er2.ak_();
            } else {
                bhl2.b = bhl3.b;
            }
        }
    }

    private boolean a(azg azg2) {
        return azg2 == hp.R || azg2 == hp.cc || azg2 == hp.cb || azg2 == hp.Q || azg2 == hp.P || azg2 == hp.cV || azg2 == hp.cU;
    }

    public boolean bS() {
        return this.f(1);
    }

    public boolean bT() {
        return this.f(2);
    }

    public boolean bU() {
        boolean bl2;
        boolean bl3 = bl2 = this.T() == 0;
        if (bl2) {
            return !this.f(5);
        }
        return !this.f(1);
    }

    private boolean f(int n2) {
        boolean bl2 = this.T() == 0;
        for (int i2 = 0; i2 < this.E.aI_(); ++i2) {
            bhl bhl2 = this.E.a(i2);
            if (bhl2 == null) continue;
            if (bhl2.a() == hp.R && bhl2.b >= 3 * n2 || bhl2.a() == hp.cc && bhl2.b >= 12 * n2 || bhl2.a() == hp.cb && bhl2.b >= 12 * n2 || bhl2.a() == hp.cV && bhl2.b >= 12 * n2) {
                return true;
            }
            if (!bl2 || bhl2.a() != hp.Q || bhl2.b < 9 * n2) continue;
            return true;
        }
        return false;
    }

    public boolean bV() {
        for (int i2 = 0; i2 < this.E.aI_(); ++i2) {
            bhl bhl2 = this.E.a(i2);
            if (bhl2 == null || bhl2.a() != hp.P && bhl2.a() != hp.cc && bhl2.a() != hp.cb && bhl2.a() != hp.cU) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a_(int n2, bhl bhl2) {
        if (super.a_(n2, bhl2)) {
            return true;
        }
        int n3 = n2 - 300;
        if (n3 >= 0 && n3 < this.E.aI_()) {
            this.E.a(n3, bhl2);
            return true;
        }
        return false;
    }

    @Override
    public /* synthetic */ alf b(alf alf2) {
        return this.a(alf2);
    }
}

