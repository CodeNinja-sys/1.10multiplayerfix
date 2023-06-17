/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.cu;
import com.a.a.c.cw;
import java.util.concurrent.atomic.AtomicLong;

final class cy
extends AtomicLong
implements cu {
    private cy() {
    }

    @Override
    public void a() {
        this.getAndIncrement();
    }

    @Override
    public void a(long l2) {
        this.getAndAdd(l2);
    }

    @Override
    public long b() {
        return this.get();
    }

    /* synthetic */ cy(cw cw2) {
        this();
    }
}

