/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.an;
import com.a.a.c.ao;
import com.a.a.c.bq;
import com.a.a.c.f;
import com.a.a.d.jt;
import java.io.ObjectInputStream;
import java.io.Serializable;

final class bk
extends bq
implements an,
Serializable {
    private static final long o = 1L;
    transient an a;

    bk(ao ao2) {
        super(ao2);
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        f f2 = this.h();
        this.a = f2.a(this.m);
    }

    @Override
    public Object f(Object object) {
        return this.a.f(object);
    }

    @Override
    public Object c(Object object) {
        return this.a.c(object);
    }

    @Override
    public jt c(Iterable iterable) {
        return this.a.c(iterable);
    }

    @Override
    public final Object a(Object object) {
        return this.a.a(object);
    }

    @Override
    public void d(Object object) {
        this.a.d(object);
    }

    private Object i() {
        return this.a;
    }
}

