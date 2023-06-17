/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.av;
import io.netty.c.a.d.bd;
import io.netty.c.a.d.bp;
import io.netty.c.a.d.br;
import io.netty.c.a.d.r;

public class bn
extends bd {
    private static final bp c = new bp(999, "Unknown");

    public bn() {
    }

    public bn(int n2, int n3, int n4) {
        super(n2, n3, n4, true);
    }

    public bn(int n2, int n3, int n4, boolean bl2) {
        super(n2, n3, n4, true, bl2);
    }

    @Override
    protected av a(String[] arrstring) {
        return new r(br.a(arrstring[0]), new bp(Integer.parseInt(arrstring[1]), arrstring[2]), this.d);
    }

    @Override
    protected av g() {
        return new r(br.a, c, this.d);
    }

    @Override
    protected boolean f() {
        return false;
    }
}

