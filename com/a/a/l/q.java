/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.ak;
import com.a.a.b.cl;
import com.a.a.l.r;
import com.a.a.l.s;
import com.a.a.l.t;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class q {
    public static final int a = 4;
    public static final int b = 0x40000000;
    private static final byte[] c;

    private q() {
    }

    public static int a(int n2) {
        return n2;
    }

    public static int a(long l2) {
        int n2 = (int)l2;
        if ((long)n2 != l2) {
            throw new IllegalArgumentException("Out of range: " + l2);
        }
        return n2;
    }

    public static int b(long l2) {
        if (l2 > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (l2 < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)l2;
    }

    public static int a(int n2, int n3) {
        return n2 < n3 ? -1 : (n2 > n3 ? 1 : 0);
    }

    public static boolean a(int[] arrn, int n2) {
        for (int n3 : arrn) {
            if (n3 != n2) continue;
            return true;
        }
        return false;
    }

    public static int b(int[] arrn, int n2) {
        return q.c(arrn, n2, 0, arrn.length);
    }

    private static int c(int[] arrn, int n2, int n3, int n4) {
        for (int i2 = n3; i2 < n4; ++i2) {
            if (arrn[i2] != n2) continue;
            return i2;
        }
        return -1;
    }

    public static int a(int[] arrn, int[] arrn2) {
        cl.a(arrn, (Object)"array");
        cl.a(arrn2, (Object)"target");
        if (arrn2.length == 0) {
            return 0;
        }
        block0: for (int i2 = 0; i2 < arrn.length - arrn2.length + 1; ++i2) {
            for (int i3 = 0; i3 < arrn2.length; ++i3) {
                if (arrn[i2 + i3] != arrn2[i3]) continue block0;
            }
            return i2;
        }
        return -1;
    }

    public static int c(int[] arrn, int n2) {
        return q.d(arrn, n2, 0, arrn.length);
    }

    private static int d(int[] arrn, int n2, int n3, int n4) {
        for (int i2 = n4 - 1; i2 >= n3; --i2) {
            if (arrn[i2] != n2) continue;
            return i2;
        }
        return -1;
    }

    public static int a(int ... arrn) {
        cl.a(arrn.length > 0);
        int n2 = arrn[0];
        for (int i2 = 1; i2 < arrn.length; ++i2) {
            if (arrn[i2] >= n2) continue;
            n2 = arrn[i2];
        }
        return n2;
    }

    public static int b(int ... arrn) {
        cl.a(arrn.length > 0);
        int n2 = arrn[0];
        for (int i2 = 1; i2 < arrn.length; ++i2) {
            if (arrn[i2] <= n2) continue;
            n2 = arrn[i2];
        }
        return n2;
    }

    public static int[] a(int[] ... arrn) {
        int n2 = 0;
        for (int[] arrn2 : arrn) {
            n2 += arrn2.length;
        }
        int[] arrn3 = new int[n2];
        int n3 = 0;
        for (int[] arrn4 : arrn) {
            System.arraycopy(arrn4, 0, arrn3, n3, arrn4.length);
            n3 += arrn4.length;
        }
        return arrn3;
    }

    public static byte[] b(int n2) {
        return new byte[]{(byte)(n2 >> 24), (byte)(n2 >> 16), (byte)(n2 >> 8), (byte)n2};
    }

    public static int a(byte[] arrby) {
        cl.a(arrby.length >= 4, "array too small: %s < %s", new Object[]{arrby.length, 4});
        return q.a(arrby[0], arrby[1], arrby[2], arrby[3]);
    }

    public static int a(byte by2, byte by3, byte by4, byte by5) {
        return by2 << 24 | (by3 & 0xFF) << 16 | (by4 & 0xFF) << 8 | by5 & 0xFF;
    }

    public static ak a() {
        return s.a;
    }

    public static int[] a(int[] arrn, int n2, int n3) {
        cl.a(n2 >= 0, "Invalid minLength: %s", new Object[]{n2});
        cl.a(n3 >= 0, "Invalid padding: %s", new Object[]{n3});
        return arrn.length < n2 ? q.d(arrn, n2 + n3) : arrn;
    }

    private static int[] d(int[] arrn, int n2) {
        int[] arrn2 = new int[n2];
        System.arraycopy(arrn, 0, arrn2, 0, Math.min(arrn.length, n2));
        return arrn2;
    }

    public static String a(String string, int ... arrn) {
        cl.a(string);
        if (arrn.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(arrn.length * 5);
        stringBuilder.append(arrn[0]);
        for (int i2 = 1; i2 < arrn.length; ++i2) {
            stringBuilder.append(string).append(arrn[i2]);
        }
        return stringBuilder.toString();
    }

    public static Comparator b() {
        return t.a;
    }

    public static int[] a(Collection collection) {
        if (collection instanceof r) {
            return ((r)collection).a();
        }
        Object[] arrobject = collection.toArray();
        int n2 = arrobject.length;
        int[] arrn = new int[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrn[i2] = ((Number)cl.a(arrobject[i2])).intValue();
        }
        return arrn;
    }

    public static List c(int ... arrn) {
        if (arrn.length == 0) {
            return Collections.emptyList();
        }
        return new r(arrn);
    }

    private static int a(char c2) {
        return c2 < '\u0080' ? c[c2] : -1;
    }

    public static Integer a(String string) {
        return q.a(string, 10);
    }

    static Integer a(String string, int n2) {
        int n3;
        int n4;
        if (((String)cl.a(string)).isEmpty()) {
            return null;
        }
        if (n2 < 2 || n2 > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + n2);
        }
        boolean bl2 = string.charAt(0) == '-';
        int n5 = n4 = bl2 ? 1 : 0;
        if (n4 == string.length()) {
            return null;
        }
        if ((n3 = q.a(string.charAt(n4++))) < 0 || n3 >= n2) {
            return null;
        }
        int n6 = -n3;
        int n7 = Integer.MIN_VALUE / n2;
        while (n4 < string.length()) {
            if ((n3 = q.a(string.charAt(n4++))) < 0 || n3 >= n2 || n6 < n7) {
                return null;
            }
            if ((n6 *= n2) < Integer.MIN_VALUE + n3) {
                return null;
            }
            n6 -= n3;
        }
        if (bl2) {
            return n6;
        }
        if (n6 == Integer.MIN_VALUE) {
            return null;
        }
        return -n6;
    }

    static /* synthetic */ int a(int[] arrn, int n2, int n3, int n4) {
        return q.c(arrn, n2, n3, n4);
    }

    static /* synthetic */ int b(int[] arrn, int n2, int n3, int n4) {
        return q.d(arrn, n2, n3, n4);
    }

    static {
        int n2;
        c = new byte[128];
        Arrays.fill(c, (byte)-1);
        for (n2 = 0; n2 <= 9; ++n2) {
            q.c[48 + n2] = (byte)n2;
        }
        for (n2 = 0; n2 <= 26; ++n2) {
            q.c[65 + n2] = (byte)(10 + n2);
            q.c[97 + n2] = (byte)(10 + n2);
        }
    }
}

