/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.bu;
import com.a.a.n.a.dl;
import com.a.a.n.a.h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class g
implements dl {
    private final h a = new h();
    private final bu b = new bu();

    protected g() {
    }

    public Object get(long l2, TimeUnit timeUnit) {
        return this.a.a(timeUnit.toNanos(l2));
    }

    public Object get() {
        return this.a.a();
    }

    @Override
    public boolean isDone() {
        return this.a.b();
    }

    @Override
    public boolean isCancelled() {
        return this.a.c();
    }

    @Override
    public boolean cancel(boolean bl2) {
        if (!this.a.a(bl2)) {
            return false;
        }
        this.b.a();
        if (bl2) {
            this.a();
        }
        return true;
    }

    protected void a() {
    }

    protected final boolean b() {
        return this.a.d();
    }

    @Override
    public void a(Runnable runnable, Executor executor) {
        this.b.a(runnable, executor);
    }

    protected boolean a(Object object) {
        boolean bl2 = this.a.a(object);
        if (bl2) {
            this.b.a();
        }
        return bl2;
    }

    protected boolean a(Throwable throwable) {
        boolean bl2 = this.a.a((Throwable)cl.a(throwable));
        if (bl2) {
            this.b.a();
        }
        return bl2;
    }

    static final CancellationException a(String string, Throwable throwable) {
        CancellationException cancellationException = new CancellationException(string);
        cancellationException.initCause(throwable);
        return cancellationException;
    }
}

