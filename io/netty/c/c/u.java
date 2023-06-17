/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c;

import io.netty.c.c.q;
import io.netty.util.b.ab;
import io.netty.util.b.ad;
import java.util.concurrent.ScheduledFuture;

class u
implements ad {
    final /* synthetic */ ScheduledFuture a;
    final /* synthetic */ q b;

    u(q q2, ScheduledFuture scheduledFuture) {
        this.b = q2;
        this.a = scheduledFuture;
    }

    @Override
    public void a(ab ab2) {
        if (this.a != null) {
            this.a.cancel(false);
        }
    }
}

