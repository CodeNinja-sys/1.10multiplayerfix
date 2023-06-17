/*
 * Decompiled with CFR 0.150.
 */
public class bnt
extends dbs {
    public bnt() {
        this.D(this.O.b().a(f, Integer.valueOf(0)));
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return g;
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        return dbk2.a(f, Integer.valueOf(ih2.a((Integer)dbk2.b(f), 16)));
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        return dbk2.a(f, Integer.valueOf(cdk2.a((Integer)dbk2.b(f), 16)));
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (!iu2.n(cmz2.h()).a().a()) {
            this.b(iu2, cmz2, dbk2, 0);
            iu2.f(cmz2);
        }
        super.a(dbk2, iu2, cmz2, bfa2);
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(f, Integer.valueOf(n2));
    }

    @Override
    public int e(dbk dbk2) {
        return (Integer)dbk2.b(f);
    }

    @Override
    protected bkp a() {
        return new bkp(this, f);
    }
}

