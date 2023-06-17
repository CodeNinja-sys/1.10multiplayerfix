/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.e;

import com.a.a.b.cl;
import com.a.a.e.d;
import com.a.a.e.g;
import com.a.a.e.j;
import com.a.a.e.k;
import com.a.a.e.l;
import com.a.a.e.p;

public final class i {
    private static final g a = new j();

    private i() {
    }

    public static g a() {
        return a;
    }

    public static l b() {
        return new l(null);
    }

    static p a(g g2) {
        cl.a(g2);
        if (g2 instanceof p) {
            return (p)g2;
        }
        if (g2 instanceof d) {
            return i.a((d)g2);
        }
        throw new IllegalArgumentException("Cannot create a UnicodeEscaper from: " + g2.getClass().getName());
    }

    public static String a(d d2, char c2) {
        return i.a(d2.a(c2));
    }

    public static String a(p p2, int n2) {
        return i.a(p2.a(n2));
    }

    private static String a(char[] arrc) {
        return arrc == null ? null : new String(arrc);
    }

    private static p a(d d2) {
        return new k(d2);
    }
}

