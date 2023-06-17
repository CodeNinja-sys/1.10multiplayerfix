/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class dgf
extends bfa {
    public static final qf a = qf.a("moisture", 0, 7);
    protected static final cxt b = new cxt(0.0, 0.0, 0.0, 1.0, 0.9375, 1.0);

    protected dgf() {
        super(ahk.c);
        this.D(this.O.b().a(a, Integer.valueOf(0)));
        this.b(true);
        this.h(255);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return b;
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        return x;
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
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        int n2 = (Integer)dbk2.b(a);
        if (this.d(iu2, cmz2) || iu2.A(cmz2.g())) {
            if (n2 < 7) {
                iu2.a(cmz2, dbk2.a(a, Integer.valueOf(7)), 2);
            }
        } else if (n2 > 0) {
            iu2.a(cmz2, dbk2.a(a, Integer.valueOf(n2 - 1)), 2);
        } else if (!this.c(iu2, cmz2)) {
            iu2.a(cmz2, blg.d.s());
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, cpk cpk2, float f2) {
        if (!iu2.C && iu2.p.nextFloat() < f2 - 0.5f && cpk2 instanceof bga && (cpk2 instanceof bdl || iu2.F().b("mobGriefing")) && cpk2.bl * cpk2.bl * cpk2.bm > 0.512f) {
            iu2.a(cmz2, blg.d.s());
        }
        super.a(iu2, cmz2, cpk2, f2);
    }

    private boolean c(iu iu2, cmz cmz2) {
        bfa bfa2 = iu2.n(cmz2.g()).t();
        return bfa2 instanceof kd || bfa2 instanceof cux;
    }

    private boolean d(iu iu2, cmz cmz2) {
        for (pj pj2 : cmz.b(cmz2.e(-4, 0, -4), cmz2.e(4, 1, 4))) {
            if (iu2.n(pj2).a() != ahk.h) continue;
            return true;
        }
        return false;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        super.a(dbk2, iu2, cmz2, bfa2);
        if (iu2.n(cmz2.g()).a().a()) {
            iu2.a(cmz2, blg.d.s());
        }
    }

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        switch (bqk2) {
            case b: {
                return true;
            }
            case c: 
            case d: 
            case e: 
            case f: {
                dbk dbk3 = bnj2.n(cmz2.c(bqk2));
                bfa bfa2 = dbk3.t();
                return !dbk3.p() && bfa2 != blg.ak && bfa2 != blg.da;
            }
        }
        return super.a(dbk2, bnj2, cmz2, bqk2);
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return blg.d.a(blg.d.s().a(bwt.a, (Comparable)((Object)dgu.a)), random, n2);
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(blg.d);
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, Integer.valueOf(n2 & 7));
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

