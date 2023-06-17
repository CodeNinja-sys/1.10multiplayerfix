/*
 * Decompiled with CFR 0.150.
 */
public class xb
extends ck {
    private final cfl a;
    private bga b;
    private double c;
    private double d;
    private double e;
    private final double f;
    private final float g;

    public xb(cfl cfl2, double d2, float f2) {
        this.a = cfl2;
        this.f = d2;
        this.g = f2;
        this.a(1);
    }

    @Override
    public boolean b() {
        this.b = this.a.ar();
        if (this.b == null) {
            return false;
        }
        if (this.b.l(this.a) > (double)(this.g * this.g)) {
            return false;
        }
        amj amj2 = ble.a(this.a, 16, 7, new amj(this.b.aU, this.b.aV, this.b.aW));
        if (amj2 == null) {
            return false;
        }
        this.c = amj2.b;
        this.d = amj2.c;
        this.e = amj2.d;
        return true;
    }

    @Override
    public boolean a() {
        return !this.a.ap().m() && this.b.bj() && this.b.l(this.a) < (double)(this.g * this.g);
    }

    @Override
    public void d() {
        this.b = null;
    }

    @Override
    public void c() {
        this.a.ap().a(this.c, this.d, this.e, this.f);
    }
}

