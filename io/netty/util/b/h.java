/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.az;
import io.netty.util.b.i;
import java.util.concurrent.ThreadFactory;

final class h
extends az {
    h(i i2, ThreadFactory threadFactory) {
        super(i2, threadFactory, true);
    }

    @Override
    protected void e() {
        do {
            Runnable runnable;
            if ((runnable = this.q()) == null) continue;
            runnable.run();
            this.w();
        } while (!this.x());
    }
}

