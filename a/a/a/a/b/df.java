/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cy;

public class df {
    private df() {
    }

    public static int a(long[] arrl, int n2, int n3, cy cy2) {
        assert (n3 < n2);
        long l2 = arrl[n3];
        if (cy2 == null) {
            int n4;
            while ((n4 = (n3 << 1) + 1) < n2) {
                long l3 = arrl[n4];
                int n5 = n4 + 1;
                if (n5 < n2 && arrl[n5] < l3) {
                    n4 = n5;
                    l3 = arrl[n4];
                }
                if (l2 > l3) {
                    arrl[n3] = l3;
                    n3 = n4;
                    continue;
                }
                break;
            }
        } else {
            int n6;
            while ((n6 = (n3 << 1) + 1) < n2) {
                long l4 = arrl[n6];
                int n7 = n6 + 1;
                if (n7 < n2 && cy2.a(arrl[n7], l4) < 0) {
                    n6 = n7;
                    l4 = arrl[n6];
                }
                if (cy2.a(l2, l4) > 0) {
                    arrl[n3] = l4;
                    n3 = n6;
                    continue;
                }
                break;
            }
        }
        arrl[n3] = l2;
        return n3;
    }

    public static int b(long[] arrl, int n2, int n3, cy cy2) {
        assert (n3 < n2);
        long l2 = arrl[n3];
        if (cy2 == null) {
            int n4;
            long l3;
            while (n3 != 0 && (l3 = arrl[n4 = n3 - 1 >>> 1]) > l2) {
                arrl[n3] = l3;
                n3 = n4;
            }
        } else {
            int n5;
            long l4;
            while (n3 != 0 && cy2.a(l4 = arrl[n5 = n3 - 1 >>> 1], l2) > 0) {
                arrl[n3] = l4;
                n3 = n5;
            }
        }
        arrl[n3] = l2;
        return n3;
    }

    public static void a(long[] arrl, int n2, cy cy2) {
        int n3 = n2 >>> 1;
        while (n3-- != 0) {
            df.a(arrl, n2, n3, cy2);
        }
    }
}

