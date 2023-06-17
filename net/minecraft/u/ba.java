/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

public class ba {
    private static final Integer[] a = new Integer[65535];

    static {
        int n2 = a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ba.a[i2] = i2;
        }
    }

    public static Integer a(int n2) {
        return n2 > 0 && n2 < a.length ? a[n2] : Integer.valueOf(n2);
    }
}

