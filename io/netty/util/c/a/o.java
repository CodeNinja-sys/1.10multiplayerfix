/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.a;
import io.netty.util.c.a.ae;
import io.netty.util.c.a.av;
import io.netty.util.c.a.bl;
import io.netty.util.c.a.c;
import io.netty.util.c.a.i;

final class o
extends bl
implements i {
    final a a;
    long b;

    o(av[] arrav, int n2, int n3, int n4, long l2, a a2) {
        super(arrav, n2, n3, n4);
        this.a = a2;
        this.b = l2;
    }

    @Override
    public i a() {
        o o2;
        int n2 = this.f;
        int n3 = this.g;
        int n4 = n2 + n3 >>> 1;
        if (n4 <= n2) {
            o2 = null;
        } else {
            this.g = this.g;
            this.b = this.b;
            o2 = new o(this.c, this.h, n4, n3, this.b >>> 1, this.a);
        }
        return o2;
    }

    @Override
    public void a(c c2) {
        av av2;
        if (c2 == null) {
            throw new NullPointerException();
        }
        while ((av2 = this.c()) != null) {
            c2.a(new ae(av2.c, av2.d, this.a));
        }
    }

    @Override
    public boolean b(c c2) {
        if (c2 == null) {
            throw new NullPointerException();
        }
        av av2 = this.c();
        if (av2 == null) {
            return false;
        }
        c2.a(new ae(av2.c, av2.d, this.a));
        return true;
    }

    @Override
    public long b() {
        return this.b;
    }
}

