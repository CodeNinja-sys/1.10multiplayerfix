/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.b.g;
import io.netty.c.a.d;
import io.netty.c.a.d.ay;
import io.netty.c.a.d.bk;
import io.netty.c.a.d.bo;
import io.netty.c.a.k.ao;
import io.netty.c.a.k.ap;
import io.netty.c.a.k.as;
import io.netty.c.a.k.av;
import io.netty.c.a.k.bd;
import io.netty.c.a.k.bp;
import io.netty.c.a.k.s;
import io.netty.c.c.q;
import io.netty.channel.ba;
import io.netty.channel.be;
import io.netty.channel.br;
import io.netty.util.c.ad;
import java.util.List;
import javax.net.ssl.SSLEngine;

public abstract class at
extends d {
    private final int a;
    private final int c;

    protected at(int n2, int n3) {
        this.a = n2;
        this.c = n3;
    }

    protected av a(SSLEngine sSLEngine) {
        String[] arrstring = ad.a(sSLEngine.getSession().getProtocol(), ':');
        if (arrstring.length < 2) {
            return av.b;
        }
        av av2 = av.a(arrstring[1]);
        return av2;
    }

    @Override
    protected void a(io.netty.channel.bd bd2, g g2, List list) {
        if (this.d(bd2)) {
            bd2.c().a((ba)this);
        }
    }

    private boolean d(io.netty.channel.bd bd2) {
        q q2 = (q)bd2.c().b(q.class);
        if (q2 == null) {
            throw new IllegalStateException("SslHandler is needed for SPDY");
        }
        av av2 = this.a(q2.f());
        switch (av2) {
            case d: {
                return false;
            }
            case a: {
                this.a(bd2, bp.a);
                break;
            }
            case c: 
            case b: {
                this.c(bd2);
                break;
            }
            default: {
                throw new IllegalStateException("Unknown SelectedProtocol");
            }
        }
        return true;
    }

    protected void a(io.netty.channel.bd bd2, bp bp2) {
        br br2 = bd2.c();
        br2.b("spdyFrameCodec", (ba)new s(bp2));
        br2.b("spdySessionHandler", (ba)new bd(bp2, true));
        br2.b("spdyHttpEncoder", (ba)new ap(bp2));
        br2.b("spdyHttpDecoder", (ba)new ao(bp2, this.a));
        br2.b("spdyStreamIdHandler", (ba)new as());
        br2.b("httpRequestHandler", (ba)this.e());
    }

    protected void c(io.netty.channel.bd bd2) {
        br br2 = bd2.c();
        br2.b("httpRequestDecoder", (ba)new bk());
        br2.b("httpResponseEncoder", (ba)new bo());
        br2.b("httpChunkAggregator", (ba)new ay(this.c));
        br2.b("httpRequestHandler", (ba)this.d());
    }

    protected abstract be d();

    protected be e() {
        return this.d();
    }
}

