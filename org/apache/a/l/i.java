/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.l;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.apache.a.e.a;
import org.apache.a.e.d;
import org.apache.a.e.h;
import org.apache.a.l.j;

public final class i {
    private i() {
    }

    public static h a(j j2) {
        return h.g().a(j2.a("http.socket.timeout", 0)).a(j2.a("http.socket.reuseaddr", false)).b(j2.a("http.socket.keepalive", false)).b(j2.a("http.socket.linger", -1)).c(j2.a("http.tcp.nodelay", true)).a();
    }

    public static d b(j j2) {
        return d.d().b(j2.a("http.connection.max-header-count", -1)).a(j2.a("http.connection.max-line-length", -1)).a();
    }

    public static a c(j j2) {
        d d2 = i.b(j2);
        String string = (String)j2.a("http.protocol.element-charset");
        return a.h().a(string != null ? Charset.forName(string) : null).a((CodingErrorAction)j2.a("http.malformed.input.action")).a((CodingErrorAction)j2.a("http.unmappable.input.action")).a(d2).a();
    }
}

