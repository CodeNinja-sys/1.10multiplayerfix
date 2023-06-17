/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.a;

import java.net.InetAddress;
import org.apache.a.f.a.i;
import org.apache.a.f.b.b;
import org.apache.a.l.j;
import org.apache.a.o.a;
import org.apache.a.r;

public class k
implements i {
    public static final r d = new r("127.0.0.255", 0, "no-host");
    public static final b e = new b(d);

    private k() {
    }

    public static r a(j j2) {
        a.a(j2, "Parameters");
        r r2 = (r)j2.a("http.route.default-proxy");
        if (r2 != null && d.equals(r2)) {
            r2 = null;
        }
        return r2;
    }

    public static void a(j j2, r r2) {
        a.a(j2, "Parameters");
        j2.a("http.route.default-proxy", r2);
    }

    public static b b(j j2) {
        a.a(j2, "Parameters");
        b b2 = (b)j2.a("http.route.forced-route");
        if (b2 != null && e.equals(b2)) {
            b2 = null;
        }
        return b2;
    }

    public static void a(j j2, b b2) {
        a.a(j2, "Parameters");
        j2.a("http.route.forced-route", b2);
    }

    public static InetAddress c(j j2) {
        a.a(j2, "Parameters");
        InetAddress inetAddress = (InetAddress)j2.a("http.route.local-address");
        return inetAddress;
    }

    public static void a(j j2, InetAddress inetAddress) {
        a.a(j2, "Parameters");
        j2.a("http.route.local-address", inetAddress);
    }
}

