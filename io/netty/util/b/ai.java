/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.af;

final class ai
implements Runnable {
    static final /* synthetic */ boolean a;
    final /* synthetic */ af b;

    ai(af af2) {
        this.b = af2;
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
        // 4 sources

        {
            block4: {
                if ((var1_1 = this.b.b()) == null) break block4;
                try {
                    var1_1.run();
                }
                catch (Throwable var2_2) {
                    af.g().d("Unexpected exception from the global event executor: ", var2_2);
                }
                if (var1_1 != this.b.d) ** GOTO lbl-1000
            }
            if (!this.b.b.isEmpty() || this.b.c.size() != 1) ** GOTO lbl-1000
            var2_3 = af.a(this.b).compareAndSet(true, false);
            if (!ai.a && !var2_3) {
                throw new AssertionError();
            }
            if (!this.b.b.isEmpty() || this.b.c.size() != 1) continue;
            return;
        } while (af.a(this.b).compareAndSet(false, true));
    }

    static {
        a = !af.class.desiredAssertionStatus();
    }
}

