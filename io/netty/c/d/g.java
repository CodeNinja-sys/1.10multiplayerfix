/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.d;

import io.netty.c.d.f;
import io.netty.channel.bd;

class g
implements Runnable {
    final /* synthetic */ bd a;
    final /* synthetic */ f b;

    g(f f2, bd bd2) {
        this.b = f2;
        this.a = bd2;
    }

    @Override
    public void run() {
        block2: {
            try {
                f.a(this.b, this.a);
            }
            catch (Exception exception) {
                if (!f.b().f()) break block2;
                f.b().d("Unexpected exception while sending chunks.", exception);
            }
        }
    }
}

