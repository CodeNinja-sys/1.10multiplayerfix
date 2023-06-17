/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.ak;
import com.a.a.b.cl;
import com.a.a.l.v;
import com.a.a.l.w;
import com.a.a.l.x;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class u {
    public static final int a = 8;
    public static final long b = 0x4000000000000000L;

    private u() {
    }

    public static int a(long l2) {
        return (int)(l2 ^ l2 >>> 32);
    }

    public static int a(long l2, long l3) {
        return l2 < l3 ? -1 : (l2 > l3 ? 1 : 0);
    }

    public static boolean a(long[] arrl, long l2) {
        for (long l3 : arrl) {
            if (l3 != l2) continue;
            return true;
        }
        return false;
    }

    public static int b(long[] arrl, long l2) {
        return u.c(arrl, l2, 0, arrl.length);
    }

    private static int c(long[] arrl, long l2, int n2, int n3) {
        for (int i2 = n2; i2 < n3; ++i2) {
            if (arrl[i2] != l2) continue;
            return i2;
        }
        return -1;
    }

    public static int a(long[] arrl, long[] arrl2) {
        cl.a(arrl, (Object)"array");
        cl.a(arrl2, (Object)"target");
        if (arrl2.length == 0) {
            return 0;
        }
        block0: for (int i2 = 0; i2 < arrl.length - arrl2.length + 1; ++i2) {
            for (int i3 = 0; i3 < arrl2.length; ++i3) {
                if (arrl[i2 + i3] != arrl2[i3]) continue block0;
            }
            return i2;
        }
        return -1;
    }

    public static int c(long[] arrl, long l2) {
        return u.d(arrl, l2, 0, arrl.length);
    }

    private static int d(long[] arrl, long l2, int n2, int n3) {
        for (int i2 = n3 - 1; i2 >= n2; --i2) {
            if (arrl[i2] != l2) continue;
            return i2;
        }
        return -1;
    }

    public static long a(long ... arrl) {
        cl.a(arrl.length > 0);
        long l2 = arrl[0];
        for (int i2 = 1; i2 < arrl.length; ++i2) {
            if (arrl[i2] >= l2) continue;
            l2 = arrl[i2];
        }
        return l2;
    }

    public static long b(long ... arrl) {
        cl.a(arrl.length > 0);
        long l2 = arrl[0];
        for (int i2 = 1; i2 < arrl.length; ++i2) {
            if (arrl[i2] <= l2) continue;
            l2 = arrl[i2];
        }
        return l2;
    }

    public static long[] a(long[] ... arrl) {
        int n2 = 0;
        for (long[] arrl2 : arrl) {
            n2 += arrl2.length;
        }
        long[] arrl3 = new long[n2];
        int n3 = 0;
        for (long[] arrl4 : arrl) {
            System.arraycopy(arrl4, 0, arrl3, n3, arrl4.length);
            n3 += arrl4.length;
        }
        return arrl3;
    }

    public static byte[] b(long l2) {
        byte[] arrby = new byte[8];
        for (int i2 = 7; i2 >= 0; --i2) {
            arrby[i2] = (byte)(l2 & 0xFFL);
            l2 >>= 8;
        }
        return arrby;
    }

    public static long a(byte[] arrby) {
        cl.a(arrby.length >= 8, "array too small: %s < %s", new Object[]{arrby.length, 8});
        return u.a(arrby[0], arrby[1], arrby[2], arrby[3], arrby[4], arrby[5], arrby[6], arrby[7]);
    }

    public static long a(byte by2, byte by3, byte by4, byte by5, byte by6, byte by7, byte by8, byte by9) {
        return ((long)by2 & 0xFFL) << 56 | ((long)by3 & 0xFFL) << 48 | ((long)by4 & 0xFFL) << 40 | ((long)by5 & 0xFFL) << 32 | ((long)by6 & 0xFFL) << 24 | ((long)by7 & 0xFFL) << 16 | ((long)by8 & 0xFFL) << 8 | (long)by9 & 0xFFL;
    }

    public static Long a(String string) {
        int n2;
        int n3;
        if (((String)cl.a(string)).isEmpty()) {
            return null;
        }
        boolean bl2 = string.charAt(0) == '-';
        int n4 = n3 = bl2 ? 1 : 0;
        if (n3 == string.length()) {
            return null;
        }
        if ((n2 = string.charAt(n3++) - 48) < 0 || n2 > 9) {
            return null;
        }
        long l2 = -n2;
        while (n3 < string.length()) {
            if ((n2 = string.charAt(n3++) - 48) < 0 || n2 > 9 || l2 < -922337203685477580L) {
                return null;
            }
            if ((l2 *= 10L) < Long.MIN_VALUE + (long)n2) {
                return null;
            }
            l2 -= (long)n2;
        }
        if (bl2) {
            return l2;
        }
        if (l2 == Long.MIN_VALUE) {
            return null;
        }
        return -l2;
    }

    public static ak a() {
        return x.a;
    }

    public static long[] a(long[] arrl, int n2, int n3) {
        cl.a(n2 >= 0, "Invalid minLength: %s", new Object[]{n2});
        cl.a(n3 >= 0, "Invalid padding: %s", new Object[]{n3});
        return arrl.length < n2 ? u.a(arrl, n2 + n3) : arrl;
    }

    private static long[] a(long[] arrl, int n2) {
        long[] arrl2 = new long[n2];
        System.arraycopy(arrl, 0, arrl2, 0, Math.min(arrl.length, n2));
        return arrl2;
    }

    public static String a(String string, long ... arrl) {
        cl.a(string);
        if (arrl.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(arrl.length * 10);
        stringBuilder.append(arrl[0]);
        for (int i2 = 1; i2 < arrl.length; ++i2) {
            stringBuilder.append(string).append(arrl[i2]);
        }
        return stringBuilder.toString();
    }

    public static Comparator b() {
        return v.a;
    }

    public static long[] a(Collection collection) {
        if (collection instanceof w) {
            return ((w)collection).a();
        }
        Object[] arrobject = collection.toArray();
        int n2 = arrobject.length;
        long[] arrl = new long[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrl[i2] = ((Number)cl.a(arrobject[i2])).longValue();
        }
        return arrl;
    }

    public static List c(long ... arrl) {
        if (arrl.length == 0) {
            return Collections.emptyList();
        }
        return new w(arrl);
    }

    static /* synthetic */ int a(long[] arrl, long l2, int n2, int n3) {
        return u.c(arrl, l2, n2, n3);
    }

    static /* synthetic */ int b(long[] arrl, long l2, int n2, int n3) {
        return u.d(arrl, l2, n2, n3);
    }
}

