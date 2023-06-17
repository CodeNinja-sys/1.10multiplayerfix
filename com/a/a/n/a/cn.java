/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.cg;
import com.a.a.n.a.dl;
import com.a.a.n.a.gm;
import java.util.concurrent.ExecutionException;

final class cn
implements Runnable {
    final /* synthetic */ dl a;
    final /* synthetic */ cg b;

    cn(dl dl2, cg cg2) {
        this.a = dl2;
        this.b = cg2;
    }

    @Override
    public void run() {
        Object object;
        try {
            object = gm.a(this.a);
        }
        catch (ExecutionException executionException) {
            this.b.a(executionException.getCause());
            return;
        }
        catch (RuntimeException runtimeException) {
            this.b.a(runtimeException);
            return;
        }
        catch (Error error) {
            this.b.a(error);
            return;
        }
        this.b.a(object);
    }
}

