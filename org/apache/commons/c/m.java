/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import org.apache.commons.c.am;

public class m {
    private static final String[] c = new String[128];
    public static final char a = '\n';
    public static final char b = '\r';

    public static Character a(char c2) {
        return Character.valueOf(c2);
    }

    public static Character a(String string) {
        if (am.a((CharSequence)string)) {
            return null;
        }
        return Character.valueOf(string.charAt(0));
    }

    public static char a(Character c2) {
        if (c2 == null) {
            throw new IllegalArgumentException("The Character must not be null");
        }
        return c2.charValue();
    }

    public static char a(Character c2, char c3) {
        if (c2 == null) {
            return c3;
        }
        return c2.charValue();
    }

    public static char b(String string) {
        if (am.a((CharSequence)string)) {
            throw new IllegalArgumentException("The String must not be empty");
        }
        return string.charAt(0);
    }

    public static char a(String string, char c2) {
        if (am.a((CharSequence)string)) {
            return c2;
        }
        return string.charAt(0);
    }

    public static int b(char c2) {
        if (!m.k(c2)) {
            throw new IllegalArgumentException("The character " + c2 + " is not in the range '0' - '9'");
        }
        return c2 - 48;
    }

    public static int a(char c2, int n2) {
        if (!m.k(c2)) {
            return n2;
        }
        return c2 - 48;
    }

    public static int b(Character c2) {
        if (c2 == null) {
            throw new IllegalArgumentException("The character must not be null");
        }
        return m.b(c2.charValue());
    }

    public static int a(Character c2, int n2) {
        if (c2 == null) {
            return n2;
        }
        return m.a(c2.charValue(), n2);
    }

    public static String c(char c2) {
        if (c2 < '\u0080') {
            return c[c2];
        }
        return new String(new char[]{c2});
    }

    public static String c(Character c2) {
        if (c2 == null) {
            return null;
        }
        return m.c(c2.charValue());
    }

    public static String d(char c2) {
        if (c2 < '\u0010') {
            return "\\u000" + Integer.toHexString(c2);
        }
        if (c2 < '\u0100') {
            return "\\u00" + Integer.toHexString(c2);
        }
        if (c2 < '\u1000') {
            return "\\u0" + Integer.toHexString(c2);
        }
        return "\\u" + Integer.toHexString(c2);
    }

    public static String d(Character c2) {
        if (c2 == null) {
            return null;
        }
        return m.d(c2.charValue());
    }

    public static boolean e(char c2) {
        return c2 < '\u0080';
    }

    public static boolean f(char c2) {
        return c2 >= ' ' && c2 < '\u007f';
    }

    public static boolean g(char c2) {
        return c2 < ' ' || c2 == '\u007f';
    }

    public static boolean h(char c2) {
        return m.i(c2) || m.j(c2);
    }

    public static boolean i(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static boolean j(char c2) {
        return c2 >= 'a' && c2 <= 'z';
    }

    public static boolean k(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    public static boolean l(char c2) {
        return m.h(c2) || m.k(c2);
    }

    static {
        for (char c2 = '\u0000'; c2 < c.length; c2 = (char)(c2 + '\u0001')) {
            m.c[c2] = String.valueOf(c2);
        }
    }
}

