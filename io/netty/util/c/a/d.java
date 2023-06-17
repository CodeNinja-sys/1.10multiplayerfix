/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.a;
import io.netty.util.c.a.av;
import io.netty.util.c.a.bl;

class d
extends bl {
    final a a;
    av b;

    d(av[] arrav, int n2, int n3, int n4, a a2) {
        super(arrav, n2, n3, n4);
        this.a = a2;
        this.c();
    }

    public final boolean hasNext() {
        return this.d != null;
    }

    public final boolean hasMoreElements() {
        return this.d != null;
    }

    public final void remove() {
        av av2 = this.b;
        if (av2 == null) {
            throw new IllegalStateException();
        }
        this.b = null;
        this.a.a(av2.c, (Object)null, (Object)null);
    }
}

