/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.cl;
import com.a.a.l.an;
import com.a.a.l.q;
import com.a.a.l.y;
import java.util.Comparator;

public final class am {
    static final long a = 0xFFFFFFFFL;

    private am() {
    }

    static int a(int n2) {
        return n2 ^ Integer.MIN_VALUE;
    }

    public static int a(int n2, int n3) {
        return q.a(am.a(n2), am.a(n3));
    }

    public static long b(int n2) {
        return (long)n2 & 0xFFFFFFFFL;
    }

    public static int a(int ... arrn) {
        cl.a(arrn.length > 0);
        int n2 = am.a(arrn[0]);
        for (int i2 = 1; i2 < arrn.length; ++i2) {
            int n3 = am.a(arrn[i2]);
            if (n3 >= n2) continue;
            n2 = n3;
        }
        return am.a(n2);
    }

    public static int b(int ... arrn) {
        cl.a(arrn.length > 0);
        int n2 = am.a(arrn[0]);
        for (int i2 = 1; i2 < arrn.length; ++i2) {
            int n3 = am.a(arrn[i2]);
            if (n3 <= n2) continue;
            n2 = n3;
        }
        return am.a(n2);
    }

    public static String a(String string, int ... arrn) {
        cl.a(string);
        if (arrn.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(arrn.length * 5);
        stringBuilder.append(am.c(arrn[0]));
        for (int i2 = 1; i2 < arrn.length; ++i2) {
            stringBuilder.append(string).append(am.c(arrn[i2]));
        }
        return stringBuilder.toString();
    }

    public static Comparator a() {
        return an.a;
    }

    public static int b(int n2, int n3) {
        return (int)(am.b(n2) / am.b(n3));
    }

    public static int c(int n2, int n3) {
        return (int)(am.b(n2) % am.b(n3));
    }

    public static int a(String string) {
        y y2 = y.a(string);
        try {
            return am.a(y2.a, y2.b);
        }
        catch (NumberFormatException numberFormatException) {
            NumberFormatException numberFormatException2 = new NumberFormatException("Error parsing value: " + string);
            numberFormatException2.initCause(numberFormatException);
            throw numberFormatException2;
        }
    }

    public static int b(String string) {
        return am.a(string, 10);
    }

    public static int a(String string, int n2) {
        cl.a(string);
        long l2 = Long.parseLong(string, n2);
        if ((l2 & 0xFFFFFFFFL) != l2) {
            throw new NumberFormatException("Input " + string + " in base " + n2 + " is not in the range of an unsigned integer");
        }
        return (int)l2;
    }

    public static String c(int n2) {
        return am.d(n2, 10);
    }

    public static String d(int n2, int n3) {
        long l2 = (long)n2 & 0xFFFFFFFFL;
        return Long.toString(l2, n3);
    }
}

