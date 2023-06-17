/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.aa;
import com.a.a.n.a.ad;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class ac
extends aa {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ TimeUnit c;

    ac(long l2, long l3, TimeUnit timeUnit) {
        this.a = l2;
        this.b = l3;
        this.c = timeUnit;
        super(null);
    }

    @Override
    public Future a(ad ad2, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
        return scheduledExecutorService.scheduleAtFixedRate(runnable, this.a, this.b, this.c);
    }
}

