/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class afn
extends azg {
    public afn() {
        this.b("end_crystal");
        this.a(zm.c);
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        double d2;
        double d3;
        dbk dbk2 = iu2.n(cmz2);
        if (dbk2.t() != blg.Z && dbk2.t() != blg.h) {
            return cey.c;
        }
        cmz cmz3 = cmz2.g();
        if (!bdl2.a(cmz3, bqk2, bhl2)) {
            return cey.c;
        }
        cmz cmz4 = cmz3.g();
        boolean bl2 = !iu2.c(cmz3) && !iu2.n(cmz3).t().a_((bnj)iu2, cmz3);
        if (bl2 |= !iu2.c(cmz4) && !iu2.n(cmz4).t().a_((bnj)iu2, cmz4)) {
            return cey.c;
        }
        double d4 = cmz3.a();
        List list = iu2.b(null, new cxt(d4, d3 = (double)cmz3.b(), d2 = (double)cmz3.c(), d4 + 1.0, d3 + 2.0, d2 + 1.0));
        if (!list.isEmpty()) {
            return cey.c;
        }
        if (!iu2.C) {
            abi abi2 = new abi(iu2, (float)cmz2.a() + 0.5f, cmz2.b() + 1, (float)cmz2.c() + 0.5f);
            abi2.a(false);
            iu2.b(abi2);
            if (iu2.q instanceof cup) {
                cmd cmd2 = ((cup)iu2.q).s();
                cmd2.e();
            }
        }
        --bhl2.b;
        return cey.a;
    }

    @Override
    public boolean a(bhl bhl2) {
        return true;
    }
}

