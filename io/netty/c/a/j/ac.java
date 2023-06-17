/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

import io.netty.b.g;
import io.netty.c.a.j.am;
import io.netty.c.a.j.an;
import io.netty.c.a.j.j;

public final class ac
extends am {
    private final j a;

    public ac(j j2) {
        super(an.a);
        if (j2 == null) {
            throw new NullPointerException("authScheme");
        }
        this.a = j2;
    }

    public j a() {
        return this.a;
    }

    @Override
    public void a(g g2) {
        g2.B(this.f().a());
        g2.B(this.a.a());
    }
}

