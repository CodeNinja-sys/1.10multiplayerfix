/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cn
extends to {
    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        for (int i2 = 0; i2 < 20; ++i2) {
            cmz cmz3;
            cmz cmz4 = cmz2.e(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
            if (!iu2.c(cmz4) || iu2.n((cmz3 = cmz4.h()).k()).a() != ahk.h && iu2.n(cmz3.l()).a() != ahk.h && iu2.n(cmz3.i()).a() != ahk.h && iu2.n(cmz3.j()).a() != ahk.h) continue;
            int n2 = 2 + random.nextInt(random.nextInt(3) + 1);
            for (int i3 = 0; i3 < n2; ++i3) {
                if (!blg.aM.c(iu2, cmz4)) continue;
                iu2.a(cmz4.b(i3), blg.aM.s(), 2);
            }
        }
        return true;
    }
}

