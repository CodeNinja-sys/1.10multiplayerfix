/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.ar;
import com.a.a.n.a.dl;
import com.a.a.n.a.g;

final class as
extends g {
    private as() {
    }

    boolean a(dl dl2) {
        boolean bl2 = this.a((Object)dl2);
        if (this.isCancelled()) {
            dl2.cancel(this.b());
        }
        return bl2;
    }

    /* synthetic */ as(ar ar2) {
        this();
    }
}

