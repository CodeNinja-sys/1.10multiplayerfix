/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.c;

import io.netty.channel.br;
import io.netty.channel.c.b;

class c
implements Runnable {
    final /* synthetic */ b a;

    c(b b2) {
        this.a = b2;
    }

    @Override
    public void run() {
        Object e2;
        br br2 = this.a.c();
        while ((e2 = b.a(this.a).poll()) != null) {
            br2.b(e2);
        }
        br2.n();
    }
}

