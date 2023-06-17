/*
 * Decompiled with CFR 0.150.
 */
public class jx
extends dbs {
    protected static final cxt a = new cxt(0.0, 0.0, 0.875, 1.0, 0.78125, 1.0);
    protected static final cxt b = new cxt(0.0, 0.0, 0.0, 1.0, 0.78125, 0.125);
    protected static final cxt c = new cxt(0.875, 0.0, 0.0, 1.0, 0.78125, 1.0);
    protected static final cxt d = new cxt(0.0, 0.0, 0.0, 0.125, 0.78125, 1.0);

    public jx() {
        this.D(this.O.b().a(e, (Comparable)((Object)bqk.c)));
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        return dbk2.a(e, (Comparable)((Object)ih2.a((bqk)((Object)dbk2.b(e)))));
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        return dbk2.a(cdk2.a((bqk)((Object)dbk2.b(e))));
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        switch ((bqk)((Object)dbk2.b(e))) {
            default: {
                return a;
            }
            case d: {
                return b;
            }
            case e: {
                return c;
            }
            case f: 
        }
        return d;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        bqk bqk2 = (bqk)((Object)dbk2.b(e));
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
        return this.s().a(e, (Comparable)((Object)bqk2));
    }

    @Override
    public int e(dbk dbk2) {
        return ((bqk)((Object)dbk2.b(e))).b();
    }

    @Override
    protected bkp a() {
        return new bkp(this, e);
    }
}

