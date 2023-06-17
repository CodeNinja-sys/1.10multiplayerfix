/*
 * Decompiled with CFR 0.150.
 */
public class axu
extends azg {
    public axu() {
        this.k = 16;
        this.a(zm.f);
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        if (!bdl2.G.d) {
            --bhl2.b;
        }
        iu2.a(null, bdl2.aU, bdl2.aV, bdl2.aW, dah.fS, csg.g, 0.5f, 0.4f / (j.nextFloat() * 0.4f + 0.8f));
        if (!iu2.C) {
            bef bef2 = new bef(iu2, bdl2);
            bef2.a(bdl2, bdl2.bb, bdl2.ba, 0.0f, 1.5f, 1.0f);
            iu2.b(bef2);
        }
        bdl2.a(bpv.b(this));
        return new wx(cey.a, bhl2);
    }
}

