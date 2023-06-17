/*
 * Decompiled with CFR 0.150.
 */
public class hk
extends ck {
    iu a;
    xy b;
    bga c;
    int d;

    public hk(xy xy2) {
        this.b = xy2;
        this.a = xy2.aQ;
        this.a(3);
    }

    @Override
    public boolean b() {
        bga bga2 = this.b.ar();
        if (bga2 == null) {
            return false;
        }
        this.c = bga2;
        return true;
    }

    @Override
    public boolean a() {
        if (!this.c.bj()) {
            return false;
        }
        if (this.b.l(this.c) > 225.0) {
            return false;
        }
        return !this.b.ap().m() || this.b();
    }

    @Override
    public void d() {
        this.c = null;
        this.b.ap().n();
    }

    @Override
    public void e() {
        this.b.am().a(this.c, 30.0f, 30.0f);
        double d2 = this.b.bl * 2.0f * (this.b.bl * 2.0f);
        double d3 = this.b.i(this.c.aU, this.c.cD().b, this.c.aW);
        double d4 = 0.8;
        if (d3 > d2 && d3 < 16.0) {
            d4 = 1.33;
        } else if (d3 < 225.0) {
            d4 = 0.6;
        }
        this.b.ap().a(this.c, d4);
        this.d = Math.max(this.d - 1, 0);
        if (d3 > d2) {
            return;
        }
        if (this.d > 0) {
            return;
        }
        this.d = 20;
        this.b.a(this.c);
    }
}

