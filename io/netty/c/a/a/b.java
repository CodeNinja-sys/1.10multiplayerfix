/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.a;

import io.netty.b.g;
import io.netty.c.a.a.a;
import io.netty.c.a.a.c;
import io.netty.c.a.t;
import io.netty.channel.bd;
import java.util.List;

public class b
extends t {
    private final c a;

    public b() {
        this(c.a);
    }

    public b(c c2) {
        if (c2 == null) {
            throw new NullPointerException("dialect");
        }
        this.a = c2;
    }

    protected void a(bd bd2, g g2, List list) {
        list.add(io.netty.c.a.a.a.b(g2, g2.p(), g2.r(), this.a));
    }
}

