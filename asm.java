/*
 * Decompiled with CFR 0.150.
 */
public class asm {
    private static int[] a = new int[65536];

    public static void a(int[] arrn) {
        a = arrn;
    }

    public static int a(double d2, double d3) {
        int n2 = (int)((1.0 - (d3 *= d2)) * 255.0);
        int n3 = (int)((1.0 - d2) * 255.0);
        int n4 = n2 << 8 | n3;
        if (n4 > a.length) {
            return -65281;
        }
        return a[n4];
    }
}

