/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.g;
import io.netty.b.i;
import io.netty.util.c.ad;
import io.netty.util.n;
import io.netty.util.z;

public class ae
implements i {
    private final g a;

    public ae(g g2) {
        if (g2 == null) {
            throw new NullPointerException("data");
        }
        this.a = g2;
    }

    @Override
    public g a() {
        if (this.a.ac() <= 0) {
            throw new n(this.a.ac());
        }
        return this.a;
    }

    @Override
    public i b() {
        return new ae(this.a.Q());
    }

    @Override
    public i c() {
        return new ae(this.a.S());
    }

    @Override
    public int ac() {
        return this.a.ac();
    }

    @Override
    public i bC_() {
        this.a.ab();
        return this;
    }

    @Override
    public i a(int n2) {
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
        return ad.a(this) + '(' + this.a().toString() + ')';
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.a(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.bC_();
    }
}

