/*
 * Decompiled with CFR 0.150.
 */
public class aro
extends ck {
    private final cfl a;
    protected double b;
    private double c;
    private double d;
    private double e;

    public aro(cfl cfl2, double d2) {
        this.a = cfl2;
        this.b = d2;
        this.a(1);
    }

    @Override
    public boolean b() {
        if (this.a.aX() == null && !this.a.y_()) {
            return false;
        }
        if (!this.a.y_()) {
            amj amj2 = ble.a(this.a, 5, 4);
            if (amj2 == null) {
                return false;
            }
            this.c = amj2.b;
            this.d = amj2.c;
            this.e = amj2.d;
            return true;
        }
        cmz cmz2 = this.a(this.a.aQ, this.a, 5, 4);
        if (cmz2 == null) {
            return false;
        }
        this.c = cmz2.a();
        this.d = cmz2.b();
        this.e = cmz2.c();
        return true;
    }

    @Override
    public void c() {
        this.a.ap().a(this.c, this.d, this.e, this.b);
    }

    @Override
    public boolean a() {
        return !this.a.ap().m();
    }

    private cmz a(iu iu2, cpk cpk2, int n2, int n3) {
        cmz cmz2 = new cmz(cpk2);
        pj pj2 = new pj();
        int n4 = cmz2.a();
        int n5 = cmz2.b();
        int n6 = cmz2.c();
        float f2 = n2 * n2 * n3 * 2;
        cmz cmz3 = null;
        for (int i2 = n4 - n2; i2 <= n4 + n2; ++i2) {
            for (int i3 = n5 - n3; i3 <= n5 + n3; ++i3) {
                for (int i4 = n6 - n2; i4 <= n6 + n2; ++i4) {
                    float f3;
                    pj2.a(i2, i3, i4);
                    dbk dbk2 = iu2.n(pj2);
                    bfa bfa2 = dbk2.t();
                    if (bfa2 != blg.j && bfa2 != blg.i || !((f3 = (float)((i2 - n4) * (i2 - n4) + (i3 - n5) * (i3 - n5) + (i4 - n6) * (i4 - n6))) < f2)) continue;
                    f2 = f3;
                    cmz3 = new cmz(pj2);
                }
            }
        }
        return cmz3;
    }
}

