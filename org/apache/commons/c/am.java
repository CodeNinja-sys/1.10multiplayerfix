/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.nio.charset.Charset;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import org.apache.commons.c.aa;
import org.apache.commons.c.c;
import org.apache.commons.c.j;
import org.apache.commons.c.m;

public class am {
    public static final String a = " ";
    public static final String b = "";
    public static final String c = "\n";
    public static final String d = "\r";
    public static final int e = -1;
    private static final int f = 8192;
    private static final Pattern g = Pattern.compile("(?: |\\u00A0|\\s|[\\s&&[^ ]])\\s*");

    public static boolean a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean b(CharSequence charSequence) {
        return !am.a(charSequence);
    }

    public static boolean a(CharSequence ... arrcharSequence) {
        if (org.apache.commons.c.c.f(arrcharSequence)) {
            return true;
        }
        for (CharSequence charSequence : arrcharSequence) {
            if (!am.a(charSequence)) continue;
            return true;
        }
        return false;
    }

    public static boolean b(CharSequence ... arrcharSequence) {
        return !am.a(arrcharSequence);
    }

    public static boolean c(CharSequence charSequence) {
        int n2;
        if (charSequence == null || (n2 = charSequence.length()) == 0) {
            return true;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (Character.isWhitespace(charSequence.charAt(i2))) continue;
            return false;
        }
        return true;
    }

    public static boolean d(CharSequence charSequence) {
        return !am.c(charSequence);
    }

    public static boolean c(CharSequence ... arrcharSequence) {
        if (org.apache.commons.c.c.f(arrcharSequence)) {
            return true;
        }
        for (CharSequence charSequence : arrcharSequence) {
            if (!am.c(charSequence)) continue;
            return true;
        }
        return false;
    }

    public static boolean d(CharSequence ... arrcharSequence) {
        return !am.c(arrcharSequence);
    }

    public static String a(String string) {
        return string == null ? null : string.trim();
    }

    public static String b(String string) {
        String string2 = am.a(string);
        return am.a((CharSequence)string2) ? null : string2;
    }

    public static String c(String string) {
        return string == null ? b : string.trim();
    }

    public static String d(String string) {
        return am.a(string, null);
    }

    public static String e(String string) {
        if (string == null) {
            return null;
        }
        return (string = am.a(string, null)).isEmpty() ? null : string;
    }

    public static String f(String string) {
        return string == null ? b : am.a(string, null);
    }

    public static String a(String string, String string2) {
        if (am.a((CharSequence)string)) {
            return string;
        }
        string = am.b(string, string2);
        return am.c(string, string2);
    }

    public static String b(String string, String string2) {
        int n2;
        int n3;
        if (string == null || (n3 = string.length()) == 0) {
            return string;
        }
        if (string2 == null) {
            for (n2 = 0; n2 != n3 && Character.isWhitespace(string.charAt(n2)); ++n2) {
            }
        } else {
            if (string2.isEmpty()) {
                return string;
            }
            while (n2 != n3 && string2.indexOf(string.charAt(n2)) != -1) {
                ++n2;
            }
        }
        return string.substring(n2);
    }

    public static String c(String string, String string2) {
        int n2;
        if (string == null || (n2 = string.length()) == 0) {
            return string;
        }
        if (string2 == null) {
            while (n2 != 0 && Character.isWhitespace(string.charAt(n2 - 1))) {
                --n2;
            }
        } else {
            if (string2.isEmpty()) {
                return string;
            }
            while (n2 != 0 && string2.indexOf(string.charAt(n2 - 1)) != -1) {
                --n2;
            }
        }
        return string.substring(0, n2);
    }

    public static String[] a(String ... arrstring) {
        return am.a(arrstring, null);
    }

    public static String[] a(String[] arrstring, String string) {
        int n2;
        if (arrstring == null || (n2 = arrstring.length) == 0) {
            return arrstring;
        }
        String[] arrstring2 = new String[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrstring2[i2] = am.a(arrstring[i2], string);
        }
        return arrstring2;
    }

