/*
 * Decompiled with CFR 0.150.
 */
final class aon
extends ckc {
    private final ckc a = new ckc();

    aon() {
    }

    @Override
    public bhl a(bcl bcl2, bhl bhl2) {
        Object object;
        double d2;
        ctp ctp2;
        bqk bqk2 = (bqk)((Object)bcl2.f().b(crh.a));
        iu iu2 = bcl2.a();
        double d3 = bcl2.b() + (double)bqk2.h() * 1.125;
        double d4 = Math.floor(bcl2.c()) + (double)bqk2.i();
        double d5 = bcl2.d() + (double)bqk2.j() * 1.125;
        cmz cmz2 = bcl2.e().c(bqk2);
        dbk dbk2 = iu2.n(cmz2);
        ctp ctp3 = ctp2 = dbk2.t() instanceof bxs ? (ctp)((Object)dbk2.b(((bxs)dbk2.t()).d())) : ctp.a;
        if (bxs.m(dbk2)) {
            d2 = ctp2.c() ? 0.6 : 0.1;
        } else if (dbk2.a() == ahk.a && bxs.m(iu2.n(cmz2.h()))) {
            ctp ctp4;
            object = iu2.n(cmz2.h());
            ctp ctp5 = ctp4 = object.t() instanceof bxs ? (ctp)((Object)object.b(((bxs)object.t()).d())) : ctp.a;
            d2 = bqk2 == bqk.a || !ctp4.c() ? -0.9 : -0.4;
        } else {
            return this.a.b(bcl2, bhl2);
        }
        object = cef.a(iu2, d3, d4 + d2, d5, abx.a((abx)bhl2.a()));
        if (bhl2.s()) {
            ((cpk)object).g(bhl2.q());
        }
        iu2.b((cpk)object);
        bhl2.a(1);
        return bhl2;
    }

    @Override
    protected void a(bcl bcl2) {
        bcl2.a().b(1000, bcl2.e(), 0);
    }
}

