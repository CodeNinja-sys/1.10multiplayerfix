/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class aby
extends to {
    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        for (int i2 = 0; i2 < 10; ++i2) {
            int n2;
            int n3;
            int n4 = cmz2.a() + random.nextInt(8) - random.nextInt(8);
            if (!iu2.c(new cmz(n4, n3 = cmz2.b() + random.nextInt(4) - random.nextInt(4), n2 = cmz2.c() + random.nextInt(8) - random.nextInt(8))) || !blg.bx.a(iu2, new cmz(n4, n3, n2))) continue;
            iu2.a(new cmz(n4, n3, n2), blg.bx.s(), 2);
        }
        return true;
    }
}

