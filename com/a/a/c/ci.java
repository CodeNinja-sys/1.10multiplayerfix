/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ao;
import com.a.a.c.bs;
import com.a.a.c.ck;
import java.lang.ref.ReferenceQueue;

final class ci
extends ck {
    volatile long a = Long.MAX_VALUE;
    bs b = ao.q();
    bs c = ao.q();

    ci(ReferenceQueue referenceQueue, Object object, int n2, bs bs2) {
        super(referenceQueue, object, n2, bs2);
    }

    @Override
    public long e() {
        return this.a;
    }

    @Override
    public void a(long l2) {
        this.a = l2;
    }

    @Override
    public bs f() {
        return this.b;
    }

    @Override
    public void a(bs bs2) {
        this.b = bs2;
    }

    @Override
    public bs g() {
        return this.c;
    }

    @Override
    public void b(bs bs2) {
        this.c = bs2;
    }
}

