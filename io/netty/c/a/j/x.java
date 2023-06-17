/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

import io.netty.c.a.j.ak;
import io.netty.c.a.j.am;
import io.netty.c.a.j.ap;
import io.netty.c.a.j.aq;
import io.netty.util.c.ad;

final class x {
    public static final ak a = new ap();
    public static final am b = new aq();
    private static final int d = 16;
    private static final int e = 24;
    private static final int f = 8;
    private static final int g = 255;
    private static final char[] h = new char[]{':', ':'};
    private static final char i = ':';

    private x() {
    }

    public static String a(int n2) {
        return String.valueOf(n2 >> 24 & 0xFF) + '.' + (n2 >> 16 & 0xFF) + '.' + (n2 >> 8 & 0xFF) + '.' + (n2 & 0xFF);
    }

    public static String a(byte[] arrby) {
        assert (arrby.length == 16);
        int n2 = -1;
        int n3 = 0;
        int n4 = 0;
        while (n4 < 8) {
            int n5 = n4 * 2;
            int n6 = 0;
            while (n5 < arrby.length && arrby[n5] == 0 && arrby[n5 + 1] == 0) {
                n5 += 2;
                ++n6;
            }
            if (n6 > n3) {
                n2 = n4;
                n3 = n6;
            }
            n4 = n5 / 2 + 1;
        }
        if (n2 == -1 || n3 < 2) {
            return x.b(arrby);
        }
        StringBuilder stringBuilder = new StringBuilder(39);
        x.a(stringBuilder, arrby, 0, n2);
        stringBuilder.append(h);
        x.a(stringBuilder, arrby, n2 + n3, 8);
        return stringBuilder.toString();
    }

    public static String b(byte[] arrby) {
        assert (arrby.length == 16);
        StringBuilder stringBuilder = new StringBuilder(39);
        x.a(stringBuilder, arrby, 0, 8);
        return stringBuilder.toString();
    }

    private static void a(StringBuilder stringBuilder, byte[] arrby, int n2, int n3) {
        int n4;
        for (n4 = n2; n4 < --n3; ++n4) {
            x.a(stringBuilder, arrby, n4);
            stringBuilder.append(':');
        }
        x.a(stringBuilder, arrby, n4);
    }

    private static void a(StringBuilder stringBuilder, byte[] arrby, int n2) {
        ad.b(stringBuilder, arrby, n2 << 1, 2);
    }
}

