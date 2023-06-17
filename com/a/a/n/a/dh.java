/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.cg;
import com.a.a.n.a.dg;
import com.a.a.n.a.dl;

class dh
implements cg {
    final /* synthetic */ dl a;
    final /* synthetic */ dg b;

    dh(dg dg2, dl dl2) {
        this.b = dg2;
        this.a = dl2;
    }

    @Override
    public void a(Object object) {
        this.b.a(object);
    }

    @Override
    public void a(Throwable throwable) {
        if (this.a.isCancelled()) {
            this.b.cancel(false);
        } else {
            this.b.a(throwable);
        }
    }
}

