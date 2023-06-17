/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.eg;
import com.a.a.n.a.gn;
import java.util.concurrent.Callable;

class go
implements Runnable {
    final /* synthetic */ Callable a;
    final /* synthetic */ gn b;

    go(gn gn2, Callable callable) {
        this.b = gn2;
        this.a = callable;
    }

    @Override
    public void run() {
        try {
            this.a.call();
        }
        catch (Exception exception) {
            eg.b(exception);
        }
    }
}

