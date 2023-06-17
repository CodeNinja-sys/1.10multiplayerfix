/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class beq
extends to {
    private final bfa a;
    private final int b;

    public beq(bfa bfa2, int n2) {
        super(false);
        this.a = bfa2;
        this.b = n2;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        bfa bfa2;
        while (cmz2.b() > 3 && (iu2.c(cmz2.h()) || (bfa2 = iu2.n(cmz2.h()).t()) != blg.c && bfa2 != blg.d && bfa2 != blg.b)) {
            cmz2 = cmz2.h();
        }
        if (cmz2.b() <= 3) {
            return false;
        }
        int n2 = this.b;
        for (int i2 = 0; n2 >= 0 && i2 < 3; ++i2) {
            int n3 = n2 + random.nextInt(2);
            int n4 = n2 + random.nextInt(2);
            int n5 = n2 + random.nextInt(2);
            float f2 = (float)(n3 + n4 + n5) * 0.333f + 0.5f;
            for (cmz cmz3 : cmz.a(cmz2.e(-n3, -n4, -n5), cmz2.e(n3, n4, n5))) {
                if (!(cmz3.f(cmz2) <= (double)(f2 * f2))) continue;
                iu2.a(cmz3, this.a.s(), 4);
            }
            cmz2 = cmz2.e(-(n2 + 1) + random.nextInt(2 + n2 * 2), 0 - random.nextInt(2), -(n2 + 1) + random.nextInt(2 + n2 * 2));
        }
        return true;
    }
}

