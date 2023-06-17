/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.f;

import io.netty.b.g;
import io.netty.c.f.a;
import io.netty.c.f.d;
import io.netty.c.f.e;
import io.netty.c.f.i;
import io.netty.channel.bd;
import io.netty.channel.bw;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class c
extends a {
    private List h = new LinkedList();

    public c(long l2, long l3, long l4, long l5) {
        super(l2, l3, l4, l5);
    }

    public c(long l2, long l3, long l4) {
        super(l2, l3, l4);
    }

    public c(long l2, long l3) {
        super(l2, l3);
    }

    public c(long l2) {
        super(l2);
    }

    @Override
    public void e(bd bd2) {
        i i2 = new i(this, bd2.e(), "ChannelTC" + bd2.b().hashCode(), this.f);
        this.a(i2);
        i2.a();
    }

    @Override
    public synchronized void f(bd bd2) {
        if (this.d != null) {
            this.d.b();
        }
        for (e e2 : this.h) {
            if (!(e2.b instanceof g)) continue;
            ((g)e2.b).ad();
        }
        this.h.clear();
    }

    @Override
    protected synchronized void a(bd bd2, Object object, long l2, bw bw2) {
        if (l2 == 0L && this.h.isEmpty()) {
            bd2.a(object, bw2);
            return;
        }
        e e2 = new e(l2, object, bw2, null);
        this.h.add(e2);
        bd2.e().a(new d(this, bd2), l2, TimeUnit.MILLISECONDS);
    }

    private synchronized void l(bd bd2) {
        while (!this.h.isEmpty()) {
            e e2 = (e)this.h.remove(0);
            if (e2.a <= System.currentTimeMillis()) {
                bd2.a(e2.b, e2.c);
                continue;
            }
            this.h.add(0, e2);
            break;
        }
        bd2.q();
    }

    static /* synthetic */ void a(c c2, bd bd2) {
        c2.l(bd2);
    }
}

