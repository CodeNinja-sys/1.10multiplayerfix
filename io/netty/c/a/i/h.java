/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.i;

import io.netty.b.g;
import io.netty.b.j;
import io.netty.c.a.i.c;
import io.netty.c.a.i.e;
import io.netty.c.a.m;
import io.netty.channel.bd;

public class h
extends m {
    private final c a;

    public h(c c2) {
        this(0x100000, c2);
    }

    public h(int n2, c c2) {
        super(n2, 0, 4, 0, 4);
        this.a = c2;
    }

    @Override
    protected Object a(bd bd2, g g2) {
        g g3 = (g)super.a(bd2, g2);
        if (g3 == null) {
            return null;
        }
        e e2 = new e(new j(g3), this.a);
        Object object = e2.readObject();
        e2.close();
        return object;
    }

    @Override
    protected g a(bd bd2, g g2, int n2, int n3) {
        return g2.i(n2, n3);
    }
}

