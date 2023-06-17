/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.bc;
import com.a.a.n.a.ce;
import com.a.a.n.a.dl;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public abstract class a
extends ce
implements bc {
    protected a(dl dl2) {
        super(dl2);
    }

    protected abstract Exception a(Exception var1);

    @Override
    public Object a() {
        try {
            return this.get();
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw this.a(interruptedException);
        }
        catch (CancellationException cancellationException) {
            throw this.a(cancellationException);
        }
        catch (ExecutionException executionException) {
            throw this.a(executionException);
        }
    }

    @Override
    public Object a(long l2, TimeUnit timeUnit) {
        try {
            return this.get(l2, timeUnit);
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw this.a(interruptedException);
        }
        catch (CancellationException cancellationException) {
            throw this.a(cancellationException);
        }
        catch (ExecutionException executionException) {
            throw this.a(executionException);
        }
    }
}

