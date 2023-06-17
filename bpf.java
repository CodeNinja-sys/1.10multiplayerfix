/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bpf
extends to {
    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        float f2 = random.nextInt(3) + 4;
        int n2 = 0;
        while (f2 > 0.5f) {
            for (int i2 = cmk.d(-f2); i2 <= cmk.f(f2); ++i2) {
                for (int i3 = cmk.d(-f2); i3 <= cmk.f(f2); ++i3) {
                    if (!((float)(i2 * i2 + i3 * i3) <= (f2 + 1.0f) * (f2 + 1.0f))) continue;
                    this.a(iu2, cmz2.e(i2, n2, i3), blg.bH.s());
                }
            }
            f2 = (float)((double)f2 - ((double)random.nextInt(2) + 0.5));
            --n2;
        }
        return true;
    }
}

