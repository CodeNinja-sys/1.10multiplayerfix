/*
 * Decompiled with CFR 0.150.
 */
public class boy
extends azg {
    public boy() {
        this.k = 16;
        this.a(zm.f);
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        if (!bdl2.G.d) {
            --bhl2.b;
        }
        iu2.a(null, bdl2.aU, bdl2.aV, bdl2.aW, dah.bg, csg.g, 0.5f, 0.4f / (j.nextFloat() * 0.4f + 0.8f));
        bdl2.aS().a((azg)this, 20);
        if (!iu2.C) {
            ddg ddg2 = new ddg(iu2, bdl2);
            ddg2.a(bdl2, bdl2.bb, bdl2.ba, 0.0f, 1.5f, 1.0f);
            iu2.b(ddg2);
        }
        bdl2.a(bpv.b(this));
        return new wx(cey.a, bhl2);
    }
}

