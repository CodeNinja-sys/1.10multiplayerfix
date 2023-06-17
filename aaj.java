/*
 * Decompiled with CFR 0.150.
 */
class aaj
extends ck {
    private final abs a;
    private int b;
    private int c;

    public aaj(abs abs2) {
        this.a = abs2;
        this.a(3);
    }

    @Override
    public boolean b() {
        bga bga2 = this.a.ar();
        return bga2 != null && bga2.bj();
    }

    @Override
    public void c() {
        this.b = 0;
    }

    @Override
    public void d() {
        this.a.a(false);
    }

    @Override
    public void e() {
        --this.c;
        bga bga2 = this.a.ar();
        double d2 = this.a.l(bga2);
        if (d2 < 4.0) {
            if (this.c <= 0) {
                this.c = 20;
                this.a.a(bga2);
            }
            this.a.an().a(bga2.aU, bga2.aV, bga2.aW, 1.0);
        } else if (d2 < 256.0) {
            double d3 = bga2.aU - this.a.aU;
            double d4 = bga2.cD().b + (double)(bga2.bm / 2.0f) - (this.a.aV + (double)(this.a.bm / 2.0f));
            double d5 = bga2.aW - this.a.aW;
            if (this.c <= 0) {
                ++this.b;
                if (this.b == 1) {
                    this.c = 60;
                    this.a.a(true);
                } else if (this.b <= 4) {
                    this.c = 6;
                } else {
                    this.c = 100;
                    this.b = 0;
                    this.a.a(false);
                }
                if (this.b > 1) {
                    float f2 = cmk.c(cmk.a(d2)) * 0.5f;
                    this.a.aQ.a(null, 1018, new cmz((int)this.a.aU, (int)this.a.aV, (int)this.a.aW), 0);
                    for (int i2 = 0; i2 < 1; ++i2) {
                        bx bx2 = new bx(this.a.aQ, this.a, d3 + this.a.aW().nextGaussian() * (double)f2, d4, d5 + this.a.aW().nextGaussian() * (double)f2);
                        bx2.aV = this.a.aV + (double)(this.a.bm / 2.0f) + 0.5;
                        this.a.aQ.b(bx2);
                    }
                }
            }
            this.a.am().a(bga2, 10.0f, 10.0f);
        } else {
            this.a.ap().n();
            this.a.an().a(bga2.aU, bga2.aV, bga2.aW, 1.0);
        }
        super.e();
    }
}

