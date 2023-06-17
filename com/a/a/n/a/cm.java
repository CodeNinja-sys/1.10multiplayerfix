/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.aq;
import com.a.a.n.a.dl;
import java.util.concurrent.ConcurrentLinkedQueue;

final class cm
implements Runnable {
    final /* synthetic */ ConcurrentLinkedQueue a;
    final /* synthetic */ dl b;

    cm(ConcurrentLinkedQueue concurrentLinkedQueue, dl dl2) {
        this.a = concurrentLinkedQueue;
        this.b = dl2;
    }

    @Override
    public void run() {
        ((aq)this.a.remove()).a(this.b);
    }
}

