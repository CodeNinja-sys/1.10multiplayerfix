/*
 * Decompiled with CFR 0.150.
 */
public class cik
extends ctk {
    private int b;
    private int c;
    private gw d;

    public cik(brd brd2) {
        super(brd2);
    }

    @Override
    public void e() {
        ++this.b;
        if (this.b % 2 == 0 && this.b < 10) {
            amj amj2 = this.a.d(1.0f).a();
            amj2.b(-0.7853982f);
            double d2 = this.a.e.aU;
            double d3 = this.a.e.aV + (double)(this.a.e.bm / 2.0f);
            double d4 = this.a.e.aW;
            for (int i2 = 0; i2 < 8; ++i2) {
                double d5 = d2 + this.a.aW().nextGaussian() / 2.0;
                double d6 = d3 + this.a.aW().nextGaussian() / 2.0;
                double d7 = d4 + this.a.aW().nextGaussian() / 2.0;
                for (int i3 = 0; i3 < 6; ++i3) {
                    this.a.aQ.a(lz.Q, d5, d6, d7, -amj2.b * (double)0.08f * (double)i3, -amj2.c * (double)0.6f, -amj2.d * (double)0.08f * (double)i3, new int[0]);
                }
                amj2.b(0.19634955f);
            }
        }
    }

    @Override
    public void a() {
        ++this.b;
        if (this.b >= 200) {
            if (this.c >= 4) {
                this.a.aL().a(baw.e);
            } else {
                this.a.aL().a(baw.g);
            }
        } else if (this.b == 10) {
            amj amj2 = new amj(this.a.e.aU - this.a.aU, 0.0, this.a.e.aW - this.a.aW).a();
            float f2 = 5.0f;
            double d2 = this.a.e.aU + amj2.b * 5.0 / 2.0;
            double d3 = this.a.e.aW + amj2.d * 5.0 / 2.0;
            double d4 = this.a.e.aV + (double)(this.a.e.bm / 2.0f);
            pj pj2 = new pj(cmk.c(d2), cmk.c(d4), cmk.c(d3));
            while (this.a.aQ.c(pj2)) {
                pj2.a(cmk.c(d2), cmk.c(d4 -= 1.0), cmk.c(d3));
            }
            d4 = cmk.c(d4) + 1;
            this.d = new gw(this.a.aQ, d2, d4, d3);
            this.d.a(this.a);
            this.d.c(5.0f);
            this.d.f(200);
            this.d.a(lz.Q);
            this.d.a(new cko(ake.g));
            this.a.aQ.b(this.d);
        }
    }

    @Override
    public void b() {
        this.b = 0;
        ++this.c;
    }

    @Override
    public void i() {
        if (this.d != null) {
            this.d.ak_();
            this.d = null;
        }
    }

    @Override
    public baw d() {
        return baw.f;
    }

    public void j() {
        this.c = 0;
    }
}

