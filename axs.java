/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class axs
extends to {
    private final lp a;

    public axs(lp lp2) {
        this.a = lp2;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        for (int i2 = 0; i2 < 64; ++i2) {
            cmz cmz3 = cmz2.e(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!iu2.c(cmz3) || iu2.q.n() && cmz3.b() >= 255 || !this.a.e(iu2, cmz3, this.a.s())) continue;
            iu2.a(cmz3, this.a.s(), 2);
        }
        return true;
    }
}

