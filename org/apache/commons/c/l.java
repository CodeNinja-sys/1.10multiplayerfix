/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import org.apache.commons.c.am;
import org.apache.commons.c.k;

public class l {
    public static String a(String string, String ... arrstring) {
        if (am.a((CharSequence)string) || l.a(arrstring)) {
            return string;
        }
        k k2 = k.a(arrstring);
        StringBuilder stringBuilder = new StringBuilder(string.length());
        char[] arrc = string.toCharArray();
        int n2 = arrc.length;
        int n3 = 32;
        int n4 = 32;
        for (int i2 = 0; i2 < n2; ++i2) {
            n4 = arrc[i2];
            if (n4 == n3 && i2 != 0 && k2.a((char)n4)) continue;
            stringBuilder.append((char)n4);
            n3 = n4;
        }
        return stringBuilder.toString();
    }

    public static boolean b(String string, String ... arrstring) {
        if (am.a((CharSequence)string) || l.a(arrstring)) {
            return false;
        }
        k k2 = k.a(arrstring);
        for (char c2 : string.toCharArray()) {
            if (!k2.a(c2)) continue;
            return true;
        }
        return false;
    }

    public static int c(String string, String ... arrstring) {
        if (am.a((CharSequence)string) || l.a(arrstring)) {
            return 0;
        }
        k k2 = k.a(arrstring);
        int n2 = 0;
        for (char c2 : string.toCharArray()) {
            if (!k2.a(c2)) continue;
            ++n2;
        }
        return n2;
    }

    public static String d(String string, String ... arrstring) {
        if (string == null) {
            return null;
        }
        if (string.isEmpty() || l.a(arrstring)) {
            return "";
        }
        return l.a(string, arrstring, true);
    }

    public static String e(String string, String ... arrstring) {
        if (am.a((CharSequence)string) || l.a(arrstring)) {
            return string;
        }
        return l.a(string, arrstring, false);
    }

    private static String a(String string, String[] arrstring, boolean bl2) {
        k k2 = k.a(arrstring);
        StringBuilder stringBuilder = new StringBuilder(string.length());
        char[] arrc = string.toCharArray();
        int n2 = arrc.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (k2.a(arrc[i2]) != bl2) continue;
            stringBuilder.append(arrc[i2]);
        }
        return stringBuilder.toString();
    }

    private static boolean a(String[] arrstring) {
        if (arrstring != null) {
            for (String string : arrstring) {
                if (!am.b((CharSequence)string)) continue;
                return false;
            }
        }
        return true;
    }
}

