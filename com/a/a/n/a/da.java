/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.bc;
import com.a.a.n.a.dc;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

class da
extends dc
implements bc {
    private final Exception a;

    da(Exception exception) {
        super(null);
        this.a = exception;
    }

    @Override
    public Object get() {
        throw new ExecutionException(this.a);
    }

    @Override
    public Object a() {
        throw this.a;
    }

    @Override
    public Object a(long l2, TimeUnit timeUnit) {
        cl.a((Object)timeUnit);
        throw this.a;
    }
}

