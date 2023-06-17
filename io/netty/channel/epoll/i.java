/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.channel.ct;
import io.netty.channel.da;
import io.netty.channel.epoll.h;
import io.netty.util.b.w;
import java.util.concurrent.ThreadFactory;

public final class i
extends da {
    public i() {
        this(0);
    }

    public i(int n2) {
        this(n2, null);
    }

    public i(int n2, ThreadFactory threadFactory) {
        this(n2, threadFactory, 128);
    }

    public i(int n2, ThreadFactory threadFactory, int n3) {
        super(n2, threadFactory, n3);
    }

    public void a(int n2) {
        for (w w2 : this.g()) {
            ((h)w2).a(n2);
        }
    }

    @Override
    protected w a(ThreadFactory threadFactory, Object ... arrobject) {
        return new h((ct)this, threadFactory, (Integer)arrobject[0]);
    }
}

