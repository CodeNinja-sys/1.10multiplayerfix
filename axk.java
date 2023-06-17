/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class axk
extends to {
    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        dbk dbk2 = iu2.n(cmz2);
        while ((dbk2.a() == ahk.a || dbk2.a() == ahk.j) && cmz2.b() > 0) {
            cmz2 = cmz2.h();
            dbk2 = iu2.n(cmz2);
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            cmz cmz3 = cmz2.e(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!iu2.c(cmz3) || !blg.I.e(iu2, cmz3, blg.I.s())) continue;
            iu2.a(cmz3, blg.I.s(), 2);
        }
        return true;
    }
}

