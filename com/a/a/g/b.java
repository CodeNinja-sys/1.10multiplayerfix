/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.g.ae;
import com.a.a.g.ai;
import com.a.a.g.aj;
import com.a.a.g.c;
import com.a.a.g.h;

abstract class b
extends h {
    final ai[] a;
    private static final long b = 0L;

    b(ai ... arrai) {
        for (ai ai2 : arrai) {
            cl.a(ai2);
        }
        this.a = arrai;
    }

    abstract ae a(aj[] var1);

    @Override
    public aj a() {
        aj[] arraj = new aj[this.a.length];
        for (int i2 = 0; i2 < arraj.length; ++i2) {
            arraj[i2] = this.a[i2].a();
        }
        return new c(this, arraj);
    }
}

