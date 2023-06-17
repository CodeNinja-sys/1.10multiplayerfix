/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.z;

final class v
implements Runnable {
    private final Runnable a;

    v(Runnable runnable) {
        this.a = runnable;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        try {
            this.a.run();
        }
        finally {
            z.c();
        }
    }
}

