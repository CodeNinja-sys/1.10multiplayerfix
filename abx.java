/*
 * Decompiled with CFR 0.150.
 */
public class abx
extends azg {
    private static final atl a = new aon();
    private final cta b;

    public abx(cta cta2) {
        this.k = 1;
        this.b = cta2;
        this.a(zm.e);
        crh.c.a(this, a);
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        dbk dbk2 = iu2.n(cmz2);
        if (!bxs.m(dbk2)) {
            return cey.c;
        }
        if (!iu2.C) {
            ctp ctp2 = dbk2.t() instanceof bxs ? (ctp)((Object)dbk2.b(((bxs)dbk2.t()).d())) : ctp.a;
            double d2 = 0.0;
            if (ctp2.c()) {
                d2 = 0.5;
            }
            cef cef2 = cef.a(iu2, (double)cmz2.a() + 0.5, (double)cmz2.b() + 0.0625 + d2, (double)cmz2.c() + 0.5, this.b);
            if (bhl2.s()) {
                cef2.g(bhl2.q());
            }
            iu2.b(cef2);
        }
        --bhl2.b;
        return cey.a;
    }

    static /* synthetic */ cta a(abx abx2) {
        return abx2.b;
    }
}

