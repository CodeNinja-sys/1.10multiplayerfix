/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.c.a.d.ah;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.bl;
import io.netty.c.a.d.bn;
import io.netty.c.a.d.c.ae;
import io.netty.c.a.d.c.af;
import io.netty.c.a.d.c.av;
import io.netty.c.a.d.c.b;
import io.netty.c.a.d.c.s;
import io.netty.c.a.d.v;
import io.netty.c.a.d.w;
import io.netty.c.a.d.y;
import io.netty.channel.an;
import io.netty.channel.ba;
import io.netty.channel.bd;
import io.netty.channel.br;
import io.netty.channel.bw;
import io.netty.util.b.ad;
import java.net.URI;

public abstract class r {
    private final URI b;
    private final av c;
    private volatile boolean d;
    private final String e;
    private volatile String f;
    protected final ar a;
    private final int g;

    protected r(URI uRI, av av2, String string, ar ar2, int n2) {
        this.b = uRI;
        this.c = av2;
        this.e = string;
        this.a = ar2;
        this.g = n2;
    }

    public URI a() {
        return this.b;
    }

    public av b() {
        return this.c;
    }

    public int c() {
        return this.g;
    }

    public boolean d() {
        return this.d;
    }

    private void j() {
        this.d = true;
    }

    public String e() {
        return this.e;
    }

    public String f() {
        return this.f;
    }

    private void a(String string) {
        this.f = string;
    }

    public io.netty.channel.av a(an an2) {
        if (an2 == null) {
            throw new NullPointerException("channel");
        }
        return this.a(an2, an2.p());
    }

    public final io.netty.channel.av a(an an2, bw bw2) {
        y y2;
        v v2 = this.g();
        bn bn2 = (bn)an2.c().b(bn.class);
        if (bn2 == null && (y2 = (y)an2.c().b(y.class)) == null) {
            bw2.a(new IllegalStateException("ChannelPipeline does not contain a HttpResponseDecoder or HttpClientCodec"));
            return bw2;
        }
        an2.b(v2).a((ad)new s(this, bw2));
        return bw2;
    }

    protected abstract v g();

    public final void a(an an2, w w2) {
        bd bd2;
        this.a(w2);
        this.a(w2.q().b("Sec-WebSocket-Protocol"));
        this.j();
        br br2 = an2.c();
        ah ah2 = (ah)br2.b(ah.class);
        if (ah2 != null) {
            br2.a((ba)ah2);
        }
        if ((bd2 = br2.c(bn.class)) == null) {
            bd2 = br2.c(y.class);
            if (bd2 == null) {
                throw new IllegalStateException("ChannelPipeline does not contain a HttpRequestEncoder or HttpClientCodec");
            }
            br2.c(bd2.f(), "ws-decoder", this.h());
        } else {
            if (br2.b(bl.class) != null) {
                br2.a(bl.class);
            }
            br2.c(bd2.f(), "ws-decoder", this.h());
        }
    }

    protected abstract void a(w var1);

    protected abstract ae h();

    protected abstract af i();

    public io.netty.channel.av a(an an2, b b2) {
        if (an2 == null) {
            throw new NullPointerException("channel");
        }
        return this.a(an2, b2, an2.p());
    }

    public io.netty.channel.av a(an an2, b b2, bw bw2) {
        if (an2 == null) {
            throw new NullPointerException("channel");
        }
        return an2.b(b2, bw2);
    }
}

