/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class awi
extends bku {
    @Override
    public void a(iu iu2, Random random, anr anr2, cmz cmz2) {
        cmz cmz3 = iu2.B();
        int n2 = 16;
        double d2 = cmz3.f(cmz2.e(8, cmz3.b(), 8));
        if (d2 > 1024.0) {
            return;
        }
        cmz cmz4 = new cmz(cmz3.a() - 16, cmz3.b() - 1, cmz3.c() - 16);
        cmz cmz5 = new cmz(cmz3.a() + 16, cmz3.b() - 1, cmz3.c() + 16);
        pj pj2 = new pj(cmz4);
        for (int i2 = cmz2.c(); i2 < cmz2.c() + 16; ++i2) {
            for (int i3 = cmz2.a(); i3 < cmz2.a() + 16; ++i3) {
                if (i2 < cmz4.c() || i2 > cmz5.c() || i3 < cmz4.a() || i3 > cmz5.a()) continue;
                pj2.a(i3, pj2.b(), i2);
                if (cmz3.a() == i3 && cmz3.c() == i2) {
                    iu2.a((cmz)pj2, blg.e.s(), 2);
                    continue;
                }
                iu2.a((cmz)pj2, blg.b.s(), 2);
            }
        }
    }
}

