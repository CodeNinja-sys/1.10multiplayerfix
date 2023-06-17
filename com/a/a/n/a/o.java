/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.dl;
import com.a.a.n.a.dm;
import com.a.a.n.a.dq;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

public abstract class o
extends AbstractExecutorService
implements dq {
    protected final dm a(Runnable runnable, Object object) {
        return dm.a(runnable, object);
    }

    protected final dm a(Callable callable) {
        return dm.a(callable);
    }

    @Override
    public dl a(Runnable runnable) {
        return (dl)super.submit(runnable);
    }

    @Override
    public dl b(Runnable runnable, Object object) {
        return (dl)super.submit(runnable, object);
    }

    @Override
    public dl b(Callable callable) {
        return (dl)super.submit(callable);
    }

    public /* synthetic */ Future submit(Callable callable) {
        return this.b(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object object) {
        return this.b(runnable, object);
    }

    public /* synthetic */ Future submit(Runnable runnable) {
        return this.a(runnable);
    }

    protected /* synthetic */ RunnableFuture newTaskFor(Callable callable) {
        return this.a(callable);
    }

    protected /* synthetic */ RunnableFuture newTaskFor(Runnable runnable, Object object) {
        return this.a(runnable, object);
    }
}

