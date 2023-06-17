/*
 * Decompiled with CFR 0.150.
 */
public class oc
extends ck {
    private final it a;

    public oc(it it2) {
        this.a = it2;
    }

    @Override
    public boolean b() {
        return this.a.aQ.a(this.a.aU, this.a.aV, this.a.aW, 10.0);
    }

    @Override
    public void e() {
        bgp bgp2 = this.a.aQ.C(new cmz(this.a));
        this.a.k(false);
        this.a.a(bmv.e);
        this.a.b(true);
        this.a.j(0);
        this.a.aQ.a(new tz(this.a.aQ, this.a.aU, this.a.aV, this.a.aW, true));
        azy azy2 = this.a(bgp2, this.a);
        azy2.m(this.a);
        for (int i2 = 0; i2 < 3; ++i2) {
            it it2 = this.a(bgp2);
            azy azy3 = this.a(bgp2, it2);
            azy3.m(it2);
            it2.c(this.a.aW().nextGaussian() * 0.5, 0.0, this.a.aW().nextGaussian() * 0.5);
        }
    }

    private it a(bgp bgp2) {
        it it2 = new it(this.a.aQ);
        it2.a(bgp2, null);
        it2.d(this.a.aU, this.a.aV, this.a.aW);
        it2.bB = 60;
        it2.aC();
        it2.a(bmv.e);
        it2.b(true);
        it2.j(0);
        it2.aQ.b(it2);
        return it2;
    }

    private azy a(bgp bgp2, it it2) {
        azy azy2 = new azy(it2.aQ);
        azy2.a(bgp2, null);
        azy2.d(it2.aU, it2.aV, it2.aW);
        azy2.bB = 60;
        azy2.aC();
        if (azy2.a(dfm.f) == null) {
            azy2.a(dfm.f, new bhl(hp.aa));
        }
        acz.a(azy2.aW(), azy2.bt(), (int)(5.0f + bgp2.c() * (float)azy2.aW().nextInt(18)), false);
        acz.a(azy2.aW(), azy2.a(dfm.f), (int)(5.0f + bgp2.c() * (float)azy2.aW().nextInt(18)), false);
        azy2.aQ.b(azy2);
        return azy2;
    }
}

