/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import io.netty.util.ab;
import io.netty.util.ad;

public class d {
    public static final ad a = ad.a;
    public static final char[] b;
    public static final char[] c;

    static {
        char[] arrc = new char[14];
        arrc[0] = 46;
        arrc[1] = 10;
        arrc[2] = 13;
        arrc[3] = 9;
        arrc[5] = 12;
        arrc[6] = 96;
        arrc[7] = 63;
        arrc[8] = 42;
        arrc[9] = 92;
        arrc[10] = 60;
        arrc[11] = 62;
        arrc[12] = 124;
        arrc[13] = 34;
        b = arrc;
        char[] arrc2 = new char[15];
        arrc2[0] = 47;
        arrc2[1] = 10;
        arrc2[2] = 13;
        arrc2[3] = 9;
        arrc2[5] = 12;
        arrc2[6] = 96;
        arrc2[7] = 63;
        arrc2[8] = 42;
        arrc2[9] = 92;
        arrc2[10] = 60;
        arrc2[11] = 62;
        arrc2[12] = 124;
        arrc2[13] = 34;
        arrc2[14] = 58;
        c = arrc2;
        ab.a(a);
    }

    public static boolean a(char c2) {
        return c2 != '\u00a7' && c2 >= ' ' && c2 != '\u007f';
    }

    public static String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c2 : string.toCharArray()) {
            if (!d.a(c2)) continue;
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }
}

