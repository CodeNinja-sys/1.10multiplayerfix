/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

import io.netty.b.g;
import io.netty.c.a.j.ak;
import io.netty.c.a.j.al;
import io.netty.c.a.j.j;
import java.util.Collections;
import java.util.List;

public final class y
extends ak {
    private final List a;

    public y(List list) {
        super(al.a);
        if (list == null) {
            throw new NullPointerException("authSchemes");
        }
        this.a = list;
    }

    public List a() {
        return Collections.unmodifiableList(this.a);
    }

    @Override
    public void a(g g2) {
        g2.B(this.f().a());
        g2.B(this.a.size());
        for (j j2 : this.a) {
            g2.B(j2.a());
        }
    }
}

