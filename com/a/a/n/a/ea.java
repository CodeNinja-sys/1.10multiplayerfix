/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.dz;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class ea
implements Runnable {
    final /* synthetic */ ExecutorService a;
    final /* synthetic */ long b;
    final /* synthetic */ TimeUnit c;
    final /* synthetic */ dz d;

    ea(dz dz2, ExecutorService executorService, long l2, TimeUnit timeUnit) {
        this.d = dz2;
        this.a = executorService;
        this.b = l2;
        this.c = timeUnit;
    }

    @Override
    public void run() {
        try {
            this.a.shutdown();
            this.a.awaitTermination(this.b, this.c);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }
}

