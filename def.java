/*
 * Decompiled with CFR 0.150.
 */
public class def
extends bfa {
    public static final yc a = cli.j;
    protected static final cxt b = new cxt(0.0, 0.0, 0.0, 0.1875, 1.0, 1.0);
    protected static final cxt c = new cxt(0.8125, 0.0, 0.0, 1.0, 1.0, 1.0);
    protected static final cxt d = new cxt(0.0, 0.0, 0.0, 1.0, 1.0, 0.1875);
    protected static final cxt e = new cxt(0.0, 0.0, 0.8125, 1.0, 1.0, 1.0);

    protected def() {
        super(ahk.q);
        this.D(this.O.b().a(a, (Comparable)((Object)bqk.c)));
        this.a(zm.c);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        switch ((bqk)((Object)dbk2.b(a))) {
            case c: {
                return e;
            }
            case d: {
                return d;
            }
            case e: {
                return c;
            }
        }
        return b;
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
        if (iu2.n(cmz2.k()).l()) {
            return true;
        }
        if (iu2.n(cmz2.l()).l()) {
            return true;
        }
        if (iu2.n(cmz2.i()).l()) {
            return true;
        }
        return iu2.n(cmz2.j()).l();
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        if (bqk2.l().d() && this.b(iu2, cmz2, bqk2)) {
            return this.s().a(a, (Comparable)((Object)bqk2));
        }
        for (bqk bqk3 : afj.a) {
            if (!this.b(iu2, cmz2, bqk3)) continue;
            return this.s().a(a, (Comparable)((Object)bqk3));
        }
        return this.s();
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        bqk bqk2 = (bqk)((Object)dbk2.b(a));
        if (!this.b(iu2, cmz2, bqk2)) {
            this.b(iu2, cmz2, dbk2, 0);
            iu2.f(cmz2);
        }
        super.a(dbk2, iu2, cmz2, bfa2);
    }

    protected boolean b(iu iu2, cmz cmz2, bqk bqk2) {
        return iu2.n(cmz2.c(bqk2.e())).l();
    }

    @Override
    public kj b() {
        return kj.c;
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

