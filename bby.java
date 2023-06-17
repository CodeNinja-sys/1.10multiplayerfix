/*
 * Decompiled with CFR 0.150.
 */
public class bby
extends ck {
    private final cfl a;
    private dap b;
    private int c = -1;
    private int d = -1;

    public bby(cfl cfl2) {
        this.a = cfl2;
        this.a(1);
    }

    @Override
    public boolean b() {
        cmz cmz2 = new cmz(this.a);
        if (this.a.aQ.h() && (!this.a.aQ.I() || this.a.aQ.a(cmz2).d()) || this.a.aQ.q.n()) {
            return false;
        }
        if (this.a.aW().nextInt(50) != 0) {
            return false;
        }
        if (this.c != -1 && this.a.i(this.c, this.a.aV, this.d) < 4.0) {
            return false;
        }
        aus aus2 = this.a.aQ.T().a(cmz2, 14);
        if (aus2 == null) {
            return false;
        }
        this.b = aus2.c(cmz2);
        return this.b != null;
    }

    @Override
    public boolean a() {
        return !this.a.ap().m();
    }

    @Override
    public void c() {
        this.c = -1;
        cmz cmz2 = this.b.e();
        int n2 = cmz2.a();
        int n3 = cmz2.b();
        int n4 = cmz2.c();
        if (this.a.e(cmz2) > 256.0) {
            amj amj2 = ble.a(this.a, 14, 3, new amj((double)n2 + 0.5, n3, (double)n4 + 0.5));
            if (amj2 != null) {
                this.a.ap().a(amj2.b, amj2.c, amj2.d, 1.0);
            }
        } else {
            this.a.ap().a((double)n2 + 0.5, n3, (double)n4 + 0.5, 1.0);
        }
    }

    @Override
    public void d() {
        this.c = this.b.e().a();
        this.d = this.b.e().c();
        this.b = null;
    }
}

