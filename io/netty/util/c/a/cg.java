/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.cc;
import java.util.concurrent.RunnableFuture;

final class cg
extends cc
implements RunnableFuture {
    final Runnable a;
    private static final long b = 5232453952276885070L;

    cg(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException();
        }
        this.a = runnable;
    }

    public final Void a() {
        return null;
    }

    public final void a(Void void_) {
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

    @Override
    public /* synthetic */ void b(Object object) {
        this.a((Void)object);
    }

    @Override
    public /* synthetic */ Object c() {
        return this.a();
    }
}

