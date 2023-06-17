/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bxe
extends bfa {
    public static final qf a = qf.a("age", 0, 15);
    protected static final cxt b = new cxt(0.125, 0.0, 0.125, 0.875, 1.0, 0.875);

    protected bxe() {
        super(ahk.k);
        this.D(this.O.b().a(a, Integer.valueOf(0)));
        this.b(true);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return b;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (iu2.n(cmz2.h()).t() != blg.aM && !this.e(iu2, cmz2, dbk2)) {
            return;
        }
        if (iu2.c(cmz2.g())) {
            int n2 = 1;
            while (iu2.n(cmz2.c(n2)).t() == this) {
                ++n2;
            }
            if (n2 < 3) {
                int n3 = (Integer)dbk2.b(a);
                if (n3 == 15) {
                    iu2.a(cmz2.g(), this.s());
                    iu2.a(cmz2, dbk2.a(a, Integer.valueOf(0)), 4);
                } else {
                    iu2.a(cmz2, dbk2.a(a, Integer.valueOf(n3 + 1)), 4);
                }
            }
        }
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        bfa bfa2 = iu2.n(cmz2.h()).t();
        if (bfa2 == this) {
            return true;
        }
        if (bfa2 == blg.c || bfa2 == blg.d || bfa2 == blg.m) {
            cmz cmz3 = cmz2.h();
            for (bqk bqk2 : afj.a) {
                dbk dbk2 = iu2.n(cmz3.c(bqk2));
                if (dbk2.a() != ahk.h && dbk2.t() != blg.de) continue;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        this.e(iu2, cmz2, dbk2);
    }

    protected final boolean e(iu iu2, cmz cmz2, dbk dbk2) {
        if (this.c(iu2, cmz2)) {
            return true;
        }
        this.b(iu2, cmz2, dbk2, 0);
        iu2.f(cmz2);
        return false;
    }

    public boolean c(iu iu2, cmz cmz2) {
        return this.a(iu2, cmz2);
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        return y;
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return hp.aQ;
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(hp.aQ);
    }

    @Override
    public kj b() {
        return kj.c;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, Integer.valueOf(n2));
    }

    @Override
    public int e(dbk dbk2) {
        return (Integer)dbk2.b(a);
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

