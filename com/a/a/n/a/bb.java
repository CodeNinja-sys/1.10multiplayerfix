/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.dx;
import com.a.a.n.a.ay;

final class bb
implements Runnable {
    final /* synthetic */ dx a;
    final /* synthetic */ Runnable b;

    bb(dx dx2, Runnable runnable) {
        this.a = dx2;
        this.b = runnable;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        String string = thread.getName();
        boolean bl2 = ay.a((String)this.a.a(), thread);
        try {
            this.b.run();
        }
        finally {
            if (bl2) {
                ay.a(string, thread);
            }
        }
    }
}

