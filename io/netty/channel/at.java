/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.au;
import io.netty.channel.bw;

class at
implements au {
    private long a;
    private final bw b;

    at(long l2, bw bw2) {
        this.a = l2;
        this.b = bw2;
    }

    @Override
    public long bg_() {
        return this.a;
    }

    @Override
    public void a(long l2) {
        this.a = l2;
    }

    @Override
    public bw bh_() {
        return this.b;
    }
}

