/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cux
extends lp
implements btz {
    public static final qf a = qf.a("age", 0, 7);
    public static final yc c = vl.a;
    private final bfa e;
    protected static final cxt[] d = new cxt[]{new cxt(0.375, 0.0, 0.375, 0.625, 0.125, 0.625), new cxt(0.375, 0.0, 0.375, 0.625, 0.25, 0.625), new cxt(0.375, 0.0, 0.375, 0.625, 0.375, 0.625), new cxt(0.375, 0.0, 0.375, 0.625, 0.5, 0.625), new cxt(0.375, 0.0, 0.375, 0.625, 0.625, 0.625), new cxt(0.375, 0.0, 0.375, 0.625, 0.75, 0.625), new cxt(0.375, 0.0, 0.375, 0.625, 0.875, 0.625), new cxt(0.375, 0.0, 0.375, 0.625, 1.0, 0.625)};

    protected cux(bfa bfa2) {
        this.D(this.O.b().a(a, Integer.valueOf(0)).a(c, (Comparable)((Object)bqk.b)));
        this.e = bfa2;
        this.b(true);
        this.a((zm)null);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return d[(Integer)dbk2.b(a)];
    }

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        int n2 = (Integer)dbk2.b(a);
        dbk2 = dbk2.a(c, (Comparable)((Object)bqk.b));
        for (bqk bqk2 : afj.a) {
            if (bnj2.n(cmz2.c(bqk2)).t() != this.e || n2 != 7) continue;
            dbk2 = dbk2.a(c, (Comparable)((Object)bqk2));
            break;
        }
        return dbk2;
    }

    @Override
    protected boolean m(dbk dbk2) {
        return dbk2.t() == blg.ak;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        super.a(iu2, cmz2, dbk2, random);
        if (iu2.j(cmz2.g()) < 9) {
            return;
        }
        float f2 = kd.a(this, iu2, cmz2);
        if (random.nextInt((int)(25.0f / f2) + 1) == 0) {
            int n2 = (Integer)dbk2.b(a);
            if (n2 < 7) {
                dbk2 = dbk2.a(a, Integer.valueOf(n2 + 1));
                iu2.a(cmz2, dbk2, 2);
            } else {
                for (bqk bqk2 : afj.a) {
                    if (iu2.n(cmz2.c(bqk2)).t() != this.e) continue;
                    return;
                }
                cmz2 = cmz2.c(afj.a.a(random));
                bfa bfa2 = iu2.n(cmz2.h()).t();
                if (iu2.n((cmz)cmz2).t().L == ahk.a && (bfa2 == blg.ak || bfa2 == blg.d || bfa2 == blg.c)) {
                    iu2.a(cmz2, this.e.s());
                }
            }
        }
    }

    public void g(iu iu2, cmz cmz2, dbk dbk2) {
        int n2 = (Integer)dbk2.b(a) + cmk.a(iu2.p, 2, 5);
        iu2.a(cmz2, dbk2.a(a, Integer.valueOf(Math.min(7, n2))), 2);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, float f2, int n2) {
        super.a(iu2, cmz2, dbk2, f2, n2);
        if (iu2.C) {
            return;
        }
        azg azg2 = this.h();
        if (azg2 == null) {
            return;
        }
        int n3 = (Integer)dbk2.b(a);
        for (int i2 = 0; i2 < 3; ++i2) {
            if (iu2.p.nextInt(15) > n3) continue;
            cux.a(iu2, cmz2, new bhl(azg2));
        }
    }

    protected azg h() {
        if (this.e == blg.aU) {
            return hp.bn;
        }
        if (this.e == blg.bk) {
            return hp.bo;
        }
        return null;
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return null;
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        azg azg2 = this.h();
        return azg2 == null ? null : new bhl(azg2);
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, boolean bl2) {
        return (Integer)dbk2.b(a) != 7;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2, dbk dbk2) {
        return true;
    }

    @Override
    public void b(iu iu2, Random random, cmz cmz2, dbk dbk2) {
        this.g(iu2, cmz2, dbk2);
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
        return new bkp(this, a, c);
    }
}

