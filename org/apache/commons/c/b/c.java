/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.b;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.apache.commons.c.b.d;
import org.apache.commons.c.b.i;
import org.apache.commons.c.b.j;
import org.apache.commons.c.b.l;

public abstract class c
implements j {
    private ExecutorService a;
    private ExecutorService b;
    private Future c;

    protected c() {
        this(null);
    }

    protected c(ExecutorService executorService) {
        this.a(executorService);
    }

    public final synchronized ExecutorService b() {
        return this.a;
    }

    public synchronized boolean c() {
        return this.c != null;
    }

    public final synchronized void a(ExecutorService executorService) {
        if (this.c()) {
            throw new IllegalStateException("Cannot set ExecutorService after start()!");
        }
        this.a = executorService;
    }

    public synchronized boolean d() {
        if (!this.c()) {
            ExecutorService executorService;
            this.b = this.b();
            if (this.b == null) {
                this.b = executorService = this.i();
            } else {
                executorService = null;
            }
            this.c = this.b.submit(this.b(executorService));
            return true;
        }
        return false;
    }

    @Override
    public Object a() {
        try {
            return this.e().get();
        }
        catch (ExecutionException executionException) {
            l.c(executionException);
            return null;
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw new i(interruptedException);
        }
    }

    public synchronized Future e() {
        if (this.c == null) {
            throw new IllegalStateException("start() must be called first!");
        }
        return this.c;
    }

    protected final synchronized ExecutorService f() {
        return this.b;
    }

    protected int g() {
        return 1;
    }

    protected abstract Object h();

    private Callable b(ExecutorService executorService) {
        return new d(this, executorService);
    }

    private ExecutorService i() {
        return Executors.newFixedThreadPool(this.g());
    }
}

