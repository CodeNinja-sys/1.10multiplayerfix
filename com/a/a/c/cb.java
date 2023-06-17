/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ao;
import com.a.a.c.bs;
import com.a.a.c.cc;

final class cb
extends cc {
    volatile long a = Long.MAX_VALUE;
    bs b = ao.q();
    bs c = ao.q();
    volatile long d = Long.MAX_VALUE;
    bs e = ao.q();
    bs f = ao.q();

    cb(Object object, int n2, bs bs2) {
        super(object, n2, bs2);
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

    @Override
    public long h() {
        return this.d;
    }

    @Override
    public void b(long l2) {
        this.d = l2;
    }

    @Override
    public bs i() {
        return this.e;
    }

    @Override
    public void c(bs bs2) {
        this.e = bs2;
    }

    @Override
    public bs j() {
        return this.f;
    }

    @Override
    public void d(bs bs2) {
        this.f = bs2;
    }
}

