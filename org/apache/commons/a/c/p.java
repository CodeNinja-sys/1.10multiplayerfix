/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c;

import java.util.Locale;
import org.apache.commons.a.j;

final class p {
    p() {
    }

    static String a(String string) {
        if (string == null || string.length() == 0) {
            return string;
        }
        int n2 = string.length();
        char[] arrc = new char[n2];
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!Character.isLetter(string.charAt(i2))) continue;
            arrc[n3++] = string.charAt(i2);
        }
        if (n3 == n2) {
            return string.toUpperCase(Locale.ENGLISH);
        }
        return new String(arrc, 0, n3).toUpperCase(Locale.ENGLISH);
    }

    static int a(j j2, String string, String string2) {
        return p.a(j2.b(string), j2.b(string2));
    }

    static int a(String string, String string2) {
        if (string == null || string2 == null) {
            return 0;
        }
        int n2 = Math.min(string.length(), string2.length());
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (string.charAt(i2) != string2.charAt(i2)) continue;
            ++n3;
        }
        return n3;
    }
}

