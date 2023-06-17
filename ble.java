/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class ble {
    private static amj a = amj.a;

    public static amj a(cfl cfl2, int n2, int n3) {
        return ble.c(cfl2, n2, n3, null);
    }

    public static amj a(cfl cfl2, int n2, int n3, amj amj2) {
        a = amj2.a(cfl2.aU, cfl2.aV, cfl2.aW);
        return ble.c(cfl2, n2, n3, a);
    }

    public static amj b(cfl cfl2, int n2, int n3, amj amj2) {
        a = new amj(cfl2.aU, cfl2.aV, cfl2.aW).d(amj2);
        return ble.c(cfl2, n2, n3, a);
    }

    private static amj c(cfl cfl2, int n2, int n3, amj amj2) {
        double d2;
        double d3;
        dct dct2 = cfl2.ap();
        Random random = cfl2.aW();
        boolean bl2 = false;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        float f2 = -99999.0f;
        boolean bl3 = cfl2.bP() ? (d3 = cfl2.aU().d((double)cmk.c(cfl2.aU), (double)cmk.c(cfl2.aV), (double)cmk.c(cfl2.aW)) + 4.0) < (d2 = (double)(cfl2.bN() + (float)n2)) * d2 : false;
        for (int i2 = 0; i2 < 10; ++i2) {
            float f3;
            cmz cmz2;
            int n7 = random.nextInt(2 * n2 + 1) - n2;
            int n8 = random.nextInt(2 * n3 + 1) - n3;
            int n9 = random.nextInt(2 * n2 + 1) - n2;
            if (amj2 != null && (double)n7 * amj2.b + (double)n9 * amj2.d < 0.0) continue;
            if (cfl2.bP() && n2 > 1) {
                cmz2 = cfl2.aU();
                n7 = cfl2.aU > (double)cmz2.a() ? (n7 -= random.nextInt(n2 / 2)) : (n7 += random.nextInt(n2 / 2));
                n9 = cfl2.aW > (double)cmz2.c() ? (n9 -= random.nextInt(n2 / 2)) : (n9 += random.nextInt(n2 / 2));
            }
            cmz2 = new cmz((double)n7 + cfl2.aU, (double)n8 + cfl2.aV, (double)n9 + cfl2.aW);
            if (bl3 && !cfl2.d(cmz2) || !dct2.a(cmz2) || !((f3 = cfl2.a(cmz2)) > f2)) continue;
            f2 = f3;
            n4 = n7;
            n5 = n8;
            n6 = n9;
            bl2 = true;
        }
        if (bl2) {
            return new amj((double)n4 + cfl2.aU, (double)n5 + cfl2.aV, (double)n6 + cfl2.aW);
        }
        return null;
    }
}

