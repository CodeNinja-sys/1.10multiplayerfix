/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.c;

import io.netty.channel.br;
import io.netty.channel.c.b;
import java.util.Collections;

class g
implements Runnable {
    final /* synthetic */ b a;
    final /* synthetic */ Object[] b;
    final /* synthetic */ br c;
    final /* synthetic */ b d;

    g(b b2, b b3, Object[] arrobject, br br2) {
        this.d = b2;
        this.a = b3;
        this.b = arrobject;
        this.c = br2;
    }

    @Override
    public void run() {
        Collections.addAll(io.netty.channel.c.b.a(this.a), this.b);
        io.netty.channel.c.b.a(this.a, this.c);
    }
}

