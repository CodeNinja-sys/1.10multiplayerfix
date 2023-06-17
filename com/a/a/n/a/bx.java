/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.d.hh;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public abstract class bx
extends hh
implements BlockingQueue {
    protected bx() {
    }

    protected abstract BlockingQueue a();

    public int drainTo(Collection collection, int n2) {
        return this.a().drainTo(collection, n2);
    }

    public int drainTo(Collection collection) {
        return this.a().drainTo(collection);
    }

    public boolean offer(Object object, long l2, TimeUnit timeUnit) {
        return this.a().offer(object, l2, timeUnit);
    }

    public Object poll(long l2, TimeUnit timeUnit) {
        return this.a().poll(l2, timeUnit);
    }

    public void put(Object object) {
        this.a().put(object);
    }

    @Override
    public int remainingCapacity() {
        return this.a().remainingCapacity();
    }

    public Object take() {
        return this.a().take();
    }

    @Override
    protected /* synthetic */ Queue c() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

