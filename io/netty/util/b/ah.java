/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.af;
import io.netty.util.b.ag;
import io.netty.util.b.ay;
import java.util.Iterator;

final class ah
implements Runnable {
    final /* synthetic */ af a;

    private ah(af af2) {
        this.a = af2;
    }

    @Override
    public void run() {
        Iterator iterator = this.a.c.iterator();
        while (iterator.hasNext()) {
            ay ay2 = (ay)iterator.next();
            if (!ay2.isCancelled()) continue;
            iterator.remove();
        }
    }

    /* synthetic */ ah(af af2, ag ag2) {
        this(af2);
    }
}

