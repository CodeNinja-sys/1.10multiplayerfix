/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.an;
import io.netty.util.b.h;
import io.netty.util.b.w;
import java.util.concurrent.ThreadFactory;

public class i
extends an {
    public i(int n2) {
        this(n2, null);
    }

    public i(int n2, ThreadFactory threadFactory) {
        super(n2, threadFactory, new Object[0]);
    }

    @Override
    protected w a(ThreadFactory threadFactory, Object ... arrobject) {
        return new h(this, threadFactory);
    }
}

