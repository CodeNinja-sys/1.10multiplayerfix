/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.dx;
import com.a.a.n.a.ay;
import com.a.a.n.a.gp;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

final class dy
extends gp {
    final /* synthetic */ dx a;

    dy(ScheduledExecutorService scheduledExecutorService, dx dx2) {
        this.a = dx2;
        super(scheduledExecutorService);
    }

    @Override
    protected Callable a(Callable callable) {
        return ay.a(callable, this.a);
    }

    @Override
    protected Runnable a(Runnable runnable) {
        return ay.a(runnable, this.a);
    }
}

