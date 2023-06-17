/*
 * Decompiled with CFR 0.150.
 */
public class el
extends ckc {
    private final ckc a = new ckc();
    private final cns b;

    public el(cns cns2) {
        this.b = cns2;
    }

    @Override
    public bhl a(bcl bcl2, bhl bhl2) {
        double d2;
        bqk bqk2 = (bqk)((Object)bcl2.f().b(crh.a));
        iu iu2 = bcl2.a();
        double d3 = bcl2.b() + (double)((float)bqk2.h() * 1.125f);
        double d4 = bcl2.c() + (double)((float)bqk2.i() * 1.125f);
        double d5 = bcl2.d() + (double)((float)bqk2.j() * 1.125f);
        cmz cmz2 = bcl2.e().c(bqk2);
        ahk ahk2 = iu2.n(cmz2).a();
        if (ahk.h.equals(ahk2)) {
            d2 = 1.0;
        } else if (ahk.a.equals(ahk2) && ahk.h.equals(iu2.n(cmz2.h()).a())) {
            d2 = 0.0;
        } else {
            return this.a.b(bcl2, bhl2);
        }
        cor cor2 = new cor(iu2, d3, d4 + d2, d5);
        cor2.a(this.b);
        cor2.ba = bqk2.e().m();
        iu2.b(cor2);
        bhl2.a(1);
        return bhl2;
    }

    @Override
    protected void a(bcl bcl2) {
        bcl2.a().b(1000, bcl2.e(), 0);
    }
}

