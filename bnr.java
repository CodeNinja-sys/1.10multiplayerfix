/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public abstract class bnr
extends bfa {
    public static final byc c = byc.a("half", dew.class);
    protected static final cxt d = new cxt(0.0, 0.0, 0.0, 1.0, 0.5, 1.0);
    protected static final cxt e = new cxt(0.0, 0.5, 0.0, 1.0, 1.0, 1.0);

    public bnr(ahk ahk2) {
        super(ahk2);
        this.z = this.d();
        this.h(255);
    }

    @Override
    protected boolean c() {
        return false;
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        if (this.d()) {
            return x;
        }
        return dbk2.b(c) == dew.a ? e : d;
    }

    @Override
    public boolean f(dbk dbk2) {
        return ((bnr)dbk2.t()).d() || dbk2.b(c) == dew.a;
    }

    @Override
    public boolean b(dbk dbk2) {
        return this.d();
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        dbk dbk2 = super.a(iu2, cmz2, bqk2, f2, f3, f4, n2, bga2).a(c, (Comparable)((Object)dew.b));
        if (this.d()) {
            return dbk2;
        }
        if (bqk2 == bqk.a || bqk2 != bqk.b && (double)f3 > 0.5) {
            return dbk2.a(c, (Comparable)((Object)dew.a));
        }
        return dbk2;
    }

    @Override
    public int a(Random random) {
        if (this.d()) {
            return 2;
        }
        return 1;
    }

    @Override
    public boolean c(dbk dbk2) {
        return this.d();
    }

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        boolean bl2;
        if (this.d()) {
            return super.a(dbk2, bnj2, cmz2, bqk2);
        }
        if (bqk2 != bqk.b && bqk2 != bqk.a && !super.a(dbk2, bnj2, cmz2, bqk2)) {
            return false;
        }
        dbk dbk3 = bnj2.n(cmz2.c(bqk2));
        boolean bl3 = bnr.m(dbk3) && dbk3.b(c) == dew.a;
        boolean bl4 = bl2 = bnr.m(dbk2) && dbk2.b(c) == dew.a;
        if (bl2) {
            if (bqk2 == bqk.a) {
                return true;
            }
            if (bqk2 == bqk.b && super.a(dbk2, bnj2, cmz2, bqk2)) {
                return true;
            }
            return !bnr.m(dbk3) || !bl3;
        }
        if (bqk2 == bqk.b) {
            return true;
        }
        if (bqk2 == bqk.a && super.a(dbk2, bnj2, cmz2, bqk2)) {
            return true;
        }
        return !bnr.m(dbk3) || bl3;
    }

    protected static boolean m(dbk dbk2) {
        bfa bfa2 = dbk2.t();
        return bfa2 == blg.U || bfa2 == blg.bM || bfa2 == blg.cP || bfa2 == blg.cX;
    }

    public abstract String b(int var1);

    public abstract boolean d();

    public abstract bvs av_();

    public abstract Comparable a(bhl var1);
}

