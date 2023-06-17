/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cez
extends cli
implements btz {
    public static final qf a = qf.a("age", 0, 2);
    protected static final cxt[] b = new cxt[]{new cxt(0.6875, 0.4375, 0.375, 0.9375, 0.75, 0.625), new cxt(0.5625, 0.3125, 0.3125, 0.9375, 0.75, 0.6875), new cxt(0.5625, 0.3125, 0.3125, 0.9375, 0.75, 0.6875)};
    protected static final cxt[] c = new cxt[]{new cxt(0.0625, 0.4375, 0.375, 0.3125, 0.75, 0.625), new cxt(0.0625, 0.3125, 0.3125, 0.4375, 0.75, 0.6875), new cxt(0.0625, 0.3125, 0.3125, 0.4375, 0.75, 0.6875)};
    protected static final cxt[] d = new cxt[]{new cxt(0.375, 0.4375, 0.0625, 0.625, 0.75, 0.3125), new cxt(0.3125, 0.3125, 0.0625, 0.6875, 0.75, 0.4375), new cxt(0.3125, 0.3125, 0.0625, 0.6875, 0.75, 0.4375)};
    protected static final cxt[] e = new cxt[]{new cxt(0.375, 0.4375, 0.6875, 0.625, 0.75, 0.9375), new cxt(0.3125, 0.3125, 0.5625, 0.6875, 0.75, 0.9375), new cxt(0.3125, 0.3125, 0.5625, 0.6875, 0.75, 0.9375)};

    public cez() {
        super(ahk.k);
        this.D(this.O.b().a(j, (Comparable)((Object)bqk.c)).a(a, Integer.valueOf(0)));
        this.b(true);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        int n2;
        if (!this.e(iu2, cmz2, dbk2)) {
            this.f(iu2, cmz2, dbk2);
        } else if (iu2.p.nextInt(5) == 0 && (n2 = ((Integer)dbk2.b(a)).intValue()) < 2) {
            iu2.a(cmz2, dbk2.a(a, Integer.valueOf(n2 + 1)), 2);
        }
    }

    public boolean e(iu iu2, cmz cmz2, dbk dbk2) {
        dbk dbk3 = iu2.n(cmz2 = cmz2.c((bqk)((Object)dbk2.b(j))));
        return dbk3.t() == blg.r && dbk3.b(ff.a) == zg.d;
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
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        int n2 = (Integer)dbk2.b(a);
        switch ((bqk)((Object)dbk2.b(j))) {
            case d: {
                return e[n2];
            }
            default: {
                return d[n2];
            }
            case e: {
                return c[n2];
            }
            case f: 
        }
        return b[n2];
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        return dbk2.a(j, (Comparable)((Object)ih2.a((bqk)((Object)dbk2.b(j)))));
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        return dbk2.a(cdk2.a((bqk)((Object)dbk2.b(j))));
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bga bga2, bhl bhl2) {
        bqk bqk2 = bqk.a(bga2.ba);
        iu2.a(cmz2, dbk2.a(j, (Comparable)((Object)bqk2)), 2);
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        if (!bqk2.l().d()) {
            bqk2 = bqk.c;
        }
        return this.s().a(j, (Comparable)((Object)bqk2.e())).a(a, Integer.valueOf(0));
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (!this.e(iu2, cmz2, dbk2)) {
            this.f(iu2, cmz2, dbk2);
        }
    }

    private void f(iu iu2, cmz cmz2, dbk dbk2) {
        iu2.a(cmz2, blg.a.s(), 3);
        this.b(iu2, cmz2, dbk2, 0);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, float f2, int n2) {
        int n3 = (Integer)dbk2.b(a);
        int n4 = 1;
        if (n3 >= 2) {
            n4 = 3;
        }
        for (int i2 = 0; i2 < n4; ++i2) {
            cez.a(iu2, cmz2, new bhl(hp.bd, 1, dck.m.c()));
        }
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(hp.bd, 1, dck.m.c());
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, boolean bl2) {
        return (Integer)dbk2.b(a) < 2;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2, dbk dbk2) {
        return true;
    }

    @Override
    public void b(iu iu2, Random random, cmz cmz2, dbk dbk2) {
        iu2.a(cmz2, dbk2.a(a, Integer.valueOf((Integer)dbk2.b(a) + 1)), 2);
    }

    @Override
    public kj b() {
        return kj.c;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(j, (Comparable)((Object)bqk.b(n2))).a(a, Integer.valueOf((n2 & 0xF) >> 2));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((bqk)((Object)dbk2.b(j))).c();
        return n2 |= (Integer)dbk2.b(a) << 2;
    }

    @Override
    protected bkp a() {
        return new bkp(this, j, a);
    }
}

