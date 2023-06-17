/*
 * Decompiled with CFR 0.150.
 */
public class cjo
extends acm {
    private int a;
    private boolean b;

    public cjo(iu iu2) {
        super(iu2);
        this.i = 3;
        this.a_(0.4f, 0.3f);
    }

    @Override
    protected void n() {
        this.m.a(1, new baf(this));
        this.m.a(2, new eu(this, 1.0, false));
        this.m.a(3, new vq(this, 1.0));
        this.m.a(7, new chx(this, bdl.class, 8.0f));
        this.m.a(8, new bzv(this));
        this.n.a(1, new ahx((cfl)this, true, new Class[0]));
        this.n.a(2, new cyx((cfl)this, bdl.class, true));
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
        this.a(cgz.e).a(2.0);
    }

    @Override
    protected boolean e() {
        return false;
    }

    @Override
    protected bi q() {
        return dah.bc;
    }

    @Override
    protected bi r() {
        return dah.be;
    }

    @Override
    protected bi s() {
        return dah.bd;
    }

    @Override
    protected void a(cmz cmz2, bfa bfa2) {
        this.a(dah.bf, 0.15f, 1.0f);
    }

    @Override
    protected bpx u() {
        return bvm.ai;
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Endermite");
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        this.a = bvp2.h("Lifetime");
        this.b = bvp2.p("PlayerSpawned");
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Lifetime", this.a);
        bvp2.a("PlayerSpawned", this.b);
    }

    @Override
    public void bb_() {
        this.ah = this.ba;
        super.bb_();
    }

    @Override
    public double Z_() {
        return 0.3;
    }

    public boolean T() {
        return this.b;
    }

    public void d(boolean bl2) {
        this.b = bl2;
    }

    @Override
    public void Q_() {
        super.Q_();
        if (this.aQ.C) {
            for (int i2 = 0; i2 < 2; ++i2) {
                this.aQ.a(lz.y, this.aU + (this.bx.nextDouble() - 0.5) * (double)this.bl, this.aV + this.bx.nextDouble() * (double)this.bm, this.aW + (this.bx.nextDouble() - 0.5) * (double)this.bl, (this.bx.nextDouble() - 0.5) * 2.0, -this.bx.nextDouble(), (this.bx.nextDouble() - 0.5) * 2.0, new int[0]);
            }
        } else {
            if (!this.aE()) {
                ++this.a;
            }
            if (this.a >= 2400) {
                this.ak_();
            }
        }
    }

    @Override
    protected boolean aC_() {
        return true;
    }

    @Override
    public boolean h() {
        if (super.h()) {
            bdl bdl2 = this.aQ.a((cpk)this, 5.0);
            return bdl2 == null;
        }
        return false;
    }

    @Override
    public agh ak() {
        return agh.c;
    }
}

