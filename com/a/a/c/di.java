/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.dg;
import com.a.a.c.dj;
import com.a.a.c.dk;
import java.util.concurrent.Executor;

final class di
implements dg {
    final /* synthetic */ Executor a;
    final /* synthetic */ dg b;

    di(Executor executor, dg dg2) {
        this.a = executor;
        this.b = dg2;
    }

    @Override
    public void a(dk dk2) {
        this.a.execute(new dj(this, dk2));
    }
}

