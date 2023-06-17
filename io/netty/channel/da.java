/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.channel.bw;
import io.netty.channel.cr;
import io.netty.channel.ct;
import io.netty.util.b.u;
import io.netty.util.b.w;
import io.netty.util.c.ae;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import java.util.concurrent.ThreadFactory;

public abstract class da
extends io.netty.util.b.an
implements ct {
    private static final g a = h.a(da.class);
    private static final int b = Math.max(1, ae.a("io.netty.eventLoopThreads", Runtime.getRuntime().availableProcessors() * 2));

    protected da(int n2, ThreadFactory threadFactory, Object ... arrobject) {
        super(n2 == 0 ? b : n2, threadFactory, arrobject);
    }

    @Override
    protected ThreadFactory a() {
        return new u(this.getClass(), 10);
    }

    @Override
    public cr b() {
        return (cr)super.c();
    }

    @Override
    public av a(an an2) {
        return this.b().a(an2);
    }

    @Override
    public av a(an an2, bw bw2) {
        return this.b().a(an2, bw2);
    }

    @Override
    public /* synthetic */ w c() {
        return this.b();
    }

    static {
        if (a.d()) {
            a.b("-Dio.netty.eventLoopThreads: {}", (Object)b);
        }
    }
}

