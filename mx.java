/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class mx
extends azg {
    public mx() {
        this.a(zm.i);
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        bfa bfa2 = iu2.n(cmz2).t();
        if (!(bfa2 instanceof gd)) {
            return cey.b;
        }
        if (!iu2.C) {
            mx.a(bdl2, iu2, cmz2);
        }
        return cey.a;
    }

    public static boolean a(bdl bdl2, iu iu2, cmz cmz2) {
        ahe ahe2 = ahe.b(iu2, cmz2);
        boolean bl2 = false;
        double d2 = 7.0;
        int n2 = cmz2.a();
        int n3 = cmz2.b();
        int n4 = cmz2.c();
        List list = iu2.a(xy.class, new cxt((double)n2 - 7.0, (double)n3 - 7.0, (double)n4 - 7.0, (double)n2 + 7.0, (double)n3 + 7.0, (double)n4 + 7.0));
        for (xy xy2 : list) {
            if (!xy2.aG() || xy2.aH() != bdl2) continue;
            if (ahe2 == null) {
                ahe2 = ahe.a(iu2, cmz2);
            }
            xy2.b((cpk)ahe2, true);
            bl2 = true;
        }
        return bl2;
    }
}

