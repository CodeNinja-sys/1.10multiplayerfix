/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.cx;
import io.netty.channel.df;
import io.netty.channel.dg;

public class cw
implements df {
    private final dg a;

    public cw(int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException("bufferSize must greater than 0: " + n2);
        }
        this.a = new cx(n2);
    }

    @Override
    public dg a() {
        return this.a;
    }
}

