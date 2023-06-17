/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.cb;
import com.a.a.n.a.dl;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public abstract class cd
extends cb
implements dl {
    protected cd() {
    }

    protected abstract dl b();

    @Override
    public void a(Runnable runnable, Executor executor) {
        this.b().a(runnable, executor);
    }

    @Override
    protected /* synthetic */ Future c() {
        return this.b();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.b();
    }
}

