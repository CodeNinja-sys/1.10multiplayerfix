/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cnz
extends ck {
    private final cfl a;
    private double b;
    private double c;
    private double d;
    private final double e;
    private final iu f;

    public cnz(cfl cfl2, double d2) {
        this.a = cfl2;
        this.e = d2;
        this.f = cfl2.aQ;
        this.a(1);
    }

    @Override
    public boolean b() {
        if (!this.f.h()) {
            return false;
        }
        if (!this.a.y_()) {
            return false;
        }
        if (!this.f.g(new cmz(this.a.aU, this.a.cD().b, this.a.aW))) {
            return false;
        }
        if (this.a.a(dfm.f) != null) {
            return false;
        }
        amj amj2 = this.f();
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

    private amj f() {
        Random random = this.a.aW();
        cmz cmz2 = new cmz(this.a.aU, this.a.cD().b, this.a.aW);
        for (int i2 = 0; i2 < 10; ++i2) {
            cmz cmz3 = cmz2.e(random.nextInt(20) - 10, random.nextInt(6) - 3, random.nextInt(20) - 10);
            if (this.f.g(cmz3) || !(this.a.a(cmz3) < 0.0f)) continue;
            return new amj(cmz3.a(), cmz3.b(), cmz3.c());
        }
        return null;
    }
}

