/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class qt
extends bfa {
    public static final qf a = qf.a("age", 0, 15);
    protected static final cxt b = new cxt(0.0625, 0.0, 0.0625, 0.9375, 0.9375, 0.9375);
    protected static final cxt c = new cxt(0.0625, 0.0, 0.0625, 0.9375, 1.0, 0.9375);

    protected qt() {
        super(ahk.A);
        this.D(this.O.b().a(a, Integer.valueOf(0)));
        this.b(true);
        this.a(zm.c);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        cmz cmz3 = cmz2.g();
        if (!iu2.c(cmz3)) {
            return;
        }
        int n2 = 1;
        while (iu2.n(cmz2.c(n2)).t() == this) {
            ++n2;
        }
        if (n2 >= 3) {
            return;
        }
        int n3 = (Integer)dbk2.b(a);
        if (n3 == 15) {
            iu2.a(cmz3, this.s());
            dbk dbk3 = dbk2.a(a, Integer.valueOf(0));
            iu2.a(cmz2, dbk3, 4);
            dbk3.a(iu2, cmz3, this);
        } else {
            iu2.a(cmz2, dbk2.a(a, Integer.valueOf(n3 + 1)), 4);
        }
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        return b;
    }

    @Override
    public cxt c(dbk dbk2, iu iu2, cmz cmz2) {
        return c.a(cmz2);
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        if (super.a(iu2, cmz2)) {
            return this.b(iu2, cmz2);
        }
        return false;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (!this.b(iu2, cmz2)) {
            iu2.b(cmz2, true);
        }
    }

    public boolean b(iu iu2, cmz cmz2) {
        for (bqk bqk2 : afj.a) {
            ahk ahk2 = iu2.n(cmz2.c(bqk2)).a();
            if (!ahk2.a() && ahk2 != ahk.i) continue;
            return false;
        }
        bfa bfa2 = iu2.n(cmz2.h()).t();
        return bfa2 == blg.aK || bfa2 == blg.m && !iu2.n(cmz2.g()).a().d();
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, cpk cpk2) {
        cpk2.a(ahy.i, 1.0f);
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

