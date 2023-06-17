/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class aqb
extends lp {
    public static final qf a = qf.a("age", 0, 3);
    private static final cxt[] c = new cxt[]{new cxt(0.0, 0.0, 0.0, 1.0, 0.3125, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.5, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.6875, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.875, 1.0)};

    protected aqb() {
        super(ahk.k, bif.D);
        this.D(this.O.b().a(a, Integer.valueOf(0)));
        this.b(true);
        this.a((zm)null);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return c[(Integer)dbk2.b(a)];
    }

    @Override
    protected boolean m(dbk dbk2) {
        return dbk2.t() == blg.aW;
    }

    @Override
    public boolean e(iu iu2, cmz cmz2, dbk dbk2) {
        return this.m(iu2.n(cmz2.h()));
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        int n2 = (Integer)dbk2.b(a);
        if (n2 < 3 && random.nextInt(10) == 0) {
            dbk2 = dbk2.a(a, Integer.valueOf(n2 + 1));
            iu2.a(cmz2, dbk2, 2);
        }
        super.a(iu2, cmz2, dbk2, random);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, float f2, int n2) {
        if (iu2.C) {
            return;
        }
        int n3 = 1;
        if ((Integer)dbk2.b(a) >= 3) {
            n3 = 2 + iu2.p.nextInt(3);
            if (n2 > 0) {
                n3 += iu2.p.nextInt(n2 + 1);
            }
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            aqb.a(iu2, cmz2, new bhl(hp.bF));
        }
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(hp.bF);
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

