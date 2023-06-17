/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public abstract class vh
extends cli {
    protected static final cxt a = new cxt(0.0, 0.0, 0.0, 1.0, 0.125, 1.0);
    protected final boolean b;

    protected vh(boolean bl2) {
        super(ahk.q);
        this.b = bl2;
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return a;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        if (iu2.n(cmz2.h()).q()) {
            return super.a(iu2, cmz2);
        }
        return false;
    }

    public boolean b(iu iu2, cmz cmz2) {
        return iu2.n(cmz2.h()).q();
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2, Random random) {
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (this.a((bnj)iu2, cmz2, dbk2)) {
            return;
        }
        boolean bl2 = this.f(iu2, cmz2, dbk2);
        if (this.b && !bl2) {
            iu2.a(cmz2, this.t(dbk2), 2);
        } else if (!this.b) {
            iu2.a(cmz2, this.s(dbk2), 2);
            if (!bl2) {
                iu2.a(cmz2, this.s(dbk2).t(), this.q(dbk2), -1);
            }
        }
    }

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        return bqk2.l() != ctv.b;
    }

    protected boolean m(dbk dbk2) {
        return this.b;
    }

    @Override
    public int c(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        return dbk2.a(bnj2, cmz2, bqk2);
    }

    @Override
    public int b(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (!this.m(dbk2)) {
            return 0;
        }
        if (dbk2.b(j) == bqk2) {
            return this.c(bnj2, cmz2, dbk2);
        }
        return 0;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (this.b(iu2, cmz2)) {
            this.e(iu2, cmz2, dbk2);
            return;
        }
        this.b(iu2, cmz2, dbk2, 0);
        iu2.f(cmz2);
        for (bqk bqk2 : bqk.values()) {
            iu2.b(cmz2.c(bqk2), this);
        }
    }

    protected void e(iu iu2, cmz cmz2, dbk dbk2) {
        if (this.a((bnj)iu2, cmz2, dbk2)) {
            return;
        }
        boolean bl2 = this.f(iu2, cmz2, dbk2);
        if ((this.b && !bl2 || !this.b && bl2) && !iu2.d(cmz2, this)) {
            int n2 = -1;
            if (this.i(iu2, cmz2, dbk2)) {
                n2 = -3;
            } else if (this.b) {
                n2 = -2;
            }
            iu2.a(cmz2, this, this.r(dbk2), n2);
        }
    }

    public boolean a(bnj bnj2, cmz cmz2, dbk dbk2) {
        return false;
    }

    protected boolean f(iu iu2, cmz cmz2, dbk dbk2) {
        return this.g(iu2, cmz2, dbk2) > 0;
    }

    protected int g(iu iu2, cmz cmz2, dbk dbk2) {
        bqk bqk2 = (bqk)((Object)dbk2.b(j));
        cmz cmz3 = cmz2.c(bqk2);
        int n2 = iu2.c(cmz3, bqk2);
        if (n2 >= 15) {
            return n2;
        }
        dbk dbk3 = iu2.n(cmz3);
        return Math.max(n2, dbk3.t() == blg.af ? (Integer)dbk3.b(czs.e) : 0);
    }

    protected int b(bnj bnj2, cmz cmz2, dbk dbk2) {
        bqk bqk2 = (bqk)((Object)dbk2.b(j));
        bqk bqk3 = bqk2.f();
        bqk bqk4 = bqk2.g();
        return Math.max(this.b(bnj2, cmz2.c(bqk3), bqk3), this.b(bnj2, cmz2.c(bqk4), bqk4));
    }

    protected int b(bnj bnj2, cmz cmz2, bqk bqk2) {
        dbk dbk2 = bnj2.n(cmz2);
        bfa bfa2 = dbk2.t();
        if (this.n(dbk2)) {
            if (bfa2 == blg.cn) {
                return 15;
            }
            if (bfa2 == blg.af) {
                return (Integer)dbk2.b(czs.e);
            }
            return bnj2.a(cmz2, bqk2);
        }
        return 0;
    }

    @Override
    public boolean i(dbk dbk2) {
        return true;
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        return this.s().a(j, (Comparable)((Object)bga2.B_().e()));
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bga bga2, bhl bhl2) {
        if (this.f(iu2, cmz2, dbk2)) {
            iu2.a(cmz2, (bfa)this, 1);
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        this.h(iu2, cmz2, dbk2);
    }

    protected void h(iu iu2, cmz cmz2, dbk dbk2) {
        bqk bqk2 = (bqk)((Object)dbk2.b(j));
        cmz cmz3 = cmz2.c(bqk2.e());
        iu2.c(cmz3, this);
        iu2.a(cmz3, (bfa)this, bqk2);
    }

    @Override
    public void a_(iu iu2, cmz cmz2, dbk dbk2) {
        if (this.b) {
            for (bqk bqk2 : bqk.values()) {
                iu2.b(cmz2.c(bqk2), this);
            }
        }
        super.a_(iu2, cmz2, dbk2);
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    protected boolean n(dbk dbk2) {
        return dbk2.m();
    }

    protected int c(bnj bnj2, cmz cmz2, dbk dbk2) {
        return 15;
    }

    public static boolean o(dbk dbk2) {
        return blg.bb.p(dbk2) || blg.cj.p(dbk2);
    }

    public boolean p(dbk dbk2) {
        bfa bfa2 = dbk2.t();
        return bfa2 == this.s(this.s()).t() || bfa2 == this.t(this.s()).t();
    }

    public boolean i(iu iu2, cmz cmz2, dbk dbk2) {
        bqk bqk2 = ((bqk)((Object)dbk2.b(j))).e();
        cmz cmz3 = cmz2.c(bqk2);
        if (vh.o(iu2.n(cmz3))) {
            return iu2.n(cmz3).b(j) != bqk2;
        }
        return false;
    }

    protected int q(dbk dbk2) {
        return this.r(dbk2);
    }

    protected abstract int r(dbk var1);

    protected abstract dbk s(dbk var1);

    protected abstract dbk t(dbk var1);

    @Override
    public boolean a(bfa bfa2) {
        return this.p(bfa2.s());
    }

    @Override
    public kj b() {
        return kj.c;
    }
}

