/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.e;

import io.netty.channel.e.b;

class c
implements Runnable {
    final /* synthetic */ b a;

    c(b b2) {
        this.a = b2;
    }

    @Override
    public void run() {
        if (!this.a.O() && !this.a.G().g()) {
            return;
        }
        this.a.a(false);
        this.a.M();
    }
}

