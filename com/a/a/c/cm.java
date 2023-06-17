/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ao;
import com.a.a.c.bs;
import com.a.a.c.ck;
import java.lang.ref.ReferenceQueue;

final class cm
extends ck {
    volatile long a = Long.MAX_VALUE;
    bs b = ao.q();
    bs c = ao.q();

    cm(ReferenceQueue referenceQueue, Object object, int n2, bs bs2) {
        super(referenceQueue, object, n2, bs2);
    }

    @Override
    public long h() {
        return this.a;
    }

    @Override
    public void b(long l2) {
        this.a = l2;
    }

    @Override
    public bs i() {
        return this.b;
    }

    @Override
    public void c(bs bs2) {
        this.b = bs2;
    }

    @Override
    public bs j() {
        return this.c;
    }

    @Override
    public void d(bs bs2) {
        this.c = bs2;
    }
}

