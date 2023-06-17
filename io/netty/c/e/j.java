/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.e;

import io.netty.c.e.i;
import io.netty.channel.bd;
import java.util.concurrent.TimeUnit;

final class j
implements Runnable {
    private final bd b;
    final /* synthetic */ i a;

    j(i i2, bd bd2) {
        this.a = i2;
        this.b = bd2;
    }

    @Override
    public void run() {
        if (!this.b.b().H()) {
            return;
        }
        long l2 = System.nanoTime();
        long l3 = i.a(this.a) - (l2 - i.b(this.a));
        if (l3 <= 0L) {
            i.a(this.a, this.b.e().a(this, i.a(this.a), TimeUnit.NANOSECONDS));
            try {
                this.a.c(this.b);
            }
            catch (Throwable throwable) {
                this.b.a(throwable);
            }
        } else {
            i.a(this.a, this.b.e().a(this, l3, TimeUnit.NANOSECONDS));
        }
    }
}

