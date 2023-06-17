/*
 * Decompiled with CFR 0.150.
 */
public class ddh
extends acm {
    private static final bcz a = bwm.a(ddh.class, cbf.b);
    private static final bcz b = bwm.a(ddh.class, cbf.h);
    private static final bcz c = bwm.a(ddh.class, cbf.h);
    private int d;
    private int e;
    private int f = 30;
    private int g = 3;
    private int q;

    public ddh(iu iu2) {
        super(iu2);
        this.a_(0.6f, 1.7f);
    }

    @Override
    protected void n() {
        this.m.a(1, new baf(this));
        this.m.a(2, new cgs(this));
        this.m.a(3, new cgk(this, fl.class, 6.0f, 1.0, 1.2));
        this.m.a(4, new eu(this, 1.0, false));
        this.m.a(5, new vq(this, 0.8));
        this.m.a(6, new chx(this, bdl.class, 8.0f));
        this.m.a(6, new bzv(this));
        this.n.a(1, new cyx((cfl)this, bdl.class, true));
        this.n.a(2, new ahx((cfl)this, false, new Class[0]));
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.d).a(0.25);
    }

    @Override
    public int az() {
        if (this.ar() == null) {
            return 3;
        }
        return 3 + (int)(this.bh() - 1.0f);
    }

    @Override
    public void a(float f2, float f3) {
        super.a(f2, f3);
        this.e = (int)((float)this.e + f2 * 1.5f);
        if (this.e > this.f - 5) {
            this.e = this.f - 5;
        }
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, -1);
        this.bE.a(b, false);
        this.bE.a(c, false);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Creeper");
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        if (((Boolean)this.bE.a(b)).booleanValue()) {
            bvp2.a("powered", true);
        }
        bvp2.a("Fuse", (short)this.f);
        bvp2.a("ExplosionRadius", (byte)this.g);
        bvp2.a("ignited", this.aM());
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        this.bE.b(b, bvp2.p("powered"));
        if (bvp2.b("Fuse", 99)) {
            this.f = bvp2.g("Fuse");
        }
        if (bvp2.b("ExplosionRadius", 99)) {
            this.g = bvp2.f("ExplosionRadius");
        }
        if (bvp2.p("ignited")) {
            this.aP();
        }
    }

    @Override
    public void bb_() {
        if (this.bj()) {
            int n2;
            this.d = this.e;
            if (this.aM()) {
                this.d(1);
            }
            if ((n2 = this.aL()) > 0 && this.e == 0) {
                this.a(dah.at, 1.0f, 0.5f);
            }
            this.e += n2;
            if (this.e < 0) {
                this.e = 0;
            }
            if (this.e >= this.f) {
                this.e = this.f;
                this.bQ();
            }
        }
        super.bb_();
    }

    @Override
    protected bi r() {
        return dah.as;
    }

    @Override
    protected bi s() {
        return dah.ar;
    }

    @Override
    public void a(ahy ahy2) {
        super.a(ahy2);
        if (this.aQ.F().b("doMobLoot")) {
            if (ahy2.b() instanceof azy) {
                int n2 = azg.a(hp.cA);
                int n3 = azg.a(hp.cL);
                int n4 = n2 + this.bx.nextInt(n3 - n2 + 1);
                this.a(azg.c(n4), 1);
            } else if (ahy2.b() instanceof ddh && ahy2.b() != this && ((ddh)ahy2.b()).T() && ((ddh)ahy2.b()).aQ()) {
                ((ddh)ahy2.b()).aR();
                this.a(new bhl(hp.ch, 1, 4), 0.0f);
            }
        }
    }

    @Override
    public boolean a(cpk cpk2) {
        return true;
    }

    public boolean T() {
        return (Boolean)this.bE.a(b);
    }

    public float d(float f2) {
        return ((float)this.d + (float)(this.e - this.d) * f2) / (float)(this.f - 2);
    }

    @Override
    protected bpx u() {
        return bvm.q;
    }

    public int aL() {
        return (Integer)this.bE.a(a);
    }

    public void d(int n2) {
        this.bE.b(a, n2);
    }

    @Override
    public void a(tz tz2) {
        super.a(tz2);
        this.bE.b(b, true);
    }

    @Override
    protected boolean a(bdl bdl2, bqp bqp2, bhl bhl2) {
        if (bhl2 != null && bhl2.a() == hp.d) {
            this.aQ.a(bdl2, this.aU, this.aV, this.aW, dah.by, this.y(), 1.0f, this.bx.nextFloat() * 0.4f + 0.8f);
            bdl2.a(bqp2);
            if (!this.aQ.C) {
                this.aP();
                bhl2.a(1, (bga)bdl2);
                return true;
            }
        }
        return super.a(bdl2, bqp2, bhl2);
    }

    private void bQ() {
        if (!this.aQ.C) {
            boolean bl2 = this.aQ.F().b("mobGriefing");
            float f2 = this.T() ? 2.0f : 1.0f;
            this.ao = true;
            this.aQ.a(this, this.aU, this.aV, this.aW, (float)this.g * f2, bl2);
            this.ak_();
        }
    }

    public boolean aM() {
        return (Boolean)this.bE.a(c);
    }

    public void aP() {
        this.bE.b(c, true);
    }

    public boolean aQ() {
        return this.q < 1 && this.aQ.F().b("doMobLoot");
    }

    public void aR() {
        ++this.q;
    }
}

