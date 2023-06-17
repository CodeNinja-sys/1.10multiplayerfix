/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.qy;
import com.a.a.d.rz;
import com.a.a.d.sl;

final class so
extends sl
implements rz {
    volatile long e = Long.MAX_VALUE;
    rz f = qy.i();
    rz g = qy.i();
    rz h = qy.i();
    rz i = qy.i();

    so(Object object, int n2, rz rz2) {
        super(object, n2, rz2);
    }

    @Override
    public long e() {
        return this.e;
    }

    @Override
    public void a(long l2) {
        this.e = l2;
    }

    @Override
    public rz f() {
        return this.f;
    }

    @Override
    public void a(rz rz2) {
        this.f = rz2;
    }

    @Override
    public rz g() {
        return this.g;
    }

    @Override
    public void b(rz rz2) {
        this.g = rz2;
    }

    @Override
    public rz h() {
        return this.h;
    }

    @Override
    public void c(rz rz2) {
        this.h = rz2;
    }

    @Override
    public rz i() {
        return this.i;
    }

    @Override
    public void d(rz rz2) {
        this.i = rz2;
    }
}

