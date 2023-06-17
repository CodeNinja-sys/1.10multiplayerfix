/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.dm;
import com.a.a.n.a.dn;
import com.a.a.n.a.dr;
import com.a.a.n.a.eb;
import com.a.a.n.a.ee;
import com.a.a.n.a.ef;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class ed
extends eb
implements dr {
    final ScheduledExecutorService a;

    ed(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.a = (ScheduledExecutorService)cl.a(scheduledExecutorService);
    }

    @Override
    public dn a(Runnable runnable, long l2, TimeUnit timeUnit) {
        dm dm2 = dm.a(runnable, null);
        ScheduledFuture<?> scheduledFuture = this.a.schedule(dm2, l2, timeUnit);
        return new ee(dm2, scheduledFuture);
    }

    @Override
    public dn a(Callable callable, long l2, TimeUnit timeUnit) {
        dm dm2 = dm.a(callable);
        ScheduledFuture<?> scheduledFuture = this.a.schedule(dm2, l2, timeUnit);
        return new ee(dm2, scheduledFuture);
    }

    @Override
    public dn a(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        ef ef2 = new ef(runnable);
        ScheduledFuture<?> scheduledFuture = this.a.scheduleAtFixedRate(ef2, l2, l3, timeUnit);
        return new ee(ef2, scheduledFuture);
    }

    @Override
    public dn b(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        ef ef2 = new ef(runnable);
        ScheduledFuture<?> scheduledFuture = this.a.scheduleWithFixedDelay(ef2, l2, l3, timeUnit);
        return new ee(ef2, scheduledFuture);
    }

    public /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.b(runnable, l2, l3, timeUnit);
    }

    public /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.a(runnable, l2, l3, timeUnit);
    }

    public /* synthetic */ ScheduledFuture schedule(Callable callable, long l2, TimeUnit timeUnit) {
        return this.a(callable, l2, timeUnit);
    }

    public /* synthetic */ ScheduledFuture schedule(Runnable runnable, long l2, TimeUnit timeUnit) {
        return this.a(runnable, l2, timeUnit);
    }
}

