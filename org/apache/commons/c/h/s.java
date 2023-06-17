/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h;

import org.apache.commons.c.am;
import org.apache.commons.c.an;

public class s {
    public static String a(String string, int n2) {
        return s.a(string, n2, null, false);
    }

    public static String a(String string, int n2, String string2, boolean bl2) {
        if (string == null) {
            return null;
        }
        if (string2 == null) {
            string2 = an.F;
        }
        if (n2 < 1) {
            n2 = 1;
        }
        int n3 = string.length();
        int n4 = 0;
        StringBuilder stringBuilder = new StringBuilder(n3 + 32);
        while (n3 - n4 > n2) {
            if (string.charAt(n4) == ' ') {
                ++n4;
                continue;
            }
            int n5 = string.lastIndexOf(32, n2 + n4);
            if (n5 >= n4) {
                stringBuilder.append(string.substring(n4, n5));
                stringBuilder.append(string2);
                n4 = n5 + 1;
                continue;
            }
            if (bl2) {
                stringBuilder.append(string.substring(n4, n2 + n4));
                stringBuilder.append(string2);
                n4 += n2;
                continue;
            }
            n5 = string.indexOf(32, n2 + n4);
            if (n5 >= 0) {
                stringBuilder.append(string.substring(n4, n5));
                stringBuilder.append(string2);
                n4 = n5 + 1;
                continue;
            }
            stringBuilder.append(string.substring(n4));
            n4 = n3;
        }
        stringBuilder.append(string.substring(n4));
        return stringBuilder.toString();
    }

    public static String a(String string) {
        return s.a(string, null);
    }

    public static String a(String string, char ... arrc) {
        int n2;
        int n3 = n2 = arrc == null ? -1 : arrc.length;
        if (am.a((CharSequence)string) || n2 == 0) {
            return string;
        }
        char[] arrc2 = string.toCharArray();
        boolean bl2 = true;
        for (int i2 = 0; i2 < arrc2.length; ++i2) {
            char c2 = arrc2[i2];
            if (s.a(c2, arrc)) {
                bl2 = true;
                continue;
            }
            if (!bl2) continue;
            arrc2[i2] = Character.toTitleCase(c2);
            bl2 = false;
        }
        return new String(arrc2);
    }

    public static String b(String string) {
        return s.b(string, null);
    }

    public static String b(String string, char ... arrc) {
        int n2;
        int n3 = n2 = arrc == null ? -1 : arrc.length;
        if (am.a((CharSequence)string) || n2 == 0) {
            return string;
        }
        string = string.toLowerCase();
        return s.a(string, arrc);
    }

    public static String c(String string) {
        return s.c(string, null);
    }

    public static String c(String string, char ... arrc) {
        int n2;
        int n3 = n2 = arrc == null ? -1 : arrc.length;
        if (am.a((CharSequence)string) || n2 == 0) {
            return string;
        }
        char[] arrc2 = string.toCharArray();
        boolean bl2 = true;
        for (int i2 = 0; i2 < arrc2.length; ++i2) {
            char c2 = arrc2[i2];
            if (s.a(c2, arrc)) {
                bl2 = true;
                continue;
            }
            if (!bl2) continue;
            arrc2[i2] = Character.toLowerCase(c2);
            bl2 = false;
        }
        return new String(arrc2);
    }

    public static String d(String string) {
        if (am.a((CharSequence)string)) {
            return string;
        }
        char[] arrc = string.toCharArray();
        boolean bl2 = true;
        for (int i2 = 0; i2 < arrc.length; ++i2) {
            char c2 = arrc[i2];
            if (Character.isUpperCase(c2)) {
                arrc[i2] = Character.toLowerCase(c2);
                bl2 = false;
                continue;
            }
            if (Character.isTitleCase(c2)) {
                arrc[i2] = Character.toLowerCase(c2);
                bl2 = false;
                continue;
            }
            if (Character.isLowerCase(c2)) {
                if (bl2) {
                    arrc[i2] = Character.toTitleCase(c2);
                    bl2 = false;
                    continue;
                }
                arrc[i2] = Character.toUpperCase(c2);
                continue;
            }
            bl2 = Character.isWhitespace(c2);
        }
        return new String(arrc);
    }

    public static String e(String string) {
        return s.d(string, null);
    }

    public static String d(String string, char ... arrc) {
        if (am.a((CharSequence)string)) {
            return string;
        }
        if (arrc != null && arrc.length == 0) {
            return "";
        }
        int n2 = string.length();
        char[] arrc2 = new char[n2 / 2 + 1];
        int n3 = 0;
        boolean bl2 = true;
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if (s.a(c2, arrc)) {
                bl2 = true;
                continue;
            }
            if (!bl2) continue;
            arrc2[n3++] = c2;
            bl2 = false;
        }
        return new String(arrc2, 0, n3);
    }

    private static boolean a(char c2, char[] arrc) {
        if (arrc == null) {
            return Character.isWhitespace(c2);
        }
        for (char c3 : arrc) {
            if (c2 != c3) continue;
            return true;
        }
        return false;
    }
}

