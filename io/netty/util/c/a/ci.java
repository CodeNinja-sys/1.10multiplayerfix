/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.cc;

final class ci
extends cc {
    final Runnable a;
    private static final long b = 5232453952276885070L;

    ci(Runnable runnable) {
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
    void a(Throwable throwable) {
        ci.c(throwable);
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

