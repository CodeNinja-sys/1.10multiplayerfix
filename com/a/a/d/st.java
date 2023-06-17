/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.qy;
import com.a.a.d.rz;
import com.a.a.d.sr;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class st
extends WeakReference
implements rz {
    final int a;
    final rz b;
    volatile sr c = qy.h();

    st(ReferenceQueue referenceQueue, Object object, int n2, rz rz2) {
        super(object, referenceQueue);
        this.a = n2;
        this.b = rz2;
    }

    @Override
    public Object d() {
        return this.get();
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
        return this.c;
    }

    @Override
    public void a(sr sr2) {
        sr sr3 = this.c;
        this.c = sr2;
        sr3.a(sr2);
    }

    @Override
    public int c() {
        return this.a;
    }

    @Override
    public rz b() {
        return this.b;
    }
}

