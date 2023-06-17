/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ao;
import com.a.a.c.as;
import com.a.a.c.bs;
import com.a.a.c.cg;

class cc
extends as {
    final Object g;
    final int h;
    final bs i;
    volatile cg j = ao.p();

    cc(Object object, int n2, bs bs2) {
        this.g = object;
        this.h = n2;
        this.i = bs2;
    }

    @Override
    public Object d() {
        return this.g;
    }

    @Override
    public cg a() {
        return this.j;
    }

    @Override
    public void a(cg cg2) {
        this.j = cg2;
    }

    @Override
    public int c() {
        return this.h;
    }

    @Override
    public bs b() {
        return this.i;
    }
}

