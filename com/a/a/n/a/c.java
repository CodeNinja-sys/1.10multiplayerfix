/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.dx;
import com.a.a.n.a.ad;
import com.a.a.n.a.b;
import com.a.a.n.a.d;
import com.a.a.n.a.du;
import com.a.a.n.a.e;
import java.util.concurrent.Executor;

class c
extends ad {
    final /* synthetic */ b a;

    c(b b2) {
        this.a = b2;
    }

    @Override
    protected final void a() {
        Executor executor = du.a(this.a.e(), (dx)new d(this));
        executor.execute(new e(this));
    }

    @Override
    protected void b() {
        this.a.d();
    }
}

