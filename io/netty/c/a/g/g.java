/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.g;

import io.netty.c.a.d.av;
import io.netty.c.a.d.q;
import io.netty.c.a.g.d;
import io.netty.c.a.g.e;
import io.netty.c.a.g.l;

public class g
extends e {
    public g() {
    }

    public g(int n2, int n3, int n4) {
        super(n2, n3, n4);
    }

    public g(int n2, int n3, int n4, boolean bl2) {
        super(n2, n3, n4, bl2);
    }

    @Override
    protected av a(String[] arrstring) {
        return new q(l.a(arrstring[2]), io.netty.c.a.g.d.a(arrstring[0]), arrstring[1], this.d);
    }

    @Override
    protected av g() {
        return new q(l.a, io.netty.c.a.g.d.a, "/bad-request", this.d);
    }

    @Override
    protected boolean f() {
        return true;
    }
}

