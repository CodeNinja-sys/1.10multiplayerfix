/*
 * Decompiled with CFR 0.150.
 */
class cir
extends ck {
    private final ha b;
    public int a;

    public cir(ha ha2) {
        this.b = ha2;
    }

    @Override
    public boolean b() {
        return this.b.ar() != null;
    }

    @Override
    public void c() {
        this.a = 0;
    }

    @Override
    public void d() {
        this.b.a(false);
    }

    @Override
    public void e() {
        bga bga2 = this.b.ar();
        double d2 = 64.0;
        if (bga2.l(this.b) < 4096.0 && this.b.j(bga2)) {
            iu iu2 = this.b.aQ;
            ++this.a;
            if (this.a == 10) {
                iu2.a(null, 1015, new cmz(this.b), 0);
            }
            if (this.a == 20) {
                double d3 = 4.0;
                amj amj2 = this.b.l(1.0f);
                double d4 = bga2.aU - (this.b.aU + amj2.b * 4.0);
                double d5 = bga2.cD().b + (double)(bga2.bm / 2.0f) - (0.5 + this.b.aV + (double)(this.b.bm / 2.0f));
                double d6 = bga2.aW - (this.b.aW + amj2.d * 4.0);
                iu2.a(null, 1016, new cmz(this.b), 0);
                cyk cyk2 = new cyk(iu2, this.b, d4, d5, d6);
                cyk2.e = this.b.x();
                cyk2.aU = this.b.aU + amj2.b * 4.0;
                cyk2.aV = this.b.aV + (double)(this.b.bm / 2.0f) + 0.5;
                cyk2.aW = this.b.aW + amj2.d * 4.0;
                iu2.b(cyk2);
                this.a = -40;
            }
        } else if (this.a > 0) {
            --this.a;
        }
        this.b.a(this.a > 10);
    }
}

