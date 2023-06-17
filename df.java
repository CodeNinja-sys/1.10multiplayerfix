/*
 * Decompiled with CFR 0.150.
 */
class df
implements cak {
    double a;
    double b;
    long c;
    final /* synthetic */ abv d;

    df(abv abv2) {
        this.d = abv2;
    }

    @Override
    public float a(bhl bhl2, iu iu2, bga bga2) {
        cpk cpk2;
        boolean bl2 = bga2 != null;
        cpk cpk3 = cpk2 = bl2 ? bga2 : bhl2.z();
        if (iu2 == null && cpk2 != null) {
            iu2 = cpk2.aQ;
        }
        if (iu2 == null) {
            return 0.0f;
        }
        double d2 = iu2.q.e() ? (double)iu2.c(1.0f) : Math.random();
        d2 = this.a(iu2, d2);
        return cmk.b((float)d2, 1.0f);
    }

    private double a(iu iu2, double d2) {
        if (iu2.z() != this.c) {
            this.c = iu2.z();
            double d3 = d2 - this.a;
            if (d3 < -0.5) {
                d3 += 1.0;
            }
            this.b += d3 * 0.1;
            this.b *= 0.9;
            this.a += this.b;
        }
        return this.a;
    }
}

