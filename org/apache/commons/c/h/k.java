/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h;

import org.apache.commons.c.am;
import org.apache.commons.c.h.l;
import org.apache.commons.c.h.m;
import org.apache.commons.c.h.n;
import org.apache.commons.c.h.o;
import org.apache.commons.c.h.p;

public abstract class k {
    private static final k a = new l(',');
    private static final k b = new l('\t');
    private static final k c = new l(' ');
    private static final k d = new m(" \t\n\r\f".toCharArray());
    private static final k e = new p();
    private static final k f = new l('\'');
    private static final k g = new l('\"');
    private static final k h = new m("'\"".toCharArray());
    private static final k i = new n();

    public static k a() {
        return a;
    }

    public static k b() {
        return b;
    }

    public static k c() {
        return c;
    }

    public static k d() {
        return d;
    }

    public static k e() {
        return e;
    }

    public static k f() {
        return f;
    }

    public static k g() {
        return g;
    }

    public static k h() {
        return h;
    }

    public static k i() {
        return i;
    }

    public static k a(char c2) {
        return new l(c2);
    }

    public static k a(char ... arrc) {
        if (arrc == null || arrc.length == 0) {
            return i;
        }
        if (arrc.length == 1) {
            return new l(arrc[0]);
        }
        return new m(arrc);
    }

    public static k a(String string) {
        if (am.a((CharSequence)string)) {
            return i;
        }
        if (string.length() == 1) {
            return new l(string.charAt(0));
        }
        return new m(string.toCharArray());
    }

    public static k b(String string) {
        if (am.a((CharSequence)string)) {
            return i;
        }
        return new o(string);
    }

    protected k() {
    }

    public abstract int a(char[] var1, int var2, int var3, int var4);

    public int a(char[] arrc, int n2) {
        return this.a(arrc, n2, 0, arrc.length);
    }
}

