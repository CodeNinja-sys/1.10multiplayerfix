/*
 * Decompiled with CFR 0.150.
 */
public class abw
extends deg {
    private amj b;

    public abw(brd brd2) {
        super(brd2);
    }

    @Override
    public void e() {
        amj amj2 = this.a.d(1.0f).a();
        amj2.b(-0.7853982f);
        double d2 = this.a.e.aU;
        double d3 = this.a.e.aV + (double)(this.a.e.bm / 2.0f);
        double d4 = this.a.e.aW;
        for (int i2 = 0; i2 < 8; ++i2) {
            double d5 = d2 + this.a.aW().nextGaussian() / 2.0;
            double d6 = d3 + this.a.aW().nextGaussian() / 2.0;
            double d7 = d4 + this.a.aW().nextGaussian() / 2.0;
            this.a.aQ.a(lz.Q, d5, d6, d7, -amj2.b * (double)0.08f + this.a.aX, -amj2.c * (double)0.3f + this.a.aY, -amj2.d * (double)0.08f + this.a.aZ, new int[0]);
            amj2.b(0.19634955f);
        }
    }

    @Override
    public void a() {
        if (this.b == null) {
            this.b = new amj(this.a.aQ.p(apk.a));
        }
        if (this.b.c(this.a.aU, this.a.aV, this.a.aW) < 1.0) {
            ((cik)this.a.aL().b(baw.f)).j();
            this.a.aL().a(baw.g);
        }
    }

    @Override
    public float f() {
        return 1.5f;
    }

    @Override
    public float g() {
        float f2 = cmk.a(this.a.aX * this.a.aX + this.a.aZ * this.a.aZ) + 1.0f;
        float f3 = Math.min(f2, 40.0f);
        return f3 / f2;
    }

    @Override
    public void b() {
        this.b = null;
    }

    @Override
    public amj c() {
        return this.b;
    }

    @Override
    public baw d() {
        return baw.d;
    }
}

