/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.bj;
import io.netty.b.bk;
import io.netty.b.h;
import io.netty.b.w;
import io.netty.b.x;
import io.netty.b.z;
import io.netty.util.p;
import io.netty.util.t;

final class y
extends bk {
    private static final p d = new z();
    private final t e;

    static y d() {
        y y2 = (y)d.a();
        y2.O(1);
        return y2;
    }

    private y(t t2) {
        super((h)bj.b, 256, Integer.MAX_VALUE);
        this.e = t2;
    }

    @Override
    protected void c() {
        if (this.j() > w.b()) {
            super.c();
        } else {
            this.w();
            d.a(this, this.e);
        }
    }

    /* synthetic */ y(t t2, x x2) {
        this(t2);
    }
}

