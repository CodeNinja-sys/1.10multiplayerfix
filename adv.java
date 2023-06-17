/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class adv
extends azp {
    private final bvp a;

    public adv(cfv[] arrcfv, bvp bvp2) {
        super(arrcfv);
        this.a = bvp2;
    }

    @Override
    public bhl a(bhl bhl2, Random random, abe abe2) {
        bvp bvp2 = bhl2.o();
        if (bvp2 == null) {
            bvp2 = this.a.d();
        } else {
            bvp2.a(this.a);
        }
        bhl2.d(bvp2);
        return bhl2;
    }

    static /* synthetic */ bvp a(adv adv2) {
        return adv2.a;
    }
}

