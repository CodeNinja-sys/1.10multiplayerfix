/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.h;
import java.util.Collection;

final class aa {
    static final char a = '-';
    static final String b = String.valueOf('-');
    static final String c = "--";
    static final String d = "--";
    static final String e = "W";

    private aa() {
        throw new UnsupportedOperationException();
    }

    static boolean a(String string) {
        return string.startsWith(b) && !b.equals(string) && !aa.b(string);
    }

    static boolean b(String string) {
        return string.startsWith("--") && !aa.c(string);
    }

    static boolean c(String string) {
        return "--".equals(string);
    }

    static void d(String string) {
        if (string.startsWith(b)) {
            throw new h(String.valueOf(string));
        }
        for (int i2 = 0; i2 < string.length(); ++i2) {
            aa.a(string.charAt(i2));
        }
    }

    static void a(Collection collection) {
        for (String string : collection) {
            aa.d(string);
        }
    }

    private static void a(char c2) {
        if (!Character.isLetterOrDigit(c2) && !aa.b(c2)) {
            throw new h(String.valueOf(c2));
        }
    }

    private static boolean b(char c2) {
        String string = "?.-";
        return string.indexOf(c2) != -1;
    }
}

