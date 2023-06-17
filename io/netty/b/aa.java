/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.ab;
import io.netty.b.bj;
import io.netty.b.bm;
import io.netty.b.h;
import io.netty.b.w;
import io.netty.b.x;
import io.netty.util.p;
import io.netty.util.t;

final class aa
extends bm {
    private static final p d = new ab();
    private final t e;

    static aa d() {
        aa aa2 = (aa)d.a();
        aa2.O(1);
        return aa2;
    }

    private aa(t t2) {
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

    /* synthetic */ aa(t t2, x x2) {
        this(t2);
    }
}

