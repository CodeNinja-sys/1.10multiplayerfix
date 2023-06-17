/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.qy;
import com.a.a.d.rz;
import com.a.a.d.sc;
import java.lang.ref.ReferenceQueue;

final class se
extends sc
implements rz {
    volatile long d = Long.MAX_VALUE;
    rz e = qy.i();
    rz f = qy.i();

    se(ReferenceQueue referenceQueue, Object object, int n2, rz rz2) {
        super(referenceQueue, object, n2, rz2);
    }

    @Override
    public long e() {
        return this.d;
    }

    @Override
    public void a(long l2) {
        this.d = l2;
    }

    @Override
    public rz f() {
        return this.e;
    }

    @Override
    public void a(rz rz2) {
        this.e = rz2;
    }

    @Override
    public rz g() {
        return this.f;
    }

    @Override
    public void b(rz rz2) {
        this.f = rz2;
    }
}

