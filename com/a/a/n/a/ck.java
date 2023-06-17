/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.bl;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

final class ck
implements Future {
    final /* synthetic */ Future a;
    final /* synthetic */ bl b;

    ck(Future future, bl bl2) {
        this.a = future;
        this.b = bl2;
    }

    @Override
    public boolean cancel(boolean bl2) {
        return this.a.cancel(bl2);
    }

    @Override
    public boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override
    public boolean isDone() {
        return this.a.isDone();
    }

    public Object get() {
        return this.a(this.a.get());
    }

    public Object get(long l2, TimeUnit timeUnit) {
        return this.a(this.a.get(l2, timeUnit));
    }

    private Object a(Object object) {
        try {
            return this.b.a(object);
        }
        catch (Throwable throwable) {
            throw new ExecutionException(throwable);
        }
    }
}

