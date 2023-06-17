/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.c.a.d.c.ab;
import io.netty.c.a.d.c.r;
import io.netty.c.a.d.c.z;
import io.netty.c.a.d.w;
import io.netty.channel.ba;
import io.netty.channel.bd;
import io.netty.channel.bf;
import io.netty.util.b.ad;

class aa
extends bf {
    private final r a;

    aa(r r2) {
        this.a = r2;
    }

    @Override
    public void a(bd bd2) {
        super.a(bd2);
        this.a.a(bd2.b()).a((ad)new ab(this, bd2));
    }

    @Override
    public void a_(bd bd2, Object object) {
        if (!(object instanceof w)) {
            bd2.b(object);
            return;
        }
        if (!this.a.d()) {
            this.a.a(bd2.b(), (w)object);
            bd2.a((Object)z.b);
            bd2.c().a((ba)this);
            return;
        }
        throw new IllegalStateException("WebSocketClientHandshaker should have been non finished yet");
    }
}

