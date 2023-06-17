/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class ln
extends ajj {
    public static final byc a = byc.a("type", cu.class);
    public static final ddi b = ddi.b("short");
    protected static final cxt c = new cxt(0.75, 0.0, 0.0, 1.0, 1.0, 1.0);
    protected static final cxt d = new cxt(0.0, 0.0, 0.0, 0.25, 1.0, 1.0);
    protected static final cxt e = new cxt(0.0, 0.0, 0.75, 1.0, 1.0, 1.0);
    protected static final cxt f = new cxt(0.0, 0.0, 0.0, 1.0, 1.0, 0.25);
    protected static final cxt g = new cxt(0.0, 0.75, 0.0, 1.0, 1.0, 1.0);
    protected static final cxt h = new cxt(0.0, 0.0, 0.0, 1.0, 0.25, 1.0);
    protected static final cxt i = new cxt(0.375, -0.25, 0.375, 0.625, 0.75, 0.625);
    protected static final cxt j = new cxt(0.375, 0.25, 0.375, 0.625, 1.25, 0.625);
    protected static final cxt k = new cxt(0.375, 0.375, -0.25, 0.625, 0.625, 0.75);
    protected static final cxt l = new cxt(0.375, 0.375, 0.25, 0.625, 0.625, 1.25);
    protected static final cxt m = new cxt(-0.25, 0.375, 0.375, 0.75, 0.625, 0.625);
    protected static final cxt n = new cxt(0.25, 0.375, 0.375, 1.25, 0.625, 0.625);

    public ln() {
        super(ahk.H);
        this.D(this.O.b().a(o, (Comparable)((Object)bqk.c)).a(a, (Comparable)((Object)cu.a)).a(b, Boolean.valueOf(false)));
        this.a(acv.d);
        this.c(0.5f);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        switch ((bqk)((Object)dbk2.b(o))) {
            default: {
                return h;
            }
            case b: {
                return g;
            }
            case c: {
                return f;
            }
            case d: {
                return e;
            }
            case e: {
                return d;
            }
            case f: 
        }
        return c;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, cxt cxt2, List list, cpk cpk2) {
        ln.a(cmz2, cxt2, list, dbk2.c((bnj)iu2, cmz2));
        ln.a(cmz2, cxt2, list, this.m(dbk2));
    }

    private cxt m(dbk dbk2) {
        switch ((bqk)((Object)dbk2.b(o))) {
            default: {
                return j;
            }
            case b: {
                return i;
            }
            case c: {
                return l;
            }
            case d: {
                return k;
            }
            case e: {
                return n;
            }
            case f: 
        }
        return m;
    }

    @Override
    public boolean f(dbk dbk2) {
        return dbk2.b(o) == bqk.b;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2) {
        cmz cmz3;
        bfa bfa2;
        if (bdl2.G.d && ((bfa2 = iu2.n(cmz3 = cmz2.c(((bqk)((Object)dbk2.b(o))).e())).t()) == blg.J || bfa2 == blg.F)) {
            iu2.f(cmz3);
        }
        super.a(iu2, cmz2, dbk2, bdl2);
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        super.b(iu2, cmz2, dbk2);
        bqk bqk2 = ((bqk)((Object)dbk2.b(o))).e();
        cmz2 = cmz2.c(bqk2);
        dbk dbk3 = iu2.n(cmz2);
        if ((dbk3.t() == blg.J || dbk3.t() == blg.F) && ((Boolean)dbk3.b(ath.a)).booleanValue()) {
            dbk3.t().b(iu2, cmz2, dbk3, 0);
            iu2.f(cmz2);
        }
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
        return false;
    }

    @Override
    public boolean a_(iu iu2, cmz cmz2, bqk bqk2) {
        return false;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        bqk bqk2 = (bqk)((Object)dbk2.b(o));
        cmz cmz3 = cmz2.c(bqk2.e());
        dbk dbk3 = iu2.n(cmz3);
        if (dbk3.t() == blg.J || dbk3.t() == blg.F) {
            dbk3.a(iu2, cmz3, bfa2);
        } else {
            iu2.f(cmz2);
        }
    }

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        return true;
    }

    public static bqk b(int n2) {
        int n3 = n2 & 7;
        if (n3 > 5) {
            return null;
        }
        return bqk.a(n3);
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(dbk2.b(a) == cu.b ? blg.F : blg.J);
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(o, (Comparable)((Object)ln.b(n2))).a(a, (Comparable)((Object)((n2 & 8) > 0 ? cu.b : cu.a)));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((bqk)((Object)dbk2.b(o))).b();
        if (dbk2.b(a) == cu.b) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        return dbk2.a(o, (Comparable)((Object)ih2.a((bqk)((Object)dbk2.b(o)))));
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        return dbk2.a(cdk2.a((bqk)((Object)dbk2.b(o))));
    }

    @Override
    protected bkp a() {
        return new bkp(this, o, a, b);
    }
}

