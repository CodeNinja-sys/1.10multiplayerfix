/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.c.a.d.ar;
import io.netty.c.a.d.bp;
import io.netty.c.a.d.br;
import io.netty.c.a.d.c.ae;
import io.netty.c.a.d.c.af;
import io.netty.c.a.d.c.ag;
import io.netty.c.a.d.c.ai;
import io.netty.c.a.d.c.au;
import io.netty.c.a.d.c.av;
import io.netty.c.a.d.c.p;
import io.netty.c.a.d.c.q;
import io.netty.c.a.d.i;
import io.netty.c.a.d.v;
import io.netty.c.a.d.w;
import io.netty.util.e;

public class an
extends ai {
    public static final String c = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    private final boolean d;

    public an(String string, String string2, boolean bl2, int n2) {
        super(av.e, string, string2, n2);
        this.d = bl2;
    }

    @Override
    protected w a(v v2, ar ar2) {
        String string;
        i i2 = new i(br.b, bp.b);
        if (ar2 != null) {
            i2.q().a(ar2);
        }
        if ((string = v2.q().b("Sec-WebSocket-Key")) == null) {
            throw new ag("not a WebSocket request: missing key");
        }
        String string2 = string + c;
        byte[] arrby = au.b(string2.getBytes(e.f));
        String string3 = au.c(arrby);
        if (a.d()) {
            a.b("WebSocket version 13 server handshake key: {}, response: {}", (Object)string, (Object)string3);
        }
        i2.q().a("Upgrade", (Object)"WebSocket".toLowerCase());
        i2.q().a("Connection", (Object)"Upgrade");
        i2.q().a("Sec-WebSocket-Accept", (Object)string3);
        String string4 = v2.q().b("Sec-WebSocket-Protocol");
        if (string4 != null) {
            String string5 = this.a(string4);
            if (string5 == null) {
                if (a.d()) {
                    a.b("Requested subprotocol(s) not supported: {}", (Object)string4);
                }
            } else {
                i2.q().a("Sec-WebSocket-Protocol", (Object)string5);
            }
        }
        return i2;
    }

    @Override
    protected ae f() {
        return new p(true, this.d, this.d());
    }

    @Override
    protected af g() {
        return new q(false);
    }
}

