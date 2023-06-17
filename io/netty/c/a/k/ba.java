/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.k.q;
import io.netty.channel.bw;

public final class ba {
    final q a;
    final bw b;

    ba(q q2, bw bw2) {
        this.a = q2;
        this.b = bw2;
    }

    void a(Throwable throwable) {
        this.a.ad();
        this.b.a(throwable);
    }
}

