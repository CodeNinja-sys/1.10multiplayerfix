/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.c.a.d.bj;
import io.netty.c.a.d.bp;
import io.netty.c.a.d.br;
import io.netty.c.a.d.c.ai;
import io.netty.c.a.d.c.ak;
import io.netty.c.a.d.c.al;
import io.netty.c.a.d.c.am;
import io.netty.c.a.d.c.an;
import io.netty.c.a.d.c.av;
import io.netty.c.a.d.r;
import io.netty.channel.bw;

public class ao {
    private final String a;
    private final String b;
    private final boolean c;
    private final int d;

    public ao(String string, String string2, boolean bl2) {
        this(string, string2, bl2, 65536);
    }

    public ao(String string, String string2, boolean bl2, int n2) {
        this.a = string;
        this.b = string2;
        this.c = bl2;
        this.d = n2;
    }

    public ai a(bj bj2) {
        String string = bj2.q().b("Sec-WebSocket-Version");
        if (string != null) {
            if (string.equals(av.e.a())) {
                return new an(this.a, this.b, this.c, this.d);
            }
            if (string.equals(av.d.a())) {
                return new am(this.a, this.b, this.c, this.d);
            }
            if (string.equals(av.c.a())) {
                return new al(this.a, this.b, this.c, this.d);
            }
            return null;
        }
        return new ak(this.a, this.b, this.d);
    }

    public static void a(io.netty.channel.an an2) {
        ao.b(an2);
    }

    public static io.netty.channel.av b(io.netty.channel.an an2) {
        return ao.a(an2, an2.p());
    }

    public static io.netty.channel.av a(io.netty.channel.an an2, bw bw2) {
        r r2 = new r(br.b, bp.O);
        r2.q().b("Sec-WebSocket-Version", (Object)av.e.a());
        return an2.a(r2, bw2);
    }
}

