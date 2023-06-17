/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.o;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class eb
extends o {
    private final ExecutorService a;

    eb(ExecutorService executorService) {
        this.a = (ExecutorService)cl.a(executorService);
    }

    @Override
    public boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.a.awaitTermination(l2, timeUnit);
    }

    @Override
    public boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override
    public boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override
    public void shutdown() {
        this.a.shutdown();
    }

    public List shutdownNow() {
        return this.a.shutdownNow();
    }

    @Override
    public void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}

