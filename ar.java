/*
 * Decompiled with CFR 0.150.
 */
public abstract class ar
extends bfa
implements gk {
    protected ar(ahk ahk2) {
        this(ahk2, ahk2.p());
    }

    protected ar(ahk ahk2, bif bif2) {
        super(ahk2, bif2);
        this.I = true;
    }

    protected boolean a(iu iu2, cmz cmz2, bqk bqk2) {
        return iu2.n(cmz2.c(bqk2)).a() == ahk.A;
    }

    protected boolean b(iu iu2, cmz cmz2) {
        return this.a(iu2, cmz2, bqk.c) || this.a(iu2, cmz2, bqk.d) || this.a(iu2, cmz2, bqk.e) || this.a(iu2, cmz2, bqk.f);
    }

    @Override
    public cpb g(dbk dbk2) {
        return cpb.a;
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        super.b(iu2, cmz2, dbk2);
        iu2.r(cmz2);
    }

    @Override
    public boolean a(dbk dbk2, iu iu2, cmz cmz2, int n2, int n3) {
        super.a(dbk2, iu2, cmz2, n2, n3);
        bql bql2 = iu2.q(cmz2);
        if (bql2 == null) {
            return false;
        }
        return bql2.a_(n2, n3);
    }
}

