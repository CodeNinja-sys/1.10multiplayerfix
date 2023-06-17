/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class aag
extends ck {
    private final cwp a;
    private bga b;
    private final double c;
    private int d;

    public aag(cwp cwp2, double d2) {
        this.a = cwp2;
        this.c = d2;
        this.a(1);
    }

    @Override
    public boolean b() {
        if (this.a.aL() >= 0) {
            return false;
        }
        if (this.a.aW().nextInt(400) != 0) {
            return false;
        }
        List list = this.a.aQ.a(cwp.class, this.a.cD().b(6.0, 3.0, 6.0));
        double d2 = Double.MAX_VALUE;
        Object object = list.iterator();
        while (object.hasNext()) {
            double d3;
            cwp cwp2 = (cwp)object.next();
            if (cwp2 == this.a || cwp2.aQ() || cwp2.aL() >= 0 || (d3 = cwp2.l(this.a)) > d2) continue;
            d2 = d3;
            this.b = cwp2;
        }
        return this.b != null || (object = ble.a(this.a, 16, 3)) != null;
    }

    @Override
    public boolean a() {
        return this.d > 0;
    }

    @Override
    public void c() {
        if (this.b != null) {
            this.a.e(true);
        }
        this.d = 1000;
    }

    @Override
    public void d() {
        this.a.e(false);
        this.b = null;
    }

    @Override
    public void e() {
        --this.d;
        if (this.b != null) {
            if (this.a.l(this.b) > 4.0) {
                this.a.ap().a(this.b, this.c);
            }
        } else if (this.a.ap().m()) {
            amj amj2 = ble.a(this.a, 16, 3);
            if (amj2 == null) {
                return;
            }
            this.a.ap().a(amj2.b, amj2.c, amj2.d, this.c);
        }
    }
}

