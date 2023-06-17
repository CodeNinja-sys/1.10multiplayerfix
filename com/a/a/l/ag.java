/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.cl;
import com.a.a.l.ah;
import com.a.a.l.ai;
import java.util.Comparator;

public final class ag {
    public static final byte a = -128;
    public static final byte b = -1;
    private static final int c = 255;

    private ag() {
    }

    public static int a(byte by2) {
        return by2 & 0xFF;
    }

    public static byte a(long l2) {
        if (l2 >> 8 != 0L) {
            throw new IllegalArgumentException("Out of range: " + l2);
        }
        return (byte)l2;
    }

    public static byte b(long l2) {
        if (l2 > (long)ag.a((byte)-1)) {
            return -1;
        }
        if (l2 < 0L) {
            return 0;
        }
        return (byte)l2;
    }

    public static int a(byte by2, byte by3) {
        return ag.a(by2) - ag.a(by3);
    }

    public static byte a(byte ... arrby) {
        cl.a(arrby.length > 0);
        int n2 = ag.a(arrby[0]);
        for (int i2 = 1; i2 < arrby.length; ++i2) {
            int n3 = ag.a(arrby[i2]);
            if (n3 >= n2) continue;
            n2 = n3;
        }
        return (byte)n2;
    }

    public static byte b(byte ... arrby) {
        cl.a(arrby.length > 0);
        int n2 = ag.a(arrby[0]);
        for (int i2 = 1; i2 < arrby.length; ++i2) {
            int n3 = ag.a(arrby[i2]);
            if (n3 <= n2) continue;
            n2 = n3;
        }
        return (byte)n2;
    }

    public static String b(byte by2) {
        return ag.a(by2, 10);
    }

    public static String a(byte by2, int n2) {
        cl.a(n2 >= 2 && n2 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", new Object[]{n2});
        return Integer.toString(ag.a(by2), n2);
    }

    public static byte a(String string) {
        return ag.a(string, 10);
    }

    public static byte a(String string, int n2) {
        int n3 = Integer.parseInt((String)cl.a(string), n2);
        if (n3 >> 8 == 0) {
            return (byte)n3;
        }
        throw new NumberFormatException("out of range: " + n3);
    }

    public static String a(String string, byte ... arrby) {
        cl.a(string);
        if (arrby.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(arrby.length * (3 + string.length()));
        stringBuilder.append(ag.a(arrby[0]));
        for (int i2 = 1; i2 < arrby.length; ++i2) {
            stringBuilder.append(string).append(ag.b(arrby[i2]));
        }
        return stringBuilder.toString();
    }

    public static Comparator a() {
        return ah.b;
    }

    static Comparator b() {
        return ai.a;
    }
}

