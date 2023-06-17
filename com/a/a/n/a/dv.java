/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.dl;
import java.util.concurrent.BlockingQueue;

final class dv
implements Runnable {
    final /* synthetic */ BlockingQueue a;
    final /* synthetic */ dl b;

    dv(BlockingQueue blockingQueue, dl dl2) {
        this.a = blockingQueue;
        this.b = dl2;
    }

    @Override
    public void run() {
        this.a.add(this.b);
    }
}

