/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.qy;
import com.a.a.d.rz;
import com.a.a.d.st;
import java.lang.ref.ReferenceQueue;

final class sw
extends st
implements rz {
    volatile long d = Long.MAX_VALUE;
    rz e = qy.i();
    rz f = qy.i();
    rz g = qy.i();
    rz h = qy.i();

    sw(ReferenceQueue referenceQueue, Object object, int n2, rz rz2) {
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

    @Override
    public rz h() {
        return this.g;
    }

    @Override
    public void c(rz rz2) {
        this.g = rz2;
    }

    @Override
    public rz i() {
        return this.h;
    }

    @Override
    public void d(rz rz2) {
        this.h = rz2;
    }
}

