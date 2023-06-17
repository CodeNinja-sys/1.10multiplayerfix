/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bkc
extends to {
    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        dbk dbk2 = iu2.n(cmz2);
        while ((dbk2.a() == ahk.a || dbk2.a() == ahk.j) && cmz2.b() > 1) {
            cmz2 = cmz2.h();
            dbk2 = iu2.n(cmz2);
        }
        if (cmz2.b() < 1) {
            return false;
        }
        cmz2 = cmz2.g();
        for (int i2 = 0; i2 < 4; ++i2) {
            cmz cmz3 = cmz2.e(random.nextInt(4) - random.nextInt(4), random.nextInt(3) - random.nextInt(3), random.nextInt(4) - random.nextInt(4));
            if (!iu2.c(cmz3) || !iu2.n(cmz3.h()).q()) continue;
            iu2.a(cmz3, blg.ae.s(), 2);
            bql bql2 = iu2.q(cmz3);
            if (bql2 instanceof bdm) {
                ((bdm)bql2).a(bvm.b, random.nextLong());
            }
            cmz cmz4 = cmz3.l();
            cmz cmz5 = cmz3.k();
            cmz cmz6 = cmz3.i();
            cmz cmz7 = cmz3.j();
            if (iu2.c(cmz5) && iu2.n(cmz5.h()).q()) {
                iu2.a(cmz5, blg.aa.s(), 2);
            }
            if (iu2.c(cmz4) && iu2.n(cmz4.h()).q()) {
                iu2.a(cmz4, blg.aa.s(), 2);
            }
            if (iu2.c(cmz6) && iu2.n(cmz6.h()).q()) {
                iu2.a(cmz6, blg.aa.s(), 2);
            }
            if (iu2.c(cmz7) && iu2.n(cmz7.h()).q()) {
                iu2.a(cmz7, blg.aa.s(), 2);
            }
            return true;
        }
        return false;
    }
}

