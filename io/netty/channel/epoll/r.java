/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.channel.epoll.o;

class r
implements Runnable {
    final /* synthetic */ o a;

    r(o o2) {
        this.a = o2;
    }

    @Override
    public void run() {
        this.a.j();
    }
}

