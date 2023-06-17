/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.f;

import com.a.a.f.e;
import com.a.a.f.n;

class f
implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ n b;
    final /* synthetic */ e c;

    f(e e2, Object object, n n2) {
        this.c = e2;
        this.a = object;
        this.b = n2;
    }

    @Override
    public void run() {
        e.a(this.c, this.a, this.b);
    }
}

