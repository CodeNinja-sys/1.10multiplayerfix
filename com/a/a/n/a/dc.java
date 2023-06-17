/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.cj;
import com.a.a.n.a.dl;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class dc
implements dl {
    private static final Logger a = Logger.getLogger(dc.class.getName());

    private dc() {
    }

    @Override
    public void a(Runnable runnable, Executor executor) {
        cl.a(runnable, (Object)"Runnable was null.");
        cl.a(executor, (Object)"Executor was null.");
        try {
            executor.execute(runnable);
        }
        catch (RuntimeException runtimeException) {
            a.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, runtimeException);
        }
    }

    @Override
    public boolean cancel(boolean bl2) {
        return false;
    }

    public abstract Object get();

    public Object get(long l2, TimeUnit timeUnit) {
        cl.a((Object)timeUnit);
        return this.get();
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return true;
    }

    /* synthetic */ dc(cj cj2) {
        this();
    }
}

