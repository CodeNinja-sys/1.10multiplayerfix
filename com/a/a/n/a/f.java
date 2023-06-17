/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.b;
import com.a.a.n.a.du;
import java.util.concurrent.Executor;

class f
implements Executor {
    final /* synthetic */ b a;

    f(b b2) {
        this.a = b2;
    }

    @Override
    public void execute(Runnable runnable) {
        du.a(this.a.m(), runnable).start();
    }
}

