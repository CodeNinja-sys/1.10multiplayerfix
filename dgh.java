/*
 * Decompiled with CFR 0.150.
 */
public class dgh
extends qg {
    protected dgh() {
        this.a(zm.f);
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        bhl bhl3 = new bhl(hp.bk, 1, iu2.b("map"));
        String string = "map_" + bhl3.h();
        aph aph2 = new aph(string);
        iu2.a(string, aph2);
        aph2.f = 0;
        aph2.a(bdl2.aU, bdl2.aW, aph2.f);
        aph2.d = (byte)iu2.q.a().a();
        aph2.e = true;
        aph2.a();
        --bhl2.b;
        if (bhl2.b <= 0) {
            return new wx(cey.a, bhl3);
        }
        if (!bdl2.n.c(bhl3.j())) {
            bdl2.a(bhl3, false);
        }
        bdl2.a(bpv.b(this));
        return new wx(cey.a, bhl2);
    }
}

