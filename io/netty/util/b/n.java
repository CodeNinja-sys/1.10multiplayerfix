/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ab;
import io.netty.util.b.ad;
import io.netty.util.b.l;

class n
implements Runnable {
    final /* synthetic */ ad a;
    final /* synthetic */ l b;

    n(l l2, ad ad2) {
        this.b = l2;
        this.a = ad2;
    }

    @Override
    public void run() {
        l.a((ab)this.b, this.a);
        l.a(this.b, null);
    }
}

