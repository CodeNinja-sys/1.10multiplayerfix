/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.d;

import org.apache.a.l.h;
import org.apache.a.l.j;
import org.apache.a.o.a;

public class g {
    private g() {
    }

    public static boolean a(j j2) {
        a.a(j2, "HTTP parameters");
        return j2.a("http.protocol.handle-redirects", true);
    }

    public static void a(j j2, boolean bl2) {
        a.a(j2, "HTTP parameters");
        j2.b("http.protocol.handle-redirects", bl2);
    }

    public static boolean b(j j2) {
        a.a(j2, "HTTP parameters");
        return j2.a("http.protocol.handle-authentication", true);
    }

    public static void b(j j2, boolean bl2) {
        a.a(j2, "HTTP parameters");
        j2.b("http.protocol.handle-authentication", bl2);
    }

    public static String c(j j2) {
        a.a(j2, "HTTP parameters");
        String string = (String)j2.a("http.protocol.cookie-policy");
        if (string == null) {
            return "best-match";
        }
        return string;
    }

    public static void a(j j2, String string) {
        a.a(j2, "HTTP parameters");
        j2.a("http.protocol.cookie-policy", string);
    }

    public static void a(j j2, long l2) {
        a.a(j2, "HTTP parameters");
        j2.b("http.conn-manager.timeout", l2);
    }

    public static long d(j j2) {
        a.a(j2, "HTTP parameters");
        Long l2 = (Long)j2.a("http.conn-manager.timeout");
        if (l2 != null) {
            return l2;
        }
        return h.f(j2);
    }
}

