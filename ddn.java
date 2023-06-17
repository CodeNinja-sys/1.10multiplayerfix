/*
 * Decompiled with CFR 0.150.
 */
public class ddn
extends azg {
    private final bfa a;

    public ddn(bfa bfa2) {
        this.a = bfa2;
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        dbk dbk2 = iu2.n(cmz2);
        bfa bfa2 = dbk2.t();
        if (bfa2 == blg.aH && (Integer)dbk2.b(btq.a) < 1) {
            bqk2 = bqk.b;
        } else if (!bfa2.a_((bnj)iu2, cmz2)) {
            cmz2 = cmz2.c(bqk2);
        }
        if (!bdl2.a(cmz2, bqk2, bhl2) || bhl2.b == 0 || !iu2.a(this.a, cmz2, false, bqk2, null, bhl2)) {
            return cey.c;
        }
        dbk dbk3 = this.a.a(iu2, cmz2, bqk2, f2, f3, f4, 0, bdl2);
        if (!iu2.a(cmz2, dbk3, 11)) {
            return cey.c;
        }
        dbk3 = iu2.n(cmz2);
        if (dbk3.t() == this.a) {
            ge.a(iu2, bdl2, cmz2, bhl2);
            dbk3.t().a(iu2, cmz2, dbk3, bdl2, bhl2);
        }
        acv acv2 = this.a.t();
        iu2.a(bdl2, cmz2, acv2.e(), csg.e, (acv2.a() + 1.0f) / 2.0f, acv2.b() * 0.8f);
        --bhl2.b;
        return cey.a;
    }
}

