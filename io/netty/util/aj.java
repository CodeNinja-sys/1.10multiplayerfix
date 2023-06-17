/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.ag;
import io.netty.util.ah;
import io.netty.util.ai;
import java.util.ArrayList;
import java.util.List;

final class aj
implements Runnable {
    private final List b = new ArrayList();
    static final /* synthetic */ boolean a;

    private aj() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        do lbl-1000:
        // 3 sources

        {
            this.a();
            this.b();
            this.a();
            this.b();
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException var1_1) {
                // empty catch block
            }
            if (!this.b.isEmpty() || !ag.a().isEmpty()) ** GOTO lbl-1000
            var1_2 = ag.b().compareAndSet(true, false);
            if (!aj.a && !var1_2) {
                throw new AssertionError();
            }
            if (!ag.a().isEmpty()) continue;
            return;
        } while (ag.b().compareAndSet(false, true));
    }

    private void a() {
        ai ai2;
        while ((ai2 = (ai)ag.a().poll()) != null) {
            if (ai2.c) {
                this.b.add(ai2);
                continue;
            }
            this.b.remove(ai2);
        }
    }

    private void b() {
        List list = this.b;
        int n2 = 0;
        while (n2 < list.size()) {
            ai ai2 = (ai)list.get(n2);
            if (!ai2.a.isAlive()) {
                list.remove(n2);
                try {
                    ai2.b.run();
                }
                catch (Throwable throwable) {
                    ag.c().d("Thread death watcher task raised an exception:", throwable);
                }
                continue;
            }
            ++n2;
        }
    }

    /* synthetic */ aj(ah ah2) {
        this();
    }

    static {
        a = !ag.class.desiredAssertionStatus();
    }
}

