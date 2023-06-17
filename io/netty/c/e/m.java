/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.e;

import io.netty.c.e.l;
import io.netty.c.e.n;
import io.netty.c.e.o;
import io.netty.channel.bd;
import io.netty.channel.bq;
import io.netty.channel.bw;
import io.netty.util.b.ad;
import io.netty.util.b.ax;
import java.util.concurrent.TimeUnit;

public class m
extends bq {
    private static final long a = TimeUnit.MILLISECONDS.toNanos(1L);
    private final long b;
    private boolean c;

    public m(int n2) {
        this(n2, TimeUnit.SECONDS);
    }

    public m(long l2, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        this.b = l2 <= 0L ? 0L : Math.max(timeUnit.toNanos(l2), a);
    }

    @Override
    public void a(bd bd2, Object object, bw bw2) {
        this.d(bd2, bw2);
        bd2.a(object, bw2);
    }

    private void d(bd bd2, bw bw2) {
        if (this.b > 0L) {
            ax ax2 = bd2.e().a(new n(this, bw2, bd2), this.b, TimeUnit.NANOSECONDS);
            bw2.g((ad)new o(this, ax2));
        }
    }

    protected void a(bd bd2) {
        if (!this.c) {
            bd2.a(l.a);
            bd2.n();
            this.c = true;
        }
    }
}

