/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.channel.epoll.a;
import io.netty.channel.epoll.c;
import io.netty.util.c.r;

class b
extends r {
    final /* synthetic */ c a;
    final /* synthetic */ a b;

    b(a a2, c c2) {
        this.b = a2;
        this.a = c2;
    }

    @Override
    public void run() {
        if (!this.b.G().g() && !this.a.b) {
            this.a.m();
        }
    }
}

