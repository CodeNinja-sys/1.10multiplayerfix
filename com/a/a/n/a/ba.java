/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.dx;
import com.a.a.n.a.ay;
import java.util.concurrent.Callable;

final class ba
implements Callable {
    final /* synthetic */ dx a;
    final /* synthetic */ Callable b;

    ba(dx dx2, Callable callable) {
        this.a = dx2;
        this.b = callable;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object call() {
        Thread thread = Thread.currentThread();
        String string = thread.getName();
        boolean bl2 = ay.a((String)this.a.a(), thread);
        try {
            Object v2 = this.b.call();
            return v2;
        }
        finally {
            if (bl2) {
                ay.a(string, thread);
            }
        }
    }
}

