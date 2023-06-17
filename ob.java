/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class ob
extends ciy {
    public final ut a;
    private final cwj bZ;
    private int ca = 0;
    private double cb;
    private double cc;
    private double cd;
    private float ce;
    private float cf;
    private boolean cg;
    private boolean ch;
    private boolean ci;
    private int cj;
    private boolean ck;
    private String cl;
    public bq b;
    protected bxy c;
    protected int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    private int cm;
    private float cn;
    public float j;
    public float k;
    private boolean co;
    private bqp cp;
    private boolean cq;
    private boolean cr = true;
    private int cs;
    private boolean ct;

    public ob(bxy bxy2, iu iu2, ut ut2, cwj cwj2) {
        super(iu2, ut2.d());
        this.a = ut2;
        this.bZ = cwj2;
        this.c = bxy2;
        this.bS = 0;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        return false;
    }

    @Override
    public void b_(float f2) {
    }

    @Override
    public boolean a(cpk cpk2, boolean bl2) {
        if (!super.a(cpk2, bl2)) {
            return false;
        }
        if (cpk2 instanceof cef) {
            this.c.W().a(new aua(this, (cef)cpk2));
        }
        if (cpk2 instanceof cor) {
            this.bc = cpk2.ba;
            this.ba = cpk2.ba;
            this.n(cpk2.ba);
        }
        return true;
    }

    @Override
    public void s_() {
        super.s_();
        this.cq = false;
    }

    @Override
    public void bb_() {
        if (!this.aQ.d(new cmz(this.aU, 0.0, this.aW))) {
            return;
        }
        super.bb_();
        if (this.cp()) {
            this.a.a(new biz(this.ba, this.bb, this.be));
            this.a.a(new qk(this.ay, this.az, this.b.g, this.b.h));
            cpk cpk2 = this.cJ();
            if (cpk2 != this && cpk2.cK()) {
                this.a.a(new btl(cpk2));
            }
        } else {
            this.k();
        }
    }

    public void k() {
        boolean bl2;
        boolean bl3 = this.cr();
        if (bl3 != this.ci) {
            if (bl3) {
                this.a.a(new cqg(this, awo.d));
            } else {
                this.a.a(new cqg(this, awo.e));
            }
            this.ci = bl3;
        }
        if ((bl2 = this.ar_()) != this.ch) {
            if (bl2) {
                this.a.a(new cqg(this, awo.a));
            } else {
                this.a.a(new cqg(this, awo.b));
            }
            this.ch = bl2;
        }
        if (this.Q()) {
            boolean bl4;
            cxt cxt2 = this.cD();
            double d2 = this.aU - this.cb;
            double d3 = cxt2.b - this.cc;
            double d4 = this.aW - this.cd;
            double d5 = this.ba - this.ce;
            double d6 = this.bb - this.cf;
            ++this.cj;
            boolean bl5 = d2 * d2 + d3 * d3 + d4 * d4 > 9.0E-4 || this.cj >= 20;
            boolean bl6 = bl4 = d5 != 0.0 || d6 != 0.0;
            if (this.cp()) {
                this.a.a(new bzg(this.aX, -999.0, this.aZ, this.ba, this.bb, this.be));
                bl5 = false;
            } else if (bl5 && bl4) {
                this.a.a(new bzg(this.aU, cxt2.b, this.aW, this.ba, this.bb, this.be));
            } else if (bl5) {
                this.a.a(new bgn(this.aU, cxt2.b, this.aW, this.be));
            } else if (bl4) {
                this.a.a(new biz(this.ba, this.bb, this.be));
            } else if (this.cg != this.be) {
                this.a.a(new cyg(this.be));
            }
            if (bl5) {
                this.cb = this.aU;
                this.cc = cxt2.b;
                this.cd = this.aW;
                this.cj = 0;
            }
            if (bl4) {
                this.ce = this.ba;
                this.cf = this.bb;
            }
            this.cg = this.be;
            this.cr = this.c.u.R;
        }
    }

    @Override
    public er a(boolean bl2) {
        bpk bpk2 = bl2 ? bpk.d : bpk.e;
        this.a.a(new cco(bpk2, cmz.e, bqk.a));
        return null;
    }

    @Override
    protected bhl a(er er2) {
        return null;
    }

    public void a(String string) {
        this.a.a(new dcf(string));
    }

    @Override
    public void a(bqp bqp2) {
        super.a(bqp2);
        this.a.a(new apl(bqp2));
    }

    @Override
    public void n() {
        this.a.a(new daq(cpl.a));
    }

    @Override
    protected void b(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return;
        }
        this.k(this.bh() - f2);
    }

    @Override
    public void q() {
        this.a.a(new aqt(this.p.h));
        this.u();
    }

    public void u() {
        this.n.e(null);
        super.q();
        this.c.a((cjn)null);
    }

    public void d(float f2) {
        if (this.ck) {
            float f3 = this.bh() - f2;
            if (f3 <= 0.0f) {
                this.k(f2);
                if (f3 < 0.0f) {
                    this.bB = this.ac / 2;
                }
            } else {
                this.aw = f3;
                this.k(this.bh());
                this.bB = this.ac;
                this.b(ahy.m, f3);
                this.S = this.T = 10;
            }
        } else {
            this.k(f2);
            this.ck = true;
        }
    }

    @Override
    public void a(cyd cyd2, int n2) {
        if (cyd2 == null) {
            return;
        }
        if (cyd2.f) {
            super.a(cyd2, n2);
        }
    }

    @Override
    public void x() {
        this.a.a(new cmw(this.G));
    }

    @Override
    public boolean z() {
        return true;
    }

    protected void B() {
        this.a.a(new cqg(this, awo.f, cmk.d(this.M() * 100.0f)));
    }

    public void C() {
        this.a.a(new cqg(this, awo.h));
    }

    public void b(String string) {
        this.cl = string;
    }

    public String D() {
        return this.cl;
    }

    public cwj E() {
        return this.bZ;
    }

    public int F() {
        return this.ca;
    }

    public void d(int n2) {
        this.ca = n2;
    }

    @Override
    public void b(cbg cbg2) {
        this.c.r.c().a(cbg2);
    }

    @Override
    protected boolean e(double d2, double d3, double d4) {
        if (this.bv) {
            return false;
        }
        cmz cmz2 = new cmz(d2, d3, d4);
        double d5 = d2 - (double)cmz2.a();
        double d6 = d4 - (double)cmz2.c();
        if (!this.b(cmz2)) {
            int n2 = -1;
            double d7 = 9999.0;
            if (this.b(cmz2.k()) && d5 < d7) {
                d7 = d5;
                n2 = 0;
            }
            if (this.b(cmz2.l()) && 1.0 - d5 < d7) {
                d7 = 1.0 - d5;
                n2 = 1;
            }
            if (this.b(cmz2.i()) && d6 < d7) {
                d7 = d6;
                n2 = 4;
            }
            if (this.b(cmz2.j()) && 1.0 - d6 < d7) {
                d7 = 1.0 - d6;
                n2 = 5;
            }
            float f2 = 0.1f;
            if (n2 == 0) {
                this.aX = -0.1f;
            }
            if (n2 == 1) {
                this.aX = 0.1f;
            }
            if (n2 == 4) {
                this.aZ = -0.1f;
            }
            if (n2 == 5) {
                this.aZ = 0.1f;
            }
        }
        return false;
    }

    private boolean b(cmz cmz2) {
        return !this.aQ.n(cmz2).l() && !this.aQ.n(cmz2.g()).l();
    }

    @Override
    public void c_(boolean bl2) {
        super.c_(bl2);
        this.e = 0;
    }

    public void a(float f2, int n2, int n3) {
        this.J = f2;
        this.I = n2;
        this.H = n3;
    }

    @Override
    public void a(cbg cbg2) {
        this.c.r.c().a(cbg2);
    }

    @Override
    public boolean a(int n2, String string) {
        return n2 <= this.F();
    }

    @Override
    public void a(byte by2) {
        if (by2 >= 24 && by2 <= 28) {
            this.d(by2 - 24);
        } else {
            super.a(by2);
        }
    }

    @Override
    public cmz k_() {
        return new cmz(this.aU + 0.5, this.aV + 0.5, this.aW + 0.5);
    }

    @Override
    public void a(bi bi2, float f2, float f3) {
        this.aQ.a(this.aU, this.aV, this.aW, bi2, this.y(), f2, f3, false);
    }

    @Override
    public boolean T_() {
        return true;
    }

    @Override
    public void b(bqp bqp2) {
        bhl bhl2 = this.c(bqp2);
        if (bhl2 == null || this.ag_()) {
            return;
        }
        super.b(bqp2);
        this.co = true;
        this.cp = bqp2;
    }

    @Override
    public boolean ag_() {
        return this.co;
    }

    @Override
    public void ai_() {
        super.ai_();
        this.co = false;
    }

    @Override
    public bqp ah_() {
        return this.cp;
    }

    @Override
    public void a(bcz bcz2) {
        super.a(bcz2);
        if (N.equals(bcz2)) {
            bqp bqp2;
            boolean bl2 = ((Byte)this.bE.a(N) & 1) > 0;
            bqp bqp3 = bqp2 = ((Byte)this.bE.a(N) & 2) > 0 ? bqp.b : bqp.a;
            if (bl2 && !this.co) {
                this.b(bqp2);
            } else if (!bl2 && this.co) {
                this.ai_();
            }
        }
        if (bF.equals(bcz2) && this.bL() && !this.ct) {
            this.c.W().a(new arb(this));
        }
    }

    public boolean L() {
        cpk cpk2 = this.cL();
        return this.cp() && cpk2 instanceof btj && ((btj)((Object)cpk2)).ae();
    }

    public float M() {
        return this.cn;
    }

    @Override
    public void a(bxr bxr2) {
        this.c.a(new adp(bxr2));
    }

    @Override
    public void a(cxh cxh2) {
        this.c.a(new aht(cxh2));
    }

    @Override
    public void a(jf jf2) {
        this.c.a(new ddf(jf2));
    }

    @Override
    public void a(i i2) {
        this.c.a(new bdz(i2));
    }

    @Override
    public void a(bhl bhl2, bqp bqp2) {
        azg azg2 = bhl2.a();
        if (azg2 == hp.bW) {
            this.c.a(new zk(this, bhl2, true));
        }
    }

    @Override
    public void a(tb tb2) {
        String string;
        String string2 = string = tb2 instanceof ciq ? ((ciq)((Object)tb2)).n() : "minecraft:container";
        if ("minecraft:chest".equals(string)) {
            this.c.a(new yg(this.n, tb2));
        } else if ("minecraft:hopper".equals(string)) {
            this.c.a(new bll(this.n, tb2));
        } else if ("minecraft:furnace".equals(string)) {
            this.c.a(new dfy(this.n, tb2));
        } else if ("minecraft:brewing_stand".equals(string)) {
            this.c.a(new byn(this.n, tb2));
        } else if ("minecraft:beacon".equals(string)) {
            this.c.a(new ame(this.n, tb2));
        } else if ("minecraft:dispenser".equals(string) || "minecraft:dropper".equals(string)) {
            this.c.a(new dcw(this.n, tb2));
        } else {
            this.c.a(new yg(this.n, tb2));
        }
    }

    @Override
    public void a(it it2, tb tb2) {
        this.c.a(new adw(this.n, tb2, it2));
    }

    @Override
    public void a(ciq ciq2) {
        String string = ciq2.n();
        if ("minecraft:crafting_table".equals(string)) {
            this.c.a(new bkn(this.n, this.aQ));
        } else if ("minecraft:enchanting_table".equals(string)) {
            this.c.a(new awt(this.n, this.aQ, ciq2));
        } else if ("minecraft:anvil".equals(string)) {
            this.c.a(new aqu(this.n, this.aQ));
        }
    }

    @Override
    public void a(fc fc2) {
        this.c.a(new aez(this.n, fc2, this.aQ));
    }

    @Override
    public void e(cpk cpk2) {
        this.c.j.a(cpk2, lz.j);
    }

    @Override
    public void f(cpk cpk2) {
        this.c.j.a(cpk2, lz.k);
    }

    @Override
    public boolean ar_() {
        boolean bl2 = this.b != null ? this.b.h : false;
        return bl2 && !this.B;
    }

    @Override
    public void aa_() {
        super.aa_();
        if (this.Q()) {
            this.ay = this.b.a;
            this.az = this.b.b;
            this.ax = this.b.g;
            this.h = this.f;
            this.i = this.g;
            this.g = (float)((double)this.g + (double)(this.bb - this.g) * 0.5);
            this.f = (float)((double)this.f + (double)(this.ba - this.f) * 0.5);
        }
    }

    protected boolean Q() {
        return this.c.ab() == this;
    }

    @Override
    public void Q_() {
        Object object;
        boolean bl2;
        ++this.e;
        if (this.d > 0) {
            --this.d;
        }
        this.k = this.j;
        if (this.bQ) {
            if (this.c.m != null && !this.c.m.q_()) {
                this.c.a((cjn)null);
            }
            if (this.j == 0.0f) {
                this.c.W().a(ol.a(dah.ez, this.bx.nextFloat() * 0.4f + 0.8f));
            }
            this.j += 0.0125f;
            if (this.j >= 1.0f) {
                this.j = 1.0f;
            }
            this.bQ = false;
        } else if (this.b(ake.i) && this.c(ake.i).b() > 60) {
            this.j += 0.006666667f;
            if (this.j > 1.0f) {
                this.j = 1.0f;
            }
        } else {
            if (this.j > 0.0f) {
                this.j -= 0.05f;
            }
            if (this.j < 0.0f) {
                this.j = 0.0f;
            }
        }
        if (this.bP > 0) {
            --this.bP;
        }
        boolean bl3 = this.b.g;
        boolean bl4 = this.b.h;
        float f2 = 0.8f;
        boolean bl5 = this.b.b >= 0.8f;
        this.b.a();
        if (this.ag_() && !this.cp()) {
            this.b.a *= 0.2f;
            this.b.b *= 0.2f;
            this.d = 0;
        }
        boolean bl6 = false;
        if (this.cs > 0) {
            --this.cs;
            bl6 = true;
            this.b.g = true;
        }
        cxt cxt2 = this.cD();
        this.e(this.aU - (double)this.bl * 0.35, cxt2.b + 0.5, this.aW + (double)this.bl * 0.35);
        this.e(this.aU - (double)this.bl * 0.35, cxt2.b + 0.5, this.aW - (double)this.bl * 0.35);
        this.e(this.aU + (double)this.bl * 0.35, cxt2.b + 0.5, this.aW - (double)this.bl * 0.35);
        this.e(this.aU + (double)this.bl * 0.35, cxt2.b + 0.5, this.aW + (double)this.bl * 0.35);
        boolean bl7 = bl2 = (float)this.aE().a() > 6.0f || this.G.c;
        if (this.be && !bl4 && !bl5 && this.b.b >= 0.8f && !this.cr() && bl2 && !this.ag_() && !this.b(ake.o)) {
            if (this.d > 0 || this.c.u.Y.e()) {
                this.c_(true);
            } else {
                this.d = 7;
            }
        }
        if (!this.cr() && this.b.b >= 0.8f && bl2 && !this.ag_() && !this.b(ake.o) && this.c.u.Y.e()) {
            this.c_(true);
        }
        if (this.cr() && (this.b.b < 0.8f || this.bf || !bl2)) {
            this.c_(false);
        }
        if (this.G.c) {
            if (this.c.c.k()) {
                if (!this.G.b) {
                    this.G.b = true;
                    this.x();
                }
            } else if (!bl3 && this.b.g && !bl6) {
                if (this.r == 0) {
                    this.r = 7;
                } else {
                    this.G.b = !this.G.b;
                    this.x();
                    this.r = 0;
                }
            }
        }
        if (this.b.g && !bl3 && !this.be && this.aY < 0.0 && !this.bL() && !this.G.b && (object = this.a(dfm.e)) != null && ((bhl)object).a() == hp.cR && anb.g((bhl)object)) {
            this.a.a(new cqg(this, awo.i));
        }
        this.ct = this.bL();
        if (this.G.b && this.Q()) {
            if (this.b.h) {
                this.b.a = (float)((double)this.b.a / 0.3);
                this.b.b = (float)((double)this.b.b / 0.3);
                this.aY -= (double)(this.G.a() * 3.0f);
            }
            if (this.b.g) {
                this.aY += (double)(this.G.a() * 3.0f);
            }
        }
        if (this.L()) {
            object = (btj)((Object)this.cL());
            if (this.cm < 0) {
                ++this.cm;
                if (this.cm == 0) {
                    this.cn = 0.0f;
                }
            }
            if (bl3 && !this.b.g) {
                this.cm = -10;
                object.g(cmk.d(this.M() * 100.0f));
                this.B();
            } else if (!bl3 && this.b.g) {
                this.cm = 0;
                this.cn = 0.0f;
            } else if (bl3) {
                ++this.cm;
                this.cn = this.cm < 10 ? (float)this.cm * 0.1f : 0.8f + 2.0f / (float)(this.cm - 9) * 0.1f;
            }
        } else {
            this.cn = 0.0f;
        }
        super.Q_();
        if (this.be && this.G.b && !this.c.c.k()) {
            this.G.b = false;
            this.x();
        }
    }

    @Override
    public void af_() {
        super.af_();
        this.cq = false;
        if (this.cL() instanceof cor) {
            cor cor2 = (cor)this.cL();
            cor2.a(this.b.e, this.b.f, this.b.c, this.b.d);
            this.cq |= this.b.e || this.b.f || this.b.c || this.b.d;
        }
    }

    public boolean S() {
        return this.cq;
    }

    @Override
    public cko a(bfv bfv2) {
        if (bfv2 == ake.i) {
            this.k = 0.0f;
            this.j = 0.0f;
        }
        return super.a(bfv2);
    }

    @Override
    public void b(double d2, double d3, double d4) {
        double d5 = this.aU;
        double d6 = this.aW;
        super.b(d2, d3, d4);
        this.c((float)(this.aU - d5), (float)(this.aW - d6));
    }

    public boolean T() {
        return this.cr;
    }

    protected void c(float f2, float f3) {
        float f4;
        float f5;
        if (!this.T()) {
            return;
        }
        if (this.cs > 0 || !this.be || this.ar_() || this.cp()) {
            return;
        }
        afo afo2 = this.b.b();
        if (afo2.i == 0.0f && afo2.j == 0.0f) {
            return;
        }
        amj amj2 = new amj(this.aU, this.cD().b, this.aW);
        amj amj3 = new amj(this.aU + (double)f2, this.cD().b, this.aW + (double)f3);
        amj amj4 = new amj(f2, 0.0, f3);
        float f6 = this.G_();
        float f7 = (float)amj4.c();
        if (f7 <= 0.001f) {
            f5 = f6 * afo2.i;
            float f8 = f6 * afo2.j;
            float f9 = cmk.a(this.ba * ((float)Math.PI / 180));
            f4 = cmk.b(this.ba * ((float)Math.PI / 180));
            amj4 = new amj(f5 * f4 - f8 * f9, amj4.c, f8 * f4 + f5 * f9);
            f7 = (float)amj4.c();
            if (f7 <= 0.001f) {
                return;
            }
        }
        f5 = (float)cmk.i(f7);
        amj amj5 = amj4.a((double)f5);
        amj amj6 = this.cn();
        f4 = (float)(amj6.b * amj5.b + amj6.d * amj5.d);
        if (f4 < -0.15f) {
            return;
        }
        cmz cmz2 = new cmz(this.aU, this.cD().e, this.aW);
        dbk dbk2 = this.aQ.n(cmz2);
        if (dbk2.d(this.aQ, cmz2) != null) {
            return;
        }
        dbk dbk3 = this.aQ.n(cmz2 = cmz2.g());
        if (dbk3.d(this.aQ, cmz2) != null) {
            return;
        }
        float f10 = 7.0f;
        float f11 = 1.2f;
        if (this.b(ake.h)) {
            f11 += (float)(this.c(ake.h).c() + 1) * 0.75f;
        }
        float f12 = Math.max(f6 * 7.0f, 1.0f / f5);
        amj amj7 = amj2;
        amj amj8 = amj3.e(amj5.a((double)f12));
        float f13 = this.bl;
        float f14 = this.bm;
        cxt cxt2 = new cxt(amj7, amj8.b(0.0, f14, 0.0)).b((double)f13, 0.0, f13);
        amj7 = amj7.b(0.0, 0.51f, 0.0);
        amj8 = amj8.b(0.0, 0.51f, 0.0);
        amj amj9 = amj5.c(new amj(0.0, 1.0, 0.0));
        amj amj10 = amj9.a((double)(f13 * 0.5f));
        amj amj11 = amj7.d(amj10);
        amj amj12 = amj8.d(amj10);
        amj amj13 = amj7.e(amj10);
        amj amj14 = amj8.e(amj10);
        List list = this.aQ.a((cpk)this, cxt2);
        if (!list.isEmpty()) {
            // empty if block
        }
        float f15 = Float.MIN_VALUE;
        for (cxt cxt3 : list) {
            if (!cxt3.a(amj11, amj12) && !cxt3.a(amj13, amj14)) continue;
            f15 = (float)cxt3.e;
            amj amj15 = cxt3.c();
            cmz cmz3 = new cmz(amj15);
            int n2 = 1;
            while ((float)n2 < f11) {
                dbk dbk4;
                cmz cmz4 = cmz3.b(n2);
                dbk dbk5 = this.aQ.n(cmz4);
                cxt cxt4 = dbk5.d(this.aQ, cmz4);
                if (cxt4 != null && (double)(f15 = (float)cxt4.e + (float)cmz4.b()) - this.cD().b > (double)f11) {
                    return;
                }
                if (n2 > 1 && (dbk4 = this.aQ.n(cmz2 = cmz2.g())).d(this.aQ, cmz2) != null) {
                    return;
                }
                ++n2;
            }
            break block0;
        }
        if (f15 == Float.MIN_VALUE) {
            return;
        }
        float f16 = (float)((double)f15 - this.cD().b);
        if (f16 <= 0.5f || f16 > f11) {
            return;
        }
        this.cs = 1;
    }
}

