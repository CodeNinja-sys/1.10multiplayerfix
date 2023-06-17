/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.bh;
import io.netty.b.bp;
import io.netty.b.g;
import io.netty.util.z;
import java.nio.ByteOrder;

final class bn
extends bp {
    private bh b;

    bn(g g2) {
        super(g2);
    }

    @Override
    public g a(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        }
        if (byteOrder == this.m()) {
            return this;
        }
        bh bh2 = this.b;
        if (bh2 == null) {
            this.b = bh2 = new bh(this);
        }
        return bh2;
    }

    @Override
    public g z(int n2) {
        return new bn(this.a.z(n2));
    }

    @Override
    public g R() {
        return new bn(this.a.R());
    }

    @Override
    public g i(int n2, int n3) {
        return new bn(this.a.i(n2, n3));
    }

    @Override
    public g S() {
        return new bn(this.a.S());
    }

    @Override
    public g H(int n2) {
        return this;
    }

    @Override
    public g ab() {
        return this;
    }

    @Override
    public boolean ad() {
        return false;
    }

    @Override
    public boolean I(int n2) {
        return false;
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.H(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.ab();
    }
}

