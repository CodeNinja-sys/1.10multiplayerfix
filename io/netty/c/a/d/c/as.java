/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.c.a.d.ar;
import io.netty.c.a.d.aw;
import io.netty.c.a.d.bj;
import io.netty.c.a.d.bm;
import io.netty.c.a.d.bp;
import io.netty.c.a.d.br;
import io.netty.c.a.d.c.ai;
import io.netty.c.a.d.c.ao;
import io.netty.c.a.d.c.ap;
import io.netty.c.a.d.c.at;
import io.netty.c.a.d.i;
import io.netty.c.a.d.v;
import io.netty.c.c.q;
import io.netty.channel.av;
import io.netty.channel.ba;
import io.netty.channel.bd;
import io.netty.channel.bf;
import io.netty.util.b.ad;

class as
extends bf {
    private final String a;
    private final String b;
    private final boolean c;
    private final int d;

    as(String string, String string2, boolean bl2, int n2) {
        this.a = string;
        this.b = string2;
        this.c = bl2;
        this.d = n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a_(bd bd2, Object object) {
        v v2 = (v)object;
        try {
            if (v2.s() != aw.b) {
                as.a(bd2, (bj)v2, new i(br.b, bp.v));
                return;
            }
            ao ao2 = new ao(as.a(bd2.c(), (bj)v2, this.a), this.b, this.c, this.d);
            ai ai2 = ao2.a(v2);
            if (ai2 == null) {
                ao.b(bd2.b());
            } else {
                av av2 = ai2.a(bd2.b(), v2);
                av2.a((ad)new at(this, bd2));
                ap.a(bd2, ai2);
                bd2.c().a((ba)this, "WS403Responder", ap.a());
            }
        }
        finally {
            v2.ad();
        }
    }

    private static void a(bd bd2, bj bj2, bm bm2) {
        av av2 = bd2.b().b(bm2);
        if (!ar.a(bj2) || bm2.s().a() != 200) {
            av2.a((ad)io.netty.channel.aw.g);
        }
    }

    private static String a(io.netty.channel.br br2, bj bj2, String string) {
        String string2 = "ws";
        if (br2.b(q.class) != null) {
            string2 = "wss";
        }
        return string2 + "://" + bj2.q().b("Host") + string;
    }
}

