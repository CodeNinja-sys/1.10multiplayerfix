/*
 * Decompiled with CFR 0.150.
 */
public class byi
extends ck {
    private final cfl a;
    private double b;
    private double c;
    private double d;
    private final double e;

    public byi(cfl cfl2, double d2) {
        this.a = cfl2;
        this.e = d2;
        this.a(1);
    }

    @Override
    public boolean b() {
        if (this.a.aT()) {
            return false;
        }
        cmz cmz2 = this.a.aU();
        amj amj2 = ble.a(this.a, 16, 7, new amj(cmz2.a(), cmz2.b(), cmz2.c()));
        if (amj2 == null) {
            return false;
        }
        this.b = amj2.b;
        this.c = amj2.c;
        this.d = amj2.d;
        return true;
    }

    @Override
    public boolean a() {
        return !this.a.ap().m();
    }

    @Override
    public void c() {
        this.a.ap().a(this.b, this.c, this.d, this.e);
    }
}

