/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.dv;
import com.a.a.n.a.o;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ec
extends o {
    private final Lock a = new ReentrantLock();
    private final Condition b = this.a.newCondition();
    private int c = 0;
    private boolean d = false;

    private ec() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void execute(Runnable runnable) {
        this.a();
        try {
            runnable.run();
        }
        finally {
            this.b();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean isShutdown() {
        this.a.lock();
        try {
            boolean bl2 = this.d;
            return bl2;
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void shutdown() {
        this.a.lock();
        try {
            this.d = true;
        }
        finally {
            this.a.unlock();
        }
    }

    public List shutdownNow() {
        this.shutdown();
        return Collections.emptyList();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean isTerminated() {
        this.a.lock();
        try {
            boolean bl2 = this.d && this.c == 0;
            return bl2;
        }
        finally {
            this.a.unlock();
        }
    }

    @Override
    public boolean awaitTermination(long l2, TimeUnit timeUnit) {
        long l3 = timeUnit.toNanos(l2);
        this.a.lock();
        try {
            while (true) {
                if (this.isTerminated()) {
                    boolean bl2 = true;
                    return bl2;
                }
                if (l3 <= 0L) {
                    boolean bl3 = false;
                    return bl3;
                }
                l3 = this.b.awaitNanos(l3);
            }
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a() {
        this.a.lock();
        try {
            if (this.isShutdown()) {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            ++this.c;
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b() {
        this.a.lock();
        try {
            --this.c;
            if (this.isTerminated()) {
                this.b.signalAll();
            }
        }
        finally {
            this.a.unlock();
        }
    }

    /* synthetic */ ec(dv dv2) {
        this();
    }
}

