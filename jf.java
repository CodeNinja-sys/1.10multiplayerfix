/*
 * Decompiled with CFR 0.150.
 */
public class jf
extends bql {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final cxh e = new clt(this);

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        this.e.a(bvp2);
        bvp2.a("powered", this.g());
        bvp2.a("conditionMet", this.i());
        bvp2.a("auto", this.h());
        return bvp2;
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        this.e.b(bvp2);
        this.a(bvp2.p("powered"));
        this.c(bvp2.p("conditionMet"));
        this.b(bvp2.p("auto"));
    }

    @Override
    public hv a_() {
        if (this.j()) {
            this.d(false);
            bvp bvp2 = this.b(new bvp());
            return new hv(this.l, 2, bvp2);
        }
        return null;
    }

    @Override
    public boolean h_() {
        return true;
    }

    public cxh d() {
        return this.e;
    }

    public bsv f() {
        return this.e.n();
    }

    public void a(boolean bl2) {
        this.a = bl2;
    }

    public boolean g() {
        return this.a;
    }

    public boolean h() {
        return this.b;
    }

    public void b(boolean bl2) {
        bfa bfa2;
        boolean bl3 = this.b;
        this.b = bl2;
        if (!bl3 && bl2 && !this.a && this.k != null && this.k() != cjt.a && (bfa2 = this.z()) instanceof btt) {
            cmz cmz2 = this.y();
            btt btt2 = (btt)bfa2;
            this.c = !this.l() || btt2.e(this.k, cmz2, this.k.n(cmz2));
            this.k.a(cmz2, bfa2, bfa2.a(this.k));
            if (this.c) {
                btt2.c(this.k, cmz2);
            }
        }
    }

    public boolean i() {
        return this.c;
    }

    public void c(boolean bl2) {
        this.c = bl2;
    }

    public boolean j() {
        return this.d;
    }

    public void d(boolean bl2) {
        this.d = bl2;
    }

    public cjt k() {
        bfa bfa2 = this.z();
        if (bfa2 == blg.bX) {
            return cjt.c;
        }
        if (bfa2 == blg.dc) {
            return cjt.b;
        }
        if (bfa2 == blg.dd) {
            return cjt.a;
        }
        return cjt.c;
    }

    public boolean l() {
        dbk dbk2 = this.k.n(this.y());
        if (dbk2.t() instanceof btt) {
            return (Boolean)dbk2.b(btt.b);
        }
        return false;
    }

    @Override
    public void f_() {
        this.n = null;
        super.f_();
    }
}

