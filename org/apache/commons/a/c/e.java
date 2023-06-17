/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c;

import java.util.Locale;
import org.apache.commons.a.c.g;
import org.apache.commons.a.h;
import org.apache.commons.a.j;

public class e
implements j {
    private static final char[] a = new char[]{'A', 'E', 'I', 'J', 'O', 'U', 'Y'};
    private static final char[] b = new char[]{'S', 'C', 'Z'};
    private static final char[] c = new char[]{'W', 'F', 'P', 'V'};
    private static final char[] d = new char[]{'G', 'K', 'Q'};
    private static final char[] e = new char[]{'C', 'K', 'Q'};
    private static final char[] f = new char[]{'A', 'H', 'K', 'L', 'O', 'Q', 'R', 'U', 'X'};
    private static final char[] g = new char[]{'S', 'Z'};
    private static final char[] h = new char[]{'A', 'H', 'O', 'U', 'K', 'Q', 'X'};
    private static final char[] i = new char[]{'T', 'D', 'X'};
    private static final char[][] j = new char[][]{{'\u00c4', 'A'}, {'\u00dc', 'U'}, {'\u00d6', 'O'}, {'\u00df', 'S'}};

    private static boolean a(char[] arrc, char c2) {
        for (char c3 : arrc) {
            if (c3 != c2) continue;
            return true;
        }
        return false;
    }

    public String a(String string) {
        if (string == null) {
            return null;
        }
        string = this.c(string);
        org.apache.commons.a.c.h h2 = new org.apache.commons.a.c.h(this, string.length() * 2);
        g g2 = new g(this, string.toCharArray());
        char c2 = '-';
        int n2 = 47;
        int n3 = g2.a();
        while (n3 > 0) {
            int n4;
            char c3 = g2.d();
            n3 = g2.a();
            char c4 = n3 > 0 ? (char)g2.b() : (char)'-';
            if (org.apache.commons.a.c.e.a(a, c3)) {
                n4 = 48;
            } else if (c3 == 'H' || c3 < 'A' || c3 > 'Z') {
                if (n2 == 47) continue;
                n4 = 45;
            } else if (c3 == 'B' || c3 == 'P' && c4 != 'H') {
                n4 = 49;
            } else if (!(c3 != 'D' && c3 != 'T' || org.apache.commons.a.c.e.a(b, c4))) {
                n4 = 50;
            } else if (org.apache.commons.a.c.e.a(c, c3)) {
                n4 = 51;
            } else if (org.apache.commons.a.c.e.a(d, c3)) {
                n4 = 52;
            } else if (c3 == 'X' && !org.apache.commons.a.c.e.a(e, c2)) {
                n4 = 52;
                g2.a('S');
                ++n3;
            } else {
                n4 = c3 == 'S' || c3 == 'Z' ? 56 : (c3 == 'C' ? (n2 == 47 ? (org.apache.commons.a.c.e.a(f, c4) ? 52 : 56) : (org.apache.commons.a.c.e.a(g, c2) || !org.apache.commons.a.c.e.a(h, c4) ? 56 : 52)) : (org.apache.commons.a.c.e.a(i, c3) ? 56 : (c3 == 'R' ? 55 : (c3 == 'L' ? 53 : (c3 == 'M' || c3 == 'N' ? 54 : (int)c3)))));
            }
            if (n4 != 45 && (n2 != n4 && (n4 != 48 || n2 == 47) || n4 < 48 || n4 > 56)) {
                h2.a((char)n4);
            }
            c2 = c3;
            n2 = n4;
        }
        return h2.toString();
    }

    @Override
    public Object b(Object object) {
        if (!(object instanceof String)) {
            throw new h("This method's parameter was expected to be of the type " + String.class.getName() + ". But actually it was of the type " + object.getClass().getName() + ".");
        }
        return this.b((String)object);
    }

    @Override
    public String b(String string) {
        return this.a(string);
    }

    public boolean a(String string, String string2) {
        return this.a(string).equals(this.a(string2));
    }

    private String c(String string) {
        string = string.toUpperCase(Locale.GERMAN);
        char[] arrc = string.toCharArray();
        block0: for (int i2 = 0; i2 < arrc.length; ++i2) {
            if (arrc[i2] <= 'Z') continue;
            for (char[] arrc2 : j) {
                if (arrc[i2] != arrc2[0]) continue;
                arrc[i2] = arrc2[1];
                continue block0;
            }
        }
        return new String(arrc);
    }
}

