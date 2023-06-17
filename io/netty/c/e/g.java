/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.e;

import io.netty.c.e.b;
import io.netty.c.e.c;
import io.netty.channel.bd;
import java.util.concurrent.TimeUnit;

final class g
implements Runnable {
    private final bd b;
    final /* synthetic */ c a;

    g(c c2, bd bd2) {
        this.a = c2;
        this.b = bd2;
    }

    @Override
    public void run() {
        if (!this.b.b().H()) {
            return;
        }
        long l2 = System.nanoTime();
        long l3 = this.a.d;
        long l4 = c.c(this.a) - (l2 - l3);
        if (l4 <= 0L) {
            this.a.c = this.b.e().a(this, c.c(this.a), TimeUnit.NANOSECONDS);
            try {
                b b2;
                if (c.d(this.a)) {
                    c.a(this.a, false);
                    b2 = io.netty.c.e.b.c;
                } else {
                    b2 = io.netty.c.e.b.d;
                }
                this.a.a(this.b, b2);
            }
            catch (Throwable throwable) {
                this.b.a(throwable);
            }
        } else {
            this.a.c = this.b.e().a(this, l4, TimeUnit.NANOSECONDS);
        }
    }
}

