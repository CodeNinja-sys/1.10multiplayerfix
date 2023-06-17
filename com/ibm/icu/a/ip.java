/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

public final class ip {
    private static final int a = 65534;
    private static final int b = 64976;
    private static final int c = 65007;

    public static boolean a(int n2) {
        if ((n2 & 0xFFFE) == 65534) {
            return true;
        }
        return n2 >= 64976 && n2 <= 65007;
    }

    static int a(char c2, char c3) {
        return c2 << 16 | c3;
    }

    static int a(StringBuffer stringBuffer, byte[] arrby, int n2) {
        byte by2 = 1;
        while (by2 != 0) {
            by2 = arrby[n2];
            if (by2 != 0) {
                stringBuffer.append((char)(by2 & 0xFF));
            }
            ++n2;
        }
        return n2;
    }

    static int a(String string, byte[] arrby, int n2, int n3) {
        byte by2 = 1;
        int n4 = string.length();
        while (by2 != 0) {
            by2 = arrby[n3];
            ++n3;
            if (by2 == 0) break;
            if (n2 == n4 || string.charAt(n2) != (char)(by2 & 0xFF)) {
                return -1;
            }
            ++n2;
        }
        return n2;
    }

    static int a(byte[] arrby, int n2, int n3) {
        for (int i2 = 0; i2 < n3; ++i2) {
            byte by2 = 1;
            while (by2 != 0) {
                by2 = arrby[n2];
                ++n2;
            }
        }
        return n2;
    }

    static int a(byte[] arrby, int n2, int n3, byte by2) {
        int n4;
        for (n4 = 0; n4 < n3; ++n4) {
            byte by3 = arrby[n2 + n4];
            if (by3 != by2) continue;
            ++n4;
            break;
        }
        return n4;
    }

    private ip() {
    }
}

