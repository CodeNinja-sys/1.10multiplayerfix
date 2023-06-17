/*
 * Decompiled with CFR 0.150.
 */
public class vp
extends dct {
    private boolean f;

    public vp(xy xy2, iu iu2) {
        super(xy2, iu2);
    }

    @Override
    protected cpn a() {
        this.e = new cae();
        this.e.a(true);
        return new cpn(this.e);
    }

    @Override
    protected boolean b() {
        return this.a.be || this.g() && this.o() || this.a.cp();
    }

    @Override
    protected amj c() {
        return new amj(this.a.aU, this.q(), this.a.aW);
    }

    @Override
    public dbn b(cmz cmz2) {
        cmz cmz3;
        if (this.b.n(cmz2).a() == ahk.a) {
            cmz3 = cmz2.h();
            while (cmz3.b() > 0 && this.b.n(cmz3).a() == ahk.a) {
                cmz3 = cmz3.h();
            }
            if (cmz3.b() > 0) {
                return super.b(cmz3.g());
            }
            while (cmz3.b() < this.b.K() && this.b.n(cmz3).a() == ahk.a) {
                cmz3 = cmz3.g();
            }
            cmz2 = cmz3;
        }
        if (this.b.n(cmz2).a().a()) {
            cmz3 = cmz2.g();
            while (cmz3.b() < this.b.K() && this.b.n(cmz3).a().a()) {
                cmz3 = cmz3.g();
            }
            return super.b(cmz3);
        }
        return super.b(cmz2);
    }

    @Override
    public dbn a(cpk cpk2) {
        cmz cmz2 = new cmz(cpk2);
        return this.b(cmz2);
    }

    private int q() {
        if (!this.a.V_() || !this.g()) {
            return (int)(this.a.cD().b + 0.5);
        }
        int n2 = (int)this.a.cD().b;
        bfa bfa2 = this.b.n(new cmz(cmk.c(this.a.aU), n2, cmk.c(this.a.aW))).t();
        int n3 = 0;
        while (bfa2 == blg.i || bfa2 == blg.j) {
            bfa2 = this.b.n(new cmz(cmk.c(this.a.aU), ++n2, cmk.c(this.a.aW))).t();
            if (++n3 <= 16) continue;
            return (int)this.a.cD().b;
        }
        return n2;
    }

    @Override
    protected void e() {
        aqn aqn2;
        int n2;
        super.e();
        for (n2 = 0; n2 < this.c.d(); ++n2) {
            aqn2 = this.c.a(n2);
            aqn aqn3 = n2 + 1 < this.c.d() ? this.c.a(n2 + 1) : null;
            dbk dbk2 = this.b.n(new cmz(aqn2.a, aqn2.b, aqn2.c));
            bfa bfa2 = dbk2.t();
            if (bfa2 != blg.bE) continue;
            this.c.a(n2, aqn2.a(aqn2.a, aqn2.b + 1, aqn2.c));
            if (aqn3 == null || aqn2.b < aqn3.b) continue;
            this.c.a(n2 + 1, aqn3.a(aqn3.a, aqn2.b + 1, aqn3.c));
        }
        if (this.f) {
            if (this.b.g(new cmz(cmk.c(this.a.aU), (int)(this.a.cD().b + 0.5), cmk.c(this.a.aW)))) {
                return;
            }
            for (n2 = 0; n2 < this.c.d(); ++n2) {
                aqn2 = this.c.a(n2);
                if (!this.b.g(new cmz(aqn2.a, aqn2.b, aqn2.c))) continue;
                this.c.b(n2 - 1);
                return;
            }
        }
    }

    @Override
    protected boolean a(amj amj2, amj amj3, int n2, int n3, int n4) {
        int n5 = cmk.c(amj2.b);
        int n6 = cmk.c(amj2.d);
        double d2 = amj3.b - amj2.b;
        double d3 = amj3.d - amj2.d;
        double d4 = d2 * d2 + d3 * d3;
        if (d4 < 1.0E-8) {
            return false;
        }
        double d5 = 1.0 / Math.sqrt(d4);
        if (!this.a(n5, (int)amj2.c, n6, n2 += 2, n3, n4 += 2, amj2, d2 *= d5, d3 *= d5)) {
            return false;
        }
        n2 -= 2;
        n4 -= 2;
        double d6 = 1.0 / Math.abs(d2);
        double d7 = 1.0 / Math.abs(d3);
        double d8 = (double)n5 - amj2.b;
        double d9 = (double)n6 - amj2.d;
        if (d2 >= 0.0) {
            d8 += 1.0;
        }
        if (d3 >= 0.0) {
            d9 += 1.0;
        }
        d8 /= d2;
        d9 /= d3;
        int n7 = d2 < 0.0 ? -1 : 1;
        int n8 = d3 < 0.0 ? -1 : 1;
        int n9 = cmk.c(amj3.b);
        int n10 = cmk.c(amj3.d);
        int n11 = n9 - n5;
        int n12 = n10 - n6;
        while (n11 * n7 > 0 || n12 * n8 > 0) {
            if (d8 < d9) {
                d8 += d6;
                n11 = n9 - (n5 += n7);
            } else {
                d9 += d7;
                n12 = n10 - (n6 += n8);
            }
            if (this.a(n5, (int)amj2.c, n6, n2, n3, n4, amj2, d2, d3)) continue;
            return false;
        }
        return true;
    }

    private boolean a(int n2, int n3, int n4, int n5, int n6, int n7, amj amj2, double d2, double d3) {
        int n8 = n2 - n5 / 2;
        int n9 = n4 - n7 / 2;
        if (!this.b(n8, n3, n9, n5, n6, n7, amj2, d2, d3)) {
            return false;
        }
        for (int i2 = n8; i2 < n8 + n5; ++i2) {
            for (int i3 = n9; i3 < n9 + n7; ++i3) {
                double d4 = (double)i2 + 0.5 - amj2.b;
                double d5 = (double)i3 + 0.5 - amj2.d;
                if (d4 * d2 + d5 * d3 < 0.0) continue;
                cfh cfh2 = this.e.a(this.b, i2, n3 - 1, i3, this.a, n5, n6, n7, true, true);
                if (cfh2 == cfh.g) {
                    return false;
                }
                if (cfh2 == cfh.f) {
                    return false;
                }
                if (cfh2 == cfh.b) {
                    return false;
                }
                cfh2 = this.e.a(this.b, i2, n3, i3, this.a, n5, n6, n7, true, true);
                float f2 = this.a.a(cfh2);
                if (f2 < 0.0f || f2 >= 8.0f) {
                    return false;
                }
                if (cfh2 != cfh.j && cfh2 != cfh.i && cfh2 != cfh.n) continue;
                return false;
            }
        }
        return true;
    }

    private boolean b(int n2, int n3, int n4, int n5, int n6, int n7, amj amj2, double d2, double d3) {
        for (cmz cmz2 : cmz.a(new cmz(n2, n3, n4), new cmz(n2 + n5 - 1, n3 + n6 - 1, n4 + n7 - 1))) {
            bfa bfa2;
            double d4;
            double d5 = (double)cmz2.a() + 0.5 - amj2.b;
            if (d5 * d2 + (d4 = (double)cmz2.c() + 0.5 - amj2.d) * d3 < 0.0 || (bfa2 = this.b.n(cmz2).t()).a((bnj)this.b, cmz2)) continue;
            return false;
        }
        return true;
    }

    public void a(boolean bl2) {
        this.e.b(bl2);
    }

    public void b(boolean bl2) {
        this.e.a(bl2);
    }

    public boolean f() {
        return this.e.c();
    }

    public void c(boolean bl2) {
        this.e.c(bl2);
    }

    public boolean g() {
        return this.e.e();
    }

    public void d(boolean bl2) {
        this.f = bl2;
    }
}

