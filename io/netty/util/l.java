/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.j;
import io.netty.util.k;

class l
implements Runnable {
    final /* synthetic */ k a;

    l(k k2) {
        this.a = k2;
    }

    @Override
    public void run() {
        j j2 = this.a.d;
        if (j2 != null) {
            j2.b(this.a);
        }
    }
}

