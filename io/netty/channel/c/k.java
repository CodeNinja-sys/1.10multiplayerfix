/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.c;

import io.netty.channel.c.j;
import io.netty.channel.da;
import io.netty.util.b.w;
import java.util.concurrent.ThreadFactory;

public class k
extends da {
    public k() {
        this(0);
    }

    public k(int n2) {
        this(n2, null);
    }

    public k(int n2, ThreadFactory threadFactory) {
        super(n2, threadFactory, new Object[0]);
    }

    @Override
    protected w a(ThreadFactory threadFactory, Object ... arrobject) {
        return new j(this, threadFactory);
    }
}

