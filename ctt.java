/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class ctt {
    public static int a(List list) {
        int n2 = 0;
        int n3 = list.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            bsq bsq2 = (bsq)list.get(i2);
            n2 += bsq2.c;
        }
        return n2;
    }

    public static bsq a(Random random, List list, int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException();
        }
        int n3 = random.nextInt(n2);
        return ctt.a(list, n3);
    }

    public static bsq a(List list, int n2) {
        int n3 = list.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            bsq bsq2 = (bsq)list.get(i2);
            if ((n2 -= bsq2.c) >= 0) continue;
            return bsq2;
        }
        return null;
    }

    public static bsq a(Random random, List list) {
        return ctt.a(random, list, ctt.a(list));
    }
}

