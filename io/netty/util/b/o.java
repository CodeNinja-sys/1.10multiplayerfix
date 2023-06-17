/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ab;
import io.netty.util.b.ad;
import io.netty.util.b.l;

final class o
implements Runnable {
    final /* synthetic */ ab a;
    final /* synthetic */ ad b;

    o(ab ab2, ad ad2) {
        this.a = ab2;
        this.b = ad2;
    }

    @Override
    public void run() {
        l.a(this.a, this.b);
    }
}

