/*
 * Decompiled with CFR 0.150.
 */
public class yi
extends acm {
    private static final bcz a = bwm.a(yi.class, cbf.a);

    public yi(iu iu2) {
        super(iu2);
        this.a_(1.4f, 0.9f);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Spider");
    }

    @Override
    protected void n() {
        this.m.a(1, new baf(this));
        this.m.a(3, new cye(this, 0.4f));
        this.m.a(4, new m(this));
        this.m.a(5, new vq(this, 0.8));
        this.m.a(6, new chx(this, bdl.class, 8.0f));
        this.m.a(6, new bzv(this));
        this.n.a(1, new ahx((cfl)this, false, new Class[0]));
        this.n.a(2, new zy(this, bdl.class));
        this.n.a(3, new zy(this, hx.class));
    }

    @Override
    public double ag() {
        return this.bm * 0.5f;
    }

    @Override
    protected dct a(iu iu2) {
        return new cmr(this, iu2);
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, (byte)0);
    }

    @Override
    public void bb_() {
        super.bb_();
        if (!this.aQ.C) {
            this.a(this.bf);
        }
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(16.0);
        this.a(cgz.d).a(0.3f);
    }

    @Override
    protected bi q() {
        return dah.gc;
    }

    @Override
    protected bi r() {
        return dah.ge;
    }

    @Override
    protected bi s() {
        return dah.gd;
    }

    @Override
    protected void a(cmz cmz2, bfa bfa2) {
        this.a(dah.gf, 0.15f, 1.0f);
    }

    @Override
    protected bpx u() {
        return bvm.r;
    }

    @Override
    public boolean ai() {
        return this.B();
    }

    @Override
    public void X_() {
    }

    @Override
    public agh ak() {
        return agh.c;
    }

    @Override
    public boolean a(cko cko2) {
        if (cko2.a() == ake.s) {
            return false;
        }
        return super.a(cko2);
    }

    public boolean B() {
        return ((Byte)this.bE.a(a) & 1) != 0;
    }

    public void a(boolean bl2) {
        byte by2 = (Byte)this.bE.a(a);
        by2 = bl2 ? (byte)(by2 | 1) : (byte)(by2 & 0xFFFFFFFE);
        this.bE.b(a, by2);
    }

    @Override
    public aql a(bgp bgp2, aql aql2) {
        Object object;
        aql2 = super.a(bgp2, aql2);
        if (this.aQ.p.nextInt(100) == 0) {
            object = new azy(this.aQ);
            ((cpk)object).a_(this.aU, this.aV, this.aW, this.ba, 0.0f);
            ((azy)object).a(bgp2, null);
            this.aQ.b((cpk)object);
            ((cpk)object).m(this);
        }
        if (aql2 == null) {
            aql2 = new xv();
            if (this.aQ.Q() == ct.d && this.aQ.p.nextFloat() < 0.1f * bgp2.c()) {
                ((xv)aql2).a(this.aQ.p);
            }
        }
        if (aql2 instanceof xv && (object = ((xv)aql2).a) != null) {
            this.b(new cko((bfv)object, Integer.MAX_VALUE));
        }
        return aql2;
    }

    @Override
    public float A() {
        return 0.65f;
    }
}

