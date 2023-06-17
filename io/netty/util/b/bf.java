/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ay;
import io.netty.util.b.az;
import io.netty.util.b.ba;
import java.util.Iterator;

final class bf
implements Runnable {
    final /* synthetic */ az a;

    private bf(az az2) {
        this.a = az2;
    }

    @Override
    public void run() {
        Iterator iterator = this.a.b.iterator();
        while (iterator.hasNext()) {
            ay ay2 = (ay)iterator.next();
            if (!ay2.isCancelled()) continue;
            iterator.remove();
        }
    }

    /* synthetic */ bf(az az2, ba ba2) {
        this(az2);
    }
}

