/*
 * Decompiled with CFR 0.150.
 */
class bkw
implements cak {
    double a;
    double b;
    long c;
    final /* synthetic */ qm d;

    bkw(qm qm2) {
        this.d = qm2;
    }

    @Override
    public float a(bhl bhl2, iu iu2, bga bga2) {
        double d2;
        cpk cpk2;
        if (bga2 == null && !bhl2.y()) {
            return 0.0f;
        }
        boolean bl2 = bga2 != null;
        cpk cpk3 = cpk2 = bl2 ? bga2 : bhl2.z();
        if (iu2 == null) {
            iu2 = cpk2.aQ;
        }
        if (iu2.q.e()) {
            double d3 = bl2 ? (double)cpk2.ba : this.a((cvr)cpk2);
            double d4 = this.a(iu2, cpk2);
            d2 = 3.1415927410125732 - (((d3 %= 360.0) - 90.0) * 0.01745329238474369 - d4);
        } else {
            d2 = Math.random() * 6.2831854820251465;
        }
        if (bl2) {
            d2 = this.a(iu2, d2);
        }
        float f2 = (float)(d2 / 6.2831854820251465);
        return cmk.b(f2, 1.0f);
    }

    private double a(iu iu2, double d2) {
        if (iu2.z() != this.c) {
            this.c = iu2.z();
            double d3 = d2 - this.a;
            d3 %= 6.2831854820251465;
            d3 = cmk.a(d3, -1.0, 1.0);
            this.b += d3 * 0.1;
            this.b *= 0.8;
            this.a += this.b;
        }
        return this.a;
    }

    private double a(cvr cvr2) {
        return cmk.b(180 + cvr2.b.c() * 90);
    }

    private double a(iu iu2, cpk cpk2) {
        cmz cmz2 = iu2.B();
        return Math.atan2((double)cmz2.c() - cpk2.aW, (double)cmz2.a() - cpk2.aU);
    }
}

