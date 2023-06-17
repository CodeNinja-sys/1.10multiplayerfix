/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class l {
    private static final AtomicReferenceFieldUpdater a;
    private volatile l b;

    final l j() {
        return this.b;
    }

    final void a(l l2) {
        a.lazySet(this, l2);
    }

    public abstract Object b();

    protected Object bk_() {
        return this.b();
    }

    void k() {
        this.a(null);
    }

    static {
        AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater = u.a(l.class, "next");
        if (atomicReferenceFieldUpdater == null) {
            atomicReferenceFieldUpdater = AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b");
        }
        a = atomicReferenceFieldUpdater;
    }
}

