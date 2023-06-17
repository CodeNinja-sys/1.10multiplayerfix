/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

public final class eb {
    private static final byte[] a = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 0, 3, 3, 0, 3, 0, 3, 3, 0, 0, 0, 0, 3, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0};
    private static final byte[] b = new byte[]{2, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 9};
    private static final int[] c = new int[]{0, -1, -65536, 0x7FFF00FF, 0x7FEFFFFE, -65536, 0x3FFFFF, -1048576, -242, 65537};
    private static final int[] d = new int[]{0, -1, -16384, 2147419135, 0x7FEFFFFE, -65536, 0x3FFFFF, -1048576, -242, 65537};

    public static boolean a(int n2) {
        if (n2 < 0) {
            return false;
        }
        if (n2 <= 255) {
            return a[n2] == 3;
        }
        if (n2 < 8208) {
            return false;
        }
        if (n2 <= 12336) {
            int n3 = c[b[n2 - 8192 >> 5]];
            return (n3 >> (n2 & 0x1F) & 1) != 0;
        }
        if (64830 <= n2 && n2 <= 65094) {
            return n2 <= 64831 || 65093 <= n2;
        }
        return false;
    }

    public static boolean b(int n2) {
        if (n2 < 0) {
            return false;
        }
        if (n2 <= 255) {
            return a[n2] != 0;
        }
        if (n2 < 8206) {
            return false;
        }
        if (n2 <= 12336) {
            int n3 = d[b[n2 - 8192 >> 5]];
            return (n3 >> (n2 & 0x1F) & 1) != 0;
        }
        if (64830 <= n2 && n2 <= 65094) {
            return n2 <= 64831 || 65093 <= n2;
        }
        return false;
    }

    public static boolean c(int n2) {
        if (n2 < 0) {
            return false;
        }
        if (n2 <= 255) {
            return a[n2] == 5;
        }
        if (8206 <= n2 && n2 <= 8233) {
            return n2 <= 8207 || 8232 <= n2;
        }
        return false;
    }

    public static int a(CharSequence charSequence, int n2) {
        while (n2 < charSequence.length() && eb.c(charSequence.charAt(n2))) {
            ++n2;
        }
        return n2;
    }

    public static String a(String string) {
        int n2;
        if (string.length() == 0 || !eb.c(string.charAt(0)) && !eb.c(string.charAt(string.length() - 1))) {
            return string;
        }
        int n3 = string.length();
        for (n2 = 0; n2 < n3 && eb.c(string.charAt(n2)); ++n2) {
        }
        if (n2 < n3) {
            while (eb.c(string.charAt(n3 - 1))) {
                --n3;
            }
        }
        return string.substring(n2, n3);
    }

    public static boolean a(CharSequence charSequence) {
        int n2 = charSequence.length();
        if (n2 == 0) {
            return false;
        }
        int n3 = 0;
        do {
            if (!eb.b(charSequence.charAt(n3++))) continue;
            return false;
        } while (n3 < n2);
        return true;
    }

    public static boolean a(CharSequence charSequence, int n2, int n3) {
        if (n2 >= n3) {
            return false;
        }
        do {
            if (!eb.b(charSequence.charAt(n2++))) continue;
            return false;
        } while (n2 < n3);
        return true;
    }

    public static int b(CharSequence charSequence, int n2) {
        while (n2 < charSequence.length() && !eb.b(charSequence.charAt(n2))) {
            ++n2;
        }
        return n2;
    }
}

