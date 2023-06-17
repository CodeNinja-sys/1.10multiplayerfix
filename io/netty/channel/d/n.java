/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.d;

import io.netty.channel.d.l;
import io.netty.channel.da;
import io.netty.util.b.w;
import java.nio.channels.spi.SelectorProvider;
import java.util.concurrent.ThreadFactory;

public class n
extends da {
    public n() {
        this(0);
    }

    public n(int n2) {
        this(n2, null);
    }

    public n(int n2, ThreadFactory threadFactory) {
        this(n2, threadFactory, SelectorProvider.provider());
    }

    public n(int n2, ThreadFactory threadFactory, SelectorProvider selectorProvider) {
        super(n2, threadFactory, selectorProvider);
    }

    public void a(int n2) {
        for (w w2 : this.g()) {
            ((l)w2).a(n2);
        }
    }

    public void e() {
        for (w w2 : this.g()) {
            ((l)w2).j();
        }
    }

    @Override
    protected w a(ThreadFactory threadFactory, Object ... arrobject) {
        return new l(this, threadFactory, (SelectorProvider)arrobject[0]);
    }
}

