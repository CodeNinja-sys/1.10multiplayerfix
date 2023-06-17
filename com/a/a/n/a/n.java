/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.du;
import com.a.a.n.a.i;
import java.util.concurrent.Executor;

class n
implements Executor {
    final /* synthetic */ i a;

    n(i i2) {
        this.a = i2;
    }

    @Override
    public void execute(Runnable runnable) {
        du.a((String)i.a(this.a).a(), runnable).start();
    }
}

