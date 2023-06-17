/*
 * Decompiled with CFR 0.150.
 */
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class bie
extends deg {
    private static final d b = org.apache.logging.log4j.c.c();
    private int c;
    private dbn d;
    private amj e;
    private bga f;
    private boolean g;

    public bie(brd brd2) {
        super(brd2);
    }

    @Override
    public void a() {
        double d2;
        double d3;
        double d4;
        if (this.f == null) {
            b.f("Skipping player strafe phase because no player was found");
            this.a.aL().a(baw.a);
            return;
        }
        if (this.d != null && this.d.b()) {
            d4 = this.f.aU;
            d3 = this.f.aW;
            double d5 = d4 - this.a.aU;
            double d6 = d3 - this.a.aW;
            d2 = cmk.a(d5 * d5 + d6 * d6);
            double d7 = Math.min((double)0.4f + d2 / 80.0 - 1.0, 10.0);
            this.e = new amj(d4, this.f.aV + d7, d3);
        }
        double d8 = d4 = this.e == null ? 0.0 : this.e.c(this.a.aU, this.a.aV, this.a.aW);
        if (d4 < 100.0 || d4 > 22500.0) {
            this.j();
        }
        d3 = 64.0;
        if (this.f.l(this.a) < 4096.0) {
            if (this.a.j(this.f)) {
                ++this.c;
                amj amj2 = new amj(this.f.aU - this.a.aU, 0.0, this.f.aW - this.a.aW).a();
                amj amj3 = new amj(cmk.a(this.a.ba * ((float)Math.PI / 180)), 0.0, -cmk.b(this.a.ba * ((float)Math.PI / 180))).a();
                float f2 = (float)amj3.b(amj2);
                float f3 = (float)(Math.acos(f2) * 57.2957763671875);
                f3 += 0.5f;
                if (this.c >= 5 && f3 >= 0.0f && f3 < 10.0f) {
                    d2 = 1.0;
                    amj amj4 = this.a.l(1.0f);
                    double d9 = this.a.e.aU - amj4.b * 1.0;
                    double d10 = this.a.e.aV + (double)(this.a.e.bm / 2.0f) + 0.5;
                    double d11 = this.a.e.aW - amj4.d * 1.0;
                    double d12 = this.f.aU - d9;
                    double d13 = this.f.aV + (double)(this.f.bm / 2.0f) - (d10 + (double)(this.a.e.bm / 2.0f));
                    double d14 = this.f.aW - d11;
                    this.a.aQ.a(null, 1017, new cmz(this.a), 0);
                    ckd ckd2 = new ckd(this.a.aQ, this.a, d12, d13, d14);
                    ckd2.aU = d9;
                    ckd2.aV = d10;
                    ckd2.aW = d11;
                    this.a.aQ.b(ckd2);
                    this.c = 0;
                    if (this.d != null) {
                        while (!this.d.b()) {
                            this.d.a();
                        }
                    }
                    this.a.aL().a(baw.a);
                }
            } else if (this.c > 0) {
                --this.c;
            }
        } else if (this.c > 0) {
            --this.c;
        }
    }

    private void j() {
        if (this.d == null || this.d.b()) {
            int n2;
            int n3 = n2 = this.a.T();
            if (this.a.aW().nextInt(8) == 0) {
                this.g = !this.g;
                n3 += 6;
            }
            n3 = this.g ? ++n3 : --n3;
            if (this.a.aM() == null || this.a.aM().c() < 0) {
                n3 -= 12;
                n3 &= 7;
                n3 += 12;
            } else if ((n3 %= 12) < 0) {
                n3 += 12;
            }
            this.d = this.a.a(n2, n3, null);
            if (this.d != null) {
                this.d.a();
            }
        }
        this.k();
    }

    private void k() {
        if (this.d != null && !this.d.b()) {
            double d2;
            amj amj2 = this.d.f();
            this.d.a();
            double d3 = amj2.b;
            double d4 = amj2.d;
            while ((d2 = amj2.c + (double)(this.a.aW().nextFloat() * 20.0f)) < amj2.c) {
            }
            this.e = new amj(d3, d2, d4);
        }
    }

    @Override
    public void b() {
        this.c = 0;
        this.e = null;
        this.d = null;
        this.f = null;
    }

    public void a(bga bga2) {
        this.f = bga2;
        int n2 = this.a.T();
        int n3 = this.a.f(this.f.aU, this.f.aV, this.f.aW);
        int n4 = cmk.c(this.f.aU);
        int n5 = cmk.c(this.f.aW);
        double d2 = (double)n4 - this.a.aU;
        double d3 = (double)n5 - this.a.aW;
        double d4 = cmk.a(d2 * d2 + d3 * d3);
        double d5 = Math.min((double)0.4f + d4 / 80.0 - 1.0, 10.0);
        int n6 = cmk.c(this.f.aV + d5);
        aqn aqn2 = new aqn(n4, n6, n5);
        this.d = this.a.a(n2, n3, aqn2);
        if (this.d != null) {
            this.d.a();
            this.k();
        }
    }

    @Override
    public amj c() {
        return this.e;
    }

    @Override
    public baw d() {
        return baw.b;
    }
}

