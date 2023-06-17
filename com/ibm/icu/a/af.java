/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

public class af {
    public static final long a = -184303902528000000L;
    public static final long b = 183882168921600000L;
    public static final int c = 1000;
    public static final int d = 60000;
    public static final int e = 3600000;
    public static final int f = 86400000;
    private static final int g = 1721426;
    private static final int h = 2440588;
    private static final int[] i = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] j = new int[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};

    public static final boolean a(int n2) {
        return (n2 & 3) == 0 && (n2 % 100 != 0 || n2 % 400 == 0);
    }

    public static final int a(int n2, int n3) {
        return i[n3 + (af.a(n2) ? 12 : 0)];
    }

    public static final int b(int n2, int n3) {
        return n3 > 0 ? af.a(n2, n3 - 1) : 31;
    }

    public static long a(int n2, int n3, int n4) {
        int n5 = n2 - 1;
        long l2 = (long)(365 * n5) + af.a((long)n5, 4L) + 1721423L + af.a((long)n5, 400L) - af.a((long)n5, 100L) + 2L + (long)j[n3 + (af.a(n2) ? 12 : 0)] + (long)n4;
        return l2 - 2440588L;
    }

    public static int a(long l2) {
        long[] arrl = new long[1];
        af.a(l2 + 5L, 7L, arrl);
        int n2 = (int)arrl[0];
        n2 = n2 == 0 ? 7 : n2;
        return n2;
    }

    public static int[] a(long l2, int[] arrn) {
        int n2;
        if (arrn == null || arrn.length < 5) {
            arrn = new int[5];
        }
        long[] arrl = new long[1];
        long l3 = af.a(l2 += 719162L, 146097L, arrl);
        long l4 = af.a(arrl[0], 36524L, arrl);
        long l5 = af.a(arrl[0], 1461L, arrl);
        long l6 = af.a(arrl[0], 365L, arrl);
        int n3 = (int)(400L * l3 + 100L * l4 + 4L * l5 + l6);
        int n4 = (int)arrl[0];
        if (l4 == 4L || l6 == 4L) {
            n4 = 365;
        } else {
            ++n3;
        }
        boolean bl2 = af.a(n3);
        int n5 = 0;
        int n6 = n2 = bl2 ? 60 : 59;
        if (n4 >= n2) {
            n5 = bl2 ? 1 : 2;
        }
        int n7 = (12 * (n4 + n5) + 6) / 367;
        int n8 = n4 - j[bl2 ? n7 + 12 : n7] + 1;
        int n9 = (int)((l2 + 2L) % 7L);
        if (n9 < 1) {
            n9 += 7;
        }
        arrn[0] = n3;
        arrn[1] = n7;
        arrn[2] = n8;
        arrn[3] = n9;
        arrn[4] = ++n4;
        return arrn;
    }

    public static int[] b(long l2, int[] arrn) {
        if (arrn == null || arrn.length < 6) {
            arrn = new int[6];
        }
        long[] arrl = new long[1];
        long l3 = af.a(l2, 86400000L, arrl);
        af.a(l3, arrn);
        arrn[5] = (int)arrl[0];
        return arrn;
    }

    public static long a(long l2, long l3) {
        return l2 >= 0L ? l2 / l3 : (l2 + 1L) / l3 - 1L;
    }

    private static long a(long l2, long l3, long[] arrl) {
        if (l2 >= 0L) {
            arrl[0] = l2 % l3;
            return l2 / l3;
        }
        long l4 = (l2 + 1L) / l3 - 1L;
        arrl[0] = l2 - l4 * l3;
        return l4;
    }

    public static int b(int n2, int n3, int n4) {
        int n5 = (n4 + 6) / 7;
        if (n5 == 4) {
            if (n4 + 7 > af.a(n2, n3)) {
                n5 = -1;
            }
        } else if (n5 == 5) {
            n5 = -1;
        }
        return n5;
    }
}

