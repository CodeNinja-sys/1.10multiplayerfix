/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c;

import io.netty.c.c.q;
import io.netty.channel.bd;
import io.netty.util.b.ab;
import io.netty.util.b.ad;

class v
implements ad {
    final /* synthetic */ bd a;
    final /* synthetic */ q b;

    v(q q2, bd bd2) {
        this.b = q2;
        this.a = bd2;
    }

    @Override
    public void a(ab ab2) {
        if (!ab2.bo_()) {
            q.j().b("Failed to complete handshake", ab2.bq_());
            this.a.n();
        }
    }
}

