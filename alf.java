/*
 * Decompiled with CFR 0.150.
 */
public abstract class alf
extends cfl {
    private static final bcz a = bwm.a(alf.class, cbf.h);
    protected int q;
    protected int r;
    protected int s;
    private float b = -1.0f;
    private float c;

    public alf(iu iu2) {
        super(iu2);
    }

    public abstract alf b(alf var1);

    @Override
    public boolean a(bdl bdl2, bqp bqp2, bhl bhl2) {
        if (bhl2 != null && bhl2.a() == hp.bT) {
            alf alf2;
            Class class_;
            if (!this.aQ.C && (class_ = vb.a(vb.a(clx.h(bhl2)))) != null && this.getClass() == class_ && (alf2 = this.b(this)) != null) {
                alf2.j(-24000);
                alf2.a_(this.aU, this.aV, this.aW, 0.0f, 0.0f);
                this.aQ.b(alf2);
                if (bhl2.s()) {
                    alf2.g(bhl2.q());
                }
                if (!bdl2.G.d) {
                    --bhl2.b;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, false);
    }

    public int aL() {
        if (this.aQ.C) {
            return (Boolean)this.bE.a(a) != false ? -1 : 1;
        }
        return this.q;
    }

    public void a(int n2, boolean bl2) {
        int n3;
        int n4 = n3 = this.aL();
        if ((n3 += n2 * 20) > 0) {
            n3 = 0;
            if (n4 < 0) {
                this.aM();
            }
        }
        int n5 = n3 - n4;
        this.j(n3);
        if (bl2) {
            this.r += n5;
            if (this.s == 0) {
                this.s = 40;
            }
        }
        if (this.aL() == 0) {
            this.j(this.r);
        }
    }

    public void i(int n2) {
        this.a(n2, false);
    }

    public void j(int n2) {
        this.bE.b(a, n2 < 0);
        this.q = n2;
        this.b_(this.R_());
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Age", this.aL());
        bvp2.a("ForcedAge", this.r);
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        this.j(bvp2.h("Age"));
        this.r = bvp2.h("ForcedAge");
    }

    @Override
    public void a(bcz bcz2) {
        if (a.equals(bcz2)) {
            this.b_(this.R_());
        }
        super.a(bcz2);
    }

    @Override
    public void Q_() {
        super.Q_();
        if (this.aQ.C) {
            if (this.s > 0) {
                if (this.s % 4 == 0) {
                    this.aQ.a(lz.v, this.aU + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, this.aV + 0.5 + (double)(this.bx.nextFloat() * this.bm), this.aW + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, 0.0, 0.0, 0.0, new int[0]);
                }
                --this.s;
            }
        } else {
            int n2 = this.aL();
            if (n2 < 0) {
                this.j(++n2);
                if (n2 == 0) {
                    this.aM();
                }
            } else if (n2 > 0) {
                this.j(--n2);
            }
        }
    }

    protected void aM() {
    }

    @Override
    public boolean R_() {
        return this.aL() < 0;
    }

    public void b_(boolean bl2) {
        this.j(bl2 ? 0.5f : 1.0f);
    }

    @Override
    protected final void a_(float f2, float f3) {
        boolean bl2 = this.b > 0.0f;
        this.b = f2;
        this.c = f3;
        if (!bl2) {
            this.j(1.0f);
        }
    }

    protected final void j(float f2) {
        super.a_(this.b * f2, this.c * f2);
    }
}

