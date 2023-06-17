/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

final class h
extends AbstractQueuedSynchronizer {
    private static final long f = 0L;
    static final int a = 0;
    static final int b = 1;
    static final int c = 2;
    static final int d = 4;
    static final int e = 8;
    private Object g;
    private Throwable h;

    h() {
    }

    @Override
    protected int tryAcquireShared(int n2) {
        if (this.b()) {
            return 1;
        }
        return -1;
    }

    @Override
    protected boolean tryReleaseShared(int n2) {
        this.setState(n2);
        return true;
    }

    Object a(long l2) {
        if (!this.tryAcquireSharedNanos(-1, l2)) {
            throw new TimeoutException("Timeout waiting for task.");
        }
        return this.e();
    }

    Object a() {
        this.acquireSharedInterruptibly(-1);
        return this.e();
    }

    private Object e() {
        int n2 = this.getState();
        switch (n2) {
            case 2: {
                if (this.h != null) {
                    throw new ExecutionException(this.h);
                }
                return this.g;
            }
            case 4: 
            case 8: {
                throw com.a.a.n.a.g.a("Task was cancelled.", this.h);
            }
        }
        throw new IllegalStateException("Error, synchronizer in invalid state: " + n2);
    }

    boolean b() {
        return (this.getState() & 0xE) != 0;
    }

    boolean c() {
        return (this.getState() & 0xC) != 0;
    }

    boolean d() {
        return this.getState() == 8;
    }

    boolean a(Object object) {
        return this.a(object, null, 2);
    }

    boolean a(Throwable throwable) {
        return this.a(null, throwable, 2);
    }

    boolean a(boolean bl2) {
        return this.a(null, null, bl2 ? 8 : 4);
    }

    private boolean a(Object object, Throwable throwable, int n2) {
        boolean bl2 = this.compareAndSetState(0, 1);
        if (bl2) {
            this.g = object;
            this.h = (n2 & 0xC) != 0 ? new CancellationException("Future.cancel() was called.") : throwable;
            this.releaseShared(n2);
        } else if (this.getState() == 1) {
            this.acquireShared(-1);
        }
        return bl2;
    }
}

