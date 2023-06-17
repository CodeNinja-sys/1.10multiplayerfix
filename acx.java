/*
 * Decompiled with CFR 0.150.
 */
public class acx
extends ge {
    public acx(bfa bfa2) {
        super(bfa2);
        this.e(0);
        this.a(true);
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        dbk dbk2;
        cxt cxt2;
        int n2;
        if (bhl2.b == 0 || !bdl2.a(cmz2, bqk2, bhl2)) {
            return cey.c;
        }
        dbk dbk3 = iu2.n(cmz2);
        bfa bfa2 = dbk3.t();
        cmz cmz3 = cmz2;
        if (!(bqk2 == bqk.b && bfa2 == this.a || bfa2.a_((bnj)iu2, cmz2))) {
            cmz3 = cmz2.c(bqk2);
            dbk3 = iu2.n(cmz3);
            bfa2 = dbk3.t();
        }
        if (bfa2 == this.a && (n2 = ((Integer)dbk3.b(btq.a)).intValue()) <= 7 && (cxt2 = (dbk2 = dbk3.a(btq.a, Integer.valueOf(n2 + 1))).d(iu2, cmz3)) != bfa.y && iu2.c(cxt2.a(cmz3)) && iu2.a(cmz3, dbk2, 10)) {
            acv acv2 = this.a.t();
            iu2.a(bdl2, cmz3, acv2.e(), csg.e, (acv2.a() + 1.0f) / 2.0f, acv2.b() * 0.8f);
            --bhl2.b;
            return cey.a;
        }
        return super.a(bhl2, bdl2, iu2, cmz3, bqp2, bqk2, f2, f3, f4);
    }

    @Override
    public int a(int n2) {
        return n2;
    }
}

