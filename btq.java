/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class btq
extends bfa {
    public static final qf a = qf.a("layers", 1, 8);
    protected static final cxt[] b = new cxt[]{new cxt(0.0, 0.0, 0.0, 1.0, 0.0, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.125, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.25, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.375, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.5, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.625, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.75, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.875, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)};

    protected btq() {
        super(ahk.y);
        this.D(this.O.b().a(a, Integer.valueOf(1)));
        this.b(true);
        this.a(zm.c);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return b[(Integer)dbk2.b(a)];
    }

    @Override
    public boolean a(bnj bnj2, cmz cmz2) {
        return (Integer)bnj2.n(cmz2).b(a) < 5;
    }

    @Override
    public boolean f(dbk dbk2) {
        return (Integer)dbk2.b(a) == 7;
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        int n2 = (Integer)dbk2.b(a) - 1;
        float f2 = 0.125f;
        cxt cxt2 = dbk2.c((bnj)iu2, cmz2);
        return new cxt(cxt2.a, cxt2.b, cxt2.c, cxt2.d, (float)n2 * 0.125f, cxt2.f);
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
    public boolean a(iu iu2, cmz cmz2) {
        dbk dbk2 = iu2.n(cmz2.h());
        bfa bfa2 = dbk2.t();
        if (bfa2 == blg.aI || bfa2 == blg.cB) {
            return false;
        }
        if (dbk2.a() == ahk.j) {
            return true;
        }
        if (bfa2 == this && (Integer)dbk2.b(a) >= 7) {
            return true;
        }
        return dbk2.p() && dbk2.a().c();
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        this.e(iu2, cmz2, dbk2);
    }

    private boolean e(iu iu2, cmz cmz2, dbk dbk2) {
        if (!this.a(iu2, cmz2)) {
            this.b(iu2, cmz2, dbk2, 0);
            iu2.f(cmz2);
            return false;
        }
        return true;
    }

    @Override
    public void a(iu iu2, bdl bdl2, cmz cmz2, dbk dbk2, bql bql2, bhl bhl2) {
        btq.a(iu2, cmz2, new bhl(hp.aF, (Integer)dbk2.b(a) + 1, 0));
        iu2.f(cmz2);
        bdl2.a(bpv.a(this));
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return hp.aF;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (iu2.b(bzq.b, cmz2) > 11) {
            this.b(iu2, cmz2, iu2.n(cmz2), 0);
            iu2.f(cmz2);
        }
    }

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (bqk2 == bqk.b) {
            return true;
        }
        dbk dbk3 = bnj2.n(cmz2.c(bqk2));
        if (dbk3.t() == this && (Integer)dbk3.b(a) >= (Integer)dbk2.b(a)) {
            return true;
        }
        return super.a(dbk2, bnj2, cmz2, bqk2);
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, Integer.valueOf((n2 & 7) + 1));
    }

    @Override
    public boolean a_(bnj bnj2, cmz cmz2) {
        return (Integer)bnj2.n(cmz2).b(a) == 1;
    }

    @Override
    public int e(dbk dbk2) {
        return (Integer)dbk2.b(a) - 1;
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

