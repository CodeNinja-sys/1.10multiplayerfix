/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.az;
import io.netty.util.b.w;

class bb
implements Runnable {
    final /* synthetic */ az a;

    bb(az az2) {
        this.a = az2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        boolean bl2 = false;
        this.a.w();
        try {
            this.a.e();
            bl2 = true;
        }
        catch (Throwable throwable) {
            az.z().d("Unexpected exception from an event executor: ", throwable);
        }
        finally {
            int n2;
            while ((n2 = az.A().get(this.a)) < 3 && !az.A().compareAndSet(this.a, n2, 3)) {
            }
            if (bl2 && az.a(this.a) == 0L) {
                az.z().e("Buggy " + w.class.getSimpleName() + " implementation; " + az.class.getSimpleName() + ".confirmShutdown() must be called " + "before run() implementation terminates.");
            }
            while (!this.a.x()) {
            }
        }
        try {
            this.a.i();
            return;
        }
        finally {
            az.A().set(this.a, 5);
            az.b(this.a).release();
            if (!az.c(this.a).isEmpty()) {
                az.z().d("An event executor terminated with non-empty task queue (" + az.c(this.a).size() + ')');
            }
            az.d(this.a).b((Object)null);
        }
    }
}

