/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.c;

import io.netty.channel.c.k;
import io.netty.channel.dj;
import java.util.concurrent.ThreadFactory;

final class j
extends dj {
    j(k k2, ThreadFactory threadFactory) {
        super(k2, threadFactory, true);
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

