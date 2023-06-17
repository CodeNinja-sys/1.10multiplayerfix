/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c;

import io.netty.c.c.q;

class t
implements Runnable {
    final /* synthetic */ q a;

    t(q q2) {
        this.a = q2;
    }

    @Override
    public void run() {
        if (q.c(this.a).isDone()) {
            return;
        }
        q.a(this.a, q.l());
    }
}

