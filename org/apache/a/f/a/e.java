/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.a;

import org.apache.a.f.a.c;
import org.apache.a.f.a.f;
import org.apache.a.f.a.g;
import org.apache.a.l.j;
import org.apache.a.o.a;

public final class e
implements c {
    public static final int d = 20;
    private static final g e = new f();

    public static long a(j j2) {
        a.a(j2, "HTTP parameters");
        return j2.a("http.conn-manager.timeout", 0L);
    }

    public static void a(j j2, long l2) {
        a.a(j2, "HTTP parameters");
        j2.b("http.conn-manager.timeout", l2);
    }

    public static void a(j j2, g g2) {
        a.a(j2, "HTTP parameters");
        j2.a("http.conn-manager.max-per-route", g2);
    }

    public static g b(j j2) {
        a.a(j2, "HTTP parameters");
        g g2 = (g)j2.a("http.conn-manager.max-per-route");
        if (g2 == null) {
            g2 = e;
        }
        return g2;
    }

    public static void a(j j2, int n2) {
        a.a(j2, "HTTP parameters");
        j2.b("http.conn-manager.max-total", n2);
    }

    public static int c(j j2) {
        a.a(j2, "HTTP parameters");
        return j2.a("http.conn-manager.max-total", 20);
    }
}

