/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class pk
extends ar {
    public static final yc a = ln.o;
    public static final byc b = ln.a;

    public pk() {
        super(ahk.H);
        this.D(this.O.b().a(a, (Comparable)((Object)bqk.c)).a(b, (Comparable)((Object)cu.a)));
        this.c(-1.0f);
    }

    @Override
    public bql a(iu iu2, int n2) {
        return null;
    }

    public static bql a(dbk dbk2, bqk bqk2, boolean bl2, boolean bl3) {
        return new csv(dbk2, bqk2, bl2, bl3);
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof csv) {
            ((csv)bql2).n();
        } else {
            super.b(iu2, cmz2, dbk2);
        }
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
    public void a_(iu iu2, cmz cmz2, dbk dbk2) {
        cmz cmz3 = cmz2.c(((bqk)((Object)dbk2.b(a))).e());
        dbk dbk3 = iu2.n(cmz3);
        if (dbk3.t() instanceof ath && ((Boolean)dbk3.b(ath.a)).booleanValue()) {
            iu2.f(cmz3);
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
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (!iu2.C && iu2.q(cmz2) == null) {
            iu2.f(cmz2);
            return true;
        }
        return false;
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return null;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, float f2, int n2) {
        if (iu2.C) {
            return;
        }
        csv csv2 = this.c(iu2, cmz2);
        if (csv2 == null) {
            return;
        }
        dbk dbk3 = csv2.f();
        dbk3.t().b(iu2, cmz2, dbk3, 0);
    }

    @Override
    public auu a(dbk dbk2, iu iu2, cmz cmz2, amj amj2, amj amj3) {
        return null;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (!iu2.C) {
            iu2.q(cmz2);
        }
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        csv csv2 = this.c(iu2, cmz2);
        if (csv2 == null) {
            return null;
        }
        return csv2.a(iu2, cmz2);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        csv csv2 = this.c(bnj2, cmz2);
        if (csv2 != null) {
            return csv2.a(bnj2, cmz2);
        }
        return x;
    }

    private csv c(bnj bnj2, cmz cmz2) {
        bql bql2 = bnj2.q(cmz2);
        if (bql2 instanceof csv) {
            return (csv)bql2;
        }
        return null;
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return null;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)ln.b(n2))).a(b, (Comparable)((Object)((n2 & 8) > 0 ? cu.b : cu.a)));
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
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((bqk)((Object)dbk2.b(a))).b();
        if (dbk2.b(b) == cu.b) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b);
    }
}

