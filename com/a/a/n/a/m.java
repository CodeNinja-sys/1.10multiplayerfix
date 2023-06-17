/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.eg;
import com.a.a.n.a.k;

class m
implements Runnable {
    final /* synthetic */ k a;

    m(k k2) {
        this.a = k2;
    }

    @Override
    public void run() {
        try {
            this.a.a.b();
            this.a.d();
        }
        catch (Throwable throwable) {
            this.a.a(throwable);
            throw eg.b(throwable);
        }
    }
}

