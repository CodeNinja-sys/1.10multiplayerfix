/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bab
extends to {
    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        for (int i2 = 0; i2 < 64; ++i2) {
            cmz cmz3 = cmz2.e(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!iu2.c(cmz3) || iu2.n(cmz3.h()).t() != blg.aV) continue;
            iu2.a(cmz3, blg.ab.s(), 2);
        }
        return true;
    }
}

