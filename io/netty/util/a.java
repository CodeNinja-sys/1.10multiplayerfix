/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.c.u;
import io.netty.util.n;
import io.netty.util.z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class a
implements z {
    private static final AtomicIntegerFieldUpdater a;
    private volatile int b = 1;

    @Override
    public final int ac() {
        return this.b;
    }

    protected final void e(int n2) {
        this.b = n2;
    }

    @Override
    public z ae() {
        int n2;
        do {
            if ((n2 = this.b) == 0) {
                throw new n(0, 1);
            }
            if (n2 != Integer.MAX_VALUE) continue;
            throw new n(Integer.MAX_VALUE, 1);
        } while (!a.compareAndSet(this, n2, n2 + 1));
        return this;
    }

    @Override
    public z J(int n2) {
        int n3;
        if (n2 <= 0) {
            throw new IllegalArgumentException("increment: " + n2 + " (expected: > 0)");
        }
        do {
            if ((n3 = this.b) == 0) {
                throw new n(0, 1);
            }
            if (n3 <= Integer.MAX_VALUE - n2) continue;
            throw new n(n3, n2);
        } while (!a.compareAndSet(this, n3, n3 + n2));
        return this;
    }

    @Override
    public final boolean ad() {
        int n2;
        do {
            if ((n2 = this.b) != 0) continue;
            throw new n(0, -1);
        } while (!a.compareAndSet(this, n2, n2 - 1));
        if (n2 == 1) {
            this.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean I(int n2) {
        int n3;
        if (n2 <= 0) {
            throw new IllegalArgumentException("decrement: " + n2 + " (expected: > 0)");
        }
        do {
            if ((n3 = this.b) >= n2) continue;
            throw new n(n3, -n2);
        } while (!a.compareAndSet(this, n3, n3 - n2));
        if (n3 == n2) {
            this.d();
            return true;
        }
        return false;
    }

    protected abstract void d();

    static {
        AtomicIntegerFieldUpdater<a> atomicIntegerFieldUpdater = u.b(a.class, "refCnt");
        if (atomicIntegerFieldUpdater == null) {
            atomicIntegerFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(a.class, "b");
        }
        a = atomicIntegerFieldUpdater;
    }
}

