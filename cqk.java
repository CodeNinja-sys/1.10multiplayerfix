/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cqk
extends to {
    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        int n2;
        int n3;
        while (iu2.c(cmz2) && cmz2.b() > 2) {
            cmz2 = cmz2.h();
        }
        if (iu2.n(cmz2).t() != blg.aJ) {
            return false;
        }
        cmz2 = cmz2.b(random.nextInt(4));
        int n4 = random.nextInt(4) + 7;
        int n5 = n4 / 4 + random.nextInt(2);
        if (n5 > 1 && random.nextInt(60) == 0) {
            cmz2 = cmz2.b(10 + random.nextInt(30));
        }
        for (n3 = 0; n3 < n4; ++n3) {
            float f2 = (1.0f - (float)n3 / (float)n4) * (float)n5;
            n2 = cmk.f(f2);
            for (int i2 = -n2; i2 <= n2; ++i2) {
                float f3 = (float)cmk.a(i2) - 0.25f;
                for (int i3 = -n2; i3 <= n2; ++i3) {
                    float f4 = (float)cmk.a(i3) - 0.25f;
                    if ((i2 != 0 || i3 != 0) && f3 * f3 + f4 * f4 > f2 * f2 || (i2 == -n2 || i2 == n2 || i3 == -n2 || i3 == n2) && random.nextFloat() > 0.75f) continue;
                    dbk dbk2 = iu2.n(cmz2.e(i2, n3, i3));
                    bfa bfa2 = dbk2.t();
                    if (dbk2.a() == ahk.a || bfa2 == blg.d || bfa2 == blg.aJ || bfa2 == blg.aI) {
                        this.a(iu2, cmz2.e(i2, n3, i3), blg.cB.s());
                    }
                    if (n3 == 0 || n2 <= 1) continue;
                    dbk2 = iu2.n(cmz2.e(i2, -n3, i3));
                    bfa2 = dbk2.t();
                    if (dbk2.a() != ahk.a && bfa2 != blg.d && bfa2 != blg.aJ && bfa2 != blg.aI) continue;
                    this.a(iu2, cmz2.e(i2, -n3, i3), blg.cB.s());
                }
            }
        }
        n3 = n5 - 1;
        if (n3 < 0) {
            n3 = 0;
        } else if (n3 > 1) {
            n3 = 1;
        }
        for (int i4 = -n3; i4 <= n3; ++i4) {
            block5: for (n2 = -n3; n2 <= n3; ++n2) {
                cmz cmz3 = cmz2.e(i4, -1, n2);
                int n6 = 50;
                if (Math.abs(i4) == 1 && Math.abs(n2) == 1) {
                    n6 = random.nextInt(5);
                }
                while (cmz3.b() > 50) {
                    dbk dbk3 = iu2.n(cmz3);
                    bfa bfa3 = dbk3.t();
                    if (dbk3.a() != ahk.a && bfa3 != blg.d && bfa3 != blg.aJ && bfa3 != blg.aI && bfa3 != blg.cB) continue block5;
                    this.a(iu2, cmz3, blg.cB.s());
                    cmz3 = cmz3.h();
                    if (--n6 > 0) continue;
                    cmz3 = cmz3.c(random.nextInt(5) + 1);
                    n6 = random.nextInt(5);
                }
            }
        }
        return true;
    }
}

