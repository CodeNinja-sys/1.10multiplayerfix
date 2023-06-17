/*
 * Decompiled with CFR 0.150.
 */
public class bty
extends cli {
    public static final ddi a = ddi.b("open");
    public static final ddi b = ddi.b("powered");
    public static final ddi c = ddi.b("in_wall");
    protected static final cxt d = new cxt(0.0, 0.0, 0.375, 1.0, 1.0, 0.625);
    protected static final cxt e = new cxt(0.375, 0.0, 0.0, 0.625, 1.0, 1.0);
    protected static final cxt f = new cxt(0.0, 0.0, 0.375, 1.0, 0.8125, 0.625);
    protected static final cxt g = new cxt(0.375, 0.0, 0.0, 0.625, 0.8125, 1.0);
    protected static final cxt h = new cxt(0.0, 0.0, 0.375, 1.0, 1.5, 0.625);
    protected static final cxt i = new cxt(0.375, 0.0, 0.0, 0.625, 1.5, 1.0);

    public bty(zg zg2) {
        super(ahk.d, zg2.c());
        this.D(this.O.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
        this.a(zm.d);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        if (((Boolean)(dbk2 = this.b(dbk2, bnj2, cmz2)).b(c)).booleanValue()) {
            return ((bqk)((Object)dbk2.b(j))).l() == ctv.a ? g : f;
        }
        return ((bqk)((Object)dbk2.b(j))).l() == ctv.a ? e : d;
    }

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        ctv ctv2 = ((bqk)((Object)dbk2.b(j))).l();
        if (ctv2 == ctv.c && (bnj2.n(cmz2.k()).t() == blg.bZ || bnj2.n(cmz2.l()).t() == blg.bZ) || ctv2 == ctv.a && (bnj2.n(cmz2.i()).t() == blg.bZ || bnj2.n(cmz2.j()).t() == blg.bZ)) {
            dbk2 = dbk2.a(c, Boolean.valueOf(true));
        }
        return dbk2;
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
    public boolean a(iu iu2, cmz cmz2) {
        if (iu2.n(cmz2.h()).a().a()) {
            return super.a(iu2, cmz2);
        }
        return false;
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        if (((Boolean)dbk2.b(a)).booleanValue()) {
            return y;
        }
        return ((bqk)((Object)dbk2.b(j))).l() == ctv.c ? h : i;
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
    public boolean a(bnj bnj2, cmz cmz2) {
        return (Boolean)bnj2.n(cmz2).b(a);
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        return this.s().a(j, (Comparable)((Object)bga2.B_())).a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false));
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (((Boolean)dbk2.b(a)).booleanValue()) {
            dbk2 = dbk2.a(a, Boolean.valueOf(false));
            iu2.a(cmz2, dbk2, 10);
        } else {
            bqk bqk3 = bqk.a(bdl2.ba);
            if (dbk2.b(j) == bqk3.e()) {
                dbk2 = dbk2.a(j, (Comparable)((Object)bqk3));
            }
            dbk2 = dbk2.a(a, Boolean.valueOf(true));
            iu2.a(cmz2, dbk2, 10);
        }
        iu2.a(bdl2, (Boolean)dbk2.b(a) != false ? 1008 : 1014, cmz2, 0);
        return true;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (iu2.C) {
            return;
        }
        boolean bl2 = iu2.x(cmz2);
        if (bl2 || bfa2.s().m()) {
            if (bl2 && !((Boolean)dbk2.b(a)).booleanValue() && !((Boolean)dbk2.b(b)).booleanValue()) {
                iu2.a(cmz2, dbk2.a(a, Boolean.valueOf(true)).a(b, Boolean.valueOf(true)), 2);
                iu2.a(null, 1008, cmz2, 0);
            } else if (!bl2 && ((Boolean)dbk2.b(a)).booleanValue() && ((Boolean)dbk2.b(b)).booleanValue()) {
                iu2.a(cmz2, dbk2.a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)), 2);
                iu2.a(null, 1014, cmz2, 0);
            } else if (bl2 != (Boolean)dbk2.b(b)) {
                iu2.a(cmz2, dbk2.a(b, Boolean.valueOf(bl2)), 2);
            }
        }
    }

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        return true;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(j, (Comparable)((Object)bqk.b(n2))).a(a, Boolean.valueOf((n2 & 4) != 0)).a(b, Boolean.valueOf((n2 & 8) != 0));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((bqk)((Object)dbk2.b(j))).c();
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            n2 |= 8;
        }
        if (((Boolean)dbk2.b(a)).booleanValue()) {
            n2 |= 4;
        }
        return n2;
    }

    @Override
    protected bkp a() {
        return new bkp(this, j, a, b, c);
    }
}

