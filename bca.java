/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bca
extends to {
    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        for (int i2 = 0; i2 < 64; ++i2) {
            cmz cmz3 = cmz2.e(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!iu2.c(cmz3) || iu2.n(cmz3.h()).t() != blg.c || !blg.aU.a(iu2, cmz3)) continue;
            iu2.a(cmz3, blg.aU.s().a(coj.j, (Comparable)((Object)afj.a.a(random))), 2);
        }
        return true;
    }
}

