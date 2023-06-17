/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.ca;
import com.a.a.n.a.dl;
import com.a.a.n.a.dq;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public abstract class cf
extends ca
implements dq {
    protected cf() {
    }

    protected abstract dq b();

    @Override
    public dl b(Callable callable) {
        return this.b().b(callable);
    }

    @Override
    public dl a(Runnable runnable) {
        return this.b().a(runnable);
    }

    @Override
    public dl b(Runnable runnable, Object object) {
        return this.b().b(runnable, object);
    }

    @Override
    public /* synthetic */ Future submit(Runnable runnable, Object object) {
        return this.b(runnable, object);
    }

    @Override
    public /* synthetic */ Future submit(Runnable runnable) {
        return this.a(runnable);
    }

    @Override
    public /* synthetic */ Future submit(Callable callable) {
        return this.b(callable);
    }

    @Override
    protected /* synthetic */ ExecutorService a() {
        return this.b();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.b();
    }
}

