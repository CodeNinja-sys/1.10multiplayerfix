/*
 * Decompiled with CFR 0.150.
 */
public class aml
extends azg {
    public aml() {
        this.k = 16;
        this.a(zm.c);
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        dbk dbk2 = iu2.n(cmz2);
        boolean bl2 = dbk2.t().a_((bnj)iu2, cmz2);
        if (bqk2 == bqk.a || !dbk2.a().a() && !bl2 || bl2 && bqk2 != bqk.b) {
            return cey.c;
        }
        if (!bdl2.a(cmz2 = cmz2.c(bqk2), bqk2, bhl2) || !blg.an.a(iu2, cmz2)) {
            return cey.c;
        }
        if (iu2.C) {
            return cey.a;
        }
        cmz cmz3 = cmz2 = bl2 ? cmz2.h() : cmz2;
        if (bqk2 == bqk.b) {
            int n2 = cmk.c((double)((bdl2.ba + 180.0f) * 16.0f / 360.0f) + 0.5) & 0xF;
            iu2.a(cmz2, blg.an.s().a(ayr.a, Integer.valueOf(n2)), 11);
        } else {
            iu2.a(cmz2, blg.ax.s().a(bqz.a, (Comparable)((Object)bqk2)), 11);
        }
        --bhl2.b;
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof bxr && !ge.a(iu2, bdl2, cmz2, bhl2)) {
            bdl2.a((bxr)bql2);
        }
        return cey.a;
    }
}

