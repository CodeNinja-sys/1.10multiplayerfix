/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.b;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.apache.commons.c.b.c;

public class h
extends c {
    private final Callable a;

    public h(Callable callable) {
        this.a(callable);
        this.a = callable;
    }

    public h(Callable callable, ExecutorService executorService) {
        super(executorService);
        this.a(callable);
        this.a = callable;
    }

    @Override
    protected Object h() {
        return this.a.call();
    }

    private void a(Callable callable) {
        if (callable == null) {
            throw new IllegalArgumentException("Callable must not be null!");
        }
    }
}

