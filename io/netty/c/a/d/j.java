/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.g;
import io.netty.b.i;
import io.netty.c.a.d.ad;
import io.netty.c.a.d.p;
import io.netty.util.z;

public class j
extends p
implements ad {
    private final g a;

    public j(g g2) {
        if (g2 == null) {
            throw new NullPointerException("content");
        }
        this.a = g2;
    }

    @Override
    public g a() {
        return this.a;
    }

    @Override
    public ad k() {
        return new j(this.a.Q());
    }

    @Override
    public ad h() {
        return new j(this.a.S());
    }

    @Override
    public int ac() {
        return this.a.ac();
    }

    @Override
    public ad j() {
        this.a.ab();
        return this;
    }

    @Override
    public ad c(int n2) {
        this.a.H(n2);
        return this;
    }

    @Override
    public boolean ad() {
        return this.a.ad();
    }

    @Override
    public boolean I(int n2) {
        return this.a.I(n2);
    }

    public String toString() {
        return io.netty.util.c.ad.a(this) + "(data: " + this.a() + ", decoderResult: " + this.i() + ')';
    }

    @Override
    public /* synthetic */ i a(int n2) {
        return this.c(n2);
    }

    @Override
    public /* synthetic */ i bC_() {
        return this.j();
    }

    @Override
    public /* synthetic */ i c() {
        return this.h();
    }

    @Override
    public /* synthetic */ i b() {
        return this.k();
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.c(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.j();
    }
}

