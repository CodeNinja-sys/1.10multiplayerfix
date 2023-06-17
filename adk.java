/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class adk
extends ck {
    cxn a;
    cxn b;
    double c;
    private int d;

    public adk(cxn cxn2, double d2) {
        this.a = cxn2;
        this.c = d2;
    }

    @Override
    public boolean b() {
        if (this.a.aL() >= 0) {
            return false;
        }
        List list = this.a.aQ.a(this.a.getClass(), this.a.cD().b(8.0, 4.0, 8.0));
        cxn cxn2 = null;
        double d2 = Double.MAX_VALUE;
        for (cxn cxn3 : list) {
            double d3;
            if (cxn3.aL() < 0 || (d3 = this.a.l(cxn3)) > d2) continue;
            d2 = d3;
            cxn2 = cxn3;
        }
        if (cxn2 == null) {
            return false;
        }
        if (d2 < 9.0) {
            return false;
        }
        this.b = cxn2;
        return true;
    }

    @Override
    public boolean a() {
        if (this.a.aL() >= 0) {
            return false;
        }
        if (!this.b.bj()) {
            return false;
        }
        double d2 = this.a.l(this.b);
        return !(d2 < 9.0) && !(d2 > 256.0);
    }

    @Override
    public void c() {
        this.d = 0;
    }

    @Override
    public void d() {
        this.b = null;
    }

    @Override
    public void e() {
        if (--this.d > 0) {
            return;
        }
        this.d = 10;
        this.a.ap().a(this.b, this.c);
    }
}

