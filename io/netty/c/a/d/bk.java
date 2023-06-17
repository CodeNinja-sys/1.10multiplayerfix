/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.av;
import io.netty.c.a.d.aw;
import io.netty.c.a.d.bd;
import io.netty.c.a.d.br;
import io.netty.c.a.d.q;

public class bk
extends bd {
    public bk() {
    }

    public bk(int n2, int n3, int n4) {
        super(n2, n3, n4, true);
    }

    public bk(int n2, int n3, int n4, boolean bl2) {
        super(n2, n3, n4, true, bl2);
    }

    @Override
    protected av a(String[] arrstring) {
        return new q(br.a(arrstring[2]), aw.a(arrstring[0]), arrstring[1], this.d);
    }

    @Override
    protected av g() {
        return new q(br.a, aw.b, "/bad-request", this.d);
    }

    @Override
    protected boolean f() {
        return true;
    }
}

