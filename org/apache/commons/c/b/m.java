/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.b;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

final class m
implements Future {
    private final Object a;

    m(Object object) {
        this.a = object;
    }

    @Override
    public boolean isDone() {
        return true;
    }

    public Object get() {
        return this.a;
    }

    public Object get(long l2, TimeUnit timeUnit) {
        return this.a;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean cancel(boolean bl2) {
        return false;
    }
}

