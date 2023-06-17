/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.cq;
import io.netty.channel.cy;
import io.netty.channel.cz;

public final class co
implements cy {
    public static final cy a = new co(0);
    private final cz b;

    public co(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("unknownSize: " + n2 + " (expected: >= 0)");
        }
        this.b = new cq(n2, null);
    }

    @Override
    public cz a() {
        return this.b;
    }
}

