/*
 * Decompiled with CFR 0.150.
 */
public class ayr
extends bsu {
    public static final qf a = qf.a("rotation", 0, 15);

    public ayr() {
        this.D(this.O.b().a(a, Integer.valueOf(0)));
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
        return this.s().a(a, Integer.valueOf(n2));
    }

    @Override
    public int e(dbk dbk2) {
        return (Integer)dbk2.b(a);
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        return dbk2.a(a, Integer.valueOf(ih2.a((Integer)dbk2.b(a), 16)));
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        return dbk2.a(a, Integer.valueOf(cdk2.a((Integer)dbk2.b(a), 16)));
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

