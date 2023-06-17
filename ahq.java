/*
 * Decompiled with CFR 0.150.
 */
public class ahq
extends deg {
    private dbn b;
    private amj c;
    private boolean d;

    public ahq(brd brd2) {
        super(brd2);
    }

    @Override
    public baw d() {
        return baw.a;
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
    public void b() {
        this.b = null;
        this.c = null;
    }

    @Override
    public amj c() {
        return this.c;
    }

    private void j() {
        int n2;
        if (this.b != null && this.b.b()) {
            cmz cmz2 = this.a.aQ.p(new cmz(apk.a));
            int n3 = n2 = this.a.aM() == null ? 0 : this.a.aM().c();
            if (this.a.aW().nextInt(n2 + 3) == 0) {
                this.a.aL().a(baw.c);
                return;
            }
            double d2 = 64.0;
            bdl bdl2 = this.a.aQ.a(cmz2, d2, d2);
            if (bdl2 != null) {
                d2 = bdl2.f(cmz2) / 512.0;
            }
            if (bdl2 != null && (this.a.aW().nextInt(cmk.a((int)d2) + 2) == 0 || this.a.aW().nextInt(n2 + 2) == 0)) {
                this.a(bdl2);
                return;
            }
        }
        if (this.b == null || this.b.b()) {
            int n4;
            n2 = n4 = this.a.T();
            if (this.a.aW().nextInt(8) == 0) {
                this.d = !this.d;
                n2 += 6;
            }
            n2 = this.d ? ++n2 : --n2;
            if (this.a.aM() == null || this.a.aM().c() < 0) {
                n2 -= 12;
                n2 &= 7;
                n2 += 12;
            } else if ((n2 %= 12) < 0) {
                n2 += 12;
            }
            this.b = this.a.a(n4, n2, null);
            if (this.b != null) {
                this.b.a();
            }
        }
        this.k();
    }

    private void a(bdl bdl2) {
        this.a.aL().a(baw.b);
        ((bie)this.a.aL().b(baw.b)).a(bdl2);
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

    @Override
    public void a(abi abi2, cmz cmz2, ahy ahy2, bdl bdl2) {
        if (bdl2 != null) {
            this.a(bdl2);
        }
    }
}

