/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ad;
import io.netty.util.b.l;
import io.netty.util.b.t;

final class s
implements Runnable {
    private ad b;
    final /* synthetic */ l a;

    s(l l2, ad ad2) {
        this.a = l2;
        this.b = ad2;
    }

    @Override
    public void run() {
        t t2 = l.b(this.a);
        if (this.b != null) {
            if (t2 == null) {
                t2 = new t(this.a);
                l.a(this.a, t2);
            }
            t2.add(this.b);
            this.b = null;
        }
        t2.run();
    }
}

