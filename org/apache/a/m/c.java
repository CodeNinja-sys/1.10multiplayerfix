/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.m;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import org.apache.a.m.a;
import org.apache.a.m.i;
import org.apache.a.m.k;

class c
extends k {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ a c;

    c(a a2, Lock lock, org.apache.a.d.c c2, Object object, Object object2) {
        this.c = a2;
        this.a = object;
        this.b = object2;
        super(lock, c2);
    }

    public i a(long l2, TimeUnit timeUnit) {
        i i2 = org.apache.a.m.a.a(this.c, this.a, this.b, l2, timeUnit, this);
        this.c.a(i2);
        return i2;
    }

    public /* synthetic */ Object b(long l2, TimeUnit timeUnit) {
        return this.a(l2, timeUnit);
    }
}

