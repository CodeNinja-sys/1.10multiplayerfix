/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ab;
import io.netty.util.b.j;
import io.netty.util.b.l;

class m
implements Runnable {
    final /* synthetic */ j a;
    final /* synthetic */ l b;

    m(l l2, j j2) {
        this.b = l2;
        this.a = j2;
    }

    @Override
    public void run() {
        l.a((ab)this.b, this.a);
        l.a(this.b, null);
    }
}

