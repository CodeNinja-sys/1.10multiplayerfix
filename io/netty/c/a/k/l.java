/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.k.bl;

public abstract class l
implements bl {
    private int a;
    private boolean b;

    protected l(int n2) {
        this.d(n2);
    }

    @Override
    public int h() {
        return this.a;
    }

    @Override
    public bl d(int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException("Stream-ID must be positive: " + n2);
        }
        this.a = n2;
        return this;
    }

    @Override
    public boolean i() {
        return this.b;
    }

    @Override
    public bl b(boolean bl2) {
        this.b = bl2;
        return this;
    }
}

