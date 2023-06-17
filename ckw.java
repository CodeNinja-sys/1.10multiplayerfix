/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class ckw {
    private static final Random a = new Random();

    public static void a(iu iu2, cmz cmz2, tb tb2) {
        ckw.a(iu2, (double)cmz2.a(), (double)cmz2.b(), (double)cmz2.c(), tb2);
    }

    public static void a(iu iu2, cpk cpk2, tb tb2) {
        ckw.a(iu2, cpk2.aU, cpk2.aV, cpk2.aW, tb2);
    }

    private static void a(iu iu2, double d2, double d3, double d4, tb tb2) {
        for (int i2 = 0; i2 < tb2.aI_(); ++i2) {
            bhl bhl2 = tb2.a(i2);
            if (bhl2 == null) continue;
            ckw.a(iu2, d2, d3, d4, bhl2);
        }
    }

    public static void a(iu iu2, double d2, double d3, double d4, bhl bhl2) {
        float f2 = a.nextFloat() * 0.8f + 0.1f;
        float f3 = a.nextFloat() * 0.8f + 0.1f;
        float f4 = a.nextFloat() * 0.8f + 0.1f;
        while (bhl2.b > 0) {
            int n2 = a.nextInt(21) + 10;
            if (n2 > bhl2.b) {
                n2 = bhl2.b;
            }
            bhl2.b -= n2;
            er er2 = new er(iu2, d2 + (double)f2, d3 + (double)f3, d4 + (double)f4, new bhl(bhl2.a(), n2, bhl2.h()));
            if (bhl2.n()) {
                er2.h().d(bhl2.o().d());
            }
            float f5 = 0.05f;
            er2.aX = a.nextGaussian() * (double)0.05f;
            er2.aY = a.nextGaussian() * (double)0.05f + (double)0.2f;
            er2.aZ = a.nextGaussian() * (double)0.05f;
            iu2.b(er2);
        }
    }
}

