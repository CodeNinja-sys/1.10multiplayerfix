/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.cc;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

final class ce
extends cc
implements RunnableFuture {
    final Callable a;
    Object b;
    private static final long c = 2838392045355241008L;

    ce(Callable callable) {
        if (callable == null) {
            throw new NullPointerException();
        }
        this.a = callable;
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
        try {
            this.b = this.a.call();
            return true;
        }
        catch (Error error) {
            throw error;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public final void run() {
        this.t();
    }
}

