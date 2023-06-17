/*
 * Decompiled with CFR 0.150.
 */
public class cxd
extends azg {
    public cxd() {
        this.a(zm.c);
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        Object object;
        boolean bl2;
        if (iu2.C) {
            return cey.a;
        }
        if (bqk2 != bqk.b) {
            return cey.c;
        }
        dbk dbk2 = iu2.n(cmz2);
        bfa bfa2 = dbk2.t();
        boolean bl3 = bfa2.a_((bnj)iu2, cmz2);
        if (!bl3) {
            cmz2 = cmz2.g();
        }
        int n2 = cmk.c((double)(bdl2.ba * 4.0f / 360.0f) + 0.5) & 3;
        bqk bqk3 = bqk.b(n2);
        cmz cmz3 = cmz2.c(bqk3);
        if (!bdl2.a(cmz2, bqk2, bhl2) || !bdl2.a(cmz3, bqk2, bhl2)) {
            return cey.c;
        }
        boolean bl4 = iu2.n(cmz3).t().a_((bnj)iu2, cmz3);
        boolean bl5 = bl3 || iu2.c(cmz2);
        boolean bl6 = bl2 = bl4 || iu2.c(cmz3);
        if (!(bl5 && bl2 && iu2.n(cmz2.h()).q() && iu2.n(cmz3.h()).q())) {
            return cey.c;
        }
        dbk dbk3 = blg.C.s().a(dx.b, Boolean.valueOf(false)).a(dx.j, (Comparable)((Object)bqk3)).a(dx.a, (Comparable)((Object)ahh.b));
        if (iu2.a(cmz2, dbk3, 11)) {
            object = dbk3.a(dx.a, (Comparable)((Object)ahh.a));
            iu2.a(cmz3, (dbk)object, 11);
        }
        object = dbk3.t().t();
        iu2.a(null, cmz2, ((acv)object).e(), csg.e, (((acv)object).a() + 1.0f) / 2.0f, ((acv)object).b() * 0.8f);
        --bhl2.b;
        return cey.a;
    }
}

