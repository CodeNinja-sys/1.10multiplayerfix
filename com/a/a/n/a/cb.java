/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.d.hg;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class cb
extends hg
implements Future {
    protected cb() {
    }

    protected abstract Future c();

    @Override
    public boolean cancel(boolean bl2) {
        return this.c().cancel(bl2);
    }

    @Override
    public boolean isCancelled() {
        return this.c().isCancelled();
    }

    @Override
    public boolean isDone() {
        return this.c().isDone();
    }

    public Object get() {
        return this.c().get();
    }

    public Object get(long l2, TimeUnit timeUnit) {
        return this.c().get(l2, timeUnit);
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.c();
    }
}

