/*
 * Decompiled with CFR 0.150.
 */
package io.netty.a;

import io.netty.a.l;
import io.netty.channel.ap;

class n
implements Runnable {
    final /* synthetic */ ap a;
    final /* synthetic */ l b;

    n(l l2, ap ap2) {
        this.b = l2;
        this.a = ap2;
    }

    @Override
    public void run() {
        this.a.a(true);
    }
}

