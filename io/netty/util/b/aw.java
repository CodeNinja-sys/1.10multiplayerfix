/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import java.util.concurrent.Callable;

final class aw
implements Callable {
    final Runnable a;
    final Object b;

    aw(Runnable runnable, Object object) {
        this.a = runnable;
        this.b = object;
    }

    public Object call() {
        this.a.run();
        return this.b;
    }

    public String toString() {
        return "Callable(task: " + this.a + ", result: " + this.b + ')';
    }
}

