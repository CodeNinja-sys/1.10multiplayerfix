/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.cq;
import com.a.a.n.a.dl;
import com.a.a.n.a.gm;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

class cr
implements Runnable {
    final /* synthetic */ dl a;
    final /* synthetic */ cq b;

    cr(cq cq2, dl dl2) {
        this.b = cq2;
        this.a = dl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        try {
            this.b.a(gm.a(this.a));
        }
        catch (CancellationException cancellationException) {
            this.b.cancel(false);
            return;
        }
        catch (ExecutionException executionException) {
            this.b.a(executionException.getCause());
        }
        finally {
            cq.a(this.b, null);
        }
    }
}

