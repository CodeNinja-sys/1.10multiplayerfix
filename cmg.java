/*
 * Decompiled with CFR 0.150.
 */
public class cmg
extends cxn {
    private static final bcz a = bwm.a(cmg.class, cbf.h);
    private float b;
    private float c;
    private int d;

    public cmg(iu iu2) {
        super(iu2);
        this.a_(1.3f, 1.4f);
    }

    @Override
    public alf b(alf alf2) {
        return new cmg(this.aQ);
    }

    @Override
    public boolean a(bhl bhl2) {
        return false;
    }

    @Override
    protected void n() {
        super.n();
        this.m.a(0, new baf(this));
        this.m.a(1, new cfz(this));
        this.m.a(1, new ajm(this));
        this.m.a(4, new adk(this, 1.25));
        this.m.a(5, new vq(this, 1.0));
        this.m.a(6, new chx(this, bdl.class, 6.0f));
        this.m.a(7, new bzv(this));
        this.n.a(1, new ddb(this));
        this.n.a(2, new bmx(this));
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(30.0);
        this.a(cgz.b).a(20.0);
        this.a(cgz.d).a(0.25);
        this.bs().b(cgz.e);
        this.a(cgz.e).a(6.0);
    }

    @Override
    protected bi q() {
        if (this.R_()) {
            return dah.es;
        }
        return dah.er;
    }

    @Override
    protected bi r() {
        return dah.eu;
    }

    @Override
    protected bi s() {
        return dah.et;
    }

    @Override
    protected void a(cmz cmz2, bfa bfa2) {
        this.a(dah.ev, 0.15f, 1.0f);
    }

    protected void T() {
        if (this.d <= 0) {
            this.a(dah.ew, 1.0f, 1.0f);
            this.d = 40;
        }
    }

    @Override
    protected bpx u() {
        return bvm.E;
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, false);
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
    }

    @Override
    public void bb_() {
        super.bb_();
        if (this.aQ.C) {
            this.b = this.c;
            this.c = this.aP() ? cmk.a(this.c + 1.0f, 0.0f, 6.0f) : cmk.a(this.c - 1.0f, 0.0f, 6.0f);
        }
        if (this.d > 0) {
            --this.d;
        }
    }

    @Override
    public boolean a(cpk cpk2) {
        boolean bl2 = cpk2.a(ahy.b(this), (float)((int)this.a(cgz.e).e()));
        if (bl2) {
            this.a(this, cpk2);
        }
        return bl2;
    }

    public boolean aP() {
        return (Boolean)this.bE.a(a);
    }

    public void d(boolean bl2) {
        this.bE.b(a, bl2);
    }

    public float d(float f2) {
        return (this.b + (this.c - this.b) * f2) / 6.0f;
    }

    @Override
    protected float bx() {
        return 0.98f;
    }

    @Override
    public aql a(bgp bgp2, aql aql2) {
        if (aql2 instanceof det) {
            if (((det)aql2).a) {
                this.j(-24000);
            }
        } else {
            det det2 = new det(null);
            det2.a = true;
            aql2 = det2;
        }
        return aql2;
    }
}

