/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.av;
import io.netty.util.c.a.bl;
import io.netty.util.c.a.c;
import io.netty.util.c.a.i;

final class ac
extends bl
implements i {
    long a;

    ac(av[] arrav, int n2, int n3, int n4, long l2) {
        super(arrav, n2, n3, n4);
        this.a = l2;
    }

    @Override
    public i a() {
        ac ac2;
        int n2 = this.f;
        int n3 = this.g;
        int n4 = n2 + n3 >>> 1;
        if (n4 <= n2) {
            ac2 = null;
        } else {
            this.g = this.g;
            this.a = this.a;
            ac2 = new ac(this.c, this.h, n4, n3, this.a >>> 1);
        }
        return ac2;
    }

    @Override
    public void a(c c2) {
        av av2;
        if (c2 == null) {
            throw new NullPointerException();
        }
        while ((av2 = this.c()) != null) {
            c2.a(av2.c);
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
        c2.a(av2.c);
        return true;
    }

    @Override
    public long b() {
        return this.a;
    }
}

