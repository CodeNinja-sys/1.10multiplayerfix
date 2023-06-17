/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c;

import io.netty.c.c.q;
import java.util.List;
import java.util.concurrent.CountDownLatch;

class s
implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ CountDownLatch b;
    final /* synthetic */ q c;

    s(q q2, List list, CountDownLatch countDownLatch) {
        this.c = q2;
        this.a = list;
        this.b = countDownLatch;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        try {
            for (Runnable runnable : this.a) {
                runnable.run();
            }
        }
        catch (Exception exception) {
            q.b(this.c).a(exception);
        }
        finally {
            this.b.countDown();
        }
    }
}

