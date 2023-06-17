/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.c.ad;
import io.netty.util.x;
import io.netty.util.z;

final class y
implements Runnable {
    private final z a;
    private final int b;

    y(z z2, int n2) {
        this.a = z2;
        this.b = n2;
    }

    @Override
    public void run() {
        try {
            if (!this.a.I(this.b)) {
                x.a().d("Non-zero refCnt: {}", (Object)this);
            } else {
                x.a().b("Released: {}", (Object)this);
            }
        }
        catch (Exception exception) {
            x.a().d("Failed to release an object: {}", (Object)this.a, (Object)exception);
        }
    }

    public String toString() {
        return ad.a(this.a) + ".release(" + this.b + ") refCnt: " + this.a.ac();
    }
}

