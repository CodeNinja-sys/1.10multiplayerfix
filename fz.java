/*
 * Decompiled with CFR 0.150.
 */
public class fz {
    private static final Integer[] a = new Integer[65535];

    public static Integer a(int n2) {
        if (n2 > 0 && n2 < a.length) {
            return a[n2];
        }
        return n2;
    }

    static {
        int n2 = a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            fz.a[i2] = i2;
        }
    }
}

