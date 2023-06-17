/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.ay;
import com.a.a.n.a.gn;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

final class dx
extends gn {
    final /* synthetic */ com.a.a.b.dx a;

    dx(ExecutorService executorService, com.a.a.b.dx dx2) {
        this.a = dx2;
        super(executorService);
    }

    @Override
    protected Callable a(Callable callable) {
        return ay.a(callable, this.a);
    }

    @Override
    protected Runnable a(Runnable runnable) {
        return ay.a(runnable, this.a);
    }
}

