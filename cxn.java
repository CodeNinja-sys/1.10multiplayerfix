/*
 * Decompiled with CFR 0.150.
 */
public abstract class cxn
extends alf
implements cjl {
    protected bfa v = blg.c;
    private int a;
    private bdl b;

    public cxn(iu iu2) {
        super(iu2);
    }

    @Override
    protected void o() {
        if (this.aL() != 0) {
            this.a = 0;
        }
        super.o();
    }

    @Override
    public void Q_() {
        super.Q_();
        if (this.aL() != 0) {
            this.a = 0;
        }
        if (this.a > 0) {
            --this.a;
            if (this.a % 10 == 0) {
                double d2 = this.bx.nextGaussian() * 0.02;
                double d3 = this.bx.nextGaussian() * 0.02;
                double d4 = this.bx.nextGaussian() * 0.02;
                this.aQ.a(lz.I, this.aU + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, this.aV + 0.5 + (double)(this.bx.nextFloat() * this.bm), this.aW + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, d2, d3, d4, new int[0]);
            }
        }
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        this.a = 0;
        return super.a(ahy2, f2);
    }

    @Override
    public float a(cmz cmz2) {
        if (this.aQ.n(cmz2.h()).t() == blg.c) {
            return 10.0f;
        }
        return this.aQ.m(cmz2) - 0.5f;
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("InLove", this.a);
    }

    @Override
    public double Z_() {
        return 0.29;
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        this.a = bvp2.h("InLove");
    }

    @Override
    public boolean h() {
        int n2;
        int n3;
        int n4 = cmk.c(this.aU);
        cmz cmz2 = new cmz(n4, n3 = cmk.c(this.cD().b), n2 = cmk.c(this.aW));
        return this.aQ.n(cmz2.h()).t() == this.v && this.aQ.i(cmz2) > 8 && super.h();
    }

    @Override
    public int j() {
        return 120;
    }

    @Override
    protected boolean k() {
        return false;
    }

    @Override
    protected int c_(bdl bdl2) {
        return 1 + this.aQ.p.nextInt(3);
    }

    public boolean a(bhl bhl2) {
        if (bhl2 == null) {
            return false;
        }
        return bhl2.a() == hp.Q;
    }

    @Override
    public boolean a(bdl bdl2, bqp bqp2, bhl bhl2) {
        if (bhl2 != null) {
            if (this.a(bhl2) && this.aL() == 0 && this.a <= 0) {
                this.a(bdl2, bhl2);
                this.f(bdl2);
                return true;
            }
            if (this.R_() && this.a(bhl2)) {
                this.a(bdl2, bhl2);
                this.a((int)((float)(-this.aL() / 20) * 0.1f), true);
                return true;
            }
        }
        return super.a(bdl2, bqp2, bhl2);
    }

    protected void a(bdl bdl2, bhl bhl2) {
        if (!bdl2.G.d) {
            --bhl2.b;
        }
    }

    public void f(bdl bdl2) {
        this.a = 600;
        this.b = bdl2;
        this.aQ.a((cpk)this, (byte)18);
    }

    public bdl bR() {
        return this.b;
    }

    public boolean bS() {
        return this.a > 0;
    }

    public void bT() {
        this.a = 0;
    }

    public boolean a(cxn cxn2) {
        if (cxn2 == this) {
            return false;
        }
        if (cxn2.getClass() != this.getClass()) {
            return false;
        }
        return this.bS() && cxn2.bS();
    }

    @Override
    public void a(byte by2) {
        if (by2 == 18) {
            for (int i2 = 0; i2 < 7; ++i2) {
                double d2 = this.bx.nextGaussian() * 0.02;
                double d3 = this.bx.nextGaussian() * 0.02;
                double d4 = this.bx.nextGaussian() * 0.02;
                this.aQ.a(lz.I, this.aU + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, this.aV + 0.5 + (double)(this.bx.nextFloat() * this.bm), this.aW + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, d2, d3, d4, new int[0]);
            }
        } else {
            super.a(by2);
        }
    }
}

