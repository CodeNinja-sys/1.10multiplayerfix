/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class nq
extends azg {
    public nq() {
        this.a(zm.c);
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        double d2;
        double d3;
        cmz cmz3;
        if (bqk2 == bqk.a) {
            return cey.c;
        }
        boolean bl2 = iu2.n(cmz2).t().a_((bnj)iu2, cmz2);
        cmz cmz4 = cmz3 = bl2 ? cmz2 : cmz2.c(bqk2);
        if (!bdl2.a(cmz3, bqk2, bhl2)) {
            return cey.c;
        }
        cmz cmz5 = cmz3.g();
        boolean bl3 = !iu2.c(cmz3) && !iu2.n(cmz3).t().a_((bnj)iu2, cmz3);
        if (bl3 |= !iu2.c(cmz5) && !iu2.n(cmz5).t().a_((bnj)iu2, cmz5)) {
            return cey.c;
        }
        double d4 = cmz3.a();
        List list = iu2.b(null, new cxt(d4, d3 = (double)cmz3.b(), d2 = (double)cmz3.c(), d4 + 1.0, d3 + 2.0, d2 + 1.0));
        if (!list.isEmpty()) {
            return cey.c;
        }
        if (!iu2.C) {
            iu2.f(cmz3);
            iu2.f(cmz5);
            bdi bdi2 = new bdi(iu2, d4 + 0.5, d3, d2 + 0.5);
            float f5 = (float)cmk.d((cmk.g(bdl2.ba - 180.0f) + 22.5f) / 45.0f) * 45.0f;
            bdi2.a_(d4 + 0.5, d3, d2 + 0.5, f5, 0.0f);
            this.a(bdi2, iu2.p);
            clx.a(iu2, bdl2, bhl2, bdi2);
            iu2.b(bdi2);
            iu2.a(null, bdi2.aU, bdi2.aV, bdi2.aW, dah.m, csg.e, 0.75f, 0.8f);
        }
        --bhl2.b;
        return cey.a;
    }

    private void a(bdi bdi2, Random random) {
        cig cig2 = bdi2.ad();
        float f2 = random.nextFloat() * 5.0f;
        float f3 = random.nextFloat() * 20.0f - 10.0f;
        cig cig3 = new cig(cig2.b() + f2, cig2.c() + f3, cig2.d());
        bdi2.a(cig3);
        cig2 = bdi2.ae();
        f2 = random.nextFloat() * 10.0f - 5.0f;
        cig3 = new cig(cig2.b(), cig2.c() + f2, cig2.d());
        bdi2.b(cig3);
    }
}

