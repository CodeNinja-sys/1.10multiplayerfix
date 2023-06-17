/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.h;

import org.apache.logging.log4j.core.d.v;
import org.apache.logging.log4j.core.h.i;
import org.apache.logging.log4j.core.h.j;
import org.apache.logging.log4j.core.h.k;
import org.apache.logging.log4j.core.h.l;
import org.apache.logging.log4j.core.h.m;

public abstract class h {
    private static final h a = new i(',');
    private static final h b = new i('\t');
    private static final h c = new i(' ');
    private static final h d = new j(" \t\n\r\f".toCharArray());
    private static final h e = new m();
    private static final h f = new i('\'');
    private static final h g = new i('\"');
    private static final h h = new j("'\"".toCharArray());
    private static final h i = new k();

    protected h() {
    }

    public static h a() {
        return a;
    }

    public static h b() {
        return b;
    }

    public static h c() {
        return c;
    }

    public static h d() {
        return d;
    }

    public static h e() {
        return e;
    }

    public static h f() {
        return f;
    }

    public static h g() {
        return g;
    }

    public static h h() {
        return h;
    }

    public static h i() {
        return i;
    }

    public static h a(char c2) {
        return new i(c2);
    }

    public static h a(char[] arrc) {
        if (arrc == null || arrc.length == 0) {
            return i;
        }
        if (arrc.length == 1) {
            return new i(arrc[0]);
        }
        return new j(arrc);
    }

    public static h a(String string) {
        if (v.a(string)) {
            return i;
        }
        if (string.length() == 1) {
            return new i(string.charAt(0));
        }
        return new j(string.toCharArray());
    }

    public static h b(String string) {
        if (v.a(string)) {
            return i;
        }
        return new l(string);
    }

    public abstract int a(char[] var1, int var2, int var3, int var4);

    public int a(char[] arrc, int n2) {
        return this.a(arrc, n2, 0, arrc.length);
    }
}

