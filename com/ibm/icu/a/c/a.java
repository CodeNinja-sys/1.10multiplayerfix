/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.c;

public final class a {
    public static boolean a(String string, String string2) {
        char c2;
        char c3;
        int n2;
        if (string == string2) {
            return true;
        }
        int n3 = string.length();
        if (n3 != string2.length()) {
            return false;
        }
        for (n2 = 0; n2 < n3 && ((c3 = string.charAt(n2)) == (c2 = string2.charAt(n2)) || a.b(c3) == a.b(c2)); ++n2) {
        }
        return n2 == n3;
    }

    public static int b(String string, String string2) {
        if (string == string2) {
            return 0;
        }
        return a.a(string).compareTo(a.a(string2));
    }

    public static char a(char c2) {
        if (c2 >= 'a' && c2 <= 'z') {
            c2 = (char)(c2 - 32);
        }
        return c2;
    }

    public static char b(char c2) {
        if (c2 >= 'A' && c2 <= 'Z') {
            c2 = (char)(c2 + 32);
        }
        return c2;
    }

    public static String a(String string) {
        char c2;
        int n2;
        for (n2 = 0; n2 < string.length() && ((c2 = string.charAt(n2)) < 'A' || c2 > 'Z'); ++n2) {
        }
        if (n2 == string.length()) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(string.substring(0, n2));
        while (n2 < string.length()) {
            stringBuilder.append(a.b(string.charAt(n2)));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static String b(String string) {
        char c2;
        int n2;
        for (n2 = 0; n2 < string.length() && ((c2 = string.charAt(n2)) < 'a' || c2 > 'z'); ++n2) {
        }
        if (n2 == string.length()) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(string.substring(0, n2));
        while (n2 < string.length()) {
            stringBuilder.append(a.a(string.charAt(n2)));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static String c(String string) {
        if (string.length() == 0) {
            return string;
        }
        int n2 = 0;
        char c2 = string.charAt(n2);
        if (c2 < 'a' || c2 > 'z') {
            for (n2 = 1; n2 < string.length() && (c2 < 'A' || c2 > 'Z'); ++n2) {
            }
        }
        if (n2 == string.length()) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(string.substring(0, n2));
        if (n2 == 0) {
            stringBuilder.append(a.a(string.charAt(n2)));
            ++n2;
        }
        while (n2 < string.length()) {
            stringBuilder.append(a.b(string.charAt(n2)));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static boolean c(char c2) {
        return c2 >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z';
    }

    public static boolean d(String string) {
        boolean bl2 = true;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (a.c(string.charAt(i2))) continue;
            bl2 = false;
            break;
        }
        return bl2;
    }

    public static boolean d(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    public static boolean e(String string) {
        boolean bl2 = true;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (a.d(string.charAt(i2))) continue;
            bl2 = false;
            break;
        }
        return bl2;
    }

    public static boolean e(char c2) {
        return a.c(c2) || a.d(c2);
    }

    public static boolean f(String string) {
        boolean bl2 = true;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (a.e(string.charAt(i2))) continue;
            bl2 = false;
            break;
        }
        return bl2;
    }
}

