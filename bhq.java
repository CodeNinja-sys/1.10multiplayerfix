/*
 * Decompiled with CFR 0.150.
 */
public class bhq
extends deg {
    private dbn b;
    private amj c;

    public bhq(brd brd2) {
        super(brd2);
    }

    @Override
    public baw d() {
        return baw.c;
    }

    @Override
    public void b() {
        this.b = null;
        this.c = null;
    }

    @Override
    public void a() {
        double d2;
        double d3 = d2 = this.c == null ? 0.0 : this.c.c(this.a.aU, this.a.aV, this.a.aW);
        if (d2 < 100.0 || d2 > 22500.0 || this.a.bf || this.a.bg) {
            this.j();
        }
    }

    @Override
    public amj c() {
        return this.c;
    }

    private void j() {
        if (this.b == null || this.b.b()) {
            int n2;
            Object object;
            int n3 = this.a.T();
            cmz cmz2 = this.a.aQ.p(apk.a);
            bdl bdl2 = this.a.aQ.a(cmz2, 128.0, 128.0);
            if (bdl2 != null) {
                object = new amj(bdl2.aU, 0.0, bdl2.aW).a();
                n2 = this.a.f(-((amj)object).b * 40.0, 105.0, -((amj)object).d * 40.0);
            } else {
                n2 = this.a.f(40.0, cmz2.b(), 0.0);
            }
            object = new aqn(cmz2.a(), cmz2.b(), cmz2.c());
            this.b = this.a.a(n3, n2, (aqn)object);
            if (this.b != null) {
                this.b.a();
            }
        }
        this.k();
        if (this.b != null && this.b.b()) {
            this.a.aL().a(baw.d);
        }
    }

    private void k() {
        if (this.b != null && !this.b.b()) {
            double d2;
            amj amj2 = this.b.f();
            this.b.a();
            double d3 = amj2.b;
            double d4 = amj2.d;
            while ((d2 = amj2.c + (double)(this.a.aW().nextFloat() * 20.0f)) < amj2.c) {
            }
            this.c = new amj(d3, d2, d4);
        }
    }
}

