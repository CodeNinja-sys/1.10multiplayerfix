/*
 * Decompiled with CFR 0.150.
 */
public class nt
extends azg {
    public nt() {
        this.a(zm.d);
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        cmz cmz3;
        boolean bl2 = iu2.n(cmz2).t().a_((bnj)iu2, cmz2);
        cmz cmz4 = cmz3 = bl2 ? cmz2 : cmz2.c(bqk2);
        if (!(bdl2.a(cmz3, bqk2, bhl2) && iu2.a(iu2.n(cmz3).t(), cmz3, false, bqk2, null, bhl2) && blg.af.a(iu2, cmz3))) {
            return cey.c;
        }
        --bhl2.b;
        iu2.a(cmz3, blg.af.s());
        return cey.a;
    }
}

