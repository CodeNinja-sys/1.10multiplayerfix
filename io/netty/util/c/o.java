/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.l;
import io.netty.util.c.n;
import io.netty.util.c.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

abstract class o
extends n {
    private static final long a = 8717072462993327429L;
    private static final AtomicReferenceFieldUpdater b;
    private volatile transient l c;

    o() {
    }

    protected final l b() {
        return this.c;
    }

    protected final void c(l l2) {
        this.c = l2;
    }

    protected final l d(l l2) {
        return b.getAndSet(this, l2);
    }

    static {
        AtomicReferenceFieldUpdater<o, l> atomicReferenceFieldUpdater = io.netty.util.c.u.a(o.class, "tailRef");
        if (atomicReferenceFieldUpdater == null) {
            atomicReferenceFieldUpdater = AtomicReferenceFieldUpdater.newUpdater(o.class, l.class, "c");
        }
        b = atomicReferenceFieldUpdater;
    }
}

