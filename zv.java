/*
 * Decompiled with CFR 0.150.
 */
public class zv
extends acm {
    private bge a;

    public zv(iu iu2) {
        super(iu2);
        this.a_(0.4f, 0.3f);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Silverfish");
    }

    @Override
    protected void n() {
        this.a = new bge(this);
        this.m.a(1, new baf(this));
        this.m.a(3, this.a);
        this.m.a(4, new eu(this, 1.0, false));
        this.m.a(5, new dgx(this));
        this.n.a(1, new ahx((cfl)this, true, new Class[0]));
        this.n.a(2, new cyx((cfl)this, bdl.class, true));
    }

    @Override
    public double Z_() {
        return 0.2;
    }

    @Override
    public float A() {
        return 0.1f;
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(8.0);
        this.a(cgz.d).a(0.25);
        this.a(cgz.e).a(1.0);
    }

    @Override
    protected boolean e() {
        return false;
    }

    @Override
    protected bi q() {
        return dah.fp;
    }

    @Override
    protected bi r() {
        return dah.fr;
    }

    @Override
    protected bi s() {
        return dah.fq;
    }

    @Override
    protected void a(cmz cmz2, bfa bfa2) {
        this.a(dah.fs, 0.15f, 1.0f);
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        if ((ahy2 instanceof bsg || ahy2 == ahy.n) && this.a != null) {
            this.a.f();
        }
        return super.a(ahy2, f2);
    }

    @Override
    protected bpx u() {
        return bvm.u;
    }

    @Override
    public void bb_() {
        this.ah = this.ba;
        super.bb_();
    }

    @Override
    public float a(cmz cmz2) {
        if (this.aQ.n(cmz2.h()).t() == blg.b) {
            return 10.0f;
        }
        return super.a(cmz2);
    }

    @Override
    protected boolean aC_() {
        return true;
    }

    @Override
    public boolean h() {
        if (super.h()) {
            bdl bdl2 = this.aQ.b((cpk)this, 5.0);
            return bdl2 == null;
        }
        return false;
    }

    @Override
    public agh ak() {
        return agh.c;
    }
}

