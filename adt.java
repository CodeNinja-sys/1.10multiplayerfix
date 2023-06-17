/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class adt
extends to {
    private bon a;

    public void a(bon bon2) {
        this.a = bon2;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        boolean bl2 = false;
        for (int i2 = 0; i2 < 64; ++i2) {
            cmz cmz3 = cmz2.e(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!iu2.c(cmz3) || iu2.q.n() && cmz3.b() >= 254 || !blg.cF.a(iu2, cmz3)) continue;
            blg.cF.a(iu2, cmz3, this.a, 2);
            bl2 = true;
        }
        return bl2;
    }
}

