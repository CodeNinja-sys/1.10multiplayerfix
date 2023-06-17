/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ae;
import io.netty.util.b.as;
import io.netty.util.b.l;

class q
implements Runnable {
    final /* synthetic */ as a;
    final /* synthetic */ ae b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ l e;

    q(l l2, as as2, ae ae2, long l3, long l4) {
        this.e = l2;
        this.a = as2;
        this.b = ae2;
        this.c = l3;
        this.d = l4;
    }

    @Override
    public void run() {
        l.a(this.a, this.b, this.c, this.d);
    }
}

