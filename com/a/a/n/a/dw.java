/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.dx;
import com.a.a.n.a.ay;
import java.util.concurrent.Executor;

final class dw
implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ dx b;

    dw(Executor executor, dx dx2) {
        this.a = executor;
        this.b = dx2;
    }

    @Override
    public void execute(Runnable runnable) {
        this.a.execute(ay.a(runnable, this.b));
    }
}

