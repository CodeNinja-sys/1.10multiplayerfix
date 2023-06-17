/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import java.util.Locale;

public class dg {
    public static Locale a(String string) {
        String string2 = "";
        String string3 = "";
        String string4 = "";
        int n2 = string.indexOf(95);
        if (n2 < 0) {
            string2 = string;
        } else {
            int n3;
            string2 = string.substring(0, n2);
            if ((n3 = string.indexOf(95, ++n2)) < 0) {
                string3 = string.substring(n2);
            } else {
                string3 = string.substring(n2, n3);
                string4 = string.substring(n3 + 1);
            }
        }
        return new Locale(string2, string3, string4);
    }

    public static boolean a(String string, String string2) {
        if (!string2.startsWith(string)) {
            return false;
        }
        int n2 = string.length();
        return n2 == string2.length() || string2.charAt(n2) == '_';
    }

    public static boolean a(Locale locale, Locale locale2) {
        return dg.a(locale.toString(), locale2.toString());
    }

    public static Locale a(Locale locale) {
        int n2;
        String[] arrstring = new String[]{locale.getLanguage(), locale.getCountry(), locale.getVariant()};
        for (n2 = 2; n2 >= 0; --n2) {
            if (arrstring[n2].length() == 0) continue;
            arrstring[n2] = "";
            break;
        }
        if (n2 < 0) {
            return null;
        }
        return new Locale(arrstring[0], arrstring[1], arrstring[2]);
    }
}

