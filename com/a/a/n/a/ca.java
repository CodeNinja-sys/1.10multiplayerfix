/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.d.hg;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class ca
extends hg
implements ExecutorService {
    protected ca() {
    }

    protected abstract ExecutorService a();

    @Override
    public boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.a().awaitTermination(l2, timeUnit);
    }

    public List invokeAll(Collection collection) {
        return this.a().invokeAll(collection);
    }

    public List invokeAll(Collection collection, long l2, TimeUnit timeUnit) {
        return this.a().invokeAll(collection, l2, timeUnit);
    }

    public Object invokeAny(Collection collection) {
        return this.a().invokeAny(collection);
    }

    public Object invokeAny(Collection collection, long l2, TimeUnit timeUnit) {
        return this.a().invokeAny(collection, l2, timeUnit);
    }

    @Override
    public boolean isShutdown() {
        return this.a().isShutdown();
    }

    @Override
    public boolean isTerminated() {
        return this.a().isTerminated();
    }

    @Override
    public void shutdown() {
        this.a().shutdown();
    }

    public List shutdownNow() {
        return this.a().shutdownNow();
    }

    @Override
    public void execute(Runnable runnable) {
        this.a().execute(runnable);
    }

    public Future submit(Callable callable) {
        return this.a().submit(callable);
    }

    public Future submit(Runnable runnable) {
        return this.a().submit(runnable);
    }

    public Future submit(Runnable runnable, Object object) {
        return this.a().submit(runnable, object);
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

