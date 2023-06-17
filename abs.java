/*
 * Decompiled with CFR 0.150.
 */
public class abs
extends acm {
    private float a = 0.5f;
    private int b;
    private static final bcz c = bwm.a(abs.class, cbf.a);

    public abs(iu iu2) {
        super(iu2);
        this.a(cfh.g, -1.0f);
        this.a(cfh.f, 8.0f);
        this.a(cfh.i, 0.0f);
        this.a(cfh.j, 0.0f);
        this.bD = true;
        this.i = 10;
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Blaze");
    }

    @Override
    protected void n() {
        this.m.a(4, new aaj(this));
        this.m.a(5, new byi(this, 1.0));
        this.m.a(7, new vq(this, 1.0));
        this.m.a(8, new chx(this, bdl.class, 8.0f));
        this.m.a(8, new bzv(this));
        this.n.a(1, new ahx((cfl)this, true, new Class[0]));
        this.n.a(2, new cyx((cfl)this, bdl.class, true));
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.e).a(6.0);
        this.a(cgz.d).a(0.23f);
        this.a(cgz.b).a(48.0);
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(c, (byte)0);
    }

    @Override
    protected bi q() {
        return dah.B;
    }

    @Override
    protected bi r() {
        return dah.E;
    }

    @Override
    protected bi s() {
        return dah.D;
    }

    @Override
    public int b(float f2) {
        return 0xF000F0;
    }

    @Override
    public float a(float f2) {
        return 1.0f;
    }

    @Override
    public void Q_() {
        if (!this.be && this.aY < 0.0) {
            this.aY *= 0.6;
        }
        if (this.aQ.C) {
            if (this.bx.nextInt(24) == 0 && !this.ce()) {
                this.aQ.a(this.aU + 0.5, this.aV + 0.5, this.aW + 0.5, dah.C, this.y(), 1.0f + this.bx.nextFloat(), this.bx.nextFloat() * 0.7f + 0.3f, false);
            }
            for (int i2 = 0; i2 < 2; ++i2) {
                this.aQ.a(lz.m, this.aU + (this.bx.nextDouble() - 0.5) * (double)this.bl, this.aV + this.bx.nextDouble() * (double)this.bm, this.aW + (this.bx.nextDouble() - 0.5) * (double)this.bl, 0.0, 0.0, 0.0, new int[0]);
            }
        }
        super.Q_();
    }

    @Override
    protected void o() {
        bga bga2;
        if (this.ch()) {
            this.a(ahy.g, 1.0f);
        }
        --this.b;
        if (this.b <= 0) {
            this.b = 100;
            this.a = 0.5f + (float)this.bx.nextGaussian() * 3.0f;
        }
        if ((bga2 = this.ar()) != null && bga2.aV + (double)bga2.A() > this.aV + (double)this.A() + (double)this.a) {
            this.aY += ((double)0.3f - this.aY) * (double)0.3f;
            this.bO = true;
        }
        super.o();
    }

    @Override
    public void a(float f2, float f3) {
    }

    @Override
    public boolean y_() {
        return this.D();
    }

    @Override
    protected bpx u() {
        return bvm.p;
    }

    public boolean D() {
        return ((Byte)this.bE.a(c) & 1) != 0;
    }

    public void a(boolean bl2) {
        byte by2 = (Byte)this.bE.a(c);
        by2 = bl2 ? (byte)(by2 | 1) : (byte)(by2 & 0xFFFFFFFE);
        this.bE.b(c, by2);
    }

    @Override
    protected boolean aC_() {
        return true;
    }
}

