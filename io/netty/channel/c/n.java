/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.c;

import io.netty.channel.c.b;
import io.netty.channel.c.l;

class n
implements Runnable {
    final /* synthetic */ b a;
    final /* synthetic */ l b;

    n(l l2, b b2) {
        this.b = l2;
        this.a = b2;
    }

    @Override
    public void run() {
        l.a(this.b, this.a);
    }
}

