/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class mt
extends to {
    private final bfa a = blg.aL;
    private final int b;

    public mt(int n2) {
        this.b = n2;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        if (iu2.n(cmz2).a() != ahk.h) {
            return false;
        }
        int n2 = random.nextInt(this.b - 2) + 2;
        boolean bl2 = true;
        for (int i2 = cmz2.a() - n2; i2 <= cmz2.a() + n2; ++i2) {
            for (int i3 = cmz2.c() - n2; i3 <= cmz2.c() + n2; ++i3) {
                int n3;
                int n4 = i2 - cmz2.a();
                if (n4 * n4 + (n3 = i3 - cmz2.c()) * n3 > n2 * n2) continue;
                for (int i4 = cmz2.b() - 1; i4 <= cmz2.b() + 1; ++i4) {
                    cmz cmz3 = new cmz(i2, i4, i3);
                    bfa bfa2 = iu2.n(cmz3).t();
                    if (bfa2 != blg.d && bfa2 != blg.aL) continue;
                    iu2.a(cmz3, this.a.s(), 2);
                }
            }
        }
        return true;
    }
}

