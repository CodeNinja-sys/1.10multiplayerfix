/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ab;
import io.netty.util.b.ax;
import io.netty.util.b.x;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public abstract class d
implements x {
    @Override
    public ab b(Runnable runnable) {
        return this.c().b(runnable);
    }

    @Override
    public ab a(Runnable runnable, Object object) {
        return this.c().a(runnable, object);
    }

    @Override
    public ab a(Callable callable) {
        return this.c().a(callable);
    }

    @Override
    public ax a(Runnable runnable, long l2, TimeUnit timeUnit) {
        return this.c().a(runnable, l2, timeUnit);
    }

    @Override
    public ax a(Callable callable, long l2, TimeUnit timeUnit) {
        return this.c().a(callable, l2, timeUnit);
    }

    @Override
    public ax a(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.c().a(runnable, l2, l3, timeUnit);
    }

    @Override
    public ax b(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.c().b(runnable, l2, l3, timeUnit);
    }

    @Override
    public ab m() {
        return this.a(2L, 15L, TimeUnit.SECONDS);
    }

    @Override
    public abstract void shutdown();

    @Override
    public List shutdownNow() {
        this.shutdown();
        return Collections.emptyList();
    }

    public List invokeAll(Collection collection) {
        return this.c().invokeAll(collection);
    }

    public List invokeAll(Collection collection, long l2, TimeUnit timeUnit) {
        return this.c().invokeAll(collection, l2, timeUnit);
    }

    public Object invokeAny(Collection collection) {
        return this.c().invokeAny(collection);
    }

    public Object invokeAny(Collection collection, long l2, TimeUnit timeUnit) {
        return this.c().invokeAny(collection, l2, timeUnit);
    }

    @Override
    public void execute(Runnable runnable) {
        this.c().execute(runnable);
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

    public /* synthetic */ Future submit(Runnable runnable) {
        return this.b(runnable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object object) {
        return this.a(runnable, object);
    }

    public /* synthetic */ Future submit(Callable callable) {
        return this.a(callable);
    }
}

