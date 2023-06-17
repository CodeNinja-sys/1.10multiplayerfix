/*
 * Decompiled with CFR 0.150.
 */
public class bhe
extends azg {
    public bhe() {
        this.a(zm.f);
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        dbk dbk2 = iu2.n(cmz2);
        if (!bdl2.a(cmz2.c(bqk2), bqk2, bhl2) || dbk2.t() != blg.bG || ((Boolean)dbk2.b(crk.b)).booleanValue()) {
            return cey.c;
        }
        if (iu2.C) {
            return cey.a;
        }
        iu2.a(cmz2, dbk2.a(crk.b, Boolean.valueOf(true)), 2);
        iu2.f(cmz2, blg.bG);
        --bhl2.b;
        for (int i2 = 0; i2 < 16; ++i2) {
            double d2 = (float)cmz2.a() + (5.0f + j.nextFloat() * 6.0f) / 16.0f;
            double d3 = (float)cmz2.b() + 0.8125f;
            double d4 = (float)cmz2.c() + (5.0f + j.nextFloat() * 6.0f) / 16.0f;
            double d5 = 0.0;
            double d6 = 0.0;
            double d7 = 0.0;
            iu2.a(lz.l, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
        }
        aiz aiz2 = crk.h().a(iu2, cmz2);
        if (aiz2 != null) {
            cmz cmz3 = aiz2.a().e(-3, 0, -3);
            for (int i3 = 0; i3 < 3; ++i3) {
                for (int i4 = 0; i4 < 3; ++i4) {
                    iu2.a(cmz3.e(i3, 0, i4), blg.bF.s(), 2);
                }
            }
        }
        return cey.a;
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        cmz cmz2;
        auu auu2 = this.a(iu2, bdl2, false);
        if (auu2 != null && auu2.a == bmw.b && iu2.n(auu2.a()).t() == blg.bG) {
            return new wx(cey.b, bhl2);
        }
        if (!iu2.C && (cmz2 = ((alj)iu2).ad().a(iu2, "Stronghold", new cmz(bdl2))) != null) {
            cnd cnd2 = new cnd(iu2, bdl2.aU, bdl2.aV + (double)(bdl2.bm / 2.0f), bdl2.aW);
            cnd2.a(cmz2);
            iu2.b(cnd2);
            iu2.a(null, bdl2.aU, bdl2.aV, bdl2.aW, dah.aV, csg.g, 0.5f, 0.4f / (j.nextFloat() * 0.4f + 0.8f));
            iu2.a(null, 1003, new cmz(bdl2), 0);
            if (!bdl2.G.d) {
                --bhl2.b;
            }
            bdl2.a(bpv.b(this));
            return new wx(cey.a, bhl2);
        }
        return new wx(cey.c, bhl2);
    }
}

