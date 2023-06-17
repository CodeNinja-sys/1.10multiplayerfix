/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c;

import java.util.regex.Pattern;
import org.apache.commons.a.c.p;
import org.apache.commons.a.h;
import org.apache.commons.a.j;

public class m
implements j {
    private static final char[] a = new char[]{'A'};
    private static final char[] b = new char[]{'A', 'F'};
    private static final char[] c = new char[]{'C'};
    private static final char[] d = new char[]{'F', 'F'};
    private static final char[] e = new char[]{'G'};
    private static final char[] f = new char[]{'N'};
    private static final char[] g = new char[]{'N', 'N'};
    private static final char[] h = new char[]{'S'};
    private static final char[] i = new char[]{'S', 'S', 'S'};
    private static final Pattern j = Pattern.compile("^MAC");
    private static final Pattern k = Pattern.compile("^KN");
    private static final Pattern l = Pattern.compile("^K");
    private static final Pattern m = Pattern.compile("^(PH|PF)");
    private static final Pattern n = Pattern.compile("^SCH");
    private static final Pattern o = Pattern.compile("(EE|IE)$");
    private static final Pattern p = Pattern.compile("(DT|RT|RD|NT|ND)$");
    private static final char q = ' ';
    private static final int r = 6;
    private final boolean s;

    private static boolean a(char c2) {
        return c2 == 'A' || c2 == 'E' || c2 == 'I' || c2 == 'O' || c2 == 'U';
    }

    private static char[] a(char c2, char c3, char c4, char c5) {
        if (c3 == 'E' && c4 == 'V') {
            return b;
        }
        if (org.apache.commons.a.c.m.a(c3)) {
            return a;
        }
        if (c3 == 'Q') {
            return e;
        }
        if (c3 == 'Z') {
            return h;
        }
        if (c3 == 'M') {
            return f;
        }
        if (c3 == 'K') {
            if (c4 == 'N') {
                return g;
            }
            return c;
        }
        if (c3 == 'S' && c4 == 'C' && c5 == 'H') {
            return i;
        }
        if (c3 == 'P' && c4 == 'H') {
            return d;
        }
        if (!(c3 != 'H' || org.apache.commons.a.c.m.a(c2) && org.apache.commons.a.c.m.a(c4))) {
            return new char[]{c2};
        }
        if (c3 == 'W' && org.apache.commons.a.c.m.a(c2)) {
            return new char[]{c2};
        }
        return new char[]{c3};
    }

    public m() {
        this(true);
    }

    public m(boolean bl2) {
        this.s = bl2;
    }

    @Override
    public Object b(Object object) {
        if (!(object instanceof String)) {
            throw new h("Parameter supplied to Nysiis encode is not of type java.lang.String");
        }
        return this.a((String)object);
    }

    @Override
    public String b(String string) {
        return this.a(string);
    }

    public boolean a() {
        return this.s;
    }

    public String a(String string) {
        char c2;
        int n2;
        if (string == null) {
            return null;
        }
        if ((string = org.apache.commons.a.c.p.a(string)).length() == 0) {
            return string;
        }
        string = j.matcher(string).replaceFirst("MCC");
        string = k.matcher(string).replaceFirst("NN");
        string = l.matcher(string).replaceFirst("C");
        string = m.matcher(string).replaceFirst("FF");
        string = n.matcher(string).replaceFirst("SSS");
        string = o.matcher(string).replaceFirst("Y");
        string = p.matcher(string).replaceFirst("D");
        StringBuilder stringBuilder = new StringBuilder(string.length());
        stringBuilder.append(string.charAt(0));
        char[] arrc = string.toCharArray();
        int n3 = arrc.length;
        for (n2 = 1; n2 < n3; ++n2) {
            c2 = n2 < n3 - 1 ? arrc[n2 + 1] : (char)' ';
            char c3 = n2 < n3 - 2 ? arrc[n2 + 2] : (char)' ';
            char[] arrc2 = org.apache.commons.a.c.m.a(arrc[n2 - 1], arrc[n2], c2, c3);
            System.arraycopy(arrc2, 0, arrc, n2, arrc2.length);
            if (arrc[n2] == arrc[n2 - 1]) continue;
            stringBuilder.append(arrc[n2]);
        }
        if (stringBuilder.length() > 1) {
            n2 = stringBuilder.charAt(stringBuilder.length() - 1);
            if (n2 == 83) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                n2 = stringBuilder.charAt(stringBuilder.length() - 1);
            }
            if (stringBuilder.length() > 2 && (c2 = stringBuilder.charAt(stringBuilder.length() - 2)) == 'A' && n2 == 89) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 2);
            }
            if (n2 == 65) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
        }
        String string2 = stringBuilder.toString();
        return this.a() ? string2.substring(0, Math.min(6, string2.length())) : string2;
    }
}

