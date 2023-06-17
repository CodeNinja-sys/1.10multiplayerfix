/*
 * Decompiled with CFR 0.150.
 */
public class cof
extends cxn {
    public cof(iu iu2) {
        super(iu2);
        this.a_(0.9f, 1.4f);
    }

    public static void c(cgy cgy2) {
        xy.a(cgy2, "Cow");
    }

    @Override
    protected void n() {
        this.m.a(0, new baf(this));
        this.m.a(1, new aro(this, 2.0));
        this.m.a(2, new ky(this, 1.0));
        this.m.a(3, new af((cfl)this, 1.25, hp.Q, false));
        this.m.a(4, new adk(this, 1.25));
        this.m.a(5, new vq(this, 1.0));
        this.m.a(6, new chx(this, bdl.class, 6.0f));
        this.m.a(7, new bzv(this));
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(10.0);
        this.a(cgz.d).a(0.2f);
    }

    @Override
    protected bi q() {
        return dah.am;
    }

    @Override
    protected bi r() {
        return dah.ao;
    }

    @Override
    protected bi s() {
        return dah.an;
    }

    @Override
    protected void a(cmz cmz2, bfa bfa2) {
        this.a(dah.aq, 0.15f, 1.0f);
    }

    @Override
    protected float t() {
        return 0.4f;
    }

    @Override
    protected bpx u() {
        return bvm.I;
    }

    @Override
    public boolean a(bdl bdl2, bqp bqp2, bhl bhl2) {
        if (bhl2 != null && bhl2.a() == hp.ay && !bdl2.G.d && !this.R_()) {
            bdl2.a(dah.ap, 1.0f, 1.0f);
            if (--bhl2.b == 0) {
                bdl2.a(bqp2, new bhl(hp.aN));
            } else if (!bdl2.n.c(new bhl(hp.aN))) {
                bdl2.a(new bhl(hp.aN), false);
            }
            return true;
        }
        return super.a(bdl2, bqp2, bhl2);
    }

    public cof c(alf alf2) {
        return new cof(this.aQ);
    }

    @Override
    public float A() {
        if (this.R_()) {
            return this.bm;
        }
        return 1.3f;
    }

    @Override
    public /* synthetic */ alf b(alf alf2) {
        return this.c(alf2);
    }
}

