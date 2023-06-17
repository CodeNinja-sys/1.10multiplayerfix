/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a;

import io.netty.b.g;
import io.netty.c.a.d;
import io.netty.channel.bd;
import java.util.List;

public class l
extends d {
    private final int a;

    public l(int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException("frameLength must be a positive integer: " + n2);
        }
        this.a = n2;
    }

    @Override
    protected final void a(bd bd2, g g2, List list) {
        Object object = this.a(bd2, g2);
        if (object != null) {
            list.add(object);
        }
    }

    protected Object a(bd bd2, g g2) {
        if (g2.r() < this.a) {
            return null;
        }
        return g2.z(this.a).ab();
    }
}

