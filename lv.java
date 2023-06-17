/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class lv
extends to {
    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        for (int i2 = 0; i2 < 10; ++i2) {
            cmz cmz3 = cmz2.e(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!iu2.c(cmz3)) continue;
            int n2 = 1 + random.nextInt(random.nextInt(3) + 1);
            for (int i3 = 0; i3 < n2; ++i3) {
                if (!blg.aK.b(iu2, cmz3)) continue;
                iu2.a(cmz3.b(i3), blg.aK.s(), 2);
            }
        }
        return true;
    }
}

