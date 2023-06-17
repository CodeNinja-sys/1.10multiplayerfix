/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class ky
extends ck {
    private final cxn d;
    iu a;
    private cxn e;
    int b;
    double c;

    public ky(cxn cxn2, double d2) {
        this.d = cxn2;
        this.a = cxn2.aQ;
        this.c = d2;
        this.a(3);
    }

    @Override
    public boolean b() {
        if (!this.d.bS()) {
            return false;
        }
        this.e = this.f();
        return this.e != null;
    }

    @Override
    public boolean a() {
        return this.e.bj() && this.e.bS() && this.b < 60;
    }

    @Override
    public void d() {
        this.e = null;
        this.b = 0;
    }

    @Override
    public void e() {
        this.d.am().a(this.e, 10.0f, (float)this.d.aw());
        this.d.ap().a(this.e, this.c);
        ++this.b;
        if (this.b >= 60 && this.d.l(this.e) < 9.0) {
            this.i();
        }
    }

    private cxn f() {
        List list = this.a.a(this.d.getClass(), this.d.cD().b(8.0));
        double d2 = Double.MAX_VALUE;
        cxn cxn2 = null;
        for (cxn cxn3 : list) {
            if (!this.d.a(cxn3) || !(this.d.l(cxn3) < d2)) continue;
            cxn2 = cxn3;
            d2 = this.d.l(cxn3);
        }
        return cxn2;
    }

    private void i() {
        alf alf2 = this.d.b(this.e);
        if (alf2 == null) {
            return;
        }
        bdl bdl2 = this.d.bR();
        if (bdl2 == null && this.e.bR() != null) {
            bdl2 = this.e.bR();
        }
        if (bdl2 != null) {
            bdl2.a(bpv.C);
            if (this.d instanceof cof) {
                bdl2.a((cyd)bpa.H);
            }
        }
        this.d.j(6000);
        this.e.j(6000);
        this.d.bT();
        this.e.bT();
        alf2.j(-24000);
        alf2.a_(this.d.aU, this.d.aV, this.d.aW, 0.0f, 0.0f);
        this.a.b(alf2);
        Random random = this.d.aW();
        for (int i2 = 0; i2 < 7; ++i2) {
            double d2 = random.nextGaussian() * 0.02;
            double d3 = random.nextGaussian() * 0.02;
            double d4 = random.nextGaussian() * 0.02;
            double d5 = random.nextDouble() * (double)this.d.bl * 2.0 - (double)this.d.bl;
            double d6 = 0.5 + random.nextDouble() * (double)this.d.bm;
            double d7 = random.nextDouble() * (double)this.d.bl * 2.0 - (double)this.d.bl;
            this.a.a(lz.I, this.d.aU + d5, this.d.aV + d6, this.d.aW + d7, d2, d3, d4, new int[0]);
        }
        if (this.a.F().b("doMobLoot")) {
            this.a.b(new cvs(this.a, this.d.aU, this.d.aV, this.d.aW, random.nextInt(7) + 1));
        }
    }
}

