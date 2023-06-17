/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.bp;
import io.netty.c.a.d.br;
import io.netty.c.a.d.c.ae;
import io.netty.c.a.d.c.af;
import io.netty.c.a.d.c.ag;
import io.netty.c.a.d.c.ai;
import io.netty.c.a.d.c.au;
import io.netty.c.a.d.c.av;
import io.netty.c.a.d.c.b;
import io.netty.c.a.d.c.h;
import io.netty.c.a.d.c.i;
import io.netty.c.a.d.v;
import io.netty.c.a.d.w;
import io.netty.channel.an;
import io.netty.channel.bw;
import java.util.regex.Pattern;

public class ak
extends ai {
    private static final Pattern c = Pattern.compile("[^0-9]");
    private static final Pattern d = Pattern.compile("[^ ]");

    public ak(String string, String string2, int n2) {
        super(av.b, string, string2, n2);
    }

    @Override
    protected w a(v v2, ar ar2) {
        if (!"Upgrade".equalsIgnoreCase(v2.q().b("Connection")) || !"WebSocket".equalsIgnoreCase(v2.q().b("Upgrade"))) {
            throw new ag("not a WebSocket handshake request: missing upgrade");
        }
        boolean bl2 = v2.q().d("Sec-WebSocket-Key1") && v2.q().d("Sec-WebSocket-Key2");
        io.netty.c.a.d.i i2 = new io.netty.c.a.d.i(br.b, new bp(101, bl2 ? "WebSocket Protocol Handshake" : "Web Socket Protocol Handshake"));
        if (ar2 != null) {
            i2.q().a(ar2);
        }
        i2.q().a("Upgrade", (Object)"WebSocket");
        i2.q().a("Connection", (Object)"Upgrade");
        if (bl2) {
            String string;
            i2.q().a("Sec-WebSocket-Origin", (Object)v2.q().b("Origin"));
            i2.q().a("Sec-WebSocket-Location", (Object)this.a());
            String string2 = v2.q().b("Sec-WebSocket-Protocol");
            if (string2 != null) {
                string = this.a(string2);
                if (string == null) {
                    if (a.d()) {
                        a.b("Requested subprotocol(s) not supported: {}", (Object)string2);
                    }
                } else {
                    i2.q().a("Sec-WebSocket-Protocol", (Object)string);
                }
            }
            string = v2.q().b("Sec-WebSocket-Key1");
            String string3 = v2.q().b("Sec-WebSocket-Key2");
            int n2 = (int)(Long.parseLong(c.matcher(string).replaceAll("")) / (long)d.matcher(string).replaceAll("").length());
            int n3 = (int)(Long.parseLong(c.matcher(string3).replaceAll("")) / (long)d.matcher(string3).replaceAll("").length());
            long l2 = v2.a().M();
            g g2 = bi.a(16);
            g2.E(n2);
            g2.E(n3);
            g2.b(l2);
            i2.a().c(au.a(g2.X()));
        } else {
            i2.q().a("WebSocket-Origin", (Object)v2.q().b("Origin"));
            i2.q().a("WebSocket-Location", (Object)this.a());
            String string = v2.q().b("WebSocket-Protocol");
            if (string != null) {
                i2.q().a("WebSocket-Protocol", (Object)this.a(string));
            }
        }
        return i2;
    }

    @Override
    public io.netty.channel.av a(an an2, b b2, bw bw2) {
        return an2.b(b2, bw2);
    }

    @Override
    protected ae f() {
        return new h(this.d());
    }

    @Override
    protected af g() {
        return new i();
    }
}

