/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.c.ac;
import io.netty.c.a.c.x;
import io.netty.c.a.d.ag;
import io.netty.channel.a.a;

public class ah
extends ag {
    private final boolean b;

    public ah() {
        this(false);
    }

    public ah(boolean bl2) {
        this.b = bl2;
    }

    @Override
    protected a a(String string) {
        if ("gzip".equalsIgnoreCase(string) || "x-gzip".equalsIgnoreCase(string)) {
            return new a(x.b(ac.b));
        }
        if ("deflate".equalsIgnoreCase(string) || "x-deflate".equalsIgnoreCase(string)) {
            ac ac2 = this.b ? ac.a : ac.d;
            return new a(x.b(ac2));
        }
        return null;
    }
}

