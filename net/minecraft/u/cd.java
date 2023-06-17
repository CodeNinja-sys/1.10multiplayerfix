/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import java.util.List;
import java.util.Random;
import net.minecraft.u.ce;

public class cd {
    public static int a(List list) {
        int n2 = 0;
        int n3 = list.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            ce ce2 = (ce)list.get(i2);
            n2 += ce2.d;
        }
        return n2;
    }

    public static ce a(Random random, List list, int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException();
        }
        int n3 = random.nextInt(n2);
        return cd.a(list, n3);
    }

    public static ce a(List list, int n2) {
        int n3 = list.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            ce ce2 = (ce)list.get(i2);
            if ((n2 -= ce2.d) >= 0) continue;
            return ce2;
        }
        return null;
    }

    public static ce a(Random random, List list) {
        return cd.a(random, list, cd.a(list));
    }
}

