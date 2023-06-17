/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.a;
import io.netty.b.g;
import io.netty.util.c.u;
import io.netty.util.n;
import io.netty.util.z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class e
extends a {
    private static final AtomicIntegerFieldUpdater d;
    private volatile int e = 1;

    protected e(int n2) {
        super(n2);
    }

    @Override
    public final int ac() {
        return this.e;
    }

    protected final void O(int n2) {
        this.e = n2;
    }

    @Override
    public g ab() {
        int n2;
        do {
            if ((n2 = this.e) == 0) {
                throw new n(0, 1);
            }
            if (n2 != Integer.MAX_VALUE) continue;
            throw new n(Integer.MAX_VALUE, 1);
        } while (!d.compareAndSet(this, n2, n2 + 1));
        return this;
    }

    @Override
    public g H(int n2) {
        int n3;
        if (n2 <= 0) {
            throw new IllegalArgumentException("increment: " + n2 + " (expected: > 0)");
        }
        do {
            if ((n3 = this.e) == 0) {
                throw new n(0, n2);
            }
            if (n3 <= Integer.MAX_VALUE - n2) continue;
            throw new n(n3, n2);
        } while (!d.compareAndSet(this, n3, n3 + n2));
        return this;
    }

    @Override
    public final boolean ad() {
        int n2;
        do {
            if ((n2 = this.e) != 0) continue;
            throw new n(0, -1);
        } while (!d.compareAndSet(this, n2, n2 - 1));
        if (n2 == 1) {
            this.c();
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
            if ((n3 = this.e) >= n2) continue;
            throw new n(n3, -n2);
        } while (!d.compareAndSet(this, n3, n3 - n2));
        if (n3 == n2) {
            this.c();
            return true;
        }
        return false;
    }

    protected abstract void c();

    @Override
    public /* synthetic */ z J(int n2) {
        return this.H(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.ab();
    }

    static {
        AtomicIntegerFieldUpdater<e> atomicIntegerFieldUpdater = u.b(e.class, "refCnt");
        if (atomicIntegerFieldUpdater == null) {
            atomicIntegerFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(e.class, "e");
        }
        d = atomicIntegerFieldUpdater;
    }
}

