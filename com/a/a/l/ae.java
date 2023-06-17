/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.cl;
import com.a.a.l.af;
import java.util.Comparator;

public final class ae {
    public static final byte a = 64;

    private ae() {
    }

    public static byte a(long l2) {
        byte by2 = (byte)l2;
        if ((long)by2 != l2) {
            throw new IllegalArgumentException("Out of range: " + l2);
        }
        return by2;
    }

    public static byte b(long l2) {
        if (l2 > 127L) {
            return 127;
        }
        if (l2 < -128L) {
            return -128;
        }
        return (byte)l2;
    }

    public static int a(byte by2, byte by3) {
        return by2 - by3;
    }

    public static byte a(byte ... arrby) {
        cl.a(arrby.length > 0);
        byte by2 = arrby[0];
        for (int i2 = 1; i2 < arrby.length; ++i2) {
            if (arrby[i2] >= by2) continue;
            by2 = arrby[i2];
        }
        return by2;
    }

    public static byte b(byte ... arrby) {
        cl.a(arrby.length > 0);
        byte by2 = arrby[0];
        for (int i2 = 1; i2 < arrby.length; ++i2) {
            if (arrby[i2] <= by2) continue;
            by2 = arrby[i2];
        }
        return by2;
    }

    public static String a(String string, byte ... arrby) {
        cl.a(string);
        if (arrby.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(arrby.length * 5);
        stringBuilder.append(arrby[0]);
        for (int i2 = 1; i2 < arrby.length; ++i2) {
            stringBuilder.append(string).append(arrby[i2]);
        }
        return stringBuilder.toString();
    }

    public static Comparator a() {
        return af.a;
    }
}

