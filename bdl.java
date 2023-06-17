/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.aj;
import com.a.a.d.ov;
import com.c.a.e;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public abstract class bdl
extends bga {
    private static final bcz a = bwm.a(bdl.class, cbf.c);
    private static final bcz b = bwm.a(bdl.class, cbf.b);
    protected static final bcz l = bwm.a(bdl.class, cbf.a);
    protected static final bcz m = bwm.a(bdl.class, cbf.a);
    public cps n = new cps(this);
    private aqx c = new aqx();
    public apq o;
    public apq p;
    protected cdl q = new cdl();
    protected int r;
    public float s;
    public float t;
    public int u;
    public double v;
    public double w;
    public double x;
    public double y;
    public double z;
    public double A;
    protected boolean B;
    public cmz C;
    private int d;
    public float D;
    public float E;
    public float F;
    private cmz e;
    private boolean f;
    private cmz g;
    public bvu G = new bvu();
    public int H;
    public int I;
    public float J;
    private int h;
    protected float K = 0.1f;
    protected float L = 0.02f;
    private int i;
    private final e j;
    private boolean k;
    private bhl aK;
    private final bkq aL = this.Z();
    public cvo M;

    protected bkq Z() {
        return new bkq();
    }

    public bdl(iu iu2, e e2) {
        super(iu2);
        this.b(bdl.a(e2));
        this.j = e2;
        this.p = this.o = new bgg(this.n, !iu2.C, this);
        cmz cmz2 = iu2.B();
        this.a_((double)cmz2.a() + 0.5, cmz2.b() + 1, (double)cmz2.c() + 0.5, 0.0f, 0.0f);
        this.au = 180.0f;
        this.bz = 20;
    }

    @Override
    protected void p() {
        super.p();
        this.bs().b(cgz.e).a(1.0);
        this.a(cgz.d).a(0.1f);
        this.bs().b(cgz.f);
        this.bs().b(cgz.i);
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, Float.valueOf(0.0f));
        this.bE.a(b, 0);
        this.bE.a(l, (byte)0);
        this.bE.a(m, (byte)1);
    }

    @Override
    public void bb_() {
        this.bv = this.aL();
        if (this.aL()) {
            this.be = false;
        }
        if (this.u > 0) {
            --this.u;
        }
        if (this.H_()) {
            ++this.d;
            if (this.d > 100) {
                this.d = 100;
            }
            if (!this.aQ.C) {
                if (!this.T()) {
                    this.a(true, true, false);
                } else if (this.aQ.h()) {
                    this.a(false, true, true);
                }
            }
        } else if (this.d > 0) {
            ++this.d;
            if (this.d >= 110) {
                this.d = 0;
            }
        }
        super.bb_();
        if (!this.aQ.C && this.p != null && !this.p.b(this)) {
            this.q();
            this.p = this.o;
        }
        if (this.y_() && this.G.a) {
            this.cb();
        }
        this.C();
        if (!this.cp()) {
            this.g = null;
        }
        if (!this.aQ.C) {
            this.q.a(this);
            this.a(bpv.g);
            if (this.bj()) {
                this.a(bpv.h);
            }
            if (this.ar_()) {
                this.a(bpv.i);
            }
        }
        int n2 = 29999999;
        double d2 = cmk.a(this.aU, -2.9999999E7, 2.9999999E7);
        double d3 = cmk.a(this.aW, -2.9999999E7, 2.9999999E7);
        if (d2 != this.aU || d3 != this.aW) {
            this.d(d2, this.aV, d3);
        }
        ++this.Y;
        bhl bhl2 = this.bt();
        if (!bhl.b(this.aK, bhl2)) {
            if (!bhl.d(this.aK, bhl2)) {
                this.aR();
            }
            this.aK = bhl2 == null ? null : bhl2.j();
        }
        this.aL.a();
        this.ad();
    }

    private void C() {
        this.v = this.y;
        this.w = this.z;
        this.x = this.A;
        double d2 = this.aU - this.y;
        double d3 = this.aV - this.z;
        double d4 = this.aW - this.A;
        double d5 = 10.0;
        if (d2 > 10.0) {
            this.v = this.y = this.aU;
        }
        if (d4 > 10.0) {
            this.x = this.A = this.aW;
        }
        if (d3 > 10.0) {
            this.w = this.z = this.aV;
        }
        if (d2 < -10.0) {
            this.v = this.y = this.aU;
        }
        if (d4 < -10.0) {
            this.x = this.A = this.aW;
        }
        if (d3 < -10.0) {
            this.w = this.z = this.aV;
        }
        this.y += d2 * 0.25;
        this.A += d4 * 0.25;
        this.z += d3 * 0.25;
    }

    protected void ad() {
        float f2;
        float f3;
        if (this.bL()) {
            f3 = 0.6f;
            f2 = 0.6f;
        } else if (this.H_()) {
            f3 = 0.2f;
            f2 = 0.2f;
        } else if (this.ar_()) {
            f3 = 0.6f;
            f2 = 1.65f;
        } else {
            f3 = 0.6f;
            f2 = 1.8f;
        }
        if (f3 != this.bl || f2 != this.bm) {
            cxt cxt2 = this.cD();
            cxt2 = new cxt(cxt2.a, cxt2.b, cxt2.c, cxt2.a + (double)f3, cxt2.b + (double)f2, cxt2.c + (double)f3);
            if (!this.aQ.b(cxt2)) {
                this.a_(f3, f2);
            }
        }
    }

    @Override
    public int al_() {
        return this.G.a ? 1 : 80;
    }

    @Override
    protected bi am_() {
        return dah.eq;
    }

    @Override
    protected bi an_() {
        return dah.ep;
    }

    @Override
    public int aq_() {
        return 10;
    }

    @Override
    public void a(bi bi2, float f2, float f3) {
        this.aQ.a(this, this.aU, this.aV, this.aW, bi2, this.y(), f2, f3);
    }

    @Override
    public csg y() {
        return csg.h;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 9) {
            this.bF();
        } else if (by2 == 23) {
            this.k = false;
        } else if (by2 == 22) {
            this.k = true;
        } else {
            super.a(by2);
        }
    }

    @Override
    protected boolean aa() {
        return this.bh() <= 0.0f || this.H_();
    }

    protected void q() {
        this.p = this.o;
    }

    @Override
    public void af_() {
        if (!this.aQ.C && this.ar_() && this.cp()) {
            this.s_();
            this.q(false);
            return;
        }
        double d2 = this.aU;
        double d3 = this.aV;
        double d4 = this.aW;
        float f2 = this.ba;
        float f3 = this.bb;
        super.af_();
        this.s = this.t;
        this.t = 0.0f;
        this.m(this.aU - d2, this.aV - d3, this.aW - d4);
        if (this.cL() instanceof cna) {
            this.bb = f3;
            this.ba = f2;
            this.ah = ((cna)this.cL()).ah;
        }
    }

    @Override
    public void aj_() {
        this.a_(0.6f, 1.8f);
        super.aj_();
        this.k(this.bo());
        this.V = 0;
    }

    @Override
    protected void aa_() {
        super.aa_();
        this.br();
        this.aj = this.ba;
    }

    @Override
    public void Q_() {
        if (this.r > 0) {
            --this.r;
        }
        if (this.aQ.Q() == ct.a && this.aQ.F().b("naturalRegeneration")) {
            if (this.bh() < this.bo() && this.by % 20 == 0) {
                this.b_(1.0f);
            }
            if (this.q.b() && this.by % 10 == 0) {
                this.q.a(this.q.a() + 1);
            }
        }
        this.n.l();
        this.s = this.t;
        super.Q_();
        cp cp2 = this.a(cgz.d);
        if (!this.aQ.C) {
            cp2.a(this.G.b());
        }
        this.al = this.L;
        if (this.cr()) {
            this.al = (float)((double)this.al + (double)this.L * 0.3);
        }
        this.i((float)cp2.e());
        float f2 = cmk.a(this.aX * this.aX + this.aZ * this.aZ);
        float f3 = (float)(Math.atan(-this.aY * (double)0.2f) * 15.0);
        if (f2 > 0.1f) {
            f2 = 0.1f;
        }
        if (!this.be || this.bh() <= 0.0f) {
            f2 = 0.0f;
        }
        if (this.be || this.bh() <= 0.0f) {
            f3 = 0.0f;
        }
        this.t += (f2 - this.t) * 0.4f;
        this.ae += (f3 - this.ae) * 0.8f;
        if (this.bh() > 0.0f && !this.aL()) {
            cxt cxt2 = this.cp() && !this.cL().bk ? this.cD().a(this.cL().cD()).b(1.0, 0.0, 1.0) : this.cD().b(1.0, 0.5, 1.0);
            List list = this.aQ.b((cpk)this, cxt2);
            for (int i2 = 0; i2 < list.size(); ++i2) {
                cpk cpk2 = (cpk)list.get(i2);
                if (cpk2.bk) continue;
                this.u(cpk2);
            }
        }
    }

    private void u(cpk cpk2) {
        cpk2.b_(this);
    }

    public int al() {
        return (Integer)this.bE.a(b);
    }

    public void f(int n2) {
        this.bE.b(b, n2);
    }

    public void g(int n2) {
        int n3 = this.al();
        this.bE.b(b, n3 + n2);
    }

    @Override
    public void a(ahy ahy2) {
        super.a(ahy2);
        this.a_(0.2f, 0.2f);
        this.d(this.aU, this.aV, this.aW);
        this.aY = 0.1f;
        if ("Notch".equals(this.i_())) {
            this.a(new bhl(hp.e, 1), true, false);
        }
        if (!this.aQ.F().b("keepInventory") && !this.aL()) {
            this.n.m();
        }
        if (ahy2 != null) {
            this.aX = -cmk.b((this.U + this.ba) * ((float)Math.PI / 180)) * 0.1f;
            this.aZ = -cmk.a((this.U + this.ba) * ((float)Math.PI / 180)) * 0.1f;
        } else {
            this.aX = 0.0;
            this.aZ = 0.0;
        }
        this.a(bpv.A);
        this.b(bpv.h);
    }

    @Override
    protected bi r() {
        return dah.em;
    }

    @Override
    protected bi s() {
        return dah.el;
    }

    @Override
    public void a(cpk cpk2, int n2) {
        if (cpk2 == this) {
            return;
        }
        this.g(n2);
        Collection collection = this.aN().a(bcu.f);
        if (cpk2 instanceof bdl) {
            this.a(bpv.D);
            collection.addAll(this.aN().a(bcu.e));
        } else {
            this.a(bpv.B);
        }
        collection.addAll(this.v(cpk2));
        for (bhi bhi2 : collection) {
            this.aN().c(this.i_(), bhi2).a();
        }
    }

    private Collection v(cpk cpk2) {
        int n2;
        ef ef2;
        int n3;
        String string = cpk2 instanceof bdl ? cpk2.i_() : cpk2.cy();
        ef ef3 = this.aN().g(this.i_());
        if (ef3 != null && (n3 = ef3.l().a()) >= 0 && n3 < bcu.n.length) {
            for (bhi bhi2 : this.aN().a(bcu.n[n3])) {
                czu czu2 = this.aN().c(string, bhi2);
                czu2.a();
            }
        }
        if ((ef2 = this.aN().g(string)) != null && (n2 = ef2.l().a()) >= 0 && n2 < bcu.m.length) {
            return this.aN().a(bcu.m[n2]);
        }
        return ov.a();
    }

    public er a(boolean bl2) {
        return this.a(this.n.a(this.n.d, bl2 && this.n.h() != null ? this.n.h().b : 1), false, true);
    }

    public er a(bhl bhl2, boolean bl2) {
        return this.a(bhl2, false, false);
    }

    public er a(bhl bhl2, boolean bl2, boolean bl3) {
        float f2;
        if (bhl2 == null) {
            return null;
        }
        if (bhl2.b == 0) {
            return null;
        }
        double d2 = this.aV - (double)0.3f + (double)this.A();
        er er2 = new er(this.aQ, this.aU, d2, this.aW, bhl2);
        er2.c(40);
        if (bl3) {
            er2.b(this.i_());
        }
        if (bl2) {
            f2 = this.bx.nextFloat() * 0.5f;
            float f3 = this.bx.nextFloat() * ((float)Math.PI * 2);
            er2.aX = -cmk.a(f3) * f2;
            er2.aZ = cmk.b(f3) * f2;
            er2.aY = 0.2f;
        } else {
            f2 = 0.3f;
            er2.aX = -cmk.a(this.ba * ((float)Math.PI / 180)) * cmk.b(this.bb * ((float)Math.PI / 180)) * f2;
            er2.aZ = cmk.b(this.ba * ((float)Math.PI / 180)) * cmk.b(this.bb * ((float)Math.PI / 180)) * f2;
            er2.aY = -cmk.a(this.bb * ((float)Math.PI / 180)) * f2 + 0.1f;
            float f4 = this.bx.nextFloat() * ((float)Math.PI * 2);
            f2 = 0.02f * this.bx.nextFloat();
            er2.aX += Math.cos(f4) * (double)f2;
            er2.aY += (double)((this.bx.nextFloat() - this.bx.nextFloat()) * 0.1f);
            er2.aZ += Math.sin(f4) * (double)f2;
        }
        bhl bhl3 = this.a(er2);
        if (bl3) {
            if (bhl3 != null) {
                this.a(bpv.e(bhl3.a()), bhl2.b);
            }
            this.a(bpv.x);
        }
        return er2;
    }

    protected bhl a(er er2) {
        this.aQ.b(er2);
        return er2.h();
    }

    public float a(dbk dbk2) {
        float f2 = this.n.a(dbk2);
        if (f2 > 1.0f) {
            int n2 = acz.e(this);
            bhl bhl2 = this.bt();
            if (n2 > 0 && bhl2 != null) {
                f2 += (float)(n2 * n2 + 1);
            }
        }
        if (this.b(ake.c)) {
            f2 *= 1.0f + (float)(this.c(ake.c).c() + 1) * 0.2f;
        }
        if (this.b(ake.d)) {
            float f3;
            switch (this.c(ake.d).c()) {
                case 0: {
                    f3 = 0.3f;
                    break;
                }
                case 1: {
                    f3 = 0.09f;
                    break;
                }
                case 2: {
                    f3 = 0.0027f;
                    break;
                }
                default: {
                    f3 = 8.1E-4f;
                }
            }
            f2 *= f3;
        }
        if (this.a(ahk.h) && !acz.i(this)) {
            f2 /= 5.0f;
        }
        if (!this.be) {
            f2 /= 5.0f;
        }
        return f2;
    }

    public boolean b(dbk dbk2) {
        return this.n.b(dbk2);
    }

    public static void a(cgy cgy2) {
        cgy2.a(bst.b, (cui)new afz());
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        this.b(bdl.a(this.j));
        bmh bmh2 = bvp2.c("Inventory", 10);
        this.n.b(bmh2);
        this.n.d = bvp2.h("SelectedItemSlot");
        this.B = bvp2.p("Sleeping");
        this.d = bvp2.g("SleepTimer");
        this.J = bvp2.j("XpP");
        this.H = bvp2.h("XpLevel");
        this.I = bvp2.h("XpTotal");
        this.h = bvp2.h("XpSeed");
        if (this.h == 0) {
            this.h = this.bx.nextInt();
        }
        this.f(bvp2.h("Score"));
        if (this.B) {
            this.C = new cmz(this);
            this.a(true, true, false);
        }
        if (bvp2.b("SpawnX", 99) && bvp2.b("SpawnY", 99) && bvp2.b("SpawnZ", 99)) {
            this.e = new cmz(bvp2.h("SpawnX"), bvp2.h("SpawnY"), bvp2.h("SpawnZ"));
            this.f = bvp2.p("SpawnForced");
        }
        this.q.a(bvp2);
        this.G.b(bvp2);
        if (bvp2.b("EnderItems", 9)) {
            bmh bmh3 = bvp2.c("EnderItems", 10);
            this.c.a(bmh3);
        }
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("DataVersion", 510);
        bvp2.a("Inventory", this.n.a(new bmh()));
        bvp2.a("SelectedItemSlot", this.n.d);
        bvp2.a("Sleeping", this.B);
        bvp2.a("SleepTimer", (short)this.d);
        bvp2.a("XpP", this.J);
        bvp2.a("XpLevel", this.H);
        bvp2.a("XpTotal", this.I);
        bvp2.a("XpSeed", this.h);
        bvp2.a("Score", this.al());
        if (this.e != null) {
            bvp2.a("SpawnX", this.e.a());
            bvp2.a("SpawnY", this.e.b());
            bvp2.a("SpawnZ", this.e.c());
            bvp2.a("SpawnForced", this.f);
        }
        this.q.b(bvp2);
        this.G.a(bvp2);
        bvp2.a("EnderItems", this.c.h());
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        if (this.G.a && !ahy2.i()) {
            return false;
        }
        this.ap = 0;
        if (this.bh() <= 0.0f) {
            return false;
        }
        if (this.H_() && !this.aQ.C) {
            this.a(true, true, false);
        }
        if (ahy2.r()) {
            if (this.aQ.Q() == ct.a) {
                f2 = 0.0f;
            }
            if (this.aQ.Q() == ct.b) {
                f2 = f2 / 2.0f + 1.0f;
            }
            if (this.aQ.Q() == ct.d) {
                f2 = f2 * 3.0f / 2.0f;
            }
        }
        if (f2 == 0.0f) {
            return false;
        }
        return super.a(ahy2, f2);
    }

    public boolean c(bdl bdl2) {
        ccw ccw2 = this.as_();
        ccw ccw3 = bdl2.as_();
        if (ccw2 == null) {
            return true;
        }
        if (!ccw2.a(ccw3)) {
            return true;
        }
        return ccw2.f();
    }

    @Override
    protected void c_(float f2) {
        this.n.a(f2);
    }

    @Override
    protected void d_(float f2) {
        if (f2 >= 3.0f && this.aH != null && this.aH.a() == hp.cQ) {
            int n2 = 1 + cmk.d(f2);
            this.aH.a(n2, (bga)this);
            if (this.aH.b <= 0) {
                bqp bqp2 = this.ah_();
                if (bqp2 == bqp.a) {
                    this.a(dfm.a, null);
                } else {
                    this.a(dfm.b, null);
                }
                this.aH = null;
                this.a(dah.fd, 0.8f, 0.8f + this.aQ.p.nextFloat() * 0.4f);
            }
        }
    }

    public float am() {
        int n2 = 0;
        for (bhl bhl2 : this.n.b) {
            if (bhl2 == null) continue;
            ++n2;
        }
        return (float)n2 / (float)this.n.b.length;
    }

    @Override
    protected void b(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return;
        }
        f2 = this.c(ahy2, f2);
        float f3 = f2 = this.d(ahy2, f2);
        f2 = Math.max(f2 - this.aO(), 0.0f);
        this.a_(this.aO() - (f3 - f2));
        if (f2 == 0.0f) {
            return;
        }
        this.g(ahy2.h());
        float f4 = this.bh();
        this.k(this.bh() - f2);
        this.bm().a(ahy2, f4, f2);
        if (f2 < 3.4028235E37f) {
            this.a(bpv.z, Math.round(f2 * 10.0f));
        }
    }

    public void a(bxr bxr2) {
    }

    public void a(cxh cxh2) {
    }

    public void a(jf jf2) {
    }

    public void a(i i2) {
    }

    public void a(fc fc2) {
    }

    public void a(tb tb2) {
    }

    public void a(it it2, tb tb2) {
    }

    public void a(ciq ciq2) {
    }

    public void a(bhl bhl2, bqp bqp2) {
    }

    public cey a(cpk cpk2, bhl bhl2, bqp bqp2) {
        bhl bhl3;
        if (this.aL()) {
            if (cpk2 instanceof tb) {
                this.a((tb)((Object)cpk2));
            }
            return cey.b;
        }
        bhl bhl4 = bhl3 = bhl2 != null ? bhl2.j() : null;
        if (cpk2.a(this, bhl2, bqp2)) {
            if (bhl2 != null && bhl2 == this.c(bqp2)) {
                if (bhl2.b <= 0 && !this.G.d) {
                    this.a(bqp2, null);
                } else if (bhl2.b < bhl3.b && this.G.d) {
                    bhl2.b = bhl3.b;
                }
            }
            return cey.a;
        }
        if (bhl2 != null && cpk2 instanceof bga) {
            if (this.G.d) {
                bhl2 = bhl3;
            }
            if (bhl2.a(this, (bga)cpk2, bqp2)) {
                if (bhl2.b <= 0 && !this.G.d) {
                    this.a(bqp2, null);
                }
                return cey.a;
            }
        }
        return cey.b;
    }

    @Override
    public double Z_() {
        return -0.35;
    }

    @Override
    public void s_() {
        super.s_();
        this.aO = 0;
    }

    public void g(cpk cpk2) {
        if (!cpk2.c()) {
            return;
        }
        if (cpk2.d_(this)) {
            return;
        }
        float f2 = (float)this.a(cgz.e).e();
        float f3 = cpk2 instanceof bga ? acz.a(this.bt(), ((bga)cpk2).ak()) : acz.a(this.bt(), agh.a);
        float f4 = this.j(0.5f);
        f3 *= f4;
        this.aR();
        if ((f2 *= 0.2f + f4 * f4 * 0.8f) > 0.0f || f3 > 0.0f) {
            bhl bhl2;
            boolean bl2 = f4 > 0.9f;
            boolean bl3 = false;
            int n2 = 0;
            n2 += acz.a(this);
            if (this.cr() && bl2) {
                this.aQ.a(null, this.aU, this.aV, this.aW, dah.ed, this.y(), 1.0f, 1.0f);
                ++n2;
                bl3 = true;
            }
            boolean bl4 = bl2 && this.bq > 0.0f && !this.be && !this.ai() && !this.V_() && !this.b(ake.o) && !this.cp() && cpk2 instanceof bga;
            boolean bl5 = bl4 = bl4 && !this.cr();
            if (bl4) {
                f2 *= 1.5f;
            }
            f2 += f3;
            boolean bl6 = false;
            double d2 = this.bo - this.bn;
            if (bl2 && !bl4 && !bl3 && this.be && d2 < (double)this.G_() && (bhl2 = this.c(bqp.a)) != null && bhl2.a() instanceof bof) {
                bl6 = true;
            }
            float f5 = 0.0f;
            boolean bl7 = false;
            int n3 = acz.b(this);
            if (cpk2 instanceof bga) {
                f5 = ((bga)cpk2).bh();
                if (n3 > 0 && !cpk2.y_()) {
                    bl7 = true;
                    cpk2.m(1);
                }
            }
            double d3 = cpk2.aX;
            double d4 = cpk2.aY;
            double d5 = cpk2.aZ;
            boolean bl8 = cpk2.a(ahy.a(this), f2);
            if (bl8) {
                Object object;
                Object object2;
                Object object3;
                if (n2 > 0) {
                    if (cpk2 instanceof bga) {
                        ((bga)cpk2).a((cpk)this, (float)n2 * 0.5f, (double)cmk.a(this.ba * ((float)Math.PI / 180)), (double)(-cmk.b(this.ba * ((float)Math.PI / 180))));
                    } else {
                        cpk2.c(-cmk.a(this.ba * ((float)Math.PI / 180)) * (float)n2 * 0.5f, 0.1, cmk.b(this.ba * ((float)Math.PI / 180)) * (float)n2 * 0.5f);
                    }
                    this.aX *= 0.6;
                    this.aZ *= 0.6;
                    this.c_(false);
                }
                if (bl6) {
                    object3 = this.aQ.a(bga.class, cpk2.cD().b(1.0, 0.25, 1.0));
                    object2 = object3.iterator();
                    while (object2.hasNext()) {
                        object = (bga)object2.next();
                        if (object == this || object == cpk2 || this.d((cpk)object) || !(this.l((cpk)object) < 9.0)) continue;
                        ((bga)object).a((cpk)this, 0.4f, (double)cmk.a(this.ba * ((float)Math.PI / 180)), (double)(-cmk.b(this.ba * ((float)Math.PI / 180))));
                        ((bga)object).a(ahy.a(this), 1.0f);
                    }
                    this.aQ.a(null, this.aU, this.aV, this.aW, dah.eg, this.y(), 1.0f, 1.0f);
                    this.ao();
                }
                if (cpk2 instanceof czt && cpk2.bi) {
                    ((czt)cpk2).a.a(new gi(cpk2));
                    cpk2.bi = false;
                    cpk2.aX = d3;
                    cpk2.aY = d4;
                    cpk2.aZ = d5;
                }
                if (bl4) {
                    this.aQ.a(null, this.aU, this.aV, this.aW, dah.ec, this.y(), 1.0f, 1.0f);
                    this.e(cpk2);
                }
                if (!bl4 && !bl6) {
                    if (bl2) {
                        this.aQ.a(null, this.aU, this.aV, this.aW, dah.ef, this.y(), 1.0f, 1.0f);
                    } else {
                        this.aQ.a(null, this.aU, this.aV, this.aW, dah.eh, this.y(), 1.0f, 1.0f);
                    }
                }
                if (f3 > 0.0f) {
                    this.f(cpk2);
                }
                if (!this.aQ.C && cpk2 instanceof bdl) {
                    object3 = (bdl)cpk2;
                    object2 = this.bt();
                    Object object4 = object = ((bga)object3).ag_() ? ((bga)object3).bG() : null;
                    if (object2 != null && object != null && ((bhl)object2).a() instanceof bap && ((bhl)object).a() == hp.cQ) {
                        float f6 = 0.25f + (float)acz.e(this) * 0.05f;
                        if (bl3) {
                            f6 += 0.75f;
                        }
                        if (this.bx.nextFloat() < f6) {
                            ((bdl)object3).aS().a(hp.cQ, 100);
                            this.aQ.a((cpk)object3, (byte)30);
                        }
                    }
                }
                if (f2 >= 18.0f) {
                    this.a((cyd)bpa.F);
                }
                this.h(cpk2);
                if (cpk2 instanceof bga) {
                    acz.a((bga)cpk2, (cpk)this);
                }
                acz.b(this, cpk2);
                object3 = this.bt();
                object2 = cpk2;
                if (cpk2 instanceof ckm && (object = ((ckm)cpk2).a) instanceof bga) {
                    object2 = (bga)object;
                }
                if (object3 != null && object2 instanceof bga) {
                    ((bhl)object3).a((bga)object2, this);
                    if (((bhl)object3).b <= 0) {
                        this.a(bqp.a, null);
                    }
                }
                if (cpk2 instanceof bga) {
                    float f7 = f5 - ((bga)cpk2).bh();
                    this.a(bpv.y, Math.round(f7 * 10.0f));
                    if (n3 > 0) {
                        cpk2.m(n3 * 4);
                    }
                    if (this.aQ instanceof alj && f7 > 2.0f) {
                        int n4 = (int)((double)f7 * 0.5);
                        ((alj)this.aQ).a(lz.S, cpk2.aU, cpk2.aV + (double)(cpk2.bm * 0.5f), cpk2.aW, n4, 0.1, 0.0, 0.1, 0.2, new int[0]);
                    }
                }
                this.g(0.3f);
            } else {
                this.aQ.a(null, this.aU, this.aV, this.aW, dah.ee, this.y(), 1.0f, 1.0f);
                if (bl7) {
                    cpk2.cb();
                }
            }
        }
    }

    public void e(cpk cpk2) {
    }

    public void f(cpk cpk2) {
    }

    public void ao() {
        double d2 = -cmk.a(this.ba * ((float)Math.PI / 180));
        double d3 = cmk.b(this.ba * ((float)Math.PI / 180));
        if (this.aQ instanceof alj) {
            ((alj)this.aQ).a(lz.T, this.aU + d2, this.aV + (double)this.bm * 0.5, this.aW + d3, 0, d2, 0.0, d3, 0.0, new int[0]);
        }
    }

    public void n() {
    }

    @Override
    public void ak_() {
        super.ak_();
        this.o.a(this);
        if (this.p != null) {
            this.p.a(this);
        }
    }

    @Override
    public boolean K_() {
        return !this.B && super.K_();
    }

    public boolean z() {
        return false;
    }

    public e aq() {
        return this.j;
    }

    public bqd a(cmz cmz2) {
        if (!this.aQ.C) {
            if (this.H_() || !this.bj()) {
                return bqd.e;
            }
            if (!this.aQ.q.e()) {
                return bqd.b;
            }
            if (this.aQ.h()) {
                return bqd.c;
            }
            if (Math.abs(this.aU - (double)cmz2.a()) > 3.0 || Math.abs(this.aV - (double)cmz2.b()) > 2.0 || Math.abs(this.aW - (double)cmz2.c()) > 3.0) {
                return bqd.d;
            }
            double d2 = 8.0;
            double d3 = 5.0;
            List list = this.aQ.a(acm.class, new cxt((double)cmz2.a() - 8.0, (double)cmz2.b() - 5.0, (double)cmz2.c() - 8.0, (double)cmz2.a() + 8.0, (double)cmz2.b() + 5.0, (double)cmz2.c() + 8.0));
            if (!list.isEmpty()) {
                return bqd.f;
            }
        }
        if (this.cp()) {
            this.s_();
        }
        this.a_(0.2f, 0.2f);
        if (this.aQ.d(cmz2)) {
            bqk bqk2 = (bqk)((Object)this.aQ.n(cmz2).b(cli.j));
            float f2 = 0.5f;
            float f3 = 0.5f;
            switch (bqk2) {
                case d: {
                    f3 = 0.9f;
                    break;
                }
                case c: {
                    f3 = 0.1f;
                    break;
                }
                case e: {
                    f2 = 0.1f;
                    break;
                }
                case f: {
                    f2 = 0.9f;
                }
            }
            this.a(bqk2);
            this.d((float)cmz2.a() + f2, (float)cmz2.b() + 0.6875f, (float)cmz2.c() + f3);
        } else {
            this.d((float)cmz2.a() + 0.5f, (float)cmz2.b() + 0.6875f, (float)cmz2.c() + 0.5f);
        }
        this.B = true;
        this.d = 0;
        this.C = cmz2;
        this.aX = 0.0;
        this.aY = 0.0;
        this.aZ = 0.0;
        if (!this.aQ.C) {
            this.aQ.G();
        }
        return bqd.a;
    }

    private void a(bqk bqk2) {
        this.D = 0.0f;
        this.F = 0.0f;
        switch (bqk2) {
            case d: {
                this.F = -1.8f;
                break;
            }
            case c: {
                this.F = 1.8f;
                break;
            }
            case e: {
                this.D = 1.8f;
                break;
            }
            case f: {
                this.D = -1.8f;
            }
        }
    }

    public void a(boolean bl2, boolean bl3, boolean bl4) {
        this.a_(0.6f, 1.8f);
        dbk dbk2 = this.aQ.n(this.C);
        if (this.C != null && dbk2.t() == blg.C) {
            this.aQ.a(this.C, dbk2.a(dx.b, Boolean.valueOf(false)), 4);
            cmz cmz2 = dx.a(this.aQ, this.C, 0);
            if (cmz2 == null) {
                cmz2 = this.C.g();
            }
            this.d((float)cmz2.a() + 0.5f, (float)cmz2.b() + 0.1f, (float)cmz2.c() + 0.5f);
        }
        this.B = false;
        if (!this.aQ.C && bl3) {
            this.aQ.G();
        }
        int n2 = this.d = bl2 ? 0 : 100;
        if (bl4) {
            this.a(this.C, false);
        }
    }

    private boolean T() {
        return this.aQ.n(this.C).t() == blg.C;
    }

    public static cmz a(iu iu2, cmz cmz2, boolean bl2) {
        bfa bfa2 = iu2.n(cmz2).t();
        if (bfa2 != blg.C) {
            if (!bl2) {
                return null;
            }
            boolean bl3 = bfa2.m();
            boolean bl4 = iu2.n(cmz2.g()).t().m();
            if (bl3 && bl4) {
                return cmz2;
            }
            return null;
        }
        return dx.a(iu2, cmz2, 0);
    }

    public float ar() {
        if (this.C != null) {
            bqk bqk2 = (bqk)((Object)this.aQ.n(this.C).b(cli.j));
            switch (bqk2) {
                case d: {
                    return 90.0f;
                }
                case e: {
                    return 0.0f;
                }
                case c: {
                    return 270.0f;
                }
                case f: {
                    return 180.0f;
                }
            }
        }
        return 0.0f;
    }

    @Override
    public boolean H_() {
        return this.B;
    }

    public boolean at() {
        return this.B && this.d >= 100;
    }

    public int au() {
        return this.d;
    }

    public void b(cbg cbg2) {
    }

    public cmz av() {
        return this.e;
    }

    public boolean aw() {
        return this.f;
    }

    public void a(cmz cmz2, boolean bl2) {
        if (cmz2 != null) {
            this.e = cmz2;
            this.f = bl2;
        } else {
            this.e = null;
            this.f = false;
        }
    }

    public boolean a(box box2) {
        return false;
    }

    public void a(cyd cyd2) {
        this.a(cyd2, 1);
    }

    public void a(cyd cyd2, int n2) {
    }

    public void b(cyd cyd2) {
    }

    @Override
    public void ad_() {
        super.ad_();
        this.a(bpv.w);
        if (this.cr()) {
            this.g(0.8f);
        } else {
            this.g(0.2f);
        }
    }

    @Override
    public void b(float f2, float f3) {
        double d2 = this.aU;
        double d3 = this.aV;
        double d4 = this.aW;
        if (this.G.b && !this.cp()) {
            double d5 = this.aY;
            float f4 = this.al;
            this.al = this.G.a() * (float)(this.cr() ? 2 : 1);
            super.b(f2, f3);
            this.aY = d5 * 0.6;
            this.al = f4;
            this.bq = 0.0f;
            this.b(7, false);
        } else {
            super.b(f2, f3);
        }
        this.f(this.aU - d2, this.aV - d3, this.aW - d4);
    }

    @Override
    public float G_() {
        return (float)this.a(cgz.d).e();
    }

    public void f(double d2, double d3, double d4) {
        if (this.cp()) {
            return;
        }
        if (this.a(ahk.h)) {
            int n2 = Math.round(cmk.a(d2 * d2 + d3 * d3 + d4 * d4) * 100.0f);
            if (n2 > 0) {
                this.a(bpv.q, n2);
                this.g(0.015f * (float)n2 * 0.01f);
            }
        } else if (this.V_()) {
            int n3 = Math.round(cmk.a(d2 * d2 + d4 * d4) * 100.0f);
            if (n3 > 0) {
                this.a(bpv.m, n3);
                this.g(0.015f * (float)n3 * 0.01f);
            }
        } else if (this.ai()) {
            if (d3 > 0.0) {
                this.a(bpv.o, (int)Math.round(d3 * 100.0));
            }
        } else if (this.be) {
            int n4 = Math.round(cmk.a(d2 * d2 + d4 * d4) * 100.0f);
            if (n4 > 0) {
                if (this.cr()) {
                    this.a(bpv.l, n4);
                    this.g(0.099999994f * (float)n4 * 0.01f);
                } else if (this.ar_()) {
                    this.a(bpv.k, n4);
                    this.g(0.005f * (float)n4 * 0.01f);
                } else {
                    this.a(bpv.j, n4);
                    this.g(0.01f * (float)n4 * 0.01f);
                }
            }
        } else if (this.bL()) {
            int n5 = Math.round(cmk.a(d2 * d2 + d3 * d3 + d4 * d4) * 100.0f);
            this.a(bpv.v, n5);
        } else {
            int n6 = Math.round(cmk.a(d2 * d2 + d4 * d4) * 100.0f);
            if (n6 > 25) {
                this.a(bpv.p, n6);
            }
        }
    }

    private void m(double d2, double d3, double d4) {
        int n2;
        if (this.cp() && (n2 = Math.round(cmk.a(d2 * d2 + d3 * d3 + d4 * d4) * 100.0f)) > 0) {
            if (this.cL() instanceof cef) {
                this.a(bpv.r, n2);
                if (this.g == null) {
                    this.g = new cmz(this);
                } else if (this.g.d((double)cmk.c(this.aU), (double)cmk.c(this.aV), (double)cmk.c(this.aW)) >= 1000000.0) {
                    this.a((cyd)bpa.q);
                }
            } else if (this.cL() instanceof cor) {
                this.a(bpv.s, n2);
            } else if (this.cL() instanceof cna) {
                this.a(bpv.t, n2);
            } else if (this.cL() instanceof it) {
                this.a(bpv.u, n2);
            }
        }
    }

    @Override
    public void a(float f2, float f3) {
        if (this.G.c) {
            return;
        }
        if (f2 >= 2.0f) {
            this.a(bpv.n, (int)Math.round((double)f2 * 100.0));
        }
        super.a(f2, f3);
    }

    @Override
    protected void J_() {
        if (!this.aL()) {
            super.J_();
        }
    }

    @Override
    protected bi c_(int n2) {
        if (n2 > 4) {
            return dah.ei;
        }
        return dah.eo;
    }

    @Override
    public void a_(bga bga2) {
        qb qb2;
        if (bga2 instanceof cso) {
            this.a((cyd)bpa.s);
        }
        if ((qb2 = (qb)vb.a.get(vb.b(bga2))) != null) {
            this.a(qb2.d);
        }
    }

    @Override
    public void X_() {
        if (!this.G.b) {
            super.X_();
        }
    }

    public void h(int n2) {
        this.g(n2);
        int n3 = Integer.MAX_VALUE - this.I;
        if (n2 > n3) {
            n2 = n3;
        }
        this.J += (float)n2 / (float)this.aD();
        this.I += n2;
        while (this.J >= 1.0f) {
            this.J = (this.J - 1.0f) * (float)this.aD();
            this.j(1);
            this.J /= (float)this.aD();
        }
    }

    public int aC() {
        return this.h;
    }

    public void i(int n2) {
        this.H -= n2;
        if (this.H < 0) {
            this.H = 0;
            this.J = 0.0f;
            this.I = 0;
        }
        this.h = this.bx.nextInt();
    }

    public void j(int n2) {
        this.H += n2;
        if (this.H < 0) {
            this.H = 0;
            this.J = 0.0f;
            this.I = 0;
        }
        if (n2 > 0 && this.H % 5 == 0 && (float)this.i < (float)this.by - 100.0f) {
            float f2 = this.H > 30 ? 1.0f : (float)this.H / 30.0f;
            this.aQ.a(null, this.aU, this.aV, this.aW, dah.en, this.y(), f2 * 0.75f, 1.0f);
            this.i = this.by;
        }
    }

    public int aD() {
        if (this.H >= 30) {
            return 112 + (this.H - 30) * 9;
        }
        if (this.H >= 15) {
            return 37 + (this.H - 15) * 5;
        }
        return 7 + this.H * 2;
    }

    public void g(float f2) {
        if (this.G.a) {
            return;
        }
        if (!this.aQ.C) {
            this.q.a(f2);
        }
    }

    public cdl aE() {
        return this.q;
    }

    public boolean d(boolean bl2) {
        return (bl2 || this.q.b()) && !this.G.a;
    }

    public boolean aF() {
        return this.bh() > 0.0f && this.bh() < this.bo();
    }

    public boolean aG() {
        return this.G.e;
    }

    public boolean a(cmz cmz2, bqk bqk2, bhl bhl2) {
        if (this.G.e) {
            return true;
        }
        if (bhl2 == null) {
            return false;
        }
        cmz cmz3 = cmz2.c(bqk2.e());
        bfa bfa2 = this.aQ.n(cmz3).t();
        return bhl2.b(bfa2) || bhl2.x();
    }

    @Override
    protected int c_(bdl bdl2) {
        if (this.aQ.F().b("keepInventory") || this.aL()) {
            return 0;
        }
        int n2 = this.H * 7;
        if (n2 > 100) {
            return 100;
        }
        return n2;
    }

    @Override
    protected boolean D_() {
        return true;
    }

    @Override
    public boolean F_() {
        return true;
    }

    public void a(bdl bdl2, boolean bl2) {
        if (bl2) {
            this.n.a(bdl2.n);
            this.k(bdl2.bh());
            this.q = bdl2.q;
            this.H = bdl2.H;
            this.I = bdl2.I;
            this.J = bdl2.J;
            this.f(bdl2.al());
            this.bT = bdl2.bT;
            this.bU = bdl2.bU;
            this.bV = bdl2.bV;
        } else if (this.aQ.F().b("keepInventory") || bdl2.aL()) {
            this.n.a(bdl2.n);
            this.H = bdl2.H;
            this.I = bdl2.I;
            this.J = bdl2.J;
            this.f(bdl2.al());
        }
        this.h = bdl2.h;
        this.c = bdl2.c;
        this.bY().b(l, bdl2.bY().a(l));
    }

    @Override
    protected boolean e() {
        return !this.G.b;
    }

    public void x() {
    }

    public void a(bvh bvh2) {
    }

    @Override
    public String i_() {
        return this.j.b();
    }

    public aqx aJ() {
        return this.c;
    }

    @Override
    public bhl a(dfm dfm2) {
        if (dfm2 == dfm.a) {
            return this.n.h();
        }
        if (dfm2 == dfm.b) {
            return this.n.c[0];
        }
        if (dfm2.a() == dfd.b) {
            return this.n.b[dfm2.b()];
        }
        return null;
    }

    @Override
    public void a(dfm dfm2, bhl bhl2) {
        if (dfm2 == dfm.a) {
            this.d(bhl2);
            this.n.a[this.n.d] = bhl2;
        } else if (dfm2 == dfm.b) {
            this.d(bhl2);
            this.n.c[0] = bhl2;
        } else if (dfm2.a() == dfd.b) {
            this.d(bhl2);
            this.n.b[dfm2.b()] = bhl2;
        }
    }

    @Override
    public Iterable aA() {
        return ov.a(this.bt(), this.bu());
    }

    @Override
    public Iterable aB() {
        return Arrays.asList(this.n.b);
    }

    @Override
    public boolean a_(bdl bdl2) {
        if (!this.ct()) {
            return false;
        }
        if (bdl2.aL()) {
            return false;
        }
        ccw ccw2 = this.as_();
        return ccw2 == null || bdl2 == null || bdl2.as_() != ccw2 || !ccw2.g();
    }

    public abstract boolean aL();

    public abstract boolean aM();

    @Override
    public boolean A_() {
        return !this.G.b;
    }

    public bzt aN() {
        return this.aQ.P();
    }

    @Override
    public ccw as_() {
        return this.aN().g(this.i_());
    }

    @Override
    public cbg v() {
        aym aym2 = new aym(ef.a(this.as_(), this.i_()));
        aym2.h().a(new cxk(nc.d, "/msg " + this.i_() + " "));
        aym2.h().a(this.cC());
        aym2.h().a(this.i_());
        return aym2;
    }

    @Override
    public float A() {
        float f2 = 1.62f;
        if (this.H_()) {
            f2 = 0.2f;
        } else if (this.ar_() || this.bm == 1.65f) {
            f2 -= 0.08f;
        } else if (this.bL() || this.bm == 0.6f) {
            f2 = 0.4f;
        }
        return f2;
    }

    @Override
    public void a_(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.bY().b(a, Float.valueOf(f2));
    }

    @Override
    public float aO() {
        return ((Float)this.bY().a(a)).floatValue();
    }

    public static UUID a(e e2) {
        UUID uUID = e2.a();
        if (uUID == null) {
            uUID = bdl.c(e2.b());
        }
        return uUID;
    }

    public static UUID c(String string) {
        return UUID.nameUUIDFromBytes(("OfflinePlayer:" + string).getBytes(com.a.a.b.aj.c));
    }

    public boolean a(biu biu2) {
        if (biu2.a()) {
            return true;
        }
        bhl bhl2 = this.bt();
        if (bhl2 != null && bhl2.s()) {
            return bhl2.q().equals(biu2.b());
        }
        return false;
    }

    public boolean a(bzk bzk2) {
        return ((Byte)this.bY().a(l) & bzk2.a()) == bzk2.a();
    }

    @Override
    public boolean C_() {
        return ((iu)((Object)this.o_().d[0])).F().b("sendCommandFeedback");
    }

    @Override
    public boolean a_(int n2, bhl bhl2) {
        if (n2 >= 0 && n2 < this.n.a.length) {
            this.n.a(n2, bhl2);
            return true;
        }
        dfm dfm2 = n2 == 100 + dfm.f.b() ? dfm.f : (n2 == 100 + dfm.e.b() ? dfm.e : (n2 == 100 + dfm.d.b() ? dfm.d : (n2 == 100 + dfm.c.b() ? dfm.c : null)));
        if (n2 == 98) {
            this.a(dfm.a, bhl2);
            return true;
        }
        if (n2 == 99) {
            this.a(dfm.b, bhl2);
            return true;
        }
        if (dfm2 != null) {
            if (bhl2 != null && bhl2.a() != null && (bhl2.a() instanceof uh || bhl2.a() instanceof anb ? xy.c(bhl2) != dfm2 : dfm2 != dfm.f)) {
                return false;
            }
            this.n.a(dfm2.b() + this.n.a.length, bhl2);
            return true;
        }
        int n3 = n2 - 200;
        if (n3 >= 0 && n3 < this.c.aI_()) {
            this.c.a(n3, bhl2);
            return true;
        }
        return false;
    }

    public boolean aP() {
        return this.k;
    }

    public void e(boolean bl2) {
        this.k = bl2;
    }

    @Override
    public s aK() {
        return (Byte)this.bE.a(m) == 0 ? s.a : s.b;
    }

    public void a(s s2) {
        this.bE.b(m, (byte)(s2 != s.a ? 1 : 0));
    }

    public float aQ() {
        return (float)(1.0 / this.a(cgz.f).e() * 20.0);
    }

    public float j(float f2) {
        return cmk.a(((float)this.Y + f2) / this.aQ(), 0.0f, 1.0f);
    }

    public void aR() {
        this.Y = 0;
    }

    public bkq aS() {
        return this.aL;
    }

    @Override
    public void e_(cpk cpk2) {
        if (!this.H_()) {
            super.e_(cpk2);
        }
    }

    public float aT() {
        return (float)this.a(cgz.i).e();
    }

    public boolean aU() {
        return this.G.d && this.a(2, "");
    }
}

