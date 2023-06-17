/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.bp;
import io.netty.b.g;
import io.netty.util.aa;
import java.nio.ByteOrder;

final class bf
extends bp {
    private final aa b;

    bf(g g2, aa aa2) {
        super(g2);
        this.b = aa2;
    }

    @Override
    public boolean ad() {
        boolean bl2 = super.ad();
        if (bl2) {
            this.b.b();
        }
        return bl2;
    }

    @Override
    public boolean I(int n2) {
        boolean bl2 = super.I(n2);
        if (bl2) {
            this.b.b();
        }
        return bl2;
    }

    @Override
    public g a(ByteOrder byteOrder) {
        this.b.a();
        if (this.m() == byteOrder) {
            return this;
        }
        return new bf(super.a(byteOrder), this.b);
    }

    @Override
    public g R() {
        return new bf(super.R(), this.b);
    }

    @Override
    public g i(int n2, int n3) {
        return new bf(super.i(n2, n3), this.b);
    }

    @Override
    public g S() {
        return new bf(super.S(), this.b);
    }

    @Override
    public g z(int n2) {
        return new bf(super.z(n2), this.b);
    }
}

