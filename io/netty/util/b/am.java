/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import java.util.concurrent.Executor;

public final class am
implements Executor {
    public static final am a = new am();

    private am() {
    }

    @Override
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("command");
        }
        runnable.run();
    }
}

