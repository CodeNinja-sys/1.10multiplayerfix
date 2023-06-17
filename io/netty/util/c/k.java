/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.l;
import io.netty.util.c.m;
import io.netty.util.c.u;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

abstract class k
extends m
implements Serializable {
    private static final long a = 8467054865577874285L;
    private static final AtomicReferenceFieldUpdater b;
    private volatile transient l c;

    k() {
    }

    protected final l a() {
        return this.c;
    }

    protected final void a(l l2) {
        this.c = l2;
    }

    protected final void b(l l2) {
        b.lazySet(this, l2);
    }

    static {
        AtomicReferenceFieldUpdater<k, l> atomicReferenceFieldUpdater = io.netty.util.c.u.a(k.class, "headRef");
        if (atomicReferenceFieldUpdater == null) {
            atomicReferenceFieldUpdater = AtomicReferenceFieldUpdater.newUpdater(k.class, l.class, "c");
        }
        b = atomicReferenceFieldUpdater;
    }
}

