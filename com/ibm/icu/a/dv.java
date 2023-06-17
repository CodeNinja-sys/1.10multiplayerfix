/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import java.io.IOException;

public final class dv {
    public static final int a = 4352;
    public static final int b = 4449;
    public static final int c = 4519;
    public static final int d = 44032;
    public static final int e = 19;
    public static final int f = 21;
    public static final int g = 28;
    public static final int h = 4371;
    public static final int i = 4470;
    public static final int j = 588;
    public static final int k = 11172;
    public static final int l = 55204;

    public static boolean a(int n2) {
        return 44032 <= n2 && n2 < 55204;
    }

    public static boolean a(char c2) {
        return (c2 = (char)(c2 - 44032)) < '\u2ba4' && c2 % 28 == 0;
    }

    public static boolean b(int n2) {
        return 4352 <= n2 && n2 < 4371;
    }

    public static boolean c(int n2) {
        return 4449 <= n2 && n2 < 4470;
    }

    public static int a(int n2, Appendable appendable) {
        try {
            int n3 = (n2 -= 44032) % 28;
            appendable.append((char)(4352 + (n2 /= 28) / 21));
            appendable.append((char)(4449 + n2 % 21));
            if (n3 == 0) {
                return 2;
            }
            appendable.append((char)(4519 + n3));
            return 3;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public static void b(int n2, Appendable appendable) {
        try {
            int n3 = n2;
            int n4 = (n2 -= 44032) % 28;
            if (n4 == 0) {
                appendable.append((char)(4352 + (n2 /= 28) / 21));
                appendable.append((char)(4449 + n2 % 21));
            } else {
                appendable.append((char)(n3 - n4));
                appendable.append((char)(4519 + n4));
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }
}

