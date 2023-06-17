/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.qy;
import com.a.a.d.rz;
import com.a.a.d.sr;

class sl
implements rz {
    final Object a;
    final int b;
    final rz c;
    volatile sr d = qy.h();

    sl(Object object, int n2, rz rz2) {
        this.a = object;
        this.b = n2;
        this.c = rz2;
    }

    @Override
    public Object d() {
        return this.a;
    }

    @Override
    public long e() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public rz f() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(rz rz2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public rz g() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(rz rz2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public rz h() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void c(rz rz2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public rz i() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void d(rz rz2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public sr a() {
        return this.d;
    }

    @Override
    public void a(sr sr2) {
        sr sr3 = this.d;
        this.d = sr2;
        sr3.a(sr2);
    }

    @Override
    public int c() {
        return this.b;
    }

    @Override
    public rz b() {
        return this.c;
    }
}

