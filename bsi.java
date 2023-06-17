/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bsi
extends bfa {
    public static final qf a = qf.a("bites", 0, 6);
    protected static final cxt[] b = new cxt[]{new cxt(0.0625, 0.0, 0.0625, 0.9375, 0.5, 0.9375), new cxt(0.1875, 0.0, 0.0625, 0.9375, 0.5, 0.9375), new cxt(0.3125, 0.0, 0.0625, 0.9375, 0.5, 0.9375), new cxt(0.4375, 0.0, 0.0625, 0.9375, 0.5, 0.9375), new cxt(0.5625, 0.0, 0.0625, 0.9375, 0.5, 0.9375), new cxt(0.6875, 0.0, 0.0625, 0.9375, 0.5, 0.9375), new cxt(0.8125, 0.0, 0.0625, 0.9375, 0.5, 0.9375)};

    protected bsi() {
        super(ahk.F);
        this.D(this.O.b().a(a, Integer.valueOf(0)));
        this.b(true);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return b[(Integer)dbk2.b(a)];
    }

    @Override
    public cxt c(dbk dbk2, iu iu2, cmz cmz2) {
        return dbk2.d(iu2, cmz2);
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
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        this.b(iu2, cmz2, dbk2, bdl2);
        return true;
    }

    private void b(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2) {
        if (!bdl2.d(false)) {
            return;
        }
        bdl2.a(bpv.J);
        bdl2.aE().a(2, 0.1f);
        int n2 = (Integer)dbk2.b(a);
        if (n2 < 6) {
            iu2.a(cmz2, dbk2.a(a, Integer.valueOf(n2 + 1)), 3);
        } else {
            iu2.f(cmz2);
        }
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        if (super.a(iu2, cmz2)) {
            return this.c(iu2, cmz2);
        }
        return false;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (!this.c(iu2, cmz2)) {
            iu2.f(cmz2);
        }
    }

    private boolean c(iu iu2, cmz cmz2) {
        return iu2.n(cmz2.h()).a().a();
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return null;
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(hp.bg);
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

    @Override
    public int a(dbk dbk2, iu iu2, cmz cmz2) {
        return (7 - (Integer)dbk2.b(a)) * 2;
    }

    @Override
    public boolean h(dbk dbk2) {
        return true;
    }
}

