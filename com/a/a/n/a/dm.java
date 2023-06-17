/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.bu;
import com.a.a.n.a.dl;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public class dm
extends FutureTask
implements dl {
    private final bu a = new bu();

    public static dm a(Callable callable) {
        return new dm(callable);
    }

    public static dm a(Runnable runnable, Object object) {
        return new dm(runnable, object);
    }

    dm(Callable callable) {
        super(callable);
    }

    dm(Runnable runnable, Object object) {
        super(runnable, object);
    }

    @Override
    public void a(Runnable runnable, Executor executor) {
        this.a.a(runnable, executor);
    }

    @Override
    protected void done() {
        this.a.a();
    }
}

