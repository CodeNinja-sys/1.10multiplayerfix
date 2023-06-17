/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.b;

public class a {
    public static int a(CharSequence charSequence, CharSequence charSequence2, int n2, int n3) {
        char c2;
        int n4;
        int n5;
        int n6 = n2;
        int n7 = charSequence.length();
        int n8 = charSequence2.length();
        for (n5 = n3; n6 < n7 && n5 < n8 && (n4 = (int)charSequence.charAt(n6)) == (c2 = charSequence2.charAt(n5)); ++n6, ++n5) {
        }
        n4 = n6 - n2;
        if (n4 != 0 && !a.c(charSequence, n6) && !a.c(charSequence2, n5)) {
            --n4;
        }
        return n4;
    }

    public int a(CharSequence charSequence) {
        return Character.codePointCount(charSequence, 0, charSequence.length());
    }

    public static final boolean a(int n2, CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        switch (charSequence.length()) {
            case 1: {
                return n2 == charSequence.charAt(0);
            }
            case 2: {
                return n2 > 65535 && n2 == Character.codePointAt(charSequence, 0);
            }
        }
        return false;
    }

    public static final boolean a(CharSequence charSequence, int n2) {
        return a.a(n2, charSequence);
    }

    public static int b(CharSequence charSequence, int n2) {
        if (n2 < 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException();
        }
        int n3 = charSequence.length();
        if (n3 == 0) {
            return -1;
        }
        char c2 = charSequence.charAt(0);
        int n4 = n2 - 65536;
        if (n4 < 0) {
            int n5 = c2 - n2;
            if (n5 != 0) {
                return n5;
            }
            return n3 - 1;
        }
        char c3 = (char)((n4 >>> 10) + 55296);
        int n6 = c2 - c3;
        if (n6 != 0) {
            return n6;
        }
        if (n3 > 1) {
            char c4 = (char)((n4 & 0x3FF) + 56320);
            n6 = charSequence.charAt(1) - c4;
            if (n6 != 0) {
                return n6;
            }
        }
        return n3 - 2;
    }

    public static int b(int n2, CharSequence charSequence) {
        return -a.b(charSequence, n2);
    }

    public static int b(CharSequence charSequence) {
        int n2 = charSequence.length();
        if (n2 < 1 || n2 > 2) {
            return Integer.MAX_VALUE;
        }
        int n3 = Character.codePointAt(charSequence, 0);
        return n3 < 65536 == (n2 == 1) ? n3 : Integer.MAX_VALUE;
    }

    public static final boolean a(Object object, Object object2) {
        return object == null ? object2 == null : (object2 == null ? false : object.equals(object2));
    }

    public static int a(CharSequence charSequence, CharSequence charSequence2) {
        int n2;
        int n3 = charSequence.length();
        int n4 = n3 <= (n2 = charSequence2.length()) ? n3 : n2;
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5 = charSequence.charAt(i2) - charSequence2.charAt(i2);
            if (n5 == 0) continue;
            return n5;
        }
        return n3 - n2;
    }

    public static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence.length() == charSequence2.length() && a.a(charSequence, charSequence2) == 0;
    }

    public static boolean c(CharSequence charSequence, int n2) {
        return n2 <= 0 || n2 >= charSequence.length() || !Character.isHighSurrogate(charSequence.charAt(n2 - 1)) || !Character.isLowSurrogate(charSequence.charAt(n2));
    }

    public static int d(CharSequence charSequence, int n2) {
        int n3;
        for (int i2 = 0; i2 < charSequence.length(); i2 += Character.charCount(n3)) {
            n3 = Character.codePointAt(charSequence, i2);
            if (n3 != n2) continue;
            return i2;
        }
        return -1;
    }

    public static int[] c(CharSequence charSequence) {
        int[] arrn = new int[charSequence.length()];
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2;
            char c3 = charSequence.charAt(i2);
            if (c3 >= '\udc00' && c3 <= '\udfff' && i2 != 0 && (c2 = (char)arrn[n2 - 1]) >= '\ud800' && c2 <= '\udbff') {
                arrn[n2 - 1] = Character.toCodePoint(c2, c3);
                continue;
            }
            arrn[n2++] = c3;
        }
        if (n2 == arrn.length) {
            return arrn;
        }
        int[] arrn2 = new int[n2];
        System.arraycopy(arrn, 0, arrn2, 0, n2);
        return arrn2;
    }

    private a() {
    }
}

