/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.c.a.d.ar;
import io.netty.c.a.d.aw;
import io.netty.c.a.d.bp;
import io.netty.c.a.d.br;
import io.netty.c.a.d.c.ae;
import io.netty.c.a.d.c.af;
import io.netty.c.a.d.c.ag;
import io.netty.c.a.d.c.au;
import io.netty.c.a.d.c.av;
import io.netty.c.a.d.c.p;
import io.netty.c.a.d.c.q;
import io.netty.c.a.d.c.r;
import io.netty.c.a.d.h;
import io.netty.c.a.d.v;
import io.netty.util.c.b.g;
import io.netty.util.e;
import java.net.URI;

public class w
extends r {
    private static final g c = io.netty.util.c.b.h.a(w.class);
    public static final String b = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    private String d;
    private final boolean e;

    public w(URI uRI, av av2, String string, boolean bl2, ar ar2, int n2) {
        super(uRI, av2, string, ar2, n2);
        this.e = bl2;
    }

    @Override
    protected v g() {
        int n2;
        URI uRI = this.a();
        String string = uRI.getPath();
        if (uRI.getQuery() != null && !uRI.getQuery().isEmpty()) {
            string = uRI.getPath() + '?' + uRI.getQuery();
        }
        if (string == null || string.isEmpty()) {
            string = "/";
        }
        byte[] arrby = au.a(16);
        String string2 = au.c(arrby);
        String string3 = string2 + b;
        byte[] arrby2 = au.b(string3.getBytes(io.netty.util.e.f));
        this.d = au.c(arrby2);
        if (c.d()) {
            c.b("WebSocket version 13 client handshake key: {}, expected response: {}", (Object)string2, (Object)this.d);
        }
        if ((n2 = uRI.getPort()) == -1) {
            n2 = "wss".equals(uRI.getScheme()) ? 443 : 80;
        }
        h h2 = new h(br.b, aw.b, string);
        ar ar2 = h2.q();
        ar2.a("Upgrade", (Object)"WebSocket".toLowerCase()).a("Connection", (Object)"Upgrade").a("Sec-WebSocket-Key", (Object)string2).a("Host", (Object)(uRI.getHost() + ':' + n2));
        String string4 = "http://" + uRI.getHost();
        if (n2 != 80 && n2 != 443) {
            string4 = string4 + ':' + n2;
        }
        ar2.a("Sec-WebSocket-Origin", (Object)string4);
        String string5 = this.e();
        if (string5 != null && !string5.isEmpty()) {
            ar2.a("Sec-WebSocket-Protocol", (Object)string5);
        }
        ar2.a("Sec-WebSocket-Version", (Object)"13");
        if (this.a != null) {
            ar2.a(this.a);
        }
        return h2;
    }

    @Override
    protected void a(io.netty.c.a.d.w w2) {
        bp bp2 = bp.b;
        ar ar2 = w2.q();
        if (!w2.s().equals(bp2)) {
            throw new ag("Invalid handshake response getStatus: " + w2.s());
        }
        String string = ar2.b("Upgrade");
        if (!"WebSocket".equalsIgnoreCase(string)) {
            throw new ag("Invalid handshake response upgrade: " + string);
        }
        String string2 = ar2.b("Connection");
        if (!"Upgrade".equalsIgnoreCase(string2)) {
            throw new ag("Invalid handshake response connection: " + string2);
        }
        String string3 = ar2.b("Sec-WebSocket-Accept");
        if (string3 == null || !string3.equals(this.d)) {
            throw new ag(String.format("Invalid challenge. Actual: %s. Expected: %s", string3, this.d));
        }
    }

    @Override
    protected ae h() {
        return new p(false, this.e, this.c());
    }

    @Override
    protected af i() {
        return new q(true);
    }
}

