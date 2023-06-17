/*
 * Decompiled with CFR 0.150.
 */
public class ctw
extends azg {
    public ctw() {
        this.k = 16;
        this.a(zm.l);
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        if (!bdl2.G.d) {
            --bhl2.b;
        }
        iu2.a(null, bdl2.aU, bdl2.aV, bdl2.aW, dah.aC, csg.g, 0.5f, 0.4f / (j.nextFloat() * 0.4f + 0.8f));
        if (!iu2.C) {
            xe xe2 = new xe(iu2, bdl2);
            xe2.a(bdl2, bdl2.bb, bdl2.ba, 0.0f, 1.5f, 1.0f);
            iu2.b(xe2);
        }
        bdl2.a(bpv.b(this));
        return new wx(cey.a, bhl2);
    }
}

