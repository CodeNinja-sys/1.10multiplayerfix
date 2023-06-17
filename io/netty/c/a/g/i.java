/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.g;

import io.netty.c.a.d.av;
import io.netty.c.a.d.bp;
import io.netty.c.a.d.r;
import io.netty.c.a.g.e;
import io.netty.c.a.g.l;

public class i
extends e {
    private static final bp c = new bp(999, "Unknown");

    public i() {
    }

    public i(int n2, int n3, int n4) {
        super(n2, n3, n4);
    }

    public i(int n2, int n3, int n4, boolean bl2) {
        super(n2, n3, n4, bl2);
    }

    @Override
    protected av a(String[] arrstring) {
        return new r(l.a(arrstring[0]), new bp(Integer.parseInt(arrstring[1]), arrstring[2]), this.d);
    }

    @Override
    protected av g() {
        return new r(l.a, c, this.d);
    }

    @Override
    protected boolean f() {
        return false;
    }
}

