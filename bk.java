/*
 * Decompiled with CFR 0.150.
 */
public class bk
extends azg {
    public bk() {
        this.a(zm.f);
    }

    @Override
    public boolean a(bhl bhl2) {
        return true;
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        if (!bdl2.G.d) {
            --bhl2.b;
        }
        iu2.a(null, bdl2.aU, bdl2.aV, bdl2.aW, dah.bi, csg.g, 0.5f, 0.4f / (j.nextFloat() * 0.4f + 0.8f));
        if (!iu2.C) {
            bgc bgc2 = new bgc(iu2, bdl2);
            bgc2.a(bdl2, bdl2.bb, bdl2.ba, -20.0f, 0.7f, 1.0f);
            iu2.b(bgc2);
        }
        bdl2.a(bpv.b(this));
        return new wx(cey.a, bhl2);
    }
}

