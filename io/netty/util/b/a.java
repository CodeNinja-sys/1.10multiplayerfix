/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ab;
import io.netty.util.b.at;
import io.netty.util.b.au;
import io.netty.util.b.av;
import io.netty.util.b.ax;
import io.netty.util.b.bg;
import io.netty.util.b.c;
import io.netty.util.b.k;
import io.netty.util.b.l;
import io.netty.util.b.w;
import io.netty.util.b.y;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public abstract class a
extends AbstractExecutorService
implements w {
    @Override
    public w c() {
        return this;
    }

    @Override
    public boolean bt_() {
        return this.a(Thread.currentThread());
    }

    @Override
    public Iterator iterator() {
        return new c(this, null);
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

    @Override
    public au n() {
        return new l(this);
    }

    @Override
    public at o() {
        return new k(this);
    }

    @Override
    public ab a(Object object) {
        return new bg(this, object);
    }

    @Override
    public ab a(Throwable throwable) {
        return new y(this, throwable);
    }

    @Override
    public ab b(Runnable runnable) {
        return (ab)super.submit(runnable);
    }

    @Override
    public ab a(Runnable runnable, Object object) {
        return (ab)super.submit(runnable, object);
    }

    @Override
    public ab a(Callable callable) {
        return (ab)super.submit(callable);
    }

    protected final RunnableFuture newTaskFor(Runnable runnable, Object object) {
        return new av(this, runnable, object);
    }

    protected final RunnableFuture newTaskFor(Callable callable) {
        return new av(this, callable);
    }

    @Override
    public ax a(Runnable runnable, long l2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ax a(Callable callable, long l2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ax a(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ax b(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Future submit(Callable callable) {
        return this.a(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object object) {
        return this.a(runnable, object);
    }

    public /* synthetic */ Future submit(Runnable runnable) {
        return this.b(runnable);
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

