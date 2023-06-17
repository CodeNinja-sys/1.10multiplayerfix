/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.b.z;
import io.netty.util.p;
import io.netty.util.u;

class q
extends z {
    final /* synthetic */ p a;

    q(p p2) {
        this.a = p2;
    }

    protected u a() {
        return new u(this.a, Thread.currentThread(), p.a(this.a));
    }

    @Override
    protected /* synthetic */ Object b() {
        return this.a();
    }
}

