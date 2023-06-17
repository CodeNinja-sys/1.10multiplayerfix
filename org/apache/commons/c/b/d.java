/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.b;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.apache.commons.c.b.c;

class d
implements Callable {
    private final ExecutorService b;
    final /* synthetic */ c a;

    public d(c c2, ExecutorService executorService) {
        this.a = c2;
        this.b = executorService;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object call() {
        try {
            Object object = this.a.h();
            return object;
        }
        finally {
            if (this.b != null) {
                this.b.shutdown();
            }
        }
    }
}

