/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.d;

import io.netty.channel.bv;
import io.netty.channel.bw;
import io.netty.util.x;

final class k {
    final Object a;
    final bw b;
    private long c;

    k(Object object, bw bw2) {
        this.a = object;
        this.b = bw2;
    }

    void a(Throwable throwable) {
        x.b(this.a);
        this.b.b(throwable);
    }

    void a() {
        if (this.b.isDone()) {
            return;
        }
        if (this.b instanceof bv) {
            ((bv)this.b).c(this.c, this.c);
        }
        this.b.c();
    }

    void a(int n2) {
        this.c += (long)n2;
        if (this.b instanceof bv) {
            ((bv)this.b).c(this.c, -1L);
        }
    }
}

