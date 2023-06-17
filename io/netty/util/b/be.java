/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ay;
import io.netty.util.b.az;

class be
implements Runnable {
    final /* synthetic */ ay a;
    final /* synthetic */ az b;

    be(az az2, ay ay2) {
        this.b = az2;
        this.a = ay2;
    }

    @Override
    public void run() {
        this.b.b.add(this.a);
    }
}

