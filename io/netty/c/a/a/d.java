/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.a;

import io.netty.b.g;
import io.netty.c.a.a.a;
import io.netty.c.a.a.c;
import io.netty.c.a.u;
import io.netty.channel.bd;
import java.util.List;

public class d
extends u {
    private final boolean a;
    private final c b;

    public d() {
        this(true);
    }

    public d(boolean bl2) {
        this(bl2, c.a);
    }

    public d(boolean bl2, c c2) {
        if (c2 == null) {
            throw new NullPointerException("dialect");
        }
        this.a = bl2;
        this.b = c2;
    }

    protected void a(bd bd2, g g2, List list) {
        list.add(io.netty.c.a.a.a.a(g2, g2.p(), g2.r(), this.a, this.b));
    }
}

