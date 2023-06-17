/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

import io.netty.b.g;
import io.netty.c.a.j.am;
import io.netty.c.a.j.an;
import io.netty.c.a.j.ao;
import io.netty.c.a.j.k;

public final class f
extends am {
    private static final ao a = ao.a;
    private final k b;

    public f(k k2) {
        super(an.b);
        if (k2 == null) {
            throw new NullPointerException("authStatus");
        }
        this.b = k2;
    }

    public k a() {
        return this.b;
    }

    @Override
    public void a(g g2) {
        g2.B(a.a());
        g2.B(this.b.a());
    }
}

