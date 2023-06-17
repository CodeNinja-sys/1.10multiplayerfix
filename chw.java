/*
 * Decompiled with CFR 0.150.
 */
public abstract class chw
extends cpk {
    private int e = -1;
    private int f = -1;
    private int g = -1;
    private bfa h;
    private boolean i;
    public bga a;
    private int j;
    private int k;
    public double b;
    public double c;
    public double d;

    public chw(iu iu2) {
        super(iu2);
        this.a_(1.0f, 1.0f);
    }

    @Override
    protected void a() {
    }

    @Override
    public boolean a(double d2) {
        double d3 = this.cD().a() * 4.0;
        if (Double.isNaN(d3)) {
            d3 = 4.0;
        }
        return d2 < (d3 *= 64.0) * d3;
    }

    public chw(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2);
        this.a_(1.0f, 1.0f);
        this.a_(d2, d3, d4, this.ba, this.bb);
        this.d(d2, d3, d4);
        double d8 = cmk.a(d5 * d5 + d6 * d6 + d7 * d7);
        this.b = d5 / d8 * 0.1;
        this.c = d6 / d8 * 0.1;
        this.d = d7 / d8 * 0.1;
    }

    public chw(iu iu2, bga bga2, double d2, double d3, double d4) {
        super(iu2);
        this.a = bga2;
        this.a_(1.0f, 1.0f);
        this.a_(bga2.aU, bga2.aV, bga2.aW, bga2.ba, bga2.bb);
        this.d(this.aU, this.aV, this.aW);
        this.aX = 0.0;
        this.aY = 0.0;
        this.aZ = 0.0;
        double d5 = cmk.a((d2 += this.bx.nextGaussian() * 0.4) * d2 + (d3 += this.bx.nextGaussian() * 0.4) * d3 + (d4 += this.bx.nextGaussian() * 0.4) * d4);
        this.b = d2 / d5 * 0.1;
        this.c = d3 / d5 * 0.1;
        this.d = d4 / d5 * 0.1;
    }

    @Override
    public void bb_() {
        if (!this.aQ.C && (this.a != null && this.a.bk || !this.aQ.d(new cmz(this)))) {
            this.ak_();
            return;
        }
        super.bb_();
        if (this.n()) {
            this.m(1);
        }
        if (this.i) {
            if (this.aQ.n(new cmz(this.e, this.f, this.g)).t() == this.h) {
                ++this.j;
                if (this.j == 600) {
                    this.ak_();
                }
                return;
            }
            this.i = false;
            this.aX *= (double)(this.bx.nextFloat() * 0.2f);
            this.aY *= (double)(this.bx.nextFloat() * 0.2f);
            this.aZ *= (double)(this.bx.nextFloat() * 0.2f);
            this.j = 0;
            this.k = 0;
        } else {
            ++this.k;
        }
        auu auu2 = cen.a(this, true, this.k >= 25, this.a);
        if (auu2 != null) {
            this.a(auu2);
        }
        this.aU += this.aX;
        this.aV += this.aY;
        this.aW += this.aZ;
        cen.a(this, 0.2f);
        float f2 = this.h();
        if (this.V_()) {
            for (int i2 = 0; i2 < 4; ++i2) {
                float f3 = 0.25f;
                this.aQ.a(lz.e, this.aU - this.aX * 0.25, this.aV - this.aY * 0.25, this.aW - this.aZ * 0.25, this.aX, this.aY, this.aZ, new int[0]);
            }
            f2 = 0.8f;
        }
        this.aX += this.b;
        this.aY += this.c;
        this.aZ += this.d;
        this.aX *= (double)f2;
        this.aY *= (double)f2;
        this.aZ *= (double)f2;
        this.aQ.a(this.p(), this.aU, this.aV + 0.5, this.aW, 0.0, 0.0, 0.0, new int[0]);
        this.d(this.aU, this.aV, this.aW);
    }

    protected boolean n() {
        return true;
    }

    protected lz p() {
        return lz.l;
    }

    protected float h() {
        return 0.95f;
    }

    protected abstract void a(auu var1);

    public static void a(cgy cgy2, String string) {
    }

    @Override
    public void a(bvp bvp2) {
        bvp2.a("xTile", this.e);
        bvp2.a("yTile", this.f);
        bvp2.a("zTile", this.g);
        bpx bpx2 = (bpx)bfa.v.b(this.h);
        bvp2.a("inTile", bpx2 == null ? "" : bpx2.toString());
        bvp2.a("inGround", (byte)(this.i ? 1 : 0));
        bvp2.a("direction", this.a(new double[]{this.aX, this.aY, this.aZ}));
        bvp2.a("power", this.a(new double[]{this.b, this.c, this.d}));
        bvp2.a("life", this.j);
    }

    @Override
    public void b(bvp bvp2) {
        bmh bmh2;
        this.e = bvp2.h("xTile");
        this.f = bvp2.h("yTile");
        this.g = bvp2.h("zTile");
        this.h = bvp2.b("inTile", 8) ? bfa.a(bvp2.l("inTile")) : bfa.f(bvp2.f("inTile") & 0xFF);
        boolean bl2 = this.i = bvp2.f("inGround") == 1;
        if (bvp2.b("power", 9) && (bmh2 = bvp2.c("power", 6)).b() == 3) {
            this.b = bmh2.e(0);
            this.c = bmh2.e(1);
            this.d = bmh2.e(2);
        }
        this.j = bvp2.h("life");
        if (bvp2.b("direction", 9) && bvp2.c("direction", 6).b() == 3) {
            bmh2 = bvp2.c("direction", 6);
            this.aX = bmh2.e(0);
            this.aY = bmh2.e(1);
            this.aZ = bmh2.e(2);
        } else {
            this.ak_();
        }
    }

    @Override
    public boolean bc_() {
        return true;
    }

    @Override
    public float ap_() {
        return 1.0f;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        this.bz();
        if (ahy2.b() != null) {
            amj amj2 = ahy2.b().by();
            if (amj2 != null) {
                this.aX = amj2.b;
                this.aY = amj2.c;
                this.aZ = amj2.d;
                this.b = this.aX * 0.1;
                this.c = this.aY * 0.1;
                this.d = this.aZ * 0.1;
            }
            if (ahy2.b() instanceof bga) {
                this.a = (bga)ahy2.b();
            }
            return true;
        }
        return false;
    }

    @Override
    public float a(float f2) {
        return 1.0f;
    }

    @Override
    public int b(float f2) {
        return 0xF000F0;
    }
}

