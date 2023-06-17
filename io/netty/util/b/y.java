/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ab;
import io.netty.util.b.g;
import io.netty.util.b.w;
import io.netty.util.c.u;

public final class y
extends g {
    private final Throwable a;

    public y(w w2, Throwable throwable) {
        super(w2);
        if (throwable == null) {
            throw new NullPointerException("cause");
        }
        this.a = throwable;
    }

    @Override
    public Throwable bq_() {
        return this.a;
    }

    @Override
    public boolean bo_() {
        return false;
    }

    @Override
    public ab bl_() {
        u.a(this.a);
        return this;
    }

    @Override
    public ab bj_() {
        u.a(this.a);
        return this;
    }

    @Override
    public Object bm_() {
        return null;
    }
}

