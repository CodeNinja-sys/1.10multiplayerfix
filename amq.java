/*
 * Decompiled with CFR 0.150.
 */
public class amq
extends cxn {
    private static final bcz a = bwm.a(amq.class, cbf.b);
    private int b;
    private int c;
    private boolean d;
    private int e;
    private int f;

    public amq(iu iu2) {
        super(iu2);
        this.a_(0.4f, 0.5f);
        this.k = new cqy(this, this);
        this.j = new czy(this);
        this.b(0.0);
    }

    @Override
    protected void n() {
        this.m.a(1, new baf(this));
        this.m.a(1, new bfi(this, 2.2));
        this.m.a(2, new ky(this, 0.8));
        this.m.a(3, new af((cfl)this, 1.0, hp.cb, false));
        this.m.a(3, new af((cfl)this, 1.0, hp.cg, false));
        this.m.a(3, new af((cfl)this, 1.0, azg.a(blg.N), false));
        this.m.a(4, new dgw(this, bdl.class, 8.0f, 2.2, 2.2));
        this.m.a(4, new dgw(this, cqw.class, 10.0f, 2.2, 2.2));
        this.m.a(4, new dgw(this, acm.class, 4.0f, 2.2, 2.2));
        this.m.a(5, new ql(this));
        this.m.a(6, new vq(this, 0.6));
        this.m.a(11, new chx(this, bdl.class, 10.0f));
    }

    @Override
    protected float U_() {
        if (this.bf || this.j.b() && this.j.e() > this.aV + 0.5) {
            return 0.5f;
        }
        dbn dbn2 = this.l.l();
        if (dbn2 != null && dbn2.e() < dbn2.d()) {
            amj amj2 = dbn2.a(this);
            if (amj2.c > this.aV) {
                return 0.5f;
            }
        }
        if (this.j.c() <= 0.6) {
            return 0.2f;
        }
        return 0.3f;
    }

    @Override
    protected void ad_() {
        double d2;
        super.ad_();
        double d3 = this.j.c();
        if (d3 > 0.0 && (d2 = this.aX * this.aX + this.aZ * this.aZ) < 0.010000000000000002) {
            this.b(0.0f, 1.0f, 0.1f);
        }
        if (!this.aQ.C) {
            this.aQ.a((cpk)this, (byte)1);
        }
    }

    public float d(float f2) {
        if (this.c == 0) {
            return 0.0f;
        }
        return ((float)this.b + f2) / (float)this.c;
    }

    public void b(double d2) {
        this.ap().a(d2);
        this.j.a(this.j.d(), this.j.e(), this.j.f(), d2);
    }

    @Override
    public void d_(boolean bl2) {
        super.d_(bl2);
        if (bl2) {
            this.a(this.L(), this.t(), ((this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f) * 0.8f);
        }
    }

    public void D() {
        this.d_(true);
        this.c = 10;
        this.b = 0;
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, 0);
    }

    @Override
    public void o() {
        if (this.e > 0) {
            --this.e;
        }
        if (this.f > 0) {
            this.f -= this.bx.nextInt(3);
            if (this.f < 0) {
                this.f = 0;
            }
        }
        if (this.be) {
            Object object;
            if (!this.d) {
                this.d_(false);
                this.aR();
            }
            if (this.M() == 99 && this.e == 0 && (object = this.ar()) != null && this.l((cpk)object) < 16.0) {
                this.a(((bga)object).aU, ((bga)object).aW);
                this.j.a(((bga)object).aU, ((bga)object).aV, ((bga)object).aW, this.j.c());
                this.D();
                this.d = true;
            }
            if (!((cqy)(object = (cqy)this.k)).c()) {
                if (this.j.b() && this.e == 0) {
                    dbn dbn2 = this.l.l();
                    amj amj2 = new amj(this.j.d(), this.j.e(), this.j.f());
                    if (dbn2 != null && dbn2.e() < dbn2.d()) {
                        amj2 = dbn2.a(this);
                    }
                    this.a(amj2.b, amj2.d);
                    this.D();
                }
            } else if (!((cqy)object).d()) {
                this.T();
            }
        }
        this.d = this.be;
    }

    @Override
    public void W_() {
    }

    private void a(double d2, double d3) {
        this.ba = (float)(cmk.b(d3 - this.aW, d2 - this.aU) * 57.2957763671875) - 90.0f;
    }

    private void T() {
        ((cqy)this.k).a(true);
    }

    private void aP() {
        ((cqy)this.k).a(false);
    }

    private void aQ() {
        this.e = this.j.c() < 2.2 ? 10 : 1;
    }

    private void aR() {
        this.aQ();
        this.aP();
    }

    @Override
    public void Q_() {
        super.Q_();
        if (this.b != this.c) {
            ++this.b;
        } else if (this.c != 0) {
            this.b = 0;
            this.c = 0;
            this.d_(false);
        }
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(3.0);
        this.a(cgz.d).a(0.3f);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Rabbit");
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("RabbitType", this.M());
        bvp2.a("MoreCarrotTicks", this.f);
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        this.d(bvp2.h("RabbitType"));
        this.f = bvp2.h("MoreCarrotTicks");
    }

    protected bi L() {
        return dah.eE;
    }

    @Override
    protected bi q() {
        return dah.eA;
    }

    @Override
    protected bi r() {
        return dah.eD;
    }

    @Override
    protected bi s() {
        return dah.eC;
    }

    @Override
    public boolean a(cpk cpk2) {
        if (this.M() == 99) {
            this.a(dah.eB, 1.0f, (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f);
            return cpk2.a(ahy.b(this), 8.0f);
        }
        return cpk2.a(ahy.b(this), 3.0f);
    }

    @Override
    public csg y() {
        return this.M() == 99 ? csg.f : csg.g;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        return super.a(ahy2, f2);
    }

    @Override
    protected bpx u() {
        return bvm.B;
    }

    private boolean a(azg azg2) {
        return azg2 == hp.cb || azg2 == hp.cg || azg2 == azg.a(blg.N);
    }

    public amq a(alf alf2) {
        amq amq2 = new amq(this.aQ);
        int n2 = this.bQ();
        if (this.bx.nextInt(20) != 0) {
            n2 = alf2 instanceof amq && this.bx.nextBoolean() ? ((amq)alf2).M() : this.M();
        }
        amq2.d(n2);
        return amq2;
    }

    @Override
    public boolean a(bhl bhl2) {
        return bhl2 != null && this.a(bhl2.a());
    }

    public int M() {
        return (Integer)this.bE.a(a);
    }

    public void d(int n2) {
        if (n2 == 99) {
            this.a(cgz.g).a(8.0);
            this.m.a(4, new aje(this));
            this.n.a(1, new ahx((cfl)this, false, new Class[0]));
            this.n.a(2, new cyx((cfl)this, bdl.class, true));
            this.n.a(2, new cyx((cfl)this, cqw.class, true));
            if (!this.j_()) {
                this.g(caf.a("entity.KillerBunny.name"));
            }
        }
        this.bE.b(a, n2);
    }

    @Override
    public aql a(bgp bgp2, aql aql2) {
        aql2 = super.a(bgp2, aql2);
        int n2 = this.bQ();
        boolean bl2 = false;
        if (aql2 instanceof wi) {
            n2 = ((wi)aql2).a;
            bl2 = true;
        } else {
            aql2 = new wi(n2);
        }
        this.d(n2);
        if (bl2) {
            this.j(-24000);
        }
        return aql2;
    }

    private int bQ() {
        anr anr2 = this.aQ.a(new cmz(this));
        int n2 = this.bx.nextInt(100);
        if (anr2.p()) {
            return n2 < 80 ? 1 : 3;
        }
        if (anr2 instanceof bwu) {
            return 4;
        }
        return n2 < 50 ? 0 : (n2 < 90 ? 5 : 2);
    }

    private boolean bU() {
        return this.f == 0;
    }

    protected void Q() {
        blm blm2 = (blm)blg.cb;
        dbk dbk2 = blm2.b(blm2.e());
        this.aQ.a(lz.M, this.aU + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, this.aV + 0.5 + (double)(this.bx.nextFloat() * this.bm), this.aW + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, 0.0, 0.0, 0.0, bfa.u(dbk2));
        this.f = 40;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 1) {
            this.ci();
            this.c = 10;
            this.b = 0;
        } else {
            super.a(by2);
        }
    }

    @Override
    public void a(bcz bcz2) {
        super.a(bcz2);
    }

    @Override
    public /* synthetic */ alf b(alf alf2) {
        return this.a(alf2);
    }

    static /* synthetic */ boolean a(amq amq2) {
        return amq2.ax;
    }

    static /* synthetic */ ald b(amq amq2) {
        return amq2.k;
    }

    static /* synthetic */ boolean c(amq amq2) {
        return amq2.bU();
    }
}

