/*
 * Decompiled with CFR 0.150.
 */
public class bqz
extends bsu {
    public static final yc a = cli.j;
    protected static final cxt b = new cxt(0.0, 0.28125, 0.0, 0.125, 0.78125, 1.0);
    protected static final cxt c = new cxt(0.875, 0.28125, 0.0, 1.0, 0.78125, 1.0);
    protected static final cxt d = new cxt(0.0, 0.28125, 0.0, 1.0, 0.78125, 0.125);
    protected static final cxt e = new cxt(0.0, 0.28125, 0.875, 1.0, 0.78125, 1.0);

    public bqz() {
        this.D(this.O.b().a(a, (Comparable)((Object)bqk.c)));
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        switch ((bqk)((Object)dbk2.b(a))) {
            default: {
                return e;
            }
            case d: {
                return d;
            }
            case e: {
                return c;
            }
            case f: 
        }
        return b;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        bqk bqk2 = (bqk)((Object)dbk2.b(a));
        if (!iu2.n(cmz2.c(bqk2.e())).a().a()) {
            this.b(iu2, cmz2, dbk2, 0);
            iu2.f(cmz2);
        }
        super.a(dbk2, iu2, cmz2, bfa2);
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

