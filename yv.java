/*
 * Decompiled with CFR 0.150.
 */
public class yv
extends deg {
    private boolean b;
    private dbn c;
    private amj d;

    public yv(brd brd2) {
        super(brd2);
    }

    @Override
    public void a() {
        if (this.b) {
            this.b = false;
            this.j();
        } else {
            cmz cmz2 = this.a.aQ.p(apk.a);
            double d2 = this.a.f(cmz2);
            if (d2 > 100.0) {
                this.a.aL().a(baw.a);
            }
        }
    }

    @Override
    public void b() {
        this.b = true;
        this.c = null;
        this.d = null;
    }

    private void j() {
        int n2 = this.a.T();
        amj amj2 = this.a.d(1.0f);
        int n3 = this.a.f(-amj2.b * 40.0, 105.0, -amj2.d * 40.0);
        if (this.a.aM() == null || this.a.aM().c() < 0) {
            n3 -= 12;
            n3 &= 7;
            n3 += 12;
        } else if ((n3 %= 12) < 0) {
            n3 += 12;
        }
        this.c = this.a.a(n2, n3, null);
        if (this.c != null) {
            this.c.a();
            this.k();
        }
    }

    private void k() {
        double d2;
        amj amj2 = this.c.f();
        this.c.a();
        while ((d2 = amj2.c + (double)(this.a.aW().nextFloat() * 20.0f)) < amj2.c) {
        }
        this.d = new amj(amj2.b, d2, amj2.d);
    }

    @Override
    public amj c() {
        return this.d;
    }

    @Override
    public baw d() {
        return baw.e;
    }
}

