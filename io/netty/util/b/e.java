/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ab;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class e
implements ab {
    public Object get() {
        this.k();
        Throwable throwable = this.bq_();
        if (throwable == null) {
            return this.bm_();
        }
        throw new ExecutionException(throwable);
    }

    public Object get(long l2, TimeUnit timeUnit) {
        if (this.a(l2, timeUnit)) {
            Throwable throwable = this.bq_();
            if (throwable == null) {
                return this.bm_();
            }
            throw new ExecutionException(throwable);
        }
        throw new TimeoutException();
    }
}

