/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ao;
import com.a.a.c.bs;
import com.a.a.c.cg;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class ck
extends WeakReference
implements bs {
    final int g;
    final bs h;
    volatile cg i = ao.p();

    ck(ReferenceQueue referenceQueue, Object object, int n2, bs bs2) {
        super(object, referenceQueue);
        this.g = n2;
        this.h = bs2;
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
    public bs f() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(bs bs2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public bs g() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(bs bs2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long h() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public bs i() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void c(bs bs2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public bs j() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void d(bs bs2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public cg a() {
        return this.i;
    }

    @Override
    public void a(cg cg2) {
        this.i = cg2;
    }

    @Override
    public int c() {
        return this.g;
    }

    @Override
    public bs b() {
        return this.h;
    }
}

