/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.cb;
import java.util.concurrent.Future;

public abstract class cc
extends cb {
    private final Future a;

    protected cc(Future future) {
        this.a = (Future)cl.a(future);
    }

    @Override
    protected final Future c() {
        return this.a;
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.c();
    }
}

