/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.aj;
import com.a.a.c.an;
import com.a.a.c.e;
import com.a.a.d.jt;

public abstract class al
extends aj
implements an {
    protected al() {
    }

    protected abstract an h();

    @Override
    public Object f(Object object) {
        return this.h().f(object);
    }

    @Override
    public Object c(Object object) {
        return this.h().c(object);
    }

    @Override
    public jt c(Iterable iterable) {
        return this.h().c(iterable);
    }

    @Override
    public Object a(Object object) {
        return this.h().a(object);
    }

    @Override
    public void d(Object object) {
        this.h().d(object);
    }

    @Override
    protected /* synthetic */ e f() {
        return this.h();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.h();
    }
}

