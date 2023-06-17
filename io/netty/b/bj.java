/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.b;
import io.netty.b.bk;
import io.netty.b.bl;
import io.netty.b.bm;
import io.netty.b.e;
import io.netty.b.g;
import io.netty.b.h;
import io.netty.util.c.u;

public final class bj
extends b {
    public static final bj b = new bj(u.g());

    public bj(boolean bl2) {
        super(bl2);
    }

    @Override
    protected g e(int n2, int n3) {
        return new bl((h)this, n2, n3);
    }

    @Override
    protected g f(int n2, int n3) {
        e e2 = u.f() ? new bm((h)this, n2, n3) : new bk((h)this, n2, n3);
        return bj.a(e2);
    }

    @Override
    public boolean h() {
        return false;
    }
}

