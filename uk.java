/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class uk
extends bfa {
    public static final ddi a = ddi.b("powered");
    public static final ddi b = ddi.b("attached");
    public static final ddi c = ddi.b("disarmed");
    public static final ddi d = ddi.b("north");
    public static final ddi e = ddi.b("east");
    public static final ddi f = ddi.b("south");
    public static final ddi g = ddi.b("west");
    protected static final cxt h = new cxt(0.0, 0.0625, 0.0, 1.0, 0.15625, 1.0);
    protected static final cxt i = new cxt(0.0, 0.0, 0.0, 1.0, 0.5, 1.0);

    public uk() {
        super(ahk.q);
        this.D(this.O.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)).a(g, Boolean.valueOf(false)));
        this.b(true);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        if (!((Boolean)dbk2.b(b)).booleanValue()) {
            return i;
        }
        return h;
    }

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        return dbk2.a(d, Boolean.valueOf(uk.a(bnj2, cmz2, dbk2, bqk.c))).a(e, Boolean.valueOf(uk.a(bnj2, cmz2, dbk2, bqk.f))).a(f, Boolean.valueOf(uk.a(bnj2, cmz2, dbk2, bqk.d))).a(g, Boolean.valueOf(uk.a(bnj2, cmz2, dbk2, bqk.e)));
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        return y;
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
    public kj b() {
        return kj.d;
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return hp.H;
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(hp.H);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        iu2.a(cmz2, dbk2, 3);
        this.e(iu2, cmz2, dbk2);
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        this.e(iu2, cmz2, dbk2.a(a, Boolean.valueOf(true)));
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2) {
        if (iu2.C) {
            return;
        }
        if (bdl2.bt() != null && bdl2.bt().a() == hp.bl) {
            iu2.a(cmz2, dbk2.a(c, Boolean.valueOf(true)), 4);
        }
    }

    private void e(iu iu2, cmz cmz2, dbk dbk2) {
        block0: for (bqk bqk2 : new bqk[]{bqk.d, bqk.e}) {
            for (int i2 = 1; i2 < 42; ++i2) {
                cmz cmz3 = cmz2.c(bqk2, i2);
                dbk dbk3 = iu2.n(cmz3);
                if (dbk3.t() == blg.bR) {
                    if (dbk3.b(cr.a) != bqk2.e()) continue block0;
                    blg.bR.a(iu2, cmz3, dbk3, false, true, i2, dbk2);
                    continue block0;
                }
                if (dbk3.t() != blg.bS) continue block0;
            }
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, cpk cpk2) {
        if (iu2.C) {
            return;
        }
        if (((Boolean)dbk2.b(a)).booleanValue()) {
            return;
        }
        this.c(iu2, cmz2);
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2, Random random) {
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (iu2.C) {
            return;
        }
        if (!((Boolean)iu2.n(cmz2).b(a)).booleanValue()) {
            return;
        }
        this.c(iu2, cmz2);
    }

    private void c(iu iu2, cmz cmz2) {
        dbk dbk2 = iu2.n(cmz2);
        boolean bl2 = (Boolean)dbk2.b(a);
        boolean bl3 = false;
        List list = iu2.b(null, dbk2.c((bnj)iu2, cmz2).a(cmz2));
        if (!list.isEmpty()) {
            for (cpk cpk2 : list) {
                if (cpk2.au_()) continue;
                bl3 = true;
                break;
            }
        }
        if (bl3 != bl2) {
            dbk2 = dbk2.a(a, Boolean.valueOf(bl3));
            iu2.a(cmz2, dbk2, 3);
            this.e(iu2, cmz2, dbk2);
        }
        if (bl3) {
            iu2.a(new cmz(cmz2), (bfa)this, this.a(iu2));
        }
    }

    public static boolean a(bnj bnj2, cmz cmz2, dbk dbk2, bqk bqk2) {
        cmz cmz3 = cmz2.c(bqk2);
        dbk dbk3 = bnj2.n(cmz3);
        bfa bfa2 = dbk3.t();
        if (bfa2 == blg.bR) {
            bqk bqk3 = bqk2.e();
            return dbk3.b(cr.a) == bqk3;
        }
        return bfa2 == blg.bS;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, Boolean.valueOf((n2 & 1) > 0)).a(b, Boolean.valueOf((n2 & 4) > 0)).a(c, Boolean.valueOf((n2 & 8) > 0));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        if (((Boolean)dbk2.b(a)).booleanValue()) {
            n2 |= 1;
        }
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            n2 |= 4;
        }
        if (((Boolean)dbk2.b(c)).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        switch (ih2) {
            case c: {
                return dbk2.a(d, dbk2.b(f)).a(e, dbk2.b(g)).a(f, dbk2.b(d)).a(g, dbk2.b(e));
            }
            case d: {
                return dbk2.a(d, dbk2.b(e)).a(e, dbk2.b(f)).a(f, dbk2.b(g)).a(g, dbk2.b(d));
            }
            case b: {
                return dbk2.a(d, dbk2.b(g)).a(e, dbk2.b(d)).a(f, dbk2.b(e)).a(g, dbk2.b(f));
            }
        }
        return dbk2;
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        switch (cdk2) {
            case b: {
                return dbk2.a(d, dbk2.b(f)).a(f, dbk2.b(d));
            }
            case c: {
                return dbk2.a(e, dbk2.b(g)).a(g, dbk2.b(e));
            }
        }
        return super.a(dbk2, cdk2);
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b, c, d, e, g, f);
    }
}

