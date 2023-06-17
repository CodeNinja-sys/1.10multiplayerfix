/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

final class gg
implements ThreadFactory {
    final /* synthetic */ ThreadFactory a;
    final /* synthetic */ String b;
    final /* synthetic */ AtomicLong c;
    final /* synthetic */ Boolean d;
    final /* synthetic */ Integer e;
    final /* synthetic */ Thread.UncaughtExceptionHandler f;

    gg(ThreadFactory threadFactory, String string, AtomicLong atomicLong, Boolean bl2, Integer n2, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = threadFactory;
        this.b = string;
        this.c = atomicLong;
        this.d = bl2;
        this.e = n2;
        this.f = uncaughtExceptionHandler;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = this.a.newThread(runnable);
        if (this.b != null) {
            thread.setName(String.format(this.b, this.c.getAndIncrement()));
        }
        if (this.d != null) {
            thread.setDaemon(this.d);
        }
        if (this.e != null) {
            thread.setPriority(this.e);
        }
        if (this.f != null) {
            thread.setUncaughtExceptionHandler(this.f);
        }
        return thread;
    }
}