    public static String g(String string) {
        if (string == null) {
            return null;
        }
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        String string2 = Normalizer.normalize(string, Normalizer.Form.NFD);
        return pattern.matcher(string2).replaceAll(b);
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null) {
            return false;
        }
        if (charSequence instanceof String && charSequence2 instanceof String) {
            return charSequence.equals(charSequence2);
        }
        return j.a(charSequence, false, 0, charSequence2, 0, Math.max(charSequence.length(), charSequence2.length()));
    }

    public static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence.length() != charSequence2.length()) {
            return false;
        }
        return j.a(charSequence, true, 0, charSequence2, 0, charSequence.length());
    }

    public static int a(CharSequence charSequence, int n2) {
        if (am.a(charSequence)) {
            return -1;
        }
        return j.a(charSequence, n2, 0);
    }

    public static int a(CharSequence charSequence, int n2, int n3) {
        if (am.a(charSequence)) {
            return -1;
        }
        return j.a(charSequence, n2, n3);
    }

    public static int c(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return j.a(charSequence, charSequence2, 0);
    }

    public static int a(CharSequence charSequence, CharSequence charSequence2, int n2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return j.a(charSequence, charSequence2, n2);
    }

    public static int b(CharSequence charSequence, CharSequence charSequence2, int n2) {
        return am.a(charSequence, charSequence2, n2, false);
    }

    private static int a(CharSequence charSequence, CharSequence charSequence2, int n2, boolean bl2) {
        if (charSequence == null || charSequence2 == null || n2 <= 0) {
            return -1;
        }
        if (charSequence2.length() == 0) {
            return bl2 ? charSequence.length() : 0;
        }
        int n3 = 0;
        int n4 = bl2 ? charSequence.length() : -1;
        do {
            if ((n4 = bl2 ? j.b(charSequence, charSequence2, n4 - 1) : j.a(charSequence, charSequence2, n4 + 1)) >= 0) continue;
            return n4;
        } while (++n3 < n2);
        return n4;
    }

    public static int d(CharSequence charSequence, CharSequence charSequence2) {
        return am.c(charSequence, charSequence2, 0);
    }

    public static int c(CharSequence charSequence, CharSequence charSequence2, int n2) {
        int n3;
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 > (n3 = charSequence.length() - charSequence2.length() + 1)) {
            return -1;
        }
        if (charSequence2.length() == 0) {
            return n2;
        }
        for (int i2 = n2; i2 < n3; ++i2) {
            if (!j.a(charSequence, true, i2, charSequence2, 0, charSequence2.length())) continue;
            return i2;
        }
        return -1;
    }

    public static int b(CharSequence charSequence, int n2) {
        if (am.a(charSequence)) {
            return -1;
        }
        return j.b(charSequence, n2, charSequence.length());
    }

    public static int b(CharSequence charSequence, int n2, int n3) {
        if (am.a(charSequence)) {
            return -1;
        }
        return j.b(charSequence, n2, n3);
    }

    public static int e(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return j.b(charSequence, charSequence2, charSequence.length());
    }

    public static int d(CharSequence charSequence, CharSequence charSequence2, int n2) {
        return am.a(charSequence, charSequence2, n2, true);
    }

    public static int e(CharSequence charSequence, CharSequence charSequence2, int n2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return j.b(charSequence, charSequence2, n2);
    }

    public static int f(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return am.f(charSequence, charSequence2, charSequence.length());
    }

    public static int f(CharSequence charSequence, CharSequence charSequence2, int n2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        if (n2 > charSequence.length() - charSequence2.length()) {
            n2 = charSequence.length() - charSequence2.length();
        }
        if (n2 < 0) {
            return -1;
        }
        if (charSequence2.length() == 0) {
            return n2;
        }
        for (int i2 = n2; i2 >= 0; --i2) {
            if (!j.a(charSequence, true, i2, charSequence2, 0, charSequence2.length())) continue;
            return i2;
        }
        return -1;
    }

    public static boolean c(CharSequence charSequence, int n2) {
        if (am.a(charSequence)) {
            return false;
        }
        return j.a(charSequence, n2, 0) >= 0;
    }

    public static boolean g(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return false;
        }
        return j.a(charSequence, charSequence2, 0) >= 0;
    }

    public static boolean h(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return false;
        }
        int n2 = charSequence2.length();
        int n3 = charSequence.length() - n2;
        for (int i2 = 0; i2 <= n3; ++i2) {
            if (!j.a(charSequence, true, i2, charSequence2, 0, n2)) continue;
            return true;
        }
        return false;
    }

    public static boolean e(CharSequence charSequence) {
        if (am.a(charSequence)) {
            return false;
        }
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!Character.isWhitespace(charSequence.charAt(i2))) continue;
            return true;
        }
        return false;
    }

    public static int a(CharSequence charSequence, char ... arrc) {
        if (am.a(charSequence) || org.apache.commons.c.c.e(arrc)) {
            return -1;
        }
        int n2 = charSequence.length();
        int n3 = n2 - 1;
        int n4 = arrc.length;
        int n5 = n4 - 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = charSequence.charAt(i2);
            for (int i3 = 0; i3 < n4; ++i3) {
                if (arrc[i3] != c2) continue;
                if (i2 < n3 && i3 < n5 && Character.isHighSurrogate(c2)) {
                    if (arrc[i3 + 1] != charSequence.charAt(i2 + 1)) continue;
                    return i2;
                }
                return i2;
            }
        }
        return -1;
    }

    public static int a(CharSequence charSequence, String string) {
        if (am.a(charSequence) || am.a((CharSequence)string)) {
            return -1;
        }
        return am.a(charSequence, string.toCharArray());
    }

    public static boolean b(CharSequence charSequence, char ... arrc) {
        if (am.a(charSequence) || org.apache.commons.c.c.e(arrc)) {
            return false;
        }
        int n2 = charSequence.length();
        int n3 = arrc.length;
        int n4 = n2 - 1;
        int n5 = n3 - 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = charSequence.charAt(i2);
            for (int i3 = 0; i3 < n3; ++i3) {
                if (arrc[i3] != c2) continue;
                if (Character.isHighSurrogate(c2)) {
                    if (i3 == n5) {
                        return true;
                    }
                    if (i2 >= n4 || arrc[i3 + 1] != charSequence.charAt(i2 + 1)) continue;
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean i(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2 == null) {
            return false;
        }
        return am.b(charSequence, j.a(charSequence2));
    }

    public static int c(CharSequence charSequence, char ... arrc) {
        if (am.a(charSequence) || org.apache.commons.c.c.e(arrc)) {
            return -1;
        }
        int n2 = charSequence.length();
        int n3 = n2 - 1;
        int n4 = arrc.length;
        int n5 = n4 - 1;
        block0: for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = charSequence.charAt(i2);
            for (int i3 = 0; i3 < n4; ++i3) {
                if (arrc[i3] == c2 && (i2 >= n3 || i3 >= n5 || !Character.isHighSurrogate(c2) || arrc[i3 + 1] == charSequence.charAt(i2 + 1))) continue block0;
            }
            return i2;
        }
        return -1;
    }

    public static int j(CharSequence charSequence, CharSequence charSequence2) {
        if (am.a(charSequence) || am.a(charSequence2)) {
            return -1;
        }
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            boolean bl2;
            char c2 = charSequence.charAt(i2);
            boolean bl3 = bl2 = j.a(charSequence2, c2, 0) >= 0;
            if (i2 + 1 < n2 && Character.isHighSurrogate(c2)) {
                char c3 = charSequence.charAt(i2 + 1);
                if (!bl2 || j.a(charSequence2, c3, 0) >= 0) continue;
                return i2;
            }
            if (bl2) continue;
            return i2;
        }
        return -1;
    }

    public static boolean d(CharSequence charSequence, char ... arrc) {
        if (arrc == null || charSequence == null) {
            return false;
        }
        if (charSequence.length() == 0) {
            return true;
        }
        if (arrc.length == 0) {
            return false;
        }
        return am.c(charSequence, arrc) == -1;
    }

    public static boolean b(CharSequence charSequence, String string) {
        if (charSequence == null || string == null) {
            return false;
        }
        return am.d(charSequence, string.toCharArray());
    }

    public static boolean e(CharSequence charSequence, char ... arrc) {
        if (charSequence == null || arrc == null) {
            return true;
        }
        int n2 = charSequence.length();
        int n3 = n2 - 1;
        int n4 = arrc.length;
        int n5 = n4 - 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = charSequence.charAt(i2);
            for (int i3 = 0; i3 < n4; ++i3) {
                if (arrc[i3] != c2) continue;
                if (Character.isHighSurrogate(c2)) {
                    if (i3 == n5) {
                        return false;
                    }
                    if (i2 >= n3 || arrc[i3 + 1] != charSequence.charAt(i2 + 1)) continue;
                    return false;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean c(CharSequence charSequence, String string) {
        if (charSequence == null || string == null) {
            return true;
        }
        return am.e(charSequence, string.toCharArray());
    }

    public static int a(CharSequence charSequence, CharSequence ... arrcharSequence) {
        if (charSequence == null || arrcharSequence == null) {
            return -1;
        }
        int n2 = arrcharSequence.length;
        int n3 = Integer.MAX_VALUE;
        int n4 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            CharSequence charSequence2 = arrcharSequence[i2];
            if (charSequence2 == null || (n4 = j.a(charSequence, charSequence2, 0)) == -1 || n4 >= n3) continue;
            n3 = n4;
        }
        return n3 == Integer.MAX_VALUE ? -1 : n3;
    }

    public static int b(CharSequence charSequence, CharSequence ... arrcharSequence) {
        if (charSequence == null || arrcharSequence == null) {
            return -1;
        }
        int n2 = arrcharSequence.length;
        int n3 = -1;
        int n4 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            CharSequence charSequence2 = arrcharSequence[i2];
            if (charSequence2 == null || (n4 = j.b(charSequence, charSequence2, charSequence.length())) <= n3) continue;
            n3 = n4;
        }
        return n3;
    }

    public static String a(String string, int n2) {
        if (string == null) {
            return null;
        }
        if (n2 < 0) {
            n2 = string.length() + n2;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 > string.length()) {
            return b;
        }
        return string.substring(n2);
    }

    public static String a(String string, int n2, int n3) {
        if (string == null) {
            return null;
        }
        if (n3 < 0) {
            n3 = string.length() + n3;
        }
        if (n2 < 0) {
            n2 = string.length() + n2;
        }
        if (n3 > string.length()) {
            n3 = string.length();
        }
        if (n2 > n3) {
            return b;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 < 0) {
            n3 = 0;
        }
        return string.substring(n2, n3);
    }

    public static String b(String string, int n2) {
        if (string == null) {
            return null;
        }
        if (n2 < 0) {
            return b;
        }
        if (string.length() <= n2) {
            return string;
        }
        return string.substring(0, n2);
    }

    public static String c(String string, int n2) {
        if (string == null) {
            return null;
        }
        if (n2 < 0) {
            return b;
        }
        if (string.length() <= n2) {
            return string;
        }
        return string.substring(string.length() - n2);
    }

    public static String b(String string, int n2, int n3) {
        if (string == null) {
            return null;
        }
        if (n3 < 0 || n2 > string.length()) {
            return b;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (string.length() <= n2 + n3) {
            return string.substring(n2);
        }
        return string.substring(n2, n2 + n3);
    }

    public static String d(String string, String string2) {
        if (am.a((CharSequence)string) || string2 == null) {
            return string;
        }
        if (string2.isEmpty()) {
            return b;
        }
        int n2 = string.indexOf(string2);
        if (n2 == -1) {
            return string;
        }
        return string.substring(0, n2);
    }

    public static String e(String string, String string2) {
        if (am.a((CharSequence)string)) {
            return string;
        }
        if (string2 == null) {
            return b;
        }
        int n2 = string.indexOf(string2);
        if (n2 == -1) {
            return b;
        }
        return string.substring(n2 + string2.length());
    }

    public static String f(String string, String string2) {
        if (am.a((CharSequence)string) || am.a((CharSequence)string2)) {
            return string;
        }
        int n2 = string.lastIndexOf(string2);
        if (n2 == -1) {
            return string;
        }
        return string.substring(0, n2);
    }

    public static String g(String string, String string2) {
        if (am.a((CharSequence)string)) {
            return string;
        }
        if (am.a((CharSequence)string2)) {
            return b;
        }
        int n2 = string.lastIndexOf(string2);
        if (n2 == -1 || n2 == string.length() - string2.length()) {
            return b;
        }
        return string.substring(n2 + string2.length());
    }

    public static String h(String string, String string2) {
        return am.a(string, string2, string2);
    }

    public static String a(String string, String string2, String string3) {
        int n2;
        if (string == null || string2 == null || string3 == null) {
            return null;
        }
        int n3 = string.indexOf(string2);
        if (n3 != -1 && (n2 = string.indexOf(string3, n3 + string2.length())) != -1) {
            return string.substring(n3 + string2.length(), n2);
        }
        return null;
    }

    public static String[] b(String string, String string2, String string3) {
        int n2;
        int n3;
        if (string == null || am.a((CharSequence)string2) || am.a((CharSequence)string3)) {
            return null;
        }
        int n4 = string.length();
        if (n4 == 0) {
            return org.apache.commons.c.c.c;
        }
        int n5 = string3.length();
        int n6 = string2.length();
        ArrayList<String> arrayList = new ArrayList<String>();
        int n7 = 0;
        while (n7 < n4 - n5 && (n3 = string.indexOf(string2, n7)) >= 0 && (n2 = string.indexOf(string3, n3 += n6)) >= 0) {
            arrayList.add(string.substring(n3, n2));
            n7 = n2 + n5;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] h(String string) {
        return am.a(string, null, -1);
    }

    public static String[] a(String string, char c2) {
        return am.a(string, c2, false);
    }

    public static String[] i(String string, String string2) {
        return am.b(string, string2, -1, false);
    }

    public static String[] a(String string, String string2, int n2) {
        return am.b(string, string2, n2, false);
    }

    public static String[] j(String string, String string2) {
        return am.a(string, string2, -1, false);
    }

    public static String[] b(String string, String string2, int n2) {
        return am.a(string, string2, n2, false);
    }

    public static String[] k(String string, String string2) {
        return am.a(string, string2, -1, true);
    }

    public static String[] c(String string, String string2, int n2) {
        return am.a(string, string2, n2, true);
    }

    private static String[] a(String string, String string2, int n2, boolean bl2) {
        if (string == null) {
            return null;
        }
        int n3 = string.length();
        if (n3 == 0) {
            return org.apache.commons.c.c.c;
        }
        if (string2 == null || b.equals(string2)) {
            return am.b(string, null, n2, bl2);
        }
        int n4 = string2.length();
        ArrayList<String> arrayList = new ArrayList<String>();
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        while (n7 < n3) {
            n7 = string.indexOf(string2, n6);
            if (n7 > -1) {
                if (n7 > n6) {
                    if (++n5 == n2) {
                        n7 = n3;
                        arrayList.add(string.substring(n6));
                        continue;
                    }
                    arrayList.add(string.substring(n6, n7));
                    n6 = n7 + n4;
                    continue;
                }
                if (bl2) {
                    if (++n5 == n2) {
                        n7 = n3;
                        arrayList.add(string.substring(n6));
                    } else {
                        arrayList.add(b);
                    }
                }
                n6 = n7 + n4;
                continue;
            }
            arrayList.add(string.substring(n6));
            n7 = n3;
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] i(String string) {
        return am.b(string, null, -1, true);
    }

    public static String[] b(String string, char c2) {
        return am.a(string, c2, true);
    }

    private static String[] a(String string, char c2, boolean bl2) {
        if (string == null) {
            return null;
        }
        int n2 = string.length();
        if (n2 == 0) {
            return org.apache.commons.c.c.c;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        int n3 = 0;
        int n4 = 0;
        boolean bl3 = false;
        boolean bl4 = false;
        while (n3 < n2) {
            if (string.charAt(n3) == c2) {
                if (bl3 || bl2) {
                    arrayList.add(string.substring(n4, n3));
                    bl3 = false;
                    bl4 = true;
                }
                n4 = ++n3;
                continue;
            }
            bl4 = false;
            bl3 = true;
            ++n3;
        }
        if (bl3 || bl2 && bl4) {
            arrayList.add(string.substring(n4, n3));
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] l(String string, String string2) {
        return am.b(string, string2, -1, true);
    }

    public static String[] d(String string, String string2, int n2) {
        return am.b(string, string2, n2, true);
    }

    private static String[] b(String string, String string2, int n2, boolean bl2) {
        if (string == null) {
            return null;
        }
        int n3 = string.length();
        if (n3 == 0) {
            return org.apache.commons.c.c.c;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        int n4 = 1;
        int n5 = 0;
        int n6 = 0;
        boolean bl3 = false;
        boolean bl4 = false;
        if (string2 == null) {
            while (n5 < n3) {
                if (Character.isWhitespace(string.charAt(n5))) {
                    if (bl3 || bl2) {
                        bl4 = true;
                        if (n4++ == n2) {
                            n5 = n3;
                            bl4 = false;
                        }
                        arrayList.add(string.substring(n6, n5));
                        bl3 = false;
                    }
                    n6 = ++n5;
                    continue;
                }
                bl4 = false;
                bl3 = true;
                ++n5;
            }
        } else if (string2.length() == 1) {
            char c2 = string2.charAt(0);
            while (n5 < n3) {
                if (string.charAt(n5) == c2) {
                    if (bl3 || bl2) {
                        bl4 = true;
                        if (n4++ == n2) {
                            n5 = n3;
                            bl4 = false;
                        }
                        arrayList.add(string.substring(n6, n5));
                        bl3 = false;
                    }
                    n6 = ++n5;
                    continue;
                }
                bl4 = false;
                bl3 = true;
                ++n5;
            }
        } else {
            while (n5 < n3) {
                if (string2.indexOf(string.charAt(n5)) >= 0) {
                    if (bl3 || bl2) {
                        bl4 = true;
                        if (n4++ == n2) {
                            n5 = n3;
                            bl4 = false;
                        }
                        arrayList.add(string.substring(n6, n5));
                        bl3 = false;
                    }
                    n6 = ++n5;
                    continue;
                }
                bl4 = false;
                bl3 = true;
                ++n5;
            }
        }
        if (bl3 || bl2 && bl4) {
            arrayList.add(string.substring(n6, n5));
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] j(String string) {
        return am.a(string, false);
    }

    public static String[] k(String string) {
        return am.a(string, true);
    }

    private static String[] a(String string, boolean bl2) {
        if (string == null) {
            return null;
        }
        if (string.isEmpty()) {
            return org.apache.commons.c.c.c;
        }
        char[] arrc = string.toCharArray();
        ArrayList<String> arrayList = new ArrayList<String>();
        int n2 = 0;
        int n3 = Character.getType(arrc[n2]);
        for (int i2 = n2 + 1; i2 < arrc.length; ++i2) {
            int n4 = Character.getType(arrc[i2]);
            if (n4 == n3) continue;
            if (bl2 && n4 == 2 && n3 == 1) {
                int n5 = i2 - 1;
                if (n5 != n2) {
                    arrayList.add(new String(arrc, n2, n5 - n2));
                    n2 = n5;
                }
            } else {
                arrayList.add(new String(arrc, n2, i2 - n2));
                n2 = i2;
            }
            n3 = n4;
        }
        arrayList.add(new String(arrc, n2, arrc.length - n2));
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public static String a(Object ... arrobject) {
        return am.a(arrobject, null);
    }

    public static String a(Object[] arrobject, char c2) {
        if (arrobject == null) {
            return null;
        }
        return am.a(arrobject, c2, 0, arrobject.length);
    }

    public static String a(long[] arrl, char c2) {
        if (arrl == null) {
            return null;
        }
        return am.a(arrl, c2, 0, arrl.length);
    }

    public static String a(int[] arrn, char c2) {
        if (arrn == null) {
            return null;
        }
        return am.a(arrn, c2, 0, arrn.length);
    }

    public static String a(short[] arrs, char c2) {
        if (arrs == null) {
            return null;
        }
        return am.a(arrs, c2, 0, arrs.length);
    }

    public static String a(byte[] arrby, char c2) {
        if (arrby == null) {
            return null;
        }
        return am.a(arrby, c2, 0, arrby.length);
    }

    public static String a(char[] arrc, char c2) {
        if (arrc == null) {
            return null;
        }
        return am.a(arrc, c2, 0, arrc.length);
    }

    public static String a(float[] arrf, char c2) {
        if (arrf == null) {
            return null;
        }
        return am.a(arrf, c2, 0, arrf.length);
    }

    public static String a(double[] arrd, char c2) {
        if (arrd == null) {
            return null;
        }
        return am.a(arrd, c2, 0, arrd.length);
    }

    public static String a(Object[] arrobject, char c2, int n2, int n3) {
        if (arrobject == null) {
            return null;
        }
        int n4 = n3 - n2;
        if (n4 <= 0) {
            return b;
        }
        StringBuilder stringBuilder = new StringBuilder(n4 * 16);
        for (int i2 = n2; i2 < n3; ++i2) {
            if (i2 > n2) {
                stringBuilder.append(c2);
            }
            if (arrobject[i2] == null) continue;
            stringBuilder.append(arrobject[i2]);
        }
        return stringBuilder.toString();
    }

    public static String a(long[] arrl, char c2, int n2, int n3) {
        if (arrl == null) {
            return null;
        }
        int n4 = n3 - n2;
        if (n4 <= 0) {
            return b;
        }
        StringBuilder stringBuilder = new StringBuilder(n4 * 16);
        for (int i2 = n2; i2 < n3; ++i2) {
            if (i2 > n2) {
                stringBuilder.append(c2);
            }
            stringBuilder.append(arrl[i2]);
        }
        return stringBuilder.toString();
    }

    public static String a(int[] arrn, char c2, int n2, int n3) {
        if (arrn == null) {
            return null;
        }
        int n4 = n3 - n2;
        if (n4 <= 0) {
            return b;
        }
        StringBuilder stringBuilder = new StringBuilder(n4 * 16);
        for (int i2 = n2; i2 < n3; ++i2) {
            if (i2 > n2) {
                stringBuilder.append(c2);
            }
            stringBuilder.append(arrn[i2]);
        }
        return stringBuilder.toString();
    }

    public static String a(byte[] arrby, char c2, int n2, int n3) {
        if (arrby == null) {
            return null;
        }
        int n4 = n3 - n2;
        if (n4 <= 0) {
            return b;
        }
        StringBuilder stringBuilder = new StringBuilder(n4 * 16);
        for (int i2 = n2; i2 < n3; ++i2) {
            if (i2 > n2) {
                stringBuilder.append(c2);
            }
            stringBuilder.append(arrby[i2]);
        }
        return stringBuilder.toString();
    }

    public static String a(short[] arrs, char c2, int n2, int n3) {
        if (arrs == null) {
            return null;
        }
        int n4 = n3 - n2;
        if (n4 <= 0) {
            return b;
        }
        StringBuilder stringBuilder = new StringBuilder(n4 * 16);
        for (int i2 = n2; i2 < n3; ++i2) {
            if (i2 > n2) {
                stringBuilder.append(c2);
            }
            stringBuilder.append(arrs[i2]);
        }
        return stringBuilder.toString();
    }

    public static String a(char[] arrc, char c2, int n2, int n3) {
        if (arrc == null) {
            return null;
        }
        int n4 = n3 - n2;
        if (n4 <= 0) {
            return b;
        }
        StringBuilder stringBuilder = new StringBuilder(n4 * 16);
        for (int i2 = n2; i2 < n3; ++i2) {
            if (i2 > n2) {
                stringBuilder.append(c2);
            }
            stringBuilder.append(arrc[i2]);
        }
        return stringBuilder.toString();
    }

    public static String a(double[] arrd, char c2, int n2, int n3) {
        if (arrd == null) {
            return null;
        }
        int n4 = n3 - n2;
        if (n4 <= 0) {
            return b;
        }
        StringBuilder stringBuilder = new StringBuilder(n4 * 16);
        for (int i2 = n2; i2 < n3; ++i2) {
            if (i2 > n2) {
                stringBuilder.append(c2);
            }
            stringBuilder.append(arrd[i2]);
        }
        return stringBuilder.toString();
    }

    public static String a(float[] arrf, char c2, int n2, int n3) {
        if (arrf == null) {
            return null;
        }
        int n4 = n3 - n2;
        if (n4 <= 0) {
            return b;
        }
        StringBuilder stringBuilder = new StringBuilder(n4 * 16);
        for (int i2 = n2; i2 < n3; ++i2) {
            if (i2 > n2) {
                stringBuilder.append(c2);
            }
            stringBuilder.append(arrf[i2]);
        }
        return stringBuilder.toString();
    }

    public static String a(Object[] arrobject, String string) {
        if (arrobject == null) {
            return null;
        }
        return am.a(arrobject, string, 0, arrobject.length);
    }

    public static String a(Object[] arrobject, String string, int n2, int n3) {
        int n4;
        if (arrobject == null) {
            return null;
        }
        if (string == null) {
            string = b;
        }
        if ((n4 = n3 - n2) <= 0) {
            return b;
        }
        StringBuilder stringBuilder = new StringBuilder(n4 * 16);
        for (int i2 = n2; i2 < n3; ++i2) {
            if (i2 > n2) {
                stringBuilder.append(string);
            }
            if (arrobject[i2] == null) continue;
            stringBuilder.append(arrobject[i2]);
        }
        return stringBuilder.toString();
    }

    public static String a(Iterator iterator, char c2) {
        if (iterator == null) {
            return null;
        }
        if (!iterator.hasNext()) {
            return b;
        }
        Object e2 = iterator.next();
        if (!iterator.hasNext()) {
            String string = aa.c(e2);
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(256);
        if (e2 != null) {
            stringBuilder.append(e2);
        }
        while (iterator.hasNext()) {
            stringBuilder.append(c2);
            Object e3 = iterator.next();
            if (e3 == null) continue;
            stringBuilder.append(e3);
        }
        return stringBuilder.toString();
    }

    public static String a(Iterator iterator, String string) {
        if (iterator == null) {
            return null;
        }
        if (!iterator.hasNext()) {
            return b;
        }
        Object e2 = iterator.next();
        if (!iterator.hasNext()) {
            String string2 = aa.c(e2);
            return string2;
        }
        StringBuilder stringBuilder = new StringBuilder(256);
        if (e2 != null) {
            stringBuilder.append(e2);
        }
        while (iterator.hasNext()) {
            Object e3;
            if (string != null) {
                stringBuilder.append(string);
            }
            if ((e3 = iterator.next()) == null) continue;
            stringBuilder.append(e3);
        }
        return stringBuilder.toString();
    }

    public static String a(Iterable iterable, char c2) {
        if (iterable == null) {
            return null;
        }
        return am.a(iterable.iterator(), c2);
    }

    public static String a(Iterable iterable, String string) {
        if (iterable == null) {
            return null;
        }
        return am.a(iterable.iterator(), string);
    }

    public static String l(String string) {
        if (am.a((CharSequence)string)) {
            return string;
        }
        int n2 = string.length();
        char[] arrc = new char[n2];
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (Character.isWhitespace(string.charAt(i2))) continue;
            arrc[n3++] = string.charAt(i2);
        }
        if (n3 == n2) {
            return string;
        }
        return new String(arrc, 0, n3);
    }

    public static String m(String string, String string2) {
        if (am.a((CharSequence)string) || am.a((CharSequence)string2)) {
            return string;
        }
        if (string.startsWith(string2)) {
            return string.substring(string2.length());
        }
        return string;
    }

    public static String n(String string, String string2) {
        if (am.a((CharSequence)string) || am.a((CharSequence)string2)) {
            return string;
        }
        if (am.r((CharSequence)string, (CharSequence)string2)) {
            return string.substring(string2.length());
        }
        return string;
    }

    public static String o(String string, String string2) {
        if (am.a((CharSequence)string) || am.a((CharSequence)string2)) {
            return string;
        }
        if (string.endsWith(string2)) {
            return string.substring(0, string.length() - string2.length());
        }
        return string;
    }

    public static String p(String string, String string2) {
        if (am.a((CharSequence)string) || am.a((CharSequence)string2)) {
            return string;
        }
        if (am.t((CharSequence)string, (CharSequence)string2)) {
            return string.substring(0, string.length() - string2.length());
        }
        return string;
    }

    public static String q(String string, String string2) {
        if (am.a((CharSequence)string) || am.a((CharSequence)string2)) {
            return string;
        }
        return am.a(string, string2, b, -1);
    }

    public static String c(String string, char c2) {
        if (am.a((CharSequence)string) || string.indexOf(c2) == -1) {
            return string;
        }
        char[] arrc = string.toCharArray();
        int n2 = 0;
        for (int i2 = 0; i2 < arrc.length; ++i2) {
            if (arrc[i2] == c2) continue;
            arrc[n2++] = arrc[i2];
        }
        return new String(arrc, 0, n2);
    }

    public static String c(String string, String string2, String string3) {
        return am.a(string, string2, string3, 1);
    }

    public static String d(String string, String string2, String string3) {
        return Pattern.compile(string2, 32).matcher(string).replaceAll(string3);
    }

    public static String r(String string, String string2) {
        return am.d(string, string2, b);
    }

    public static String e(String string, String string2, String string3) {
        return am.a(string, string2, string3, -1);
    }

    public static String a(String string, String string2, String string3, int n2) {
        if (am.a((CharSequence)string) || am.a((CharSequence)string2) || string3 == null || n2 == 0) {
            return string;
        }
        int n3 = 0;
        int n4 = string.indexOf(string2, n3);
        if (n4 == -1) {
            return string;
        }
        int n5 = string2.length();
        int n6 = string3.length() - n5;
        int n7 = n6 = n6 < 0 ? 0 : n6;
        StringBuilder stringBuilder = new StringBuilder(string.length() + (n6 *= n2 < 0 ? 16 : (n2 > 64 ? 64 : n2)));
        while (n4 != -1) {
            stringBuilder.append(string.substring(n3, n4)).append(string3);
            n3 = n4 + n5;
            if (--n2 == 0) break;
            n4 = string.indexOf(string2, n3);
        }
        stringBuilder.append(string.substring(n3));
        return stringBuilder.toString();
    }

    public static String a(String string, String[] arrstring, String[] arrstring2) {
        return am.a(string, arrstring, arrstring2, false, 0);
    }

    public static String b(String string, String[] arrstring, String[] arrstring2) {
        int n2 = arrstring == null ? 0 : arrstring.length;
        return am.a(string, arrstring, arrstring2, true, n2);
    }

    private static String a(String string, String[] arrstring, String[] arrstring2, boolean bl2, int n2) {
        int n3;
        int n4;
        if (string == null || string.isEmpty() || arrstring == null || arrstring.length == 0 || arrstring2 == null || arrstring2.length == 0) {
            return string;
        }
        if (n2 < 0) {
            throw new IllegalStateException("Aborting to protect against StackOverflowError - output of one loop is the input of another");
        }
        int n5 = arrstring.length;
        int n6 = arrstring2.length;
        if (n5 != n6) {
            throw new IllegalArgumentException("Search and Replace array lengths don't match: " + n5 + " vs " + n6);
        }
        boolean[] arrbl = new boolean[n5];
        int n7 = -1;
        int n8 = -1;
        int n9 = -1;
        for (n4 = 0; n4 < n5; ++n4) {
            if (arrbl[n4] || arrstring[n4] == null || arrstring[n4].isEmpty() || arrstring2[n4] == null) continue;
            n9 = string.indexOf(arrstring[n4]);
            if (n9 == -1) {
                arrbl[n4] = true;
                continue;
            }
            if (n7 != -1 && n9 >= n7) continue;
            n7 = n9;
            n8 = n4;
        }
        if (n7 == -1) {
            return string;
        }
        n4 = 0;
        int n10 = 0;
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (arrstring[i2] == null || arrstring2[i2] == null || (n3 = arrstring2[i2].length() - arrstring[i2].length()) <= 0) continue;
            n10 += 3 * n3;
        }
        n10 = Math.min(n10, string.length() / 5);
        StringBuilder stringBuilder = new StringBuilder(string.length() + n10);
        while (n7 != -1) {
            for (n3 = n4; n3 < n7; ++n3) {
                stringBuilder.append(string.charAt(n3));
            }
            stringBuilder.append(arrstring2[n8]);
            n4 = n7 + arrstring[n8].length();
            n7 = -1;
            n8 = -1;
            n9 = -1;
            for (n3 = 0; n3 < n5; ++n3) {
                if (arrbl[n3] || arrstring[n3] == null || arrstring[n3].isEmpty() || arrstring2[n3] == null) continue;
                n9 = string.indexOf(arrstring[n3], n4);
                if (n9 == -1) {
                    arrbl[n3] = true;
                    continue;
                }
                if (n7 != -1 && n9 >= n7) continue;
                n7 = n9;
                n8 = n3;
            }
        }
        n3 = string.length();
        for (int i3 = n4; i3 < n3; ++i3) {
            stringBuilder.append(string.charAt(i3));
        }
        String string2 = stringBuilder.toString();
        if (!bl2) {
            return string2;
        }
        return am.a(string2, arrstring, arrstring2, bl2, n2 - 1);
    }

    public static String a(String string, char c2, char c3) {
        if (string == null) {
            return null;
        }
        return string.replace(c2, c3);
    }

    public static String f(String string, String string2, String string3) {
        if (am.a((CharSequence)string) || am.a((CharSequence)string2)) {
            return string;
        }
        if (string3 == null) {
            string3 = b;
        }
        boolean bl2 = false;
        int n2 = string3.length();
        int n3 = string.length();
        StringBuilder stringBuilder = new StringBuilder(n3);
        for (int i2 = 0; i2 < n3; ++i2) {
            char c2 = string.charAt(i2);
            int n4 = string2.indexOf(c2);
            if (n4 >= 0) {
                bl2 = true;
                if (n4 >= n2) continue;
                stringBuilder.append(string3.charAt(n4));
                continue;
            }
            stringBuilder.append(c2);
        }
        if (bl2) {
            return stringBuilder.toString();
        }
        return string;
    }

    public static String a(String string, String string2, int n2, int n3) {
        if (string == null) {
            return null;
        }
        if (string2 == null) {
            string2 = b;
        }
        int n4 = string.length();
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 > n4) {
            n2 = n4;
        }
        if (n3 < 0) {
            n3 = 0;
        }
        if (n3 > n4) {
            n3 = n4;
        }
        if (n2 > n3) {
            int n5 = n2;
            n2 = n3;
            n3 = n5;
        }
        return new StringBuilder(n4 + n2 - n3 + string2.length() + 1).append(string.substring(0, n2)).append(string2).append(string.substring(n3)).toString();
    }

    public static String m(String string) {
        if (am.a((CharSequence)string)) {
            return string;
        }
        if (string.length() == 1) {
            char c2 = string.charAt(0);
            if (c2 == '\r' || c2 == '\n') {
                return b;
            }
            return string;
        }
        int n2 = string.length() - 1;
        char c3 = string.charAt(n2);
        if (c3 == '\n') {
            if (string.charAt(n2 - 1) == '\r') {
                --n2;
            }
        } else if (c3 != '\r') {
            ++n2;
        }
        return string.substring(0, n2);
    }

    public static String s(String string, String string2) {
        return am.o(string, string2);
    }

    public static String n(String string) {
        if (string == null) {
            return null;
        }
        int n2 = string.length();
        if (n2 < 2) {
            return b;
        }
        int n3 = n2 - 1;
        String string2 = string.substring(0, n3);
        char c2 = string.charAt(n3);
        if (c2 == '\n' && string2.charAt(n3 - 1) == '\r') {
            return string2.substring(0, n3 - 1);
        }
        return string2;
    }

    public static String d(String string, int n2) {
        if (string == null) {
            return null;
        }
        if (n2 <= 0) {
            return b;
        }
        int n3 = string.length();
        if (n2 == 1 || n3 == 0) {
            return string;
        }
        if (n3 == 1 && n2 <= 8192) {
            return am.a(string.charAt(0), n2);
        }
        int n4 = n3 * n2;
        switch (n3) {
            case 1: {
                return am.a(string.charAt(0), n2);
            }
            case 2: {
                char c2 = string.charAt(0);
                char c3 = string.charAt(1);
                char[] arrc = new char[n4];
                for (int i2 = n2 * 2 - 2; i2 >= 0; --i2) {
                    arrc[i2] = c2;
                    arrc[i2 + 1] = c3;
                    --i2;
                }
                return new String(arrc);
            }
        }
        StringBuilder stringBuilder = new StringBuilder(n4);
        for (int i3 = 0; i3 < n2; ++i3) {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static String e(String string, String string2, int n2) {
        if (string == null || string2 == null) {
            return am.d(string, n2);
        }
        String string3 = am.d(string + string2, n2);
        return am.o(string3, string2);
    }

    public static String a(char c2, int n2) {
        char[] arrc = new char[n2];
        for (int i2 = n2 - 1; i2 >= 0; --i2) {
            arrc[i2] = c2;
        }
        return new String(arrc);
    }

    public static String e(String string, int n2) {
        return am.a(string, n2, ' ');
    }

    public static String a(String string, int n2, char c2) {
        if (string == null) {
            return null;
        }
        int n3 = n2 - string.length();
        if (n3 <= 0) {
            return string;
        }
        if (n3 > 8192) {
            return am.a(string, n2, String.valueOf(c2));
        }
        return string.concat(am.a(c2, n3));
    }

    public static String a(String string, int n2, String string2) {
        if (string == null) {
            return null;
        }
        if (am.a((CharSequence)string2)) {
            string2 = a;
        }
        int n3 = string2.length();
        int n4 = string.length();
        int n5 = n2 - n4;
        if (n5 <= 0) {
            return string;
        }
        if (n3 == 1 && n5 <= 8192) {
            return am.a(string, n2, string2.charAt(0));
        }
        if (n5 == n3) {
            return string.concat(string2);
        }
        if (n5 < n3) {
            return string.concat(string2.substring(0, n5));
        }
        char[] arrc = new char[n5];
        char[] arrc2 = string2.toCharArray();
        for (int i2 = 0; i2 < n5; ++i2) {
            arrc[i2] = arrc2[i2 % n3];
        }
        return string.concat(new String(arrc));
    }

    public static String f(String string, int n2) {
        return am.b(string, n2, ' ');
    }

    public static String b(String string, int n2, char c2) {
        if (string == null) {
            return null;
        }
        int n3 = n2 - string.length();
        if (n3 <= 0) {
            return string;
        }
        if (n3 > 8192) {
            return am.b(string, n2, String.valueOf(c2));
        }
        return am.a(c2, n3).concat(string);
    }

    public static String b(String string, int n2, String string2) {
        if (string == null) {
            return null;
        }
        if (am.a((CharSequence)string2)) {
            string2 = a;
        }
        int n3 = string2.length();
        int n4 = string.length();
        int n5 = n2 - n4;
        if (n5 <= 0) {
            return string;
        }
        if (n3 == 1 && n5 <= 8192) {
            return am.b(string, n2, string2.charAt(0));
        }
        if (n5 == n3) {
            return string2.concat(string);
        }
        if (n5 < n3) {
            return string2.substring(0, n5).concat(string);
        }
        char[] arrc = new char[n5];
        char[] arrc2 = string2.toCharArray();
        for (int i2 = 0; i2 < n5; ++i2) {
            arrc[i2] = arrc2[i2 % n3];
        }
        return new String(arrc).concat(string);
    }

    public static int f(CharSequence charSequence) {
        return charSequence == null ? 0 : charSequence.length();
    }

    public static String g(String string, int n2) {
        return am.c(string, n2, ' ');
    }

    public static String c(String string, int n2, char c2) {
        if (string == null || n2 <= 0) {
            return string;
        }
        int n3 = string.length();
        int n4 = n2 - n3;
        if (n4 <= 0) {
            return string;
        }
        string = am.b(string, n3 + n4 / 2, c2);
        string = am.a(string, n2, c2);
        return string;
    }

    public static String c(String string, int n2, String string2) {
        int n3;
        int n4;
        if (string == null || n2 <= 0) {
            return string;
        }
        if (am.a((CharSequence)string2)) {
            string2 = a;
        }
        if ((n4 = n2 - (n3 = string.length())) <= 0) {
            return string;
        }
        string = am.b(string, n3 + n4 / 2, string2);
        string = am.a(string, n2, string2);
        return string;
    }

    public static String o(String string) {
        if (string == null) {
            return null;
        }
        return string.toUpperCase();
    }

    public static String a(String string, Locale locale) {
        if (string == null) {
            return null;
        }
        return string.toUpperCase(locale);
    }

    public static String p(String string) {
        if (string == null) {
            return null;
        }
        return string.toLowerCase();
    }

    public static String b(String string, Locale locale) {
        if (string == null) {
            return null;
        }
        return string.toLowerCase(locale);
    }

    public static String q(String string) {
        int n2;
        if (string == null || (n2 = string.length()) == 0) {
            return string;
        }
        char c2 = string.charAt(0);
        if (Character.isTitleCase(c2)) {
            return string;
        }
        return new StringBuilder(n2).append(Character.toTitleCase(c2)).append(string.substring(1)).toString();
    }

    public static String r(String string) {
        int n2;
        if (string == null || (n2 = string.length()) == 0) {
            return string;
        }
        char c2 = string.charAt(0);
        if (Character.isLowerCase(c2)) {
            return string;
        }
        return new StringBuilder(n2).append(Character.toLowerCase(c2)).append(string.substring(1)).toString();
    }

    public static String s(String string) {
        if (am.a((CharSequence)string)) {
            return string;
        }
        char[] arrc = string.toCharArray();
        for (int i2 = 0; i2 < arrc.length; ++i2) {
            char c2 = arrc[i2];
            if (Character.isUpperCase(c2)) {
                arrc[i2] = Character.toLowerCase(c2);
                continue;
            }
            if (Character.isTitleCase(c2)) {
                arrc[i2] = Character.toLowerCase(c2);
                continue;
            }
            if (!Character.isLowerCase(c2)) continue;
            arrc[i2] = Character.toUpperCase(c2);
        }
        return new String(arrc);
    }

    public static int k(CharSequence charSequence, CharSequence charSequence2) {
        if (am.a(charSequence) || am.a(charSequence2)) {
            return 0;
        }
        int n2 = 0;
        int n3 = 0;
        while ((n3 = j.a(charSequence, charSequence2, n3)) != -1) {
            ++n2;
            n3 += charSequence2.length();
        }
        return n2;
    }

    public static boolean g(CharSequence charSequence) {
        if (am.a(charSequence)) {
            return false;
        }
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (Character.isLetter(charSequence.charAt(i2))) continue;
            return false;
        }
        return true;
    }

    public static boolean h(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (Character.isLetter(charSequence.charAt(i2)) || charSequence.charAt(i2) == ' ') continue;
            return false;
        }
        return true;
    }

    public static boolean i(CharSequence charSequence) {
        if (am.a(charSequence)) {
            return false;
        }
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (Character.isLetterOrDigit(charSequence.charAt(i2))) continue;
            return false;
        }
        return true;
    }

    public static boolean j(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (Character.isLetterOrDigit(charSequence.charAt(i2)) || charSequence.charAt(i2) == ' ') continue;
            return false;
        }
        return true;
    }

    public static boolean k(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (m.f(charSequence.charAt(i2))) continue;
            return false;
        }
        return true;
    }

    public static boolean l(CharSequence charSequence) {
        if (am.a(charSequence)) {
            return false;
        }
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (Character.isDigit(charSequence.charAt(i2))) continue;
            return false;
        }
        return true;
    }

    public static boolean m(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (Character.isDigit(charSequence.charAt(i2)) || charSequence.charAt(i2) == ' ') continue;
            return false;
        }
        return true;
    }

    public static boolean n(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (Character.isWhitespace(charSequence.charAt(i2))) continue;
            return false;
        }
        return true;
    }

    public static boolean o(CharSequence charSequence) {
        if (charSequence == null || am.a(charSequence)) {
            return false;
        }
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (Character.isLowerCase(charSequence.charAt(i2))) continue;
            return false;
        }
        return true;
    }

    public static boolean p(CharSequence charSequence) {
        if (charSequence == null || am.a(charSequence)) {
            return false;
        }
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (Character.isUpperCase(charSequence.charAt(i2))) continue;
            return false;
        }
        return true;
    }

    public static String t(String string) {
        return string == null ? b : string;
    }

    public static String t(String string, String string2) {
        return string == null ? string2 : string;
    }

    public static CharSequence l(CharSequence charSequence, CharSequence charSequence2) {
        return am.c(charSequence) ? charSequence2 : charSequence;
    }

    public static CharSequence m(CharSequence charSequence, CharSequence charSequence2) {
        return am.a(charSequence) ? charSequence2 : charSequence;
    }

    public static String u(String string) {
        if (string == null) {
            return null;
        }
        return new StringBuilder(string).reverse().toString();
    }

    public static String d(String string, char c2) {
        if (string == null) {
            return null;
        }
        Object[] arrobject = am.a(string, c2);
        org.apache.commons.c.c.e(arrobject);
        return am.a(arrobject, c2);
    }

    public static String h(String string, int n2) {
        return am.c(string, 0, n2);
    }

    public static String c(String string, int n2, int n3) {
        if (string == null) {
            return null;
        }
        if (n3 < 4) {
            throw new IllegalArgumentException("Minimum abbreviation width is 4");
        }
        if (string.length() <= n3) {
            return string;
        }
        if (n2 > string.length()) {
            n2 = string.length();
        }
        if (string.length() - n2 < n3 - 3) {
            n2 = string.length() - (n3 - 3);
        }
        String string2 = "...";
        if (n2 <= 4) {
            return string.substring(0, n3 - 3) + "...";
        }
        if (n3 < 7) {
            throw new IllegalArgumentException("Minimum abbreviation width with offset is 7");
        }
        if (n2 + n3 - 3 < string.length()) {
            return "..." + am.h(string.substring(n2), n3 - 3);
        }
        return "..." + string.substring(string.length() - (n3 - 3));
    }

    public static String f(String string, String string2, int n2) {
        if (am.a((CharSequence)string) || am.a((CharSequence)string2)) {
            return string;
        }
        if (n2 >= string.length() || n2 < string2.length() + 2) {
            return string;
        }
        int n3 = n2 - string2.length();
        int n4 = n3 / 2 + n3 % 2;
        int n5 = string.length() - n3 / 2;
        StringBuilder stringBuilder = new StringBuilder(n2);
        stringBuilder.append(string.substring(0, n4));
        stringBuilder.append(string2);
        stringBuilder.append(string.substring(n5));
        return stringBuilder.toString();
    }

    public static String u(String string, String string2) {
        if (string == null) {
            return string2;
        }
        if (string2 == null) {
            return string;
        }
        int n2 = am.n((CharSequence)string, (CharSequence)string2);
        if (n2 == -1) {
            return b;
        }
        return string2.substring(n2);
    }

    public static int n(CharSequence charSequence, CharSequence charSequence2) {
        int n2;
        if (charSequence == charSequence2) {
            return -1;
        }
        if (charSequence == null || charSequence2 == null) {
            return 0;
        }
        for (n2 = 0; n2 < charSequence.length() && n2 < charSequence2.length() && charSequence.charAt(n2) == charSequence2.charAt(n2); ++n2) {
        }
        if (n2 < charSequence2.length() || n2 < charSequence.length()) {
            return n2;
        }
        return -1;
    }

    public static int e(CharSequence ... arrcharSequence) {
        int n2;
        if (arrcharSequence == null || arrcharSequence.length <= 1) {
            return -1;
        }
        boolean bl2 = false;
        boolean bl3 = true;
        int n3 = arrcharSequence.length;
        int n4 = Integer.MAX_VALUE;
        int n5 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            if (arrcharSequence[n2] == null) {
                bl2 = true;
                n4 = 0;
                continue;
            }
            bl3 = false;
            n4 = Math.min(arrcharSequence[n2].length(), n4);
            n5 = Math.max(arrcharSequence[n2].length(), n5);
        }
        if (bl3 || n5 == 0 && !bl2) {
            return -1;
        }
        if (n4 == 0) {
            return 0;
        }
        n2 = -1;
        for (int i2 = 0; i2 < n4; ++i2) {
            char c2 = arrcharSequence[0].charAt(i2);
            for (int i3 = 1; i3 < n3; ++i3) {
                if (arrcharSequence[i3].charAt(i2) == c2) continue;
                n2 = i2;
                break;
            }
            if (n2 != -1) break;
        }
        if (n2 == -1 && n4 != n5) {
            return n4;
        }
        return n2;
    }

    public static String b(String ... arrstring) {
        if (arrstring == null || arrstring.length == 0) {
            return b;
        }
        int n2 = am.e(arrstring);
        if (n2 == -1) {
            if (arrstring[0] == null) {
                return b;
            }
            return arrstring[0];
        }
        if (n2 == 0) {
            return b;
        }
        return arrstring[0].substring(0, n2);
    }

    public static int o(CharSequence charSequence, CharSequence charSequence2) {
        int n2;
        Object object;
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        int n3 = charSequence.length();
        int n4 = charSequence2.length();
        if (n3 == 0) {
            return n4;
        }
        if (n4 == 0) {
            return n3;
        }
        if (n3 > n4) {
            object = charSequence;
            charSequence = charSequence2;
            charSequence2 = object;
            n3 = n4;
            n4 = charSequence2.length();
        }
        object = new int[n3 + 1];
        Object object2 = new int[n3 + 1];
        for (n2 = 0; n2 <= n3; ++n2) {
            object[n2] = n2;
        }
        for (int i2 = 1; i2 <= n4; ++i2) {
            char c2 = charSequence2.charAt(i2 - 1);
            object2[0] = i2;
            for (n2 = 1; n2 <= n3; ++n2) {
                boolean bl2 = charSequence.charAt(n2 - 1) != c2;
                object2[n2] = Math.min(Math.min(object2[n2 - 1] + 1, (int)(object[n2] + true)), (int)(object[n2 - 1] + bl2));
            }
            Object object3 = object;
            object = object2;
            object2 = object3;
        }
        return (int)object[n3];
    }

    public static int g(CharSequence charSequence, CharSequence charSequence2, int n2) {
        int n3;
        Object object;
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("Threshold must not be negative");
        }
        int n4 = charSequence.length();
        int n5 = charSequence2.length();
        if (n4 == 0) {
            return n5 <= n2 ? n5 : -1;
        }
        if (n5 == 0) {
            return n4 <= n2 ? n4 : -1;
        }
        if (n4 > n5) {
            object = charSequence;
            charSequence = charSequence2;
            charSequence2 = object;
            n4 = n5;
            n5 = charSequence2.length();
        }
        object = new int[n4 + 1];
        Object object2 = new int[n4 + 1];
        int n6 = Math.min(n4, n2) + 1;
        for (n3 = 0; n3 < n6; ++n3) {
            object[n3] = n3;
        }
        Arrays.fill((int[])object, n6, ((Object)object).length, Integer.MAX_VALUE);
        Arrays.fill(object2, Integer.MAX_VALUE);
        for (n3 = 1; n3 <= n5; ++n3) {
            int n7;
            char c2 = charSequence2.charAt(n3 - 1);
            object2[0] = n3;
            int n8 = Math.max(1, n3 - n2);
            int n9 = n7 = n3 > Integer.MAX_VALUE - n2 ? n4 : Math.min(n4, n3 + n2);
            if (n8 > n7) {
                return -1;
            }
            if (n8 > 1) {
                object2[n8 - 1] = Integer.MAX_VALUE;
            }
            for (int i2 = n8; i2 <= n7; ++i2) {
                object2[i2] = charSequence.charAt(i2 - 1) == c2 ? (int)object[i2 - 1] : 1 + Math.min(Math.min(object2[i2 - 1], (int)object[i2]), (int)object[i2 - 1]);
            }
            Object object3 = object;
            object = object2;
            object2 = object3;
        }
        if (object[n4] <= n2) {
            return (int)object[n4];
        }
        return -1;
    }

    public static double p(CharSequence charSequence, CharSequence charSequence2) {
        double d2 = 0.1;
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        double d3 = am.u(charSequence, charSequence2);
        int n2 = am.w(charSequence, charSequence2);
        double d4 = (double)Math.round((d3 + 0.1 * (double)n2 * (1.0 - d3)) * 100.0) / 100.0;
        return d4;
    }

    private static double u(CharSequence charSequence, CharSequence charSequence2) {
        String string;
        String string2;
        if (charSequence.length() > charSequence2.length()) {
            string2 = charSequence.toString().toLowerCase();
            string = charSequence2.toString().toLowerCase();
        } else {
            string2 = charSequence2.toString().toLowerCase();
            string = charSequence.toString().toLowerCase();
        }
        int n2 = string.length() / 2 + 1;
        String string3 = am.h(string, string2, n2);
        String string4 = am.h(string2, string, n2);
        if (string3.length() == 0 || string4.length() == 0) {
            return 0.0;
        }
        if (string3.length() != string4.length()) {
            return 0.0;
        }
        int n3 = am.v(string3, string4);
        double d2 = ((double)string3.length() / (double)string.length() + (double)string4.length() / (double)string2.length() + (double)(string3.length() - n3) / (double)string3.length()) / 3.0;
        return d2;
    }

    private static String h(CharSequence charSequence, CharSequence charSequence2, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder(charSequence2);
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            boolean bl2 = false;
            for (int i3 = Math.max(0, i2 - n2); !bl2 && i3 < Math.min(i2 + n2, charSequence2.length()); ++i3) {
                if (stringBuilder2.charAt(i3) != c2) continue;
                bl2 = true;
                stringBuilder.append(c2);
                stringBuilder2.setCharAt(i3, '*');
            }
        }
        return stringBuilder.toString();
    }

    private static int v(CharSequence charSequence, CharSequence charSequence2) {
        int n2 = 0;
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            if (charSequence.charAt(i2) == charSequence2.charAt(i2)) continue;
            ++n2;
        }
        return n2 / 2;
    }

    private static int w(CharSequence charSequence, CharSequence charSequence2) {
        int n2 = am.b(new String[]{charSequence.toString(), charSequence2.toString()}).length();
        return n2 > 4 ? 4 : n2;
    }

    public static boolean q(CharSequence charSequence, CharSequence charSequence2) {
        return am.a(charSequence, charSequence2, false);
    }

    public static boolean r(CharSequence charSequence, CharSequence charSequence2) {
        return am.a(charSequence, charSequence2, true);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2, boolean bl2) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == null && charSequence2 == null;
        }
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        return j.a(charSequence, bl2, 0, charSequence2, 0, charSequence2.length());
    }

    public static boolean c(CharSequence charSequence, CharSequence ... arrcharSequence) {
        if (am.a(charSequence) || org.apache.commons.c.c.f(arrcharSequence)) {
            return false;
        }
        for (CharSequence charSequence2 : arrcharSequence) {
            if (!am.q(charSequence, charSequence2)) continue;
            return true;
        }
        return false;
    }

    public static boolean s(CharSequence charSequence, CharSequence charSequence2) {
        return am.b(charSequence, charSequence2, false);
    }

    public static boolean t(CharSequence charSequence, CharSequence charSequence2) {
        return am.b(charSequence, charSequence2, true);
    }

    private static boolean b(CharSequence charSequence, CharSequence charSequence2, boolean bl2) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == null && charSequence2 == null;
        }
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        int n2 = charSequence.length() - charSequence2.length();
        return j.a(charSequence, bl2, n2, charSequence2, 0, charSequence2.length());
    }

    public static String v(String string) {
        if (string == null) {
            return null;
        }
        return g.matcher(am.a(string)).replaceAll(a);
    }

    public static boolean d(CharSequence charSequence, CharSequence ... arrcharSequence) {
        if (am.a(charSequence) || org.apache.commons.c.c.f(arrcharSequence)) {
            return false;
        }
        for (CharSequence charSequence2 : arrcharSequence) {
            if (!am.s(charSequence, charSequence2)) continue;
            return true;
        }
        return false;
    }

    private static String a(String string, CharSequence charSequence, boolean bl2, CharSequence ... arrcharSequence) {
        if (string == null || am.a(charSequence) || am.b((CharSequence)string, charSequence, bl2)) {
            return string;
        }
        if (arrcharSequence != null && arrcharSequence.length > 0) {
            for (CharSequence charSequence2 : arrcharSequence) {
                if (!am.b((CharSequence)string, charSequence2, bl2)) continue;
                return string;
            }
        }
        return string + charSequence.toString();
    }

    public static String a(String string, CharSequence charSequence, CharSequence ... arrcharSequence) {
        return am.a(string, charSequence, false, arrcharSequence);
    }

    public static String b(String string, CharSequence charSequence, CharSequence ... arrcharSequence) {
        return am.a(string, charSequence, true, arrcharSequence);
    }

    private static String b(String string, CharSequence charSequence, boolean bl2, CharSequence ... arrcharSequence) {
        if (string == null || am.a(charSequence) || am.a((CharSequence)string, charSequence, bl2)) {
            return string;
        }
        if (arrcharSequence != null && arrcharSequence.length > 0) {
            for (CharSequence charSequence2 : arrcharSequence) {
                if (!am.a((CharSequence)string, charSequence2, bl2)) continue;
                return string;
            }
        }
        return charSequence.toString() + string;
    }

    public static String c(String string, CharSequence charSequence, CharSequence ... arrcharSequence) {
        return am.b(string, charSequence, false, arrcharSequence);
    }

    public static String d(String string, CharSequence charSequence, CharSequence ... arrcharSequence) {
        return am.b(string, charSequence, true, arrcharSequence);
    }

    public static String a(byte[] arrby, String string) {
        return string != null ? new String(arrby, string) : new String(arrby, Charset.defaultCharset());
    }

    public static String a(byte[] arrby, Charset charset) {
        return new String(arrby, charset != null ? charset : Charset.defaultCharset());
    }
}

