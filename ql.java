/*
 * Decompiled with CFR 0.150.
 */
class ql
extends bfh {
    private final amq c;
    private boolean d;
    private boolean e;

    public ql(amq amq2) {
        super(amq2, 0.7f, 16);
        this.c = amq2;
    }

    @Override
    public boolean b() {
        if (this.a <= 0) {
            if (!this.c.aQ.F().b("mobGriefing")) {
                return false;
            }
            this.e = false;
            this.d = amq.c(this.c);
            this.d = true;
        }
        return super.b();
    }

    @Override
    public boolean a() {
        return this.e && super.a();
    }

    @Override
    public void c() {
        super.c();
    }

    @Override
    public void d() {
        super.d();
    }

    @Override
    public void e() {
        super.e();
        this.c.am().a((double)this.b.a() + 0.5, this.b.b() + 1, (double)this.b.c() + 0.5, 10.0f, this.c.aw());
        if (this.f()) {
            iu iu2 = this.c.aQ;
            cmz cmz2 = this.b.g();
            dbk dbk2 = iu2.n(cmz2);
            bfa bfa2 = dbk2.t();
            if (this.e && bfa2 instanceof blm) {
                Integer n2 = (Integer)dbk2.b(blm.a);
                if (n2 == 0) {
                    iu2.a(cmz2, blg.a.s(), 2);
                    iu2.b(cmz2, true);
                } else {
                    iu2.a(cmz2, dbk2.a(blm.a, Integer.valueOf(n2 - 1)), 2);
                    iu2.b(2001, cmz2, bfa.u(dbk2));
                }
                this.c.Q();
            }
            this.e = false;
            this.a = 10;
        }
    }

    @Override
    protected boolean a(iu iu2, cmz cmz2) {
        dbk dbk2;
        bfa bfa2 = iu2.n(cmz2).t();
        if (bfa2 == blg.ak && this.d && !this.e && (bfa2 = (dbk2 = iu2.n(cmz2 = cmz2.g())).t()) instanceof blm && ((blm)bfa2).o(dbk2)) {
            this.e = true;
            return true;
        }
        return false;
    }
}

