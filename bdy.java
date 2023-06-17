/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bdy
extends to {
    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        while (cmz2.b() < 128) {
            if (iu2.c(cmz2)) {
                for (bqk bqk2 : afj.a.a()) {
                    if (!blg.bn.a_(iu2, cmz2, bqk2)) continue;
                    dbk dbk2 = blg.bn.s().a(ju.b, Boolean.valueOf(bqk2 == bqk.c)).a(ju.c, Boolean.valueOf(bqk2 == bqk.f)).a(ju.d, Boolean.valueOf(bqk2 == bqk.d)).a(ju.e, Boolean.valueOf(bqk2 == bqk.e));
                    iu2.a(cmz2, dbk2, 2);
                    break;
                }
            } else {
                cmz2 = cmz2.e(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
            }
            cmz2 = cmz2.g();
        }
        return true;
    }
}

