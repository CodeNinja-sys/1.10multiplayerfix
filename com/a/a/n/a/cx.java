/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.cg;
import com.a.a.n.a.cv;
import com.a.a.n.a.cw;

class cx
implements cg {
    final /* synthetic */ cw a;

    cx(cw cw2) {
        this.a = cw2;
    }

    @Override
    public void a(Object object) {
        this.a.b.a(object);
    }

    @Override
    public void a(Throwable throwable) {
        if (cv.a(this.a.b).isCancelled()) {
            this.a.b.cancel(false);
        } else {
            this.a.b.a(throwable);
        }
    }
}

