/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.b.eg;
import com.a.a.n.a.g;

final class ef
extends g
implements Runnable {
    private final Runnable a;

    public ef(Runnable runnable) {
        this.a = (Runnable)cl.a(runnable);
    }

    @Override
    public void run() {
        try {
            this.a.run();
        }
        catch (Throwable throwable) {
            this.a(throwable);
            throw eg.b(throwable);
        }
    }
}

