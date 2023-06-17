/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c;

import io.netty.c.c.q;
import io.netty.channel.av;
import io.netty.channel.aw;
import io.netty.channel.bd;
import io.netty.channel.bw;
import java.util.concurrent.ScheduledFuture;

class x
implements aw {
    final /* synthetic */ ScheduledFuture a;
    final /* synthetic */ bd b;
    final /* synthetic */ bw c;
    final /* synthetic */ q d;

    x(q q2, ScheduledFuture scheduledFuture, bd bd2, bw bw2) {
        this.d = q2;
        this.a = scheduledFuture;
        this.b = bd2;
        this.c = bw2;
    }

    public void a(av av2) {
        if (this.a != null) {
            this.a.cancel(false);
        }
        this.b.b(this.c);
    }
}

