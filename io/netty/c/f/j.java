/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.f;

import io.netty.c.f.a;
import io.netty.c.f.i;
import java.util.concurrent.TimeUnit;

class j
implements Runnable {
    private final a a;
    private final i b;

    protected j(a a2, i i2) {
        this.a = a2;
        this.b = i2;
    }

    @Override
    public void run() {
        if (!this.b.c.get()) {
            return;
        }
        long l2 = System.currentTimeMillis();
        this.b.a(l2);
        if (this.a != null) {
            this.a.b(this.b);
        }
        i.a(this.b, i.a(this.b).schedule(this, this.b.a.get(), TimeUnit.MILLISECONDS));
    }
}

