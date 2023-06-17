/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cg;
import java.util.List;
import java.util.UUID;

public class it
extends cxn
implements btj,
uz {
    private static final com.a.a.b.cm f = new cm();
    private static final cmb g = new ot(null, "horse.jumpStrength", 0.7, 0.0, 2.0).a("Jump Strength").a(true);
    private static final UUID w = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
    private static final bcz x = bwm.a(it.class, cbf.a);
    private static final bcz y = bwm.a(it.class, cbf.b);
    private static final bcz z = bwm.a(it.class, cbf.b);
    private static final bcz A = bwm.a(it.class, cbf.m);
    private static final bcz B = bwm.a(it.class, cbf.b);
    private static final String[] C = new String[]{"textures/entity/horse/horse_white.png", "textures/entity/horse/horse_creamy.png", "textures/entity/horse/horse_chestnut.png", "textures/entity/horse/horse_brown.png", "textures/entity/horse/horse_black.png", "textures/entity/horse/horse_gray.png", "textures/entity/horse/horse_darkbrown.png"};
    private static final String[] D = new String[]{"hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb"};
    private static final String[] E = new String[]{null, "textures/entity/horse/horse_markings_white.png", "textures/entity/horse/horse_markings_whitefield.png", "textures/entity/horse/horse_markings_whitedots.png", "textures/entity/horse/horse_markings_blackdots.png"};
    private static final String[] F = new String[]{"", "wo_", "wmo", "wdo", "bdo"};
    private final oc G = new oc(this);
    private int H;
    private int I;
    private int J;
    public int a;
    public int b;
    protected boolean c;
    private aq K;
    private boolean L;
    protected int d;
    protected float e;
    private boolean M;
    private boolean aK;
    private int aL;
    private float aM;
    private float bZ;
    private float ca;
    private float cb;
    private float cc;
    private float cd;
    private int ce;
    private String cf;
    private final String[] cg = new String[3];
    private boolean ch;

    public it(iu iu2) {
        super(iu2);
        this.a_(1.3964844f, 1.6f);
        this.bD = false;
        this.e(false);
        this.bu = 1.0f;
        this.aR();
    }

    @Override
    protected void n() {
        this.m.a(0, new baf(this));
        this.m.a(1, new aro(this, 1.2));
        this.m.a(1, new cws(this, 1.2));
        this.m.a(2, new ky(this, 1.0));
        this.m.a(4, new adk(this, 1.0));
        this.m.a(6, new vq(this, 0.7));
        this.m.a(7, new chx(this, bdl.class, 6.0f));
        this.m.a(8, new bzv(this));
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(x, (byte)0);
        this.bE.a(y, bmv.a.k());
        this.bE.a(z, 0);
        this.bE.a(A, com.a.a.b.cg.f());
        this.bE.a(B, cot.a.a());
    }

    public void a(bmv bmv2) {
        this.bE.b(y, bmv2.k());
        this.bU();
    }

    public bmv x() {
        return bmv.a((Integer)this.bE.a(y));
    }

    public void d(int n2) {
        this.bE.b(z, n2);
        this.bU();
    }

    public int B() {
        return (Integer)this.bE.a(z);
    }

    @Override
    public String i_() {
        if (this.j_()) {
            return this.cA();
        }
        return this.x().d().i();
    }

    private boolean p(int n2) {
        return ((Byte)this.bE.a(x) & n2) != 0;
    }

    private void c(int n2, boolean bl2) {
        byte by2 = (Byte)this.bE.a(x);
        if (bl2) {
            this.bE.b(x, (byte)(by2 | n2));
        } else {
            this.bE.b(x, (byte)(by2 & ~n2));
        }
    }

    public boolean C() {
        return !this.R_();
    }

    public boolean D() {
        return this.p(2);
    }

    public boolean E() {
        return this.C();
    }

    public UUID F() {
        return (UUID)((cg)this.bE.a(A)).d();
    }

    public void a(UUID uUID) {
        this.bE.b(A, com.a.a.b.cg.c(uUID));
    }

    public float G() {
        return 0.5f;
    }

    @Override
    public void b_(boolean bl2) {
        if (bl2) {
            this.j(this.G());
        } else {
            this.j(1.0f);
        }
    }

    public boolean H() {
        return this.c;
    }

    public void b(boolean bl2) {
        this.c(2, bl2);
    }

    public void c(boolean bl2) {
        this.c = bl2;
    }

    @Override
    public boolean c(bdl bdl2) {
        return !this.x().h() && super.c(bdl2);
    }

    @Override
    protected void c(float f2) {
        if (f2 > 6.0f && this.K()) {
            this.h(false);
        }
    }

    public boolean I() {
        return this.x().f() && this.p(8);
    }

    public cot J() {
        return cot.a((Integer)this.bE.a(B));
    }

    public boolean K() {
        return this.p(32);
    }

    public boolean L() {
        return this.p(64);
    }

    public boolean M() {
        return this.p(16);
    }

    public boolean N() {
        return this.L;
    }

    public void b(bhl bhl2) {
        cot cot2 = cot.a(bhl2);
        this.bE.b(B, cot2.a());
        this.bU();
        if (!this.aQ.C) {
            this.a(cgz.g).b(w);
            int n2 = cot2.c();
            if (n2 != 0) {
                this.a(cgz.g).b(new cs(w, "Horse armor bonus", n2, 0).a(false));
            }
        }
    }

    public void d(boolean bl2) {
        this.c(16, bl2);
    }

    public void e(boolean bl2) {
        this.c(8, bl2);
    }

    public void f(boolean bl2) {
        this.L = bl2;
    }

    public void g(boolean bl2) {
        this.c(4, bl2);
    }

    public int O() {
        return this.d;
    }

    public void e(int n2) {
        this.d = n2;
    }

    public int f(int n2) {
        int n3 = cmk.a(this.O() + n2, 0, this.V());
        this.e(n3);
        return n3;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        cpk cpk2 = ahy2.b();
        if (this.cq() && cpk2 != null && this.t(cpk2)) {
            return false;
        }
        return super.a(ahy2, f2);
    }

    @Override
    public boolean P() {
        return !this.cq();
    }

    public boolean Q() {
        int n2 = cmk.c(this.aU);
        int n3 = cmk.c(this.aW);
        this.aQ.a(new cmz(n2, 0, n3));
        return true;
    }

    public void R() {
        if (this.aQ.C || !this.I()) {
            return;
        }
        this.a(azg.a(blg.ae), 1);
        this.e(false);
    }

    private void aP() {
        this.cN();
        if (!this.ce()) {
            this.aQ.a(null, this.aU, this.aV, this.aW, dah.cu, this.y(), 1.0f, 1.0f + (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f);
        }
    }

    @Override
    public void a(float f2, float f3) {
        Object object2;
        int n2;
        if (f2 > 1.0f) {
            this.a(dah.cy, 0.4f, 1.0f);
        }
        if ((n2 = cmk.f((f2 * 0.5f - 3.0f) * f3)) <= 0) {
            return;
        }
        this.a(ahy.j, (float)n2);
        if (this.cq()) {
            for (Object object2 : this.cI()) {
                ((cpk)object2).a(ahy.j, (float)n2);
            }
        }
        dbk dbk2 = this.aQ.n(new cmz(this.aU, this.aV - 0.2 - (double)this.bc, this.aW));
        object2 = dbk2.t();
        if (dbk2.a() != ahk.a && !this.ce()) {
            acv acv2 = ((bfa)object2).t();
            this.aQ.a(null, this.aU, this.aV, this.aW, acv2.d(), this.y(), acv2.a() * 0.5f, acv2.b() * 0.75f);
        }
    }

    private int aQ() {
        bmv bmv2 = this.x();
        if (this.I() && bmv2.f()) {
            return 17;
        }
        return 2;
    }

    private void aR() {
        aq aq2 = this.K;
        this.K = new aq("HorseChest", this.aQ());
        this.K.a(this.i_());
        if (aq2 != null) {
            aq2.b(this);
            int n2 = Math.min(aq2.aI_(), this.K.aI_());
            for (int i2 = 0; i2 < n2; ++i2) {
                bhl bhl2 = aq2.a(i2);
                if (bhl2 == null) continue;
                this.K.a(i2, bhl2.j());
            }
        }
        this.K.a(this);
        this.bQ();
    }

    private void bQ() {
        if (!this.aQ.C) {
            this.g(this.K.a(0) != null);
            if (this.x().j()) {
                this.b(this.K.a(1));
            }
        }
    }

    @Override
    public void a(al al2) {
        cot cot2 = this.J();
        boolean bl2 = this.T();
        this.bQ();
        if (this.by > 20) {
            if (cot2 == cot.a && cot2 != this.J()) {
                this.a(dah.cr, 0.5f, 1.0f);
            } else if (cot2 != this.J()) {
                this.a(dah.cr, 0.5f, 1.0f);
            }
            if (!bl2 && this.T()) {
                this.a(dah.cz, 0.5f, 1.0f);
            }
        }
    }

    @Override
    public boolean h() {
        this.Q();
        return super.h();
    }

    protected it a(cpk cpk2, double d2) {
        double d3 = Double.MAX_VALUE;
        cpk cpk3 = null;
        List list = this.aQ.a(cpk2, cpk2.cD().a(d2, d2, d2), f);
        for (cpk cpk4 : list) {
            double d4 = cpk4.i(cpk2.aU, cpk2.aV, cpk2.aW);
            if (!(d4 < d3)) continue;
            cpk3 = cpk4;
            d3 = d4;
        }
        return (it)cpk3;
    }

    public double S() {
        return this.a(g).e();
    }

    @Override
    protected bi s() {
        this.cN();
        return this.x().c();
    }

    @Override
    protected bi r() {
        this.cN();
        if (this.bx.nextInt(3) == 0) {
            this.cP();
        }
        return this.x().b();
    }

    public boolean T() {
        return this.p(4);
    }

    @Override
    protected bi q() {
        this.cN();
        if (this.bx.nextInt(10) == 0 && !this.aa()) {
            this.cP();
        }
        return this.x().a();
    }

    protected bi U() {
        this.cN();
        this.cP();
        bmv bmv2 = this.x();
        if (bmv2.h()) {
            return null;
        }
        if (bmv2.g()) {
            return dah.ay;
        }
        return dah.cq;
    }

    @Override
    protected void a(cmz cmz2, bfa bfa2) {
        acv acv2 = bfa2.t();
        if (this.aQ.n(cmz2.g()).t() == blg.aH) {
            acv2 = blg.aH.t();
        }
        if (!bfa2.s().a().d()) {
            bmv bmv2 = this.x();
            if (this.cq() && !bmv2.g()) {
                ++this.ce;
                if (this.ce > 5 && this.ce % 3 == 0) {
                    this.a(dah.cv, acv2.a() * 0.15f, acv2.b());
                    if (bmv2 == bmv.a && this.bx.nextInt(10) == 0) {
                        this.a(dah.cs, acv2.a() * 0.6f, acv2.b());
                    }
                } else if (this.ce <= 5) {
                    this.a(dah.cB, acv2.a() * 0.15f, acv2.b());
                }
            } else if (acv2 == acv.a) {
                this.a(dah.cB, acv2.a() * 0.15f, acv2.b());
            } else {
                this.a(dah.cA, acv2.a() * 0.15f, acv2.b());
            }
        }
    }

    @Override
    protected void p() {
        super.p();
        this.bs().b(g);
        this.a(cgz.a).a(53.0);
        this.a(cgz.d).a(0.225f);
    }

    @Override
    public int z() {
        return 6;
    }

    public int V() {
        return 100;
    }

    @Override
    protected float t() {
        return 0.8f;
    }

    @Override
    public int j() {
        return 400;
    }

    public boolean W() {
        return this.x() == bmv.a || this.J() != cot.a;
    }

    private void bU() {
        this.cf = null;
    }

    public boolean X() {
        return this.ch;
    }

    private void bV() {
        this.cf = "horse/";
        this.cg[0] = null;
        this.cg[1] = null;
        this.cg[2] = null;
        bmv bmv2 = this.x();
        int n2 = this.B();
        if (bmv2 == bmv.a) {
            int n3 = n2 & 0xFF;
            int n4 = (n2 & 0xFF00) >> 8;
            if (n3 >= C.length) {
                this.ch = false;
                return;
            }
            this.cg[0] = C[n3];
            this.cf = this.cf + D[n3];
            if (n4 >= E.length) {
                this.ch = false;
                return;
            }
            this.cg[1] = E[n4];
            this.cf = this.cf + F[n4];
        } else {
            this.cg[0] = "";
            this.cf = this.cf + "_" + (Object)((Object)bmv2) + "_";
        }
        cot cot2 = this.J();
        this.cg[2] = cot2.d();
        this.cf = this.cf + cot2.b();
        this.ch = true;
    }

    public String Y() {
        if (this.cf == null) {
            this.bV();
        }
        return this.cf;
    }

    public String[] Z() {
        if (this.cf == null) {
            this.bV();
        }
        return this.cg;
    }

    public void d(bdl bdl2) {
        if (!this.aQ.C && (!this.cq() || this.r(bdl2)) && this.D()) {
            this.K.a(this.i_());
            bdl2.a(this, this.K);
        }
    }

    @Override
    public boolean a(bdl bdl2, bqp bqp2, bhl bhl2) {
        if (bhl2 != null && bhl2.a() == hp.bT) {
            return super.a(bdl2, bqp2, bhl2);
        }
        if (!this.D() && this.x().h()) {
            return false;
        }
        if (this.D() && this.C() && bdl2.ar_()) {
            this.d(bdl2);
            return true;
        }
        if (this.E() && this.cq()) {
            return super.a(bdl2, bqp2, bhl2);
        }
        if (bhl2 != null) {
            cot cot2;
            if (this.x().j() && (cot2 = cot.a(bhl2)) != cot.a) {
                if (!this.D()) {
                    this.ab();
                    return true;
                }
                this.d(bdl2);
                return true;
            }
            boolean bl2 = false;
            if (!this.x().h()) {
                float f2 = 0.0f;
                int n2 = 0;
                int n3 = 0;
                if (bhl2.a() == hp.Q) {
                    f2 = 2.0f;
                    n2 = 20;
                    n3 = 3;
                } else if (bhl2.a() == hp.bf) {
                    f2 = 1.0f;
                    n2 = 30;
                    n3 = 3;
                } else if (bfa.a(bhl2.a()) == blg.cx) {
                    f2 = 20.0f;
                    n2 = 180;
                } else if (bhl2.a() == hp.e) {
                    f2 = 3.0f;
                    n2 = 60;
                    n3 = 3;
                } else if (bhl2.a() == hp.cg) {
                    f2 = 4.0f;
                    n2 = 60;
                    n3 = 5;
                    if (this.D() && this.aL() == 0) {
                        bl2 = true;
                        this.f(bdl2);
                    }
                } else if (bhl2.a() == hp.aq) {
                    f2 = 10.0f;
                    n2 = 240;
                    n3 = 10;
                    if (this.D() && this.aL() == 0 && !this.bS()) {
                        bl2 = true;
                        this.f(bdl2);
                    }
                }
                if (this.bh() < this.bo() && f2 > 0.0f) {
                    this.b_(f2);
                    bl2 = true;
                }
                if (!this.C() && n2 > 0) {
                    if (!this.aQ.C) {
                        this.i(n2);
                    }
                    bl2 = true;
                }
                if (n3 > 0 && (bl2 || !this.D()) && this.O() < this.V()) {
                    bl2 = true;
                    if (!this.aQ.C) {
                        this.f(n3);
                    }
                }
                if (bl2) {
                    this.aP();
                }
            }
            if (!this.D() && !bl2) {
                if (bhl2.a(bdl2, (bga)this, bqp2)) {
                    return true;
                }
                this.ab();
                return true;
            }
            if (!bl2 && this.x().f() && !this.I() && bhl2.a() == azg.a(blg.ae)) {
                this.e(true);
                this.a(dah.az, 1.0f, (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f);
                bl2 = true;
                this.aR();
            }
            if (!bl2 && this.E() && !this.T() && bhl2.a() == hp.aC) {
                this.d(bdl2);
                return true;
            }
            if (bl2) {
                if (!bdl2.G.d) {
                    --bhl2.b;
                }
                return true;
            }
        }
        if (this.E() && !this.cq()) {
            if (bhl2 != null && bhl2.a(bdl2, (bga)this, bqp2)) {
                return true;
            }
            this.g(bdl2);
            return true;
        }
        return super.a(bdl2, bqp2, bhl2);
    }

    private void g(bdl bdl2) {
        bdl2.ba = this.ba;
        bdl2.bb = this.bb;
        this.h(false);
        this.i(false);
        if (!this.aQ.C) {
            bdl2.m(this);
        }
    }

    @Override
    protected boolean aa() {
        if (this.cq() && this.T()) {
            return true;
        }
        return this.K() || this.L();
    }

    @Override
    public boolean a(bhl bhl2) {
        return false;
    }

    private void cM() {
        this.a = 1;
    }

    @Override
    public void a(ahy ahy2) {
        super.a(ahy2);
        if (!this.aQ.C) {
            this.ac();
        }
    }

    @Override
    public void Q_() {
        if (this.bx.nextInt(200) == 0) {
            this.cM();
        }
        super.Q_();
        if (!this.aQ.C) {
            it it2;
            if (this.bx.nextInt(900) == 0 && this.V == 0) {
                this.b_(1.0f);
            }
            if (!this.K() && !this.cq() && this.bx.nextInt(300) == 0 && this.aQ.n(new cmz(cmk.c(this.aU), cmk.c(this.aV) - 1, cmk.c(this.aW))).t() == blg.c) {
                this.h(true);
            }
            if (this.K() && ++this.H > 50) {
                this.H = 0;
                this.h(false);
            }
            if (this.M() && !this.C() && !this.K() && (it2 = this.a((cpk)this, 16.0)) != null && this.l(it2) > 4.0) {
                this.l.a(it2);
            }
            if (this.ah() && this.aL++ >= 18000) {
                this.ak_();
            }
        }
    }

    @Override
    public void bb_() {
        super.bb_();
        if (this.aQ.C && this.bE.a()) {
            this.bE.e();
            this.bU();
        }
        if (this.I > 0 && ++this.I > 30) {
            this.I = 0;
            this.c(128, false);
        }
        if (this.cK() && this.J > 0 && ++this.J > 20) {
            this.J = 0;
            this.i(false);
        }
        if (this.a > 0 && ++this.a > 8) {
            this.a = 0;
        }
        if (this.b > 0) {
            ++this.b;
            if (this.b > 300) {
                this.b = 0;
            }
        }
        this.bZ = this.aM;
        if (this.K()) {
            this.aM += (1.0f - this.aM) * 0.4f + 0.05f;
            if (this.aM > 1.0f) {
                this.aM = 1.0f;
            }
        } else {
            this.aM += (0.0f - this.aM) * 0.4f - 0.05f;
            if (this.aM < 0.0f) {
                this.aM = 0.0f;
            }
        }
        this.cb = this.ca;
        if (this.L()) {
            this.bZ = this.aM = 0.0f;
            this.ca += (1.0f - this.ca) * 0.4f + 0.05f;
            if (this.ca > 1.0f) {
                this.ca = 1.0f;
            }
        } else {
            this.M = false;
            this.ca += (0.8f * this.ca * this.ca * this.ca - this.ca) * 0.6f - 0.05f;
            if (this.ca < 0.0f) {
                this.ca = 0.0f;
            }
        }
        this.cd = this.cc;
        if (this.p(128)) {
            this.cc += (1.0f - this.cc) * 0.7f + 0.05f;
            if (this.cc > 1.0f) {
                this.cc = 1.0f;
            }
        } else {
            this.cc += (0.0f - this.cc) * 0.7f - 0.05f;
            if (this.cc < 0.0f) {
                this.cc = 0.0f;
            }
        }
    }

    private void cN() {
        if (!this.aQ.C) {
            this.I = 1;
            this.c(128, true);
        }
    }

    private boolean cO() {
        return !this.cq() && !this.cp() && this.D() && this.C() && this.x().i() && this.bh() >= this.bo() && this.bS();
    }

    public void h(boolean bl2) {
        this.c(32, bl2);
    }

    public void i(boolean bl2) {
        if (bl2) {
            this.h(false);
        }
        this.c(64, bl2);
    }

    private void cP() {
        if (this.cK()) {
            this.J = 1;
            this.i(true);
        }
    }

    public void ab() {
        this.cP();
        bi bi2 = this.U();
        if (bi2 != null) {
            this.a(bi2, this.t(), this.ac_());
        }
    }

    public void ac() {
        this.a((cpk)this, this.K);
        this.R();
    }

    private void a(cpk cpk2, aq aq2) {
        if (aq2 == null || this.aQ.C) {
            return;
        }
        for (int i2 = 0; i2 < aq2.aI_(); ++i2) {
            bhl bhl2 = aq2.a(i2);
            if (bhl2 == null) continue;
            this.a(bhl2, 0.0f);
        }
    }

    public boolean e(bdl bdl2) {
        this.a(bdl2.cx());
        this.b(true);
        return true;
    }

    @Override
    public void b(float f2, float f3) {
        if (!(this.cq() && this.ad() && this.T())) {
            this.al = 0.02f;
            super.b(f2, f3);
            return;
        }
        bga bga2 = (bga)this.aj();
        this.bc = this.ba = bga2.ba;
        this.bb = bga2.bb * 0.5f;
        this.e(this.ba, this.bb);
        this.aj = this.ah = this.ba;
        f2 = bga2.ay * 0.5f;
        f3 = bga2.az;
        if (f3 <= 0.0f) {
            f3 *= 0.25f;
            this.ce = 0;
        }
        if (this.be && this.e == 0.0f && this.L() && !this.M) {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        if (this.e > 0.0f && !this.H() && this.be) {
            this.aY = this.S() * (double)this.e;
            if (this.b(ake.h)) {
                this.aY += (double)((float)(this.c(ake.h).c() + 1) * 0.1f);
            }
            this.c(true);
            this.bO = true;
            if (f3 > 0.0f) {
                float f4 = cmk.a(this.ba * ((float)Math.PI / 180));
                float f5 = cmk.b(this.ba * ((float)Math.PI / 180));
                this.aX += (double)(-0.4f * f4 * this.e);
                this.aZ += (double)(0.4f * f5 * this.e);
                this.a(dah.cx, 0.4f, 1.0f);
            }
            this.e = 0.0f;
        }
        this.al = this.G_() * 0.1f;
        if (this.cK()) {
            this.i((float)this.a(cgz.d).e());
            super.b(f2, f3);
        } else if (bga2 instanceof bdl) {
            this.aX = 0.0;
            this.aY = 0.0;
            this.aZ = 0.0;
        }
        if (this.be) {
            this.e = 0.0f;
            this.c(false);
        }
        this.Z = this.aa;
        double d2 = this.aU - this.aR;
        double d3 = this.aW - this.aT;
        float f6 = cmk.a(d2 * d2 + d3 * d3) * 4.0f;
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        this.aa += (f6 - this.aa) * 0.4f;
        this.ab += this.aa;
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "EntityHorse");
        cgy2.a(bst.e, (cui)new ml("EntityHorse", new String[]{"Items"}));
        cgy2.a(bst.e, (cui)new amo("EntityHorse", "ArmorItem", "SaddleItem"));
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("EatingHaystack", this.K());
        bvp2.a("ChestedHorse", this.I());
        bvp2.a("HasReproduced", this.N());
        bvp2.a("Bred", this.M());
        bvp2.a("Type", this.x().k());
        bvp2.a("Variant", this.B());
        bvp2.a("Temper", this.O());
        bvp2.a("Tame", this.D());
        bvp2.a("SkeletonTrap", this.ah());
        bvp2.a("SkeletonTrapTime", this.aL);
        if (this.F() != null) {
            bvp2.a("OwnerUUID", this.F().toString());
        }
        if (this.I()) {
            bmh bmh2 = new bmh();
            for (int i2 = 2; i2 < this.K.aI_(); ++i2) {
                bhl bhl2 = this.K.a(i2);
                if (bhl2 == null) continue;
                bvp bvp3 = new bvp();
                bvp3.a("Slot", (byte)i2);
                bhl2.b(bvp3);
                bmh2.a(bvp3);
            }
            bvp2.a("Items", bmh2);
        }
        if (this.K.a(1) != null) {
            bvp2.a("ArmorItem", this.K.a(1).b(new bvp()));
        }
        if (this.K.a(0) != null) {
            bvp2.a("SaddleItem", this.K.a(0).b(new bvp()));
        }
    }

    @Override
    public void b(bvp bvp2) {
        Object object;
        Object object2;
        String string;
        super.b(bvp2);
        this.h(bvp2.p("EatingHaystack"));
        this.d(bvp2.p("Bred"));
        this.e(bvp2.p("ChestedHorse"));
        this.f(bvp2.p("HasReproduced"));
        this.a(bmv.a(bvp2.h("Type")));
        this.d(bvp2.h("Variant"));
        this.e(bvp2.h("Temper"));
        this.b(bvp2.p("Tame"));
        this.k(bvp2.p("SkeletonTrap"));
        this.aL = bvp2.h("SkeletonTrapTime");
        if (bvp2.b("OwnerUUID", 8)) {
            string = bvp2.l("OwnerUUID");
        } else {
            object2 = bvp2.l("Owner");
            string = dee.a(this.o_(), (String)object2);
        }
        if (!string.isEmpty()) {
            this.a(UUID.fromString(string));
        }
        if ((object2 = this.bs().b("Speed")) != null) {
            this.a(cgz.d).a(object2.b() * 0.25);
        }
        if (this.I()) {
            object = bvp2.c("Items", 10);
            this.aR();
            for (int i2 = 0; i2 < ((bmh)object).b(); ++i2) {
                bvp bvp3 = ((bmh)object).b(i2);
                int n2 = bvp3.f("Slot") & 0xFF;
                if (n2 < 2 || n2 >= this.K.aI_()) continue;
                this.K.a(n2, bhl.a(bvp3));
            }
        }
        if (bvp2.b("ArmorItem", 10) && (object = bhl.a(bvp2.o("ArmorItem"))) != null && cot.b(((bhl)object).a())) {
            this.K.a(1, (bhl)object);
        }
        if (bvp2.b("SaddleItem", 10) && (object = bhl.a(bvp2.o("SaddleItem"))) != null && ((bhl)object).a() == hp.aC) {
            this.K.a(0, (bhl)object);
        }
        this.bQ();
    }

    @Override
    public boolean a(cxn cxn2) {
        bmv bmv2;
        if (cxn2 == this) {
            return false;
        }
        if (cxn2.getClass() != this.getClass()) {
            return false;
        }
        it it2 = (it)cxn2;
        if (!this.cO() || !it2.cO()) {
            return false;
        }
        bmv bmv3 = this.x();
        return bmv3 == (bmv2 = it2.x()) || bmv3 == bmv.a && bmv2 == bmv.b || bmv3 == bmv.b && bmv2 == bmv.a;
    }

    @Override
    public alf b(alf alf2) {
        it it2 = (it)alf2;
        it it3 = new it(this.aQ);
        bmv bmv2 = this.x();
        bmv bmv3 = it2.x();
        bmv bmv4 = bmv.a;
        if (bmv2 == bmv3) {
            bmv4 = bmv2;
        } else if (bmv2 == bmv.a && bmv3 == bmv.b || bmv2 == bmv.b && bmv3 == bmv.a) {
            bmv4 = bmv.c;
        }
        if (bmv4 == bmv.a) {
            int n2 = this.bx.nextInt(9);
            int n3 = n2 < 4 ? this.B() & 0xFF : (n2 < 8 ? it2.B() & 0xFF : this.bx.nextInt(7));
            int n4 = this.bx.nextInt(5);
            n3 = n4 < 2 ? (n3 |= this.B() & 0xFF00) : (n4 < 4 ? (n3 |= it2.B() & 0xFF00) : (n3 |= this.bx.nextInt(5) << 8 & 0xFF00));
            it3.d(n3);
        }
        it3.a(bmv4);
        double d2 = this.a(cgz.a).b() + alf2.a(cgz.a).b() + (double)this.cQ();
        it3.a(cgz.a).a(d2 / 3.0);
        double d3 = this.a(g).b() + alf2.a(g).b() + this.cR();
        it3.a(g).a(d3 / 3.0);
        double d4 = this.a(cgz.d).b() + alf2.a(cgz.d).b() + this.cS();
        it3.a(cgz.d).a(d4 / 3.0);
        return it3;
    }

    @Override
    public aql a(bgp bgp2, aql aql2) {
        bmv bmv2;
        aql2 = super.a(bgp2, aql2);
        int n2 = 0;
        if (aql2 instanceof cbp) {
            bmv2 = ((cbp)aql2).a;
            n2 = ((cbp)aql2).b & 0xFF | this.bx.nextInt(5) << 8;
        } else {
            if (this.bx.nextInt(10) == 0) {
                bmv2 = bmv.b;
            } else {
                int n3 = this.bx.nextInt(7);
                int n4 = this.bx.nextInt(5);
                bmv2 = bmv.a;
                n2 = n3 | n4 << 8;
            }
            aql2 = new cbp(bmv2, n2);
        }
        this.a(bmv2);
        this.d(n2);
        if (this.bx.nextInt(5) == 0) {
            this.j(-24000);
        }
        if (bmv2.h()) {
            this.a(cgz.a).a(15.0);
            this.a(cgz.d).a(0.2f);
        } else {
            this.a(cgz.a).a(this.cQ());
            if (bmv2 == bmv.a) {
                this.a(cgz.d).a(this.cS());
            } else {
                this.a(cgz.d).a(0.175f);
            }
        }
        if (bmv2.g()) {
            this.a(g).a(0.5);
        } else {
            this.a(g).a(this.cR());
        }
        this.k(this.bo());
        return aql2;
    }

    @Override
    public boolean ad() {
        cpk cpk2 = this.aj();
        return cpk2 instanceof bga;
    }

    public float d(float f2) {
        return this.bZ + (this.aM - this.bZ) * f2;
    }

    public float e(float f2) {
        return this.cb + (this.ca - this.cb) * f2;
    }

    public float f(float f2) {
        return this.cd + (this.cc - this.cd) * f2;
    }

    @Override
    public void g(int n2) {
        if (this.T()) {
            if (n2 < 0) {
                n2 = 0;
            } else {
                this.M = true;
                this.cP();
            }
            this.e = n2 >= 90 ? 1.0f : 0.4f + 0.4f * (float)n2 / 90.0f;
        }
    }

    @Override
    public boolean ae() {
        return this.T();
    }

    @Override
    public void h(int n2) {
        this.M = true;
        this.cP();
    }

    @Override
    public void af() {
    }

    protected void j(boolean bl2) {
        lz lz2 = bl2 ? lz.I : lz.l;
        for (int i2 = 0; i2 < 7; ++i2) {
            double d2 = this.bx.nextGaussian() * 0.02;
            double d3 = this.bx.nextGaussian() * 0.02;
            double d4 = this.bx.nextGaussian() * 0.02;
            this.aQ.a(lz2, this.aU + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, this.aV + 0.5 + (double)(this.bx.nextFloat() * this.bm), this.aW + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, d2, d3, d4, new int[0]);
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 7) {
            this.j(true);
        } else if (by2 == 6) {
            this.j(false);
        } else {
            super.a(by2);
        }
    }

    @Override
    public void c(cpk cpk2) {
        super.c(cpk2);
        if (cpk2 instanceof xy) {
            xy xy2 = (xy)cpk2;
            this.ah = xy2.ah;
        }
        if (this.cb > 0.0f) {
            float f2 = cmk.a(this.ah * ((float)Math.PI / 180));
            float f3 = cmk.b(this.ah * ((float)Math.PI / 180));
            float f4 = 0.7f * this.cb;
            float f5 = 0.15f * this.cb;
            cpk2.d(this.aU + (double)(f4 * f2), this.aV + this.ag() + cpk2.Z_() + (double)f5, this.aW - (double)(f4 * f3));
            if (cpk2 instanceof bga) {
                ((bga)cpk2).ah = this.ah;
            }
        }
    }

    @Override
    public double ag() {
        double d2 = super.ag();
        if (this.x() == bmv.e) {
            d2 -= 0.1875;
        } else if (this.x() == bmv.b) {
            d2 -= 0.25;
        }
        return d2;
    }

    private float cQ() {
        return 15.0f + (float)this.bx.nextInt(8) + (float)this.bx.nextInt(9);
    }

    private double cR() {
        return (double)0.4f + this.bx.nextDouble() * 0.2 + this.bx.nextDouble() * 0.2 + this.bx.nextDouble() * 0.2;
    }

    private double cS() {
        return ((double)0.45f + this.bx.nextDouble() * 0.3 + this.bx.nextDouble() * 0.3 + this.bx.nextDouble() * 0.3) * 0.25;
    }

    public boolean ah() {
        return this.aK;
    }

    public void k(boolean bl2) {
        if (bl2 != this.aK) {
            this.aK = bl2;
            if (bl2) {
                this.m.a(1, this.G);
            } else {
                this.m.a(this.G);
            }
        }
    }

    @Override
    public boolean ai() {
        return false;
    }

    @Override
    public float A() {
        return this.bm;
    }

    @Override
    public boolean a_(int n2, bhl bhl2) {
        int n3;
        if (n2 == 499 && this.x().f()) {
            if (bhl2 == null && this.I()) {
                this.e(false);
                this.aR();
                return true;
            }
            if (bhl2 != null && bhl2.a() == azg.a(blg.ae) && !this.I()) {
                this.e(true);
                this.aR();
                return true;
            }
        }
        if ((n3 = n2 - 400) >= 0 && n3 < 2 && n3 < this.K.aI_()) {
            if (n3 == 0 && bhl2 != null && bhl2.a() != hp.aC) {
                return false;
            }
            if (n3 == 1 && (bhl2 != null && !cot.b(bhl2.a()) || !this.x().j())) {
                return false;
            }
            this.K.a(n3, bhl2);
            this.bQ();
            return true;
        }
        int n4 = n2 - 500 + 2;
        if (n4 >= 2 && n4 < this.K.aI_()) {
            this.K.a(n4, bhl2);
            return true;
        }
        return false;
    }

    @Override
    public cpk aj() {
        if (this.cH().isEmpty()) {
            return null;
        }
        return (cpk)this.cH().get(0);
    }

    @Override
    public agh ak() {
        if (this.x().h()) {
            return agh.b;
        }
        return agh.a;
    }

    @Override
    protected bpx u() {
        return this.x().l();
    }
}

