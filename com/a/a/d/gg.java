/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gj;
import java.util.Collection;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

public abstract class gg
extends gj
implements BlockingDeque {
    protected gg() {
    }

    protected abstract BlockingDeque a();

    @Override
    public int remainingCapacity() {
        return this.a().remainingCapacity();
    }

    public void putFirst(Object object) {
        this.a().putFirst(object);
    }

    public void putLast(Object object) {
        this.a().putLast(object);
    }

    public boolean offerFirst(Object object, long l2, TimeUnit timeUnit) {
        return this.a().offerFirst(object, l2, timeUnit);
    }

    public boolean offerLast(Object object, long l2, TimeUnit timeUnit) {
        return this.a().offerLast(object, l2, timeUnit);
    }

    public Object takeFirst() {
        return this.a().takeFirst();
    }

    public Object takeLast() {
        return this.a().takeLast();
    }

    public Object pollFirst(long l2, TimeUnit timeUnit) {
        return this.a().pollFirst(l2, timeUnit);
    }

    public Object pollLast(long l2, TimeUnit timeUnit) {
        return this.a().pollLast(l2, timeUnit);
    }

    @Override
    public void put(Object object) {
        this.a().put(object);
    }

    @Override
    public boolean offer(Object object, long l2, TimeUnit timeUnit) {
        return this.a().offer(object, l2, timeUnit);
    }

    @Override
    public Object take() {
        return this.a().take();
    }

    @Override
    public Object poll(long l2, TimeUnit timeUnit) {
        return this.a().poll(l2, timeUnit);
    }

    @Override
    public int drainTo(Collection collection) {
        return this.a().drainTo(collection);
    }

    @Override
    public int drainTo(Collection collection, int n2) {
        return this.a().drainTo(collection, n2);
    }

    @Override
    protected /* synthetic */ Deque d() {
        return this.a();
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

