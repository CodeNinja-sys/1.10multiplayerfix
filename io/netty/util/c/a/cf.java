/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.cc;
import java.util.concurrent.RunnableFuture;

final class cf
extends cc
implements RunnableFuture {
    final Runnable a;
    Object b;
    private static final long c = 5232453952276885070L;

    cf(Runnable runnable, Object object) {
        if (runnable == null) {
            throw new NullPointerException();
        }
        this.a = runnable;
        this.b = object;
    }

    @Override
    public final Object c() {
        return this.b;
    }

    @Override
    public final void b(Object object) {
        this.b = object;
    }

    @Override
    public final boolean n() {
        this.a.run();
        return true;
    }

    @Override
    public final void run() {
        this.t();
    }
}

