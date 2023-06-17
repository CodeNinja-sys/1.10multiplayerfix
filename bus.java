/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bus
extends to {
    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        if (!iu2.c(cmz2)) {
            return false;
        }
        if (iu2.n(cmz2.g()).t() != blg.aV) {
            return false;
        }
        iu2.a(cmz2, blg.aX.s(), 2);
        for (int i2 = 0; i2 < 1500; ++i2) {
            cmz cmz3 = cmz2.e(random.nextInt(8) - random.nextInt(8), -random.nextInt(12), random.nextInt(8) - random.nextInt(8));
            if (iu2.n(cmz3).a() != ahk.a) continue;
            int n2 = 0;
            for (bqk bqk2 : bqk.values()) {
                if (iu2.n(cmz3.c(bqk2)).t() == blg.aX) {
                    ++n2;
                }
                if (n2 > 1) break;
            }
            if (n2 != true) continue;
            iu2.a(cmz3, blg.aX.s(), 2);
        }
        return true;
    }
}

