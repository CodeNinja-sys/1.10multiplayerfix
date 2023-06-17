/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.e;

import io.netty.c.e.m;
import io.netty.channel.av;
import io.netty.channel.aw;
import java.util.concurrent.ScheduledFuture;

class o
implements aw {
    final /* synthetic */ ScheduledFuture a;
    final /* synthetic */ m b;

    o(m m2, ScheduledFuture scheduledFuture) {
        this.b = m2;
        this.a = scheduledFuture;
    }

    public void a(av av2) {
        this.a.cancel(false);
    }
}

