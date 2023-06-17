/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cn;
import java.util.Random;

public class nj
extends to {
    private static final ail a = ail.a(blg.m).a(bhg.a, cn.a((Object)aac.a));
    private final dbk b = blg.U.s().a(jo.b, (Comparable)((Object)cev.b)).a(bnr.c, (Comparable)((Object)dew.b));
    private final dbk c = blg.A.s();
    private final dbk d = blg.i.s();

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        int n2;
        int n3;
        int n4;
        while (iu2.c(cmz2) && cmz2.b() > 2) {
            cmz2 = cmz2.h();
        }
        if (!a.a(iu2.n(cmz2))) {
            return false;
        }
        for (n4 = -2; n4 <= 2; ++n4) {
            for (n3 = -2; n3 <= 2; ++n3) {
                if (!iu2.c(cmz2.e(n4, -1, n3)) || !iu2.c(cmz2.e(n4, -2, n3))) continue;
                return false;
            }
        }
        for (n4 = -1; n4 <= 0; ++n4) {
            for (n3 = -2; n3 <= 2; ++n3) {
                for (int i2 = -2; i2 <= 2; ++i2) {
                    iu2.a(cmz2.e(n3, n4, i2), this.c, 2);
                }
            }
        }
        iu2.a(cmz2, this.d, 2);
        for (bqk bqk2 : afj.a) {
            iu2.a(cmz2.c(bqk2), this.d, 2);
        }
        for (n2 = -2; n2 <= 2; ++n2) {
            for (int i3 = -2; i3 <= 2; ++i3) {
                if (n2 != -2 && n2 != 2 && i3 != -2 && i3 != 2) continue;
                iu2.a(cmz2.e(n2, 1, i3), this.c, 2);
            }
        }
        iu2.a(cmz2.e(2, 1, 0), this.b, 2);
        iu2.a(cmz2.e(-2, 1, 0), this.b, 2);
        iu2.a(cmz2.e(0, 1, 2), this.b, 2);
        iu2.a(cmz2.e(0, 1, -2), this.b, 2);
        for (n2 = -1; n2 <= 1; ++n2) {
            for (int i4 = -1; i4 <= 1; ++i4) {
                if (n2 == 0 && i4 == 0) {
                    iu2.a(cmz2.e(n2, 4, i4), this.c, 2);
                    continue;
                }
                iu2.a(cmz2.e(n2, 4, i4), this.b, 2);
            }
        }
        for (n2 = 1; n2 <= 3; ++n2) {
            iu2.a(cmz2.e(-1, n2, -1), this.c, 2);
            iu2.a(cmz2.e(-1, n2, 1), this.c, 2);
            iu2.a(cmz2.e(1, n2, -1), this.c, 2);
            iu2.a(cmz2.e(1, n2, 1), this.c, 2);
        }
        return true;
    }
}

