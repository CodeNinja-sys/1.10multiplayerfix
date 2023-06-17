/*
 * Decompiled with CFR 0.150.
 */
public class aga
extends ar {
    public aga() {
        super(ahk.s, bif.G);
        this.c(3.0f);
        this.a(zm.f);
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new agq();
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (iu2.C) {
            return true;
        }
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof agq) {
            bdl2.a((agq)bql2);
            bdl2.a(bpv.P);
        }
        return true;
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
    public cpb g(dbk dbk2) {
        return cpb.d;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bga bga2, bhl bhl2) {
        bql bql2;
        super.a(iu2, cmz2, dbk2, bga2, bhl2);
        if (bhl2.s() && (bql2 = iu2.q(cmz2)) instanceof agq) {
            ((agq)bql2).a(bhl2.q());
        }
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof agq) {
            ((agq)bql2).h();
            iu2.c(cmz2, this, 1, 0);
        }
    }

    @Override
    public kj b() {
        return kj.c;
    }

    public static void c(iu iu2, cmz cmz2) {
        aix.a.a(new beg(iu2, cmz2));
    }
}

