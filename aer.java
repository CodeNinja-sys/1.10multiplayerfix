/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class aer
extends ar {
    public static final yc a = cli.j;
    private final boolean b;
    private static boolean c;

    protected aer(boolean bl2) {
        super(ahk.e);
        this.D(this.O.b().a(a, (Comparable)((Object)bqk.c)));
        this.b = bl2;
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return azg.a(blg.al);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        this.e(iu2, cmz2, dbk2);
    }

    private void e(iu iu2, cmz cmz2, dbk dbk2) {
        if (iu2.C) {
            return;
        }
        dbk dbk3 = iu2.n(cmz2.i());
        dbk dbk4 = iu2.n(cmz2.j());
        dbk dbk5 = iu2.n(cmz2.k());
        dbk dbk6 = iu2.n(cmz2.l());
        bqk bqk2 = (bqk)((Object)dbk2.b(a));
        if (bqk2 == bqk.c && dbk3.b() && !dbk4.b()) {
            bqk2 = bqk.d;
        } else if (bqk2 == bqk.d && dbk4.b() && !dbk3.b()) {
            bqk2 = bqk.c;
        } else if (bqk2 == bqk.e && dbk5.b() && !dbk6.b()) {
            bqk2 = bqk.f;
        } else if (bqk2 == bqk.f && dbk6.b() && !dbk5.b()) {
            bqk2 = bqk.e;
        }
        iu2.a(cmz2, dbk2.a(a, (Comparable)((Object)bqk2)), 2);
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        if (!this.b) {
            return;
        }
        bqk bqk2 = (bqk)((Object)dbk2.b(a));
        double d2 = (double)cmz2.a() + 0.5;
        double d3 = (double)cmz2.b() + random.nextDouble() * 6.0 / 16.0;
        double d4 = (double)cmz2.c() + 0.5;
        double d5 = 0.52;
        double d6 = random.nextDouble() * 0.6 - 0.3;
        if (random.nextDouble() < 0.1) {
            iu2.a((double)cmz2.a() + 0.5, (double)cmz2.b(), (double)cmz2.c() + 0.5, dah.bz, csg.e, 1.0f, 1.0f, false);
        }
        switch (bqk2) {
            case e: {
                iu2.a(lz.l, d2 - 0.52, d3, d4 + d6, 0.0, 0.0, 0.0, new int[0]);
                iu2.a(lz.A, d2 - 0.52, d3, d4 + d6, 0.0, 0.0, 0.0, new int[0]);
                break;
            }
            case f: {
                iu2.a(lz.l, d2 + 0.52, d3, d4 + d6, 0.0, 0.0, 0.0, new int[0]);
                iu2.a(lz.A, d2 + 0.52, d3, d4 + d6, 0.0, 0.0, 0.0, new int[0]);
                break;
            }
            case c: {
                iu2.a(lz.l, d2 + d6, d3, d4 - 0.52, 0.0, 0.0, 0.0, new int[0]);
                iu2.a(lz.A, d2 + d6, d3, d4 - 0.52, 0.0, 0.0, 0.0, new int[0]);
                break;
            }
            case d: {
                iu2.a(lz.l, d2 + d6, d3, d4 + 0.52, 0.0, 0.0, 0.0, new int[0]);
                iu2.a(lz.A, d2 + d6, d3, d4 + 0.52, 0.0, 0.0, 0.0, new int[0]);
            }
        }
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (iu2.C) {
            return true;
        }
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof bop) {
            bdl2.a((bop)bql2);
            bdl2.a(bpv.aa);
        }
        return true;
    }

    public static void a(boolean bl2, iu iu2, cmz cmz2) {
        dbk dbk2 = iu2.n(cmz2);
        bql bql2 = iu2.q(cmz2);
        c = true;
        if (bl2) {
            iu2.a(cmz2, blg.am.s().a(a, dbk2.b(a)), 3);
            iu2.a(cmz2, blg.am.s().a(a, dbk2.b(a)), 3);
        } else {
            iu2.a(cmz2, blg.al.s().a(a, dbk2.b(a)), 3);
            iu2.a(cmz2, blg.al.s().a(a, dbk2.b(a)), 3);
        }
        c = false;
        if (bql2 != null) {
            bql2.f_();
            iu2.a(cmz2, bql2);
        }
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new bop();
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        return this.s().a(a, (Comparable)((Object)bga2.B_().e()));
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bga bga2, bhl bhl2) {
        bql bql2;
        iu2.a(cmz2, dbk2.a(a, (Comparable)((Object)bga2.B_().e())), 2);
        if (bhl2.s() && (bql2 = iu2.q(cmz2)) instanceof bop) {
            ((bop)bql2).a(bhl2.q());
        }
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        bql bql2;
        if (!c && (bql2 = iu2.q(cmz2)) instanceof bop) {
            ckw.a(iu2, cmz2, (tb)((bop)bql2));
            iu2.f(cmz2, this);
        }
        super.b(iu2, cmz2, dbk2);
    }

    @Override
    public boolean h(dbk dbk2) {
        return true;
    }

    @Override
    public int a(dbk dbk2, iu iu2, cmz cmz2) {
        return apq.a(iu2.q(cmz2));
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(blg.al);
    }

    @Override
    public cpb g(dbk dbk2) {
        return cpb.d;
    }

    @Override
    public dbk a(int n2) {
        bqk bqk2 = bqk.a(n2);
        if (bqk2.l() == ctv.b) {
            bqk2 = bqk.c;
        }
        return this.s().a(a, (Comparable)((Object)bqk2));
    }

    @Override
    public int e(dbk dbk2) {
        return ((bqk)((Object)dbk2.b(a))).b();
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        return dbk2.a(a, (Comparable)((Object)ih2.a((bqk)((Object)dbk2.b(a)))));
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        return dbk2.a(cdk2.a((bqk)((Object)dbk2.b(a))));
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

