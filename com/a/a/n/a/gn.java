/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.d.jl;
import com.a.a.d.jn;
import com.a.a.n.a.go;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

abstract class gn
implements ExecutorService {
    private final ExecutorService a;

    protected gn(ExecutorService executorService) {
        this.a = (ExecutorService)cl.a(executorService);
    }

    protected abstract Callable a(Callable var1);

    protected Runnable a(Runnable runnable) {
        Callable callable = this.a(Executors.callable(runnable, null));
        return new go(this, callable);
    }

    private final jl a(Collection collection) {
        jn jn2 = jl.g();
        for (Callable callable : collection) {
            jn2.c(this.a(callable));
        }
        return jn2.b();
    }

    @Override
    public final void execute(Runnable runnable) {
        this.a.execute(this.a(runnable));
    }

    public final Future submit(Callable callable) {
        return this.a.submit(this.a((Callable)cl.a(callable)));
    }

    public final Future submit(Runnable runnable) {
        return this.a.submit(this.a(runnable));
    }

    public final Future submit(Runnable runnable, Object object) {
        return this.a.submit(this.a(runnable), object);
    }

    public final List invokeAll(Collection collection) {
        return this.a.invokeAll(this.a(collection));
    }

    public final List invokeAll(Collection collection, long l2, TimeUnit timeUnit) {
        return this.a.invokeAll(this.a(collection), l2, timeUnit);
    }

    public final Object invokeAny(Collection collection) {
        return this.a.invokeAny(this.a(collection));
    }

    public final Object invokeAny(Collection collection, long l2, TimeUnit timeUnit) {
        return this.a.invokeAny(this.a(collection), l2, timeUnit);
    }

    @Override
    public final void shutdown() {
        this.a.shutdown();
    }

    public final List shutdownNow() {
        return this.a.shutdownNow();
    }

    @Override
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override
    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.a.awaitTermination(l2, timeUnit);
    }
}

