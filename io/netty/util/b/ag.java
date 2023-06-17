/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.af;
import io.netty.util.b.ay;

class ag
implements Runnable {
    final /* synthetic */ ay a;
    final /* synthetic */ af b;

    ag(af af2, ay ay2) {
        this.b = af2;
        this.a = ay2;
    }

    @Override
    public void run() {
        this.b.c.add(this.a);
    }
}

