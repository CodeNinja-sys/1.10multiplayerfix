/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.l;
import io.netty.util.t;

public abstract class ac
extends l {
    private final t a;

    protected ac(t t2) {
        if (t2 == null) {
            throw new NullPointerException("handle");
        }
        this.a = t2;
    }

    @Override
    final void k() {
        super.k();
        this.a(this.a);
    }

    protected abstract void a(t var1);
}

