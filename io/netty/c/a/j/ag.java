/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

import io.netty.b.g;
import io.netty.c.a.j.ai;
import io.netty.c.a.j.aj;

public abstract class ag {
    private final ai a;
    private final aj b = aj.b;

    protected ag(ai ai2) {
        if (ai2 == null) {
            throw new NullPointerException("type");
        }
        this.a = ai2;
    }

    public ai e() {
        return this.a;
    }

    public aj f() {
        return this.b;
    }

    public abstract void a(g var1);
}

