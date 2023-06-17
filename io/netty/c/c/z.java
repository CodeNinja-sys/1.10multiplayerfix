/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c;

import io.netty.c.c.q;
import io.netty.c.c.r;
import io.netty.util.b.l;
import io.netty.util.b.w;

final class z
extends l {
    final /* synthetic */ q a;

    private z(q q2) {
        this.a = q2;
    }

    @Override
    protected w bu_() {
        if (q.b(this.a) == null) {
            throw new IllegalStateException();
        }
        return q.b(this.a).e();
    }

    /* synthetic */ z(q q2, r r2) {
        this(q2);
    }
}

