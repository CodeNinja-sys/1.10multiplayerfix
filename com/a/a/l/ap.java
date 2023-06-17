/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.cl;
import com.a.a.l.aq;
import com.a.a.l.u;
import com.a.a.l.y;
import java.math.BigInteger;
import java.util.Comparator;

public final class ap {
    public static final long a = -1L;
    private static final long[] b = new long[37];
    private static final int[] c = new int[37];
    private static final int[] d = new int[37];

    private ap() {
    }

    private static long b(long l2) {
        return l2 ^ Long.MIN_VALUE;
    }

    public static int a(long l2, long l3) {
        return u.a(ap.b(l2), ap.b(l3));
    }

    public static long a(long ... arrl) {
        cl.a(arrl.length > 0);
        long l2 = ap.b(arrl[0]);
        for (int i2 = 1; i2 < arrl.length; ++i2) {
            long l3 = ap.b(arrl[i2]);
            if (l3 >= l2) continue;
            l2 = l3;
        }
        return ap.b(l2);
    }

    public static long b(long ... arrl) {
        cl.a(arrl.length > 0);
        long l2 = ap.b(arrl[0]);
        for (int i2 = 1; i2 < arrl.length; ++i2) {
            long l3 = ap.b(arrl[i2]);
            if (l3 <= l2) continue;
            l2 = l3;
        }
        return ap.b(l2);
    }

    public static String a(String string, long ... arrl) {
        cl.a(string);
        if (arrl.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(arrl.length * 5);
        stringBuilder.append(ap.a(arrl[0]));
        for (int i2 = 1; i2 < arrl.length; ++i2) {
            stringBuilder.append(string).append(ap.a(arrl[i2]));
        }
        return stringBuilder.toString();
    }

    public static Comparator a() {
        return aq.a;
    }

    public static long b(long l2, long l3) {
        long l4;
        if (l3 < 0L) {
            if (ap.a(l2, l3) < 0) {
                return 0L;
            }
            return 1L;
        }
        if (l2 >= 0L) {
            return l2 / l3;
        }
        long l5 = l2 - (l4 = (l2 >>> 1) / l3 << 1) * l3;
        return l4 + (long)(ap.a(l5, l3) >= 0 ? 1 : 0);
    }

    public static long c(long l2, long l3) {
        long l4;
        if (l3 < 0L) {
            if (ap.a(l2, l3) < 0) {
                return l2;
            }
            return l2 - l3;
        }
        if (l2 >= 0L) {
            return l2 % l3;
        }
        long l5 = (l2 >>> 1) / l3 << 1;
        return l4 - (ap.a(l4 = l2 - l5 * l3, l3) >= 0 ? l3 : 0L);
    }

    public static long a(String string) {
        return ap.a(string, 10);
    }

    public static long b(String string) {
        y y2 = y.a(string);
        try {
            return ap.a(y2.a, y2.b);
        }
        catch (NumberFormatException numberFormatException) {
            NumberFormatException numberFormatException2 = new NumberFormatException("Error parsing value: " + string);
            numberFormatException2.initCause(numberFormatException);
            throw numberFormatException2;
        }
    }

    public static long a(String string, int n2) {
        cl.a(string);
        if (string.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        if (n2 < 2 || n2 > 36) {
            throw new NumberFormatException("illegal radix: " + n2);
        }
        int n3 = d[n2] - 1;
        long l2 = 0L;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            int n4 = Character.digit(string.charAt(i2), n2);
            if (n4 == -1) {
                throw new NumberFormatException(string);
            }
            if (i2 > n3 && ap.a(l2, n4, n2)) {
                throw new NumberFormatException("Too large for unsigned long: " + string);
            }
            l2 = l2 * (long)n2 + (long)n4;
        }
        return l2;
    }

    private static boolean a(long l2, int n2, int n3) {
        if (l2 >= 0L) {
            if (l2 < b[n3]) {
                return false;
            }
            if (l2 > b[n3]) {
                return true;
            }
            return n2 > c[n3];
        }
        return true;
    }

    public static String a(long l2) {
        return ap.a(l2, 10);
    }

    public static String a(long l2, int n2) {
        cl.a(n2 >= 2 && n2 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", new Object[]{n2});
        if (l2 == 0L) {
            return "0";
        }
        char[] arrc = new char[64];
        int n3 = arrc.length;
        if (l2 < 0L) {
            long l3 = ap.b(l2, (long)n2);
            long l4 = l2 - l3 * (long)n2;
            arrc[--n3] = Character.forDigit((int)l4, n2);
            l2 = l3;
        }
        while (l2 > 0L) {
            arrc[--n3] = Character.forDigit((int)(l2 % (long)n2), n2);
            l2 /= (long)n2;
        }
        return new String(arrc, n3, arrc.length - n3);
    }

    static {
        BigInteger bigInteger = new BigInteger("10000000000000000", 16);
        for (int i2 = 2; i2 <= 36; ++i2) {
            ap.b[i2] = ap.b(-1L, (long)i2);
            ap.c[i2] = (int)ap.c(-1L, i2);
            ap.d[i2] = bigInteger.toString(i2).length() - 1;
        }
    }
}

