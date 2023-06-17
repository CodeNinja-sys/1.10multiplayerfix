/*
 * Decompiled with CFR 0.150.
 */
public class eu
extends ck {
    iu a;
    protected cfl b;
    protected int c;
    double d;
    boolean e;
    dbn f;
    private int h;
    private double i;
    private double j;
    private double k;
    protected final int g = 20;

    public eu(cfl cfl2, double d2, boolean bl2) {
        this.b = cfl2;
        this.a = cfl2.aQ;
        this.d = d2;
        this.e = bl2;
        this.a(3);
    }

    @Override
    public boolean b() {
        bga bga2 = this.b.ar();
        if (bga2 == null) {
            return false;
        }
        if (!bga2.bj()) {
            return false;
        }
        this.f = this.b.ap().a(bga2);
        return this.f != null;
    }

    @Override
    public boolean a() {
        bga bga2 = this.b.ar();
        if (bga2 == null) {
            return false;
        }
        if (!bga2.bj()) {
            return false;
        }
        if (!this.e) {
            return !this.b.ap().m();
        }
        if (!this.b.d(new cmz(bga2))) {
            return false;
        }
        return !(bga2 instanceof bdl) || !((bdl)bga2).aL() && !((bdl)bga2).aM();
    }

    @Override
    public void c() {
        this.b.ap().a(this.f, this.d);
        this.h = 0;
    }

    @Override
    public void d() {
        bga bga2 = this.b.ar();
        if (bga2 instanceof bdl && (((bdl)bga2).aL() || ((bdl)bga2).aM())) {
            this.b.b((bga)null);
        }
        this.b.ap().n();
    }

    @Override
    public void e() {
        bga bga2 = this.b.ar();
        this.b.am().a(bga2, 30.0f, 30.0f);
        double d2 = this.b.i(bga2.aU, bga2.cD().b, bga2.aW);
        --this.h;
        if ((this.e || this.b.aq().a(bga2)) && this.h <= 0 && (this.i == 0.0 && this.j == 0.0 && this.k == 0.0 || bga2.i(this.i, this.j, this.k) >= 1.0 || this.b.aW().nextFloat() < 0.05f)) {
            this.i = bga2.aU;
            this.j = bga2.cD().b;
            this.k = bga2.aW;
            this.h = 4 + this.b.aW().nextInt(7);
            if (d2 > 1024.0) {
                this.h += 10;
            } else if (d2 > 256.0) {
                this.h += 5;
            }
            if (!this.b.ap().a(bga2, this.d)) {
                this.h += 15;
            }
        }
        this.c = Math.max(this.c - 1, 0);
        this.a(bga2, d2);
    }

    protected void a(bga bga2, double d2) {
        double d3 = this.a(bga2);
        if (d2 <= d3 && this.c <= 0) {
            this.c = 20;
            this.b.a(bqp.a);
            this.b.a(bga2);
        }
    }

    protected double a(bga bga2) {
        return this.b.bl * 2.0f * (this.b.bl * 2.0f) + bga2.bl;
    }
}

