/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cy;

public class df {
    private df() {
    }

    public static int a(int[] arrn, int n2, int n3, cy cy2) {
        assert (n3 < n2);
        int n4 = arrn[n3];
        if (cy2 == null) {
            int n5;
            while ((n5 = (n3 << 1) + 1) < n2) {
                int n6 = arrn[n5];
                int n7 = n5 + 1;
                if (n7 < n2 && arrn[n7] < n6) {
                    n5 = n7;
                    n6 = arrn[n5];
                }
                if (n4 > n6) {
                    arrn[n3] = n6;
                    n3 = n5;
                    continue;
                }
                break;
            }
        } else {
            int n8;
            while ((n8 = (n3 << 1) + 1) < n2) {
                int n9 = arrn[n8];
                int n10 = n8 + 1;
                if (n10 < n2 && cy2.a(arrn[n10], n9) < 0) {
                    n8 = n10;
                    n9 = arrn[n8];
                }
                if (cy2.a(n4, n9) > 0) {
                    arrn[n3] = n9;
                    n3 = n8;
                    continue;
                }
                break;
            }
        }
        arrn[n3] = n4;
        return n3;
    }

    public static int b(int[] arrn, int n2, int n3, cy cy2) {
        assert (n3 < n2);
        int n4 = arrn[n3];
        if (cy2 == null) {
            int n5;
            int n6;
            while (n3 != 0 && (n6 = arrn[n5 = n3 - 1 >>> 1]) > n4) {
                arrn[n3] = n6;
                n3 = n5;
            }
        } else {
            int n7;
            int n8;
            while (n3 != 0 && cy2.a(n8 = arrn[n7 = n3 - 1 >>> 1], n4) > 0) {
                arrn[n3] = n8;
                n3 = n7;
            }
        }
        arrn[n3] = n4;
        return n3;
    }

    public static void a(int[] arrn, int n2, cy cy2) {
        int n3 = n2 >>> 1;
        while (n3-- != 0) {
            df.a(arrn, n2, n3, cy2);
        }
    }
}

