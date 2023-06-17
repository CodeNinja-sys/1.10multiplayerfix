/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.az;

class bd
implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ az b;

    bd(az az2, Runnable runnable) {
        this.b = az2;
        this.a = runnable;
    }

    @Override
    public void run() {
        az.e(this.b).remove(this.a);
    }
}

