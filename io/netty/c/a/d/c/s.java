/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.c.a.d.bl;
import io.netty.c.a.d.c.r;
import io.netty.c.a.d.y;
import io.netty.channel.av;
import io.netty.channel.aw;
import io.netty.channel.ba;
import io.netty.channel.bd;
import io.netty.channel.br;
import io.netty.channel.bw;

class s
implements aw {
    final /* synthetic */ bw a;
    final /* synthetic */ r b;

    s(r r2, bw bw2) {
        this.b = r2;
        this.a = bw2;
    }

    public void a(av av2) {
        if (av2.bo_()) {
            br br2 = av2.e().c();
            bd bd2 = br2.c(bl.class);
            if (bd2 == null) {
                bd2 = br2.c(y.class);
            }
            if (bd2 == null) {
                this.a.a(new IllegalStateException("ChannelPipeline does not contain a HttpRequestEncoder or HttpClientCodec"));
                return;
            }
            br2.b(bd2.f(), "ws-encoder", (ba)this.b.i());
            this.a.b();
        } else {
            this.a.a(av2.bq_());
        }
    }
}

