/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c;

import java.util.Locale;
import org.apache.commons.a.h;
import org.apache.commons.a.j;

public class k
implements j {
    private static final String a = " ";
    private static final String b = "";
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private static final int f = 4;
    private static final int g = 5;
    private static final int h = 6;
    private static final int i = 7;
    private static final int j = 8;
    private static final int k = 11;
    private static final int l = 12;
    private static final String m = "AaEeIiOoUuAaEeIiOoUuYyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu";
    private static final String n = "\u00c0\u00e0\u00c8\u00e8\u00cc\u00ec\u00d2\u00f2\u00d9\u00f9\u00c1\u00e1\u00c9\u00e9\u00cd\u00ed\u00d3\u00f3\u00da\u00fa\u00dd\u00fd\u00c2\u00e2\u00ca\u00ea\u00ce\u00ee\u00d4\u00f4\u00db\u00fb\u0176\u0177\u00c3\u00e3\u00d5\u00f5\u00d1\u00f1\u00c4\u00e4\u00cb\u00eb\u00cf\u00ef\u00d6\u00f6\u00dc\u00fc\u0178\u00ff\u00c5\u00e5\u00c7\u00e7\u0150\u0151\u0170\u0171";
    private static final String[] o = new String[]{"BB", "CC", "DD", "FF", "GG", "HH", "JJ", "KK", "LL", "MM", "NN", "PP", "QQ", "RR", "SS", "TT", "VV", "WW", "XX", "YY", "ZZ"};

    String a(String string) {
        String[] arrstring;
        String string2 = string.toUpperCase(Locale.ENGLISH);
        for (String string3 : arrstring = new String[]{"\\-", "[&]", "\\'", "\\.", "[\\,]"}) {
            string2 = string2.replaceAll(string3, b);
        }
        string2 = this.e(string2);
        string2 = string2.replaceAll("\\s+", b);
        return string2;
    }

    @Override
    public final Object b(Object object) {
        if (!(object instanceof String)) {
            throw new h("Parameter supplied to Match Rating Approach encoder is not of type java.lang.String");
        }
        return this.b((String)object);
    }

    @Override
    public final String b(String string) {
        if (string == null || b.equalsIgnoreCase(string) || a.equalsIgnoreCase(string) || string.length() == 1) {
            return b;
        }
        string = this.a(string);
        string = this.g(string);
        string = this.f(string);
        string = this.c(string);
        return string;
    }

    String c(String string) {
        int n2 = string.length();
        if (n2 > 6) {
            String string2 = string.substring(0, 3);
            String string3 = string.substring(n2 - 3, n2);
            return string2 + string3;
        }
        return string;
    }

    int a(int n2) {
        int n3 = 0;
        n3 = n2 <= 4 ? 5 : (n2 >= 5 && n2 <= 7 ? 4 : (n2 >= 8 && n2 <= 11 ? 3 : (n2 == 12 ? 2 : 1)));
        return n3;
    }

    public boolean a(String string, String string2) {
        if (string == null || b.equalsIgnoreCase(string) || a.equalsIgnoreCase(string)) {
            return false;
        }
        if (string2 == null || b.equalsIgnoreCase(string2) || a.equalsIgnoreCase(string2)) {
            return false;
        }
        if (string.length() == 1 || string2.length() == 1) {
            return false;
        }
        if (string.equalsIgnoreCase(string2)) {
            return true;
        }
        string = this.a(string);
        string2 = this.a(string2);
        string = this.g(string);
        string2 = this.g(string2);
        string = this.f(string);
        string2 = this.f(string2);
        string = this.c(string);
        string2 = this.c(string2);
        if (Math.abs(string.length() - string2.length()) >= 3) {
            return false;
        }
        int n2 = Math.abs(string.length() + string2.length());
        int n3 = 0;
        n3 = this.a(n2);
        int n4 = this.b(string, string2);
        return n4 >= n3;
    }

    boolean d(String string) {
        return string.equalsIgnoreCase("E") || string.equalsIgnoreCase("A") || string.equalsIgnoreCase("O") || string.equalsIgnoreCase("I") || string.equalsIgnoreCase("U");
    }

    int b(String string, String string2) {
        char[] arrc = string.toCharArray();
        char[] arrc2 = string2.toCharArray();
        int n2 = string.length() - 1;
        int n3 = string2.length() - 1;
        String string3 = b;
        String string4 = b;
        String string5 = b;
        String string6 = b;
        for (int i2 = 0; i2 < arrc.length && i2 <= n3; ++i2) {
            string3 = string.substring(i2, i2 + 1);
            string4 = string.substring(n2 - i2, n2 - i2 + 1);
            string5 = string2.substring(i2, i2 + 1);
            string6 = string2.substring(n3 - i2, n3 - i2 + 1);
            if (string3.equals(string5)) {
                arrc[i2] = 32;
                arrc2[i2] = 32;
            }
            if (!string4.equals(string6)) continue;
            arrc[n2 - i2] = 32;
            arrc2[n3 - i2] = 32;
        }
        String string7 = new String(arrc).replaceAll("\\s+", b);
        String string8 = new String(arrc2).replaceAll("\\s+", b);
        if (string7.length() > string8.length()) {
            return Math.abs(6 - string7.length());
        }
        return Math.abs(6 - string8.length());
    }

    String e(String string) {
        if (string == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            int n3 = n.indexOf(c2);
            if (n3 > -1) {
                stringBuilder.append(m.charAt(n3));
                continue;
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    String f(String string) {
        String string2 = string.toUpperCase();
        for (String string3 : o) {
            if (!string2.contains(string3)) continue;
            String string4 = string3.substring(0, 1);
            string2 = string2.replace(string3, string4);
        }
        return string2;
    }

    String g(String string) {
        String string2 = string.substring(0, 1);
        string = string.replaceAll("A", b);
        string = string.replaceAll("E", b);
        string = string.replaceAll("I", b);
        string = string.replaceAll("O", b);
        string = string.replaceAll("U", b);
        string = string.replaceAll("\\s{2,}\\b", a);
        if (this.d(string2)) {
            return string2 + string;
        }
        return string;
    }
}

