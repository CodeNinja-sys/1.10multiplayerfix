/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.ag;

final class ai
implements Thread.UncaughtExceptionHandler {
    ai() {
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        ag.c().b("An exception has been raised by {}", (Object)thread.getName(), (Object)throwable);
    }
}

