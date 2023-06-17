/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.du;
import com.a.a.n.a.ea;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class dz {
    dz() {
    }

    final ExecutorService a(ThreadPoolExecutor threadPoolExecutor, long l2, TimeUnit timeUnit) {
        du.b(threadPoolExecutor);
        ExecutorService executorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.a(executorService, l2, timeUnit);
        return executorService;
    }

    final ScheduledExecutorService a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long l2, TimeUnit timeUnit) {
        du.b(scheduledThreadPoolExecutor);
        ScheduledExecutorService scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(scheduledThreadPoolExecutor);
        this.a(scheduledExecutorService, l2, timeUnit);
        return scheduledExecutorService;
    }

    final void a(ExecutorService executorService, long l2, TimeUnit timeUnit) {
        cl.a(executorService);
        cl.a((Object)timeUnit);
        this.a(du.a("DelayedShutdownHook-for-" + executorService, new ea(this, executorService, l2, timeUnit)));
    }

    final ExecutorService a(ThreadPoolExecutor threadPoolExecutor) {
        return this.a(threadPoolExecutor, 120L, TimeUnit.SECONDS);
    }

    final ScheduledExecutorService a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        return this.a(scheduledThreadPoolExecutor, 120L, TimeUnit.SECONDS);
    }

    void a(Thread thread) {
        Runtime.getRuntime().addShutdownHook(thread);
    }
}

