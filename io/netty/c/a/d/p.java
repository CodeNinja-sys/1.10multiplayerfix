/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.ax;
import io.netty.c.a.h;

public class p
implements ax {
    private h a = h.d;

    protected p() {
    }

    @Override
    public h i() {
        return this.a;
    }

    @Override
    public void a(h h2) {
        if (h2 == null) {
            throw new NullPointerException("decoderResult");
        }
        this.a = h2;
    }
}

