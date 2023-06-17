/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.gn;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

abstract class gp
extends gn
implements ScheduledExecutorService {
    final ScheduledExecutorService b;

    protected gp(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    public final ScheduledFuture schedule(Runnable runnable, long l2, TimeUnit timeUnit) {
        return this.b.schedule(this.a(runnable), l2, timeUnit);
    }

    public final ScheduledFuture schedule(Callable callable, long l2, TimeUnit timeUnit) {
        return this.b.schedule(this.a(callable), l2, timeUnit);
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.b.scheduleAtFixedRate(this.a(runnable), l2, l3, timeUnit);
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.b.scheduleWithFixedDelay(this.a(runnable), l2, l3, timeUnit);
    }
}

