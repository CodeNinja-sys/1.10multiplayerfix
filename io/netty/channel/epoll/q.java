/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.channel.av;
import io.netty.channel.aw;
import io.netty.channel.epoll.m;
import io.netty.channel.epoll.o;

class q
implements aw {
    final /* synthetic */ o a;

    q(o o2) {
        this.a = o2;
    }

    public void a(av av2) {
        if (av2.isCancelled()) {
            if (m.b(this.a.e) != null) {
                m.b(this.a.e).cancel(false);
            }
            m.a(this.a.e, null);
            this.a.b(this.a.h());
        }
    }
}

