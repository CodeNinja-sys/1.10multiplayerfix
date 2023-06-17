/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.e;

import io.netty.c.e.b;
import io.netty.c.e.c;
import io.netty.channel.bd;
import java.util.concurrent.TimeUnit;

final class e
implements Runnable {
    private final bd b;
    final /* synthetic */ c a;

    e(c c2, bd bd2) {
        this.a = c2;
        this.b = bd2;
    }

    @Override
    public void run() {
        if (!this.b.b().H()) {
            return;
        }
        long l2 = System.nanoTime();
        long l3 = Math.max(this.a.b, this.a.d);
        long l4 = c.e(this.a) - (l2 - l3);
        if (l4 <= 0L) {
            this.a.e = this.b.e().a(this, c.e(this.a), TimeUnit.NANOSECONDS);
            try {
                b b2;
                if (c.f(this.a)) {
                    c.b(this.a, false);
                    b2 = io.netty.c.e.b.e;
                } else {
                    b2 = io.netty.c.e.b.f;
                }
                this.a.a(this.b, b2);
            }
            catch (Throwable throwable) {
                this.b.a(throwable);
            }
        } else {
            this.a.e = this.b.e().a(this, l4, TimeUnit.NANOSECONDS);
        }
    }
}

