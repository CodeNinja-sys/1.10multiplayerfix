/*
 * Decompiled with CFR 0.150.
 */
public class fl
extends nb {
    private static final bcz d = bwm.a(fl.class, cbf.b);
    private cgk e;
    private af f;

    public fl(iu iu2) {
        super(iu2);
        this.a_(0.6f, 0.7f);
    }

    @Override
    protected void n() {
        this.c = new awa(this);
        this.f = new af((cfl)this, 0.6, hp.bb, true);
        this.m.a(1, new baf(this));
        this.m.a(2, this.c);
        this.m.a(3, this.f);
        this.m.a(5, new bpy(this, 1.0, 10.0f, 5.0f));
        this.m.a(6, new ip(this, 0.8));
        this.m.a(7, new cye(this, 0.3f));
        this.m.a(8, new hk(this));
        this.m.a(9, new ky(this, 0.8));
        this.m.a(10, new vq(this, 0.8));
        this.m.a(11, new chx(this, bdl.class, 10.0f));
        this.n.a(1, new cuu(this, jp.class, false, null));
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(d, 0);
    }

    @Override
    public void o() {
        if (this.an().b()) {
            double d2 = this.an().c();
            if (d2 == 0.6) {
                this.q(true);
                this.c_(false);
            } else if (d2 == 1.33) {
                this.q(false);
                this.c_(true);
            } else {
                this.q(false);
                this.c_(false);
            }
        } else {
            this.q(false);
            this.c_(false);
        }
    }

    @Override
    protected boolean k() {
        return !this.B() && this.by > 2400;
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(10.0);
        this.a(cgz.d).a(0.3f);
    }

    @Override
    public void a(float f2, float f3) {
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Ozelot");
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("CatType", this.w());
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        this.c(bvp2.h("CatType"));
    }

    @Override
    protected bi q() {
        if (this.B()) {
            if (this.bS()) {
                return dah.T;
            }
            if (this.bx.nextInt(4) == 0) {
                return dah.U;
            }
            return dah.P;
        }
        return null;
    }

    @Override
    protected bi r() {
        return dah.S;
    }

    @Override
    protected bi s() {
        return dah.Q;
    }

    @Override
    protected float t() {
        return 0.4f;
    }

    @Override
    public boolean a(cpk cpk2) {
        return cpk2.a(ahy.b(this), 3.0f);
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        if (this.c != null) {
            this.c.a(false);
        }
        return super.a(ahy2, f2);
    }

    @Override
    protected bpx u() {
        return bvm.L;
    }

    @Override
    public boolean a(bdl bdl2, bqp bqp2, bhl bhl2) {
        if (this.B()) {
            if (this.a(bdl2) && !this.aQ.C && !this.a(bhl2)) {
                this.c.a(!this.C());
            }
        } else if ((this.f == null || this.f.f()) && bhl2 != null && bhl2.a() == hp.bb && bdl2.l(this) < 9.0) {
            if (!bdl2.G.d) {
                --bhl2.b;
            }
            if (!this.aQ.C) {
                if (this.bx.nextInt(3) == 0) {
                    this.a(true);
                    this.c(1 + this.aQ.p.nextInt(3));
                    this.a(bdl2.cx());
                    this.b(true);
                    this.c.a(true);
                    this.aQ.a((cpk)this, (byte)7);
                } else {
                    this.b(false);
                    this.aQ.a((cpk)this, (byte)6);
                }
            }
            return true;
        }
        return super.a(bdl2, bqp2, bhl2);
    }

    public fl a(alf alf2) {
        fl fl2 = new fl(this.aQ);
        if (this.B()) {
            fl2.a(this.D());
            fl2.a(true);
            fl2.c(this.w());
        }
        return fl2;
    }

    @Override
    public boolean a(bhl bhl2) {
        return bhl2 != null && bhl2.a() == hp.bb;
    }

    @Override
    public boolean a(cxn cxn2) {
        if (cxn2 == this) {
            return false;
        }
        if (!this.B()) {
            return false;
        }
        if (!(cxn2 instanceof fl)) {
            return false;
        }
        fl fl2 = (fl)cxn2;
        if (!fl2.B()) {
            return false;
        }
        return this.bS() && fl2.bS();
    }

    public int w() {
        return (Integer)this.bE.a(d);
    }

    public void c(int n2) {
        this.bE.b(d, n2);
    }

    @Override
    public boolean h() {
        return this.aQ.p.nextInt(3) != 0;
    }

    @Override
    public boolean i() {
        if (this.aQ.a(this.cD(), (cpk)this) && this.aQ.a((cpk)this, this.cD()).isEmpty() && !this.aQ.e(this.cD())) {
            cmz cmz2 = new cmz(this.aU, this.cD().b, this.aW);
            if (cmz2.b() < this.aQ.u()) {
                return false;
            }
            dbk dbk2 = this.aQ.n(cmz2.h());
            bfa bfa2 = dbk2.t();
            if (bfa2 == blg.c || dbk2.a() == ahk.j) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String i_() {
        if (this.j_()) {
            return this.cA();
        }
        if (this.B()) {
            return caf.a("entity.Cat.name");
        }
        return super.i_();
    }

    @Override
    public void a(boolean bl2) {
        super.a(bl2);
    }

    @Override
    protected void x() {
        if (this.e == null) {
            this.e = new cgk(this, bdl.class, 16.0f, 0.8, 1.33);
        }
        this.m.a(this.e);
        if (!this.B()) {
            this.m.a(4, this.e);
        }
    }

    @Override
    public aql a(bgp bgp2, aql aql2) {
        aql2 = super.a(bgp2, aql2);
        if (this.w() == 0 && this.aQ.p.nextInt(7) == 0) {
            for (int i2 = 0; i2 < 2; ++i2) {
                fl fl2 = new fl(this.aQ);
                fl2.a_(this.aU, this.aV, this.aW, this.ba, 0.0f);
                fl2.j(-24000);
                this.aQ.b(fl2);
            }
        }
        return aql2;
    }

    @Override
    public /* synthetic */ alf b(alf alf2) {
        return this.a(alf2);
    }
}

