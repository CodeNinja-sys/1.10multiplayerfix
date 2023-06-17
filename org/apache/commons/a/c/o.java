/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c;

import org.apache.commons.a.c.p;
import org.apache.commons.a.h;
import org.apache.commons.a.j;

public class o
implements j {
    public static final String a = "01230120022455012623010202";
    private static final char[] c = "01230120022455012623010202".toCharArray();
    public static final o b = new o();
    private int d = 4;
    private final char[] e;

    public o() {
        this.e = c;
    }

    public o(char[] arrc) {
        this.e = new char[arrc.length];
        System.arraycopy(arrc, 0, this.e, 0, arrc.length);
    }

    public o(String string) {
        this.e = string.toCharArray();
    }

    public int a(String string, String string2) {
        return p.a(this, string, string2);
    }

    @Override
    public Object b(Object object) {
        if (!(object instanceof String)) {
            throw new h("Parameter supplied to Soundex encode is not of type java.lang.String");
        }
        return this.a((String)object);
    }

    @Override
    public String b(String string) {
        return this.a(string);
    }

    private char a(String string, int n2) {
        char c2;
        char c3;
        char c4;
        char c5 = this.a(string.charAt(n2));
        if (!(n2 <= 1 || c5 == '0' || 'H' != (c4 = string.charAt(n2 - 1)) && 'W' != c4 || (c3 = this.a(c2 = string.charAt(n2 - 2))) != c5 && 'H' != c2 && 'W' != c2)) {
            return '\u0000';
        }
        return c5;
    }

    public int a() {
        return this.d;
    }

    private char[] b() {
        return this.e;
    }

    private char a(char c2) {
        int n2 = c2 - 65;
        if (n2 < 0 || n2 >= this.b().length) {
            throw new IllegalArgumentException("The character is not mapped: " + c2);
        }
        return this.b()[n2];
    }

    public void a(int n2) {
        this.d = n2;
    }

    public String a(String string) {
        if (string == null) {
            return null;
        }
        if ((string = p.a(string)).length() == 0) {
            return string;
        }
        char[] arrc = new char[]{'0', '0', '0', '0'};
        int n2 = 1;
        int n3 = 1;
        arrc[0] = string.charAt(0);
        char c2 = this.a(string, 0);
        while (n2 < string.length() && n3 < arrc.length) {
            char c3;
            if ((c3 = this.a(string, n2++)) == '\u0000') continue;
            if (c3 != '0' && c3 != c2) {
                arrc[n3++] = c3;
            }
            c2 = c3;
        }
        return new String(arrc);
    }
}

