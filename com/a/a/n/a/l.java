/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.eg;
import com.a.a.n.a.k;

class l
implements Runnable {
    final /* synthetic */ k a;

    l(k k2) {
        this.a = k2;
    }

    @Override
    public void run() {
        try {
            this.a.a.a();
            this.a.c();
        }
        catch (Throwable throwable) {
            this.a.a(throwable);
            throw eg.b(throwable);
        }
    }
}

