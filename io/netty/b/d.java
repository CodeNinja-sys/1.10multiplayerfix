/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.a;
import io.netty.b.g;
import io.netty.util.z;
import java.nio.ByteBuffer;

public abstract class d
extends a {
    protected d(int n2) {
        super(n2);
    }

    @Override
    public final int ac() {
        return this.n().ac();
    }

    @Override
    public final g ab() {
        this.n().ab();
        return this;
    }

    @Override
    public final g H(int n2) {
        this.n().H(n2);
        return this;
    }

    @Override
    public final boolean ad() {
        return this.n().ad();
    }

    @Override
    public final boolean I(int n2) {
        return this.n().I(n2);
    }

    @Override
    public ByteBuffer k(int n2, int n3) {
        return this.j(n2, n3);
    }

    @Override
    public ByteBuffer j(int n2, int n3) {
        return this.n().j(n2, n3);
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

