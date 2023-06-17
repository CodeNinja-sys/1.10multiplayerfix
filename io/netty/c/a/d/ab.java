/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.bj;
import io.netty.c.a.d.bl;
import io.netty.c.a.d.bs;
import io.netty.c.a.d.y;
import io.netty.c.a.d.z;
import io.netty.channel.bd;
import java.util.List;

final class ab
extends bl {
    final /* synthetic */ y a;

    private ab(y y2) {
        this.a = y2;
    }

    @Override
    protected void a(bd bd2, Object object, List list) {
        if (object instanceof bj && !y.a(this.a)) {
            y.b(this.a).offer(((bj)object).s());
        }
        super.a(bd2, object, list);
        if (y.c(this.a) && object instanceof bs) {
            y.d(this.a).incrementAndGet();
        }
    }

    /* synthetic */ ab(y y2, z z2) {
        this(y2);
    }
}

