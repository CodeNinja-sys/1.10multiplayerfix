/*
 * Decompiled with CFR 0.150.
 */
public class ip
extends bfh {
    private final fl c;

    public ip(fl fl2, double d2) {
        super(fl2, d2, 8);
        this.c = fl2;
    }

    @Override
    public boolean b() {
        return this.c.B() && !this.c.C() && super.b();
    }

    @Override
    public boolean a() {
        return super.a();
    }

    @Override
    public void c() {
        super.c();
        this.c.F().a(false);
    }

    @Override
    public void d() {
        super.d();
        this.c.c(false);
    }

    @Override
    public void e() {
        super.e();
        this.c.F().a(false);
        if (!this.f()) {
            this.c.c(false);
        } else if (!this.c.C()) {
            this.c.c(true);
        }
    }

    @Override
    protected boolean a(iu iu2, cmz cmz2) {
        if (!iu2.c(cmz2.g())) {
            return false;
        }
        dbk dbk2 = iu2.n(cmz2);
        bfa bfa2 = dbk2.t();
        if (bfa2 == blg.ae) {
            bql bql2 = iu2.q(cmz2);
            if (bql2 instanceof bdm && ((bdm)bql2).j < 1) {
                return true;
            }
        } else {
            if (bfa2 == blg.am) {
                return true;
            }
            if (bfa2 == blg.C && dbk2.b(dx.a) != ahh.a) {
                return true;
            }
        }
        return false;
    }
}

