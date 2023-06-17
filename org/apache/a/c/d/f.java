/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.d;

import java.net.InetAddress;
import java.util.Collection;
import org.apache.a.c.a.c;
import org.apache.a.l.j;
import org.apache.a.r;

public final class f {
    private f() {
    }

    public static c a(j j2) {
        return c.q().d(j2.a("http.socket.timeout", 0)).b(j2.a("http.connection.stalecheck", true)).c(j2.a("http.connection.timeout", 0)).a(j2.a("http.protocol.expect-continue", false)).a((r)j2.a("http.route.default-proxy")).a((InetAddress)j2.a("http.route.local-address")).b((Collection)j2.a("http.auth.proxy-scheme-pref")).a((Collection)j2.a("http.auth.target-scheme-pref")).f(j2.a("http.protocol.handle-authentication", true)).e(j2.a("http.protocol.allow-circular-redirects", false)).b((int)j2.a("http.conn-manager.timeout", 0L)).a((String)j2.a("http.protocol.cookie-policy")).a(j2.a("http.protocol.max-redirects", 50)).c(j2.a("http.protocol.handle-redirects", true)).d(!j2.a("http.protocol.reject-relative-redirect", false)).a();
    }
}

