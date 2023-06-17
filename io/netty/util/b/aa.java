/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.c.f;

public class aa
extends Thread {
    private f a;

    public aa() {
    }

    public aa(Runnable runnable) {
        super(runnable);
    }

    public aa(ThreadGroup threadGroup, Runnable runnable) {
        super(threadGroup, runnable);
    }

    public aa(String string) {
        super(string);
    }

    public aa(ThreadGroup threadGroup, String string) {
        super(threadGroup, string);
    }

    public aa(Runnable runnable, String string) {
        super(runnable, string);
    }

    public aa(ThreadGroup threadGroup, Runnable runnable, String string) {
        super(threadGroup, runnable, string);
    }

    public aa(ThreadGroup threadGroup, Runnable runnable, String string, long l2) {
        super(threadGroup, runnable, string, l2);
    }

    public final f a() {
        return this.a;
    }

    public final void a(f f2) {
        this.a = f2;
    }
}

